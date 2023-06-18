package my.hospital.gov.restappointmentapp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import my.hospital.gov.restappointmentapp.model.Staff;
import org.springframework.ui.Model;

@Controller
public class StaffMenuController {

	/*@GetMapping("/staff/list")
	public ResponseEntity<String> getStaffs()
	{
		String uri = "http://localhost:8080/appointmentapp/api/Staff";
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Staff[]>response = restTemplate.getForEntity(uri,  Staff[].class);
		
		Staff staffs[] = response.getBody();
		
		for (Staff staff: staffs)
		{
			System.out.print(staff.getStaffID()+"-");
			System.out.print(staff.getStaffName()+"-");
			System.out.print(staff.getStaffICNumber()+"-");
			System.out.print(staff.getStaffPhoneNumber()+"-");
			System.out.print(staff.getStaffAge()+"-");
			System.out.print(staff.getStaffGender()+"-");
			System.out.println(staff.getStaffAddress());
		}
		
		String message = "Check out the message in the console";
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
	*/
	
	
	@GetMapping ("/staff/list")
	public String getStaff(Model model)
	{
		//The URI for GET staff
		String uri= "http://localhost:8080/appointmentapp/api/Staff";
		
		//Get a list of staff from the web service
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Staff[]>response = restTemplate.getForEntity(uri,Staff[].class);
		
		//Parse JSON data to array of object
		Staff staff[] = response.getBody();
		
		//Parse an array to a list object
		List<Staff>staffList = Arrays.asList(staff);
		
		//Attach list to model as attribute
		model.addAttribute("staff",staffList);
		
		return "staff";
	}
	
	


	
}

