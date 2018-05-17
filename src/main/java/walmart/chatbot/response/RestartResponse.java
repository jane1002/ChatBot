package walmart.chatbot.response;

import walmart.chatbot.container.RecordsContainer;
import walmart.chatbot.core.Response;
import walmart.chatbot.utilities.InputWords;
import walmart.chatbot.utilities.OutputWords;


public class RestartResponse implements Response {

    @Override
    public boolean accept(String input) {
        return InputWords.restartWords.contains(input);
    }

    @Override
    public String returnResponse(RecordsContainer recordsContainer, String input) {
        recordsContainer.clearAllRecords();
        recordsContainer.addRecord();
        return OutputWords.INITIAL_GREETING + " " + recordsContainer.getCurrentRecordIndexNumber() + ".";
    }
}
