//package app1.Services;
//
//import app1.POJO.user;
//import app1.Repositories.Mongo_repo_user;
//import org.bson.types.ObjectId;
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
////import org.springframework.security.crypto.password.PasswordEncoder;
////import org.springframework.stereotype.Component;
////import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
////import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//// all the methods
//
//@Component
//public class user_service {
//
//    @Autowired
//    public Mongo_repo_user repo;
//
//
//    @Autowired
//    private static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//
//
//    public void save(user user) {
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        repo.save(user);
//    }
//
//    public List<user> giveAll() {
//        return repo.findAll();
//    }
//
//
//
//    public void update(user Guser ,user Nuser) {
//        if (Guser != null && Nuser != null){
//            Guser.setUsername(Nuser.getUsername());
//            Guser.setPassword(Nuser.getPassword());
//            repo.save(Guser);
//        }
//    }
//
//    public user getById(ObjectId id) {
//        return repo.findById(id).orElse(null);
//    }
//
//    public void delete(ObjectId id) {
//        repo.deleteById(id);
//    }
//
//
//}
