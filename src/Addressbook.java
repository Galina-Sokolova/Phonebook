import java.util.ArrayList;
import java.util.logging.Level;

public class Addressbook {
    public ArrayList<Phonebook> pb = new ArrayList();
    public void Addressbook(){
        pb.add(new Phonebook("Иванов Иван Иванович", "1234567890", "Иваново"));
        pb.add(new Phonebook("Сидоров Сидор Сидорович", "0987654321", "Сидорово"));
        pb.add(new Phonebook("Васькин Игорь Львович", "5467364546", "Москва"));
    }

    public void showAddressBook(){
        for(Phonebook i : pb){
            System.out.println(i.getName() + " " + i.getPhone() + " " + i.getCity());
        }
        Phonebook_Logger.logger.log(Level.INFO, "directory output to console");
    }
}

