package dio.desafio.padroesprojeto.service;

import dio.desafio.padroesprojeto.model.Book;

public interface BookService {
    void save(Long idUser, Long isbn);

    void save(Long isbn);

    Book findById(Long isbn);

    void delete(Long idUser, Long isbn);

    void deleteAll(Long idUser);
}
