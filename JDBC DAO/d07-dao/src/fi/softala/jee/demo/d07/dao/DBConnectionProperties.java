package fi.softala.jee.demo.d07.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Read database connection settings from the properties file
 */
public class DBConnectionProperties {

	public static final String FILE_NAME = "db_connection.properties";
	private static DBConnectionProperties instance;
	private Properties properties;

	private DBConnectionProperties() throws IOException {
		// load values from the file
		InputStream inputStream = this.getClass().getClassLoader()
				.getResourceAsStream(FILE_NAME);
		properties = new Properties();
		properties.load(inputStream);
	}

	public String getProperty(String nimi) {
		return this.properties.getProperty(nimi);
	}

	public static DBConnectionProperties getInstance() throws IOException {
		if (instance == null) {
			instance = new DBConnectionProperties();
		}
		return instance;
	}

}
