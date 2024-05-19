package Inventory;

import Entity.Food;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import org.springframework.ui.Model;
import java.util.List;

@Component
public class FoodInventory {
    private List<Food> foods = new ArrayList<>();

    public void addFood(String stockName, String category) {
        Food food = new Food();
        food.setFoodName(stockName);
        food.setFoodCategory(category);
        foods.add(food);
    }

    public void reviseFood(String stockName, String category) {
        for (Food food : foods) {
            if (food.getFoodName().equals(stockName) && food.getFoodCategory().equals(category)) {
                break;
            }
        }
    }

    public String getFoodStock() {
        return foods.toString();
    }


    public String getExpirationDate() {
        return foods.isEmpty() ? null : foods.get(0).getExpirationDate();
    }

    public void setFoodCategory(String category) {
        for (Food food : foods) {
            food.setFoodCategory(category);
        }
    }

    public String getFoodCategory() {
        return foods.isEmpty() ? null : foods.get(0).getFoodCategory();
    }

    public void sortByExpirationDate() {
        foods.sort((f1, f2) -> f1.getExpirationDate().compareTo(f2.getExpirationDate()));
    }

    public void deleteFoodStock(String stockName, String category) {
        foods.removeIf(food -> food.getFoodName().equals(stockName) && food.getFoodCategory().equals(category));
    }

    public Boolean selectFood() {
        return true;
    }
}
