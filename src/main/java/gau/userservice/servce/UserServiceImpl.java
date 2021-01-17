package gau.userservice.servce;

import gau.userservice.model.User;
import gau.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {
    @Autowired
    UserRepository userRepository;

    public User saveUser(User user){
       return userRepository.save(user);
    }
    public List<User> findAll(){
        return userRepository.findAll();
    }
}
