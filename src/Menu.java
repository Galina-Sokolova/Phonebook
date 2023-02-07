import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;

public class Menu {
    public static void mainMenu(){
        Phonebook_Logger.logger.log(Level.INFO, "program start");
        Scanner in = new Scanner(System.in);
        System.out.println("\t1 - Отобразить справочник");
        System.out.println("\t2 - Выгрузить данные");
        System.out.println("\t3 - Загрузить данные");
        System.out.println("\t4 - Добавить запись в телефонную книга");
        System.out.println("\t5 - Выйти из программы");
        System.out.println(". ".repeat(15)+".");
        System.out.print("Выберите действие: ");
        int input = in.nextInt();
        FileExport fexp = new FileExport();
        FileImport fimp = new FileImport();
        Addressbook phones = new Addressbook();
        phones.Addressbook();
        switch (input) {
            case 1:
                phones.showAddressBook();
                break;
            case 2:
                phones.Addressbook();
                fexp.fileExport(phones.pb);
                System.out.println("Export finish");
                break;
            case 3:
                phones.Addressbook();
                fimp.fileImport(phones.pb);
                phones.showAddressBook();
                break;
            case 4:
                phones.addNote();
                phones.showAddressBook();
            case 5:
                break;
        }
        Phonebook_Logger.logger.log(Level.INFO, "stop program");
    }
}
