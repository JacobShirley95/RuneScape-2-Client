
public class Class258 {

   public boolean[] aBooleanArray_4434;
   static int optionBoxY;


   void method3380(ByteArrayDataNode var1, int var2, byte var3) {
      int var4;
      int var5;
      if(2 == var2) {
         this.aBooleanArray_4434 = new boolean[400];
         var4 = var1.method4490((byte)0);

         for(var5 = 0; var5 < var4; ++var5) {
            this.aBooleanArray_4434[var1.method4490((byte)0)] = true;
         }
      } else if(3 == var2) {
         var1.readByte(-1070515480);
         var4 = var1.method4490((byte)0);

         for(var5 = 0; var5 < var4; ++var5) {
            var1.method4490((byte)0);
            var1.readByte(146795879);
         }
      }

   }

   void method3381(ByteArrayDataNode var1, int var2) {
      while(true) {
         int var3 = var1.readByte(339548718);
         if(0 == var3) {
            return;
         }

         this.method3380(var1, var3, (byte)-19);
      }
   }

   public static void method3382(boolean var0, byte var1) {
      if(2 != 415041591 * client.anInt_356 && 4 != client.anInt_356 * 415041591) {
         if(!var0) {
            if(null != Class95.aClass104Array_1892) {
               CharTask[] var2 = Class95.aClass104Array_1892;

               for(int var3 = 0; var3 < var2.length; ++var3) {
                  CharTask var4 = var2[var3];
                  var4.method1343((byte)-1);
               }
            }

            if(-88495733 * Class95.anInt_1899 != -1) {
               Class586.method6365((short)353);
               Class217.anInt_3752 = 255660039;
               Class489.method5747(Class95.anInt_1899 * -88495733, 255, 50, -1346158157);
            }
         }

         client.anInt_356 = 1865571086;
         Animator.aClass240_Sub8_9141 = null;
         client.aBoolean_357 = false;
         if(Class95.anInt_1900 * -172816177 > 0) {
            Class203.method2587(Class434.aClass434_8364, -172816177 * Class95.anInt_1900, -1, -1795813537);
         }

         Class212.method2662(-383348825);
         Class240_Sub27 var5 = Class47_Sub1.method3496(Class326.aClass326_6276, client.gameConnectionHandler.aClass528_3433, 1917447504);
         var5.aClass240_Sub8_Sub1_7370.putByte(var0?1:0, -1419219515);
         client.gameConnectionHandler.addPacket(var5, 1586578233);
      }
   }

   public static int method3383(String var0, int var1) {
      return var0.length() + 1;
   }

   static final void method3384(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class18.method96(var3, var4, var0, -352375980);
   }
}
