package com.soecode.ghb.entity;

/**
 * 个人信息
 * @author 甘海彬
 *
 */
public class Myinfo {
	private String nickName;
	private String realName;
	private String school;
	private String grade;
	private String major;
	private String phone;
	private String email;
	private String introduce;
	private String slogan;
	private String qq;
	private String wechat;
	private String dream;
	private String imgUrl;
	
	public Myinfo() {
		// TODO Auto-generated constructor stub
	}
	
	public Myinfo(String nickName, String realName, String school, String grade, String major, String phone,
			String email, String introduce, String slogan, String qq, String wechat, String dream, String imgUrl) {
		this.nickName = nickName;
		this.realName = realName;
		this.school = school;
		this.grade = grade;
		this.major = major;
		this.phone = phone;
		this.email = email;
		this.introduce = introduce;
		this.slogan = slogan;
		this.qq = qq;
		this.wechat = wechat;
		this.dream = dream;
		this.imgUrl = imgUrl;
	}

	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getSlogan() {
		return slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getWechat() {
		return wechat;
	}
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	public String getDream() {
		return dream;
	}
	public void setDream(String dream) {
		this.dream = dream;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Override
	public String toString() {
		return "Myinfo [nickName=" + nickName + ", realName=" + realName + ", school=" + school + ", grade=" + grade
				+ ", major=" + major + ", phone=" + phone + ", email=" + email + ", introduce=" + introduce
				+ ", slogan=" + slogan + ", qq=" + qq + ", wechat=" + wechat + ", dream=" + dream + ", imgUrl=" + imgUrl
				+ "]";
	}
	
	
	
}
