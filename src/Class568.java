
public class Class568 {

   static Class603 aClass603_9631 = new Class603(128);
   static long aLong_9632;


   Class568() throws Throwable {
      throw new Error();
   }

   static final void method6246(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      var0.anInt_2464 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111] * 1424066997;
      Class110_Sub1.method3149(var0, -1569867306);
   }

   static final void method6247(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class194.method2520(var2, var3, false, (short)11100);
   }

   public static void method6248(int var0) {
      for(Class240_Sub5 var1 = (Class240_Sub5)Class524.aNodeArrayList_9273.start(); var1 != null; var1 = (Class240_Sub5)Class524.aNodeArrayList_9273.next()) {
         if(var1.aClass254_Sub1_6754.method3329((byte)-106)) {
            Class215.method2700(var1.anInt_6753 * -484590667, (byte)47);
         } else {
            var1.aClass254_Sub1_6754.method4160((byte)0);

            try {
               var1.aClass254_Sub1_6754.method3322(-1969597582);
            } catch (Exception var4) {
               CacheFileID.method1397("" + -484590667 * var1.anInt_6753, var4, -153487581);
               Class215.method2700(var1.anInt_6753 * -484590667, (byte)49);
            }

            if(!var1.aBoolean_6758 && !var1.aBoolean_6759) {
               Class240_Sub4_Sub3 var2 = var1.aClass254_Sub1_6754.method3333(1251519737);
               if(var2 != null) {
                  Class240_Sub41_Sub1 var3 = var2.method2558(784422678);
                  if(null != var3) {
                     var3.method417(var1.anInt_6757 * -1170565933, 1112224777);
                     Class217.aClass240_Sub41_Sub4_3757.method521(var3);
                     var1.aBoolean_6758 = true;
                  }
               }
            }
         }
      }

   }

   static final void method6249(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, short var3) {
      var0.aBoolean_2496 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111] == 1;
      Class110_Sub1.method3149(var0, 1882434778);
      if(-1 == -1001687885 * var0.anInt_2428 && !var1.aBoolean_2054) {
         Class231_Sub6.method5370(var0.cacheID * 1278853609, -1749634685);
      }

   }

   static void method6250(String[] var0, int[] var1, int var2, int var3, int var4) {
      if(var2 < var3) {
         int var5 = (var2 + var3) / 2;
         int var6 = var2;
         String var7 = var0[var5];
         var0[var5] = var0[var3];
         var0[var3] = var7;
         int var8 = var1[var5];
         var1[var5] = var1[var3];
         var1[var3] = var8;

         for(int var9 = var2; var9 < var3; ++var9) {
            if(null == var7 || var0[var9] != null && var0[var9].compareTo(var7) < (var9 & 1)) {
               String var10 = var0[var9];
               var0[var9] = var0[var6];
               var0[var6] = var10;
               int var11 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6++] = var11;
            }
         }

         var0[var3] = var0[var6];
         var0[var6] = var7;
         var1[var3] = var1[var6];
         var1[var6] = var8;
         method6250(var0, var1, var2, var6 - 1, 1485594528);
         method6250(var0, var1, var6 + 1, var3, 1485594528);
      }

   }

   static final void method6251(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class300.method3809(var3, var4, var0, 1609925516);
   }

   public static boolean method6252(byte var0, short var1) {
      int var2 = var0 & 255;
      return 0 == var2?false:var2 < 128 || var2 >= 160 || Class535.aCharArray_9440[var2 - 128] != 0;
   }

   static final void method6253(RSInterfaceData var0, short var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class296.method3792(var3, var4, var0, 1714021379);
   }
}
