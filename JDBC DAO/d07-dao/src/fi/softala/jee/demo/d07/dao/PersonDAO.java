package fi.softala.jee.demo.d07.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fi.softala.jee.demo.d07.bean.Person;

public class PersonDAO {
	
public List<Person> getPersonByName(String fname) {
		
		
		ArrayList<Person> persons = new ArrayList<Person>();
		
		Connection conn = null;
		
		try {
			//YHTEYDEN AVAUS JA HAKU
			//load driver
			Class.forName(DBConnectionProperties.getInstance().getProperty("driver")).newInstance();
			//open connection
			conn = DriverManager.getConnection(
					DBConnectionProperties.getInstance().getProperty("url"), 
					DBConnectionProperties.getInstance().getProperty("username"),
					DBConnectionProperties.getInstance().getProperty("password"));
			
			
			
			//excecute query for search
			String sqlSearch = "select id, firstname, lastname from person where firstname = '"+ fname +"'";
			Statement querySearch = conn.createStatement();
			ResultSet result = querySearch.executeQuery(sqlSearch);
			
			
			//resultset
			while(result.next()) {
				int id = result.getInt("id");
				String firstname = result.getString("firstname");
				String lastname = result.getString("lastname");
				
				//add person to list
				Person h = new Person(id, firstname, lastname);
				persons.add(h);
			}
			
			
			
			
		} catch(IOException e) {
			System.out.println("Tietokantayhteyden asetuksien hakeminen aiheutti virheen.");
			e.printStackTrace();
		} catch(Exception e) {
			//Error handling
			System.out.println("Tietokantahaku aiheutti virheen");
			e.printStackTrace();
		}finally {
			//LOPULTA AINA SULJETAAN YHTEYS
			try {
				if (conn != null && !conn.isClosed())
					conn.close();
			} catch(Exception e) {
				System.out.println("Tietokantayhteys ei jostain syystä suostu menemään kiinni.");
				e.printStackTrace();
			}
		}
		
		System.out.println("PERSON QUERY EXCECUTED: " + persons.toString());
		return persons;
	}


}
