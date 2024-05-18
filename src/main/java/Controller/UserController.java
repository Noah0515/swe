package Controller;

import API.KakaoApi;
import Repository.UserRepository;
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

}
