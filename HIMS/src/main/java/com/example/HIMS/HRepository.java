package com.example.HIMS;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class HRepository implements IRepository {
	@Autowired
	HimsDao hdao;

	@Override
	public List<NetworkHospitals> getHospitals() {
		List<NetworkHospitals> lis = hdao.getHospitals();
		return lis;
	}

}
