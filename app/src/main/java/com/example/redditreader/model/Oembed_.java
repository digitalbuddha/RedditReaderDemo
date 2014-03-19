
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
    "provider_url",
    "description",
    "title",
    "url",
    "author_name",
    "height",
    "width",
    "html",
    "thumbnail_width",
    "version",
    "provider_name",
    "thumbnail_url",
    "type",
    "thumbnail_height",
    "author_url"
})
public class Oembed_ {

    @JsonProperty("provider_url")
    private String provider_url;
    @JsonProperty("description")
    private String description;
    @JsonProperty("title")
    private String title;
    @JsonProperty("url")
    private String url;
    @JsonProperty("author_name")
    private String author_name;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("html")
    private String html;
    @JsonProperty("thumbnail_width")
    private Integer thumbnail_width;
    @JsonProperty("version")
    private String version;
    @JsonProperty("provider_name")
    private String provider_name;
    @JsonProperty("thumbnail_url")
    private String thumbnail_url;
    @JsonProperty("type")
    private String type;
    @JsonProperty("thumbnail_height")
    private Integer thumbnail_height;
    @JsonProperty("author_url")
    private String author_url;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("provider_url")
    public String getProvider_url() {
        return provider_url;
    }

    @JsonProperty("provider_url")
    public void setProvider_url(String provider_url) {
        this.provider_url = provider_url;
    }

    public Oembed_ withProvider_url(String provider_url) {
        this.provider_url = provider_url;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Oembed_ withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Oembed_ withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Oembed_ withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("author_name")
    public String getAuthor_name() {
        return author_name;
    }

    @JsonProperty("author_name")
    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public Oembed_ withAuthor_name(String author_name) {
        this.author_name = author_name;
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

    public Oembed_ withHeight(Integer height) {
        this.height = height;
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

    public Oembed_ withWidth(Integer width) {
        this.width = width;
        return this;
    }

    @JsonProperty("html")
    public String getHtml() {
        return html;
    }

    @JsonProperty("html")
    public void setHtml(String html) {
        this.html = html;
    }

    public Oembed_ withHtml(String html) {
        this.html = html;
        return this;
    }

    @JsonProperty("thumbnail_width")
    public Integer getThumbnail_width() {
        return thumbnail_width;
    }

    @JsonProperty("thumbnail_width")
    public void setThumbnail_width(Integer thumbnail_width) {
        this.thumbnail_width = thumbnail_width;
    }

    public Oembed_ withThumbnail_width(Integer thumbnail_width) {
        this.thumbnail_width = thumbnail_width;
        return this;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    public Oembed_ withVersion(String version) {
        this.version = version;
        return this;
    }

    @JsonProperty("provider_name")
    public String getProvider_name() {
        return provider_name;
    }

    @JsonProperty("provider_name")
    public void setProvider_name(String provider_name) {
        this.provider_name = provider_name;
    }

    public Oembed_ withProvider_name(String provider_name) {
        this.provider_name = provider_name;
        return this;
    }

    @JsonProperty("thumbnail_url")
    public String getThumbnail_url() {
        return thumbnail_url;
    }

    @JsonProperty("thumbnail_url")
    public void setThumbnail_url(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url;
    }

    public Oembed_ withThumbnail_url(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Oembed_ withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("thumbnail_height")
    public Integer getThumbnail_height() {
        return thumbnail_height;
    }

    @JsonProperty("thumbnail_height")
    public void setThumbnail_height(Integer thumbnail_height) {
        this.thumbnail_height = thumbnail_height;
    }

    public Oembed_ withThumbnail_height(Integer thumbnail_height) {
        this.thumbnail_height = thumbnail_height;
        return this;
    }

    @JsonProperty("author_url")
    public String getAuthor_url() {
        return author_url;
    }

    @JsonProperty("author_url")
    public void setAuthor_url(String author_url) {
        this.author_url = author_url;
    }

    public Oembed_ withAuthor_url(String author_url) {
        this.author_url = author_url;
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
