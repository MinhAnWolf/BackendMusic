package com.service.client.config;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

@Service
public class RestTemplateConfig {

	public RestTemplate restTemplate(String pathUrl) {
		RestTemplate restTemplate = new RestTemplate();
		DefaultUriBuilderFactory url  = new DefaultUriBuilderFactory(pathUrl);
		restTemplate.setUriTemplateHandler(url);
		return restTemplate;
	}
}
