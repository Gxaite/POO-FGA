package estudoDirigido;

//Classe derivada que representa uma Revista
public class Revista extends ItemBiblioteca {
	private int numeroEdicao;

	public Revista(String titulo, int anoPublicacao, int numeroEdicao) {
 	super(titulo, anoPublicacao);
 	this.numeroEdicao = numeroEdicao;
	}
	
	public void exibirInformacoes() {
		System.out.println("O título do livro é "+this.titulo+" e sua edição é "+this.numeroEdicao
				+" e sua publicação foi no ano de "+this.anoPublicacao);
		
	}


	// Método getter para o atributo específico da classe Revista
	public int getNumeroEdicao() {
 	return numeroEdicao;
	}
}

