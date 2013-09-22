import java.awt.Point;

public class Class483 {

   public static final Class483 aClass483_8936 = new Class483(Class500.aClass500_9085);
   public static final Class483 aClass483_8937 = new Class483(Class500.aClass500_9085);
   public static final Class483 aClass483_8938 = new Class483(Class500.aClass500_9085);
   public static final Class483 aClass483_8939 = new Class483(Class500.aClass500_9084);
   final Class500 aClass500_8940;
   public static final Class483 aClass483_8941 = new Class483(Class500.aClass500_9085);
   public static final Class483 aClass483_8942 = new Class483(Class500.aClass500_9085);
   public static final Class483 aClass483_8943 = new Class483(Class500.aClass500_9084);
   public static final Class483 aClass483_8944 = new Class483(Class500.aClass500_9084);
   public static final Class483 aClass483_8945 = new Class483(Class500.aClass500_9084);
   public static final Class483 aClass483_8946 = new Class483(Class500.aClass500_9084);
   public static final Class483 aClass483_8947 = new Class483(Class500.aClass500_9084);
   public static final Class483 aClass483_8948 = new Class483(Class500.aClass500_9084);
   public static final Class483 aClass483_8949 = new Class483(Class500.aClass500_9084);
   public static final Class483 aClass483_8950 = new Class483(Class500.aClass500_9084);
   public static final Class483 aClass483_8951 = new Class483(Class500.aClass500_9084);
   public static final Class483 aClass483_8952 = new Class483(Class500.aClass500_9084);
   public static final Class483 aClass483_8953 = new Class483(Class500.aClass500_9084);
   public static final Class483 aClass483_8954 = new Class483(Class500.aClass500_9084);
   public static final Class483 aClass483_8955 = new Class483(Class500.aClass500_9082);
   public static final Class483 aClass483_8956 = new Class483(Class500.aClass500_9084);
   public static final Class483 aClass483_8957 = new Class483(Class500.aClass500_9083);
   public static final Class483 aClass483_8958 = new Class483(Class500.aClass500_9084);
   public static final Class483 aClass483_8959 = new Class483(Class500.aClass500_9084);
   public static final Class483 aClass483_8960 = new Class483(Class500.aClass500_9084);
   int anInt_8961;
   public static final Class483 aClass483_8962 = new Class483(Class500.aClass500_9084);
   public static final Class483 aClass483_8963 = new Class483(Class500.aClass500_9085);
   Class487 aClass487_8964;


   Class483(Class500 var1) {
      this.aClass500_8940 = var1;
      this.anInt_8961 = 356036909;
   }

   public void method5715(int var1, int var2) {
      this.anInt_8961 = 356036909 * var1;
   }

   public Class487 method5716(int var1) {
      return this.aClass487_8964;
   }

   public int method5717(int var1) {
      return this.anInt_8961 * -1857960283;
   }

   public static Class483[] method5718(int var0) {
      return new Class483[]{aClass483_8956, aClass483_8937, aClass483_8938, aClass483_8963, aClass483_8936, aClass483_8941, aClass483_8942, aClass483_8962, aClass483_8944, aClass483_8945, aClass483_8946, aClass483_8954, aClass483_8939, aClass483_8943, aClass483_8950, aClass483_8951, aClass483_8949, aClass483_8953, aClass483_8952, aClass483_8947, aClass483_8948, aClass483_8957, aClass483_8958, aClass483_8959, aClass483_8960, aClass483_8955};
   }

   public void method5719(Class487 var1, int var2) {
      if(var1.method5742(16261276) != this.aClass500_8940) {
         throw new IllegalArgumentException();
      } else {
         this.aClass487_8964 = var1;
      }
   }

   static final void method5720(RSInterface var0, RSInterfaceData var1, int var2) {
      RSFont var3 = var0.method1707(Class368.aFontUnpacker_6922, client.aClass339_284, (byte)1);
      int var4 = var1.intTypes[(var1.intTypeIndex -= -708028207) * -831324111];
      Point var5 = var3.getDrawPoint(var0.title, -533669195 * var0.width, 956409315 * var0.anInt_2435, var4, Class481.nameIconsSprites, 430211499);
      var1.intTypes[(var1.intTypeIndex += -708028207) * -831324111 - 1] = var5.x;
      var1.intTypes[(var1.intTypeIndex += -708028207) * -831324111 - 1] = var5.y;
   }

   static String method5721(long var0) {
      if(var0 > 0L && var0 < 6582952005840035281L) {
         if(0L == var0 % 37L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; 0L != var3; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5;
            char var8;
            for(var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
               long var6 = var0;
               var0 /= 37L;
               var8 = Class542.aCharArray_9473[(int)(var6 - 37L * var0)];
               if(95 == var8) {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   static final void method5722(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub14_7323.method1701(-1058938685);
   }

   static final void method5723(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if(var2 >= 1 && var3 >= 1 && var2 <= client.aClass296_348.getMaxX((byte)-52) - 2 && var3 <= client.aClass296_348.getMaxY(1342227692) - 2) {
         int var10 = var0;
         if(var0 < 3 && client.aClass296_348.method3753().method3646(var2, var3, (byte)0)) {
            var10 = var0 + 1;
         }

         if(client.aClass296_348.getWorldObjects() == null) {
            return;
         }

         client.aClass296_348.method3760(-2006699880).method5403(Class286.gameRenderer, var0, var1, var2, var3, (short)19212);
         if(var4 >= 0) {
            int var11 = Class104_Sub21.renderSettings.aClass540_Sub18_7280.method4005((byte)-69);
            Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub18_7280, 1, 1747107450);
            client.aClass296_348.method3760(-1873465553).method5402(Class286.gameRenderer, var10, var0, var2, var3, var4, var5, var6, var7, var8, 1286698626);
            Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub18_7280, var11, 237918650);
         }
      }

   }
}
