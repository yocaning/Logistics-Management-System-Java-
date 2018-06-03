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
import com.workit.util.UserUtil;
import com.workit.util.hibernateUtil;

public class CarDao {
	
		
		public List<CarBean> findallcar()
		{
			List<CarBean> listcar = new ArrayList<CarBean>();
			Session session = hibernateUtil.getSession();
		    listcar = session.createQuery("from CarBean").list();
			session.close();
			return listcar;
		}
		//根据id查询当前车辆信息
		public CarBean findCurrucar(Short carid)
		{
			CarBean car = null;
			Session session = hibernateUtil.getSession();
			car = (CarBean)session.get(CarBean.class, carid);
			session.close();
			return car;
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
		public void deletecar(Short carid) {
			//this.deleterolepower(powerid);
			Connection conn = UserUtil.getConnection();
			PreparedStatement ps = null ;
			ResultSet rs = null;
			String sql = "delete  t_car  where carid = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setInt(1, carid);
				ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				UserUtil.CloseAll(conn, ps, rs);
			}
		}
		//添加车辆
		public void savecar(CarBean car)
		{
			Session session = hibernateUtil.getSession();
			Transaction ts = session.beginTransaction();
			session.save(car);
			ts.commit();
			session.close();
		}
		//修改车辆
		public void updatecar(CarBean car)
		{
			Session session = hibernateUtil.getSession();
			Transaction ts = session.beginTransaction();
			session.update(car);
			ts.commit();
			session.close();
		}

}