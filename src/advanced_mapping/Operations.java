package advanced_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Operations {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Teacher.class)
				.addAnnotatedClass(TeacherDetails.class)
				.buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		try {
			Teacher teacher= new Teacher("Sarathchandran","PM","pmsarathchandran@gmail.com");
			TeacherDetails details= new TeacherDetails("Physics", "Malappuram","O+");
			
			teacher.setTeacherDetails(details);
			session.beginTransaction();
			session.save(teacher);
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
	}
}
