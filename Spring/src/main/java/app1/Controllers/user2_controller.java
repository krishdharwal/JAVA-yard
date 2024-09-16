package app1.Controllers;

import app1.POJO.user2;
import app1.Services.user2_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user2")
public class user2_controller {

    @Autowired
    private user2_service service;

    @GetMapping
    public List<user2> showall(){
        return service.findAll();
    }

    @PostMapping("/add")
    public String save(@RequestBody user2 body){
        service.save(body);
        return "--data--added--";
    }

    @GetMapping("find/{name}")
    public List<user2> find(@PathVariable String name){
        return service.findbyname(name);
    }
}
