package org.test;
import org.sample.Company;
import org.sample.Employee;

public class Client {
	public void cliid() {
		System.out.println("cli id is 2");
	}
	public void cliname() {
		System.out.println("cli name is jeni");
		
	}
	public static void main(String[] args) {
		Client ci=new Client();
		ci.cliid();
		ci.cliname();
		Company c=new Company();
		c.comid();
		c.comname();
		Employee e=new Employee();
		e.empid();
		e.empname();
	}

}
