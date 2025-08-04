package Cab;
import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("---------- Choose your Cab ----------");
		System.out.println("1.Bike 🏍️\n2.Auto 🛺\n3.Car 🚗");
		int choice=sc.nextInt();
		System.out.println("Enter the Distance (in km):\n");
		double dist=sc.nextDouble();
		switch(choice) {
		case 1:
			Bike b=new Bike("Yamaha MT 15 V2","Raju","7859014362","KA 25 SV 9325",dist*25);
			b.BikeDetails();
			break;
		case 2:
			Auto a=new Auto("Bajaj Maxima Z","Kishore","9879014569","KA 24 SV 9324",dist*35);
			a.AutoDetails();
			break;
		case 3:
			System.out.println("------------- Select the Car --------------\n");
			System.out.println("1.Mini\n2.Sweden\n3.Luxury");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				Mini m=new Mini("Mini Cooper S","Diesel","TMini",6,"Yashwanth","8970424985","KA 40 RE 2025",dist*100);
				m.MiniDetails();
				break;
			case 2:
				Sweden s=new Sweden("Volvo XC40","Diesel","Sweden",8,"Ramesh","8970424985","KA 40 RS 2026",dist*120);
				s.SwedenDetails();
				break;
			case 3:
				Luxury l=new Luxury("Mercedes-Benz","Petrol","Luxury",6,"Suresh","9670424985","KA 30 AE 2825",dist*160);
				l.LuxuryDetails();
				break;
			default:
				System.out.println("Invalid Input!,Please enter Valid Input");
			}
			System.out.println("******Thank you for your booking!******");
			break;	
		default:
			System.out.println("Invalid Input!,Please enter Valid Input");
		}
		sc.close();
	}
}
