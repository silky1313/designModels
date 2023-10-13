public class CashContext {
    CashSuper cashSuper = null;
    public CashContext(int type){
        switch (type) {
            case 1:
                cashSuper = new CashNormal();
                break;
            case 2:
                cashSuper = new CashRebate();
                break;
            case 3:
                cashSuper = new CashReturn();
                break;
        }
    }

    public double getResult(double cash){
        return cashSuper.acceptCash(cash);
    }
}
