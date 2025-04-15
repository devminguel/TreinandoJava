
public class ClassificarProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double preco = 150.00;
		
		String categoria;
		
		if (preco <= 50.00) {
			categoria = "Economico";
		} else if (preco <= 200.00) {
			categoria = "Intermediario";
		}else {
			categoria = "Premium";
		}
		
		System.out.println("A categoria do meu produto é : " + categoria);
	}

}
