public class FoodItem{
    public String name;

    //constructor
    FoodItem(String name){
        this.name = name;//this keyword
    }

    private String displayPrice(boolean highPrice){
        String n;
        if(highPrice==true){
            n = "High";
        }
        else
           n = "Low";
        return n;
    }
    

    public static void main(String[] args) {
        //Object using constructor
        //Didnt create Driver class because private methods are not visible outside class
        FoodItem foodItem = new FoodItem("Apple");
        FoodItem soya = new FoodItem("soya"); 
        System.out.println(soya.displayPrice(true));
    }

}

