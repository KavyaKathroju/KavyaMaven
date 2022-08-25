package JSON1.JSON1;

import java.io.File;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONtoJava1 {
	public static void main(String[] args) throws Exception {

		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
				"8991");
 // System.out.println("hh");
		ObjectMapper om = new ObjectMapper();
		File Jsonfile = new File("JSONfile1.json");
		List<CustomerDetails1> cd =om.readValue(Jsonfile, new TypeReference<List<CustomerDetails1>>(){});

		for (CustomerDetails1 customerdetails : cd) { // for(int i : values) syso(i)
			int i = 1;
			String querry = "insert into customerdetails values(?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(querry);
			Class<?> classofclass = CustomerDetails1.class;
			for (Field field : classofclass.getDeclaredFields()) {
				field.setAccessible(true);
				Class<?> type = field.getType();
				if (type.equals(int.class)) {
					ps.setInt(i, (int) field.get(customerdetails));
				} else if (type.equals(String.class)) {
					ps.setString(i, (String) field.get(customerdetails));
				}
				i = i + 1;
			}
            ps.executeUpdate();
			ps.close();
		}

		connection.close();

		System.out.println("hlo");
		System.out.println("This is kothraju");
		
		
		
		
		
		
	}
}
