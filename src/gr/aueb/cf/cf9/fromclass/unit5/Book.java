package gr.aueb.cf.cf9.fromclass.unit5;

public class Book {

    private String title;
    private String author;
    private String isbn;
    private String year;
    private String category;
    private String publisher;

    private Book() {}

    private Book(String title, String author, String isbn, String year, String category, String publisher) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.category = category;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getYear() {
        return year;
    }

    public String getCategory() {
        return category;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", year='" + year + '\'' +
                ", category='" + category + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public static class Builder {
        private String title;
        private String author;
        private String isbn;
        private String year;
        private String category;
        private String publisher;

        public Builder() {}

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder isbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public Builder year(String year) {
            this.year = year;
            return this;
        }

        public Builder category(String category) {
            this.category = category;
            return this;
        }

        public Builder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Book build(){
            return new Book(title, author, isbn, year, category, publisher);
        }


    }
}
