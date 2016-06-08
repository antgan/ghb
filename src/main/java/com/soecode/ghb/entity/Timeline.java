package com.soecode.ghb.entity;

import java.util.Date;

/**
 * 时间轴
 * @author 甘海彬
 *
 */
public class Timeline {
	private String title;
	private String content;
	private int hasLink;
	private String link;
	private String linkText;
	private String color;
	private Date time;
	public Timeline() {
		// TODO Auto-generated constructor stub
	}
	
	public Timeline(String title, String content, int hasLink, String link, String linkText, String color, Date time) {
		this.title = title;
		this.content = content;
		this.hasLink = hasLink;
		this.link = link;
		this.linkText = linkText;
		this.color = color;
		this.time = time;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getHasLink() {
		return hasLink;
	}
	public void setHasLink(int hasLink) {
		this.hasLink = hasLink;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getLinkText() {
		return linkText;
	}
	public void setLinkText(String linkText) {
		this.linkText = linkText;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Timeline [title=" + title + ", content=" + content + ", hasLink=" + hasLink + ", link=" + link
				+ ", linkText=" + linkText + ", color=" + color + ", time=" + time + "]";
	}

	
	
	
	
}
