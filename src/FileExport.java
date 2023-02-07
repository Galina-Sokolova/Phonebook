import java.io.*;
import java.util.ArrayList;
import java.util.logging.*;

public class FileExport {
    String FILE_PATH = "C:/Users/79190/IdeaProjects/Phonebook/src";
    String FILE_NAME_EXPORT = "export.csv";
    String FILE_PATH_FULL = FILE_PATH+FILE_NAME_EXPORT;
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
}
