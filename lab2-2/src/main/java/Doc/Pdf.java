package Doc;

import database.BasicDataBase;

public class Pdf implements BasicFormat{
    private BasicDataBase dataBase;
    public Pdf(BasicDataBase dataBase){
        this.dataBase = dataBase;
    }
    @Override
    public void dataFormatConversion() {
        String out = dataBase.getData() + " change to " + "PDF";
        System.out.println(out);
    }
}
