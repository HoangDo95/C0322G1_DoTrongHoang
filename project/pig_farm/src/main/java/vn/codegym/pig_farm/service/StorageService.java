package vn.codegym.pig_farm.service;

import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoProperties;

import java.util.List;

public interface StorageService {
    List<EmbeddedMongoProperties.Storage> findAll();
}
