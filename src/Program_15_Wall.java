public class Program_15_Wall {

    Double width = 0.0; //Declare Instance variable
    Double height = 0.0; //Declare Instance variable

    public Program_15_Wall(double widthcon, double hieghtCon) {
        this.width = widthcon;
        this.height = hieghtCon;
    }

    /**
     * This method is used to get width
     *
     * @return
     */
    public double getWidth() {
        return width;
    }

    /**
     * This method is used to get Height
     *
     * @return
     */
    public double getHeight() {
        return height;
    }

    /**
     * This method is used to Set width
     *
     * @param width1
     */

    public void setWidth(double width1) {
        if (width1 < 0) {
            width = 0.0;
        } else {
            width = width1;
        }
    }

    /**
     * This method is used to set Height
     *
     * @param height1
     */
    public void setHeight(double height1) {
        if (height1 < 0) {
            height = 0.0;
        } else {
            height = height1;
        }
    }

    /**
     * This method is use to get the value of area
     *
     * @return
     */
    public double getArea() {
        double area = width * height;
        return area;
    }

    public static void main(String[] args) {
        Program_15_Wall wall = new Program_15_Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("widh= " + wall.getWidth());
        System.out.println("hight= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}



