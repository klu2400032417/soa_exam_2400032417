package com.klef.soa.exam.service;

import java.util.List;

import com.klef.soa.exam.entity.DigitalMarketingCampaign;

public interface DigitalMarketingCampaignService {
	DigitalMarketingCampaign addCampaign(DigitalMarketingCampaign d);
	List<DigitalMarketingCampaign> displayAll();
	String deleteById(Long id);
	
	
	

}
