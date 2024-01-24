package Services;

public class BrazilTaxService implements TaxService{

    Double TAX_FEE = 0.2;

    @Override
    public Double tax(Double amount) {
        return amount * TAX_FEE;
    }
}
