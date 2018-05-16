package walmart.chatbot.core;


import java.util.Scanner;

public class ChatBotMain {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to conversation simulation!");
		
		ResponseStrategy responseStrategy = new ResponseStrategy();
		while(scanner.hasNext()) {
	        String input = scanner.next();
	        Response response = responseStrategy.analyze(input);
	        
	        if(responseStrategy.type == 0) {
	        	System.out.println("Bye!");
	        	System.exit(0);
	        }
	        
	        response.showDescription();
		}
		
	}
}
