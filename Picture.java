/**
 * The image shows a sunset by the beach/sea while the person in the image 
 * is fishing near the sea, rod looks a bit funny due to not being able to angle
 * the bait or thinking of a great option for it.
 * 
 * @author  Cristian Solis
 * @version 02.10.2026
 */
public class Picture
{
    private Square wave1;
    private Square wave2;
    private Square wave3;
    
    private Circle sun1;
    private Circle sun2;
    
    private Square sky1;
    private Square sky2;
    private Square sky3;
    
    private Circle sand;
    private Triangle bait;
    private Triangle rod;
    private Person man;
    
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wave1 = new Square();
        wave2 = new Square();
        wave3 = new Square();
        
        sky1 = new Square();
        sky2 = new Square();
        sky3 = new Square();
        
        sun1 = new Circle();
        sun2 = new Circle();
        
        sand = new Circle();
        bait = new Triangle();
        rod = new Triangle();
        man = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky1.changeColor("topaz");
            sky1.moveVertical(-500);
            sky1.moveHorizontal(-350);
            sky1.changeSize(550);
            sky1.makeVisible();
            
            sky2.changeColor("pastelorange");
            sky2.moveVertical(-550);
            sky2.moveHorizontal(-350);
            sky2.changeSize(550);
            sky2.makeVisible();
            
            sky3.changeColor("orangered");
            sky3.moveVertical(-600);
            sky3.moveHorizontal(-350);
            sky3.changeSize(550);
            sky3.makeVisible();
            
            sun1.changeColor("sunset");
            sun1.moveVertical(-15);
            sun1.moveHorizontal(-75);
            sun1.changeSize(175);
            sun1.makeVisible();
            
            sun2.changeColor("yellowrose");
            sun2.moveVertical(5);
            sun2.moveHorizontal(-50);
            sun2.changeSize(125);
            sun2.makeVisible();
            
            wave1.changeColor("lightcyan");
            wave1.moveVertical(50);
            wave1.moveHorizontal(-350);
            wave1.changeSize(550);
            wave1.makeVisible();
            
            wave2.changeColor("blizzard");
            wave2.moveVertical(90);
            wave2.moveHorizontal(-350);
            wave2.changeSize(550);
            wave2.makeVisible();
            
            wave3.changeColor("sea");
            wave3.moveVertical(130);
            wave3.moveHorizontal(-350);
            wave3.changeSize(550);
            wave3.makeVisible();
            
            sand.changeColor("cornsilk");
            sand.moveVertical(135);
            sand.moveHorizontal(-265);
            sand.changeSize(125);
            sand.makeVisible();
            
            man.changeSize(45,30);
            man.changeColor("cobalt");
            man.moveVertical(40);
            man.moveHorizontal(-210);
            man.makeVisible();
            
            rod.changeSize(40,10);
            rod.changeColor("black");
            rod.moveVertical(100);
            rod.moveHorizontal(-125);
            rod.makeVisible();
            
            bait.changeSize(20,20);
            bait.changeColor("gray");
            bait.moveVertical(130);
            bait.moveHorizontal(-125);
            bait.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {   
        sky1.changeColor("black");
        sky2.changeColor("white");
        sky3.changeColor("black");
        sun1.changeColor("white");
        sun2.changeColor("black");
        wave1.changeColor("white");
        wave2.changeColor("black");
        wave3.changeColor("white");
        sand.changeColor("black");
        man.changeColor("white");
        rod.changeColor("black");
        bait.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sky1.changeColor("topaz");
        sky2.changeColor("pastelorange");
        sky3.changeColor("orangered");
        sun1.changeColor("sunset");
        sun2.changeColor("yellowrose");
        wave1.changeColor("lightcyan");
        wave2.changeColor("blizzard");
        wave3.changeColor("sea");
        sand.changeColor("cornsilk");
        man.changeColor("cobalt");
        rod.changeColor("black");
        bait.changeColor("gray");
    }
}
