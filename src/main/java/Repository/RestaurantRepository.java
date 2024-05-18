package Repository;

import Entity.Restaurant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
    @Override
    List<Restaurant> findAll();
    Optional<Restaurant> findById(@PathVariable Long id);

}
