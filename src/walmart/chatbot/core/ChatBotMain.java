package walmart.chatbot.core;


import java.util.Scanner;

import walmart.chatbot.container.RecordsContainer;
import walmart.chatbot.utilities.InputProperties;
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

			String res = response.returnResponse(recordsContainer, input);
			if(res == InputProperties.TERMINATION_CONDITION) {
				System.exit(0);
				break;
			}
			System.out.println(res);
		}

		scanner.close();
	}
}
