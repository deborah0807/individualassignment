import java.util.Scanner;

public class Driver {
	public static void main (String [] args) {

		String Nama;
		String Address;
		int Number;
		int CustNo;
		char mail;
		boolean stop = false;
		double amount;
		int discount;

		Scanner input = new Scanner(System.in);

		Person p = new Person();

		System.out.println ("Please enter your name: ");
		Nama = input.nextLine();
		System.out.println ("Please enter your address: ");
		Address = input.nextLine();
		System.out.println ("Please enter your phone number: ");
		Number = input.nextInt();
		System.out.println ("Please enter your customer number: ");
		CustNo =  input.nextInt();
		System.out.println ("Do you wish to be on the mailing list? Enter Y or N : ");
		mail = input.next().charAt(0);


		if (mail == 'Y' || mail =='y')
		{
			stop = false;
		}
		else if (mail == 'N' || mail =='n')
		{
			stop = true;
		}

		System.out.println ("Please enter the amount : ");
		amount = input.nextDouble();
		if (amount >=500 && amount <= 999)
		{
			System.out.println ("You get a 5% discount.");
		}
		else if (amount >=1000 && amount <=1499)
		{
			System.out.println ("You get a 6% discount.");
		}
		else if (amount >=1500 && amount <= 1999)
		{
			System.out.println ("You get a 7% discount.");
		}
		else if (amount == 2000)
		{
			System.out.println ("You get a 10% discount.");
		}
		else
		{
			System.out.println ("You did not get any discount.");
		}
	}
}