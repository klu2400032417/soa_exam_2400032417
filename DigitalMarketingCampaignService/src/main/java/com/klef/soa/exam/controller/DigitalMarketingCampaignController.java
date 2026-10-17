package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.soa.exam.entity.DigitalMarketingCampaign;
import com.klef.soa.exam.service.DigitalMarketingCampaignService;

@RestController
@RequestMapping("/DigitalMarketingCampaign")
public class DigitalMarketingCampaignController {
	@Autowired
	private DigitalMarketingCampaignService service;
	
	 @GetMapping("/")
	    public String home()
	    {
	        return "CRUD Service is running ";
	    }
	 @GetMapping("/displayall")
		private List<DigitalMarketingCampaign> displayall(){
			return service.displayAll();
		}
	 @PostMapping("/add")
		private ResponseEntity<DigitalMarketingCampaign> addmember(DigitalMarketingCampaign d) {
		 DigitalMarketingCampaign dmc= service.addCampaign(d);
			return ResponseEntity.ok(dmc);
		}
	 @DeleteMapping("/delete/{id}")
		private ResponseEntity<String> deletebyid(@PathVariable Long id) {
			String mssg= service.deleteById(id);
			if(mssg!=null)
				return ResponseEntity.ok(mssg);
			else
				return ResponseEntity.status(404).body(mssg);
		}

}
