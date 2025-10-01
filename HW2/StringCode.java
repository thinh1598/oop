import java.util.HashSet;

public class StringCode {

    public static String blowup(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                int count = c - '0';
                if (i + 1 < str.length()) {
                    char next = str.charAt(i + 1);
                    for (int j = 0; j < count; j++) {
                        result.append(next);
                    }
                }
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static int maxRun(String str) {
        if (str.isEmpty()) return 0;
        int max = 1, count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
            }
        }
        return max;
    }

    public static boolean stringIntersect(String a, String b, int len) {
        if (len <= 0) return false;
        if (a.length() < len || b.length() < len) return false;
        HashSet<String> substrings = new HashSet<>();
        for (int i = 0; i <= a.length() - len; i++) {
            substrings.add(a.substring(i, i + len));
        }
        for (int j = 0; j <= b.length() - len; j++) {
            if (substrings.contains(b.substring(j, j + len))) {
                return true;
            }
        }
        return false;
    }


}
