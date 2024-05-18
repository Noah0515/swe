package Repository;

import org.springframework.data.repository.CrudRepository;
import Entity.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository {
    Optional<User> findByEmail(String email);
}
