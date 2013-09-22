
public class Class522 implements Class551 {

   public static final Class522 aClass522_9253 = new Class522(-2);
   public static final Class522 aClass522_9254 = new Class522(-3);
   public static final Class522 aClass522_9255 = new Class522(2);
   public static final Class522 aClass522_9256 = new Class522(3);
   static final Class522 aClass522_9257 = new Class522(4);
   final int anInt_9258;
   public static Class212_Sub1_Sub2 aClass212_Sub1_Sub2_9259;
   static int viewOfMapX;


   Class522(int var1) {
      this.anInt_9258 = var1 * 883869067;
   }

   public int getLanguageID(int var1) {
      return 205306403 * this.anInt_9258;
   }

   public static void method5974(int var0, int var1, int var2, boolean var3, int var4) {
      client.aLong_430 = 0L;
      int var5 = Class445.method5491(1917504476);
      if(3 == var0 || var5 == 3) {
         var3 = true;
      }

      if(!Class286.gameRenderer.method1892()) {
         var3 = true;
      }

      Class104_Sub17.method7375(var5, var0, var1, var2, var3, 508780035);
   }

   public static final void method5975(int var0, int var1) {
      if(null != Class104_Sub11.aClass240_Sub47_10199) {
         if(var0 >= 0 && var0 < Class104_Sub11.aClass240_Sub47_10199.anInt_7662 * 899618089) {
            Class37 var2 = Class104_Sub11.aClass240_Sub47_10199.aClass37Array_7661[var0];
            if(var2.aByte_855 == -1) {
               ConnectionHandler var3 = Class32.method230(-200921049);
               Class240_Sub27 var4 = Class47_Sub1.method3496(Class326.aClass326_6248, var3.aClass528_3433, 1917447504);
               var4.aClass240_Sub8_Sub1_7370.putByte(2 + Class258.method3383(var2.aString_853, -2142618809), -1189815676);
               var4.aClass240_Sub8_Sub1_7370.method4463(var0, -1760277943);
               var4.aClass240_Sub8_Sub1_7370.putString(var2.aString_853, (byte)-79);
               var3.addPacket(var4, 914305142);
            }
         }
      }
   }

   public static void method5976(int[] var0, Object[] var1, int var2, int var3, byte var4) {
      if(var2 < var3) {
         int var5 = (var3 + var2) / 2;
         int var6 = var2;
         int var7 = var0[var5];
         var0[var5] = var0[var3];
         var0[var3] = var7;
         Object var8 = var1[var5];
         var1[var5] = var1[var3];
         var1[var3] = var8;
         int var9 = Integer.MAX_VALUE == var7?0:1;

         for(int var10 = var2; var10 < var3; ++var10) {
            if(var0[var10] < var7 + (var10 & var9)) {
               int var11 = var0[var10];
               var0[var10] = var0[var6];
               var0[var6] = var11;
               Object var12 = var1[var10];
               var1[var10] = var1[var6];
               var1[var6++] = var12;
            }
         }

         var0[var3] = var0[var6];
         var0[var6] = var7;
         var1[var3] = var1[var6];
         var1[var6] = var8;
         method5976(var0, var1, var2, var6 - 1, (byte)108);
         method5976(var0, var1, var6 + 1, var3, (byte)99);
      }

   }

   static void method5977(int var0) {
      Class494.method5780(false, -1626899059);
      if(-1217210815 * Class248_Sub1.anInt_6450 >= 0 && Class248_Sub1.anInt_6450 * -1217210815 != 0) {
         Class462.setRenderToolkit(Class248_Sub1.anInt_6450 * -1217210815, false, -2020335019);
         if(Class104_Sub21.renderSettings.currentToolkit.getToolkitID() != Class248_Sub1.anInt_6450 * -1217210815) {
            switch(Class248_Sub1.anInt_6450 * -1217210815) {
            case 1:
               Class274.method3603(Class486.aClass486_8985, (short)-17188);
               break;
            case 3:
               Class274.method3603(Class486.aClass486_8986, (short)-12839);
            }
         }

         Class248_Sub1.anInt_6450 = 1564984895;
      }

   }

   static final void method5978(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub10_7292.method1653(-594341511);
   }
}
