package com.bluntsoftware.historic.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.bluntsoftware.historic.model.Event;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepo extends MongoRepository<Event, String> {
}