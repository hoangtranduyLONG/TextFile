package DemoFile;
import java.io.File;
        import java.io.IOException;
        import java.io.PrintWriter;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class Array {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("input.txt");
        inputFile.createNewFile();
        File outputFile = new File("output.txt");
        outputFile.createNewFile();
        PrintWriter printWriter = new PrintWriter(outputFile);
        Scanner scanner = new Scanner(inputFile);
        List<Integer> integers = new ArrayList<>();
        while (scanner.hasNext()) {
            integers.add(scanner.nextInt());
        }
        int sum = 0;
        int max = integers.get(0);
        for (int i : integers
        ) {
            sum += i;
            if (max < i) {
                max = i;
            }
        }
        printWriter.println("Tổng là: " + sum);
        printWriter.println("Max là: " + max);
        printWriter.close();
    }
}