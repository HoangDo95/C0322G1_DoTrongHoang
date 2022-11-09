package vn.codegym.pig_farm.repository;

import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StorageRepository extends JpaRepository<EmbeddedMongoProperties.Storage, Integer> {

    @Query(value = "select * from storage", nativeQuery = true)
    List<EmbeddedMongoProperties.Storage> storagePage();

}
