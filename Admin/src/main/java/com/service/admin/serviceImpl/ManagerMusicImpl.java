package com.service.admin.serviceImpl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.service.admin.BaseResponse.BaseResponse;
import com.service.admin.model.MpFile;
import com.service.admin.model.MpFileRequest;
import com.service.admin.model.MpFileResponse;
import com.service.admin.service.ManagerMusic;
import com.service.admin.untils.FileUntilsp;
import com.service.admin.mapper.*;
import com.service.admin.contrant.*;

@Service
public class ManagerMusicImpl implements ManagerMusic {
	
	@Autowired
	ManagerMusicMapper managerMusicMapper;
	@Autowired
	FileUntilsp fileUntilsp;
	
	@Override
	public BaseResponse uploadFile(MultipartFile file,MultipartFile imgFile) throws IOException {
		String pathMp3 = UriContrant.MP3_URI + file.getOriginalFilename();
		String pathImgFile = UriContrant.IMG_URI + imgFile.getOriginalFilename();
		MpFile mpFile = new MpFile();
		mpFile.setNameFile(file.getOriginalFilename());
		mpFile.setTypeFile(file.getContentType());
		mpFile.setData(pathMp3);
		mpFile.setImgFile(pathImgFile);
		if(fileUntilsp.writeFile(file, pathMp3) == false) {
			return baseResponse("1","File Mp3 Invalid",null);
		}
		if(fileUntilsp.writeFile(imgFile, pathImgFile) == false) {
			return baseResponse("1","File Img Invalid",null);
		}
		if(managerMusicMapper.uploadFile(mpFile) == 1) {
		 return	baseResponse("0", "Sucsess", mpFile);
		}
		return baseResponse("1","Fail", mpFile);
	}

	@Override
	public BaseResponse getAll(MpFileRequest mpFileRequest) {
		List<MpFileRequest> list = managerMusicMapper.getAll(mpFileRequest);
		if(list != null) {
			return baseResponse("0","Sucess",list);
		}
		return baseResponse("0","Fail",list);
	}

	@Override
	public BaseResponse getMusic(MpFile mpFile) throws IOException {
		MpFile mpFileQuery = managerMusicMapper.getMusic(mpFile.getId());
		if(mpFileQuery != null) {
			mpFileQuery.setData(fileUntilsp.sendFile(mpFileQuery.getData()));
			mpFileQuery.setImgFile(fileUntilsp.sendFile(mpFileQuery.getImgFile()));
			return baseResponse("0", "Success", mpFileQuery);
		}		
		return baseResponse("1", "Fail", mpFileQuery);
	}
	
	public BaseResponse baseResponse(String err,String desc,Object data) {
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setErrCode(err);
		baseResponse.setDescCode(desc);
		baseResponse.setData(data);
		return baseResponse;
	}

}
