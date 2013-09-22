
public class Class598 {

   boolean aBoolean_9871;
   final int anInt_9872;
   final int anInt_9873;
   static final int[] anIntArray_9874 = new int[120];
   final int anInt_9875;
   final int anInt_9876;
   public static Class44 aClass44_9877;
   public static Class71 aClass71_9878;


   public int method6464(int var1, byte var2) {
      int var3 = var1 / 10;
      return this.method6467(var3, -709555914);
   }

   public boolean method6465(byte var1) {
      return -1 != this.anInt_9876 * 326116879;
   }

   public boolean method6466(byte var1) {
      return this.aBoolean_9871;
   }

   public int method6467(int var1, int var2) {
      int var3 = 1;
      int var4 = -1158357735 * this.anInt_9872 - 1;

      for(int var5 = 0; var5 < var4 && var1 >= anIntArray_9874[var5]; ++var5) {
         var3 = var5 + 2;
      }

      return var3;
   }

   int method6468(int var1, int var2) {
      if(var1 < 0) {
         var1 = 0;
      }

      if(var1 > this.anInt_9872 * -1158357735) {
         var1 = -1158357735 * this.anInt_9872;
      }

      return var1 < 2?0:anIntArray_9874[var1 - 2];
   }

   int method6469(int var1, int var2) {
      return this.method6468(var1, 1279502674) * 10;
   }

   static {
      int var0 = 0;

      for(int var1 = 0; var1 < 120; ++var1) {
         int var2 = var1 + 1;
         int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
         var0 += var3;
         anIntArray_9874[var1] = var0 / 4;
      }

   }

   int method6470(int var1) {
      return this.anInt_9873 * 2118661651;
   }

   public int method6471(int var1) {
      return 108825553 * this.anInt_9875;
   }

   public int method6472(int var1) {
      return 326116879 * this.anInt_9876;
   }

   Class598(int var1, int var2, boolean var3, boolean var4, int var5) {
      this.anInt_9873 = 361628699 * var1;
      this.anInt_9872 = 819539753 * var2;
      this.aBoolean_9871 = var3;
      if(var3) {
         this.anInt_9875 = var5 * -249713359;
         this.anInt_9876 = this.method6469(var5, -2101346679) * 287574255;
      } else {
         this.anInt_9875 = 249713359;
         this.anInt_9876 = -287574255;
      }

   }

   static final void method6473(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Character.toUpperCase((char)var2);
   }

   static final void method6474(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(null != Class248_Sub1.aNodeArrayList_6457) {
         NodeListNode var3 = Class248_Sub1.aNodeArrayList_6457.getNode((long)var2);
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3 != null?1:0;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   public static Class531[] method6475(int var0) {
      return new Class531[]{Class531.aClass531_9329, Class531.aClass531_9331, Class531.aClass531_9326, Class531.aClass531_9332, Class531.aClass531_9324, Class531.aClass531_9333, Class531.aClass531_9327, Class531.aClass531_9328, Class531.aClass531_9325, Class531.aClass531_9323};
   }

   public static void method6476(int var0, int var1, int var2, String var3, int var4) {
      RSInterface var5 = DrawingTarget.method2201(var1, var2, (byte)115);
      if(var5 != null) {
         if(var5.anObjectArray_2572 != null) {
            Class240_Sub17 var6 = new Class240_Sub17();
            var6.aClass132_6903 = var5;
            var6.anInt_6906 = var0 * 449552269;
            var6.aString_6910 = var3;
            var6.anObjectArray_6907 = var5.anObjectArray_2572;
            Class411.method5074(var6, (byte)1);
         }

         if(client.method174(var5).method4998(var0 - 1, -1348534751)) {
            ConnectionHandler var8 = Class32.method230(1768765941);
            if(client.loginStage * -243034353 == 4 || 6 == client.loginStage * -243034353 || 3 == -243034353 * client.loginStage) {
               if(var5.aString_2568 == null) {
                  Class66_Sub1_Sub2.method686(var8, var5, var0, var1, var2, 1172916642);
               } else {
                  Class240_Sub27 var7 = Class47_Sub1.method3496(Class326.aClass326_6320, var8.aClass528_3433, 1917447504);
                  var7.aClass240_Sub8_Sub1_7370.putByte(7 + Class258.method3383(var5.aString_2568, 26183498), 1552738204);
                  var7.aClass240_Sub8_Sub1_7370.method4463(var2, 1762346076);
                  var7.aClass240_Sub8_Sub1_7370.putString(var5.aString_2568, (byte)-10);
                  var7.aClass240_Sub8_Sub1_7370.method4477(var0, (byte)127);
                  var7.aClass240_Sub8_Sub1_7370.method4515(var1, -2145416161);
                  var8.addPacket(var7, 33779067);
               }

            }
         }
      }
   }

   static final void method6477(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub14_7309.method1701(-1634166780);
   }

   public static void method6478(int var0, int var1) {
      Class240_Sub22_Sub5 var2 = Class65_Sub1_Sub2.method866(7, (long)var0);
      var2.method597((byte)0);
   }
}
