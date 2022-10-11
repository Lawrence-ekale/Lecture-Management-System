import java.util.ArrayList;
import java.util.Scanner;


public class Student {
	public
		Scanner sc = new Scanner(System.in);
		int id;
		String name;
		int age;
		String DOB;
		ArrayList <Module> md = new ArrayList <Module>();
		String course;
	
		
		//Accessors
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getDOB() {
		return DOB;
	}
	public String getUsername()
	{
		return "\n"+name + " " + age;
	}
	public String getCourse() {
		return course;
	}
	public void getModulesIDRegistered() {
		for(Module mdOutput: md)
		{
			mdOutput.getModule();
		}
	}
	
	//Mutators
	public void setId() {
		System.out.println("Enter the Student ID:\n");
		id = sc.nextInt();
		sc.nextLine();
	}
	public void setName() {
		System.out.println("Enter the Student name:\n");
		name = sc.nextLine();
	}
	public void setAge() {
		System.out.println("Enter the Student age:\n");
		age = sc.nextInt();
		sc.nextLine();
	}
	public void setDOB() {
		System.out.println("Enter the Student DOB:\n");
		DOB = sc.nextLine();
	}
	public void setCourses() {
		System.out.println("Enter the Course name:");
		course = sc.nextLine();
		
	}
	public String[] setModulesRegistered() {
		Module setting = new Module();
		System.out.println("Enter the Module name:\n");
		setting.name = sc.nextLine();
		System.out.println("\nEnter the Module id:\n");
		setting.id = sc.nextLine();
		md.add(setting);
		String res[]= {"",""};
		res[0] = setting.id;
		res[1] = setting.name;
		return res ;
	}
		

}
