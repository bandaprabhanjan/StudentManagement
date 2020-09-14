package com.practice.studentmanagement;

import java.util.List;

public class DetailBean {

	private Integer id;
	private List<String> parts;

	public DetailBean(Integer id, List<String> parts) {
		super();
		this.id = id;
		this.parts = parts;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<String> getParts() {
		return parts;
	}

	public void setParts(List<String> parts) {
		this.parts = parts;
	}

}
