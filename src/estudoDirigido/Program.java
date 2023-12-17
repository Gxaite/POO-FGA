package estudoDirigido;

public class Program {

	public static void main(String[] args) {
		ItemBiblioteca item = new ItemBiblioteca("Caderno",1994);
		Livro livro = new Livro("Nárnia",2000, "Lewis");
		Revista revista = new Revista("Manifesto",1940,2);
		ItemBiblioteca[] biblioteca = {item, livro,revista};
		
		for (ItemBiblioteca currentItem: biblioteca) {
			currentItem.exibirInformacoes();
		}
	}

}
