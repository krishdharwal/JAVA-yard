package app1.Services;

import app1.POJO.user2;
import app1.Repositories.user2_m;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class user2_service {

    @Autowired
    private user2_m repo;
    public List<user2> findAll() {
        return repo.findAll();
    }

    public void save(user2 body) {
        repo.save(body);
    }

    public List<user2> findbyname(String name){
        return repo.findByname(name);
    }
}
