package kodlama.io.hrms.api.controllers;

import kodlama.io.hrms.entities.dto.UserModel;
import kodlama.io.hrms.entities.form.RoleToUserForm;
import kodlama.io.hrms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping(path = "/sign-up")
    public ResponseEntity<?> addUser(@RequestBody UserModel model) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("user/sign-in").toUriString());
        return ResponseEntity.ok(this.userService.addUser(model));
    }

    @GetMapping("/get-all-user")
    public ResponseEntity<?> getAllUser() {
        return ResponseEntity.ok(this.userService.getAllUser());
    }
}
