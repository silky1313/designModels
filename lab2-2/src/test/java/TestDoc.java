import Doc.BasicFormat;
import Doc.Pdf;
import Doc.Txt;
import Doc.Xml;
import database.BasicDataBase;
import database.Mongodb;
import database.Mysql;
import org.junit.Test;

public class TestDoc {
    @Test
    public void testThree(){
        BasicDataBase mongodb = new Mongodb();
        BasicDataBase mysql = new Mysql();

        BasicFormat pdf1 = new Pdf(mongodb);
        BasicFormat pdf2 = new Pdf(mysql);
        BasicFormat txt1 = new Txt(mongodb);
        BasicFormat txt2 = new Txt(mysql);
        BasicFormat xml1 = new Xml(mongodb);
        BasicFormat xml2 = new Xml(mysql);

        pdf1.dataFormatConversion();
        pdf2.dataFormatConversion();
        txt1.dataFormatConversion();
        txt2.dataFormatConversion();
        xml1.dataFormatConversion();
        xml2.dataFormatConversion();
    }
}
