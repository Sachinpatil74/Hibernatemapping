package OneToOneUsingXml;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		Session session=new Configuration().configure("OneToOneUsingXml/hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction t=session.beginTransaction();   
	      
	    Employee e1=new Employee();    
	    e1.setName("Ravi Malik");    
	    e1.setEmail("ravi@gmail.com");    
	        
	    Address address1=new Address();    
	    address1.setAddressLine1("G-21,Lohia nagar");    
	    address1.setCity("Ghaziabad");    
	    address1.setState("UP");    
	    address1.setCountry("India");    
	    address1.setPincode(201301);    
	        
	    e1.setAddress(address1);    
	    address1.setEmployee(e1);    
	        
	    session.persist(e1);    
	    t.commit();    
	        
	    session.close();    
	    System.out.println("Success");   

	}

}
