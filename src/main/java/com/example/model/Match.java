package com.example.model;

public class Match {
	private int id;
	private String name;
	private String src;
	private int session;
	private int victory;
	private int loss;
	private int scroe;
	private int rank;
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
	public int getSession() {
		return session;
	}
	public void setSession(int session) {
		this.session = session;
	}
	public int getVictory() {
		return victory;
	}
	public void setVictory(int victory) {
		this.victory = victory;
	}
	public int getLoss() {
		return loss;
	}
	public void setLoss(int loss) {
		this.loss = loss;
	}
	public int getScroe() {
		return scroe;
	}
	public void setScroe(int scroe) {
		this.scroe = scroe;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public Match() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Match(int id, String name, String src, int session, int victory, int loss, int scroe, int rank) {
		super();
		this.id = id;
		this.name = name;
		this.src = src;
		this.session = session;
		this.victory = victory;
		this.loss = loss;
		this.scroe = scroe;
		this.rank = rank;
	}
	
	
}
