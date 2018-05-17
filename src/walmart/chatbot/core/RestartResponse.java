package walmart.chatbot.core;

import walmart.chatbot.container.RecordsContainer;
import walmart.chatbot.utilities.InputWords;
import walmart.chatbot.utilities.OutputWords;

/**
 * Created by YFAN on 5/16/2018.
 */
public class RestartResponse implements Response {


    @Override
    public boolean accept(String input) {
        return InputWords.restartWords.contains(input);
    }

    @Override
    public String returnResponse(RecordsContainer recordsContainer, String input) {
        recordsContainer.clearAllRecords();
        return OutputWords.INITIAL_GREETING;
    }

}
