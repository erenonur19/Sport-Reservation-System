import java.util.Arrays;

public class Pools {
    private String name;
    private String hour;
    private String [] nameOfPools ={"Adults Pool","Kiddies Pool"};
    private String [] hoursOfAdultsPool ={"15:00","17:00","19:00","21:00"};
    private String [] hoursofKiddiesPool ={"9:00","11:00","13:00","15:00"};



    Pools (String name, String hour){
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
                "Name Of Pools: " + Arrays.toString(nameOfPools);
    }


    public String toString1() {
        return "Hours of Adults Pool: " + Arrays.toString(hoursOfAdultsPool);
    }


    public String toString3() {
        return "Hours of Kiddies Pool: " + Arrays.toString(hoursofKiddiesPool);
    }
}

