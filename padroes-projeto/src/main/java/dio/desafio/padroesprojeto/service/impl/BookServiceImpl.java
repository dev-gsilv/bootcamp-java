package dio.desafio.padroesprojeto.service.impl;

import dio.desafio.padroesprojeto.model.*;
import dio.desafio.padroesprojeto.service.BookService;
import dio.desafio.padroesprojeto.service.OpenLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private OpenLibraryService openLibraryService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BookRepository bookRepository;

    @Override
    public void save(Long isbn) {
        RawBook rawBook;
        try {
            rawBook = openLibraryService.callBookApi(isbn);
        } catch (Exception e) {
            throw new NullPointerException(e.getMessage());
        }
        //printObjectValues(rawBook);

        Book book = findById(isbn);
        if ( book == null) {
            Book newBook = new Book(
                    isbn, //Long.parseLong(rawBook.getIsbn10().get(0)),
                    rawBook.getTitle(),
                    mapToList(rawBook.getAuthors()),
                    rawBook.getPublishDate(),
                    rawBook.getPublishers(),
                    mapToList(rawBook.getLanguages()),
                    rawBook.getKey(),
                    rawBook.getNumberOfPages());
            //printObjectValues(newBook);
            bookRepository.save(newBook);
        }
    }

    @Override
    public void save(Long idUser, Long isbn) {
        Optional<User> userFromDb = userRepository.findById(idUser);

        RawBook rawBook;
        try {
            rawBook = openLibraryService.callBookApi(isbn);
        } catch (Exception e) {
            throw new NullPointerException(e.getMessage());
        }
        //printObjectValues(rawBook);

        Book book = findById(isbn);
        if ( book == null) {
            Book newBook = new Book(
                    isbn, //Long.parseLong(rawBook.getIsbn10().get(0)),
                    rawBook.getTitle(),
                    mapToList(rawBook.getAuthors()),
                    rawBook.getPublishDate(),
                    rawBook.getPublishers(),
                    mapToList(rawBook.getLanguages()),
                    rawBook.getKey(),
                    rawBook.getNumberOfPages());
            //printObjectValues(newBook);
            bookRepository.save(newBook);
            userFromDb.get().setOneBook(newBook);
        }
        else {
            userFromDb.get().setOneBook(book);
        }
        userRepository.save(userFromDb.get());
    }

    @Override
    public Book findById(Long isbn) {
        return bookRepository.findById(isbn).orElse(null);
    }

    @Override
    public void delete(Long idUser, Long isbn) {
        Optional<User> userFromDb = userRepository.findById(idUser);
        userFromDb.get().getBooks().removeIf(book -> book.getIsbn().equals(isbn));
    }

    @Override
    public void deleteAll(Long idUser) {
        Optional<User> userFromDb = userRepository.findById(idUser);
        userFromDb.get().getBooks().clear();
    }

    private static void printObjectValues(Object bookApi) {
        Class<?> bookClass = bookApi.getClass();
        Field[] bookFields = bookClass.getDeclaredFields();

        for (Field property : bookFields) {
            property.setAccessible(true);
            String fieldName = property.getName();

            try {
                Object fieldValue = property.get(bookApi);
                System.out.println(fieldName + ": " + fieldValue);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    private static List<String> mapToList(Map<String, String>[] rawBookPropertyArray){
        List<String> propertyValues = new ArrayList<String>();
        for (Map<String, String> p : rawBookPropertyArray){
            for (Map.Entry<String, String> entry : p.entrySet()) {
                propertyValues.add(entry.getValue());
            }
        }
        return propertyValues;
    }
}
