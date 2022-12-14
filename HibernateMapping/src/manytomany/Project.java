package manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
@Id
 private int pid;
 private String projectname;
 @ManyToMany(mappedBy="project")
 private List<Emp> emsp;
public Project() {
	super();
	// TODO Auto-generated constructor stub
}
public Project(int pid, String projectname, List<Emp> emsp) {
	super();
	this.pid = pid;
	this.projectname = projectname;
	this.emsp = emsp;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getProjectname() {
	return projectname;
}
public void setProjectname(String projectname) {
	this.projectname = projectname;
}
public List<Emp> getEmsp() {
	return emsp;
}
public void setEmsp(List<Emp> emsp) {
	this.emsp = emsp;
}
 
}
