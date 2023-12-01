package io.silky;

public class Main {


    public static void main(String[] args) {
        Server server;
        JavaSearchContext javaSearchContext  =  new JavaSearchContext();
        SQLSearchContext sqlSearchContext = new SQLSearchContext();
        UMLSearchContext umlSearchContext = new UMLSearchContext();
        server = new Server(SearchContext.link(new JavaSearchContext(), new SQLSearchContext(), new UMLSearchContext()));
        System.out.println(javaSearchContext.content);
        System.out.println(sqlSearchContext.content);
        System.out.println(umlSearchContext.content);

        Integer findContent = 11;
        System.out.println(server.find(findContent));
    }
}