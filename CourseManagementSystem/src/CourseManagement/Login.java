package CourseManagement;
import java.util.Scanner;
import static CourseManagement.Main.*;
public class Login {
	public static void loginAccess() {
	String user;
	String password;
	int attempt=3;
	while(attempt!=0)
	{
		System.out.println("Enter User Name:");
		Scanner sc= new Scanner(System.in);
		 user=sc.nextLine();
		System.out.println("Enter Password:");
		 password=sc.nextLine();
		
		if((user.matches("admin")) && (password.matches("1234")))
		{
			System.out.println("*********SUCCESSFULLY LOGIN**************");
			allDetails();
			
		}
		else 
		{
			System.out.println("Wrong UserName Pass");
		}
		attempt++;
	}
	}
	
	}
