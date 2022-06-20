package com.service.client.serviceImpl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.client.BaseReponse.BaseListResponse;
import com.service.client.BaseReponse.BaseResponse;
import com.service.client.mapper.FileMapper;
import com.service.client.model.MpFile;
import com.service.client.service.MusicService;
import com.service.client.untils.FileUntilsp;

import net.bytebuddy.asm.Advice.Return;

@Service
public class MusicServiceImpl implements MusicService{
	
	@Autowired
	FileMapper fileMapper;
	
	@Autowired
	FileUntilsp fileUntilsp;

	@Override
	public BaseResponse getMusic(MpFile mpFile) throws IOException {
		return null;
	}

	@Override
	public BaseResponse getList(MpFile mpFile) {	
			List<MpFile> list = fileMapper.getList(mpFile);
			int total = fileMapper.countMusic();
			if(list != null && total > 0) {
			 BaseResponse baseResponse = new BaseListResponse("0","Sucsess",list,total,mpFile.getLimit());
			 return baseResponse;	
			}
			 BaseResponse baseResponse = new BaseResponse();
			 baseResponse.setDescCode("0");
			 baseResponse.setDescCode("Fail");
			return baseResponse;
	}
	
	public BaseResponse baseResponse (String errCode,String descCode,Object data) {
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setErrCode(errCode);
		baseResponse.setDescCode(descCode);
		baseResponse.setData(data);
		return baseResponse;
	}

}
