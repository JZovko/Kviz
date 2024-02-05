package ba.sum.fsre.kvizapp.repository;

import ba.sum.fsre.kvizapp.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}