package kodlama.io.hrms.api.controllers;

import kodlama.io.hrms.entities.dto.UserModel;
import kodlama.io.hrms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping(path = "/sign-up")
    public ResponseEntity<?> addUser(@RequestBody UserModel model) {
        return ResponseEntity.ok(this.userService.addUser(model));
    }

    @GetMapping("/get-all-user")
    public ResponseEntity<?> getAllUser() {
        return ResponseEntity.ok(this.userService.getAllUser());
    }
}
