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
    
    private Circle sun1;
    private Circle sun2;
    
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
        
        
        sun1 = new Circle();
        sun2 = new Circle();
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
            
            
            sun1.changeColor("red");
            sun1.moveVertical(-15);
            sun1.moveHorizontal(-75);
            sun1.changeSize(175);
            sun1.makeVisible();
            
            sun2.changeColor("yellow");
            sun2.moveVertical(5);
            sun2.moveHorizontal(-50);
            sun2.changeSize(125);
            sun2.makeVisible();
            
            
             
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
