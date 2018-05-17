package walmart.chatbot.utilities;

import java.util.List;

import walmart.chatbot.core.Response;

/**
 * Created by YFAN on 5/16/2018.
 */
public interface ClassLoaderService {
    List<Response> load(String packet);
}
