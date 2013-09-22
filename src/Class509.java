
public final class Class509 {

   byte[] aByteArray_9144 = new byte[18002];
   final int anInt_9145 = 16;
   final int anInt_9146 = 258;
   final int anInt_9147 = 6;
   final int anInt_9148 = 50;
   final int anInt_9149 = 4096;
   byte[] aByteArray_9150;
   int[] anIntArray_9151 = new int[16];
   int anInt_9152;
   int anInt_9153;
   int anInt_9154 = 0;
   int anInt_9155;
   byte[] aByteArray_9156;
   int anInt_9157 = 0;
   final int anInt_9158 = 18002;
   int anInt_9159;
   byte aByte_9160;
   int anInt_9161;
   int anInt_9162;
   int anInt_9163;
   int anInt_9164;
   int[] anIntArray_9165 = new int[256];
   int anInt_9166;
   int[] anIntArray_9167 = new int[257];
   int anInt_9168;
   boolean[] aBooleanArray_9169 = new boolean[256];
   int anInt_9170;
   boolean[] aBooleanArray_9171 = new boolean[16];
   int anInt_9172;
   int[][] anIntArrayArray_9173 = new int[6][258];
   byte[] aByteArray_9174 = new byte[18002];
   byte[] aByteArray_9175 = new byte[256];
   byte[][] aByteArrayArray_9176 = new byte[6][258];
   int[][] anIntArrayArray_9177 = new int[6][258];
   int[][] anIntArrayArray_9178 = new int[6][258];
   int[] anIntArray_9179 = new int[6];
   byte[] aByteArray_9180 = new byte[4096];
   int anInt_9181;
   public static int anInt_9182;
   static WorldMapText aClass198_9183;


   static final void method5912(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.aBoolean_314?1:0;
   }

   static final void method5913(byte var0) {
      if(client.aFloat_387 < 1070.0F) {
         client.aFloat_387 = 1070.0F;
      }

      if(client.aFloat_387 > 2980.0F) {
         client.aFloat_387 = 2980.0F;
      }

      while(client.aFloat_501 >= 16384.0F) {
         client.aFloat_501 -= 16384.0F;
      }

      while(client.aFloat_501 < 0.0F) {
         client.aFloat_501 += 16384.0F;
      }

      Class281 var1 = client.aClass296_348.method3753();
      WorldObjects var2 = client.aClass296_348.getWorldObjects();
      int var3 = Class326.anInt_6334 * 1890624197 >> 9;
      int var4 = -1205230297 * Class349.anInt_6617 >> 9;
      int var5 = CompProfile.getHeight(Class326.anInt_6334 * 1890624197, Class349.anInt_6617 * -1205230297, -763239015 * CacheFileID.anInt_2036);
      int var6 = 0;
      int var7;
      if(var3 > 3 && var4 > 3 && var3 < client.aClass296_348.getMaxX((byte)-98) - 4 && var4 < client.aClass296_348.getMaxY(1295516889) - 4) {
         for(var7 = var3 - 4; var7 <= 4 + var3; ++var7) {
            for(int var8 = var4 - 4; var8 <= 4 + var4; ++var8) {
               int var9 = -763239015 * CacheFileID.anInt_2036;
               if(var9 < 3 && var1.method3646(var7, var8, (byte)0)) {
                  ++var9;
               }

               int var10 = 0;
               byte[][] var11 = client.aClass296_348.method3752(var9, 1842980522);
               if(null != var11) {
                  var10 = (var11[var7][var8] & 255) * 8 << 2;
               }

               if(null != var2.planes && null != var2.planes[var9]) {
                  int var12 = var5 - (var2.planes[var9].method2155(var7, var8, (short)-13994) - var10);
                  if(var12 > var6) {
                     var6 = var12;
                  }
               }
            }
         }
      }

      var7 = (var6 >> 2) * 1536;
      if(var7 > 786432) {
         var7 = 786432;
      }

      if(var7 < 262144) {
         var7 = 262144;
      }

      if(var7 > client.anInt_396 * 456824667) {
         client.anInt_396 += 1331937491 * ((var7 - 456824667 * client.anInt_396) / 24);
      } else if(var7 < client.anInt_396 * 456824667) {
         client.anInt_396 += 1331937491 * ((var7 - client.anInt_396 * 456824667) / 80);
      }

   }

   static final void method5914(RSInterfaceData var0, int var1) {
      var0.longTypeIndex -= 2117648622;
      if(var0.aLongArray_9519[var0.longTypeIndex * 973044039] >= var0.aLongArray_9519[1 + var0.longTypeIndex * 973044039]) {
         var0.anInt_9510 += var0.anIntArray_9518[var0.anInt_9510 * -1756266293] * -1856838429;
      }

   }

   static final void method5915(RSInterfaceData var0, int var1) {
      ItemProfile.method5531(-277851451);
   }
}
