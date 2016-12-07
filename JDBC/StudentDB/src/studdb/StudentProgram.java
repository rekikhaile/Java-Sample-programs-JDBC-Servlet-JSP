package studdb;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentProgram {

	public static void main(String[] args) {
		boolean connOpen = false;
		List <Student> students = new ArrayList <Student>();
		DBUtils dbutils = new DBUtils();
		
		try {
			connOpen = dbutils.connect();
			if(connOpen){
				students = dbutils.fetchStudents();
				for(int i=0; i < students.size();i++)
				{
					System.out.println(students.get(i).toString());
				}
			}
			else {
				System.out.println("Cannot find students");
			}
			
			} catch(SQLException e) {
				System.out.println("\n**** Error ****\n" + e.getMessage());
			}

	}

}
