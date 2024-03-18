package group35.sas.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users_info")
public class UserModel {

    
    @Id
    private String userId;
    private String userEmail;
    private String userName;
    private String userPassword;
    private boolean isManager;
    UserModel(){}
    
    public UserModel(
        String userId,
        String userEmail,
        String userName,
        String userPassword,
        boolean isManager
    ){
        this.userEmail = userEmail;
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.isManager = isManager;
    }

    public String getUserEmail() {
        return userEmail;
    }
    public String getUserId() {
        return userId;
    }
    public String getUserName() {
        return userName;
    }
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean isManager) {
        this.isManager = isManager;
    }


}