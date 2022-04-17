package by.nikalaichanka.hibernate.test_one_to_many_bi;


import by.nikalaichanka.hibernate.test_one_to_many_bi.entity.Department;
import by.nikalaichanka.hibernate.test_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();


        Session session = null;
        try {
            session = factory.getCurrentSession();
// 1
//            Department dep = new Department("IT", 500, 1500);
//            Employee emp1 = new Employee("Ivan", "Ivanov", 800);
//            Employee emp2 = new Employee("Makey", "Petrov", 900);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);

            session.beginTransaction();
// 1
//            session.save(dep);
// 2
//            Department department = session.get(Department.class, 1);
//            System.out.println(department);
//            System.out.println(department.getEmps());
// 3
            Employee employee = session.get(Employee.class, 1);
            System.out.println(employee);
            System.out.println(employee.getDepartment());

            session.getTransaction().commit();
            System.out.println("OK");

        } finally {
            session.close();
            factory.close();
        }
    }
}
