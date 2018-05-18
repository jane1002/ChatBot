package walmart.chatbot.core;

import walmart.chatbot.container.RecordsContainer;

public interface Response {
    boolean accept(String input);

    String returnResponse(RecordsContainer recordsContainer, String input);
}
