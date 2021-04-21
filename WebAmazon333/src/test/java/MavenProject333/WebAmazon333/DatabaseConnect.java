package MavenProject333.WebAmazon333;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatabaseConnect {
	static Connection conn=null;
    static Statement st;
    public static String s1="jdbc:ucanaccess://C://Users//hp-hp//Desktop//Nitin Data//Employee1.accdb";
    
    @BeforeTest
    public void Setup()
    {
   
    	 
    	try
    	{
    		
			conn=DriverManager.getConnection(s1);
			
			st=conn.createStatement();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    @Test
    public void runit()
    {
    	try
    	{
    	ResultSet rs=st.executeQuery("select * from Employee1");
		while(rs.next())
		{
			System.out.println("Emp_id :"+rs.getInt("Emp_id")+"\nEmp_name :"+rs.getString("Emp_Name")+"\nEmp_Salary :"+rs.getInt("Emp_salary"));
			System.out.println("------------------------------");
		}
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    @AfterTest
    public void closethis() throws Exception
    {
    	if(conn!=null)
    	{
    		conn.close();
    	}
    }
	

}
