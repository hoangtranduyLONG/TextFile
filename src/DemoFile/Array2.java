package DemoFile;
import java.io.File;
        import java.io.IOException;
        import java.io.PrintWriter;
        import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("input2.txt");
        inputFile.createNewFile();
        File outputFile = new File("output2.txt");
        outputFile.createNewFile();
        PrintWriter printWriter = new PrintWriter(outputFile);
        Scanner scanner = new Scanner(inputFile);
        String str = scanner.nextLine();
        System.out.println(str);
        String[] arr = str.split(",");
        int sum = 0;
        for (int i=0; i <arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        printWriter.println("Tổng là: "+sum);
        printWriter.close();
    }
}