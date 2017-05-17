package templateMethod;

public class CapitalStrategyTermLoan {

	public double capital(Loan loan){
        return loan.getCommitment();
    }
}
