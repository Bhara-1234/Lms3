package com.example.HIMS;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class NetworkHospitalsMapper implements RowMapper<NetworkHospitals>  {


	@Override
	public NetworkHospitals mapRow(ResultSet rs, int rowNum) throws SQLException {
		NetworkHospitals dd = new  NetworkHospitals();
		dd.setHosp_id(rs.getInt(1));
		dd.setHosp_title(rs.getString(2));
		dd.setHosp_location(rs.getString(3));
		dd.setHosp_address(rs.getString(4));
		dd.setHosp_contactphone(rs.getLong(5));
		dd.setHosp_pincode(rs.getInt(6));
		dd.setHosp_luudate(rs.getDate(7));
		dd.setHosp_luuser(rs.getInt(8));
		
		return dd;
		
	}
	
	

}
