package Repository;

import Entity.Food;
import org.springframework.stereotype.Repository;
import Entity.Restaurant;
import java.util.Optional;

@Repository
public class ConcreteFoodRepository implements FoodRepository {

    @Override
    public void save(Food food) {

    }

    @Override
    public Optional<Food> findByFoodNameAndRestaurantIdAndCategory(String foodName, Long restaurantId, String category) {
        return Optional.empty();
    }

    @Override
    public Food createFood(String foodName, int quantity, String category, String expirationDate, double foodPrice,
                           String purchaseDate, String supplier, boolean isDefective, String allergens, String nutrients,
                           int usagePeriod, String storageLocation, Long restaurantId) {
        return new Food();
    }

    @Override
    public <S extends Restaurant> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Restaurant> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Restaurant> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Restaurant> findAll() {
        return null;
    }

    @Override
    public Iterable<Restaurant> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {
    }

    @Override
    public void delete(Restaurant entity) {
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
    }

    @Override
    public void deleteAll(Iterable<? extends Restaurant> entities) {
    }

    @Override
    public void deleteAll() {
    }
}
