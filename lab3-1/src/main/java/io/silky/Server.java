package io.silky;

public class Server {
    private final SearchContext list;
    public Server(SearchContext head) {
        list = head;
    }

    public boolean find(Integer content) {
        return list.check(content);
    }
}
