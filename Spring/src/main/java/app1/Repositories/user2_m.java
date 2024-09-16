package app1.Repositories;

import app1.POJO.user2;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface user2_m extends MongoRepository<user2, ObjectId> {
  public List<user2> findByname(String name);
}
