package dio.desafio.padroesprojeto.service;

import dio.desafio.padroesprojeto.model.RawBook;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "openlibrary", url = "https://openlibrary.org")
public interface OpenLibraryService {
    @GetMapping("/isbn/{isbn}.json")
    RawBook callBookApi(@PathVariable("isbn") Long isbn);
}
