package Entity;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public class Schedule {
    private Long restaurantId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private boolean isArrived;
    private boolean isDeparted;
    private Long workerId;

    public boolean checkArrived(){
        return false;
    }

    public boolean checkDeparted(){
        return false;
    }

    public void sendObjection(){

    }
}
