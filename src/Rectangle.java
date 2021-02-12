// 13021326
// e.szatmari@bbk.ac.uk

public class Rectangle {
    int xLowerLeft, yLowerLeft, xUpperRight, yUpperRight;
    int width, height;

    Rectangle( int xLowerLeft, int yLowerLeft, int width, int height )
    {
        this.xLowerLeft = xLowerLeft;
        this.yLowerLeft = yLowerLeft;
        this.width = width;
        this.height = height;
        this.xUpperRight = xLowerLeft + width;
        this.yUpperRight = yLowerLeft + height;
    }

    Rectangle( int xUpperRight, int yUpperRight )
    {
        this.xUpperRight = xUpperRight;
        this.yUpperRight = yUpperRight;
        this.xLowerLeft = 0;
        this.yLowerLeft = 0;
        this.width = xUpperRight;
        this.height = yUpperRight;

    }

    public boolean containsPoint( int x, int y )
    {
        if (xLowerLeft <= x && x <= xUpperRight && yLowerLeft <=y && y <= yUpperRight) {
            return true;
        }
       else {return false;}
    }

    public boolean containsRectangle( Rectangle r )
    {
        if (this.xLowerLeft <= r.xLowerLeft && r.xUpperRight <= this.xUpperRight &&
                this.yLowerLeft <= r.yLowerLeft && r.yUpperRight <= this.yUpperRight) {
            return true;
        }
        else {return false;}
    }

    public String toString()
    {
        return "(" + this.xLowerLeft + "," + this.yLowerLeft + "), (" + this.xUpperRight + "," + this.yUpperRight +")";
    }
    public static void main(String[] args)
    {

    }
}