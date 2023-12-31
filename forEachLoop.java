import java.util.ArrayList;

public class forEachLoop {

    public static void main(String[] args){

        //String[] animals = {"Cat","Dog","Rat","Bird"};
        ArrayList<String> animals = new ArrayList<>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Rat");
        animals.add("Bird");

        for(String i : animals) {
            System.out.println(i);
        }

    }
    
}
