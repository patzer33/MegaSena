import java.util.Random;

public class MegaSena{
    public static void main(String[] args){
        Random generate = new Random();
        for(int s = 0; s < 6; s++){
            int number = generate.nextInt(60);
            System.out.println(number);
        }
    }
}