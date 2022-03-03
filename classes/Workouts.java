import java.util.Arrays;

public class Workouts {
    private String name;
    private String hour;
    private String [] nameOfWorkouts ={"Plates","BodyB","Crossfit"};
    private String [] hoursOfPlates ={"9:00","10:00","11:00","12:00"};
    private String [] hoursofBodyB ={"13:00","15:00","17:00","19:00"};
    private String [] hoursofCrossfit ={"16:00","18:00","20:00","22:00"};



    Workouts(String name, String hour){
        this.name=name;
        this.hour=hour;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return
                "Name Of Workouts:  " + Arrays.toString(nameOfWorkouts);
    }


    public String toString1() {
        return "Hours of Plates: " + Arrays.toString(hoursOfPlates);
    }


    public String toString2() {
        return "Hours of Body B: " + Arrays.toString(hoursofBodyB);
    }
    public String toString3() {
        return "Hours of Crossfit: " + Arrays.toString(hoursofCrossfit);
    }
}

