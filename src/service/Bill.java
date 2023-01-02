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

	public double feeding() {
		return beer * beerAmount + barbecue * barbecueAmount + softDrink * softDrinkAmount;
	}

	public double cover() {
		return (feeding() > 30) ? 0 : 4.0;
	}

	public double ticket() {
		return (gender.charAt(0) == 'F') ? 8.0 : 10.0;
	}

	public double total() {
		return feeding() + cover() + ticket();
	}
	
	public void print() {
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f\n", feeding());
		
		if(cover() != 0.0) {
			System.out.printf("Couvert = R$ %.2f\n", cover());
		} else {
			System.out.println("Isento de Couvert");
		}
		
		System.out.printf("Ingresso = R$ = %.2f\n", ticket());
		System.out.println();
		System.out.printf("Valor total a pagar = R$ %.2f\n", total());
	}
}
