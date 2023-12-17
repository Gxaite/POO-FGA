package estudoDirigido;

	public class ItemBiblioteca {
		String titulo;
		int anoPublicacao;

		public ItemBiblioteca(String titulo, int anoPublicacao) {
	    	this.titulo = titulo;
	    	this.anoPublicacao = anoPublicacao;
		}
		
		public void exibirInformacoes() {
			System.out.println("O título do item é "+this.titulo+" e sua publicação foi no ano de "+this.anoPublicacao);
			
		}

		// Métodos getters e setters para encapsular os atributos
		public String getTitulo() {
	    	return titulo;
		}

		public int getAnoPublicacao() {
	    	return anoPublicacao;
		}
	}
