package HibernateBaisc.HibernateBasic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test_Class
{

	public static void main(String[] args) 
	{
		Configuration cfg= new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		
		SessionFactory sf= cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		Student student =new Student();
		student.address="pune";
		student.name="Ashwini";
		student.rollno=1;
		
		session.save(student);
		tx.commit();
		
		System.out.println("Data inserted");
		
		
	}
}
