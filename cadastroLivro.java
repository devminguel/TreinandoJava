
public class cadastroLivro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Informações do livro
		        String titulo = "O Pequeno Príncipe";
		        String autor = "Antoine de Saint-Exupéry";
		        int numeroPaginas = 96;
		        double preco = 29.90;
		        char categoria = 'F';

		        // Exibição da mensagem com base na categoria
		        String nomeCategoria = "";

		        switch (categoria) {
		            case 'F':
		                nomeCategoria = "Ficção";
		                break;
		            case 'N':
		                nomeCategoria = "Não-ficção";
		                break;
		            case 'T':
		                nomeCategoria = "Tecnologia";
		                break;
		            case 'H':
		                nomeCategoria = "História";
		                break;
		            default:
		                nomeCategoria = "Categoria desconhecida";
		        }

		        // Saída
		        System.out.println("Livro cadastrado: \"" + titulo + "\", de " + autor + ". Ele possui " +
		                numeroPaginas + " páginas, custa R$ " + preco + " e pertence à categoria: " + nomeCategoria + ".");
		    }
		
	}


