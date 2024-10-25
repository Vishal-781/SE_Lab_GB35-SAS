package group35.sas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import group35.sas.models.TransactionsModel;

@Repository
public interface SalesRepository extends JpaRepository<TransactionsModel,Integer>{
}
