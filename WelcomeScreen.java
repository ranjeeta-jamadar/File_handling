package file_handling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WelcomeScreen {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filename;
		
		char ch;
		
		File directory =new File("C:\\Users\\acer\\OneDrive\\Desktop\\simplilearn_F1");
		
		String[] flist= directory.list();  
		
		//take user option from  the below mentioned menu
		Scanner input=new Scanner(System.in);
		System.out.println("*************************************");
		System.out.println("*********Simplilearn Assignment 1************");
		System.out.println("*********************************************");
		System.out.println("****************Ranjeeta*********************");
		
		System.out.println("*****************************************");
		System.out.println("*********Full Stack Developer************");
		System.out.println();
		
	     do {
	    	  
	    	 System.out.println("select File option to perform any operation:- \n");
	    	 System.out.println("1.File Creation");
	    	 System.out.println("2.File List");
	    	 System.out.println("3.File Delete");
	    	 System.out.println("4.Search File");
	    	 System.out.println("5.Exit");
	    	 
	    	 
			 int choice = input.nextInt();
					 
	    	  
	    	 switch(choice) {
	    	 
	    	 case 1:
	    		 
	    		 System.out.println("Enter the File name for creating new File");
	    		 filename=input.next();
	    		 
	    		try {
	    			 File file=new File("C:\\Users\\acer\\OneDrive\\Desktop\\simplilearn_F1\\"+filename+".txt");
	    			 
	    			 if(file.createNewFile()) {
	    				 
	    				 System.out.println("File created Successfully");
	    		}else {
	    				 if(file.exists()) {
	    					 System.out.println("File already exists");
	    		}else {
	    					 System.out.println("File doesnot exist");
	    		}
	    				 
	    				 //delete the file code below
	    			 }
	    		 }
	    		 catch(IOException e) {
	    			 
	    			 e.printStackTrace();
	    			 
	    		 }
	    	 
	    	 
	    	     break;
	    	     
	    	 case 2:
	    		 listofFiles();
	    		 break;
	    		 
	    		 
//    		 //private static void listofFiles()
//	    		 {
//	    			 System.out.println("\n List of files and Folder \n");
//	    			 File folder=new File("C:\\Users\\acer\\OneDrive\\Desktop\\simplilearn_F1\\");
//	    			 File[] listofFiles= folder.listFiles();
//	    			 for(File file : listofFiles) {
//	    				 if(file.isDirectory()) {
//	    					 
//	    					 System.out.println(file.getName());
//	    				 }else if(file.isFile()) {
//	    					 System.out.println(file.getName());
//	    				 }
//	    				 
//	    				 }
//	    			 break;
	    			 
	    		case 3: 
	    			
	    			System.out.println("Enter the File  name which you want to delete");
	    			
	    			filename =input.next();
	    			
	    			File directory_delete =new File("C:\\Users\\acer\\OneDrive\\Desktop\\simplilearn_F1");
	    			
	    			String[] flist_delete = directory_delete.list();
	    			
	    			//String[] flist = directory.list();
	    			
	    			int flag_d = 0;
	    			
	    			if(flist_delete == null) {
	    				System.out.println("There is no file present in the directory");
	    			}else {
	    				
	    				
	    				//Linear search in the array
	    				for (int i = 0;i < flist_delete.length; i++) {
	    					String delete_filename = flist_delete[i];
	    					if(delete_filename.equalsIgnoreCase(filename)) {
	    						
	    					
	    						File file =new File(
	    								"C:\\Users\\acer\\OneDrive\\Desktop\\simplilearn_F1\\" + delete_filename);
	    						if(file.delete()) {
	    							System.out.println("File deleted successfully");
	    						}else{
	    							System.out.println("Failed to delete the file");
	    						}
	    						flag_d = 1;
	    						}
	    					} 
	    				}
	    			if(flag_d == 0) {
	    				System.out.println("File not found");
	    			}
	    				
	    			break;
	    			
	    			
	    		case 4:
	    			// create an object of the File class
	    			// Replace the file path of the directory
	    			
	    			
	    			System.out.println("Enter the file name for searching");
	    			
	    			filename = input.next();
	    			File directory_search =new File("C:\\Users\\acer\\OneDrive\\Desktop\\simplilearn_F1\\");
	
	
	    	       String[] flist_search = directory_search.list();
	    			
	    			//String[] flist = directory.list();
	    			
	    			int flag_s = 0;
	    			
	    			if(flist_search == null) {
	    				System.out.println("there is no file present in the directory");
	    			}else {
	    				
	    				
	    				//Linear search in the array
	    				for (int i=0;i<flist_search.length; i++) {
	    					String search_filename = flist_search[i];
	    					if(search_filename.equalsIgnoreCase(filename)) {
	    						System.out.println(search_filename + "found");
	    						flag_s = 1;
	    					}
	    					}
	    			}
	    			if(flag_s == 0) {
	    				System.out.println("File not found");
	    			}
	    			break;
	    			
	    		case 5:
	    			
	    			System.out.println("Thank you user");
	    			break;
	    			
	    			default:
	    				
	    				System.out.println("Your input number is incorrect.Choose correct Number");
	    				break;
	    				
	    	 }
	    	 System.out.println("Do you want to continue Type (y or n) \n");
	    	 ch = input.next().charAt(0);
	    	 
	     }while (ch == 'Y'||ch== 'y');
	
	}
	
	 
	 private static void listofFiles()
	 {
		 System.out.println("\n List of files and Folder \n");
		 File folder=new File("C:\\Users\\acer\\OneDrive\\Desktop\\simplilearn_F1\\");
		 File[] listofFiles= folder.listFiles();
		 for(File file : listofFiles) {
			 if(file.isDirectory()) {
				 
				 System.out.println(file.getName());
			 }else if(file.isFile()) {
				 System.out.println(file.getName());
			 }
			 
			 }
	 }

}







	    					
	    			
	    			
	    			
	    			
	    	 
	    	 
	    		 
	    	     
	    	  
	    	 
	     
	     
	
	
	

	


