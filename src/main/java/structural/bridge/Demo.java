package structural.bridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by stathis on 19/2/2017.
 */
public class Demo {

	public static void main(String[] args) throws Exception{

		DriverManager.registerDriver(new Driver());

		String dbUrl = "jdbc:url";

		Connection conn = DriverManager.getConnection(dbUrl);

		Statement sta = conn.createStatement();

		sta.executeUpdate("");





	}

}
