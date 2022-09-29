package com.lockedme;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

public class LockedMeApp {

// This Method is Used to Ask the User to Enter Root_Path
	
	String RootPath() {
		System.out.print("\nPlease enter direcotry path: ");
		Scanner sc = new Scanner(System.in);
		String Path = sc.nextLine();
		if(Pattern.matches("((\\/)+|(\\\\)+)", Path)) {
			System.out.println("\nPlease provide the absolute path.");
			RootPath();
		}
		else {
			if(new File(Path).exists() && new File(Path).isDirectory()) {
				setPath(Path);
				setIPath(Path);
			}else {
				System.out.println("\nInvalid directory path is provided.");
				RootPath();
			}
		}
		return Path;
		
	}	
private void setIPath(String Path) {
		
	}

private void setPath(String Path) {
		
	}


// This Method is Used to Display the File in Ascending Order
	
	public void DisplayFilesAsc(String DrivePath) {
		try {
			File f=new File(DrivePath);
			File files[]=f.listFiles();
			for(File FileDisplay:files) {
				if(FileDisplay.isFile()) {
					System.out.println(FileDisplay.getName());
				}
			}
		}
		catch(Exception E) {
			E.printStackTrace(); //This line to show Error Details
		}
	}
	
//This Method is Used to Add Files and Folders in Directory
	
	public void AddFiles(String FileName, String DrivePath) {
		try {
			File directory=new File(DrivePath);
			if(directory.isDirectory()) {
				File f=new File(DrivePath+"/"+FileName);
				if(!f.exists()) {
					f.createNewFile();
					System.out.println("Your File is Created Successful "+f.getName());
				}
				else {
					System.out.println("File is Already Exists"+f.getName());
				}
			}
		}
		catch(Exception E) {
			E.printStackTrace(); //This line to show Error Details
		}
	}
	
//This Method is Used to Delete Files and Folders in Directory
	
	public void RemoveFiles(String FileName, String DrivePath) {
		try {
			File directory=new File(DrivePath);
			if(directory.isDirectory()) {
				File f=new File(DrivePath+"/"+FileName);
				if(f.exists()) {
					f.delete();
					System.out.println("Your File is Deleted Successful "+f.getName());
				}
				else {
					System.out.println("Your File Name not Exist in this Directory "+f.getName());
				}
			}
		}
		catch(Exception E) {
			E.printStackTrace();  //This line to show Error Details
		}
	}
	
//This Method is Used to Search any particular Files and Folders from the Directory
	public void SearchFile(String FileName, String DrivePath) {
		boolean isFiles=false;
		try {
			File f=new File(DrivePath);
			File files[]=f.listFiles();
			for(File fileEntery:files) {
				if(fileEntery.isFile())
					if(fileEntery.getName().equals(FileName)) {
						isFiles=true;
					}
			}
			if(isFiles) {
				System.out.println("File is Existed "+FileName);
			}
			else {
				System.out.println("File not Existed "+FileName);
			}
		}
		catch(Exception E) {
			E.printStackTrace();  //This line to show Error Details
		}
	}
}
