public class CashReturn extends CashSuper{

    @Override
    public double acceptCash(double cash) {
        if(cash >= 500){
            cash -= 200;
        }
        return cash;
    }
}
