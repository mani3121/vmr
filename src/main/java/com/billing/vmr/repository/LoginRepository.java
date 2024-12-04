package com.billing.vmr.repository;

import com.billing.vmr.collection.Login;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends MongoRepository<Login,String> {
    Login findByUserNameAndPassword(String userName,String password);
}
