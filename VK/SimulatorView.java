import java.awt.*;


import java.awt.event.*;

import javax.swing.*;

import java.util.LinkedHashMap;
import java.util.Map;
/**
 * A graphical view of the simulation grid.
 * The view displays a colored rectangle for each location 
 * representing its contents. It uses a default background color.
 * Colors for each type of species can be defined using the
 * setColor method.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class SimulatorView extends JFrame
{
    // Colors used for empty locations.
    private static final Color EMPTY_COLOR = Color.WHITE; //new Color(127,51,0);
    

    
    // Color used for objects that have no defined color.
    private static final Color UNKNOWN_COLOR = Color.gray;
    
    private final String STEP_PREFIX = "Step: ";
    private final String POPULATION_PREFIX = "Population: ";
    private JLabel stepLabel, population;
    private FieldView fieldView;
    // A map for storing colors for participants in the simulation
    private Map<Class, Color> colors;
    // A statistics object computing and storing simulation information
    private FieldStats stats;
    
    // buttons
    JButton hundredButton;
    JButton oneButton;
    JButton resetButton;
    JButton stopButton;
    JButton userInput;
    
    //JFrames
    JFrame aInput;
    JPanel container;
    
    /**
     * Create a view of the given width and height.
     * @param height The simulation's height.
     * @param width  The simulation's width.
     */
    public SimulatorView(int height, int width)
    {  
    	// maak het frame en dergelijke
    	setLocation(410, 0);
    	setTitle("Vossen & Konijnen, uitgevoerd door Vrijepinguins");
        stats = new FieldStats();
        colors = new LinkedHashMap<Class, Color>();
        stepLabel = new JLabel(STEP_PREFIX, JLabel.CENTER);
        population = new JLabel(POPULATION_PREFIX, JLabel.CENTER);
        
        // maak de menubar
        makeMenuBar(this);

        // maak de buttons
        JToolBar lbuttons = new JToolBar(JToolBar.VERTICAL);
        makeleftSidebarButtons(this, lbuttons);
        
        //maak invoervelden voor de verschillende dieren
        
        
        fieldView = new FieldView(height, width);
        JPanel mcontent = new JPanel();
        mcontent.setPreferredSize(new Dimension(800, 550));
        mcontent.add(stepLabel, BorderLayout.NORTH);
        mcontent.add(fieldView, BorderLayout.CENTER);
        mcontent.add(population, BorderLayout.SOUTH);
        JSplitPane container = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, lbuttons, mcontent);
        container.setEnabled(false);
        getContentPane().add(container);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    
    public void inputFrame(){
    	JFrame frame = new JFrame("Diereigenschappen");
    	container = new JPanel();
    	container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //new grid for fox property inputs
        foxProperties();
        //new grid for rabbit property inputs
        rabbitProperties();
        //new grid for penguin property inputs
        penguinProperties();
        frame.add(container);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
    /**
     * Define a color to be used for a given class of animal.
     * @param animalClass The animal's Class object.
     * @param color The color to be used for the given class.
     */
    public void setColor(Class animalClass, Color color)
    {
        colors.put(animalClass, color);
    }
    
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
        
        JTextField mAgeField2 = new JTextField();
        JTextField aNakField2 = new JTextField();
        JTextField vLefField2 = new JTextField();
        
        gridLayoutPane2.add(mAge2);
        gridLayoutPane2.add(mAgeField2);
        gridLayoutPane2.add(vLef2);
        gridLayoutPane2.add(vLefField2);
        gridLayoutPane2.add(aNak2);
        gridLayoutPane2.add(aNakField2);
        cRabbit.add(gridLayoutPane2, BorderLayout.CENTER);
        cRabbit.add(animalLabel2, BorderLayout.NORTH);
        container.add(cRabbit);
        container.add(Box.createRigidArea(new Dimension(0,10)));
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
        
        JTextField mAgeField3 = new JTextField();
        JTextField aNakField3 = new JTextField();
        JTextField vLefField3 = new JTextField();
        
        gridLayoutPane3.add(mAge3);
        gridLayoutPane3.add(mAgeField3);
        gridLayoutPane3.add(vLef3);
        gridLayoutPane3.add(vLefField3);
        gridLayoutPane3.add(aNak3);
        gridLayoutPane3.add(aNakField3);
        cPenguin.add(gridLayoutPane3, BorderLayout.CENTER);
        cPenguin.add(animalLabel3, BorderLayout.NORTH);
        container.add(cPenguin);
        container.add(Box.createRigidArea(new Dimension(0,10)));
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
         
         JTextField mAgeField = new JTextField();
         JTextField aNakField = new JTextField();
         JTextField vLefField = new JTextField();
         
         gridLayoutPane.add(mAge);
         gridLayoutPane.add(mAgeField);
         gridLayoutPane.add(vLef);
         gridLayoutPane.add(vLefField);
         gridLayoutPane.add(aNak);
         gridLayoutPane.add(aNakField);
         cFox.add(gridLayoutPane, BorderLayout.CENTER);
         cFox.add(animalLabel, BorderLayout.NORTH);
         container.add(cFox);
         container.add(Box.createRigidArea(new Dimension(0,10)));
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
    
    /**
     * Method to create the menubar
     * @param frame
     */
    public void makeMenuBar(JFrame frame)
    {	
        JMenuBar mbar = new JMenuBar();
        JMenu menu1 = new JMenu("Menu 1");
        JMenu menu2 = new JMenu("Menu 2");
        JMenu menu3 = new JMenu("Help");
        mbar.add(menu1);
        mbar.add(menu2);
        mbar.add(menu3);
        setJMenuBar(mbar);    	
    }
     
    /**
     * @return The color to be used for a given class of animal.
     */
    private Color getColor(Class animalClass)
    {
        Color col = colors.get(animalClass);
        if(col == null) {
            // no color defined for this class
            return UNKNOWN_COLOR;
        }
        else {
            return col;
        }
    }

    /**
     * Show the current status of the field.
     * @param step Which iteration step it is.
     * @param field The field whose status is to be displayed.
     */
    public void showStatus(int step, Field field)
    {
        if(!isVisible()) {
            setVisible(true);
        }
            
        stepLabel.setText(STEP_PREFIX + step);
        stats.reset();
        
        fieldView.preparePaint();

        for(int row = 0; row < field.getDepth(); row++) {
            for(int col = 0; col < field.getWidth(); col++) {
                Object animal = field.getObjectAt(row, col);
                if(animal != null) {
                    stats.incrementCount(animal.getClass());
                    fieldView.drawMark(col, row, getColor(animal.getClass()));
                }
                else {
                	Area area = field.getAreaAt(row, col);
                	fieldView.drawMark(col, row, area.getColor());
                }
            }
        }
        stats.countFinished();

        population.setText(POPULATION_PREFIX + stats.getPopulationDetails(field));
        fieldView.repaint();
    }

    /**
     * Determine whether the simulation should continue to run.
     * @return true If there is more than one species alive.
     */
    public boolean isViable(Field field)
    {
        return stats.isViable(field);
    }
    
    /**
     * Provide a graphical view of a rectangular field. This is 
     * a nested class (a class defined inside a class) which
     * defines a custom component for the user interface. This
     * component displays the field.
     * This is rather advanced GUI stuff - you can ignore this 
     * for your project if you like.
     */
    private class FieldView extends JPanel
    {
        private final int GRID_VIEW_SCALING_FACTOR = 6;

        private int gridWidth, gridHeight;
        private int xScale, yScale;
        Dimension size;
        private Graphics g;
        private Image fieldImage;

        /**
         * Create a new FieldView component.
         */
        public FieldView(int height, int width)
        {
            gridHeight = height;
            gridWidth = width;
            size = new Dimension(0, 0);
        }

        /**
         * Tell the GUI manager how big we would like to be.
         */
        public Dimension getPreferredSize()
        {
            return new Dimension(gridWidth * GRID_VIEW_SCALING_FACTOR,
                                 gridHeight * GRID_VIEW_SCALING_FACTOR);
        }

        /**
         * Prepare for a new round of painting. Since the component
         * may be resized, compute the scaling factor again.
         */
        public void preparePaint()
        {
            if(! size.equals(getSize())) {  // if the size has changed...
                size = getSize();
                fieldImage = fieldView.createImage(size.width, size.height);
                g = fieldImage.getGraphics();

                xScale = size.width / gridWidth;
                if(xScale < 1) {
                    xScale = GRID_VIEW_SCALING_FACTOR;
                }
                yScale = size.height / gridHeight;
                if(yScale < 1) {
                    yScale = GRID_VIEW_SCALING_FACTOR;
                }
            }
        }
        
        /**
         * Paint on grid location on this field in a given color.
         */
        public void drawMark(int x, int y, Color color)
        {
            g.setColor(color);
            g.fillRect(x * xScale, y * yScale, xScale-1, yScale-1);
        }

        /**
         * The field view component needs to be redisplayed. Copy the
         * internal image to screen.
         */
        public void paintComponent(Graphics g)
        {
            if(fieldImage != null) {
                Dimension currentSize = getSize();
                if(size.equals(currentSize)) {
                    g.drawImage(fieldImage, 0, 0, null);
                }
                else {
                    // Rescale the previous image.
                    g.drawImage(fieldImage, 0, 0, currentSize.width, currentSize.height, null);
                }
            }
        }
    }
}
