package com.example.model;

public class Rank {
	private int id;
	private String name;
	private String src;
	private String shengfu;
	private String jifen;
	private String paiming;
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
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getShengfu() {
		return shengfu;
	}
	public void setShengfu(String shengfu) {
		this.shengfu = shengfu;
	}
	public String getJifen() {
		return jifen;
	}
	public void setJifen(String jifen) {
		this.jifen = jifen;
	}
	public String getPaiming() {
		return paiming;
	}
	public void setPaiming(String paiming) {
		this.paiming = paiming;
	}
	public Rank(int id, String name, String src, String shengfu, String jifen, String paiming) {
		super();
		this.id = id;
		this.name = name;
		this.src = src;
		this.shengfu = shengfu;
		this.jifen = jifen;
		this.paiming = paiming;
	}
	public Rank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
