import java.util.List;

public interface BaseDepartment {
    /**
     *
     * @param tabs代表tabs的数量
     */
    void send(int tabs);

    default void add(BaseDepartment... childrens) {
    }

    default void add(BaseDepartment children) {
    }

    default void add(int index, BaseDepartment children) {
    }

    default boolean addRandom(BaseDepartment children) {
        return false;
    }

    default boolean get(int index) {
        return false;
    }
}
