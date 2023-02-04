import java.io.*;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.*;

public class Filemanager {

    String FILE_PATH = "C:/Users/79190/IdeaProjects/Phonebook/src";
    String FILE_NAME_EXPORT = "export.csv";
    String FILE_PATH_FULL = FILE_PATH+FILE_NAME_EXPORT;
    public String getFILE_PATH() {
        return FILE_PATH;
    }

    public void fileExport(ArrayList<Phonebook> pb){
        Phonebook_Logger.logger.log(Level.INFO, "Writing data to a file");
        try(FileWriter writer = new FileWriter(FILE_PATH + FILE_NAME_EXPORT, false))
        {

            for(Phonebook i: pb){
                String text = i.getName()+";"+i.getPhone()+";"+i.getCity();
                writer.write(text);
                // запись по символам
                writer.append('\n');
//                writer.append('E');
            }
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

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
