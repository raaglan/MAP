package padraoChainOfResponsability;

public class Gama extends FilterOp{

	public Gama(){
		super(IdFilters.gama);
	}
	
	@Override
	public void apply(){
		System.out.println("Gama definido");
	}
}