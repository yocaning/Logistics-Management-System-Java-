package com.workit.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.workit.bean.CarBean;
import com.workit.bean.CartypeBean;
import com.workit.bean.EndsetBean;
import com.workit.bean.PowerBean;
import com.workit.bean.RoleBean;
import com.workit.dao.CarDao;
import com.workit.dao.CartypeDao;
import com.workit.dao.EndsetDao;
import com.workit.dao.PowerDao;
import com.workit.dao.RoleDao;

public class EndsetAction {
		private List<EndsetBean> listendset;
		private EndsetBean endset;
		private Integer endsetid;
	
	
		public List<EndsetBean> getListendset() {
			return listendset;
		}

		public void setListendset(List<EndsetBean> listendset) {
			this.listendset = listendset;
		}

		public EndsetBean getEndset() {
			return endset;
		}

		public void setEndset(EndsetBean endset) {
			this.endset = endset;
		}

		public Integer getEndsetid() {
			return endsetid;
		}

		public void setEndsetid(Integer endsetid) {
			this.endsetid = endsetid;
		}

		public String findallendset()
		{
			EndsetDao endsetdao = new EndsetDao();
			listendset = endsetdao.findallendset();
			ActionContext.getContext().getSession().put("listendset", listendset);
			return "findallendset";
		}
		
		public String deleteendset(){
			EndsetDao endsetdao = new EndsetDao();
			endsetdao.deleteendset(endsetid);
			return "deletesucc";
		}
		public String update(){
			EndsetDao endsetdao = new EndsetDao();
			endset = endsetdao.findCurrendset(endsetid);
			ActionContext.getContext().getSession().put("endset", endset);
			return "update";
		}
		public String updateendset(){
			EndsetDao endsetdao = new EndsetDao();
			endsetdao.updateendset(endset);
			return "updateendset";
		}
		public String saveendset(){
			EndsetDao endsetdao = new EndsetDao();
			endsetdao.saveendset(endset);
			return "savesucc";
		}
}
