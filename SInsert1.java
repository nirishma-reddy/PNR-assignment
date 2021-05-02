import java.sql.*;
class SInsert1
{
public static void main(String a[])
{
Connection c;
try
{
Class.forName("sun.jdbc.odbc.jdbcodbcDriver");
c=DriverManager.getConnection("jdbc.odbc.dsn1");
PreparedStatement s=c.prepareStatement("insert into Student values(103,'chandran','BE')");
ps.setInt(1,Integer.parseInt(a[0]));
ps.setString(2,a[1]);
ps.setString(3,a[2]);
int k=ps.executeUpdate();
if(k>=0)
System.out.println("Record Successfully Inserted");
c.close();
}catch(Exception e)
{
System.out.println(e);
}
}
}