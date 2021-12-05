package hyk.springframework.springbootjokerapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * @author Htoo Yanant Khin
 */
@Service
public class JokeServiceImpl implements JokeService {
    @Override
    public String getJokes() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
