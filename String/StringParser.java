package String;

import java.util.StringTokenizer;

public class StringParser {
    public static void main(String[] args) {
        String filePath = "C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE";
        StringTokenizer st = new StringTokenizer(filePath, "\\");
        System.out.println("Drive: " + st.nextToken() + "\\");
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 3; i++) {
            sb.append(st.nextToken()).append("||");
        }
        System.out.println("Folders: " + sb);
        System.out.println("File: " + st.nextToken());
    }
}
