package sn.supdeco.blog.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.supdeco.blog.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findByUsernameAndPassword(String username, String password);
    public Optional<User> findByUsername(String username);

}
