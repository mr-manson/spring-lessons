package by.nikalaichanka.hibernate.test;

import by.nikalaichanka.hibernate.test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1_insert {
    public static void main (String[] args){
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Petr", "Ivanov", "IT", 1100);
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }
}
