package walmart.chatbot.core;

import java.util.List;

import walmart.chatbot.response.HelperGuideResponse;
import walmart.chatbot.utilities.ClassLoaderService;
import walmart.chatbot.utilities.InputProperties;
import walmart.chatbot.utilities.ResponseClassLoaderServiceImpl;


public class ResponseStrategy {
    private List<Response> responseList;
    private ClassLoaderService classLoaderService;

    public ResponseStrategy() {
        this.classLoaderService = new ResponseClassLoaderServiceImpl();
        this.responseList = classLoaderService.load(InputProperties.RESPONSE_LIST_PATH);
    }

    public Response analyze(String input) {
        input = input == null || input.trim().length() == 0 ? "h" : input.trim().toLowerCase();
        return findMatchedResponse(responseList, input);

    }

    private Response findMatchedResponse(List<? extends Response> matchers, String input) {
        for (Response re : matchers) {
            if (re.accept(input)) {
                return re;
            }
        }

        return new HelperGuideResponse();
    }
}
