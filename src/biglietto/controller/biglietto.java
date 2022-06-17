package biglietto.controller;

public class biglietto {

	//attributi
	private double prezzoKm = 0.21, scontoAnziani = 0.4, scontoGiovani = 0.2;
	private int eta,km;
	
	
	//costruttore
	public biglietto(int eta, int km) {
		super();
		this.eta = eta;
		this.km = km;
	}

	
}
