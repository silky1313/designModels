public class CashRebate extends CashSuper{

    @Override
    public double acceptCash(double cash){
        return cash * 0.8;
    }
}
