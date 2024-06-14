package com.codixlabs.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codixlabs.di.dao.LeadRepositiory;
import com.codixlabs.di.model.Lead;

@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	LeadRepositiory leadRepositiory;

	@Override
	public boolean saveLead(Lead lead) {
		try {
			Lead savedlead=leadRepositiory.save(lead);
			if(savedlead!=null) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			
		}
		
		return false;
	}

}
