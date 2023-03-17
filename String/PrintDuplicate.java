package String;

public class PrintDuplicate {
    public static void main(String[] args) {
        String s = "string duplicates";
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if(arr[i] == arr[j]){
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
        }
    }
}
