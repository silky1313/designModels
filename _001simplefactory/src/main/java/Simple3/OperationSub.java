package Simple3;

public class OperationSub extends Operation{
    @Override
    public double GetResult() {
        double ans = 0;
        ans = this.getNumberA() - this.getNumberB();
        return ans;
    }
}
