package go;

public class Main {
	
	public static void main(String[] args) {
		
		Pai pai = new Pai ();
		pai.nome = "João";
		pai.idade = 50;
		
		Filho filho = new Filho();
		filho.setNome("Carlos");
		filho.setIdade(20);
		filho.setEmail("carlos@teste.com");
		
		System.out.println(pai.dados());
		System.out.println(filho.dados());
		
	}
}
