import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

public class CustomCursorKit {

   Robot aRobot_3740 = new Robot();


   public void method2703(Component var1, int[] var2, int var3, int var4, Point var5) {
      if(null != var2) {
         BufferedImage var6 = new BufferedImage(var3, var4, 2);
         var6.setRGB(0, 0, var3, var4, var2, 0, var3);
         var1.setCursor(var1.getToolkit().createCustomCursor(var6, var5, (String)null));
      } else {
         var1.setCursor((Cursor)null);
      }

   }

   public CustomCursorKit() throws Exception {}
}
