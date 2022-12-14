package OneToOneUsingXml;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		Session session=new Configuration().configure("OneToOneUsingXml/hibernate.cfg.xml").buildSessionFactory().openSession();
		Query query=session.createQuery("from Employee e");    
	    List<Employee> list=query.getResultList();    
	        
	    Iterator<Employee> itr=list.iterator();    
	    while(itr.hasNext()){    
	     Employee emp=itr.next();    
	     System.out.println(emp.getEmployeeId()+" "+emp.getName()+" "+emp.getEmail());    
	     Address address=emp.getAddress();    
	     System.out.println(address.getAddressLine1()+" "+address.getCity()+" "+    
	        address.getState()+" "+address.getCountry()+" "+address.getPincode());    
	    }    
	    
	    session.close();    
	    System.out.println("success");    
	}       
	      

	}


