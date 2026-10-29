package com.fidelity.java.day7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class NIOTest1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		List<String> dataLines = List.of(
					"This is line-1",
					"This is line-2",
					"This is line-3",
					"This is line-4"
				);		
		
		//Path path = Paths.get("src/com/fidelity/java/day7/taskList.txt");
		Path path = Path.of("src/com/fidelity/java/day7/taskList.txt");
		
		Files.write(path, dataLines, StandardOpenOption.CREATE);
		System.out.println("file created and saved!!");
		System.out.println("-".repeat(80));
		
		//-- reading file contents
		List<String> readLines = Files.readAllLines(path);
		for(String line : readLines) {
			System.out.println(line);
			Thread.sleep(2000);
		}
		
	}

}
