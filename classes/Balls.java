import java.util.Arrays;
import java.util.LinkedList;

public class Balls {
    private String name;
    private String [] nameOfBalls ={"Adidas","Nike"};
    Balls (String name){
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
        return "Name of Balls: " + Arrays.toString(nameOfBalls);
    }




}
