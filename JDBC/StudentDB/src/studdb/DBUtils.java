package studdb;

import java.sql.*;
import java.util.*;

public class DBUtils {
	
	// database connection
    private Connection dbconn;

	/**
	 * Connect to database
	 * @return	boolean - Is connection succeeded	
	 * @throws SQLException
	 */
    public boolean connect() throws SQLException 
    {
		String url = "jdbc:mysql://localhost:3306/a1403844";

		boolean ret = false;
		try {
            // connect to database
			dbconn = DriverManager.getConnection(url,"a1403844", "meCIyF37w");

            System.out.println("Connected");
            ret = true;  // connection created
        }
        catch (SQLException sqlE) {
            System.out.println(sqlE.getMessage() +  "\nopen " +  url +
                "\nCannot connect to database.");
            ret = false;
        }
        return ret;
    }
    
    /**
     * Fetch all students from the database
     * @return 	ArrayList of Students
     */
    public ArrayList fetchStudents(){
    	String id, firstName, lastName, streetAddress, postCode, postOffice;
    	
    	Student Student;
    	ArrayList<Student> Students = new ArrayList <Student>();
    	Statement query = null;
        ResultSet resultset = null; // SQL-query resultset
        String sqlQuery = "SELECT * FROM Student";
        try{
        	query = dbconn.createStatement();
        	resultset = query.executeQuery(sqlQuery);
        	
        	while(resultset.next()){
        		id = resultset.getString("id");
        		firstName = resultset.getString("firstName");
        		lastName = resultset.getString("lastName");
        		streetAddress =resultset.getString("streetAddress");
        		postCode= resultset.getString("postCode");
        		postOffice= resultset.getString("postOffice");
        		
        		Students.add(new Student(id, firstName, lastName, streetAddress, postCode, postOffice));
        	}
        	
        	if(Students.isEmpty())
        		Students = null;	
        }
        catch (SQLException exception){
        	System.out.println("Database error\n" +
        			exception.getMessage());
        	Students = null;
        }
        return Students;   
    }
    
    
    /**
     * Fetch a students from the database using a given first name
     * @return 	ArrayList of Students with that first name
     */
    public ArrayList fetchStudentsByFirstName(String name){
    	String id, firstName = null, lastName, streetAddress, postCode, postOffice;
    	
    	Student Student;
    	ArrayList<Student> Students = new ArrayList <Student>();
        ResultSet resultset = null; // SQL-query resultset
        String sqlQuery = "SELECT * FROM Student WHERE firstname = ?";
		
		
        try{
        
        	PreparedStatement preparedStmt = dbconn.prepareStatement(sqlQuery);
        	preparedStmt.setString(1, name);
        	
        	resultset = preparedStmt.executeQuery();
        	
        	while(resultset.next()){
        		id = resultset.getString("id");
        		firstName = resultset.getString("firstName");
        		lastName = resultset.getString("lastName");
        		streetAddress =resultset.getString("streetAddress");
        		postCode= resultset.getString("postCode");
        		postOffice= resultset.getString("postOffice");
        		
        		Students.add(new Student(id, firstName, lastName, streetAddress, postCode, postOffice));
        	}
        	
        	if(Students.isEmpty())
        		Students = null;	
        }
        catch (SQLException exception){
        	System.out.println("Database error\n" +
        			exception.getMessage());
        	Students = null;
        }
        
        
        return Students;   
    }
    
    /**
     * Close database connection
     * @return
     * @throws SQLException
     */
    public boolean close()
        	throws SQLException
        {  
            boolean ret = false;
            try
            {
                dbconn.close();
                System.out.println("Connection closed!");
                ret = true;
            }
            catch (SQLException sqlE)
            {
                System.out.println(sqlE.getMessage() +  "\nclose" + 
                    "\nCannot close conection!");
                ret = false;
            }
            return ret;
        }
	

}
