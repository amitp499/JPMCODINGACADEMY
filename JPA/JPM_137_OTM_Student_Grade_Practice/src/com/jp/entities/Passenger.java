package com.jp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Passender")
public class Passenger {
	
	@Id
	@Column(name="passanger_id")
	private Long passangerId;
	
	@Column(name="passanger_name")
	private String passangerName;
	
	
	@ManyToOne
	@JoinColumn(name="Bus_Id")
	Bus bus;


	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getPassangerId() {
		return passangerId;
	}


	public void setPassangerId(Long passangerId) {
		this.passangerId = passangerId;
	}


	public String getPassangerName() {
		return passangerName;
	}


	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}


	public Bus getBus() {
		return bus;
	}


	public void setBus(Bus bus) {
		this.bus = bus;
	}


	@Override
	public String toString() {
		return "Passenger [passangerId=" + passangerId + ", passangerName=" + passangerName + ", bus=" + bus + "]";
	}

}
