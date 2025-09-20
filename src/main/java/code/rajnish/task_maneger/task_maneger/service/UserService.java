package code.rajnish.task_maneger.task_maneger.service;

import code.rajnish.task_maneger.task_maneger.model.UserDetails;
import code.rajnish.task_maneger.task_maneger.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDetails saveUser(UserDetails userDetails) {
        return userRepository.save(userDetails);
    }

    public UserDetails getUserByRegNo(String registrationNo) {
        return userRepository.findById(registrationNo).orElse(null);
    }


    public List<UserDetails> getAllUsers() {
        return userRepository.findAll();
    }

    public UserDetails updateUser(String registrationNo, UserDetails userDetails) {
        Optional<UserDetails> optionalUser = userRepository.findById(registrationNo);
        if (!optionalUser.isPresent()) return null;

        UserDetails existingUser = optionalUser.get();
        existingUser.setName(userDetails.getName());
        existingUser.setEmail(userDetails.getEmail());
        existingUser.setCollegeId(userDetails.getCollegeId());
        existingUser.setCode(userDetails.getCode());
        // registrationNo should not change, so don’t update it
        return userRepository.save(existingUser);
    }

    public boolean deleteUser(String registrationNo) {
        if (!userRepository.existsById(registrationNo)) return false;
        userRepository.deleteById(registrationNo);
        return true;
    }


}
