
import java.util.Scanner;
//or
//import java.util.*

class ConsoleInput
{
     public static void main(String args[]){
		//create a new scanner object + initialize it
                Scanner scanner = new Scanner(System.in);
		
                int eid,sid;
                String ename;
                System.out.println("Enter Employeeid:");
                eid=scanner.nextInt();
                scanner.nextLine(); 	//This is needed to pick up the new line
					//also called a "buffer flushing"
                System.out.println("Enter EmployeeName:");
                ename=scanner.nextLine();//no flushing needed

                System.out.println("Enter SupervisiorId:");
                sid=(scanner.nextInt());//we may flush once again
					// but there is no more reading in this program 
		scanner.nextLine();

		System.out.println("The Employee: "+ ename + " has the ID:"+ eid +" and is supervsed by ID:"+sid);
        }
}
