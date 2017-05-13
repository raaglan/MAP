package padraoChainOfResponsability;

public class Colorize extends FilterOp{

	public Colorize(){
		super(IdFilters.colorize);
	}
	
	@Override
	public void apply(){
		System.out.println("Colorize definido");
	}

}
