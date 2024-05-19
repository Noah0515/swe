import API.KakaoApi;
import Entity.Restaurant;
import Repository.RestaurantRepository;
import Repository.ScheduleRepository;
import Repository.UserRepository;
import Repository.WorkerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Optional;

@Configuration
public class SweConfig {
    @Bean
    KakaoApi kakaoApi(){
        return new KakaoApi();
    }

    @Bean
    UserRepository userRepository(){
        return userRepository();
    }
    @Bean
    RestaurantRepository restaurantRepository(){
        return restaurantRepository();
    }

    @Bean
    ScheduleRepository scheduleRepository(){
        return scheduleRepository();
    }

    @Bean
    WorkerRepository workerRepository(){
        return workerRepository();
    }

}
