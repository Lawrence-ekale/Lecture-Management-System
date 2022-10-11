import java.util.ArrayList;
import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		ArrayList <Module> modules = new ArrayList<Module>();
		Student st;
		Module md;
		Course cs;
		Boolean flag =true;
		Boolean flag1 = true;
		Scanner sc = new Scanner(System.in);
		while(flag)
		{
			st = new Student();
			cs = new Course();

			flag1 = true;
			flag=true;
			st.setAge();
			st.setDOB();
			st.setId();
			st.setName();
			st.setCourses();
			while(flag1)
			{
				md = new Module();
				String[] moduleId_Name = st.setModulesRegistered();
				md.setId(moduleId_Name[0]);
				md.setName(moduleId_Name[1]);
				Boolean heppa = false;
				if(modules.size()!=0)//we are reading the same number of modules
				{
					System.out.println("Tell me the number of modules in total "+modules.size());
					for(int i=0;i<modules.size();i++)
					{
						if(modules.get(i).getId().equals(md.getId()))
						{
							modules.get(i).getListOfCourses();
							modules.get(i).addCourse(st.getCourse());
						
						}
						else if(i==modules.size()-1){
							heppa = true;
						}
					}
				}else {
					md.addCourse(st.getCourse());
					modules.add(md);
				}
				if(heppa)
				{
					md.addCourse(st.getCourse());
					modules.add(md);
				}
				
				
				cs.setModuleId(moduleId_Name[0]);
				cs.setModuleName(moduleId_Name[1]);
				System.out.println("Do you want to register more modules(Y/N):\n");
				String choice = sc.nextLine();
				if(choice.toLowerCase().equals("n"))
				{
					flag1 = false;
				}

			}
			cs.setName(st.course);
			cs.addStudent(st);
			students.add(st);
			System.out.println("Do you want to register another Student(Y/N):\n");
			String choice1 = sc.nextLine();
			if(choice1.toLowerCase().equals("n"))
			{
				flag = false;
				
				
			}
		}
		System.out.println("\n\n\n\n\n\n");
		for(Student std:students) {
			System.out.println(std.getUsername());
			System.out.println("Modules assigned:");
			std.getModulesIDRegistered();
			System.out.println("Course: "+std.getCourse());
		}
		for(int i=0;i<modules.size();i++)
		{
			modules.get(i).getModule();
			modules.get(i).getListOfCourses();
		}
		System.out.println(modules.size());

	}

}
