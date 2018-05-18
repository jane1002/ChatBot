package walmart.chatbot.model;


public class Record {
    private int oid;
    private String id;
    private String name;
    private String phoneNumber;

    public Record() {
    }

    public Record(int oid, String id, String name, String phoneNumber) {
        this.oid = oid;
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
