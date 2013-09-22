import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

public class Class408 {

   public static final Class408 aClass408_7743 = new Class408(2);
   public static final Class408 aClass408_7744 = new Class408(2);
   public static final Class408 aClass408_7745 = new Class408(2);
   public static final Class408 aClass408_7746 = new Class408(2);
   public static final Class408 aClass408_7747 = new Class408(1);
   public static final Class408 aClass408_7748 = new Class408(1);
   public static final Class408 aClass408_7749 = new Class408(1);
   public static final Class408 aClass408_7750 = new Class408(1);
   public static final Class408 aClass408_7751 = new Class408(1);
   public final int anInt_7752;
   public static final Class408 aClass408_7753 = new Class408(2);


   Class408(int var1) {
      this.anInt_7752 = 2094162581 * var1;
   }

   static final void method5037(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class53.captureMouseList.method3099((short)280)?1:0;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class53.captureMouseList.method3106(138328107)?1:0;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class53.captureMouseList.method3101(1147936874)?1:0;
   }

   static final void method5038(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -2124084621;
      long var2 = (long)var0.intTypes[var0.intTypeIndex * -831324111];
      long var4 = (long)var0.intTypes[1 + var0.intTypeIndex * -831324111];
      long var6 = (long)var0.intTypes[var0.intTypeIndex * -831324111 + 2];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = (int)(var2 * var6 / var4);
   }

   public static void method5039(int var0) {
      if(null == Class102.aFrame_1967) {
         int var1 = -1703748163 * client.canvasX;
         int var2 = -1448718273 * client.canvasY;
         int var3 = Class221.clientWidth * -1364963335 - 1111410531 * Class29.canvasWidth - var1;
         int var4 = 772194201 * client.clientHeight - -75607525 * Class597.canvasHeight - var2;
         if(var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
            try {
               Container var5 = DrawingTarget.getGameContainer(1119257574);
               int var6 = 0;
               int var7 = 0;
               if(ConnectionUpdate.clientFrame == var5) {
                  Insets var8 = ConnectionUpdate.clientFrame.getInsets();
                  var6 = var8.left;
                  var7 = var8.top;
               }

               Graphics var10 = var5.getGraphics();
               var10.setColor(Color.black);
               if(var1 > 0) {
                  var10.fillRect(var6, var7, var1, client.clientHeight * 772194201);
               }

               if(var2 > 0) {
                  var10.fillRect(var6, var7, -1364963335 * Class221.clientWidth, var2);
               }

               if(var3 > 0) {
                  var10.fillRect(var6 + -1364963335 * Class221.clientWidth - var3, var7, var3, client.clientHeight * 772194201);
               }

               if(var4 > 0) {
                  var10.fillRect(var6, var7 + 772194201 * client.clientHeight - var4, Class221.clientWidth * -1364963335, var4);
               }
            } catch (Exception var9) {
               ;
            }
         }

      }
   }

   static final void method5040(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 229917053 * Class556.anInt_9542;
   }

   static final void method5041(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.aShort_404;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.aShort_556;
   }
}
