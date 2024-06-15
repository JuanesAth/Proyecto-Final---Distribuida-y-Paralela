package com.unipark.demo.Repository;

import com.unipark.demo.Models.Record;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecordRepository extends MongoRepository<Record,String> {
}
