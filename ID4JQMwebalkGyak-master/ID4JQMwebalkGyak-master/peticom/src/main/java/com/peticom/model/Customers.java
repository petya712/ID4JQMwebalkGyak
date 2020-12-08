package com.peticom.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customers {


	@Id
	private int custid;
	private String custname;
	private int custidcard;
	private String custplaceb;
	private String custmother;
	private String custbirth;
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}

	public int getCustidcard() {
		return custidcard;
	}
	public void setCustidcard(int custidcard) {
		this.custidcard = custidcard;
	}

	public String getCustplaceb() {
		return custplaceb;
	}
	public void setCustplaceb(String custplaceb) {
		this.custplaceb = custplaceb;
	}

	public String getCustmother() {
		return custmother;
	}
	public void setCustmother(String custmother) {
		this.custmother = custmother;
	}

	public String getCustbirth() {
		return custbirth;
	}
	public void setCustbirth(String custbirth) {
		this.custbirth = custbirth;
	}

	@Override
	public String toString() {
		return "Customers: Customer id:" + custid + "--- Customer's name:" + custname + "--- Customer's ID card:"+ custidcard +
				"--- Customer's place of birth:" + custplaceb +"--- Customer's mother's name:" +custmother+ "--- Customer's date of birth:"+custbirth;
	}
	
	
	
}
