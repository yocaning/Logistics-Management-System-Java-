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
import com.workit.bean.OutsetBean;
import com.workit.util.UserUtil;
import com.workit.util.hibernateUtil;

public class OutsetDao {
	
		
		public List<OutsetBean> findalloutset()
		{
			List<OutsetBean> listoutset = new ArrayList<OutsetBean>();
			Session session = hibernateUtil.getSession();
			listoutset = session.createQuery("from OutsetBean").list();
			session.close();
			return listoutset;
		}
		//根据id查询当前起点
		public OutsetBean findCurroutset(Integer outsetid)
		{
			OutsetBean outset = null;
			Session session = hibernateUtil.getSession();
			outset = (OutsetBean)session.get(OutsetBean.class, outsetid);
			session.close();
			return outset;
		}
		//删除起点
		public void deleteoutset(Integer outsetid) {
			//this.deleterolepower(powerid);
			Connection conn = UserUtil.getConnection();
			PreparedStatement ps = null ;
			ResultSet rs = null;
			String sql = "delete  t_outset  where outsetid = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setInt(1, outsetid);
				ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				UserUtil.CloseAll(conn, ps, rs);
			}
		}
		//添加起点
		public void saveoutset(OutsetBean outset)
		{
			Session session = hibernateUtil.getSession();
			Transaction ts = session.beginTransaction();
			session.save(outset);
			ts.commit();
			session.close();
		}
		//修改起点
		public void updateoutset(OutsetBean outset)
		{
			Session session = hibernateUtil.getSession();
			Transaction ts = session.beginTransaction();
			session.update(outset);
			ts.commit();
			session.close();
		}

}