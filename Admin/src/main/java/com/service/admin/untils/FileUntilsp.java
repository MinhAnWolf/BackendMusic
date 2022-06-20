package com.service.admin.untils;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUntilsp {
	
	public boolean writeFile(MultipartFile file,String path) throws IOException {
		if(file != null) {
			FileOutputStream fos = new FileOutputStream(path);
			DataOutputStream dos = new DataOutputStream(fos);
			dos.write(file.getBytes());
			return true;
		}
		return false;
	}
	
	public String sendFile(String path) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(path);
		DataInputStream dataInputStream = new DataInputStream(fileInputStream);
		byte[] data = dataInputStream.readAllBytes();
		String endcodeString = Base64.getEncoder().encodeToString(data);
		return endcodeString;
	}
	
}
