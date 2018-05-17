package walmart.chatbot.utilities;

import java.util.List;
import java.util.Random;

/**
 * Created by YFAN on 5/16/2018.
 */
public class RandomGenerator {

    public String getAnswerWord(String input, List<String> repo) {
        Random r = new Random();
        String answer = repo.get(r.nextInt(repo.size()));
        //System.out.println(answer);

        return answer;
    }
}
