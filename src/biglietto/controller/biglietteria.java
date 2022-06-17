package biglietto.controller;

import java.util.Scanner;

public class biglietteria {

	public static void main(String[] args) {
		
		//scanner
		Scanner scan = new Scanner(System.in);
		
		//dichairazione variabili
		int eta,km;
		// BONUS
		String ripeti;
		
		do
		{
			System.out.println("Benvenuto alla biglietteria del treno!");
		//richeista dati
		System.out.println("inserisci la tua età: ");
		eta = Integer.parseInt(scan.nextLine());

		System.out.println("inserisci i km che vuoi fare: ");
		km = Integer.parseInt(scan.nextLine());
		
		//inserimento classe
		 biglietto ticket = new  biglietto(eta, km);
		 
		 //inserimento calcolo biglietto con dati inseriti dall'utente
			if(eta < 18) {
				System.out.println("ha diritto all sconto young,il costo del tuo biglietto è: " + ticket.prezzoBase());
			}else if (eta > 65) {
				System.out.println("hai diritto allo sconto over 65,il costo del tuo biglietto è: " + ticket.prezzoBase());
			}else {
				System.out.println("il costo del tuo biglietto è: " + ticket.prezzoBase());
			}
			
			// BONUS BONUS BONUS
			do
			{
				System.out.println("Vuoi comprare un altro biglietto?");
				
				ripeti=scan.nextLine();
				
				if(!ripeti.equalsIgnoreCase("si") && !ripeti.equalsIgnoreCase("no"))
					System.out.println("puoi rispondere solo con si o no, riprova: ");
				
			}while(!ripeti.equalsIgnoreCase("si") && !ripeti.equalsIgnoreCase("no"));
			
		}while(ripeti.equalsIgnoreCase("si"));
		
		System.out.println("Grazie, arrivederci!");
		
		scan.close();
	}

}
