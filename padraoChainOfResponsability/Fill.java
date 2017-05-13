package padraoChainOfResponsability;

public class Fill extends FilterOp{
	
	public Fill(){
		super(IdFilters.fill);
	}
	
	@Override
	public void apply(){
		System.out.println("Fill definido");
	}
}
