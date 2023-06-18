package my.hospital.gov.restappointmentapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Monitor")
public class MonitoringRESTController {
	
	public String getStaff() {
		return "hye";
	}
}
