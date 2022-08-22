package kodlama.io.hrms.api.controllers;

import kodlama.io.hrms.entities.dto.UserModel;
import kodlama.io.hrms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService ;



   @PostMapping("/sign-in")
    public ResponseEntity<?> add (UserModel model){
        return ResponseEntity.ok(this.userService.add(model));
   }

   @GetMapping("/get-all-user")
    public  ResponseEntity<?> getAllUser(){
       return ResponseEntity.ok(this.userService.getAllUser());
   }
}
