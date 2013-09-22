import java.awt.Canvas;

public class Class46 {

   public static final Class46 aClass46_971 = new Class46(1);
   static final Class46 aClass46_972 = new Class46(0);
   public int anInt_973;


   Class46(int var1) {
      this.anInt_973 = 1003785067 * var1;
   }

   static synchronized Renderer getRenderer(int id, Canvas canvas, Class163 var2, Class96 var3, CacheDataUnpacker var4, int var5, int width, int height, byte var8) {
      if(0 == id) {
         return Class18.getSoftwareRenderer(canvas, var2, var3, width, height, 1844849142);
      } else if(id == 1) {
         return Class180.method2251(canvas, var2, var3, var5);
      } else if(id == 5) {
         return Class307.getOpenGLRenderer(canvas, var2, var3, var4, var5);
      } else if(3 == id) {
         return Class331.method4095(canvas, var2, var3, var4, var5);
      } else {
         throw new IllegalArgumentException("");
      }
   }

   public static void method437(int var0) {
      try {
         int var1;
         if(Class134.anInt_2617 * 1919337139 == 1) {
            var1 = Class134.aClass240_Sub41_Sub2_2616.method482(1632504441);
            if(var1 > 0 && Class134.aClass240_Sub41_Sub2_2616.method450(-371432569)) {
               var1 -= Class134.anInt_2620 * -31206119;
               if(var1 < 0) {
                  var1 = 0;
               }

               Class134.aClass240_Sub41_Sub2_2616.method483(var1, 1011679073);
               return;
            }

            Class134.aClass240_Sub41_Sub2_2616.method448((byte)114);
            Class134.aClass240_Sub41_Sub2_2616.method474((byte)-91);
            if(null != ConnectionUpdate.aCacheUnpacker_119) {
               Class134.anInt_2617 = 1284471030;
            } else {
               Class134.anInt_2617 = 0;
            }

            NodeList.aClass240_Sub35_9068 = null;
            Class540_Sub20.aClass312_6336 = null;
         }

         if(3 == 1919337139 * Class134.anInt_2617) {
            var1 = Class134.aClass240_Sub41_Sub2_2616.method482(1632504441);
            if(var1 < Class586.anInt_9739 * -101602273 && Class134.aClass240_Sub41_Sub2_2616.method450(-67209323)) {
               var1 += -1804807109 * LanguagePack.anInt_9289;
               if(var1 > Class586.anInt_9739 * -101602273) {
                  var1 = -101602273 * Class586.anInt_9739;
               }

               Class134.aClass240_Sub41_Sub2_2616.method483(var1, 240172958);
               return;
            }

            LanguagePack.anInt_9289 = 0;
            Class134.anInt_2617 = 0;
         }
      } catch (Exception var2) {
         var2.printStackTrace();
         Class134.aClass240_Sub41_Sub2_2616.method448((byte)-13);
         Class16.method87(1923974959);
      }

   }

   static final void method438(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      Class483.method5720(var3, var0, -655647005);
   }

   static final void method439(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -2124084621;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      int var4 = var0.intTypes[2 + var0.intTypeIndex * -831324111];
      if(var3 == -1) {
         throw new RuntimeException();
      } else {
         Class470 var5 = Class493.aClass466_9034.method5614(var3, (byte)20);
         if(var2 != var5.aChar_8694) {
            throw new RuntimeException();
         } else {
            int[] var6 = var5.method5652(Integer.valueOf(var4), (byte)-7);
            int var7 = 0;
            if(var6 != null) {
               var7 = var6.length;
            }

            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var7;
         }
      }
   }

   static final void method440(RSInterface var0, RSInterfaceData var1, int var2) {
      int var3 = var1.intTypes[(var1.intTypeIndex -= -708028207) * -831324111];
      int var4 = var1.intTypes[(var1.intTypeIndex -= -708028207) * -831324111] - 1;
      if(2 != var0.anInt_2469 * -28225993) {
         throw new RuntimeException("");
      } else {
         NPCComposite var5 = Class104_Sub6.characterUnpacker.method5670(1007149995 * var0.anInt_2416, -1568647333);
         if(null == var0.aClass442_2594) {
            var0.aClass442_2594 = new Class442(var5, false);
         }

         var0.aClass442_2594.aLong_8440 = Class585_Sub1.method4152(414073090) * -7074691745365666227L;
         if(var4 >= 0 && var4 < var5.anIntArray_8641.length) {
            var0.aClass442_2594.anIntArray_8439[var4] = var3;
            Class110_Sub1.method3149(var0, 111126475);
         } else {
            throw new RuntimeException("");
         }
      }
   }

   public static void method441(byte var0) {
      if(Class52.aClass327_1072 != null) {
         Class52.aClass327_1072.method4025((byte)-53);
      }

      if(Class542.aThread_9472 != null) {
         while(true) {
            try {
               Class542.aThread_9472.join();
               break;
            } catch (InterruptedException var2) {
               ;
            }
         }
      }

   }
}
