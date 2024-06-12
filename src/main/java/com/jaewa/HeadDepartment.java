package com.jaewa;

import java.util.ArrayList;
import java.util.List;

/*
 * 	Composite ha elementi foglie
 * 	Implementa i metodi dei componenti (Component) base 
 *	Defininsce le operazioni relative ai figli
 */

public class HeadDepartment implements Department {

	private Integer id;
	private String name;
	private List<Department> childDepartments;

	public HeadDepartment(Integer id, String name) {
		this.id = id;
		this.name = name;
		this.childDepartments = new ArrayList<>();
	}

	@Override
	public void printDepartmentName() {
		childDepartments.forEach(Department::printDepartmentName);
	}

	public void addDepartment(Department department) {
		childDepartments.add(department);
	}

	public void removeDepartment(Department department) {
		childDepartments.remove(department);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
