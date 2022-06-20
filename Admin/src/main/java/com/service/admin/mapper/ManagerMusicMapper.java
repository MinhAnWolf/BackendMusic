package com.service.admin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.service.admin.model.MpFile;
import com.service.admin.model.MpFileRequest;

@Repository
public interface ManagerMusicMapper {
		int uploadFile(MpFile mpFile);
		List<MpFileRequest> getAll(MpFileRequest mpFileRequest);
		MpFile getMusic(int id);
//		List<MpFile> get
}
