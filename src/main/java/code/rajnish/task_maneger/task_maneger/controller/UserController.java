package code.rajnish.task_maneger.task_maneger.controller;

import code.rajnish.task_maneger.task_maneger.model.UserDetails;
import code.rajnish.task_maneger.task_maneger.dto.ApiResponse;
import code.rajnish.task_maneger.task_maneger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // POST upload user
    @PostMapping("/upload")
    public ApiResponse<UserDetails> uploadUser(@RequestBody UserDetails userDetails) {
        UserDetails savedUser = userService.saveUser(userDetails);
        return new ApiResponse<>("success", savedUser, "User uploaded successfully!");
    }

    // GET user by registration number
    @GetMapping("/{registrationNo}")
    public ApiResponse<UserDetails> getUser(@PathVariable String registrationNo) {
        UserDetails user = userService.getUserByRegNo(registrationNo);
        if (user == null) {
            return new ApiResponse<>("error", null, "User not found with registration number " + registrationNo);
        }
        return new ApiResponse<>("success", user, "User found successfully");
    }

    // GET all users
    @GetMapping
    public ApiResponse<List<UserDetails>> getAllUsers() {
        List<UserDetails> allUsers = userService.getAllUsers();
        return new ApiResponse<>("success", allUsers, "All users fetched successfully");
    }


// PUT update user by registration number
    @PutMapping("/{registrationNo}")
    public ApiResponse<UserDetails> updateUser(@PathVariable String registrationNo, @RequestBody UserDetails userDetails) {
        UserDetails updatedUser = userService.updateUser(registrationNo, userDetails);
        if (updatedUser == null) {
            return new ApiResponse<>("error", null, "User not found with registration number " + registrationNo);
        }
        return new ApiResponse<>("success", updatedUser, "User updated successfully!");
    }

    // DELETE user by registration number
    @DeleteMapping("/{registrationNo}")
    public ApiResponse<Void> deleteUser(@PathVariable String registrationNo) {
        boolean deleted = userService.deleteUser(registrationNo);
        if (!deleted) {
            return new ApiResponse<>("error", null, "User not found with registration number " + registrationNo);
        }
        return new ApiResponse<>("success", null, "User deleted successfully!");
    }


}
