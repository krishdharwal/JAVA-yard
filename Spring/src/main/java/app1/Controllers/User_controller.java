//package app1;
//
//import org.bson.types.ObjectId;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//public class User_controller {
//
//
//
//
//
//    @PutMapping("/update/{id}")
//    public ResponseEntity<?> update(@PathVariable ObjectId id, @RequestBody pojo NewUser){
//        pojo GivenUser =  methods.getById(id);
//        methods.update(GivenUser,NewUser);
//        return new ResponseEntity<>( "--- Updated ---", HttpStatus.OK);
//
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<?> delete(@PathVariable ObjectId id){
//        methods.delete(id);
//        return new ResponseEntity<>( "--- Deleted ---", HttpStatus.OK);
//}
