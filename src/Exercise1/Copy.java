package Exercise1;
import java.io.*;
public class Copy {
    public static void main(String[] args) {
        String pathSource = "source file.txt";
        String pathTarget = "target file.txt";

        String s = "";
        try (FileReader fileReader = new FileReader(pathSource); BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(pathTarget); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            while (true) {
                s = bufferedReader.readLine();
                if (s == null) {
                    break;
                }
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("Hello");
        }
        catch (IOException e) {
            System.err.println("Lỗi file");
        }


    }
}
