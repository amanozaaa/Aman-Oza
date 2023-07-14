package bank;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=0;
		BankManagement bm= new BankManagement();
		while(ch!=4)
		{
			System.out.println("---Welcome to Bank Automation Application---");
			System.out.println("1. Open Account"+"\n2. Login"+"\n3. Closed Account"+"\n4.Exit");
			System.out.println("Enter the choice");
			Scanner sc = new Scanner(System.in);
			ch=sc.nextInt();
			switch(ch)
			{
			case 1: bm.openAccount();
			break;
			case 2: bm.login();
			break;
			case 3: bm.closeAccount();
			break;
			case 4: break;
			default: System.out.println("Invalid choice...Please try again!");
			}
		}

	}

}

