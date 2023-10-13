package Factory;

import Product.Connection;
import Product.MysqlConnection;
import Product.MysqlStatement;
import Product.Statement;

public class MysqlFactory implements SqlFactory{

    @Override
    public Connection createConnection() {
        return new MysqlConnection();
    }

    @Override
    public Statement createStatement() {
        return new MysqlStatement();
    }
}
