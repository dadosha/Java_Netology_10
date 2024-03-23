package ru.netology.java10;

public class PosterItem {
    public int id;
    public String title;
    public int releaseYear;
    public String imageUrl;

    public PosterItem(int id, String title, int releaseYear, String imageUrl) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
