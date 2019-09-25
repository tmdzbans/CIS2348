import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        for ( int i = 0; i<10; i++) //Inner loop, Manages the rows
        {
            System.out.println();
            for (int j = 0; j<10; j++) //Inner loop, manages columns
        }

        if ((i % 2 == 0 && j % 2 == 0) || (i % 2 > 0 && j % 2 >0)) {
           Random RandomNumber = new Random();
           System.out.println(RandomNumber.nextInt(10));
        } else{
            System.out.print(" ");
        }
    }


}
