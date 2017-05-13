package padraoChainOfResponsability;

public class Contrast extends FilterOp{

	public Contrast(){
		super(IdFilters.constrast);
	}
	
	@Override
	public void apply(){
		System.out.println("Contraste definido");
	}
}
