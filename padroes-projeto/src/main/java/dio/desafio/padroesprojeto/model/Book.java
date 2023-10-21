package dio.desafio.padroesprojeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;


@Entity
public class Book {
    @Id
    private Long isbn;
    private String title;
    private List<String> authors; // retorna um author id do site, e.g. https://openlibrary.org/authors/OL34184A
    private String publishDate;
    private List<String> publishers;
    private List<String> languages;
    private String key; // id do livro no site e.g. https://openlibrary.org/books/OL7353617M
    private Integer numberOfPages;

    public Book() {
    }

    public Book(Long isbn, String title, List<String> authors, String publishDate, List<String> publishers, List<String> languages, String key, Integer numberOfPages) {
        this.isbn = isbn;
        this.title = title;
        this.authors = authors;
        this.publishDate = publishDate;
        this.publishers = publishers;
        this.languages = languages;
        this.key = key;
        this.numberOfPages = numberOfPages;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public List<String> getPublishers() {
        return publishers;
    }

    public void setPublishers(List<String> publishers) {
        this.publishers = publishers;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
