package edu.up.cs301.campusmap;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import java.util.Random;

/**
 * Created by josephsmoyer on 9/3/17.
 */

public class CustomToken extends SimpleMapToken {
    /**
     * Constructor
     *
     * @param xCoord the x-coordinate
     * @param yCoord the y-coordinate
     */
    public CustomToken(float xCoord, float yCoord) {
        super(xCoord, yCoord);
        x = xCoord;
        y = yCoord;
        Random rand = new Random();
        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);
        radius = 12;
        paint = new Paint(); // paint object, which paints ...

        paint.setColor(Color.rgb(r, g, b));



    }
    public void drawOn(Canvas canvas) {
        canvas.drawRect( x,  y, x+30,  y+60, paint );//creates a rectangle with 4 circles grouped

        canvas.drawCircle(x-10, y+10, radius, paint);//around it as a custom
        canvas.drawCircle(x+40, y+10, radius, paint);
        canvas.drawCircle(x-10, y+50, radius, paint);
        canvas.drawCircle(x+40, y+50, radius, paint);
    }
}
