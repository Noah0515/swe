package Controller;

import API.KakaoApi;
import Repository.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private KakaoApi kakaoApi;
    private UserRepository userRepository;
    @Autowired
    public UserController(KakaoApi kakaoApi, UserRepository userRepository){
        this.kakaoApi = kakaoApi;
        this.userRepository = userRepository;
    }

    public String showMainPage(Model model,HttpSession session){
        return "";
    }
    public String loginForm(Model model){
        return "";
    }
    public String kakaoLogin(String code, HttpServletRequest request, Model model){
        return "";
    }
    public String kakaoLogout(HttpSession session){
        return "";
    };
    public String getMyPage(Model model, HttpSession session){
        return "";
    };
    public String checkVerification(Model model, HttpSession session){
        return"";
    }
}
