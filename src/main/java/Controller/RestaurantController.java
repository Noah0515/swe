package Controller;

import Entity.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import Repository.RestaurantRepository;
import Repository.ScheduleRepository;
import Repository.WorkerRepository;
import org.springframework.stereotype.Controller;

@Controller
public class RestaurantController {

    private RestaurantRepository restaurantRepository;

    private ScheduleRepository scheduleRepository;

    private WorkerRepository workerRepository;
    @Autowired
    public RestaurantController(RestaurantRepository restaurantRepository, ScheduleRepository scheduleRepository, WorkerRepository workerRepository){
        this.restaurantRepository = restaurantRepository;
        this.scheduleRepository = scheduleRepository;
        this.workerRepository = workerRepository;
    }
}
