package com.service.admin.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.service.admin.BaseResponse.BaseResponse;
import com.service.admin.contrant.*;
import com.service.admin.model.MpFile;
import com.service.admin.model.MpFileRequest;
import com.service.admin.service.ManagerMusic;

@RestController
@RequestMapping(value = ApiContrant.ADMIN_API)
@CrossOrigin("*")
public class HomeController {
	
	@Autowired
	ManagerMusic managerMusic;
	
	@PostMapping("/uploadFile")
	public ResponseEntity<BaseResponse> uploadFile(MultipartFile file,MultipartFile imgFile) throws IOException {		
		return new ResponseEntity<BaseResponse>(managerMusic.uploadFile(file,imgFile), HttpStatus.OK);
	}
	
	@PostMapping("/getAll")
	public ResponseEntity<BaseResponse> uploadFile(MpFileRequest mpFileRequest) throws IOException {		
		return new ResponseEntity<BaseResponse>(managerMusic.getAll(mpFileRequest), HttpStatus.OK);
	}
	
	@PostMapping("/sendData")
	public ResponseEntity<BaseResponse> sendData(@RequestBody MpFile mpFile) throws IOException {
		return new ResponseEntity<BaseResponse>(managerMusic.getMusic(mpFile), HttpStatus.OK);
	}
	
	@PostMapping("/getListImg")
	public ResponseEntity<BaseResponse> getListImg(@RequestBody MpFile mpFile) throws IOException {
		return new ResponseEntity<BaseResponse>(managerMusic.getMusic(mpFile), HttpStatus.OK);
	}
		
}
