package com.fhfelipefh.webflux.service;

import com.fhfelipefh.webflux.repository.FhfelipefhUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class FhfelipefhUserDetailsService implements ReactiveUserDetailsService {

    private final FhfelipefhUserRepository fhfelipefhUserRepository;

    @Override
    public Mono<UserDetails> findByUsername(String s) {
        return fhfelipefhUserRepository.findByUsername(s).cast(UserDetails.class);
    }
}
