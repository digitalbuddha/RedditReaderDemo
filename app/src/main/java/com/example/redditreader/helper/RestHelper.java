package com.example.redditreader.helper;

import com.example.redditreader.BuildConfig;
import com.example.redditreader.model.Reddit;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Nakhimovich on 3/19/14.
 */
public class RestHelper {
    private static RestHelper ourInstance = new RestHelper();
    private RestTemplate restTemplate;

    public static RestHelper getInstance() {
        return ourInstance;
    }

    private RestHelper() {
        setupRestTemplate();

    }

    private void setupRestTemplate() {
        restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
    }

    public Reddit getPosts()
    {
        String url = BuildConfig.BASE_URL+ BuildConfig.NUMBER_OF_POSTS;
        return restTemplate.getForObject(url,Reddit.class);
    }
}
