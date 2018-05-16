package walmart.chatbot.model;

public class Record {
	
	private int oid;
	private long id;
	private String name;
	private long phoneNumber;
	
	/**
	 * @param oid
	 * @param id
	 * @param name
	 * @param phoneNumber
	 */
	public Record(int oid, long id, String name, long phoneNumber) {
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
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
