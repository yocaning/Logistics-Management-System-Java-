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
import com.workit.bean.CartypeBean;
import com.workit.util.UserUtil;
import com.workit.util.hibernateUtil;

public class CartypeDao {
	
		
		public List<CartypeBean> findallcartype()
		{
			List<CartypeBean> listcartype = new ArrayList<CartypeBean>();
			Session session = hibernateUtil.getSession();
			listcartype = session.createQuery("from CartypeBean").list();
			session.close();
			return listcartype;
		}
		//根据id查询当前车辆信息
		public CartypeBean findCurrucartype(Short typeid)
		{
			CartypeBean cartype = null;
			Session session = hibernateUtil.getSession();
			cartype = (CartypeBean)session.get(CartypeBean.class, typeid);
			session.close();
			return cartype;
		}
		//删除权限
//		public void deleterolepower(Integer powerid) {
//			Connection conn = UserUtil.getConnection();
//			PreparedStatement ps = null ;
//			ResultSet rs = null;
//			String sql = "delete  t_role_power  where powerid = ?";
//			try {
//				ps = conn.prepareStatement(sql);
//				ps.setInt(1, powerid);
//				ps.executeUpdate();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}finally{
//				UserUtil.CloseAll(conn, ps, rs);
//			}
//		}
		//删除车辆
		public void deletecartype(Short typeid) {
			//this.deleterolepower(powerid);
			Connection conn = UserUtil.getConnection();
			PreparedStatement ps = null ;
			ResultSet rs = null;
			String sql = "delete  t_cartype  where typeid = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setInt(1, typeid);
				ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				UserUtil.CloseAll(conn, ps, rs);
			}
		}
		//添加车辆
		public void savecartype(CartypeBean cartype)
		{
			Session session = hibernateUtil.getSession();
			Transaction ts = session.beginTransaction();
			session.save(cartype);
			ts.commit();
			session.close();
		}
		//修改车辆
		public void updatecartype(CartypeBean cartype)
		{
			Session session = hibernateUtil.getSession();
			Transaction ts = session.beginTransaction();
			session.update(cartype);
			ts.commit();
			session.close();
		}

}