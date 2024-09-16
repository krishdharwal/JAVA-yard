//package app1.Controllers;
//
//
//import app1.POJO.user;
//import app1.Services.user_service;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/user")
//public class user_controller {
//
//    @Autowired
//    public user_service method;
//
//
//
//    @GetMapping
//    public ResponseEntity<?> health(){
//        return new ResponseEntity<>( "--- ok sir i am running :) ---", HttpStatus.OK);
//    }
//
//    @GetMapping("/show")
//    public ResponseEntity<?> give(){
//        return new ResponseEntity<>( method.giveAll() , HttpStatus.ACCEPTED);
//    }
//
//    @PostMapping
//    public ResponseEntity<?> save(@RequestBody user user){
//        method.save(user);
//        return new ResponseEntity<>("--- data added ---", HttpStatus.OK);
//    }
//
//}
