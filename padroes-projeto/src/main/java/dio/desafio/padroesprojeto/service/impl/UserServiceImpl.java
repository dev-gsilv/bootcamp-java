package dio.desafio.padroesprojeto.service.impl;

import dio.desafio.padroesprojeto.model.Book;
import dio.desafio.padroesprojeto.model.User;
import dio.desafio.padroesprojeto.model.UserRepository;
import dio.desafio.padroesprojeto.service.BookService;
import dio.desafio.padroesprojeto.service.OpenLibraryService;
import dio.desafio.padroesprojeto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OpenLibraryService openLibraryService;
    @Autowired
    private BookService bookService;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public String update(Long id, User userRequest) {
        Optional<User> userFromDb = userRepository.findById(id);
        if (userFromDb.isPresent()) {
            if (userRequest.getBooks() != null) {
                Iterator<Book> iterator = userRequest.getBooks().iterator();
                if (iterator.hasNext()) {
                    Book bookToInsert = iterator.next();
                    bookService.save(id, bookToInsert.getIsbn());
                    return "Livro adicionado!";
                }
            }
            userFromDb.get().setName(userRequest.getName());
            userRepository.save(userFromDb.get());
            return "Usuário atualizado com sucesso!";
        }
        return "Usuário não existe!";
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
