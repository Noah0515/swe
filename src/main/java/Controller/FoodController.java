package Controller;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FoodController {
    private FoodRepository foodRepository;
    private FoodInventory foodInventory;


    @GetMapping
    public String addFoodPage(Model model, HttpSession session) { return ""; }
    @PostMapping
    public String addFood(FoodDTO foodDTO, Model model, HttpSession session) { return ""; }
    @GetMapping
    public String getFoods(Model model, HttpSession session, String category) { return ""; }
    @GetMapping
    public String getFoodDetail(Model model, HttpSession session, String foodId) { return ""; }
    @GetMapping
    public String searchFoods(Model model, HttpServletRequest request, HttpSession session) { return ""; }
    @PostMapping
    public String deleteFood(HttpServletRequest request, Model model, HttpSession session, String foodId) { return ""; }
    public Optional<Food> findFoodById(Long id) { return Optional.empty(); }
}
