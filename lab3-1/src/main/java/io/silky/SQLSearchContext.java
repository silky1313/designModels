package io.silky;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class SQLSearchContext extends SearchContext{

    public List<Integer> content;
    SQLSearchContext() {
        Random random = new Random();
        content = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            content.add(random.nextInt(10));
        }
    }

    @Override
    public boolean check(Integer content) {
        for (Integer i : this.content) {
            if (Objects.equals(i, content)){
                return true;
            }
        }
        return checkNext(content);
    }
}
