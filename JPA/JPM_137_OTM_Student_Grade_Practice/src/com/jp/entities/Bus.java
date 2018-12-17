package com.jp.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="BUS")
public class Bus {
	
	@Id
	@Column(name="bus_id")
	private Long busId;
	
	@Column(name="bus_route")
	private String busRoute;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="bus")
	private Set<Passenger> passengers;

	public Long getBusId() {
		return busId;
	}

	public void setBusId(Long busId) {
		this.busId = busId;
	}

	public String getBusRoute() {
		return busRoute;
	}

	public void setBusRoute(String busRoute) {
		this.busRoute = busRoute;
	}

	public Set<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(Set<Passenger> passengers) {
		this.passengers = passengers;
	}

	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busRoute=" + busRoute + ", passengers=" + passengers + "]";
	}

	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
