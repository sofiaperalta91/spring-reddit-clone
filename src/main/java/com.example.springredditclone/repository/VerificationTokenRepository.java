package com.example.springredditclone.repository;

import com.example.springredditclone.model.VerificationToken;

import java.util.Optional;

public interface VerificationTokenRepository {
    Optional<VerificationToken> findByToken(String token);
}
