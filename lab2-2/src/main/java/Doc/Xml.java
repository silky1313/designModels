package Doc;

import database.BasicDataBase;

public class Xml implements BasicFormat{
    private BasicDataBase dataBase;
    public Xml(BasicDataBase dataBase){
        this.dataBase = dataBase;
    }
    @Override
    public void dataFormatConversion() {
        String out = dataBase.getData() + " change to " + "XML";
        System.out.println(out);
    }
}
