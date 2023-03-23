import java.io.OutputStream;
import java.util.Arrays;

public class Rechnungen {
    public static boolean primzahl(int x){
        int y = x - 1;
        while (y > 1){
            if(x % y == 0){
                return false;
            }
            y--;
        }
        return true;
    }

    public static int quersumme(int x){
        String zahl = x + "";
        String[] zahlArray = zahl.split("");
        int sum = 0;
        for(int i = 0; i < zahlArray.length; i++){
           sum += Integer.parseInt(zahlArray[i]);
        }
        return sum;
    }

    public static int testOneToHundret(){
        int numbers = 0;
        int x = 0;
        for(int i = 1; i <= 100; i++){
            if(primzahl(i)){
                if(primzahl(quersumme(i))){
                    numbers++;
                }
            }
        }
        return numbers;
    }

    public static void main(String[] args){
        System.out.println(primzahl(113));
        System.out.println(quersumme(1214552));
        System.out.println(testOneToHundret());
    }
}
