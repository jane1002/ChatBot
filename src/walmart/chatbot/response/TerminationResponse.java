package walmart.chatbot.response;

import walmart.chatbot.container.RecordsContainer;
import walmart.chatbot.core.Response;
import walmart.chatbot.utilities.InputWords;


public class TerminationResponse implements Response {

    @Override
    public boolean accept(String input) {
        return InputWords.terminateWords.contains(input);
    }

    @Override
    public String returnResponse(RecordsContainer recordsContainer, String input) {
        recordsContainer.printAllRecords();
        System.exit(0);
        return "";
    }
}
