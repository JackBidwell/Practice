import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args){

//Array list is a resizable array

ArrayList<String> food = new ArrayList<String>();

food.add("Pizza");
food.add("Hamburger");
food.add("Hotdog");

food.set(0, "susshi");
food.remove(2);
food.clear();

for(int i=0; i<food.size(); i++){
    System.out.println(food.get(i));
}
        
    }
    
}
