package com.xzq.aipcore.service.impl;

import com.xzq.aipcore.dao.primary.UserRepository;
import com.xzq.aipcore.domain.primary.User;
import com.xzq.aipcore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User add(User user) {
         user = userRepository.save(user);
        return user;
    }

    @Override
    public String delById(Long id) {
        User user = findById(id);
       userRepository.deleteById(id);
       return "É¾³ý³É¹¦£º"+user.toString();
    }

    @Override
    public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }
}
