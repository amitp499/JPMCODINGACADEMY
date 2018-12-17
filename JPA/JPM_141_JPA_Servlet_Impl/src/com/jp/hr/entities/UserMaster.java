package com.jp.hr.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usermaster")
public class UserMaster {

	@Id
	@Column(name="USERID")
	private String userId;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="USERFULLNAME")
	private String userFullName;
	
	@Column(name="USERROLE")
	private String userRole;
		
		
		
		
		public UserMaster(String userId, String password, String userFullName, String userRole) {
			super();
			this.userId = userId;
			this.password = password;
			this.userFullName = userFullName;
			this.userRole = userRole;
		}
		
		
		public UserMaster() {
			super();
			// TODO Auto-generated constructor stub
		}


		@Override
		public String toString() {
			return "UserMaster [userId=" + userId + ", password=" + password + ", userFullName=" + userFullName
					+ ", userRole=" + userRole + "]";
		}
		
		public String getUserId() {
			return userId;
		}
		
		public void setUserId(String userId) {
			this.userId = userId;
		}
		
		public String getPassword() {
			return password;
		}
		
		public void setPassword(String password) {
			this.password = password;
		}
		
		public String getUserFullName() {
			return userFullName;
		}
		
		public void setUserFullName(String userFullName) {
			this.userFullName = userFullName;
		}
		
		public String getUserRole() {
			return userRole;
		}
		
		public void setUserRole(String userRole) {
			this.userRole = userRole;
		}
		
		
		
}
