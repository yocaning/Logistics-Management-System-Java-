package com.workit.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.workit.bean.CarBean;
import com.workit.bean.CartypeBean;
import com.workit.bean.DeptBean;
import com.workit.bean.PowerBean;
import com.workit.bean.RoleBean;
import com.workit.dao.CarDao;
import com.workit.dao.CartypeDao;
import com.workit.dao.DeptDao;
import com.workit.dao.PowerDao;
import com.workit.dao.RoleDao;

public class DeptAction {
		private List<DeptBean> listdept;
		private DeptBean dept;
		private Byte deptid;

		public List<DeptBean> getListdept() {
			return listdept;
		}

		public void setListdept(List<DeptBean> listdept) {
			this.listdept = listdept;
		}

		public DeptBean getDept() {
			return dept;
		}

		public void setDept(DeptBean dept) {
			this.dept = dept;
		}

		public Byte getDeptid() {
			return deptid;
		}

		public void setDeptid(Byte deptid) {
			this.deptid = deptid;
		}

		public String findalldept()
		{
			DeptDao deptdao = new DeptDao();
			listdept = deptdao.findalldept();
			ActionContext.getContext().getSession().put("listdept", listdept);
			return "findalldept";
		}
		
		public String deletedept(){
			DeptDao deptdao = new DeptDao();
			deptdao.deletedept(deptid);
			return "deletesucc";
		}
		public String update(){
			DeptDao deptdao = new DeptDao();
			dept = deptdao.findCurrdept(deptid);
			ActionContext.getContext().getSession().put("dept", dept);
			return "update";
		}
		public String updatedept(){
			DeptDao deptdao = new DeptDao();
			deptdao.updatedept(dept);
			return "updatecartype";
		}
		public String savedept(){
			DeptDao deptdao = new DeptDao();
			deptdao.savedept(dept);
			return "savesucc";
		}
}
