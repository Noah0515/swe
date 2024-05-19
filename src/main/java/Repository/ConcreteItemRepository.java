package Repository;

import Entity.Item;
import Entity.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ConcreteItemRepository implements ItemRepository {


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
    public <S extends Item> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Item> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Item> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Item> findAll() {
        return null;
    }

    @Override
    public Iterable<Item> findAllById(Iterable<Long> longs) {
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
    public void delete(Item entity) {
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
    }

    @Override
    public void deleteAll(Iterable<? extends Item> entities) {
    }

    @Override
    public void deleteAll() {
    }
}
