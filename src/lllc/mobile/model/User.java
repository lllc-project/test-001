package lllc.mobile.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "user")
public class User implements Serializable{

	private Long id;
	
	private Long gameId;
	
	private String name;
	
	private String password;
	
	private Date lastLoginTime;
	
	private BigInteger coins;
	
	private BigInteger energy;
	
	private BigInteger experience;
	
	private BigInteger stone;

	
	
	
	
	public BigInteger getDisplayLevel(){
		
		// level calculate by experience
		return null;
	}
	
	
}
