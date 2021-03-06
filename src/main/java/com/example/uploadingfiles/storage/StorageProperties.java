package com.example.uploadingfiles.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
public class StorageProperties {

	/**
	 * Folder location for storing files
	 */

	//linux中，war方式运行时，非tmp目录可能报错
	//Window中，jar方式运行时，可能会把所在盘符作为根目录，F:\tmp\spring\ upload
	private String location = "/tmp/spring/upload";

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
