package go;

public class Filho implements Familia{

	private Pai pai;
	private String email; 
	
	public Filho(){
		pai = new Pai();
	}
	public String getNome() {
		return pai.nome;
	}
	public void setNome(String nome) {
		pai.nome = nome;
	}
	public int getIdade() {
		return pai.idade;
	}
	public void setIdade(int idade) {
		pai.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String dados() {
		return 	"NOME: " + this.getNome() + 
				"IDADE: " + this.getIdade() + 
				"EMAIL: " + this.getEmail();
	}
}
