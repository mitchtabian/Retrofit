package tabian.com.retrofitjson.model.children;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 5/1/2017.
 */

public class Data {

    @SerializedName("contest_mode")
    @Expose
    private String contest_mode;

    @SerializedName("subreddit")
    @Expose
    private String subreddit;

    @SerializedName("author")
    @Expose
    private String author;

    public String getContest_mode() {
        return contest_mode;
    }

    public void setContest_mode(String contest_mode) {
        this.contest_mode = contest_mode;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Data{" +
                "contest_mode='" + contest_mode + '\'' +
                ", subreddit='" + subreddit + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
