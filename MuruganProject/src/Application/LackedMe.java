package Application;
import fileOption.*;
import fileOption.Filemanagement;
import java.util.Scanner;

public class LackedMe {
	
	public static void main(String[] args) {
	    System.out.println("             LockedMe & C0        ");
	   		System.out.println( "         Name     : Murugan    "); 
            System.out.println("         Email Id : system.tnmsc@gmail.com       "); 
            System.out.println("                                                                            ");           
			
		Scanner in= new Scanner(System.in);
	
		boolean mainLoop=true;
		int choice;
while(true) {

//Display the Menu
	
System.out.println();
System.out.println("          Welcome to the File Management System                        ");
	
System.out.println("Available Choices :");
System.out.println(" 1 : Display names of all the current files in Directory (Ascending Order) ");
System.out.println(" 2 : Menu ");
System.out.println(" 3 : Exit ");


System.out.println();
System.out.println("Please Enter the Choice Number:");


//Get user Choice
 choice = in.nextInt();

//Display the title of the chosen Module
switch (choice)
{
case 1:
	Showfiles sf=new Showfiles();
	sf.Show();
	
	
	break;
	
case 2:
	Filemanagement fn=new Filemanagement();
	fn.Filemenu();
	
	
	break;

case 3:
	
	System.out.println("Exiting from the Program...");
	 System.exit(0);
	break;
default:
	 System.out.println("This is invalid Menu Choice! Please enter correct Choice Number");

break;

}
	}

}
	
}