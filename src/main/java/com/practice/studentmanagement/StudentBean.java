package com.practice.studentmanagement;

public class StudentBean implements Comparable<StudentBean> {

	private String name;
	private Integer id;
	private Integer age;
	public StudentBean(String name, Integer id, Integer age) {
		super();
		this.name = name;
		this.id = id;
		this.setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "StudentBean [name=" + name + ", id=" + id + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentBean other = (StudentBean) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(StudentBean s1) {
	
		return this.getName().compareTo(s1.getName());
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	

	/*
	 * @Override public String toString() { return "StudentBean [name=" + name +
	 * ", id=" + id + "]"; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public int getId() { return id; }
	 * 
	 * public void setId(int id) { this.id = id; }
	 * 
	 * public StudentBean(String name, int id) { super(); this.name = name; this.id
	 * = id; }
	 * 
	 * @Override public int compareTo(StudentBean stdSort) { return
	 * this.getName().compareTo(stdSort.getName()); }
	 * 
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + id; result = prime * result + ((name == null) ? 0 :
	 * name.hashCode()); return result; }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; StudentBean other = (StudentBean) obj; if (id != other.id) return
	 * false; if (name == null) { if (other.name != null) return false; } else if
	 * (!name.equals(other.name)) return false; return true; }
	 */	
	

}
