package service;

public class Bill {

	private String gender;
	private int beer = 5, barbecue = 7, softDrink = 3;
	private int beerAmount, barbecueAmount, softDrinkAmount;

	public Bill(String gender, int beerAmount, int barbecueAmount, int softDrinkAmount) {
		this.gender = gender;
		this.beerAmount = beerAmount;
		this.barbecueAmount = barbecueAmount;
		this.softDrinkAmount = softDrinkAmount;
	}

	private double feeding() {
		return beer * beerAmount + barbecue * barbecueAmount + softDrink * softDrinkAmount;
	}

	private double cover() {
		return (feeding() > 30) ? 0 : 4.0;
	}

	private double ticket() {
		return (gender.equalsIgnoreCase("F")) ? 8.0 : 10.0;
	}

	private double total() {
		return feeding() + cover() + ticket();
	}
	
	private boolean isCoverArtFree() {
		return (cover() != 0.0) ? true : false; 
	}
	
	public void printReport() {
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f\n", feeding());
		
		if(isCoverArtFree()) System.out.printf("Couvert = R$ %.2f\n", cover());
		else System.out.println("Isento de Couvert");
				
		System.out.printf("Ingresso = R$ %.2f\n", ticket());
		System.out.println();
		System.out.printf("Valor total a pagar = R$ %.2f\n", total());
	}
}
