package walmart.chatbot.container;

import java.util.ArrayList;
import walmart.chatbot.model.Record;


public class RecordsContainer {

	private ArrayList<Record> records;
	
	public RecordsContainer() {
		this.records = new ArrayList<>();
		this.records.add(new Record());
	}
	
	public ArrayList<Record> getRecords() {
		return records;
	}

	public void setRecords(ArrayList<Record> records) {
		this.records = records;
	}
	
	public void addRecord() {
		records.add(new Record());
	}
	
	public void clearAllRecords() {
		records.clear();
	}

	public int getLastIndex() {
		if(!isEmpty()) {
			return this.records.size() - 1;
		}

		return 0;
	}

	public int getCurrentRecordIndexNumber() {
		return (getLastIndex() + 1);
	}

	public int getNextRecordIndexNumber() {
		return getCurrentRecordIndexNumber() + 1;
	}

	public Record getCurrentRecord() {
		if(!isEmpty()) {
			return this.records.get(getLastIndex());
		} else {
			addRecord();
		}

		return this.records.get(getLastIndex());
	}

	public String printAllRecords() {
		String res = "";

		if(isEmpty()) {
			return res;
		}

		System.out.println("=================================================");
		for(int i = 0; i < records.size(); i++) {
			String curRecord = "";
			String name = records.get(i).getName() == null? "" : records.get(i).getName();
			String id = records.get(i).getId() == null? "" : records.get(i).getId();
			String phoneNumber = records.get(i).getPhoneNumber() == null? "" : records.get(i).getPhoneNumber();

			curRecord = "Record " + (i + 1) + ": "+ String.format("%-12s", phoneNumber) + String.format("%-5s", id)
					+ String.format("%-20s", name);
			System.out.println(curRecord);

		}
		System.out.println("=================================================");

		return res;
	}

	public boolean isEmpty() {
		return records.isEmpty();
	}

	public String setAndGetPhoneNumber(String phoneNumber) {
		this.getCurrentRecord().setPhoneNumber(phoneNumber);
		return phoneNumber;
	}

	public String setAndGetName(String name) {
		this.getCurrentRecord().setName(name);
		return name;
	}

	public String setAndGetId(String id) {
		this.getCurrentRecord().setId(id);
		return id;
	}
}
