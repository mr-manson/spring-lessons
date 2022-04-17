package by.nikalaichanka.hibernate.test;

import by.nikalaichanka.hibernate.test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3_select {
    public static void main (String[] args){
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            List<Employee> emps = session.createQuery("from Employee where salary > 700").getResultList();

            for(Employee e : emps){
                System.out.println(e);
            }

            session.getTransaction().commit();

        }
        finally {
            factory.close();
        }
    }
}
