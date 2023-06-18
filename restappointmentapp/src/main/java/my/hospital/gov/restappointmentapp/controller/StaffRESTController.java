package my.hospital.gov.restappointmentapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import my.hospital.gov.restappointmentapp.model.Staff;
import my.hospital.gov.restappointmentapp.repository.StaffRepository;

@RestController
@RequestMapping("/api/Staff")
public class StaffRESTController {
	
	@Autowired
	private StaffRepository staffRepository;
	
	
	/*@DeleteMapping("{staffID}")
	public ResponseEntity<HttpStatus> deleteStaff(@PathVariable String staffID)
	{
		staffRepository.deleteAll();
		return new ResponseEntity<>(HttpStatus.OK);
	}*/
	
	@GetMapping
	public List<Staff> getStaff()
	{
		return staffRepository.findAll(); 
	}
	
	

}
