package Manager;

import Aggregates.IntergratedSchedule;
import DTO.ScheduleDTO;
import Entity.Schedule;
import Entity.Worker;

import java.util.List;

public class ScheduleManager {

    private IntergratedSchedule schedules;
    private List<Schedule> objectionLIst;
    private boolean isManaging;

    public List<Schedule> filterObjectionToPermission(int level){
        return null;
    }
    public Schedule fixObjection(boolean change, Worker manager, Long scheduleId){
        return null;
    }
    public void createSchedule(ScheduleDTO dto, Worker Maneger){

    }
    public void changeSchedule(Schedule oldSchedule, Schedule newSchedule){

    }

}
