package vn.codegym.pig_farm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoProperties;
import org.springframework.stereotype.Service;
import vn.codegym.pig_farm.repository.StorageRepository;
import vn.codegym.pig_farm.service.StorageService;

import java.util.List;

@Service
public class StorageServiceImpl implements StorageService {
    @Autowired
    StorageRepository storageRepository;
    @Override
    public List<EmbeddedMongoProperties.Storage> findAll() {
        return storageRepository.storagePage();
    }
}
