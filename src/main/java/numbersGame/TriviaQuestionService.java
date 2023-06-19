package numbersGame;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.tuple.Pair;


import java.io.IOException;
import java.net.URI;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;



public class TriviaQuestionService {

    public Pair<Integer, String> getAnswerAndQuestion(String api) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().GET().header("accept", "app/json").uri(URI.create(api)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper mapper = new ObjectMapper();
        Post post = mapper.readValue(response.body(), new TypeReference<Post>(){});

        return Pair.of(post.getNumber(), HelperClass.formatTriviaText(post.getText()));
    }
}
