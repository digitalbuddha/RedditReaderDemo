package com.example.redditreader.helper;

import com.example.redditreader.model.Reddit;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Nakhimovich on 3/19/14.
 */
public class RestHelper {
    private static RestHelper ourInstance = new RestHelper();
    private final RestTemplate restTemplate;

    public static RestHelper getInstance() {
        return ourInstance;
    }

    private RestHelper() {
        restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

    }

    public Reddit getPosts()
    {
        String url = "http://www.reddit.com/r/aww.json?limit=10";
        return restTemplate.getForObject(url,Reddit.class);
    }
}
