package car.honda;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runner {

	public static void main(String[] args) {
     Struc st=new Struc(2,"heena","female","noida");
     Configuration con=new Configuration().configure();
    SessionFactory sf=con.buildSessionFactory();
    Session session=sf.openSession();
    Transaction tx=session.beginTransaction();
    session.persist(st);
    tx.commit();
	}

}
