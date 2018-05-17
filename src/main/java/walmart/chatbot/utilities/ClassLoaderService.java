package walmart.chatbot.utilities;

import java.util.List;

import walmart.chatbot.core.Response;


public interface ClassLoaderService {
    List<Response> load(String packet);
}
