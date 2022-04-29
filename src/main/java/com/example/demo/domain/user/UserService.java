package com.example.demo.domain.user;

import com.example.demo.service.register.NewUserRequest;
import com.example.demo.validation.ValidationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserRepository userRepository;

    @Resource
    private ValidationService validationService;

    public User getUser(NewUserRequest request) {
        return userRepository.findByUserName(request.getUserName());
    }

    public User addNewUser(NewUserRequest request) {
        User user = userMapper.toEntity(request);
        boolean customerExists = userRepository.existsByUserName(request.getUserName());
        validationService.userNameExists(customerExists, request.getUserName());
        userRepository.save(user);
        return user;
    }

    public User findUserByNameAndPassword(String name, String password) {
        User user = userRepository.findByUserNameAndPassword(name, password);
        return user;
    }
}