package application;

import java.util.Locale;
import java.util.Scanner;

import service.Bill;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		Bill bill;
		
		System.out.print("Sexo: ");
		String gender = sc.next();
		System.out.print("Quantidade de cervejas: ");
		int beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		int soda = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		int barbecue = sc.nextInt();
		
		bill = new Bill(gender, beer, barbecue, soda);
		
		bill.print();
	
		sc.close();
	}
}