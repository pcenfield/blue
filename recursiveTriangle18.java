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
       int[] xMin1 = {0,0,0,0};
       int[] yMin1 = {0,0,0,0};
       int[] xMin2 = {0,0,0,0};
       int[] yMin2 = {0,0,0,0};
       int[] xMin3 = {0,0,0,0};
       int[] yMin3 = {0,0,0,0};
       System.out.println("new");
       page.setColor (Color.blue);
      
       
       //Find the distance between 2 points ex. - x,y & x1,y1
       double length = Math.sqrt( ( (xPos[1] - xPos[0]) * (xPos[1] - xPos[0]) ) + ( (yPos[1] - yPos[0]) * (yPos[1] - yPos[0]) ) );
       if (length <=30)  //if the segment/distance is 300 or so, good length to stop
       {
           //base case
            page.drawPolyline (xPos, yPos, xPos.length);
           System.out.println("end");
       }
       else
       {
            //populates the center triangle
            for (int i=0; i<3; i++)
            {
                xMid[i]=(xPos[i]+xPos[i+1])/2;
                yMid[i]=(yPos[i]+yPos[i+1])/2;
            }
            xMid[3]=xMid[0];
            yMid[3]=yMid[0];
            
            
            //makes the smaller individual triangles
            //triangle 1
            xMin1[0]=(xPos[1]+xMid[0])/2;
            xMin1[1]=(xPos[1]+xMid[1])/2;
            xMin1[2]=(xMid[0]+xMid[1])/2;
            xMin1[3]=xMin1[0];
            yMin1[0]=(yPos[1]+yMid[0])/2;
            xMin1[1]=(yPos[1]+yMid[1])/2;
            xMin1[2]=(yMid[0]+yMid[1])/2;
            yMin1[3]=yMin1[0];
            
            //triangle 2
            xMin2[0]=(xMid[1]+xMid[2])/2;
            xMin2[1]=(xPos[2]+xMid[1])/2;
            xMin2[2]=(xPos[2]+xMid[2])/2;
            xMin2[3]=xMin2[0];
            yMin2[0]=(yPos[1]+yMid[2])/2;
            xMin2[1]=(yPos[2]+yMid[1])/2;
            xMin2[2]=(yMid[2]+yMid[2])/2;
            yMin2[3]=yMin2[0];
            
            //triangle 3
            xMin3[0]=(xPos[0]+xMid[0])/2;
            xMin3[1]=(xMid[2]+xMid[0])/2;
            xMin3[2]=(xMid[2]+xPos[0])/2;
            xMin3[3]=xMin3[0];
            yMin3[0]=(yPos[0]+yMid[0])/2;
            xMin3[1]=(yMid[2]+yMid[0])/2;
            xMin3[2]=(yMid[2]+yPos[0])/2;
            yMin3[3]=yMin3[0];
            
            //draw the Triangle
            page.drawPolyline (xMid, yMid, xMid.length);
            page.setColor (Color.green);
            page.drawPolyline (xMin1, yMin1, xMin1.length);
            page.setColor (Color.black);
            page.drawPolyline (xMin2, yMin2, xMin2.length);
            page.setColor (Color.yellow);
            page.drawPolyline (xMin3, yMin3, xMin3.length);

            // Recursive calls for each section of triangle
            Triangle(xMid,yMid,page);
            //Triangle(xMin2,yMin2,page);
            //Triangle(xMin3,yMin3,page);            
       }



   }//end of Triangle
}
