package biglietto.controller;

public class biglietto {

	//attributi
	private double prezzoBaseKm = 0.21, scontoAnziani = 0.4, scontoGiovani = 0.2;
	private int eta,km;
	
	
	//costruttore
	public biglietto(int eta, int km) {
		super();
		this.eta = eta;
		this.km = km;
	}

	//aggiunto getter e setter eta e km
	public int getEta() {
		return eta;
	}


	public void setEta(int eta) {
		this.eta = eta;
	}


	public int getKm() {
		return km;
	}


	public void setKm(int km) {
		this.km = km;
	}

	
	//aggiunto calcolo prezzo totale
	public double prezzoBase() {
		double prezzoBase = 0.0;
		prezzoBase = km * prezzoBaseKm;
		
		if(eta < 18) {
			return prezzoBase - (prezzoBase * scontoGiovani);
		}else if (eta > 65) {
			return prezzoBase - (prezzoBase * scontoAnziani);
		}else {
			return prezzoBase;
		}
			
		
		
	}
}
