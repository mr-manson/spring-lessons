package by.nikalaichanka.hibernate.test;

import by.nikalaichanka.hibernate.test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2_insert {
    public static void main (String[] args){
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee emp1 = new Employee("Elena", "Kozyavko", "Sales", 600);
            session.beginTransaction();
            session.save(emp1);
            session.getTransaction().commit();

            int id = emp1.getId();
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee emp2 = session.get(Employee.class, id);
            session.getTransaction().commit();
            System.out.println(emp2);
        }
        finally {
            factory.close();
        }
    }
}
