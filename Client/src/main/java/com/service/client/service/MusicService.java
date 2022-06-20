package com.service.client.service;

import java.io.IOException;
import com.service.client.BaseReponse.BaseResponse;
import com.service.client.model.MpFile;

public interface MusicService {
		BaseResponse getMusic(MpFile mpFile) throws IOException;
		BaseResponse getList(MpFile mpFile);
}
