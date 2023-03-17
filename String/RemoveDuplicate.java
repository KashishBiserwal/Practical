package String;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str1 = "hellho";
        String str2 = "hio";
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            boolean equal = false;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    equal = true;
                    break;
                }
            }
            if (!equal)
                ans.append(str1.charAt(i));
        }
        System.out.println(ans);
    }
}
