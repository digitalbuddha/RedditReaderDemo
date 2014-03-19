
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
    "type",
    "oembed"
})
public class Media {

    @JsonProperty("type")
    private String type;
    @JsonProperty("oembed")
    private Oembed_ oembed;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Media withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("oembed")
    public Oembed_ getOembed() {
        return oembed;
    }

    @JsonProperty("oembed")
    public void setOembed(Oembed_ oembed) {
        this.oembed = oembed;
    }

    public Media withOembed(Oembed_ oembed) {
        this.oembed = oembed;
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
