package com.workit.action;

import java.util.List;
import java.util.Set;

import com.opensymphony.xwork2.ActionContext;
import com.workit.bean.PowerBean;
import com.workit.bean.RoleBean;
import com.workit.dao.PowerDao;
import com.workit.dao.RoleDao;

public class PowerAction {
		private List<PowerBean> listpower;
		private Set<PowerBean> setpower;
		public Set<PowerBean> getSetpower() {
			return setpower;
		}
		public void setSetpower(Set<PowerBean> setpower) {
			this.setpower = setpower;
		}
		private PowerBean power;
		private RoleBean role;
		private Integer powerid;
		private Integer roleid;
		
		public Integer getRoleid() {
			return roleid;
		}
		public void setRoleid(Integer roleid) {
			this.roleid = roleid;
		}
		public Integer getPowerid() {
			return powerid;
		}
		public void setPowerid(Integer powerid) {
			this.powerid = powerid;
		}
		public List<PowerBean> getListpower() {
			return listpower;
		}
		public void setListpower(List<PowerBean> listpower) {
			this.listpower = listpower;
		}
		public PowerBean getPower() {
			return power;
		}
		public void setPower(PowerBean power) {
			this.power = power;
		}
		public RoleBean getRole() {
			return role;
		}
		public void setRole(RoleBean role) {
			this.role = role;
		}
		public String findallpower()
		{
			PowerDao powerdao = new PowerDao();
			listpower =powerdao.findallpower();
			ActionContext.getContext().getSession().put("listpower", listpower);
			return "findallpower";
		}
		public String findAllpower()
		{
			PowerDao powerdao = new PowerDao();
			listpower = powerdao.findallpower();
			ActionContext.getContext().getSession().put("listpower", listpower);
			return "findAllpower";
		}
		public String deletepower(){
			PowerDao powerdao =new PowerDao();
			powerdao.deletepower(powerid);
			return "deletesucc";
		}
		public String update(){
			PowerDao powerdao =new PowerDao();
			power = powerdao.findCurrupower(powerid);
			ActionContext.getContext().getSession().put("power", power);
			return "update";
		}
		public String updatepower(){
			PowerDao powerdao =new PowerDao();
			powerdao.updatepower(power);
			return "updatepower";
		}
		public String savepower(){
			PowerDao powerdao =new PowerDao();
			powerdao.savepower(power);
			return "savesucc";
		}
}
