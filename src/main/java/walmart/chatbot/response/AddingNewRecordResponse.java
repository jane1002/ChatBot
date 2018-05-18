package walmart.chatbot.response;

import walmart.chatbot.container.RecordsContainer;
import walmart.chatbot.core.Response;
import walmart.chatbot.utilities.InputWords;
import walmart.chatbot.utilities.OutputWords;


public class AddingNewRecordResponse implements Response {

    @Override
    public boolean accept(String input) {
        return InputWords.createNewWords.contains(input);
    }

    @Override
    public String returnResponse(RecordsContainer recordsContainer, String input) {
        recordsContainer.addRecord();
        return OutputWords.ENTER_HINT + " " + recordsContainer.getCurrentRecordIndexNumber() + ".";
    }
}
