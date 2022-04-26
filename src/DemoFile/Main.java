package DemoFile;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
//        B1: Tạo file
        File file = new File("inp.txt");
        File file1 = new File("rs.txt");
        PrintWriter writer = new PrintWriter(file1);
//        B2: Nhập số vào
        Scanner scanner = new Scanner(file);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + " " + b);
//        Gptb1
        if (a==0) {
            if (b==0) {
                writer.println("PT vô số nghiệm!");
            } else {
                writer.println("PT vô nghiệm");
            }
        }
        writer.close();
    }
}