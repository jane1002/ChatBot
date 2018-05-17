package walmart.chatbot.core;


import java.util.Scanner;

import walmart.chatbot.container.RecordsContainer;
import walmart.chatbot.utilities.OutputWords;

public class ChatBotMain {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(OutputWords.INITIAL_GREETING + " 1" + ".");
		
		ResponseStrategy responseStrategy = new ResponseStrategy();
		RecordsContainer recordsContainer = new RecordsContainer();

		while(scanner.hasNext()) {
	        String input = scanner.nextLine();
	       	Response response = responseStrategy.analyze(input);
			System.out.println(response.returnResponse(recordsContainer, input));
		}

		scanner.close();
	}
}
