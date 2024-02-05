package ba.sum.fsre.kvizapp.repository;

import ba.sum.fsre.kvizapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
