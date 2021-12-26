package fileOption;
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Showfiles {


  public void Show() {
				     
	        
	            Scanner scanner = new Scanner( System.in );
	            System.out.println("Enter the file path: ");
	            String dirPath = scanner.nextLine(); // Takes the directory path as the user input
	            File folder = new File(dirPath);
	            if(folder.isDirectory())
	            {
	                File[] fileList = folder.listFiles();
	               
	                //Arrays.sort(fileList);
	                System.out.println("All files  present in this directory:- "  );
	                System.out.println();


	               FilenameFilter textfile=new FilenameFilter() {
				
					
						
						public boolean accept(File dirPath,String name) {
							String lowercaseName = name.toLowerCase();
				            if (lowercaseName.endsWith(".txt")) {
				               return true;
				            } else {
				               return false;
				            }
				            
						}   

	                };
	                fileList = folder.listFiles(textfile);
				
	             // Sort files by name
	                Arrays.sort(fileList, new Comparator()
	                {
	                    @Override
	                    public int compare(Object f1, Object f2) {
	                        return ((File) f1).getName().compareTo(((File) f2).getName());
	                    }
	                });

	               
	                for(File file:fileList)
	                {
	                    System.out.println(" "+file.getName());
	                    //System.out.println("*****************************************************************");  
	                    
	            }  
	               
	            };
	        }}