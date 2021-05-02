import java.sql.*;
class SDelete
{
public static void main(String a[])
{
Connection c;
try
{
Class.forName("sun.jdbc.odbc.jdbcodbcDriver");
c=DriverManager.getConnection("jdbc:odbc:dsn1");
PreparedStatement ps=c.prepareStatement("delete * from student where regno=?");
ps.setInt(3,Integer.parseInt(a[0]));
ps.setString(1,a[1]);
ps.setString(2,a[2]);
int k=ps.executeUpdate();
if(k>=0)
System.out.println("Record Successfully Deleted");
c.close();
}catch(Exception e)
{
System.out.println(e);
}
}
}