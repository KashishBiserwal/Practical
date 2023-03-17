package String;

import java.util.StringTokenizer;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "Sample string to reverse";
        StringTokenizer st = new StringTokenizer(str);
        while(st.hasMoreTokens()){
            System.out.print(reverse(st.nextToken()) + " ");;
        }
    }

    private static StringBuilder reverse(String word) {
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse();
    }
}
