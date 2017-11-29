package com.mkyong.rest;

import javax.ws.rs.FormParam;

import org.jboss.resteasy.annotations.providers.multipart.PartType;

public class FileUploadForm {

	public FileUploadForm() {
	}
	
	private byte[] data;

	public byte[] getData() {
		System.out.println("getData");
		return data;
	}

	
	public void setData(byte[] data) {
		System.out.println("setData");
		this.data = data;
	}

	
}