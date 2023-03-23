/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


class databaseOperation
{
    Connection con;
    Statement stm;
    PreparedStatement pstm;
    ResultSet rsuser;
    String sql;
    int no;
    
    public databaseOperation()
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/demojava","root","");
                if(con==null)
                {
                    System.out.println("Connection not intialize");
                }
                else
                {
                    System.out.println("Connection Created");
                }
            }
            catch (Exception ex)
            {
                System.out.println("Problem in connection"+ ex.toString());
            }
        }
    
        int insert(String u_name, String u_password)
        {
            try
            {
                sql = "insert into tm_user (u_name,u_password) values ('"+u_name+"','"+u_password+"')";
                stm = con.createStatement();
                no = stm.executeUpdate(sql);
                return no;
                
            }
            catch(Exception ex)
            {
                System.out.println("Problem in insrt" + ex.toString());
            }
        return 0;
        }
        
        public void display()
        {
            int u_id;
            String u_name,u_password;
            
  
            try
            {
                sql = "select u_id,u_name,u_password from tm_user";
                stm = con.createStatement();
                rsuser = stm.executeQuery(sql);
                if(rsuser!=null)
                {
                    while(rsuser.next())
                    {
                        u_id = rsuser.getInt(1);
                        u_name = rsuser.getString("u_name");
                        u_password = rsuser.getString("u_password");
                        System.out.println("|"+ u_id + "|"+ u_name + "|" + u_password + "|");
                    }
                    rsuser.close();
                    }
                    
                }
            catch(Exception ex)
            {
                System.out.println("Problem in display" + ex.toString());
            }
            }
         public int update(int u_id, String u_name, String u_password)
        {
            try
            {
                sql = "update tm_user set u_name=?,u_password=? where u_id=?";
                pstm = con.prepareStatement(sql);
                pstm.clearParameters();
                pstm.setString(1, u_name);
                pstm.setString(2, u_password);
                pstm.setInt(3, u_id);
                no = pstm.executeUpdate();
                
                return no;
                
            }
            catch(Exception ex)
            {
                System.out.println("Problem in update" + toString());
            }
        return 0;
            
        }
         public int delete(int u_id)
         {
             try
             {
                 sql = "Delete from tm_user where u_id =? ";
                 pstm = con.prepareStatement(sql);
                 pstm.clearParameters();
                 pstm.setInt(1, u_id);
                 no = pstm.executeUpdate();
                 return no;
                         
             }
             catch(Exception ex)
             {
                 System.out.println("Problem in Delete"+ ex.toString());
             }
        return 0;   
         }
            
    
}

    public class demodataAccess {
    public static void main (String[] args){
        
        
        databaseOperation db = new databaseOperation();
        
        Scanner obj = new Scanner(System.in);
        int ch = 0;
        int u_id;
        String u_name,u_password;
        int no;
        do
        {
            
            System.out.println("1.Insert,2.Update,3.delete,4.Display,5.Exit");
            System.out.println("Enter Your Choice");
            ch = obj.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter User Name");
                    u_name = obj.next();
                    System.out.println("Enter Password");
                    u_password = obj.next();
                    no = db.insert(u_name, u_password);
                    System.out.println(no + "Recorded Insert");
                    break;
                case 2:
                    System.out.println("Enter User id");
                    u_id = obj.nextInt();
                    System.out.println("Enter User Name");
                    u_name = obj.next();
                    System.out.println("Enter Password");
                    u_password = obj.next();
                    no = db.update(u_id, u_name, u_password);
                    System.out.println(no + "Recorded updated");
                    break;
                case 3:
                    System.out.println("Enter User Id");
                    u_id = obj.nextInt();
                    no =  db.delete(u_id);
                    System.out.println("Recorded Delete");
                    break;
                case 4:
                    db.display();
                    break;
                case 5:
                    break;
                    
            }
            
                
        }while(ch!=5);
        
    
}
    
}
