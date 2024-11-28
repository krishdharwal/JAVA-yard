package app1.POJO;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user2_data")
@Data
public class user2 {
    @Id
    private ObjectId id;
    private String name;
    private String password;
}
