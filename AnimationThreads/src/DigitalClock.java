import java.awt.Graphics;
import java.awt.Font;
import java.util.Date;
public class DigitalClock extends java.applet.Applet{
    private Font font = new Font("TimesRoman",Font.BOLD,24);
    private Date date;

    public void start(){
        while (true){
            date = new Date();
            repaint();
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }
    }

    public void paint(Graphics graphics){
        graphics.setFont(font);
        graphics.drawString(date.toString(),10,50);
    }

}
