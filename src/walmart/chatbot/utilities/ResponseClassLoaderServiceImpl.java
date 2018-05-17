package walmart.chatbot.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import walmart.chatbot.core.AddingNewRecordResponse;
import walmart.chatbot.core.GreetingResponse;
import walmart.chatbot.core.HelperGuideResponse;
import walmart.chatbot.core.IdResponse;
import walmart.chatbot.core.NameResponse;
import walmart.chatbot.core.PhoneNumberResponse;
import walmart.chatbot.core.Response;
import walmart.chatbot.core.RestartResponse;
import walmart.chatbot.core.TerminationResponse;
import org.reflections.Reflections;


public class ResponseClassLoaderServiceImpl implements ClassLoaderService {

    /*public void load() throws IllegalAccessException, InstantiationException {
        Reflections reflections = new Reflections("walmart.chatbot.response");
        Set<Class<? extends Response>> classes = reflections.getSubTypesOf(Response.class);

        List<Response> list = new ArrayList<>();

        for(Class c: classes) {
            list.add((Response) c.newInstance());
        }
    }
*/

    @Override
    public List<Response> load(String packet) {
        List<Response> list = new ArrayList<>();

        AddingNewRecordResponse ar = new AddingNewRecordResponse();
        list.add(ar);

        GreetingResponse gr = new GreetingResponse();
        list.add(gr);

        RestartResponse rr = new RestartResponse();
        list.add(rr);

        TerminationResponse tr = new TerminationResponse();
        list.add(tr);

        HelperGuideResponse hr = new HelperGuideResponse();
        list.add(hr);

        IdResponse ir = new IdResponse();
        list.add(ir);

        NameResponse nr = new NameResponse();
        list.add(nr);

        PhoneNumberResponse pm = new PhoneNumberResponse();
        list.add(pm);

        return list;
    }
}
