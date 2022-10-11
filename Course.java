import java.util.*;

import org.joda.time.DateTime;
public class Course {
	public
		String name;
		DateTime startDate;
		DateTime endDate;
		ArrayList <String> mdName = new ArrayList<String>();
		ArrayList <String> mdId = new ArrayList<String>();
		ArrayList <Student> st = new ArrayList <Student>();
		ArrayList <Module> md = new ArrayList <Module>();
		
		public void setName(String nameS)
		{
			name = nameS;
		}
		public void setModuleId(String moduleID)
		{
			mdId.add(moduleID);
		}
		public void setModuleName(String moduleName) {
			mdName.add(moduleName);
		}
		public void addStudent(Student stA) {
			st.add(stA);
		}
		public void getStudents()
		{
			for(Student std:st) {
				System.out.println(std.getUsername());
			}
		}
		public Boolean checkIfExist(String cId)
		{
			Boolean result = true;
			for(String arr : mdId)
			{
				if(arr.equals(cId) && arr.equals(result))
				{
					result=false;
				}
			}
			
			return result;
		}
		
		public String getName()
		{
			return name;
		}

}
