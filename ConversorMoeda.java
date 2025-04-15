
public class ConversorMoeda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double valorReais = 451.50;
		
		double taxaCambio = 5.25; 
		
		double valorDolares = valorReais / taxaCambio;
		
		System.out.println(" O valor em dólares é : US$ " + valorDolares);
	}

}
