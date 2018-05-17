package walmart.chatbot.core;

import walmart.chatbot.container.RecordsContainer;
import walmart.chatbot.utilities.InputWords;

/**
 * Created by YFAN on 5/16/2018.
 */
public class TerminationResponse implements Response{
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
