package com.lockedme;
import java.io.File;
import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		int n,n1;
		String FileName;
		LockedMeApp lma=new LockedMeApp();
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to The LockedMe Application");
		System.out.println("Devloper Information");
		System.out.println("Name :- Sharjil Anwar"+"\n"+"About :- Core Java Devloper");
		final String Root_Path=lma.RootPath();
		
		do
		{
			
//This block is used to Display First Part of Application Like:- Display Files,Edit,Exit
			
			System.out.println("1. List Files Ascending Order.");
			System.out.println("2. Edit.");
			System.out.println("3. Exit.");
			System.out.println("Enter your Choice.");
			n=sc.nextInt();
			switch(n) {
			
//This Case is Used to Display All Files and Folders
			
			case 1:
				lma.DisplayFilesAsc(Root_Path);  //This line call to DisplayFilesAsc Method from the LockedMeApp Class
				break;
				
//This Case is used to Display 2nd Part of Application Like:- Display Files, Add Files, Delete Files and Search
				
			case 2:
				do {
				System.out.println("1. List Files. ");
				System.out.println("2. Add File in the Directory.");
				System.out.println("3. Delete The File From The Directory.");
				System.out.println("4. Search The File From The Directory.");
				System.out.println("5. Go To the Main Menu");
				System.out.println("Enter Your Choice.");
				n1=sc.nextInt();
				switch(n1) 
				{
				
//This Case is used to Display All Files and Folders in Directory
				
				case 1:
					System.out.println("Files Present in this Directory");
					lma.DisplayFilesAsc(Root_Path);
					break;
					
//This Case is used to Add Files and Folders in Directory	
					
				case 2:
					System.out.println("Enter the file Name to add");
					sc.nextLine();
					FileName=readFileName(sc);
					lma.AddFiles(FileName, Root_Path);  //This line call to AddFiles Method from the LockedMeApp Class
					break;
					
//This Case is Used to Delete the File and Folder from the Directory
					
				case 3:
					System.out.println("Enter the file Name to Delete or Remove");
					sc.nextLine();
					FileName=readFileName(sc);
					lma.RemoveFiles(FileName, Root_Path);  //This line call to RemoveFiles Method from the LockedMeApp Class
					break;
					
//This Case is Used to Search any Files and Folders from Directory
					
				case 4:
					System.out.println("Enter the File Name you Search.");
					sc.nextLine();
					FileName=readFileName(sc);
					lma.SearchFile(FileName, Root_Path);  //This line call to SearchFile Method from the LockedMeApp Class
				    break;
				}
				
				}while(n1<=4);
				
// This line of code is use to Go To the Main Menu	
				
				System.out.println("Back to the Main Menu");
				break;
			}
		}while(n<3);
		
// This line of code is use to Display Application is Close Successfully
		
		System.out.println("Your Application is Close Successfully");
	}

	
	
// This method is use to Read File Name
	
private static String readFileName(Scanner sc) {
		String FileName=sc.nextLine();
		return FileName;
	}
}
