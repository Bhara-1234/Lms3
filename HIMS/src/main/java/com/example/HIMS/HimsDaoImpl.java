package com.example.HIMS;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class HimsDaoImpl implements HimsDao {
	
	JdbcTemplate jdbcTemplate;
	
	private String SQL_GET_HOSPITALS = "select * from  ims_networkhospitals";
	
	
	
	
	@Autowired
	public HimsDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	

	@Override
	public List<NetworkHospitals> getHospitals() {
		
		return  jdbcTemplate.query(SQL_GET_HOSPITALS, new NetworkHospitalsMapper());
	}

}
