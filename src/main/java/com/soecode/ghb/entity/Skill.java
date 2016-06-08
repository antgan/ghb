package com.soecode.ghb.entity;

/**
 * 我的技能
 * @author 甘海彬
 *
 */
public class Skill {
	private String skillName;
	private String subtitle;
	private double percent;
	private String color;
	
	public Skill() {
		// TODO Auto-generated constructor stub
	}
	
	public Skill(String skillName, String subtitle, double percent, String color) {
		super();
		this.skillName = skillName;
		this.subtitle = subtitle;
		this.percent = percent;
		this.color = color;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "SkillEntity [skillName=" + skillName + ", subtitle=" + subtitle + ", percent=" + percent + ", color="
				+ color + "]";
	}
	
	
	
}
