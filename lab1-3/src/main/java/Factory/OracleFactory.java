package Factory;

import Product.Connection;
import Product.OracleConnection;
import Product.OrcaleStatement;
import Product.Statement;

public class OracleFactory implements SqlFactory{
    @Override
    public Connection createConnection() {
        return new OracleConnection();
    }

    @Override
    public Statement createStatement() {
        return new OrcaleStatement();
    }
}
