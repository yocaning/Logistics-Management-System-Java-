package com.workit.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.workit.bean.CarBean;
import com.workit.bean.CartypeBean;
import com.workit.bean.PowerBean;
import com.workit.bean.RoleBean;
import com.workit.dao.CarDao;
import com.workit.dao.CartypeDao;
import com.workit.dao.PowerDao;
import com.workit.dao.RoleDao;

public class CartypeAction {
		private List<CartypeBean> listcartype;
		private CartypeBean cartype;
		private short typeid;
		  
		public List<CartypeBean> getListcartype() {
			return listcartype;
		}

		public void setListcartype(List<CartypeBean> listcartype) {
			this.listcartype = listcartype;
		}

		public CartypeBean getCartype() {
			return cartype;
		}

		public void setCartype(CartypeBean cartype) {
			this.cartype = cartype;
		}

		public short getTypeid() {
			return typeid;
		}

		public void setTypeid(short typeid) {
			this.typeid = typeid;
		}

		public String findallcartype()
		{
			CartypeDao cartypedao = new CartypeDao();
			listcartype = cartypedao.findallcartype();
			ActionContext.getContext().getSession().put("listcartype", listcartype);
			return "findallcartype";
		}
		
		public String deletecartype(){
			CartypeDao cartypedao = new CartypeDao();
			cartypedao.deletecartype(typeid);
			return "deletesucc";
		}
		public String update(){
			CartypeDao cartypedao = new CartypeDao();
			cartype = cartypedao.findCurrucartype(typeid);
			ActionContext.getContext().getSession().put("cartype", cartype);
			return "update";
		}
		public String updatecartype(){
			CartypeDao cartypedao = new CartypeDao();
			cartypedao.updatecartype(cartype);
			return "updatecartype";
		}
		public String savecartype(){
			CartypeDao cartypedao = new CartypeDao();
			cartypedao.savecartype(cartype);
			return "savesucc";
		}
}
