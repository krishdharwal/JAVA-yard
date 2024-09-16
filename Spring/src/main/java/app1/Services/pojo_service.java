//package app1.Services;
//
//import app1.POJO.pojo;
//import app1.Repositories.Mongo_repo_pojo;
//import org.bson.types.ObjectId;
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
////import org.springframework.security.crypto.password.PasswordEncoder;
////import org.springframework.stereotype.Component;
////import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
////import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//// all the methods
//
//@Component
//public class pojo_service {
//
//    @Autowired
//    public Mongo_repo_pojo repo;
//
//
//    public void save(pojo user) {
//        repo.save(user);
//    }
//
//    public List<pojo> giveAll() {
//        return repo.findAll();
//    }
//
//
//
//    public void update(pojo Guser ,pojo Nuser) {
//        if (Guser != null && Nuser != null){
//            Guser.setName(Nuser.getName());
//            Guser.setPassword(Nuser.getPassword());
//            repo.save(Guser);
//        }
//    }
//
//    public pojo getById(ObjectId id) {
//        return repo.findById(id).orElse(null);
//    }
//
//    public void delete(ObjectId id) {
//        repo.deleteById(id);
//    }
//
//
//}
