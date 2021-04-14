package com.ibm.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.mysql.cj.x.protobuf.MysqlxCursor.Fetch;

@Entity
@Table(name = "dept")
public class Department {
	@Id
	private int deptId;
	@Column(length = 15)
	private String deptName;
	
	@OneToMany(mappedBy = "dept", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
	private List<Employee> emps;

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int depId) {
		this.deptId = depId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
}
