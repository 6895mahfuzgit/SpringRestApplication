package com.SpringRestApplication.topics;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by user on 13-Jan-17.
 */
@Repository
public interface TopicRepository extends CrudRepository<Topic,String> {
}
