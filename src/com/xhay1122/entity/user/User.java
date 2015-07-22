package com.xhay1122.entity.user;

import java.io.Serializable;
import java.util.Date;

public class User  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	//属性字段
	private int userId;
	private String userName;
	private String userPassword;
	private Date userBirth;
	private String userAddress;
	private String userPhone;
	private int userStatus;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Date getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(Date userBirth) {
		this.userBirth = userBirth;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public int getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName
				+ ", userPassword=" + userPassword + ", userBirth=" + userBirth
				+ ", userAddress=" + userAddress + ", userPhone=" + userPhone
				+ ", userStatus=" + userStatus + "]";
	}
	
}
