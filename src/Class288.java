import java.io.File;

public class Class288 {

   static final String aString_4825;
   public static final String aString_4826;
   public static final String aString_4827;
   public static final String aString_4828;
   public static String javaVersion;


   static {
      String var0 = "Unknown";

      try {
         var0 = System.getProperty("java.vendor").toLowerCase();
      } catch (Exception var7) {
         ;
      }

      var0.toLowerCase();
      var0 = "Unknown";

      try {
         var0 = System.getProperty("java.version").toLowerCase();
      } catch (Exception var6) {
         ;
      }

      var0.toLowerCase();
      var0 = "Unknown";

      try {
         var0 = System.getProperty("os.name").toLowerCase();
      } catch (Exception var5) {
         ;
      }

      aString_4826 = var0.toLowerCase();
      var0 = "Unknown";

      try {
         var0 = System.getProperty("os.arch").toLowerCase();
      } catch (Exception var4) {
         ;
      }

      aString_4827 = var0.toLowerCase();
      var0 = "Unknown";

      try {
         var0 = System.getProperty("os.version").toLowerCase();
      } catch (Exception var3) {
         ;
      }

      aString_4825 = var0.toLowerCase();
      aString_4828 = String.format("%s (%s) [%s]", new Object[]{aString_4826, aString_4827, aString_4825});
      var0 = "~/";

      try {
         var0 = System.getProperty("user.home").toLowerCase();
      } catch (Exception var2) {
         ;
      }

      new File(var0);
   }

   Class288() throws Throwable {
      throw new Error();
   }

   static float method3698(float var0, float var1, float var2, float var3, float var4, float var5, int var6, byte var7) {
      float var8 = 0.0F;
      float var9 = var3 - var0;
      float var10 = var4 - var1;
      float var11 = var5 - var2;
      float var12 = 0.0F;
      float var13 = 0.0F;
      float var14 = 0.0F;

      for(WorldObjects var15 = client.aClass296_348.getWorldObjects(); var8 < 1.1F; var8 += 0.1F) {
         float var16 = var0 + var8 * var9;
         float var17 = var1 + var8 * var10;
         float var18 = var11 * var8 + var2;
         int var19 = (int)var16 >> 9;
         int var20 = (int)var18 >> 9;
         if(var19 > 0 && var20 > 0 && var19 < client.aClass296_348.getMaxX((byte)12) && var20 < client.aClass296_348.getMaxY(-1467567214)) {
            int var21 = Class521.myPlayer.plane;
            if(var21 < 3 && (client.aClass296_348.method3753().aByteArrayArrayArray_4768[1][var19][var20] & 2) != 0) {
               ++var21;
            }

            int var22 = var15.aClass171Array_4486[var21].getHeight((int)var16, (int)var18);
            if((float)var22 < var17) {
               if(var6 >= 2) {
                  return var8 - 0.1F + method3698(var12, var13, var14, var16, var17, var18, var6 - 1, (byte)-43) * 0.1F;
               }

               return var8;
            }
         }

         var12 = var16;
         var13 = var17;
         var14 = var18;
      }

      return -1.0F;
   }

   static final void method3699(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      Class210.method2652(var0.intTypes[-831324111 * var0.intTypeIndex], var0.intTypes[1 + var0.intTypeIndex * -831324111], 255, -1732784532);
   }

   static final void method3700(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var0.aClass68_9508.anIntArray_1277[var2];
   }

   static final void method3701(RSInterfaceData var0, short var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1555835161 * Class224.anInt_3846;
   }

   static final void method3702(RSInterfaceData var0, int var1) {
      var0.mouseData[var0.anIntArray_9518[var0.anInt_9510 * -1756266293]] = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
   }
}
