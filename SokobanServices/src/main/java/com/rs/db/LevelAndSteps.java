package com.rs.db;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Solutions")
public class LevelAndSteps {
	
	@Id
	@Column(name="LevelName")
	private String LevelName;
	@Column(name="Moves")
	private String Moves;
	//get and Set
	public String getLevelName() {
		return LevelName;
	}
	public void setLevelName(String levelName) {
		LevelName = levelName;
	}
	public String getMoves() {
		return Moves;
	}
	public void setMoves(String moves) {
		Moves = moves;
	}
	
	
	//constructors
	public LevelAndSteps(String levelName, String moves) {
		super();
		LevelName = levelName;
		Moves = moves;
	}
	public LevelAndSteps(){
		
	}
	public String getSolution() {
		return Moves;
	}
	public void setSolution(String solution) {
		this.Moves = solution;
	}
}
