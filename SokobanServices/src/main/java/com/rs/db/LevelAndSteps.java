package com.rs.db;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
/**
 * the class that represent the solutions table
 * @author Sapir Markel and Roee Sisso
 *
 */
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
	
	
	/**
	 * the level as string rowsNum,colNum,@#Ao and the moves that solve him as a string ludr
	 * @param levelName
	 * @param moves
	 */
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
