//package app1.Controllers;
//
//import app1.POJO.experiment;
//import app1.Services.exp_service;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/exp")
//public class exp_controller {
//
//    @Autowired
//    private exp_service exp_service;
//
//    @GetMapping
//    public List<experiment> showAll(){
//        return exp_service.FindAll();
//    }
////
////    @GetMapping("/username/{username}")
////    public List<experiment> getExperimentsByUsername(@PathVariable String username) {
////        return exp_service.getExperimentsByUsername(username);
////    }
//
//
//    @PostMapping
//    public ResponseEntity<?> save(@RequestBody  experiment body){
//        exp_service.save(body);
//        return new ResponseEntity<>("--data--added--", HttpStatus.OK);
//    }
//}
