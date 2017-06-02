package com.xzq.aipcore.dao.primary;

import com.xzq.aipcore.domain.primary.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
