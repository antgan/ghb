package com.soecode.ghb.entity;

/**
 * 简历主体
 * @author 甘海彬
 *
 */
public class Resume {
	private String title;
	private String description;
	private String during;
	private String duringColor;
	private String subtitle;
	private int weight;
	
	public Resume() {
		// TODO Auto-generated constructor stub
	}
	
	public Resume(String title, String description, String during, String duringColor, String subtitle,
			int weight) {
		super();
		this.title = title;
		this.description = description;
		this.during = during;
		this.duringColor = duringColor;
		this.subtitle = subtitle;
		this.weight = weight;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDuring() {
		return during;
	}
	public void setDuring(String during) {
		this.during = during;
	}
	public String getDuringColor() {
		return duringColor;
	}
	public void setDuringColor(String duringColor) {
		this.duringColor = duringColor;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "ResumeEntity [title=" + title + ", description=" + description + ", during=" + during + ", duringColor="
				+ duringColor + ", subtitle=" + subtitle + ", weight=" + weight + "]";
	}
	
	
}
