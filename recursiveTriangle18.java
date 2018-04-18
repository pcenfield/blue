import javax.swing.JApplet;
import java.awt.*;

public class recursiveTriangle18 extends JApplet
{
   private final int APPLET_WIDTH = 800;
   private final int APPLET_HEIGHT = 800;

/*
   //x is accross and y is down
   point 1 - Right  A x[0],y[0] (720,600)
   point 2 - Left   B x[1],y[1]
   point 3 - Top    C x[2],y[2]
   point 4 draws back to point 1 to complete triangle

*/  private int[] xPos = {720, 80, 400, 720};
    private int[] yPos = {600, 600, 40, 600};


   //-----------------------------------------------------------------
   //  Sets up the basic applet environment.
   //-----------------------------------------------------------------
   public void init()
   {
      setBackground (Color.white);
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }

   //-----------------------------------------------------------------
   //  Draws a rocket using polygons and polylines.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {

        page.setColor (Color.red);
        page.drawPolyline (xPos, yPos, xPos.length);
        

        Triangle(xPos,yPos,page);

   }//end of paint

   public void Triangle(int[] xPos, int[] yPos, Graphics page)
   {
       int[] xMid = {0,0,0,0};
       int[] yMid = {0,0,0,0};
       System.out.println("end");
       page.setColor (Color.blue);
       
       //Find the distance between 2 points ex. - x,y & x1,y1
       double length = Math.sqrt( ( (xPos[1] - xPos[0]) * (xPos[1] - xPos[0]) ) + ( (yPos[1] - yPos[0]) * (yPos[1] - yPos[0]) ) );
       if (length <=30)  //if the segment/distance is 300 or so, good length to stop
       {
           //base case
           System.out.println("end");
       }
       else
       {
            //find the mid points of each line segment
            for (int i=0; i<4; i++)
            {
                xMid[i]=xPos[i]+xPos[i+1]/2;
                System.out.println(xMid[i]);
                yMid[i]=yPos[i]+yPos[i+1]/2;
                System.out.println(yMid[i]);
            }

            //draw the Triangle
            page.drawPolyline (xPos, yPos, xPos.length);

            // Recursive calls for each section of triangle
            Triangle(xMid,yMid,page);
       }



   }//end of Triangle
}
