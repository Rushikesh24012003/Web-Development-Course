package com.codixlabs.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codixlabs.di.model.Lead;
import com.codixlabs.di.service.LeadService;

@RestController
@RequestMapping(path="/leads")
public class LeadController {
	
	
	@Autowired
	LeadService leadService;
	
	@PostMapping(path="/save")
	public ResponseEntity<String> getLeads(@RequestBody Lead lead) {
		if(leadService.saveLead(lead)) {
			return new ResponseEntity<>("Lead saved",HttpStatus.OK);
		}else {
			return new ResponseEntity<>("Lead not saved",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	
	}	

}
