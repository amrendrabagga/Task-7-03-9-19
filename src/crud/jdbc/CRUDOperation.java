package crud.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDOperation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wp", "root", "root123@");
		Statement s = con.createStatement();
		System.out.println("1.insert 2.update 3.delete 4.add column designation");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int choice = Integer.parseInt(reader.readLine());
		
		switch(choice) {
		case 1:
			String insertQuery = "insert into emp values(111,'amrendra',100000)";
			int checkInsert = s.executeUpdate(insertQuery);
			if(checkInsert!=0)
				System.out.println("1 ROW INSERTED SUCCESSFULLY");
			break;
			
		case 2:
			String updateQuery = "update emp set salary = 110000 where eno=111";
			int checkUpdate = s.executeUpdate(updateQuery);
			if(checkUpdate!=0)
				System.out.println("1 ROW UPDATED SUCCESSFULLY");
			break;
		
		case 3:
			String deleteQuery = "delete from emp where eno=111";
			int checkDelete = s.executeUpdate(deleteQuery);
			if(checkDelete!=0)
				System.out.println("1 ROW DELETED SUCCESSFULLY");
			break;
			
		case 4:
			String  alterQuery = "alter table emp add designation varchar(10)";
			int checkAlter = s.executeUpdate(alterQuery);
			if(checkAlter!=0)
				System.out.println("TABLE ALTERED SUCCESSFULLY");
			break;
		default:
			System.out.println("CHOOSE CORRECT OPTION");
		}
	}

}
