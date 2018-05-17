package walmart.chatbot.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.reflections.Reflections;
import walmart.chatbot.core.Response;


public class ResponseClassLoaderServiceImpl implements ClassLoaderService {

    @Override
    public List<Response> load(String packet) {

        Reflections reflections = new Reflections(packet);
        Set<Class<? extends Response>> classes = reflections.getSubTypesOf(Response.class);

        List<Response> list = new ArrayList<>();

        for(Class c: classes) {
            try {
                list.add((Response) c.newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return list;
    }
}
