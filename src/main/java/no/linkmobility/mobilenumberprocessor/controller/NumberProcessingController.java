package no.linkmobility.mobilenumberprocessor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import no.linkmobility.mobilenumberprocessor.dto.Request;
import no.linkmobility.mobilenumberprocessor.dto.Response;
import no.linkmobility.mobilenumberprocessor.service.NumberProcessingService;

@RestController
@RequestMapping("/mobilenumber")
public class NumberProcessingController {
	
	@Autowired
	private NumberProcessingService numberProcessingService;

	@PostMapping("/format")
	public ResponseEntity<Response> formatMobileNumber(@RequestBody Request request){
		
		Response response = numberProcessingService.formatMobileNumber(request); 
		return new ResponseEntity<Response>(response, HttpStatus.OK);
		
	}
}
