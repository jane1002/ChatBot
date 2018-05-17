package walmart.chatbot.core;

import java.util.List;

import walmart.chatbot.utilities.ClassLoaderService;
import walmart.chatbot.utilities.ResponseClassLoaderServiceImpl;


public class ResponseStrategy {

	private List<Response> responseList;
	private ClassLoaderService classLoaderService;


	public ResponseStrategy() {
		this.classLoaderService = new ResponseClassLoaderServiceImpl();
		this.responseList = classLoaderService.load("");
	}

	public Response analyze(String input) {
		
		input = input.trim().length() == 0 ? " ": input.trim().toLowerCase();
		return findMatchedResponse(responseList, input);

		/*if(inputWords.helpWords.contains(input)) {
			System.out.println(outputWords.HELP_GUIDE);
		} else if(inputWords.greetingWords.contains(input)) {
			randomReneratorService.getAnswerWord(input, outputWords.greetingAnswerWords);
		} else if(inputWords.restartWords.contains(input)) {
			recordsContainer.clearAllRecords();
			System.out.println("Welcome Again...");
		} else if (inputWords.terminateWords.contains(input)) {
			recordsContainer.printAllRecords();
			this.type = 0;
		} else if (inputWords.createNewWords.contains(input)){
			recordsContainer.addRecord();
		} else if (phoneNumberMatcher.isValidPhoneNumber(input)) {
			long number = Long.valueOf(input);
			recordsContainer.getLastRecord().setPhoneNumber(number);
			System.out.println("Record " + recordsContainer.getLastIndex()+ ": " +
					"phone number: " + recordsContainer.getLastRecord().getPhoneNumber());
		} else {
			System.out.println(outputWords.HELP_GUIDE);
		}*/

	}

	private Response findMatchedResponse(List<? extends  Response> matchers, String input) {
		for(Response re: matchers) {
			if(re.accept(input)) {
				return re;
			}
		}

		return new HelperGuideResponse();
	}

}
