package walmart.chatbot.utilities;

import java.util.List;
import java.util.Random;


public class RandomGenerator {

    public String getAnswerWord(List<String> repo) {
        Random r = new Random();
        String answer = repo.get(r.nextInt(repo.size()));

        return answer;
    }
}
