package walmart.chatbot.container;

import java.util.ArrayList;
import walmart.chatbot.model.Record;


public class RecordsContainer {
	
	public ArrayList<Record> records;
	
	public RecordsContainer() {
	}

	public RecordsContainer(ArrayList<Record> records) {
		this.records = records;
	}
	
	public ArrayList<Record> getRecords() {
		return records;
	}

	public void setRecords(ArrayList<Record> records) {
		this.records = records;
	}
	
	public void addRecord(Record newRecord) {
		records.add(newRecord);
	}
	
	public void clearAllRecords() {
		records.clear();
	}
}
