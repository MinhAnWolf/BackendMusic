package com.service.client.controller;


import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.client.BaseReponse.*;
import com.service.client.config.RestTemplateConfig;
import com.service.client.model.*;
import com.service.client.service.MusicService;
import com.service.client.constrant.*;

@RestController
@RequestMapping(value = ApiURL.MUSIC)
@CrossOrigin("*")
public class MusicController {
	
	@Autowired
	MusicService musicService;
	@Autowired
	RestTemplateConfig restTemplateConfig;
	
	@PostMapping(value = "/sendData")
	public ResponseEntity<BaseResponse> sendData(@RequestBody MpFile mpFile) throws IOException {
		return restTemplateConfig.restTemplate("http://localhost:8082/api/manager").postForEntity("/sendData", mpFile, BaseResponse.class);
	}
	
	@PostMapping(value = "/getList")
	public ResponseEntity<BaseResponse> getList(@RequestBody MpFile mpFile) {
		return new ResponseEntity<BaseResponse>(musicService.getList(mpFile),HttpStatus.OK);
	}
	
}
