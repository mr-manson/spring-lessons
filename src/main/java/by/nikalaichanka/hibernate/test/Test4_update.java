package by.nikalaichanka.hibernate.test;

import by.nikalaichanka.hibernate.test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4_update {
    public static void main (String[] args){
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee employee = session.get(Employee.class, 1);
//            employee.setSalary(2000);

            session.createQuery("update Employee set salary = 9000 where name = 'Elena'").executeUpdate();

            session.getTransaction().commit();

        }
        finally {
            factory.close();
        }
    }
}
