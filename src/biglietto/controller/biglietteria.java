package biglietto.controller;

import java.util.Scanner;

public class biglietteria {

	public static void main(String[] args) {
		
		//scanner
		Scanner scan = new Scanner(System.in);
		
		//dichairazione variabili
		int eta,km;
		
		//richeista dati
		System.out.println("inserisci la tua età: ");
		eta = Integer.parseInt(scan.nextLine());

		System.out.println("inserisci i km che vuoi fare: ");
		km = Integer.parseInt(scan.nextLine());
		
		//inserimento classe
		 biglietto ticket = new  biglietto(eta, km);
		 
		 //inserimento calcolo biglietto con dati inseriti dall'utente
			if(eta < 18) {
				System.out.println("il costo del tuo biglietto è: " + ticket.prezzoBase());
			}else if (eta > 65) {
				System.out.println("il costo del tuo biglietto è: " + ticket.prezzoBase());
			}else {
				System.out.println("il costo del tuo biglietto è: " + ticket.prezzoBase());
			}
	}

}
