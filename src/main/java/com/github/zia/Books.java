package com.github.zia;

public class Books  {
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;
    public Books(int id, String title, String author) {
        this.setId(id);
        this.setTitle(title);
        this.setAuthor(author);
        this.isAvailable = true;
    }
    public int getId() {return id;}
    public void setId(int id) {
        if (id <= 0 ) {
            throw new IllegalArgumentException("ID cannot be less than 0.");
        }
        this.id = id;
    }
    public String getTitle() {return title;}
    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty.");
        }
        this.title = title;
    }
    public String getAuthor() {return author;}
    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Author cannot be empty.");
        }
        this.author = author;
    }
    public boolean isAvailable() {return isAvailable;}
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}