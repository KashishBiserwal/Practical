package String;

public class IfRotation {
    public static void main(String[] args) {
        String s1 = "ABACD", s2 = "CDABA";
        String s1concat = s1.concat(s1);
        if(s1concat.contains(s2)) System.out.println("Strings are rotations of each other.");
        else System.out.println("Strings are not rotations of each other.");
    }
}
