package dio.desafio.padroesprojeto.model;

import java.util.List;
import java.util.Map;

public class RawBook {
    private Object identifiers;
    private String title;
    private Map<String, String>[] authors;
    private String publishDate;
    private List<String> publishers;
    private List<Integer> covers;
    private List<String> contributions;
    private Map<String, String>[] languages;
    private List<String> sourceRecords;
    private List<String> localId;
    private Object type;
    private Object firstSentence;
    private String key;
    private Integer numberOfPages;
    private Object works;
    private Object classifications;
    private String ocaid;
    private List<String> isbn10;
    private List<String> isbn13;
    private int latestRevision;
    private int revision;
    private Object created;
    private Object lastModified;

    private RawBook() {
    }

    public Object getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(Object identifiers) {
        this.identifiers = identifiers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Map<String, String>[] getAuthors() {
        return authors;
    }

    public void setAuthors(Map<String, String>[] authors) {
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

    public List<Integer> getCovers() {
        return covers;
    }

    public void setCovers(List<Integer> covers) {
        this.covers = covers;
    }

    public List<String> getContributions() {
        return contributions;
    }

    public void setContributions(List<String> contributions) {
        this.contributions = contributions;
    }

    public Map<String, String>[] getLanguages() {
        return languages;
    }

    public void setLanguages(Map<String, String>[] languages) {
        this.languages = languages;
    }

    public List<String> getSourceRecords() {
        return sourceRecords;
    }

    public void setSourceRecords(List<String> sourceRecords) {
        this.sourceRecords = sourceRecords;
    }

    public List<String> getLocalId() {
        return localId;
    }

    public void setLocalId(List<String> localId) {
        this.localId = localId;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Object getFirstSentence() {
        return firstSentence;
    }

    public void setFirstSentence(Object firstSentence) {
        this.firstSentence = firstSentence;
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

    public Object getWorks() {
        return works;
    }

    public void setWorks(Object works) {
        this.works = works;
    }

    public Object getClassifications() {
        return classifications;
    }

    public void setClassifications(Object classifications) {
        this.classifications = classifications;
    }

    public String getOcaid() {
        return ocaid;
    }

    public void setOcaid(String ocaid) {
        this.ocaid = ocaid;
    }

    public List<String> getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(List<String> isbn10) {
        this.isbn10 = isbn10;
    }

    public List<String> getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(List<String> isbn13) {
        this.isbn13 = isbn13;
    }

    public int getLatestRevision() {
        return latestRevision;
    }

    public void setLatestRevision(int latestRevision) {
        this.latestRevision = latestRevision;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }

    public Object getCreated() {
        return created;
    }

    public void setCreated(Object created) {
        this.created = created;
    }

    public Object getLastModified() {
        return lastModified;
    }

    public void setLastModified(Object lastModified) {
        this.lastModified = lastModified;
    }
}
