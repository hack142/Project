package com.thibaut;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;




/*

/resource/application.properties


	# datasource configuration
	quarkus.datasource.db-kind = mysql
	quarkus.datasource.username = hibernate
	quarkus.datasource.password = hibernate
	quarkus.datasource.jdbc.url = jdbc:mysql://localhost:3306/swa

	# drop and create the database at startup (use `update` to only update the schema)
	quarkus.hibernate-orm.database.generation=drop-and-create




*/

@Path("/api/hello")
public class GreetingResource {

    public static Properties testProperties = new Properties();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }







    private static void initTestProperties(String properties) { // parameter ist path to file
		FileInputStream fis = null;
		try {
			File f = new File(properties);
			if (!f.exists()) {
				System.out.println("No properties file found: " + f);
			} else {
				fis = new FileInputStream(f);
				testProperties.load(fis);
			}
		} catch (Exception e) {
			System.out.println("Failed to read test properties.");
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}