 import java.util.ArrayList;
 
 class ArryaListThatWorks {
    
    public static void main(String[] args){

    ArrayList<ArrayList<String>> groceryList = new ArrayList<>();    

    ArrayList<String> bakeryList = new ArrayList<>();
    bakeryList.add("Bagles");
    bakeryList.add("Donuts");
    bakeryList.add("Pasta");

    ArrayList<String> drinkList = new ArrayList<>();
    drinkList.add("Vodka");
    drinkList.add("Coke");
    drinkList.add("Sprite");

    groceryList.add(bakeryList);
    groceryList.add(drinkList);

    System.out.println(groceryList);


    
    }
}
