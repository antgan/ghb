package com.soecode.ghb.entity;


public class Focus {
	private int id;
	private String name;
	private String email;
	private String visit_ip;
	
	public Focus() {
		// TODO Auto-generated constructor stub
	}
	
	public Focus(String name, String email, String visit_ip) {
		this.name = name;
		this.email = email;
		this.visit_ip = visit_ip;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getVisit_ip() {
		return visit_ip;
	}

	public void setVisit_ip(String visit_ip) {
		this.visit_ip = visit_ip;
	}

	@Override
	public String toString() {
		return "Focus [id=" + id + ", name=" + name + ", email=" + email + ", visit_ip=" + visit_ip + "]";
	}
	
	
	

}
