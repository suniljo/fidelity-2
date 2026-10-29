package com.fidelity.java.day7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileTest2 {

	public static void main(String[] args) throws Exception{
		// 1. Create a Path object
        Path path = Paths.get("src/Welcome.java");

        // 2. Extract basic path details (even if the file doesn't exist physically)
        System.out.println("--- Path Information ---");
        System.out.println("File Name: " + path.getFileName());
        System.out.println("Parent Directory: " + path.getParent());
        System.out.println("Absolute Path: " + path.toAbsolutePath());
        System.out.println("Root: " + path.getRoot());
        System.out.println("Name Count (Elements in path): " + path.getNameCount());

        // 3. Extract physical file attributes (requires the file to exist)
        System.out.println("\n--- File Attributes & Status ---");
        if (Files.exists(path)) {
            System.out.println("Is Regular File: " + Files.isRegularFile(path));
            System.out.println("Is Directory: " + Files.isDirectory(path));
            System.out.println("Is Readable: " + Files.isReadable(path));
            System.out.println("Is Writable: " + Files.isWritable(path));
            System.out.println("Is Hidden: " + Files.isHidden(path));

            try {
                // Get file size
                System.out.println("File Size: " + Files.size(path) + " bytes");

                // Bulk read basic attributes (Creation time, Last Modified time, etc.)
                BasicFileAttributes attrs = Files.readAttributes(path, BasicFileAttributes.class);
                System.out.println("Creation Time: " + attrs.creationTime());
                System.out.println("Last Modified Time: " + attrs.lastModifiedTime());
                System.out.println("Last Access Time: " + attrs.lastAccessTime());
                
            } catch (IOException e) {
                System.err.println("Error reading file attributes: " + e.getMessage());
            }
        } else {
            System.out.println("The specified file does not exist on the disk.");
        }
    }
}
