package group35.sas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import group35.sas.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel,String> {
}
