package lab;
import javax.swing.*;
import java.awt.*;

public class Piechart extends JPanel {

    // Data for the pie chart
    private double[] values = {20, 30, 10, 40};
    private Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW};
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawPie((Graphics2D) g, getBounds(), values, colors);
    }
    
    private void drawPie(Graphics2D g, Rectangle area, double[] values, Color[] colors) {
        double total = 0.0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }
        
        double curValue = 0.0;
        int startAngle;
        for (int i = 0; i < values.length; i++) {
            startAngle = (int) (curValue * 360 / total);
            int arcAngle = (int) (values[i] * 360 / total);
            
            g.setColor(colors[i]);
            g.fillArc(area.x, area.y, area.width, area.height, startAngle, arcAngle);
            curValue += values[i];
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Piechart());
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}