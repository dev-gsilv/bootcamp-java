package dio.desafio.padroesprojeto.service;

import dio.desafio.padroesprojeto.model.User;


public interface UserService {
    void save(User user);

    User findById(Long id);

    Iterable<User> findAll();

    String update(Long id, User user);

    void delete(Long id);
}
