package kodlama.io.hrms.api.controllers;

import kodlama.io.hrms.entities.dto.UserModel;
import kodlama.io.hrms.service.abstracts.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

        private UserService userService ;

    public UserController(UserService userService) {
        this.userService = userService;
    }

   @PostMapping("/sign-in")
    public ResponseEntity<?> add (UserModel model){
        return ResponseEntity.ok(this.userService.add(model));
   }


}
