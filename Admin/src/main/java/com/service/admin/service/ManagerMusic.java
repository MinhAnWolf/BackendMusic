package com.service.admin.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.service.admin.BaseResponse.BaseResponse;
import com.service.admin.model.MpFile;
import com.service.admin.model.MpFileRequest;

public interface ManagerMusic {
		BaseResponse uploadFile(MultipartFile file,MultipartFile imgFile) throws IOException;
		BaseResponse getAll(MpFileRequest mpFileRequest);
		BaseResponse getMusic(MpFile mpFile) throws IOException;
}
