import java.io.IOException;
import java.net.Socket;

public class Class606 implements Class551 {

   final int anInt_9911;
   static final Class606 aClass606_9912 = new Class606(1);
   static final Class606 aClass606_9913 = new Class606(2);
   static final Class606 aClass606_9914 = new Class606(0);


   Class606(int var1) {
      this.anInt_9911 = var1 * 266487191;
   }

   public int getLanguageID(int var1) {
      return this.anInt_9911 * -979596761;
   }

   public static String method6518(CharSequence var0, Class436 var1, int var2) {
      if(var0 == null) {
         return null;
      } else {
         int var3 = 0;

         int var4;
         for(var4 = var0.length(); var3 < var4 && Class120.method1516(var0.charAt(var3), (byte)0); ++var3) {
            ;
         }

         while(var4 > var3 && Class120.method1516(var0.charAt(var4 - 1), (byte)0)) {
            --var4;
         }

         int var5 = var4 - var3;
         if(var5 >= 1 && var5 <= Class23.method147(var1, -1982395567)) {
            StringBuilder var6 = new StringBuilder(var5);

            for(int var7 = var3; var7 < var4; ++var7) {
               char var8 = var0.charAt(var7);
               if(Class29.method213(var8, 544364746)) {
                  char var9 = Class283_Sub5.method5312(var8, 696585977);
                  if(var9 != 0) {
                     var6.append(var9);
                  }
               }
            }

            if(var6.length() == 0) {
               return null;
            } else {
               return var6.toString();
            }
         } else {
            return null;
         }
      }
   }

   public static AbstractServerConnection createServerConnection(Socket var0, int var1, int var2) throws IOException {
      return new ServerConnection(var0, var1);
   }

   static void method6520(int var0, int var1) {
      if(565730191 * Class11.anInt_58 == 166) {
         Class11.anInt_62 = -895637929 * var0;
      } else if(264 == Class11.anInt_58 * 565730191) {
         Class11.anInt_71 = -1093533067 * var0;
      }

   }
}
