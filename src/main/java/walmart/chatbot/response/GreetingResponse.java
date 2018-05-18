package walmart.chatbot.response;

import walmart.chatbot.container.RecordsContainer;
import walmart.chatbot.core.Response;
import walmart.chatbot.utilities.InputWords;
import walmart.chatbot.utilities.OutputWords;
import walmart.chatbot.utilities.RandomGenerator;

public class GreetingResponse implements Response {

    private RandomGenerator randomGenerator;

    public GreetingResponse() {
        this.randomGenerator = new RandomGenerator();
    }

    @Override
    public boolean accept(String input) {
        return InputWords.greetingWords.contains(input);
    }

    @Override
    public String returnResponse(RecordsContainer recordsContainer, String input) {
        return randomGenerator.getAnswerWord(OutputWords.greetingAnswerWords);
    }
}
