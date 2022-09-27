package io.codelex.classesandobjects.practice.videostore;

public class Video {
    String title;
    public boolean isCheckedOut;
    int rating;

    public Video(String title, boolean isCheckedOut, int rating) {
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                ", rating=" + rating +
                '}';
    }
}
