package String;

public class MaxOccurrence {
    public static void main(String[] args) {
        String s = "sample string for maximum character occurrences.";
        char maxOccur = s.charAt(0);
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            for (int j = 1; j < s.length(); j++) {
                if(s.charAt(j) == s.charAt(i)) count++;
            }
            if(count > max){
                max = count;
                maxOccur = s.charAt(i);
            }
        }
        System.out.println(maxOccur);
    }
}
