package com.workit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.workit.bean.DeptBean;
import com.workit.bean.PowerBean;
import com.workit.util.UserUtil;
import com.workit.util.hibernateUtil;

	public class DeptDao {
		
			public List<DeptBean> findalldept()
			{
				List<DeptBean> listdept = new ArrayList<DeptBean>();
				Session session = hibernateUtil.getSession();
				listdept = session.createQuery("from DeptBean").list();
				session.close();
				return listdept;
			}		
			//根据id查询当前部门
			public DeptBean findCurrdept(Byte deptid)
			{
				DeptBean dept = null;
				Session session = hibernateUtil.getSession();
				dept = (DeptBean)session.get(DeptBean.class, deptid);
				session.close();
				return dept;
			}
			
			//删除部门
			public void deletedept(Byte deptid) {
				Connection conn = UserUtil.getConnection();
				PreparedStatement ps = null ;
				ResultSet rs = null;
				String sql = "delete  t_dept  where deptid = ?";
				try {
					ps = conn.prepareStatement(sql);
					ps.setInt(1, deptid);
					ps.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					UserUtil.CloseAll(conn, ps, rs);
				}
			}

			//添加部门
			public void savedept(DeptBean dept)
			{
				Session session = hibernateUtil.getSession();
				Transaction ts = session.beginTransaction();
				session.save(dept);
				ts.commit();
				session.close();
			}
			//修改权限
			public void updatedept(DeptBean dept)
			{
				Session session = hibernateUtil.getSession();
				Transaction ts = session.beginTransaction();
				session.update(dept);
				ts.commit();
				session.close();
			}

	}