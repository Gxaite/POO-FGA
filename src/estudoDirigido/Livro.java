package estudoDirigido;

public class Livro extends ItemBiblioteca {
	private String autor;

	public Livro(String titulo, int anoPublicacao, String autor) {
    	super(titulo, anoPublicacao);
    	this.autor = autor;
	}
	public void exibirInformacoes() {
		System.out.println("O título do livro é "+this.titulo+"e seu autor(a) "+this.autor+" e sua publicação foi no ano de "+this.anoPublicacao);
		
	}

	// Método getter para o atributo específico da classe Livro
	public String getAutor() {
    	return autor;
	}
}
