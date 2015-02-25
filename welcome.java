import java.util.Scanner;
public class welcome {
	public static void main(String[] args){

	String username, password;

	Scanner keyboard = new Scanner(System.in);

	System.out.println("Enter your Username: ");

	username = keyboard.nextLine();		

	System.out.println("Enter your Password: ");	

	password = keyboard.nextLine();
	
	if(username.equals(username))
		System.out.println("Welcome " + username);
	else 
		System.out.println("Wrong User name or Password!");

	if(password.equals(password))

			System.out.println("Welcome " + username);
	else 
		System.out.println("Wrong User name or Password!");
		}
	}

