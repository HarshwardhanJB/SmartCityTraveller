package city.example.demo.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import city.example.demo.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByEmail(String email);

}
