import java.util.Arrays;

public class Equipment {
    private String name;
    private String [] nameOfEquipments ={"Oversleeve","Bonnet"};
    Equipment (String name){
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
        return "Name of Equipments: " + Arrays.toString(nameOfEquipments);
    }
}
