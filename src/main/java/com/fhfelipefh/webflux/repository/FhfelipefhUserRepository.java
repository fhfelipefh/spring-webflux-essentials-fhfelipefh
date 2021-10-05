package com.fhfelipefh.webflux.repository;

import com.fhfelipefh.webflux.model.Anime;
import com.fhfelipefh.webflux.model.FhfelipefhUser;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface FhfelipefhUserRepository extends ReactiveCrudRepository<FhfelipefhUser, Integer> {

    Mono<FhfelipefhUser> findByUsername(String username);

}
