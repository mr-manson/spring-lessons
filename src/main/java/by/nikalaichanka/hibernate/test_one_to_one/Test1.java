package by.nikalaichanka.hibernate.test_one_to_one;


import by.nikalaichanka.hibernate.test_one_to_one.entity.Detail;
import by.nikalaichanka.hibernate.test_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
// 1
//            Employee employee = new Employee("Sidor", "Sidorov", "IT", 1000);
//            Detail detail = new Detail("Grodno", "375291111111", "1111111@gmail.com");
//            employee.setEmpDetail(detail);

// 2
//            Employee employee = new Employee("Oleg", "Manson", "IT", 5000);
//            Detail detail = new Detail("Grodno", "375297811555", "nikola@gmail.com");
//            employee.setEmpDetail(detail);

            session.beginTransaction();
// 1
//            session.save(employee);

// 2
//            Employee emp = session.get(Employee.class, 10);
//            System.out.println(emp.getEmpDetail());

// 3
            Employee emp = session.get(Employee.class, 1);
            session.delete(emp);

            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }
    }
}
