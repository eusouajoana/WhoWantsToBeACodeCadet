package org.academiadecodigo.simplegraphics.graphics;

public class Color {
    private int red;
    private int green;
    private int blue;

    // Color constants

    public static final Color RED = new Color(255, 0, 0);
    public static final Color GREEN = new Color(0, 255, 0);
    public static final Color BLUE = new Color(0, 0, 255);
    public static final Color WHITE = new Color(255, 255, 255);
    public static final Color LIGHT_GRAY = new Color(192, 192, 192);
    public static final Color GRAY = new Color(128, 128, 128);
    public static final Color DARK_GRAY = new Color(64, 64, 64);
    public static final Color BLACK = new Color(0, 0, 0);
    public static final Color CYAN = new Color(0, 255, 255);
    public static final Color MAGENTA = new Color(255, 0, 255);
    public static final Color YELLOW = new Color(255, 255, 0);
    public static final Color PINK = new Color(255, 175, 175);
    public static final Color ORANGE = new Color(255, 200, 0);

    /**
     * Constructs a new Color object.
     * @param var1 the red value of the color (between 0 and 255)
     * @param var2 the green value of the color (between 0 and 255)
     * @param var3 the blue value of the color (between 0 and 255)
     */
    public Color(int var1, int var2, int var3)
    {
        this.red = var1;
        this.green = var2;
        this.blue = var3;
    }

    /**
     * Gets the red value of this color.
     * @return the red value (between 0 and 255)
     */
    public int getRed()
    {
       return red;
    }

    /**
     * Gets the green value of this color.
     * @return the green value (between 0 and 255)
     */
    public int getGreen()
    {
       return green;
    }

    /**
     * Gets the blue value of this color.
     * @return the blue value (between 0 and 255)
     */
    public int getBlue()
    {
       return blue;
    }
}
