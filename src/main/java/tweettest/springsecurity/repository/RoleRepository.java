package tweettest.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tweettest.springsecurity.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
