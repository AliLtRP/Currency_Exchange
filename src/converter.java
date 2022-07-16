import javax.swing.*;

class converter{
    private int dollar=1;
    private float Nok=8.2f;
    private float jpy = 112.7f;

    void conv(double x){
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                JOptionPane.showMessageDialog(null , dollar*x +" $");
            } else if (i==1) {
                JOptionPane.showMessageDialog(null , x*Nok+ " Nok");
            }
        }
        JOptionPane.showMessageDialog(null, x*jpy+ " Yen");
    }
}