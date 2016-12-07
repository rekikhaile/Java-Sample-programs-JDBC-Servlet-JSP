package studdb;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentStatement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean connOpen = false;
		//I use a list in case there are multiple names with same first name
		List <Student> students = new ArrayList <Student>();
		
		DBUtils dbutils = new DBUtils();
		
		System.out.println("Type a name: ");
		String name = input.nextLine();
		
		
		try {
			connOpen = dbutils.connect();
			if(connOpen){
				students = dbutils.fetchStudentsByFirstName(name);
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
			catch(NullPointerException e){
				System.out.println("\n *** No student found by the first name "+name+" ***\n" );
			}
	
		
	}

}
