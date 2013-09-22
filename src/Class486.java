
public class Class486 implements Class551 {

   static final Class486 aClass486_8979 = new Class486(5);
   static final Class486 aClass486_8980 = new Class486(1);
   public static final Class486 aClass486_8981 = new Class486(8);
   public static final Class486 aClass486_8982 = new Class486(3);
   public static final Class486 aClass486_8983 = new Class486(4);
   public static final Class486 aClass486_8984 = new Class486(10);
   public static final Class486 aClass486_8985 = new Class486(6);
   public static final Class486 aClass486_8986 = new Class486(7);
   static final Class486 aClass486_8987 = new Class486(0);
   public static final Class486 aClass486_8988 = new Class486(9);
   static final Class486 aClass486_8989 = new Class486(2);
   static final Class486 aClass486_8990 = new Class486(11);
   public static final Class486 aClass486_8991 = new Class486(12);
   public static final Class486 aClass486_8992 = new Class486(13);
   final int anInt_8993;


   Class486(int var1) {
      this.anInt_8993 = -714981777 * var1;
   }

   public int getLanguageID(int var1) {
      return -1620909937 * this.anInt_8993;
   }

   static final void method5739(RSCharacter var0, byte var1) {
      if(null != var0.anIntArray_4313 || var0.anIntArray_4343 != null) {
         boolean var2 = true;
         MapPoint var3 = client.aClass296_348.getMapArea();

         for(int var4 = 0; var4 < var0.anIntArray_4313.length; ++var4) {
            int var5 = -1;
            if(var0.anIntArray_4313 != null) {
               var5 = var0.anIntArray_4313[var4];
            }

            if(-1 == var5) {
               if(!var0.method3246(var4, -1, (byte)-87)) {
                  var2 = false;
               }
            } else {
               var2 = false;
               boolean var6 = false;
               boolean var7 = false;
               GameCoord var8 = var0.method6203().gameCoord;
               int var9;
               int var12;
               int var13;
               if((var5 & -1073741824) == -1073741824) {
                  var9 = var5 & 268435455;
                  int var10 = var9 >> 14;
                  int var11 = var9 & 16383;
                  var12 = (int)var8.floatX - ((var10 - 1265321541 * var3.loadedMapX) * 512 + 256);
                  var13 = (int)var8.floatZ - (256 + (var11 - var3.loadedMapY * -1996781083) * 512);
               } else {
                  GameCoord var15;
                  if((var5 & '\u8000') != 0) {
                     var9 = var5 & 32767;
                     Player var16 = client.aPlayerArray[var9];
                     if(var16 == null) {
                        var0.method3246(var4, -1, (byte)-104);
                        continue;
                     }

                     var15 = var16.method6203().gameCoord;
                     var12 = (int)var8.floatX - (int)var15.floatX;
                     var13 = (int)var8.floatZ - (int)var15.floatZ;
                  } else {
                     Class240_Sub9 var14 = (Class240_Sub9)client.npcNodeList.getNode((long)var5);
                     if(var14 == null) {
                        var0.method3246(var4, -1, (byte)-96);
                        continue;
                     }

                     NPC var17 = (NPC)var14.anObject_6783;
                     var15 = var17.method6203().gameCoord;
                     var12 = (int)var8.floatX - (int)var15.floatX;
                     var13 = (int)var8.floatZ - (int)var15.floatZ;
                  }
               }

               if(var12 != 0 || 0 != var13) {
                  var0.method3246(var4, (int)(Math.atan2((double)var12, (double)var13) * 2607.5945876176133D) & 16383, (byte)-20);
               }
            }
         }

         if(var2) {
            var0.anIntArray_4313 = null;
            var0.anIntArray_4343 = null;
         }

      }
   }

   public static MapElements method5740(CacheDataUnpacker var0, String var1, boolean var2, int var3) {
      int var4 = var0.getCacheOffset(var1);
      if(-1 == var4) {
         return new MapElements(0);
      } else {
         int[] var5 = var0.getSubOffsets(var4);
         MapElements var6 = new MapElements(var5.length);
         int var7 = 0;
         int var8 = 0;

         while(var7 < 655819939 * var6.size) {
            ByteArrayDataNode var9 = new ByteArrayDataNode(var0.getDataBytes(var4, var5[var8++], -300011480));
            int var10 = var9.method4480(1260717178);
            int var11 = var9.readShort(1393154923);
            int var12 = var9.readByte(1819086215);
            if(!var2 && 1 == var12) {
               var6.size -= -152973557;
            } else {
               var6.positionData[var7] = var10;
               var6.cacheIDs[var7] = var11;
               ++var7;
            }
         }

         return var6;
      }
   }

   static final void method5741(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >>> 16];
      RSInterface var5 = Class322.method3967(var4, var3, 1858254393);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = null == var5?-1:var5.cacheID * 1278853609;
   }
}
