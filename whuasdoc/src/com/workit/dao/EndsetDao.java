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
import com.workit.util.UserUtil;
import com.workit.util.hibernateUtil;

public class EndsetDao {
	
		
		public List<EndsetBean> findallendset()
		{
			List<EndsetBean> listendset = new ArrayList<EndsetBean>();
			Session session = hibernateUtil.getSession();
			listendset = session.createQuery("from EndsetBean").list();
			session.close();
			return listendset;
		}
		//根据id查询当前起点
		public EndsetBean findCurrendset(Integer endsetid)
		{
			EndsetBean endset = null;
			Session session = hibernateUtil.getSession();
			endset = (EndsetBean)session.get(EndsetBean.class, endsetid);
			session.close();
			return endset;
		}
		//删除起点
		public void deleteendset(Integer endsetid) {
			//this.deleterolepower(powerid);
			Connection conn = UserUtil.getConnection();
			PreparedStatement ps = null ;
			ResultSet rs = null;
			String sql = "delete  t_endset  where endsetid = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setInt(1, endsetid);
				ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				UserUtil.CloseAll(conn, ps, rs);
			}
		}
		//添加起点
		public void saveendset(EndsetBean endset)
		{
			Session session = hibernateUtil.getSession();
			Transaction ts = session.beginTransaction();
			session.save(endset);
			ts.commit();
			session.close();
		}
		//修改起点
		public void updateendset(EndsetBean endset)
		{
			Session session = hibernateUtil.getSession();
			Transaction ts = session.beginTransaction();
			session.update(endset);
			ts.commit();
			session.close();
		}

}