package com.rpg;

import java.awt.Dimension;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JComponent;

/**
 * Common methods used in this project
 */
public class Helper {
    private static Dimension screenSize;

    public static void setScreenSize(Dimension screenSize) {
        System.out.println(screenSize);
        Helper.screenSize = screenSize;
    }

    public static Dimension getScreenSize() {
        return screenSize;
    }

    public static int getScreenWidth() {
        return (int) screenSize.getWidth();
    }

    public static int getScreenHeight() {
        return (int) screenSize.getHeight();
    }

    public static void setX(JComponent comp, int x) {
        comp.setLocation(x, comp.getY());
    }

    public static void setY(JComponent comp, int y) {
        comp.setLocation(comp.getX(), y);
    }

    public static int xMiddle(JComponent comp) {
        return (getScreenWidth() - comp.getWidth()) / 2;
    }

    public static int yMiddle(JComponent comp) {
        return (getScreenHeight() - comp.getHeight()) / 2;
    }

    public static void xCenter(JComponent comp) {
        setX(comp, xMiddle(comp));
    }

    public static void yCenter(JComponent comp) {
        setY(comp, yMiddle(comp));
    }

    public static void xyCenter(JComponent comp) {
        xCenter(comp);
        yCenter(comp);
    }

    public static void setXFromRight(JComponent comp, int right) {
        setX(comp, getScreenWidth() - comp.getWidth() - right);
    }

    public static void setYFromBottom(JComponent comp, int bottom) {
        setY(comp, getScreenHeight() - comp.getHeight() - bottom);
    }

    public static void setPercentX(JComponent comp, double percentX) {
        setX(comp, (int) (getScreenWidth() * percentX / 100));
    }

    public static void setPercentY(JComponent comp, double percentY) {
        setY(comp, (int) (getScreenHeight() * percentY / 100));
    }

    public static void setPercentLocation(JComponent comp, double percentX, double percentY) {
        setPercentX(comp, percentX);
        setPercentY(comp, percentY);
    }

    public static void setPercentXFromRight(JComponent comp, double percentRight) {
        setX(comp, (int) ((getScreenWidth() - comp.getHeight()) * percentRight / 100));
    }

    public static void setPercentYFromBottom(JComponent comp, double percentBottom) {
        setY(comp, (int) ((getScreenHeight() - comp.getHeight()) * percentBottom / 100));
    }

    public static void setWidth(JComponent comp, int width) {
        comp.setSize(width, comp.getHeight());
    }

    public static void setHeight(JComponent comp, int height) {
        comp.setSize(comp.getWidth(), height);
    }

    public static int getWidthFromPercent(double percentWidth) {
        return (int) (getScreenWidth() * percentWidth / 100);
    }

    public static int getHeightFromPercent(double percentHeight) {
        return (int) (getScreenHeight() * percentHeight / 100);
    }

    public static void setPercentWidth(JComponent comp, int percentWidth) {
        setWidth(comp, getWidthFromPercent(percentWidth));
    }

    public static void setPercentHeight(JComponent comp, int percentHeight) {
        setHeight(comp, getHeightFromPercent(percentHeight));
    }

    public static void setPercentSize(JComponent comp, int percentWidth, int percentHeight) {
        setPercentWidth(comp, percentWidth);
        setPercentHeight(comp, percentHeight);
    }

    public static void setFullScreen(JComponent comp) {
        comp.setSize(getScreenSize());
        comp.setLocation(0, 0);
    }

    /**
     * @param localPath
     * @return This method returns the absolute path to the resouces folder/local
     *         path
     *         <p>
     *         {@code ClassName.class.getResources(arg)} points to:
     *         <p>
     *         "C:/ ... /PackageName/src/main/resources" + arg
     *         <p>
     *         In our case {@code StoryFrame.class.getResource("/abc.jpg")} points
     *         to:
     *         <p>
     *         "C:/ ... /rpg/src/main/resources/abc.jpg"
     */

    public static URL getFullPathURL(String localPath) {
        return Main.class.getResource(localPath);
    }

    public static ImageIcon getImageIcon(String localPath) {
        return new ImageIcon(getFullPathURL(localPath));
    }

    public static Image getImage(String localPath) {
        return new ImageIcon(getFullPathURL(localPath)).getImage();
    }

    /**
     * Creates a new {@code Image} object with the specified {@code width} and
     * {@code height} from the given {@code localPath}
     */
    public static Image getScaledImage(String localPath, int width, int height, int processUsing) {
        return getImage(localPath).getScaledInstance(width, height, processUsing);
    }

    /**
     * Creates a new {@code ImageIcon} object with the specified {@code width} and
     * {@code height} from the given {@code localPath}
     */
    public static ImageIcon getScaledImageIcon(String localPath, int width, int height, int processUsing) {
        return new ImageIcon(getScaledImage(localPath, width, height, processUsing));
    }

    /**
     * Creates a new {@code ImageIcon} object with the specified {@code width} and
     * {@code height} from the given {@code localPath}
     */
    public static ImageIcon getFullScreenImageIcon(String localPath, int processUsing) {
        return getScaledImageIcon(localPath, getScreenWidth(), getScreenHeight(), processUsing);
    }
}
