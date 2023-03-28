import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AddressBook a1 = new AddressBook();
        contactBook(a1);
    }

    static void contactBook(AddressBook addressBook){
        Scanner sc = new Scanner(System.in);
        menu();
        while(true){

            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice){

                case 1:
                    System.out.println("Enter the name: ");
                    String name = sc.next();
                    System.out.println("Enter the mobile no: ");
                    String phoneNo = sc.next();
                    System.out.println("Enter the email: ");
                    String email = sc.next();
                    addressBook.addNewContact(name, phoneNo, email);
                    break;

                case 2:
                    System.out.println("Enter the oldPhoneNo: ");
                    String oldPhoneNo = sc.next();
                    System.out.println("Enter the new Name: ");
                    String newName = sc.next();
                    System.out.println("Enter the new PhoneNo: ");
                    String newPhoneNo = sc.next();
                    System.out.println("Enter the new email: ");
                    String newEmail = sc.next();
                    addressBook.updateContact(oldPhoneNo, newName, newPhoneNo, newEmail);
                    break;

                case 3:
                    System.out.println("Enter the mobile no to delete that contact");
                    String number = sc.next();
                    addressBook.deleteContactByPhoneNo(number);
                    break;

                case 4:
                    addressBook.showAllContacts();
                    break;

                case 5:
                    menu();
                    break;

                case 6:
                    return;
            }
        }
    }

    static void menu(){
        System.out.println("1.Add a new Contact");
        System.out.println("2.Update a Contact");
        System.out.println("3.Delete a Contact");
        System.out.println("4.Show all Contacts");
        System.out.println("5.Print the menu again");
        System.out.println("6.Exit");
    }
}