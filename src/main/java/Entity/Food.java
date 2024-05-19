package Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class Food {
    @Id
    private Long id;
    private String foodName;
    private int quantity;
    private String category;
    private String expirationDate;
    private double foodPrice;
    private String purchaseDate;
    private String supplier;
    private boolean isDefective;
    private String allergens;
    private String nutrients;
    private int usagePeriod;
    private String storageLocation;
    private Long restaurantId;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getFoodName() { return foodName; }
    public void setFoodName(String foodName) { this.foodName = foodName; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public String getFoodCategory() { return category; }
    public void setFoodCategory(String category) { this.category = category; }
    public String getExpirationDate() { return expirationDate; }
    public void setExpirationDate(String expirationDate) { this.expirationDate = expirationDate; }
    public double getFoodPrice() { return foodPrice; }
    public void setFoodPrice(double foodPrice) { this.foodPrice = foodPrice; }
    public String getPurchaseDate() { return purchaseDate; }
    public void setPurchaseDate(String purchaseDate) { this.purchaseDate = purchaseDate; }
    public String getSupplier() { return supplier; }
    public void setSupplier(String supplier) { this.supplier = supplier; }
    public boolean isDefective() { return isDefective; }
    public void setDefective(boolean isDefective) { this.isDefective = isDefective; }
    public String getAllergens() { return allergens; }
    public void setAllergens(String allergens) { this.allergens = allergens; }
    public String getNutrients() { return nutrients; }
    public void setNutrients(String nutrients) { this.nutrients = nutrients; }
    public int getUsagePeriod() { return usagePeriod; }
    public void setUsagePeriod(int usagePeriod) { this.usagePeriod = usagePeriod; }
    public String getStorageLocation() { return storageLocation; }
    public void setStorageLocation(String storageLocation) { this.storageLocation = storageLocation; }
    public Long getRestaurantId() { return restaurantId; }
    public void setRestaurantId(Long restaurantId) { this.restaurantId = restaurantId; }


}