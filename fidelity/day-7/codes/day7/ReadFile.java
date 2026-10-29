package com.fidelity.java.day7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		InputStream fin = new FileInputStream("src/com/fidelity/java/day7/java.txt");
		
		/*
		System.out.println("no of bytes to be read = " + fin.available());
		System.out.println(fin.read());
		System.out.println(fin.read());
		System.out.println((char)fin.read());
		System.out.println("no of bytes to be read = " + fin.available());
		*/
		
		/*
		//read file contents byte-by-byte [char-by-character]
		int n = fin.read();
		while(n != -1) {
			System.out.print((char)n);
			Thread.sleep(150); //150 ms
			n = fin.read();
		}
		*/
		
		/*
		//read file contents fully
		byte[] bytes = new byte[fin.available()]; //create a byte array with no of bytes to be read
		fin.read(bytes);
		String str = new String(bytes);
		System.out.println(str);
		*/
		
		//read file contents line-by-line
		Reader fileReader = new InputStreamReader(fin); //to convert byte stream to character stream
		try(BufferedReader br = new BufferedReader(fileReader)) {
			String lineData = br.readLine();
			while(lineData != null) {
				System.out.println(lineData);
				lineData = br.readLine();
				Thread.sleep(2000);
			}
		}
		
		
		fin.close();
	}

}
