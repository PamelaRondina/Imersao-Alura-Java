package br.com.alura.linguagensapi;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LInguagemRepository extends MongoRepository<Linguagem, String> {
    
}
