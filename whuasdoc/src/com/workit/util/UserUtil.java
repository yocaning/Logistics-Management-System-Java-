package com.workit.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class UserUtil {
	
		public static  String  url="jdbc:oracle:thin:@localhost:1521/oracle";
		public static String drivename = "oracle.jdbc.driver.OracleDriver";
		public static   String user="huasdoc";
		public static  String password="huasdoc";
		
		
		public static Connection conn=null;
		public static  Statement  stat =null;
		public static  ResultSet  rs=null;
		//�÷�����ƶ������һ���ҽ�����һ�ε���
	static {
		try {
			Class.forName(drivename);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//����������ݿ�ķ���

	    public  static Connection getConnection(){
	    
			try {
				conn=DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    return  conn;
	}
	//�����ر���ݿ���Դ�ķ���
	    public static   void   CloseAll(Connection  conn,  Statement  stat ,ResultSet  rs ){
	    	
	    	try {
				if (rs!=null){
					rs.close();
					
					if (stat!=null){
			    		stat.close();
			    	  }
			    	 
			    	if (conn!=null){
			    		conn.close();
			    	  }
				  }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	    }   
	}


