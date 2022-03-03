import java.util.Arrays;
import java.util.LinkedList;

public class Pitches  {
    private String name;
    private String hour;
    private String [] nameOfPitches ={"Big","Small"};
    private String [] hoursOfBigPitch ={"12:00","14:00","16:00","18:00"};
    private String [] hoursofSmallPitch ={"13:00","15:00","17:00","19:00"};


    public Pitches(String name, String hour) {
        this.name = name;
        this.hour = hour;
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
                "Names of Existing Pitches: " + Arrays.toString(nameOfPitches);
    }


    public String toString1() {
        return "Hours of Big Pitch: " + Arrays.toString(hoursOfBigPitch);
    }


    public String toString3() {
        return "Hours of Small Pitch: " + Arrays.toString(hoursofSmallPitch);
    }
}
