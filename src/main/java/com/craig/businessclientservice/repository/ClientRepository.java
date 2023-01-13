package com.craig.businessclientservice.repository;

import com.craig.businessclientservice.model.Client;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends MongoRepository<Client, Integer> {
    @Aggregation(pipeline = {"{$group: { _id: '', total: {$avg: $age }}}"})
    Integer avg(Integer age);

    @Aggregation(pipeline = {"{$group: { _id: '', total: {$sum: $age}}}"})
    Double sumAge();

    @Query(value = "{ '_id' : {'$in' : ?0 } }", fields = "{ 'name': 0 }")
    Integer[] ages();


}
