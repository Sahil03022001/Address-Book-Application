public class Info {

    private int id;
    private Contact contact;

    public Info(int id, Contact contact) {
        this.id = id;
        this.contact = contact;
    }

    public Info() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
