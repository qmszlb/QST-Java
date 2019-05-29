package com.qst.po;

public class EmployeeTask {
      public Integer getEmptaskid() {
		return emptaskid;
	}
	public void setEmptaskid(Integer emptaskid) {
		this.emptaskid = emptaskid;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "EmployeeTask [emptaskid=" + emptaskid + ", empid=" + empid + ", taskid=" + taskid + ", emname=" + emname
				+ ", ststus=" + ststus + "]";
	}
	public Integer getTaskid() {
		return taskid;
	}
	public void setTaskid(Integer taskid) {
		this.taskid = taskid;
	}
	public String getEmname() {
		return emname;
	}
	public void setEmname(String emname) {
		this.emname = emname;
	}
	public Integer getStstus() {
		return ststus;
	}
	public void setStstus(Integer ststus) {
		this.ststus = ststus;
	}
	private Integer emptaskid;
      private Integer empid;
      private Integer taskid;
      private String  emname;
      private Integer ststus;
}  
