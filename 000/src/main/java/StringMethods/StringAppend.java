package StringMethods;

public class StringAppend {

    public static void main(String[] args) {
        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += "六六六";
        }


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("六六六");
        }

    }
}
