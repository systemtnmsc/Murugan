package fileOption;
import java.io.File;
import java.util.Scanner;


	public class Readfile {

	  
	public static void Read() {
		
	 {

	        try {
	            System.out.print("Enter the file name with (extension): ");
	            

	            Scanner input = new Scanner(System.in);

	          //  File file = new File(input.nextLine());
	            File file = new File(input.nextLine());
	            
//
	            input = new Scanner(file);
	            

	            while (input.hasNextLine()) {
	                String line = input.nextLine();
	                System.out.println();
	                //System.out.println("******************************************************************");
	                System.out.println();
	                System.out.println(line);
	            }
	            input.close();

	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	  
	}    


}}
