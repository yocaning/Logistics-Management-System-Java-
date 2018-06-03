package com.workit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.workit.bean.PowerBean;
import com.workit.bean.RoleBean;
import com.workit.util.UserUtil;
import com.workit.util.hibernateUtil;

public class PowerDao {
	
		
		public List<PowerBean> findallpower()
		{
			List<PowerBean> listpower = new ArrayList<PowerBean>();
			Session session = hibernateUtil.getSession();
		    listpower = session.createQuery("from PowerBean").list();
			session.close();
			return listpower;
		}
		//根据id查询当前用户权限
		public PowerBean findCurrupower(Integer powerid)
		{
			PowerBean power = null;
			Session session = hibernateUtil.getSession();
			power = (PowerBean)session.get(PowerBean.class, powerid);
			session.close();
			return power;
		}
		
		//删除权限
		public void deleterolepower(Integer powerid) {
			Connection conn = UserUtil.getConnection();
			PreparedStatement ps = null ;
			ResultSet rs = null;
			String sql = "delete  t_role_power  where powerid = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setInt(1, powerid);
				ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				UserUtil.CloseAll(conn, ps, rs);
			}
		}
		//删除权限
		public void deletepower(Integer powerid) {
			this.deleterolepower(powerid);
			Connection conn = UserUtil.getConnection();
			PreparedStatement ps = null ;
			ResultSet rs = null;
			String sql = "delete  t_power  where powerid = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setInt(1, powerid);
				ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				UserUtil.CloseAll(conn, ps, rs);
			}
		}
		//添加权限
		public void savepower(PowerBean power)
		{
			Session session = hibernateUtil.getSession();
			Transaction ts = session.beginTransaction();
			session.save(power);
			ts.commit();
			session.close();
		}
		//修改权限
		public void updatepower(PowerBean power)
		{
			Session session = hibernateUtil.getSession();
			Transaction ts = session.beginTransaction();
			session.update(power);
			ts.commit();
			session.close();
		}

}