package com.fidelity.java.day7;

import java.io.File;
import java.util.Date;

public class FileTest1 {

	public static void main(String[] args) {
		File file = new File("src/Welcome.java");
		
		System.out.println("is file exists = " + file.exists());
		if(file.exists()) {
			System.out.println("is directory = " + file.isDirectory());
			System.out.println("is file = " + file.isFile());
			
			System.out.println("file name = " + file.getName());
			System.out.println("file parent = " + file.getParent());
			System.out.println("file path = " + file.getPath());
			
			System.out.println("is it an absolute path = " + file.isAbsolute());
			System.out.println("absolute path = " + file.getAbsolutePath());
			
			System.out.println("can write = " + file.canWrite());
			System.out.println("can read = " + file.canRead());
			System.out.println("is hidden file = " + file.isHidden());
			System.out.println("is an executable file = " + file.canExecute());
			System.out.println();
			
			System.out.println("file size = " + file.length() + " bytes");
			long time = file.lastModified();
			/*
			LocalDateTime ldtModified = LocalDateTime.ofInstant(
		            Instant.ofEpochMilli(time), 
		            ZoneId.systemDefault()
		        );
		    */
			Date ldtModified = new Date(time);
			System.out.println("file last modified on = " + ldtModified);
		}
	}
}
