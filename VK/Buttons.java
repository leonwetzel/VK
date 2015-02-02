import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class Buttons{
	
	SimulatorView sim;
    
 // buttons
    JButton hundredButton;
    JButton oneButton;
    JButton resetButton;
    JButton stopButton;
    JButton userInput;
    
    //JTextFields van penguin
    JTextField mAgeField3;
    JTextField aNakField3;
    JTextField vLefField3;
    
    //JTextFields van rabbit
    JTextField mAgeField2;
    JTextField aNakField2;
    JTextField vLefField2;
    
    //JTextFields van fox
    JTextField mAgeField;
    JTextField aNakField;
    JTextField vLefField;
    
    public void rabbitProperties(){
    	JPanel cRabbit = new JPanel();
        cRabbit.setLayout(new BorderLayout());
        JPanel gridLayoutPane2 = new JPanel(); 
        GridLayout gridLayout2 = new GridLayout(3,2);
        gridLayoutPane2.setLayout(gridLayout2);
        
        JLabel mAge2 = new JLabel("Max Leeftijd");
        JLabel aNak2 = new JLabel("Aantal nakomelingen");
        JLabel vLef2 = new JLabel("Voortplantingsleeftijd");
        JLabel animalLabel2 = new JLabel("Rabbit Eigenschappen:");
        
        mAgeField2 = new JTextField();
        aNakField2 = new JTextField();
        vLefField2 = new JTextField();
        
        gridLayoutPane2.add(mAge2);
        gridLayoutPane2.add(mAgeField2);
        gridLayoutPane2.add(vLef2);
        gridLayoutPane2.add(vLefField2);
        gridLayoutPane2.add(aNak2);
        gridLayoutPane2.add(aNakField2);
        cRabbit.add(gridLayoutPane2, BorderLayout.CENTER);
        cRabbit.add(animalLabel2, BorderLayout.NORTH);
        sim.container.add(cRabbit);
        sim.container.add(Box.createRigidArea(new Dimension(0,10)));
    }
    
    
    public void penguinProperties(){
    	JPanel cPenguin = new JPanel();
        cPenguin.setLayout(new BorderLayout());
        JPanel gridLayoutPane3 = new JPanel(); 
        GridLayout gridLayout3 = new GridLayout(3,2);
        gridLayoutPane3.setLayout(gridLayout3);
        
        JLabel mAge3 = new JLabel("Max Leeftijd");
        JLabel aNak3 = new JLabel("Aantal nakomelingen");
        JLabel vLef3 = new JLabel("Voortplantingsleeftijd");
        JLabel animalLabel3 = new JLabel("Penguin Eigenschappen:");
        
        mAgeField3 = new JTextField();
        aNakField3 = new JTextField();
        vLefField3 = new JTextField();
        
        gridLayoutPane3.add(mAge3);
        gridLayoutPane3.add(mAgeField3);
        gridLayoutPane3.add(vLef3);
        gridLayoutPane3.add(vLefField3);
        gridLayoutPane3.add(aNak3);
        gridLayoutPane3.add(aNakField3);
        cPenguin.add(gridLayoutPane3, BorderLayout.CENTER);
        cPenguin.add(animalLabel3, BorderLayout.NORTH);
        sim.container.add(cPenguin);
        sim.container.add(Box.createRigidArea(new Dimension(0,10)));
    }
    
    public void foxProperties(){
    	 JPanel cFox = new JPanel();
         cFox.setLayout(new BorderLayout());
         JPanel gridLayoutPane = new JPanel(); 
         GridLayout gridLayout = new GridLayout(3,2);
         gridLayoutPane.setLayout(gridLayout);
         
         JLabel mAge = new JLabel("Max Leeftijd");
         JLabel aNak = new JLabel("Aantal nakomelingen");
         JLabel vLef = new JLabel("Voortplantingsleeftijd");
         JLabel animalLabel = new JLabel("Fox Eigenschappen:");
         
         mAgeField = new JTextField();
         aNakField = new JTextField();
         vLefField = new JTextField();
         
         gridLayoutPane.add(mAge);
         gridLayoutPane.add(mAgeField);
         gridLayoutPane.add(vLef);
         gridLayoutPane.add(vLefField);
         gridLayoutPane.add(aNak);
         gridLayoutPane.add(aNakField);
         cFox.add(gridLayoutPane, BorderLayout.CENTER);
         cFox.add(animalLabel, BorderLayout.NORTH);
         sim.container.add(cFox);
         sim.container.add(Box.createRigidArea(new Dimension(0,10)));
    }
    
    /**
     * Method to create the left sidebar
     * @param frame
     */
    public void makeleftSidebarButtons(JFrame frame, JToolBar lbuttons)
    {  	
        oneButton = new JButton("Step 1");
        
        hundredButton = new JButton("Step 4000");
        
        resetButton = new JButton("Reset");
        
        stopButton = new JButton("Pause");     
        
        userInput = new JButton("Animal Input");
        
        lbuttons.add(oneButton);
        lbuttons.add(hundredButton);  
        lbuttons.add(resetButton);
        lbuttons.add(stopButton);
        lbuttons.add(userInput);
        
    }
    
}