package Entity;

import Aggregates.IntergratedSchedule;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Builder
@Getter
@Setter
public class Restaurant {
    private Long id;
    private List<Worker> workers;
    private String name;
    private Date openingDate;
    private String address;
    private boolean isClosure;
    private IntergratedSchedule schedules;
    //private FoodInventory foodInventory;
    //private ItemInventory itemInventory;
    //private DataExpense dataExpense;

    public void addWorker(Worker worker)
    {
        workers.add(worker);
    }
}
