package Permission;

import DTO.ScheduleDTO;
import Entity.Schedule;
import Entity.Worker;
import Manager.ScheduleManager;

import java.util.List;

public class OwnerPermission extends ManagerPermission{
    private int Permission_Level = 0;

    public void invite(String phone){

    }
    public void closure(){

    }
    public List<Schedule> filterObjectionToPermission(int level){
        return null;
    }
    public Schedule fixObjection(boolean change, Worker manager, Long scheduleId){
        return null;
    }
    public void createSchedule(ScheduleDTO dto, Worker Maneger){

    }
    public void changeSchedule(Schedule schedule){

    }
}
