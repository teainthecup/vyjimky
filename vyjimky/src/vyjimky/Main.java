package vyjimky;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
	
	/*	int cislo = 0;
		int cislo2 = 0;
		int deleni = 0;
		
		try {
			System.out.println("Zadejte èíslo: ");
			cislo = scanner.nextInt();
			System.out.println("Zadejte druhé èíslo: ");
			cislo2 = scanner.nextInt();
			
			deleni = cislo/cislo2;
			
		}
		catch(InputMismatchException e) {
			System.out.println("Nenapsali jste èíslo.");
		}
		catch(ArithmeticException e) {
			System.out.println("Nemùžete dìlit nulou.");
		} 
		catch(Exception e) {
			System.out.println("Nastal problém.");
		}
		
		System.out.println(cislo +  " " + cislo2);
		System.out.println(deleni);
		
		
		
		Ctverec c = new Ctverec();
		System.out.println("Zadejte stranu: ");
		int strana = scanner.nextInt();
		try {
			c.setStrana(strana);
		} catch (Exception e) {			
			//e.printStackTrace();
			System.out.println("Strana ètverce musí být kladná.");
		}
		
		System.out.println(c);
		
		*/
		
		Ctverec c = new Ctverec();
		int strana = 0;
		boolean b = true;
		
		while(b) {
			try {
				System.out.println("Zadejte stranu: ");
				strana = scanner.nextInt();		
				c.setStrana(strana);
				b = false;
			}
			catch(Exception e){
				System.out.println("Musíš zadat èíslo. ");
				b = true;
				scanner.nextLine();
			}
		}

		System.out.println(c);
		
		
	}

}
