package com.workit.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.workit.bean.CarBean;
import com.workit.bean.DeptBean;
import com.workit.bean.EndsetBean;
import com.workit.bean.OutsetBean;
import com.workit.bean.PowerBean;
import com.workit.bean.RoleBean;
import com.workit.dao.CarDao;
import com.workit.dao.DeptDao;
import com.workit.dao.EndsetDao;
import com.workit.dao.OutsetDao;
import com.workit.dao.PowerDao;
import com.workit.dao.RoleDao;

public class PreUserAction {
		private List<RoleBean> listrole;
		private List<DeptBean> listdept;
		private List<PowerBean> listpower;
		private List<OutsetBean> listoutset;
		private List<EndsetBean> listendset;
		private List<CarBean> listcar;
		
		public List<OutsetBean> getListoutset() {
			return listoutset;
		}
		public void setListoutset(List<OutsetBean> listoutset) {
			this.listoutset = listoutset;
		}
		public List<EndsetBean> getListendset() {
			return listendset;
		}
		public void setListendset(List<EndsetBean> listendset) {
			this.listendset = listendset;
		}
		public List<CarBean> getListcar() {
			return listcar;
		}
		public void setListcar(List<CarBean> listcar) {
			this.listcar = listcar;
		}
		public List<PowerBean> getListpower() {
			return listpower;
		}
		public void setListpower(List<PowerBean> listpower) {
			this.listpower = listpower;
		}
		public List<RoleBean> getListrole() {
			return listrole;
		}
		public void setListrole(List<RoleBean> listrole) {
			this.listrole = listrole;
		}
		public List<DeptBean> getListdept() {
			return listdept;
		}
		public void setListdept(List<DeptBean> listdept) {
			this.listdept = listdept;
		}
		
		//新增订单拿取数据
		public String  getoutend() {
			OutsetDao outsetdao =new OutsetDao();
			EndsetDao endsetdao =new EndsetDao();
			CarDao cardao = new CarDao();
			listoutset =outsetdao.findalloutset();
			listendset =endsetdao.findallendset();
			listcar =cardao.findallcar();
			return "getoutset";
		}
		//更新订单拿取数据
		public String  getoutend2() {
			OutsetDao outsetdao =new OutsetDao();
			EndsetDao endsetdao =new EndsetDao();
			CarDao cardao = new CarDao();
			listoutset =outsetdao.findalloutset();
			listendset =endsetdao.findallendset();
			listcar =cardao.findallcar();
			ActionContext.getContext().getSession().put("listcar", listcar);
			return "getoutset2";
		}
		public String  getroledept() {
			RoleDao roledao =new RoleDao();
			DeptDao deptdao =new DeptDao();
			listrole =roledao.findallrole();
			listdept =deptdao.findalldept();
			
			return "getroledept";
		}
		public String  getdeptrole() {
			RoleDao roledao =new RoleDao();
			DeptDao deptdao =new DeptDao();
			listrole =roledao.findallrole();
			listdept =deptdao.findalldept();
			
			return "getdeptrole";
		}
		public String getpower() {
			PowerDao powerdao = new PowerDao();
			listpower =powerdao.findallpower();
			return "getpower";
			
		}
}
