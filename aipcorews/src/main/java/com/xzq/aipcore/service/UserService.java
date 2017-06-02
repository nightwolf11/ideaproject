package com.xzq.aipcore.service;

import com.xzq.aipcore.domain.primary.User;


public interface UserService {
    public User add(User user);
    public String delById(Long id);
    public User findById(Long id);
}
