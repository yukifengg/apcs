/*
TEAM YAK: Yuki Feng, Anjini Katari, Kevin Li
APCS pd 08
L08: America's Next Top Data Scientist
2022-04-05
Time spent: 1.0 hours
*/

public class Cereal{

    //instance vars
    private int calories, protein, sodium, fiber, fat, carbs, sugar, potassium, vits, shelf;
    private double weight, cups, rating;
    private String name, type;

    //constructor
    public Cereal(int calories, int protein, int sodium, int fiber, int fat, int carbs, int sugar,
                  int potassium, int vits, int shelf, double weight, double cups, double rating,
                  String name, String type){

        this.calories = calories;
        this.potassium = potassium;
        this.protein = protein;
        this.sodium = sodium;
        this.fiber = fiber;
        this.fat = fat;
        this.carbs = carbs;
        this.sugar = sugar;
        this.vits = vits;
        this.shelf = shelf;
        this.weight = weight;
        this.cups = cups;
        this.name = name;
        this.type = type;
        this.rating = rating;

    }

    public int Calories() {
        return calories;
    }
    public int Protein() {
        return protein;
    }
    public int Sodium() {
        return sodium;
    }
    public int Fiber() {
        return fiber;
    }
    public int Fat() {
        return fat;
    }
    public int Carbs() {
        return carbs;
    }
    public int Sugar() {
        return sugar;
    }
    public int Potassium() {
        return potassium;
    }
    public int Vits() {
        return vits;
    }
    public int Shelf() {
        return shelf;
    }
    public double Weight() {
        return weight;
    }
    public double Cups() {
        return cups;
    }
    public double Rating() {
        return rating;
    }
    public String Name() {
        return name;
    }
    public String Type() {
        return type;
    }


    public String toString(){
        String output = "";

        output +=
        "name: " + name + "\n" +
        "Calories: " + calories + "\n" +
        "Potassium: " + potassium + "\n" +
        "Protein: " + protein + "\n" +
        "Sodium: " + sodium + "\n" +
        "Fiber: " + fiber + "\n" +
        "Fat: " + fat + "\n" +
        "Carbs: " + carbs + "\n" +
        "sugar: " + sugar + "\n" +
        "vits: " + vits + "\n" +
        "shelf: " + shelf + "\n" +
        "weight:" + weight + "\n" +
        "cups: " + cups + "\n" +
        "name: " + name + "\n" +
        "Type: " + type + "\n" +
        "rating: " + rating;

        return output;
    }

    public static void main(String[] args) {
        Cereal cereal = new Cereal(120, 1, 2, 5, 200, 400, 999, -5, 4, 0, 1.12, 5.2, 13.913990791, "no no cereal", "C");
        System.out.println(cereal + "\n");

        Cereal fakeCereal = new Cereal(10, 6, 8, 1, 1089, 1, -55665, 5, 9, 1, 3.14, .15, -666.666, "yes yes cereal", "E");
        System.out.println(fakeCereal + "\n");

        Cereal booCereal = new Cereal(45, 1, 555, 33, 0, 33, 653, 999, 6, 66, 23.5, 1.02, 3.141529, "bo bo cereal", "B");
        System.out.println(booCereal);
    }

}
