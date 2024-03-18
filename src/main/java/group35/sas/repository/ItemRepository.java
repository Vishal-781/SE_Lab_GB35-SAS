package group35.sas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import group35.sas.models.ItemModel;

public interface ItemRepository extends JpaRepository<ItemModel,String>{
}
