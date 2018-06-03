package com.workit.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.workit.bean.CarBean;
import com.workit.bean.CartypeBean;
import com.workit.bean.OutsetBean;
import com.workit.bean.PowerBean;
import com.workit.bean.RoleBean;
import com.workit.dao.CarDao;
import com.workit.dao.CartypeDao;
import com.workit.dao.OutsetDao;
import com.workit.dao.PowerDao;
import com.workit.dao.RoleDao;

public class OutsetAction {
		private List<OutsetBean> listoutset;
		private OutsetBean outset;
		private Integer outsetid;
		
		public List<OutsetBean> getListoutset() {
			return listoutset;
		}

		public void setListoutset(List<OutsetBean> listoutset) {
			this.listoutset = listoutset;
		}

		public OutsetBean getOutset() {
			return outset;
		}

		public void setOutset(OutsetBean outset) {
			this.outset = outset;
		}

		public Integer getOutsetid() {
			return outsetid;
		}

		public void setOutsetid(Integer outsetid) {
			this.outsetid = outsetid;
		}

		public String findalloutset()
		{
			OutsetDao outsetdao = new OutsetDao();
			listoutset = outsetdao.findalloutset();
			ActionContext.getContext().getSession().put("listoutset", listoutset);
			return "findalloutset";
		}
		
		public String deleteoutset(){
			OutsetDao outsetdao = new OutsetDao();
			outsetdao.deleteoutset(outsetid);
			return "deletesucc";
		}
		public String update(){
			OutsetDao outsetdao = new OutsetDao();
			outset = outsetdao.findCurroutset(outsetid);
			ActionContext.getContext().getSession().put("outset", outset);
			return "update";
		}
		public String updateoutset(){
			OutsetDao outsetdao = new OutsetDao();
			outsetdao.updateoutset(outset);
			return "updateoutset";
		}
		public String saveoutset(){
			OutsetDao outsetdao = new OutsetDao();
			outsetdao.saveoutset(outset);
			return "savesucc";
		}
}
