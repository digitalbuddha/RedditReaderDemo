
package com.example.redditreader.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "content",
    "width",
    "scrolling",
    "height"
})
public class Media_embed {

    @JsonProperty("content")
    private String content;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("scrolling")
    private Boolean scrolling;
    @JsonProperty("height")
    private Integer height;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    public Media_embed withContent(String content) {
        this.content = content;
        return this;
    }

    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    public Media_embed withWidth(Integer width) {
        this.width = width;
        return this;
    }

    @JsonProperty("scrolling")
    public Boolean getScrolling() {
        return scrolling;
    }

    @JsonProperty("scrolling")
    public void setScrolling(Boolean scrolling) {
        this.scrolling = scrolling;
    }

    public Media_embed withScrolling(Boolean scrolling) {
        this.scrolling = scrolling;
        return this;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    public Media_embed withHeight(Integer height) {
        this.height = height;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
