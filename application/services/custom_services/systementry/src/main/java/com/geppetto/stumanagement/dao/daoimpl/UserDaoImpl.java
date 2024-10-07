package com.geppetto.stumanagement.dao.daoimpl;

import com.geppetto.stumanagement.model.User;
import com.geppetto.stumanagement.repository.UserRepository;
import com.geppetto.stumanagement.dao.UserDao;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao{

    private final UserRepository userRepository;

     public UserDaoImpl(UserRepository userRepository) {
       this.userRepository = userRepository;
}





}
