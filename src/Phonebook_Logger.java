import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.*;

public class Phonebook_Logger {
    public static Logger logger = Logger.getGlobal();
    static {
        try {
            LogManager.getLogManager().readConfiguration(
                    Main.class.getResourceAsStream("log.config"));
        }catch (Exception ignore){
            ignore.printStackTrace();
        }
    }
}


