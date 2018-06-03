package com.workit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.workit.bean.PowerBean;
import com.workit.bean.RoleBean;
import com.workit.bean.UserBean;
import com.workit.util.UserUtil;
import com.workit.util.hibernateUtil;

			public class RoleDao {
				public List<RoleBean> findallrole()
				{
					List<RoleBean> listrole = new ArrayList<RoleBean>();
					Session session = hibernateUtil.getSession();
					listrole = session.createQuery("from RoleBean").list();
					session.close();
					return listrole;
				}
				
				//根据id查询当前用户角色
				public RoleBean findCurrurole(Integer roleid)
				{
					RoleBean role = null;
					Session session = hibernateUtil.getSession();
					role = (RoleBean)session.get(RoleBean.class, roleid);
					session.close();
					return role;
				}
				
				//根据id查询当前用户角色赋予权限
				public RoleBean givepower(Integer roleid)
				{
					RoleBean role = null;
					Session session = hibernateUtil.getSession();
					role = (RoleBean)session.get(RoleBean.class, roleid);
					session.close();
					return role;
				}
				//删除角色
				public void deleteRole(Integer roleid) {
					Session session = hibernateUtil.getSession();
					Transaction ts = session.beginTransaction();
					RoleBean role =findCurrurole(roleid);
					if(role!= null)
						session.delete(role);
					ts.commit();
					session.close();
				}
				//添加角色
				public void saveRole(RoleBean role)
				{
					Session session = hibernateUtil.getSession();
					Transaction ts = session.beginTransaction();
					session.save(role);
					ts.commit();
					session.close();
				}
				//修改角色
				public void updateRole(RoleBean role)
				{
					Session session = hibernateUtil.getSession();
					Transaction ts = session.beginTransaction();
					session.update(role);
					ts.commit();
					session.close();
				}
}
