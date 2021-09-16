package ru.mirea.Lab21;

import java.awt.*;

public class AppTest
{
    public static void main(String[] args)
    {
        App app = new App();

        final int windowWidth = app.getWidth();
        final int windowHeight = app.getHeight();

        for (int i = 0; i < 10; i++)
        {
            int figureNum = (int)(Math.random() * 3);
            int posX, posY;
            int width, height;

            switch(figureNum)
            {
                case 0: // Circle
                    posX = (int)(Math.random() * (7 * windowWidth / 8) + windowWidth / 8);
                    posY = (int)(Math.random() * (7 * windowHeight / 8) + windowHeight / 8);
                    width = (int)(Math.random() * windowWidth / 8 + 60);
                    height = (int)(Math.random() * windowHeight / 8 + 60);
                    Circle circle = new Circle(getRandomColor(), posX, posY, width, height);
                    circle.draw(app.getGraphics());
                    break;
                case 1: // Rectangle
                    posX = (int)(Math.random() * 280 + 60);
                    posY = (int)(Math.random() * 280 + 60);
                    width = (int)(Math.random() * 80 + 20);
                    height = (int)(Math.random() * 80 + 20);
                    Rectangle rectangle = new Rectangle(getRandomColor(), posX, posY, width, height);
                    rectangle.draw(app.getGraphics());
                    break;
                case 2: // Triangle
                    int posX1 = (int)(Math.random() * 280 + 60);
                    int posY1 = (int)(Math.random() * 280 + 60);
                    int posX2 = (int)(Math.random() * 120 + posX1 - 60);
                    int posY2 = (int)(Math.random() * 120 + posY1 - 60);
                    int posX3 = (int)(Math.random() * 120 + posY1 - 60);
                    int posY3 = (int)(Math.random() * 120 + posY1 - 60);
                    Triangle triangle = new Triangle(getRandomColor(), posX1, posY1, posX2, posY2, posX3, posY3);
                    triangle.draw(app.getGraphics());
                    break;
                default:
                    break;
            }
        }
    }

    static public Color getRandomColor()
    {
        int colorNum = (int)(Math.random() * 7);

        switch(colorNum)
        {
            case 0:
                return Color.BLUE;
            case 1:
                return Color.CYAN;
            case 2:
                return Color.GREEN;
            case 3:
                return Color.MAGENTA;
            case 4:
                return Color.ORANGE;
            case 5:
                return Color.PINK;
            case 6:
                return Color.RED;
            case 7:
                return Color.YELLOW;
            default:
                return Color.WHITE;
        }
    }
}
