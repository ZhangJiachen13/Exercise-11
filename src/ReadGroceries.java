import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadGroceries {

    String path = "D:\\Groceries (1).txt";
    public void readGroceriesFile() {
    try {
            FileReader fileread = new FileReader(path);
            BufferedReader reader = new BufferedReader(fileread);
            String line = reader.readLine();
            while (line != null) {
              
                System.out.println(line);
                line = reader.readLine();
            }
            
         
            reader.close();
        } catch (IOException e) {
         
            e.printStackTrace();
        }
    }
}