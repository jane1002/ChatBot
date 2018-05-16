package walmart.chatbot.core;

import walmart.chatbot.container.RecordsContainer;

public class ResponseStrategy {
	
	public int type;
	public Response analyze(String input) {
		
		RecordsContainer records = new RecordsContainer();
		Response response = null;
		
		if(input.toLowerCase().equals("h") || input.toLowerCase().equals("help") 
				|| input.toLowerCase().equals("q") || input.toLowerCase().equals("question")) {
			response = new HelperGuideResponse();
		} else if(input.toLowerCase().equals("hi") || input.toLowerCase().equals("hey") || input.toLowerCase().equals("hello")) {
			response = new GreetingResponse();
		} else if(input.toLowerCase().equals("start over") || input.toLowerCase().equals("cancel")) {
			records.clearAllRecords();
			System.out.println("Welcome");
		} else if (input.toLowerCase().equals("done") || input.toLowerCase().equals("complete")) {
			this.type = 0;
		} else {
			
		}
				
		return response;

	}

}
