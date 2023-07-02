import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TestSolarSystem extends JFrame implements ActionListener{

    private JButton startbutton;
    private JLabel label;
    private JPanel panel;

    public TestSolarSystem(){
        startMission();
    }

    public void startMission(){
        setTitle("Solar System");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        startbutton = new JButton("Start");
        label = new JLabel("Click to start");
        panel = new JPanel();
        panel.add(label);
        panel.add(startbutton);
        add(panel);
        startbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == startbutton){
                    SolarSystem solarSystem = new SolarSystem();
                    try{
                    solarSystem.bigBang();
                    solarSystem.biggestPlanet();
                    solarSystem.earthDistance("Mercurio");
                    solarSystem.earthDistance("Pluton");
                    } catch (IllegalArgumentException x){
                        System.out.println("Excepción atrapada " + x );
                    } finally {
                        System.out.println("Tarea terminada");
                    }
                }
            }
        });
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
			new TestSolarSystem();
		});
       
    }
}

