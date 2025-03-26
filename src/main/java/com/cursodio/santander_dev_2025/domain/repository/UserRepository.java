package com.cursodio.santander_dev_2025.domain.repository;

import com.cursodio.santander_dev_2025.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
