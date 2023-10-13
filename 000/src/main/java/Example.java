public class Example {
    public static void main(String[] args) {
        String s1 = new String("二哥") + new String("三妹");
        String s2 = s1.intern();
        System.out.println(new String("小萝莉").intern() == "小萝莉");
    }
}
