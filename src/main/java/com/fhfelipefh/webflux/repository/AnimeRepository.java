package com.fhfelipefh.webflux.repository;

import com.fhfelipefh.webflux.model.Anime;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface AnimeRepository extends ReactiveCrudRepository<Anime, Integer> {

    Mono<Anime> findById(int id);
}
