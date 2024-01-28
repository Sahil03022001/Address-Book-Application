import java.util.*;
import java.util.List;

public class AddressBook {

    private boolean alreadySorted;
    private List<Contact> contacts;

    public AddressBook() {
        alreadySorted = false;
        this.contacts = new LinkedList<>();
    }


    //find a Contact by phone Number
    public int findContactByPhoneNumber(String phoneNo){
        int idx = 0;
        for(Contact contact : contacts){
            if(contact.getPhoneNo().equals(phoneNo)){
                return idx;
            }
            idx++;
        }
        return -1;
    }

    //find a Contact by email
    public int findContactByEmail(String email){
        int idx = 0;
        for(Contact contact : contacts){
            if(contact.getEmail().equals(email)){
                return idx;
            }
            idx++;
        }
        return -1;
    }

    //adding new contact
    public void addNewContact(String name, String phoneNo, String email){
        alreadySorted = false;
        Contact contact = new Contact(name, phoneNo, email);
        contacts.add(contact);
        System.out.println("Contact Added");
    }

    //delete a contact by phoneNo
    public void deleteContactByPhoneNo(String phoneNo){
        int idx = findContactByPhoneNumber(phoneNo);
        if(idx == -1){
            System.out.println("Contact not available");
        }
        else{
            contacts.remove(idx);
            System.out.println("Contact deleted");
        }
    }

    //delete a contact by email
    public void deleteContactByEmail(String email){
        int idx = findContactByEmail(email);
        if(idx == -1){
            System.out.println("Contact not available");
        }
        else{
            contacts.remove(idx);
            System.out.println("Contact deleted");
        }
    }

    //update a contact
    public void updateContact(String oldPhoneNo, String newName, String newPhoneNo, String newEmail){
        alreadySorted = false;
        int idx = findContactByPhoneNumber(oldPhoneNo);
        if(idx == -1){
            System.out.println("Contact not available");
        }
        else{
            Contact contact = contacts.get(idx);
            contact.setName(newName);
            contact.setPhoneNo(newPhoneNo);
            contact.setEmail(newEmail);
            System.out.println("Contact updated");
        }
    }

    //show all contacts
    public void showAllContacts(){
        if(contacts.size() == 0){
            System.out.println("No contacts available");
            return;
        }
        if(!alreadySorted) {
            alreadySorted = true;
            contacts.sort(new Comparator<Contact>() {
                @Override
                public int compare(Contact o1, Contact o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
        }

        for(Contact contact : contacts){
            System.out.println(contact);
        }
    }
}
