//package app1.Services;
//
//import app1.POJO.experiment;
//import app1.Repositories.Mongo_exp_repo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Component
//public class exp_service {
//
//    @Autowired
//    private Mongo_exp_repo repo;
//
//    public List<experiment> FindAll() {
//        return repo.findAll();
//    }
//
//    public void save(experiment body) {
//        repo.save(body);
//    }
//
////    public List<experiment> getExperimentsByUsername(String username) {
////       return repo.findByUsername(username);
////    }
//}
