package Repository;

import Entity.Item;
import Entity.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ConcreteItemRepository implements ItemRepository {

    @Override
    public void save(Item item) {
        // 기본 구현 제공
    }

    @Override
    public Optional<Item> findByItemNameAndRestaurantIdAndCategory(String itemName, Long restaurantId, String category) {
        return Optional.empty();
    }

    @Override
    public Item createItem(String itemName, int quantity, String category, double itemPrice,
                           String supplier, boolean isDefective, int usagePeriod, String storageLocation, Long restaurantId) {
        return new Item();
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
