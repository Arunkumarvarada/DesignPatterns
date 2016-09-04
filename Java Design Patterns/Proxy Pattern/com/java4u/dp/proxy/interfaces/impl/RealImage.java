package com.java4u.dp.proxy.interfaces.impl;

import com.java4u.dp.proxy.interfaces.Image;

public class RealImage implements Image {
	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName=fileName;
		loadFromDisk(fileName);
	}

	private void loadFromDisk(String fileName2) {
		System.out.println("Loading ::"+ fileName2);
		
	}

	@Override
	public void display() {
		System.out.println("Dsiplaying ::"+ fileName);

	}

}
