
public class Class548 {

   static int anInt_9480 = 0;
   static int anInt_9481 = 0;
   public static byte[][][] aByteArrayArrayArray_9482;
   static byte[][] aByteArrayArray_9483 = new byte[1000][];
   static byte[][] aByteArrayArray_9484 = new byte[250][];
   static byte[][] aByteArrayArray_9485 = new byte[50][];
   public static int[] anIntArray_9486;
   static int anInt_9487 = 0;


   public static synchronized byte[] method6107(int var0, byte var1) {
      byte[] var4;
      if(var0 == 100 && anInt_9487 * 523864059 > 0) {
         var4 = aByteArrayArray_9483[(anInt_9487 -= -1596167373) * 523864059];
         aByteArrayArray_9483[523864059 * anInt_9487] = null;
         return var4;
      } else if(var0 == 5000 && anInt_9481 * 1910715135 > 0) {
         var4 = aByteArrayArray_9484[(anInt_9481 -= -420229889) * 1910715135];
         aByteArrayArray_9484[anInt_9481 * 1910715135] = null;
         return var4;
      } else if(30000 == var0 && -790902645 * anInt_9480 > 0) {
         var4 = aByteArrayArray_9485[(anInt_9480 -= 1889034019) * -790902645];
         aByteArrayArray_9485[anInt_9480 * -790902645] = null;
         return var4;
      } else {
         if(aByteArrayArrayArray_9482 != null) {
            for(int var2 = 0; var2 < Class504.anIntArray_9120.length; ++var2) {
               if(Class504.anIntArray_9120[var2] == var0 && anIntArray_9486[var2] > 0) {
                  byte[] var3 = aByteArrayArrayArray_9482[var2][--anIntArray_9486[var2]];
                  aByteArrayArrayArray_9482[var2][anIntArray_9486[var2]] = null;
                  return var3;
               }
            }
         }

         return new byte[var0];
      }
   }

   Class548() throws Throwable {
      throw new Error();
   }

   static final void method6108(int var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      if(415041591 * client.anInt_356 == 4) {
         int var8 = -688404505 * Class15.availablePlayers;
         int[] var9 = Class15.playersIndices;

         int var10;
         for(var10 = 0; var10 < var8; ++var10) {
            Player var11 = client.aPlayerArray[var9[var10]];
            if(null != var11) {
               var11.method3271(var0, var1, var2, var3, var4, var5, var6, (byte)-91);
            }
         }

         for(var10 = 0; var10 < 1636714459 * client.availableNPCS; ++var10) {
            int var13 = client.npcIndices[var10];
            Class240_Sub9 var12 = (Class240_Sub9)client.npcNodeList.getNode((long)var13);
            if(var12 != null) {
               ((RSCharacter)var12.anObject_6783).method3271(var0, var1, var2, var3, var4, var5, var6, (byte)-122);
            }
         }

      }
   }

   public static final int method6109(String var0, int var1) {
      if(null != var0 && var0.length() != 0) {
         for(int var2 = 0; var2 < -275736435 * client.ignoreListCount; ++var2) {
            if(var0.equalsIgnoreCase(client.ignoreList[var2].aString_111)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }
}
