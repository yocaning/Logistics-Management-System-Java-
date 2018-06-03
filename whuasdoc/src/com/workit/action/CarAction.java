package com.workit.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.workit.bean.CarBean;
import com.workit.bean.PowerBean;
import com.workit.bean.RoleBean;
import com.workit.dao.CarDao;
import com.workit.dao.PowerDao;
import com.workit.dao.RoleDao;

public class CarAction {
		private CarBean car;
		private List<CarBean> listcar ;
		private short carid;
		
		public CarBean getCar() {
			return car;
		}
		public void setCar(CarBean car) {
			this.car = car;
		}
		public List<CarBean> getListcar() {
			return listcar;
		}
		public void setListcar(List<CarBean> listcar) {
			this.listcar = listcar;
		}
		public short getCarid() {
			return carid;
		}
		public void setCarid(short carid) {
			this.carid = carid;
		}
		public String findallcar()
		{
			CarDao cardao = new CarDao();
			listcar = cardao.findallcar();
			ActionContext.getContext().getSession().put("listcar", listcar);
			return "findallcar";
		}
		
		public String deletecar(){
			CarDao cardao = new CarDao();
			cardao.deletecar(carid);
			return "deletesucc";
		}
		public String update(){
			CarDao cardao = new CarDao();
			car = cardao.findCurrucar(carid);
			ActionContext.getContext().getSession().put("car", car);
			return "update";
		}
		public String updatecar(){
			CarDao cardao = new CarDao();
			cardao.updatecar(car);
			return "updatecar";
		}
		public String savecar(){
			CarDao cardao = new CarDao();
			cardao.savecar(car);
			return "savesucc";
		}
}
