
package com.example.redditreader.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties("edited")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "domain",
    "banned_by",
    "media_embed",
    "subreddit",
    "selftext_html",
    "selftext",
    "likes",
    "secure_media",
    "link_flair_text",
    "id",
    "gilded",
    "secure_media_embed",
    "clicked",
    "stickied",
    "author",
    "media",
    "score",
    "approved_by",
    "over_18",
    "hidden",
    "thumbnail",
    "subreddit_id",
    "edited",
    "link_flair_css_class",
    "author_flair_css_class",
    "downs",
    "saved",
    "is_self",
    "permalink",
    "name",
    "created",
    "url",
    "author_flair_text",
    "title",
    "created_utc",
    "ups",
    "num_comments",
    "visited",
    "num_reports",
    "distinguished"
})
public class Data_ {

    @JsonProperty("domain")
    private String domain;
    @JsonProperty("banned_by")
    private Object banned_by;
    @JsonProperty("media_embed")
    private Media_embed media_embed;
    @JsonProperty("subreddit")
    private String subreddit;
    @JsonProperty("selftext_html")
    private Object selftext_html;
    @JsonProperty("selftext")
    private String selftext;
    @JsonProperty("likes")
    private Object likes;
    @JsonProperty("secure_media")
    private Secure_media secure_media;
    @JsonProperty("link_flair_text")
    private Object link_flair_text;
    @JsonProperty("id")
    private String id;
    @JsonProperty("gilded")
    private Integer gilded;
    @JsonProperty("secure_media_embed")
    private Secure_media_embed secure_media_embed;
    @JsonProperty("clicked")
    private Boolean clicked;
    @JsonProperty("stickied")
    private Boolean stickied;
    @JsonProperty("author")
    private String author;
    @JsonProperty("media")
    private Media media;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("approved_by")
    private Object approved_by;
    @JsonProperty("over_18")
    private Boolean over_18;
    @JsonProperty("hidden")
    private Boolean hidden;
    @JsonProperty("thumbnail")
    private String thumbnail;
    @JsonProperty("subreddit_id")
    private String subreddit_id;
    @JsonProperty("edited")
    private Boolean edited;
    @JsonProperty("link_flair_css_class")
    private Object link_flair_css_class;
    @JsonProperty("author_flair_css_class")
    private Object author_flair_css_class;
    @JsonProperty("downs")
    private Integer downs;
    @JsonProperty("saved")
    private Boolean saved;
    @JsonProperty("is_self")
    private Boolean is_self;
    @JsonProperty("permalink")
    private String permalink;
    @JsonProperty("name")
    private String name;
    @JsonProperty("created")
    private Double created;
    @JsonProperty("url")
    private String url;
    @JsonProperty("author_flair_text")
    private Object author_flair_text;
    @JsonProperty("title")
    private String title;
    @JsonProperty("created_utc")
    private Double created_utc;
    @JsonProperty("ups")
    private Integer ups;
    @JsonProperty("num_comments")
    private Integer num_comments;
    @JsonProperty("visited")
    private Boolean visited;
    @JsonProperty("num_reports")
    private Object num_reports;
    @JsonProperty("distinguished")
    private Object distinguished;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Data_ withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    @JsonProperty("banned_by")
    public Object getBanned_by() {
        return banned_by;
    }

    @JsonProperty("banned_by")
    public void setBanned_by(Object banned_by) {
        this.banned_by = banned_by;
    }

    public Data_ withBanned_by(Object banned_by) {
        this.banned_by = banned_by;
        return this;
    }

    @JsonProperty("media_embed")
    public Media_embed getMedia_embed() {
        return media_embed;
    }

    @JsonProperty("media_embed")
    public void setMedia_embed(Media_embed media_embed) {
        this.media_embed = media_embed;
    }

    public Data_ withMedia_embed(Media_embed media_embed) {
        this.media_embed = media_embed;
        return this;
    }

    @JsonProperty("subreddit")
    public String getSubreddit() {
        return subreddit;
    }

    @JsonProperty("subreddit")
    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }

    public Data_ withSubreddit(String subreddit) {
        this.subreddit = subreddit;
        return this;
    }

    @JsonProperty("selftext_html")
    public Object getSelftext_html() {
        return selftext_html;
    }

    @JsonProperty("selftext_html")
    public void setSelftext_html(Object selftext_html) {
        this.selftext_html = selftext_html;
    }

    public Data_ withSelftext_html(Object selftext_html) {
        this.selftext_html = selftext_html;
        return this;
    }

    @JsonProperty("selftext")
    public String getSelftext() {
        return selftext;
    }

    @JsonProperty("selftext")
    public void setSelftext(String selftext) {
        this.selftext = selftext;
    }

    public Data_ withSelftext(String selftext) {
        this.selftext = selftext;
        return this;
    }

    @JsonProperty("likes")
    public Object getLikes() {
        return likes;
    }

    @JsonProperty("likes")
    public void setLikes(Object likes) {
        this.likes = likes;
    }

    public Data_ withLikes(Object likes) {
        this.likes = likes;
        return this;
    }

    @JsonProperty("secure_media")
    public Secure_media getSecure_media() {
        return secure_media;
    }

    @JsonProperty("secure_media")
    public void setSecure_media(Secure_media secure_media) {
        this.secure_media = secure_media;
    }

    public Data_ withSecure_media(Secure_media secure_media) {
        this.secure_media = secure_media;
        return this;
    }

    @JsonProperty("link_flair_text")
    public Object getLink_flair_text() {
        return link_flair_text;
    }

    @JsonProperty("link_flair_text")
    public void setLink_flair_text(Object link_flair_text) {
        this.link_flair_text = link_flair_text;
    }

    public Data_ withLink_flair_text(Object link_flair_text) {
        this.link_flair_text = link_flair_text;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Data_ withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("gilded")
    public Integer getGilded() {
        return gilded;
    }

    @JsonProperty("gilded")
    public void setGilded(Integer gilded) {
        this.gilded = gilded;
    }

    public Data_ withGilded(Integer gilded) {
        this.gilded = gilded;
        return this;
    }

    @JsonProperty("secure_media_embed")
    public Secure_media_embed getSecure_media_embed() {
        return secure_media_embed;
    }

    @JsonProperty("secure_media_embed")
    public void setSecure_media_embed(Secure_media_embed secure_media_embed) {
        this.secure_media_embed = secure_media_embed;
    }

    public Data_ withSecure_media_embed(Secure_media_embed secure_media_embed) {
        this.secure_media_embed = secure_media_embed;
        return this;
    }

    @JsonProperty("clicked")
    public Boolean getClicked() {
        return clicked;
    }

    @JsonProperty("clicked")
    public void setClicked(Boolean clicked) {
        this.clicked = clicked;
    }

    public Data_ withClicked(Boolean clicked) {
        this.clicked = clicked;
        return this;
    }

    @JsonProperty("stickied")
    public Boolean getStickied() {
        return stickied;
    }

    @JsonProperty("stickied")
    public void setStickied(Boolean stickied) {
        this.stickied = stickied;
    }

    public Data_ withStickied(Boolean stickied) {
        this.stickied = stickied;
        return this;
    }

    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(String author) {
        this.author = author;
    }

    public Data_ withAuthor(String author) {
        this.author = author;
        return this;
    }

    @JsonProperty("media")
    public Media getMedia() {
        return media;
    }

    @JsonProperty("media")
    public void setMedia(Media media) {
        this.media = media;
    }

    public Data_ withMedia(Media media) {
        this.media = media;
        return this;
    }

    @JsonProperty("score")
    public Integer getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    public Data_ withScore(Integer score) {
        this.score = score;
        return this;
    }

    @JsonProperty("approved_by")
    public Object getApproved_by() {
        return approved_by;
    }

    @JsonProperty("approved_by")
    public void setApproved_by(Object approved_by) {
        this.approved_by = approved_by;
    }

    public Data_ withApproved_by(Object approved_by) {
        this.approved_by = approved_by;
        return this;
    }

    @JsonProperty("over_18")
    public Boolean getOver_18() {
        return over_18;
    }

    @JsonProperty("over_18")
    public void setOver_18(Boolean over_18) {
        this.over_18 = over_18;
    }

    public Data_ withOver_18(Boolean over_18) {
        this.over_18 = over_18;
        return this;
    }

    @JsonProperty("hidden")
    public Boolean getHidden() {
        return hidden;
    }

    @JsonProperty("hidden")
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Data_ withHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    @JsonProperty("thumbnail")
    public String getThumbnail() {
        return thumbnail;
    }

    @JsonProperty("thumbnail")
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Data_ withThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    @JsonProperty("subreddit_id")
    public String getSubreddit_id() {
        return subreddit_id;
    }

    @JsonProperty("subreddit_id")
    public void setSubreddit_id(String subreddit_id) {
        this.subreddit_id = subreddit_id;
    }

    public Data_ withSubreddit_id(String subreddit_id) {
        this.subreddit_id = subreddit_id;
        return this;
    }

    @JsonProperty("edited")
    public Boolean getEdited() {
        return edited;
    }

    @JsonProperty("edited")
    public void setEdited(Boolean edited) {
        this.edited = edited;
    }

    public Data_ withEdited(Boolean edited) {
        this.edited = edited;
        return this;
    }

    @JsonProperty("link_flair_css_class")
    public Object getLink_flair_css_class() {
        return link_flair_css_class;
    }

    @JsonProperty("link_flair_css_class")
    public void setLink_flair_css_class(Object link_flair_css_class) {
        this.link_flair_css_class = link_flair_css_class;
    }

    public Data_ withLink_flair_css_class(Object link_flair_css_class) {
        this.link_flair_css_class = link_flair_css_class;
        return this;
    }

    @JsonProperty("author_flair_css_class")
    public Object getAuthor_flair_css_class() {
        return author_flair_css_class;
    }

    @JsonProperty("author_flair_css_class")
    public void setAuthor_flair_css_class(Object author_flair_css_class) {
        this.author_flair_css_class = author_flair_css_class;
    }

    public Data_ withAuthor_flair_css_class(Object author_flair_css_class) {
        this.author_flair_css_class = author_flair_css_class;
        return this;
    }

    @JsonProperty("downs")
    public Integer getDowns() {
        return downs;
    }

    @JsonProperty("downs")
    public void setDowns(Integer downs) {
        this.downs = downs;
    }

    public Data_ withDowns(Integer downs) {
        this.downs = downs;
        return this;
    }

    @JsonProperty("saved")
    public Boolean getSaved() {
        return saved;
    }

    @JsonProperty("saved")
    public void setSaved(Boolean saved) {
        this.saved = saved;
    }

    public Data_ withSaved(Boolean saved) {
        this.saved = saved;
        return this;
    }

    @JsonProperty("is_self")
    public Boolean getIs_self() {
        return is_self;
    }

    @JsonProperty("is_self")
    public void setIs_self(Boolean is_self) {
        this.is_self = is_self;
    }

    public Data_ withIs_self(Boolean is_self) {
        this.is_self = is_self;
        return this;
    }

    @JsonProperty("permalink")
    public String getPermalink() {
        return permalink;
    }

    @JsonProperty("permalink")
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public Data_ withPermalink(String permalink) {
        this.permalink = permalink;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Data_ withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("created")
    public Double getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(Double created) {
        this.created = created;
    }

    public Data_ withCreated(Double created) {
        this.created = created;
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

    public Data_ withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("author_flair_text")
    public Object getAuthor_flair_text() {
        return author_flair_text;
    }

    @JsonProperty("author_flair_text")
    public void setAuthor_flair_text(Object author_flair_text) {
        this.author_flair_text = author_flair_text;
    }

    public Data_ withAuthor_flair_text(Object author_flair_text) {
        this.author_flair_text = author_flair_text;
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

    public Data_ withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("created_utc")
    public Double getCreated_utc() {
        return created_utc;
    }

    @JsonProperty("created_utc")
    public void setCreated_utc(Double created_utc) {
        this.created_utc = created_utc;
    }

    public Data_ withCreated_utc(Double created_utc) {
        this.created_utc = created_utc;
        return this;
    }

    @JsonProperty("ups")
    public Integer getUps() {
        return ups;
    }

    @JsonProperty("ups")
    public void setUps(Integer ups) {
        this.ups = ups;
    }

    public Data_ withUps(Integer ups) {
        this.ups = ups;
        return this;
    }

    @JsonProperty("num_comments")
    public Integer getNum_comments() {
        return num_comments;
    }

    @JsonProperty("num_comments")
    public void setNum_comments(Integer num_comments) {
        this.num_comments = num_comments;
    }

    public Data_ withNum_comments(Integer num_comments) {
        this.num_comments = num_comments;
        return this;
    }

    @JsonProperty("visited")
    public Boolean getVisited() {
        return visited;
    }

    @JsonProperty("visited")
    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    public Data_ withVisited(Boolean visited) {
        this.visited = visited;
        return this;
    }

    @JsonProperty("num_reports")
    public Object getNum_reports() {
        return num_reports;
    }

    @JsonProperty("num_reports")
    public void setNum_reports(Object num_reports) {
        this.num_reports = num_reports;
    }

    public Data_ withNum_reports(Object num_reports) {
        this.num_reports = num_reports;
        return this;
    }

    @JsonProperty("distinguished")
    public Object getDistinguished() {
        return distinguished;
    }

    @JsonProperty("distinguished")
    public void setDistinguished(Object distinguished) {
        this.distinguished = distinguished;
    }

    public Data_ withDistinguished(Object distinguished) {
        this.distinguished = distinguished;
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
