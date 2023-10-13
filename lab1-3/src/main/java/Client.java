import Factory.MysqlFactory;
import Factory.OracleFactory;
import Factory.SqlFactory;
import Product.Connection;
import Product.Statement;

/**
 * 抽象工厂模式之数据库操作工厂。某系统为了改进数据库操作的性能，自定义数据为连接对象
 *  * (Connection)和语句(Statement)对象，可针对不同类型的数据库提供不同的连接对象和语句对象，如提供
 *  * Oracle 或 MySQL 专用连接类和语句类，而且用户可以通过配置文件等方式根据实际需要动态更换系统数据
 * 库。
*/
public class Client {
    public static void main(String[] args) {
        SqlFactory sqlFactory = new OracleFactory();
        Connection connection = sqlFactory.createConnection();
        Statement statement = sqlFactory.createStatement();
        connection.myname();
        statement.myname();
    }
}
