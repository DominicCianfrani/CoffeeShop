import com.google.gson.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        try
        {
            Coffee coffs[] = {new Coffee("Joe", "Oakes", 7.99, 195, "Vanilla Cream Latte",true),
                    new Coffee("Dominic", "Cianfrani", 8.99, 196, "Chai Tea", true),
                    new Coffee("John", "Doe", 7.99, 197, "Black Coffee", false)};

            try (FileWriter writer = new FileWriter("Coffee.json")){
                writer.write(new Gson().toJson(coffs));
            }

            Coffee[] coffs2 = new Gson().fromJson(new FileReader("Coffee.json"), Coffee[].class);
            for (Coffee coff : coffs2){
                System.out.println("");
                System.out.println("Name: " + coff.getFirstName() + " " + coff.getLastName());
                System.out.println("Total: $" + coff.getCost());
                System.out.println("Order Number : " + coff.getOrderNum());
                System.out.println("Total Credits : " + coff.getOrder());
                System.out.println("Decaf : " + coff.getDecaf());
            }
        }catch(Exception e){ }
    }
}