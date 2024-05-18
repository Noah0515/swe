package Controller;

import DTO.ScheduleDTO;
import Entity.Schedule;
import Entity.Staff;
import Repository.RestaurantRepository;
import Repository.ScheduleRepository;
import Repository.UserRepository;
import Repository.WorkerRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class WorkerController {
    private UserRepository userRepository;
    private ScheduleRepository scheduleRepository;
    private WorkerRepository workerRepository;
    @Autowired
    public WorkerController(UserRepository userRepository, ScheduleRepository scheduleRepository, WorkerRepository workerRepository){
        this.userRepository = userRepository;
        this.scheduleRepository = scheduleRepository;
        this.workerRepository = workerRepository;
    }
    public String inviteStaff(Model model, HttpSession session, String phone, Long restaurantId){
        return "";
    };
    public String showWorkers(Model model, HttpSession session){
        return "";
    };
    public String enterWorkerManaging(Model model, HttpSession session){
        return "";
    };
    public String setStaffPermission(HttpSession session, Long workerId){
        return "";
    };
    public String addWorkerBonus(Model model, HttpSession session, String content, int bonus, Long workerId){
        return "";
    };
    public String dismissal(HttpSession session, Staff staff){
        return "";
    };
    public String createSchedule(Model model, HttpSession session){
        return "";
    };
    public String endterScheduleManaging(Model model, HttpSession session){
        return "";
    };
    public String fixSchedule(Model model, HttpSession session, ScheduleDTO schedule){
        return "";
    };
    public String showScheduleObjection(Model model, HttpSession session){
        return "";
    };
    public String processObjection(Model model, HttpSession session, Long scheduleId, boolean fix){
        return "";
    };
    public String sendObjection(HttpSession session, Schedule schedule){
        return "";
    };
    public String checkWorkerArrived(HttpSession session, Schedule schedule){
        return "";
    };
    public String checkWorkerDeparted(HttpSession session, Schedule schedule){
        return "";
    };

}
