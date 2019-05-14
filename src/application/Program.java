package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Hotel;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int quant = 10;
		Hotel[] hotel = new Hotel[quant];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Rent #"+i+":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			hotel[room] = new Hotel(name, email);	
			System.out.println();
			System.out.println();
			
		}
		System.out.println("Busy rooms:");
		
		for(int i = 0; i < quant; i++) {
			if (hotel[i] != null)
			{
				System.out.println(i
						+ ": "
						+ hotel[i]);
			}
			
		
		}
		

	}

}
