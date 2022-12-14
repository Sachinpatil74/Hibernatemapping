package manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {
		Session session=new Configuration().configure("manytomany/hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Emp e=new Emp();
		e.setEid(34);
		e.setEname("ram");
		
		Emp e1=new Emp();
		e1.setEid(35);
		e1.setEname("shyam");
		
		Project p=new Project();
		Project p1=new Project();
		p.setPid(12121);
		p.setProjectname("library mang");
		p1.setPid(14212);
		p1.setProjectname("chatboot");
		
		List<Emp> list=new ArrayList<Emp>();
		List<Project> list1=new ArrayList<Project>();

		list.add(e);
		list.add(e1);
		list1.add(p);
		list1.add(p1);
		
		e.setProject(list1);
		p.setEmsp(list);
		
		
		session.save(e);
		session.save(e1);

		session.save(p);
		session.save(p1);

		
		tx.commit();
		session.close();
		
	}

}
