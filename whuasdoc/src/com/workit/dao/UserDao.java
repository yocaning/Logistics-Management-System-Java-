package com.workit.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.workit.bean.UserBean;
import com.workit.util.hibernateUtil;

public class UserDao {
		
	//验证登陆
	public UserBean isExistUser(UserBean user){
		UserBean curruser = null;
		Session session = hibernateUtil.getSession();
		String hql = "from UserBean user where user.username=? and user.password=?";
		curruser =(UserBean)session.createQuery(hql)
							.setString(0, user.getUsername())
							.setString(1, user.getPassword()).uniqueResult();
		session.close();
		return curruser;
	}
	//查询所有的用户
	public List<UserBean> findalluser() {
		List<UserBean> listuser =new ArrayList<UserBean>();
		Session session = hibernateUtil.getSession();
		listuser = session.createQuery("from UserBean").list();
		session.close();
		return listuser;
		
	}
	//根据id查询当前用户
	public UserBean findCurruser(short userid)
	{
		UserBean user = null;
		Session session = hibernateUtil.getSession();
		user = (UserBean)session.get(UserBean.class, userid);
		session.close();
		return user;
	}
	//删除用户
	public void deleteUser(short userid) {
		Session session = hibernateUtil.getSession();
		Transaction ts = session.beginTransaction();
		UserBean user =findCurruser(userid);
		if(user!= null)
			session.delete(user);
		ts.commit();
		session.close();
	}
	//添加用户
	public void saveUser(UserBean user)
	{
		Session session = hibernateUtil.getSession();
		Transaction ts = session.beginTransaction();
		session.save(user);
		ts.commit();
		session.close();
	}
	//修改用户
	public void updateUser(UserBean user)
	{
		Session session = hibernateUtil.getSession();
		Transaction ts = session.beginTransaction();
		session.update(user);
		ts.commit();
		session.close();
	}
}
