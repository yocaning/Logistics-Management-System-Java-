package com.workit.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.workit.bean.CarBean;
import com.workit.bean.CartypeBean;
import com.workit.bean.PowerBean;
import com.workit.bean.RoleBean;
import com.workit.bean.orderBean;
import com.workit.dao.CarDao;
import com.workit.dao.CartypeDao;
import com.workit.dao.OrderDao;
import com.workit.dao.PowerDao;
import com.workit.dao.RoleDao;

public class OrderAction {
		private List<orderBean> listorder;
		private orderBean order;
		private Integer orderid;
		  
		

		public List<orderBean> getListorder() {
			return listorder;
		}

		public void setListorder(List<orderBean> listorder) {
			this.listorder = listorder;
		}

		public orderBean getOrder() {
			return order;
		}

		public void setOrder(orderBean order) {
			this.order = order;
		}

		public Integer getOrderid() {
			return orderid;
		}

		public void setOrderid(Integer orderid) {
			this.orderid = orderid;
		}

		public String findallorder()
		{
			OrderDao orderdao = new OrderDao();
			listorder = orderdao.findallorder();
			ActionContext.getContext().getSession().put("listorder", listorder);
			return "findallorder";
		}
		
		public String deleteorder(){
			OrderDao orderdao = new OrderDao();
			orderdao.deleteorder(orderid);
			return "deletesucc";
		}
		public String update(){
			OrderDao orderdao = new OrderDao();
			order = orderdao.findCurrorder(orderid);
			ActionContext.getContext().getSession().put("order", order);
			return "update";
		}
		public String updateorder(){
			OrderDao orderdao = new OrderDao();
			orderdao.updateorder(order);
			return "updateorder";
		}
		public String saveorder(){
			OrderDao orderdao = new OrderDao();
			orderdao.saveorder(order);
			return "savesucc";
		}
}
