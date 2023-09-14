package com.example.HIMS;

import java.sql.Date;

//hosp_id serial primary key,
//hosp_title varchar(70),
//hosp_location varchar(50),
//hosp_address varchar(100),
//hosp_contactphone bigint,
//hosp_pincode int,
//hosp_luudate date,
//hosp_luuser  int

public class NetworkHospitals {
	int hosp_id,hosp_pincode,hosp_luuser;
	String hosp_title;
	String hosp_location,hosp_address;
	long hosp_contactphone;
	Date hosp_luudate;
	public NetworkHospitals() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NetworkHospitals(int hosp_id, int hosp_pincode, int hosp_luuser, String hosp_title, String hosp_location,
			String hosp_address, long hosp_contactphone, Date hosp_luudate) {
		super();
		this.hosp_id = hosp_id;
		this.hosp_pincode = hosp_pincode;
		this.hosp_luuser = hosp_luuser;
		this.hosp_title = hosp_title;
		this.hosp_location = hosp_location;
		this.hosp_address = hosp_address;
		this.hosp_contactphone = hosp_contactphone;
		this.hosp_luudate = hosp_luudate;
	}
	public int getHosp_id() {
		return hosp_id;
	}
	public void setHosp_id(int hosp_id) {
		this.hosp_id = hosp_id;
	}
	public int getHosp_pincode() {
		return hosp_pincode;
	}
	public void setHosp_pincode(int hosp_pincode) {
		this.hosp_pincode = hosp_pincode;
	}
	public int getHosp_luuser() {
		return hosp_luuser;
	}
	public void setHosp_luuser(int hosp_luuser) {
		this.hosp_luuser = hosp_luuser;
	}
	public String getHosp_title() {
		return hosp_title;
	}
	public void setHosp_title(String hosp_title) {
		this.hosp_title = hosp_title;
	}
	public String getHosp_location() {
		return hosp_location;
	}
	public void setHosp_location(String hosp_location) {
		this.hosp_location = hosp_location;
	}
	public String getHosp_address() {
		return hosp_address;
	}
	public void setHosp_address(String hosp_address) {
		this.hosp_address = hosp_address;
	}
	public long getHosp_contactphone() {
		return hosp_contactphone;
	}
	public void setHosp_contactphone(long hosp_contactphone) {
		this.hosp_contactphone = hosp_contactphone;
	}
	public Date getHosp_luudate() {
		return hosp_luudate;
	}
	public void setHosp_luudate(Date hosp_luudate) {
		this.hosp_luudate = hosp_luudate;
	}
	
	
	

}
