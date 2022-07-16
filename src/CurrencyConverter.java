import javax.swing.*;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args){
        double input = Double.parseDouble (JOptionPane.showInputDialog(null , "enter the amount in dollar: " ));

        converter conv = new converter();
        conv.conv(input);
    }
}
