import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
 * 这个类主要是对集合框架的使用
 */
public class SetFrame {
    public static void main(String[] args) {// 创建一个集合
        // 创建一个HashMap，插入的键值对为 沉默 王二 陈清扬
        LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();
        hashMap.put("a", "cenzhong");
        hashMap.put("c", "wanger");
        hashMap.put("b", "chenqingyang");

// 遍历 HashMap
        for (String key : hashMap.keySet()) {
            String value = hashMap.get(key);
            System.out.println(key + " 对应的值为：" + value);
        }
    }
}
