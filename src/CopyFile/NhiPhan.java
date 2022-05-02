package CopyFile;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class NhiPhan {
    public static void main(String[] args) throws IOException {
        File official = new File("official.txt");
        File copy = new File("copy.txt");
        File origin = null;
        if (!origin.exists()){
            origin.createNewFile();
        }
        if (!copy.exists()){
            copy.createNewFile();
        }
        copyFile(origin,copy);
        System.out.println("Copy  ");
    }
    public static void copyFile(File origin,File copy) throws IOException {
        FileReader fileReader= new FileReader(origin);
        FileWriter fileWriter = new FileWriter(copy);
        int sum;
        while ((sum =fileReader.read()) !=-1){
            fileWriter.write(sum);
        }
        fileReader.close();
        fileWriter.close();
    }
}
