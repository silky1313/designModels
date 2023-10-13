package Factory;

import Product.Connection;
import Product.Statement;

public interface SqlFactory {
    Connection createConnection();
    Statement createStatement();
}
