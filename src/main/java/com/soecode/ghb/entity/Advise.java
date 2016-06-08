package com.soecode.ghb.entity;

/**
 * 建议
 * @author 甘海彬
 *
 */

public class Advise {

	private int id;
	private String advise;
	private String name;
	private String email;
	private String visit_ip;
	
	public Advise(String advise, String name, String email, String visit_ip) {
		this.advise = advise;
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
	public String getAdvise() {
		return advise;
	}
	public void setAdvise(String advise) {
		this.advise = advise;
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
		return "Advise [id=" + id + ", advise=" + advise + ", name=" + name + ", email=" + email + ", visit_ip="
				+ visit_ip + "]";
	}
	

	
	
	
	
}
