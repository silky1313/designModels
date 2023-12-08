package io.silky;


import jdk.dynalink.beans.StaticClass;

import javax.naming.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class SearchContext {
    private SearchContext next;

    public static SearchContext link(SearchContext head, SearchContext... body) {
        SearchContext result = head;
        for (SearchContext nextNode : body) {
            head.next = nextNode;
            head = nextNode;
        }
        return result;
    }

    public abstract boolean check(Integer content);

    protected boolean checkNext(Integer content) {
        if (next == null) return false;
        return next.check(content);
    }
}
