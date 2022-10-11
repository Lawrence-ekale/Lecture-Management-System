import java.util.*;
public class Module {
	public
		String name;
		String id;
		ArrayList <Student> aSt = new ArrayList<Student>();
		ArrayList <String> aCs = new ArrayList<String>();
		ArrayList <Lecturer> aLc = new ArrayList<Lecturer>();
		ArrayList <Course> courses = new ArrayList<Course>();
	public void setId(String ids)
	{
		id = ids;
	}
	public void setName(String nameS)
	{
		name = nameS;
	}
	public void addStudent(Student st)
	{
		aSt.add(st);
	}
	public void addLecturer(Lecturer lt)
	{
		aLc.add(lt);
	}
	public Boolean addCourse(String csName)
	{
		Boolean finalD = true;
		if(courses.size()>0) {
			System.out.println("It got into the size over 0");
			for(int i=0;i<courses.size();i++)
			{
				System.out.println("It got into the loop and count how long");
				if(courses.get(i).getName().equals(csName))
				{
					System.out.println("A name has been found equal so no change");
					finalD=false;
				}
			}
			if(finalD)
			{
				System.out.println("It has to create an instance of Course");
				Course cs = new Course();
				cs.setName(csName);
				System.out.println("The course name has become "+cs.getName());
				courses.add(cs);
			}
		}else {
			System.out.println("When the first is added and size is "+courses.size());
			Course cs = new Course();
			cs.setName(csName);
			courses.add(cs);
		}
		
		return finalD;
	}
	public void getModule()
	{
		System.out.println("Module Id: "+id+" Module Name: "+name);
	}
	public String getName()
	{
		return name;
	}
	public String getId()
	{
		return id;
	}
	public Boolean searchIfNotCourseExist(String courseName)
	{
		Boolean result =false;
		for(Course crs : courses)
		{
			if(!crs.getName().equals(courseName))
			{
				result=true;
			}
		}
		return result;
	}
	public void getListOfStudents()
	{
		for(Student stud: aSt)
		{
			System.out.println("Student username: "+stud.getUsername());
		}
	}
	public void getListOfCourses()
	{
		for(Course cour: courses)
		{
			System.out.println("Courses name: "+cour.getName());
		}
	}
}
