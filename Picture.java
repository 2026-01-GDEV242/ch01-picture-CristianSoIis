/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    
    private Square wave1;
    private Square wave2;
    private Square wave3;
    
    private Circle sun;
    
    private Square sky1;
    private Square sky2;
    private Square sky3;
    
    
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        
        
        wave1 = new Square();
        wave2 = new Square();
        wave3 = new Square();
        
        sky1 = new Square();
        sky2 = new Square();
        sky3 = new Square();
        
        
        sun = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            
            sky1.changeColor("blue");
            sky1.moveVertical(-500);
            sky1.moveHorizontal(-350);
            sky1.changeSize(550);
            sky1.makeVisible();
            
            sky2.changeColor("green");
            sky2.moveVertical(-550);
            sky2.moveHorizontal(-350);
            sky2.changeSize(550);
            sky2.makeVisible();
            
            sky3.changeColor("red");
            sky3.moveVertical(-600);
            sky3.moveHorizontal(-350);
            sky3.changeSize(550);
            sky3.makeVisible();
            
            sun.changeColor("yellow");
            sun.moveVertical(5);
            sun.moveHorizontal(-50);
            sun.changeSize(125);
            sun.makeVisible();
             
            wave1.changeColor("black"); // Change color
            wave1.moveVertical(50);
            wave1.moveHorizontal(-350);
            wave1.changeSize(550);
            wave1.makeVisible();
            
            wave2.changeColor("red"); // Change color
            wave2.moveVertical(90);
            wave2.moveHorizontal(-350);
            wave2.changeSize(550);
            wave2.makeVisible();
            
            wave3.changeColor("blue"); // Change color
            wave3.moveVertical(130);
            wave3.moveHorizontal(-350);
            wave3.changeSize(550);
            wave3.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
    }
}
