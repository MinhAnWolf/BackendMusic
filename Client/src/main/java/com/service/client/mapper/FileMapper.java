package com.service.client.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.service.client.model.*;

@Repository
public interface FileMapper {
	int save(MpFile mpFile);
	MpFile getMusic(int id);
	List<MpFile> getList(MpFile mpFile);
	int countMusic();
}
