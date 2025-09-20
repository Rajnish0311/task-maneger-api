package code.rajnish.task_maneger.task_maneger.repository;

import code.rajnish.task_maneger.task_maneger.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDetails,String> {
}
