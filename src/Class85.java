
public class Class85 {

   static int anInt_1730;
   static int anInt_1731;
   static int anInt_1732;
   static int[] anIntArray_1733;
   static int anInt_1734;
   static int anInt_1735;
   static int anInt_1736;
   static int anInt_1737;


   static void method1112(int[] var0, int var1, int var2) {
      int var3 = anInt_1734 + (var2 << 1);
      int var5;
      if(anIntArray_1733 == null || anIntArray_1733.length < var3) {
         int[] var4 = new int[var3];

         for(var5 = 0; var5 < anInt_1734; ++var5) {
            var4[var5] = anIntArray_1733[var5];
         }

         anIntArray_1733 = var4;
      }

      var2 += var1;
      int var8 = var2 - 2;

      for(var5 = var1; var5 < var2; var5 += 2) {
         int var6 = var0[var8 + 1];
         int var7 = var0[var5 + 1];
         if(var6 < var7) {
            anIntArray_1733[anInt_1734++] = var0[var8];
            anIntArray_1733[anInt_1734++] = var6;
            anIntArray_1733[anInt_1734++] = var0[var5];
            anIntArray_1733[anInt_1734++] = var7;
         } else if(var7 < var6) {
            anIntArray_1733[anInt_1734++] = var0[var5];
            anIntArray_1733[anInt_1734++] = var7;
            anIntArray_1733[anInt_1734++] = var0[var8];
            anIntArray_1733[anInt_1734++] = var6;
         }

         var8 = var5;
      }

   }

   public static void method1113(Renderer var0, int[] var1, int var2) {
      method1114(var0, var1, 0, var1.length, var2, (int[])null, (int[])null);
   }

   static void method1114(Renderer var0, int[] var1, int var2, int var3, int var4, int[] var5, int[] var6) {
      int[] var7 = new int[4];
      var0.method1913(var7);
      if(var5 != null && var7[3] - var7[1] != var5.length) {
         throw new IllegalStateException();
      } else {
         method1115();
         method1112(var1, var2, var3);
         method1116(var7[1]);

         while(method1117(var7[3])) {
            int var8 = anInt_1732;
            int var9 = anInt_1736;
            int var10 = anInt_1730;
            if(var5 != null) {
               int var11 = var10 - var7[1];
               if(var8 < var5[var11] + var7[0]) {
                  var8 = var5[var11] + var7[0];
               }

               if(var9 > var5[var11] + var6[var11] + var7[0]) {
                  var9 = var5[var11] + var6[var11] + var7[0];
               }

               if(var9 - var8 <= 0) {
                  continue;
               }
            }

            var0.method1922(var8, var10, var9 - var8, var4, 1);
         }

      }
   }

   static void method1115() {
      anInt_1734 = 0;
   }

   static void method1116(int var0) {
      if(anInt_1734 < 0) {
         anInt_1737 = 0;
         anInt_1731 = 0;
         anInt_1735 = 0;
         anInt_1730 = 2147483646;
      } else {
         method1118(0, anInt_1734);
         int var1 = anIntArray_1733[1];
         if(var1 < var0) {
            var1 = var0;
         }

         byte var2 = 0;

         int var3;
         for(var3 = 0; var3 < anInt_1734; var3 += 4) {
            int var4 = anIntArray_1733[var3 + 1];
            if(var1 < var4) {
               break;
            }

            int var5 = anIntArray_1733[var3];
            int var6 = anIntArray_1733[var3 + 2];
            int var7 = anIntArray_1733[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + '\u8000';
            anIntArray_1733[var3] = var9 + (var1 - var4) * var8;
            anIntArray_1733[var3 + 2] = var8;
         }

         anInt_1735 = var2;
         anInt_1731 = var3;
         anInt_1737 = var3;
         anInt_1730 = var1 - 1;
      }
   }

   static boolean method1117(int var0) {
      int var1 = anInt_1731;
      int var2 = anInt_1737;
      int var3 = anInt_1730;

      while(var2 >= var1) {
         ++var3;
         anInt_1730 = var3;
         if(var3 >= var0) {
            return false;
         }

         int var4 = anInt_1735;

         while(true) {
            int var5;
            int var6;
            if(var1 < anInt_1734) {
               var5 = anIntArray_1733[var1 + 1];
               if(var3 >= var5) {
                  var6 = anIntArray_1733[var1];
                  int var7 = anIntArray_1733[var1 + 2];
                  int var8 = anIntArray_1733[var1 + 3];
                  int var9 = (var7 - var6 << 16) / (var8 - var5);
                  int var10 = (var6 << 16) + '\u8000';
                  anIntArray_1733[var1] = var10;
                  anIntArray_1733[var1 + 2] = var9;
                  var1 += 4;
                  continue;
               }
            }

            for(var5 = var4; var5 < var1; var5 += 4) {
               var6 = anIntArray_1733[var5 + 3];
               if(var3 >= var6) {
                  anIntArray_1733[var5] = anIntArray_1733[var4];
                  anIntArray_1733[var5 + 1] = anIntArray_1733[var4 + 1];
                  anIntArray_1733[var5 + 2] = anIntArray_1733[var4 + 2];
                  anIntArray_1733[var5 + 3] = anIntArray_1733[var4 + 3];
                  var4 += 4;
               }
            }

            if(var4 == anInt_1734) {
               anInt_1734 = 0;
               return false;
            }

            method1119(var4, var1);
            anInt_1735 = var4;
            anInt_1731 = var1;
            var2 = var4;
            break;
         }
      }

      anInt_1732 = anIntArray_1733[var2] >> 16;
      anInt_1736 = anIntArray_1733[var2 + 4] >> 16;
      anIntArray_1733[var2] += anIntArray_1733[var2 + 2];
      anIntArray_1733[var2 + 4] += anIntArray_1733[var2 + 6];
      var2 += 8;
      anInt_1737 = var2;
      return true;
   }

   static void method1118(int var0, int var1) {
      if(var1 > var0 + 4) {
         int var2 = var0;
         int var3 = anIntArray_1733[var0];
         int var4 = anIntArray_1733[var0 + 1];
         int var5 = anIntArray_1733[var0 + 2];
         int var6 = anIntArray_1733[var0 + 3];

         for(int var7 = var0 + 4; var7 < var1; var7 += 4) {
            int var8 = anIntArray_1733[var7 + 1];
            if(var8 < var4) {
               anIntArray_1733[var2] = anIntArray_1733[var7];
               anIntArray_1733[var2 + 1] = var8;
               anIntArray_1733[var2 + 2] = anIntArray_1733[var7 + 2];
               anIntArray_1733[var2 + 3] = anIntArray_1733[var7 + 3];
               var2 += 4;
               anIntArray_1733[var7] = anIntArray_1733[var2];
               anIntArray_1733[var7 + 1] = anIntArray_1733[var2 + 1];
               anIntArray_1733[var7 + 2] = anIntArray_1733[var2 + 2];
               anIntArray_1733[var7 + 3] = anIntArray_1733[var2 + 3];
            }
         }

         anIntArray_1733[var2] = var3;
         anIntArray_1733[var2 + 1] = var4;
         anIntArray_1733[var2 + 2] = var5;
         anIntArray_1733[var2 + 3] = var6;
         method1118(var0, var2);
         method1118(var2 + 4, var1);
      }
   }

   static void method1119(int var0, int var1) {
      while(true) {
         if(var1 >= var0 + 8) {
            boolean var2 = true;

            for(int var3 = var0 + 4; var3 < var1; var3 += 4) {
               int var4 = anIntArray_1733[var3 - 4];
               int var5 = anIntArray_1733[var3];
               if(var4 > var5) {
                  var2 = false;
                  anIntArray_1733[var3 - 4] = var5;
                  anIntArray_1733[var3] = var4;
                  var4 = anIntArray_1733[var3 - 2];
                  anIntArray_1733[var3 - 2] = anIntArray_1733[var3 + 2];
                  anIntArray_1733[var3 + 2] = var4;
                  var4 = anIntArray_1733[var3 - 1];
                  anIntArray_1733[var3 - 1] = anIntArray_1733[var3 + 3];
                  anIntArray_1733[var3 + 3] = var4;
               }
            }

            if(!var2) {
               var1 -= 4;
               continue;
            }
         }

         return;
      }
   }

   public static void method1120(Renderer var0, int[] var1, int var2, int[] var3, int[] var4) {
      method1114(var0, var1, 0, var1.length, var2, var3, var4);
   }

   Class85() throws Throwable {
      throw new Error();
   }
}
