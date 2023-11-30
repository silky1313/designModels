package Doc;

import database.BasicDataBase;

public class Txt implements BasicFormat{
    private BasicDataBase dataBase;
    public Txt(BasicDataBase dataBase){
        this.dataBase = dataBase;
    }
    @Override
    public void dataFormatConversion() {
        String out = dataBase.getData() + " change to " + "TXT";
        System.out.println(out);
    }
}
