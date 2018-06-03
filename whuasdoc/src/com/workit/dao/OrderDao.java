package com.workit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.workit.bean.CarBean;
import com.workit.bean.EndsetBean;
import com.workit.bean.OutsetBean;
import com.workit.bean.UserBean;
import com.workit.bean.orderBean;
import com.workit.util.UserUtil;
import com.workit.util.hibernateUtil;

public class OrderDao {
	
		
		public List<orderBean> findallorder()
		{
			List<orderBean> listorder = new ArrayList<orderBean>();
			Session session = hibernateUtil.getSession();
			listorder = session.createQuery("from orderBean").list();
			session.close();
			return listorder;
		}
		//根据id查询当前起点
		public orderBean findCurrorder(Integer orderid)
		{
			orderBean order = null;
			Session session = hibernateUtil.getSession();
			order = (orderBean)session.get(orderBean.class, orderid);
			session.close();
			return order;
		}
		//删除起点
		public void deleteorder(Integer orderid) {
			Session session = hibernateUtil.getSession();
			Transaction ts = session.beginTransaction();
			orderBean order =findCurrorder(orderid);
			if(order!= null)
				session.delete(order);
			ts.commit();
			session.close();
		}
//			//this.deleterolepower(powerid);
//			Connection conn = UserUtil.getConnection();
//			PreparedStatement ps = null ;
//			ResultSet rs = null;
//			String sql = "delete  t_order  where orderid =?";
//			try {
//				ps = conn.prepareStatement(sql);
//				ps.setInt(1, orderid);
//				ps.executeUpdate();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}finally{
//				UserUtil.CloseAll(conn, ps, rs);
//			}
//		}
		//添加起点
		public void saveorder(orderBean order)
		{
			Session session = hibernateUtil.getSession();
			Transaction ts = session.beginTransaction();
			session.save(order);
			ts.commit();
			session.close();
		}
		//修改起点
		public void updateorder(orderBean order)
		{
			Session session = hibernateUtil.getSession();
			Transaction ts = session.beginTransaction();
			session.update(order);
			ts.commit();
			session.close();
		}

}