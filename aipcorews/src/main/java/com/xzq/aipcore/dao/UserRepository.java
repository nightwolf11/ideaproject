package com.xzq.aipcore.dao;

import com.xzq.aipcore.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
