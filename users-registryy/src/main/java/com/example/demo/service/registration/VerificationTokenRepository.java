package com.example.demo.service.registration;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
 VerificationToken findByToken(String token);
}