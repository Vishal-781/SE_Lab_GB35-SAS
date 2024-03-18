package group35.sas.service;

import java.util.List;

import group35.sas.models.UserModel;

public interface UserService {
    public String createUser(UserModel userModel);
    public String updateUser(UserModel userModel);
    public String deleteUser(String userId);
    public UserModel getUser(String userId);
    public List<UserModel> getAllUsers();
}
