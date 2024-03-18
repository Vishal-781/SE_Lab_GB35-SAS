package group35.sas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import group35.sas.models.SalesModel;

public interface SalesRepository extends JpaRepository<SalesModel,String>{
}
