import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;

public class Addressbook {
    public ArrayList<Phonebook> pb = new ArrayList();
    public void Addressbook(){
        pb.add(new Phonebook("Иванов Иван Иванович", "1234567890", "Уфа"));
        pb.add(new Phonebook("Сидоров Сидор Сидорович", "0987654321", "Пермь"));
        pb.add(new Phonebook("Васькин Игорь Львович", "5467364546", "Москва"));
    }
    public void addNote(){
        System.out.println("Введите имя");
        String N = (new Scanner(System.in)).nextLine();
        System.out.println("Введите номер телефона");
        String PH = (new Scanner(System.in)).nextLine();
        System.out.println("Введите город");
        String C = (new Scanner(System.in)).nextLine();
        pb.add(new Phonebook(N, PH, C));
    }
    public void showAddressBook(){
        for(Phonebook i : pb){
            System.out.println(i.getName() + " " + i.getPhone() + " " + i.getCity());
        }
        Phonebook_Logger.logger.log(Level.INFO, "directory output to console");
    }
}

