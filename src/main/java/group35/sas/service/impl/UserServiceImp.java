package group35.sas.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import group35.sas.models.UserModel;
import group35.sas.repository.UserRepository;
import group35.sas.service.UserService;

@Service
public class UserServiceImp implements UserService {

    UserRepository userRepository;

   public UserServiceImp(UserRepository userRepository){
    this.userRepository = userRepository;
   }

    @Override
    public String createUser(UserModel userModel) {
         // More bussiness logic
        userRepository.save(userModel);
        return "Success";
    }

    @Override
    public String deleteUser(String userId) {
         // More bussiness logic
        userRepository.deleteById(userId);
        return "Success";
    }

    @Override
    public List<UserModel> getAllUsers() {
         // More bussiness logic
        return userRepository.findAll();
    }

    @Override
    public UserModel getUser(String userId) {
         // More bussiness logic
        return userRepository.findById(userId).get();
    }

    @Override
    public String updateUser(UserModel userModel) {
        // More bussiness logic
        userRepository.save(userModel);
        return "Success";
    }
    
}
