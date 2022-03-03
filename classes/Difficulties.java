import java.util.Arrays;

public class Difficulties {
    private String name;
    private String [] nameOfDifficulties ={"Easy","Hard"};
    Difficulties(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name of Difficulties: " + Arrays.toString(nameOfDifficulties);
    }
}
