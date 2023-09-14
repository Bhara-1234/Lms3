package com.example.HIMS;
import java.util.ArrayList;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HimsController {

	@Autowired
	IRepository irip;
	
	@GetMapping(value="/networkhospitals")
	public ArrayList<NetworkHospitals> getHospitals(){
		ArrayList<NetworkHospitals> li = (ArrayList<NetworkHospitals>) irip.getHospitals();
		return li;
		
	}
}
