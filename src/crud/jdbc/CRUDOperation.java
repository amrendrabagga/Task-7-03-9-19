package crud.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDOperation {

	public static void main(String[] args)
			throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wp", "root", "root123@");
		Statement s = con.createStatement();
		System.out.println("1.create table 2.insert 3.update 4.delete 5.add column designation");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int choice = Integer.parseInt(reader.readLine());

		switch (choice) {

		case 1:
			String createQuery = "create table emp(eno int primary key,ename varchar(25),salary int)";
			boolean checkCreate = s.execute(createQuery);

			System.out.println("EMP TABLE CREATED");
			break;
		case 2:
			String insertQuery = "insert into emp values(111,'amrendra',100000)";
			int checkInsert = s.executeUpdate(insertQuery);
			if (checkInsert != 0)
				System.out.println("1 ROW INSERTED SUCCESSFULLY");
			break;

		case 3:
			String updateQuery = "update emp set salary = 110000 where eno=111";
			int checkUpdate = s.executeUpdate(updateQuery);
			if (checkUpdate != 0)
				System.out.println("1 ROW UPDATED SUCCESSFULLY");
			break;

		case 4:
			String deleteQuery = "delete from emp where eno=111";
			int checkDelete = s.executeUpdate(deleteQuery);
			if (checkDelete != 0)
				System.out.println("1 ROW DELETED SUCCESSFULLY");
			break;

		case 5:
			String alterQuery = "alter table emp add designation varchar(10)";
			s.executeUpdate(alterQuery);

			System.out.println("TABLE ALTERED SUCCESSFULLY");
			break;

		default:
			System.out.println("CHOOSE CORRECT OPTION");
		}
	}

}
