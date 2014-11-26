package com.yoyuapp.sqlbuilder;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="member")
public class Member {
	private int id;
	private String name;
	private String age;
	private Calendar registerTime;
	
	//... gets and sets here...
	
	
	/***** code follows could be generated by some code generator *****/
	
	//table
	public static SqlTable _TABLE = SqlTable.of("member");
	
	//each column
	public static SqlColumn _ALL 			= SqlColumn.of(_TABLE, "member.*");
	public static SqlColumn ID 				= SqlColumn.of(_TABLE, "id");
	public static SqlColumn NAME 			= SqlColumn.of(_TABLE, "name");
	public static SqlColumn AGE 			= SqlColumn.of(_TABLE, "age");
	public static SqlColumn REGISTER_TIME 	= SqlColumn.of(_TABLE, "registerTime");
	
	
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Calendar getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(Calendar registerTime) {
		this.registerTime = registerTime;
	}
	
	
	
}
