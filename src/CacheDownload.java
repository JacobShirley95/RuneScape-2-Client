import java.math.BigInteger;
import java.util.Iterator;

public class CacheDownload {

   ByteArrayDataNode aClass240_Sub8_7135;
   AbstractUpdateServerConnector updateServer;
   BigInteger aBigInteger_7137;
   BigInteger aBigInteger_7138;
   Class240_Sub22_Sub15_Sub1 cacheDatagram;
   Class370 aClass370_7140;
   CacheData[] cacheDataArray;
   public static CacheDataUnpacker cache23Unpacker;


   public CacheDownload(AbstractUpdateServerConnector var1, Class370 var2, BigInteger var3, BigInteger var4) {
      this.updateServer = var1;
      this.aClass370_7140 = var2;
      this.aBigInteger_7137 = var3;
      this.aBigInteger_7138 = var4;
      if(!this.updateServer.method3631((byte)6)) {
         this.cacheDatagram = this.updateServer.addNode(255, 255, (byte)0, true, (byte)40);
      }

   }

   public void method4772(int var1) {
      if(this.cacheDataArray != null) {
         int var2;
         for(var2 = 0; var2 < this.cacheDataArray.length; ++var2) {
            if(this.cacheDataArray[var2] != null) {
               this.cacheDataArray[var2].method5383((byte)3);
            }
         }

         for(var2 = 0; var2 < this.cacheDataArray.length; ++var2) {
            if(this.cacheDataArray[var2] != null) {
               this.cacheDataArray[var2].method5384(1743252149);
            }
         }

      }
   }

   public CacheData getCacheData(int var1, Class243 var2, Class243 var3) {
      return this.getCacheData(var1, var2, var3, true, 899855983);
   }

   CacheData getCacheData(int var1, Class243 var2, Class243 var3, boolean var4, int var5) {
      if(null == this.aClass240_Sub8_7135) {
         throw new RuntimeException();
      } else if(var1 >= 0 && var1 < this.cacheDataArray.length) {
         if(null != this.cacheDataArray[var1]) {
            return this.cacheDataArray[var1];
         } else {
            this.aClass240_Sub8_7135.index = -271469072 * var1 + 623884914;
            int var6 = this.aClass240_Sub8_7135.method4480(1260717178);
            int var7 = this.aClass240_Sub8_7135.method4480(1260717178);
            int var8 = this.aClass240_Sub8_7135.method4480(1260717178);
            this.aClass240_Sub8_7135.method4480(1260717178);
            byte[] var9 = new byte[64];
            this.aClass240_Sub8_7135.fillArray(var9, 0, 64);
            CacheData var10 = new CacheData(var1, var2, var3, this.updateServer, this.aClass370_7140, var6, var9, var7, var4, var8);
            this.cacheDataArray[var1] = var10;
            return var10;
         }
      } else {
         throw new RuntimeException();
      }
   }

   public boolean updateCache() {
      if(null != this.aClass240_Sub8_7135) {
         return true;
      } else {
         if(null == this.cacheDatagram) {
            if(this.updateServer.method3631((byte)52)) {
               return false;
            }

            this.cacheDatagram = this.updateServer.addNode(255, 255, (byte)0, true, (byte)-48);
         }

         if(this.cacheDatagram.aBoolean_3671) {
            return false;
         } else {
            ByteArrayDataNode var2 = new ByteArrayDataNode(this.cacheDatagram.getBytes(-2130013452));
            var2.index = -1627579553;
            int var3 = var2.readByte(-14806197);
            var2.index += -271469072 * var3;
            byte[] var4 = new byte[var2.data.length - var2.index * 964952859];
            var2.fillArray(var4, 0, var4.length);
            byte[] var5;
            if(this.aBigInteger_7137 != null && null != this.aBigInteger_7138) {
               BigInteger var6 = new BigInteger(var4);
               BigInteger var7 = var6.modPow(this.aBigInteger_7137, this.aBigInteger_7138);
               var5 = var7.toByteArray();
            } else {
               var5 = var4;
            }

            if(var5.length != 65) {
               throw new RuntimeException();
            } else {
               byte[] var12 = Class255.method3348(var2.data, 5, 964952859 * var2.index - var4.length - 5, -113478103);

               int var13;
               for(var13 = 0; var13 < 64; ++var13) {
                  if(var12[var13] != var5[1 + var13]) {
                     throw new RuntimeException();
                  }
               }

               this.aClass240_Sub8_7135 = var2;
               if(this.cacheDataArray == null) {
                  this.cacheDataArray = new CacheData[var3];
               } else {
                  for(var13 = 0; var13 < this.cacheDataArray.length; ++var13) {
                     if(null != this.cacheDataArray[var13]) {
                        this.aClass240_Sub8_7135.index = var13 * -271469072 + 623884914;
                        int var8 = this.aClass240_Sub8_7135.method4480(1260717178);
                        int var9 = this.aClass240_Sub8_7135.method4480(1260717178);
                        int var10 = this.aClass240_Sub8_7135.method4480(1260717178);
                        byte[] var11 = new byte[64];
                        this.aClass240_Sub8_7135.fillArray(var11, 0, 64);
                        this.cacheDataArray[var13].defineCacheData(var8, var11, var9, var10, -1910404984);
                     }
                  }
               }

               return true;
            }
         }
      }
   }

   static final void method4776(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class336.method4165(var3, var4, var0, (byte)-8);
   }

   static final void method4777(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class317.method3923(var3, var4, var0, (byte)1);
   }

   static final void method4778(RSInterfaceData var0, int var1) {
      Class255.method3350(641900995);
   }

   public static void method4779(WorldObjects var0, Renderer var1, int var2) {
      Iterator var3 = Class597.aList_9869.iterator();

      while(var3.hasNext()) {
         Class594 var4 = (Class594)var3.next();
         if(var4.aBoolean_9814) {
            var4.method6439(var0, var1);
         }
      }

   }

   static void method4780(RSInterfaceData var0, byte var1) {
      var0.intTypes[-831324111 * var0.intTypeIndex - 1] = HintMarker.aClass583_3709.method6327(var0.intTypes[var0.intTypeIndex * -831324111 - 1], 1607917596).anInt_9580 * 2107464001;
   }

   static final void method4781(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1500060803 * var3.X1;
   }

   static final void method4782(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class568.method6246(var3, var4, var0, -1480440933);
   }
}
