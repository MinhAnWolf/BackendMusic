package com.service.admin.model;

public class MpFileResponse extends MpFile {
	
	private byte[] dataByte;
	private byte[] imgByte;
	
	public MpFileResponse(int id, String nameFile, byte[] dataByte,byte[] imgByte) {
		super(id, nameFile);
		this.dataByte = dataByte;
		this.imgByte = imgByte;
	}
	
	public MpFileResponse() {}
	

	public byte[] getDataByte() {
		return dataByte;
	}

	public void setDataByte(byte[] dataByte) {
		this.dataByte = dataByte;
	}

	public byte[] getImgByte() {
		return imgByte;
	}

	public void setImgByte(byte[] imgByte) {
		this.imgByte = imgByte;
	}
	
	


	
}
