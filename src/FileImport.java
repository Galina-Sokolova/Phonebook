import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
public class FileImport {
    String FILE_PATH = "C:/Users/79190/IdeaProjects/Phonebook/src";
    String FILE_NAME_EXPORT = "export.csv";
    String FILE_PATH_FULL = FILE_PATH+FILE_NAME_EXPORT;
    public void fileImport(ArrayList<Phonebook> pb){
        Phonebook_Logger.logger.log(Level.INFO, "Uploading data from a file");
        try {
            File file = new File(FILE_PATH_FULL);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
//                System.out.println(line);
                String[] tmp = line.split(";");
                pb.add(new Phonebook(tmp[0], tmp[1], tmp[2]));
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
