package com.service.admin.model;

public class MpFile {
	private int id;
	private String nameFile;
	private String typeFile;
	private String data;
	private String imgFile;

	public MpFile(int id, String typeFile) {
		this.id = id;
		this.typeFile = typeFile;
	}
	
	public MpFile() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameFile() {
		return nameFile;
	}

	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}

	public String getTypeFile() {
		return typeFile;
	}

	public void setTypeFile(String typeFile) {
		this.typeFile = typeFile;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getImgFile() {
		return imgFile;
	}

	public void setImgFile(String imgFile) {
		this.imgFile = imgFile;
	}
}
