
public final class Class557 {

   Class557() throws Throwable {
      throw new Error();
   }

   static boolean method6152(String var0, String var1, byte var2) {
      Class11.anInt_58 = -1222210952;
      Class11.clientServerHandler = client.gameConnectionHandler;
      return Class240_Sub44.method4969(false, false, var0, var1, -1L);
   }

   static final void method6153(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, byte var3) {
      var0.anInt_2437 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111] * -1692845543;
      Class110_Sub1.method3149(var0, 381929710);
   }

   static final int[] extractInterfaceIntData(String var0, RSInterfaceData var1, int var2) {
      int[] var3 = null;
      if(var0.length() > 0 && var0.charAt(var0.length() - 1) == 89) {
         int var4 = var1.intTypes[(var1.intTypeIndex -= -708028207) * -831324111];
         if(var4 > 0) {
            for(var3 = new int[var4]; var4-- > 0; var3[var4] = var1.intTypes[(var1.intTypeIndex -= -708028207) * -831324111]) {
               ;
            }
         }
      }

      return var3;
   }

   static final void method6155(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      GameType.method5917(Class104_Sub11.aClass240_Sub47_10199 == var0.aClass240_Sub47_9501, var2, (short)3006);
   }

   public static synchronized void method6156(byte[] var0, int var1) {
      if(var0.length == 100 && 523864059 * Class548.anInt_9487 < 1000) {
         Class548.aByteArrayArray_9483[(Class548.anInt_9487 += -1596167373) * 523864059 - 1] = var0;
      } else if(var0.length == 5000 && Class548.anInt_9481 * 1910715135 < 250) {
         Class548.aByteArrayArray_9484[(Class548.anInt_9481 += -420229889) * 1910715135 - 1] = var0;
      } else if(var0.length == 30000 && -790902645 * Class548.anInt_9480 < 50) {
         Class548.aByteArrayArray_9485[(Class548.anInt_9480 += 1889034019) * -790902645 - 1] = var0;
      } else {
         if(null != Class548.aByteArrayArrayArray_9482) {
            for(int var2 = 0; var2 < Class504.anIntArray_9120.length; ++var2) {
               if(var0.length == Class504.anIntArray_9120[var2] && Class548.anIntArray_9486[var2] < Class548.aByteArrayArrayArray_9482[var2].length) {
                  Class548.aByteArrayArrayArray_9482[var2][Class548.anIntArray_9486[var2]++] = var0;
                  return;
               }
            }
         }

      }
   }

   public static int method6157(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if((var5 & 1) == 1) {
         int var7 = var3;
         var3 = var4;
         var4 = var7;
      }

      var2 &= 3;
      return var2 == 0?var0:(1 == var2?var1:(2 == var2?7 - var0 - (var3 - 1):7 - var1 - (var4 - 1)));
   }

   static boolean method6158(short var0) {
      try {
         Class433 var1 = new Class433();
         byte[] var2 = var1.method5414(Class343.aByteArray_6545, (byte)16);
         Class411.method5069(var2, (byte)-38);
         return true;
      } catch (Exception var3) {
         return false;
      }
   }

   static final void method6159(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class418.method5192((byte)-90);
   }
}
