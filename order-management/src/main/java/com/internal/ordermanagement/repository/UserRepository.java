package com.internal.ordermanagement.repository;

import com.internal.ordermanagement.entity.AppUser; // <-- import added
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Long> {
}
