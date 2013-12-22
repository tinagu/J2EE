package my.j2ee.jsf.greeting;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

@ManagedBean(name="user")
@RequestScoped
public class User {
	private String name;
	
	public User() {}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
