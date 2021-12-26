package fileOption;
import java.util.Scanner;

public class Filemanagement {
	
public static int Filemenu(){
		
		// TODO Auto-generated method stub
Scanner in= new Scanner(System.in);
System.out.println("              LockedMe & Co          " );
System.out.println("              FILE OPTION MENU    ");
System.out.println("Your Menu Option are as follows:");

System.out.println("1. Creating_New_files");
System.out.println("2. write_in_file");
System.out.println("3. Read_file");
System.out.println("4. FileInformation(Search File)");
System.out.println("5. Delete_file");
System.out.println("6. Exit(back to main Menu)");
System.out.println(" ");
System.out.println("please Enter Valid option ");


System.out.println();

//Get user's choice
int choice=in.nextInt();


//Display the Title of the Chosen module

switch(choice) {
case 1:
	System.out.println(" Creating file:");
	Creatingfiles  cf= new Creatingfiles ();
	cf.create();

	break;
case 2:
	System.out.println(" write a file:");
	Writefile wf= new Writefile ();
	wf.write();
break;

case 3:
	
	System.out.println(" read a file:");
Readfile re= new  Readfile();
re.Read();
break;

case 4:
	System.out.println(" File Information:");
	 Fileinformation fi= new  Fileinformation ();
	fi.fileinfo();
	break; 
	
case 5:
	System.out.println(" Delete a File:");
	Deletefile df= new Deletefile();
	df.Delete();
	break;
	
case 6:

	Filemenu();
	break;
	
	default:
		System.out.println("Invalid choice");
		
}

return choice;
}
}