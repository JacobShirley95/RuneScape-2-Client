import java.io.EOFException;
import java.io.IOException;

public final class Class243 {

   int id;
   CacheFile mainFileCache = null;
   CacheFile cacheIDx = null;
   static byte[] data = new byte[520];
   int anInt_4073 = 1549636808;


   public boolean method3115(int var1, byte[] var2, int var3, int var4) {
      synchronized(this.mainFileCache) {
         if(var3 >= 0 && var3 <= 821768389 * this.anInt_4073) {
            boolean var6 = this.method3117(var1, var2, var3, true, 1995362880);
            if(!var6) {
               var6 = this.method3117(var1, var2, var3, false, 1937612665);
            }

            return var6;
         } else {
            throw new IllegalArgumentException();
         }
      }
   }

   public byte[] method3116(int var1, int var2) {
      synchronized(this.mainFileCache) {
         try {
            Object var10000;
            if(this.cacheIDx.getFileSize(-1767194421) < (long)(6 + 6 * var1)) {
               var10000 = null;
               return (byte[])var10000;
            } else {
               this.cacheIDx.seek((long)(var1 * 6));
               this.cacheIDx.loadData(data, 0, 6);
               int var4 = (data[2] & 255) + ((data[0] & 255) << 16) + ((data[1] & 255) << 8);
               int var5 = ((data[3] & 255) << 16) + ((data[4] & 255) << 8) + (data[5] & 255);
               if(var4 < 0 || var4 > this.anInt_4073 * 821768389) {
                  var10000 = null;
                  return (byte[])var10000;
               } else if(var5 <= 0 || (long)var5 > this.mainFileCache.getFileSize(30998163) / 520L) {
                  var10000 = null;
                  return (byte[])var10000;
               } else {
                  byte[] var6 = new byte[var4];
                  int var7 = 0;

                  for(int var8 = 0; var7 < var4; ++var8) {
                     if(0 == var5) {
                        var10000 = null;
                        return (byte[])var10000;
                     }

                     this.mainFileCache.seek((long)var5 * 520L);
                     int var9 = var4 - var7;
                     byte var10;
                     int var11;
                     int var12;
                     int var13;
                     int var14;
                     if(var1 > '\uffff') {
                        if(var9 > 510) {
                           var9 = 510;
                        }

                        var10 = 10;
                        this.mainFileCache.loadData(data, 0, var10 + var9);
                        var11 = (data[3] & 255) + ((data[2] & 255) << 8) + ((data[0] & 255) << 24) + ((data[1] & 255) << 16);
                        var12 = (data[5] & 255) + ((data[4] & 255) << 8);
                        var13 = ((data[7] & 255) << 8) + ((data[6] & 255) << 16) + (data[8] & 255);
                        var14 = data[9] & 255;
                     } else {
                        if(var9 > 512) {
                           var9 = 512;
                        }

                        var10 = 8;
                        this.mainFileCache.loadData(data, 0, var10 + var9);
                        var11 = ((data[0] & 255) << 8) + (data[1] & 255);
                        var12 = (data[3] & 255) + ((data[2] & 255) << 8);
                        var13 = ((data[5] & 255) << 8) + ((data[4] & 255) << 16) + (data[6] & 255);
                        var14 = data[7] & 255;
                     }

                     if(var1 != var11 || var8 != var12 || var14 != 1309187867 * this.id) {
                        var10000 = null;
                        return (byte[])var10000;
                     }

                     if(var13 < 0 || (long)var13 > this.mainFileCache.getFileSize(1428686613) / 520L) {
                        var10000 = null;
                        return (byte[])var10000;
                     }

                     int var15 = var10 + var9;

                     for(int var16 = var10; var16 < var15; ++var16) {
                        var6[var7++] = data[var16];
                     }

                     var5 = var13;
                  }

                  byte[] var20 = var6;
                  return var20;
               }
            }
         } catch (IOException var18) {
            return null;
         }
      }
   }

   boolean method3117(int var1, byte[] var2, int var3, boolean var4, int var5) {
      CacheFile var6 = this.mainFileCache;
      synchronized(this.mainFileCache) {
         try {
            int var7;
            boolean var10000;
            if(var4) {
               if(this.cacheIDx.getFileSize(-258535699) < (long)(6 + var1 * 6)) {
                  var10000 = false;
                  return var10000;
               }

               this.cacheIDx.seek((long)(var1 * 6));
               this.cacheIDx.loadData(data, 0, 6);
               var7 = ((data[3] & 255) << 16) + ((data[4] & 255) << 8) + (data[5] & 255);
               if(var7 <= 0 || (long)var7 > this.mainFileCache.getFileSize(1275082041) / 520L) {
                  var10000 = false;
                  return var10000;
               }
            } else {
               var7 = (int)((this.mainFileCache.getFileSize(-2101830495) + 519L) / 520L);
               if(var7 == 0) {
                  var7 = 1;
               }
            }

            data[0] = (byte)(var3 >> 16);
            data[1] = (byte)(var3 >> 8);
            data[2] = (byte)var3;
            data[3] = (byte)(var7 >> 16);
            data[4] = (byte)(var7 >> 8);
            data[5] = (byte)var7;
            this.cacheIDx.seek((long)(6 * var1));
            this.cacheIDx.storeData(data, 0, 6, 1201149514);
            int var8 = 0;
            int var9 = 0;

            while(true) {
               if(var8 < var3) {
                  label143: {
                     int var10 = 0;
                     int var12;
                     if(var4) {
                        this.mainFileCache.seek((long)var7 * 520L);
                        int var13;
                        int var14;
                        if(var1 > '\uffff') {
                           try {
                              this.mainFileCache.loadData(data, 0, 10);
                           } catch (EOFException var17) {
                              break label143;
                           }

                           var12 = ((data[2] & 255) << 8) + ((data[0] & 255) << 24) + ((data[1] & 255) << 16) + (data[3] & 255);
                           var13 = (data[5] & 255) + ((data[4] & 255) << 8);
                           var10 = (data[8] & 255) + ((data[6] & 255) << 16) + ((data[7] & 255) << 8);
                           var14 = data[9] & 255;
                        } else {
                           try {
                              this.mainFileCache.loadData(data, 0, 8);
                           } catch (EOFException var16) {
                              break label143;
                           }

                           var12 = (data[1] & 255) + ((data[0] & 255) << 8);
                           var13 = ((data[2] & 255) << 8) + (data[3] & 255);
                           var10 = ((data[5] & 255) << 8) + ((data[4] & 255) << 16) + (data[6] & 255);
                           var14 = data[7] & 255;
                        }

                        if(var12 != var1 || var13 != var9 || var14 != 1309187867 * this.id) {
                           var10000 = false;
                           return var10000;
                        }

                        if(var10 < 0 || (long)var10 > this.mainFileCache.getFileSize(-781711478) / 520L) {
                           var10000 = false;
                           return var10000;
                        }
                     }

                     if(var10 == 0) {
                        var4 = false;
                        var10 = (int)((this.mainFileCache.getFileSize(1585377547) + 519L) / 520L);
                        if(var10 == 0) {
                           ++var10;
                        }

                        if(var7 == var10) {
                           ++var10;
                        }
                     }

                     if(var1 > '\uffff') {
                        if(var3 - var8 <= 510) {
                           var10 = 0;
                        }

                        data[0] = (byte)(var1 >> 24);
                        data[1] = (byte)(var1 >> 16);
                        data[2] = (byte)(var1 >> 8);
                        data[3] = (byte)var1;
                        data[4] = (byte)(var9 >> 8);
                        data[5] = (byte)var9;
                        data[6] = (byte)(var10 >> 16);
                        data[7] = (byte)(var10 >> 8);
                        data[8] = (byte)var10;
                        data[9] = (byte)(1309187867 * this.id);
                        this.mainFileCache.seek((long)var7 * 520L);
                        this.mainFileCache.storeData(data, 0, 10, 233548621);
                        var12 = var3 - var8;
                        if(var12 > 510) {
                           var12 = 510;
                        }

                        this.mainFileCache.storeData(var2, var8, var12, 1647116696);
                        var8 += var12;
                     } else {
                        if(var3 - var8 <= 512) {
                           var10 = 0;
                        }

                        data[0] = (byte)(var1 >> 8);
                        data[1] = (byte)var1;
                        data[2] = (byte)(var9 >> 8);
                        data[3] = (byte)var9;
                        data[4] = (byte)(var10 >> 16);
                        data[5] = (byte)(var10 >> 8);
                        data[6] = (byte)var10;
                        data[7] = (byte)(1309187867 * this.id);
                        this.mainFileCache.seek(520L * (long)var7);
                        this.mainFileCache.storeData(data, 0, 8, 398919185);
                        var12 = var3 - var8;
                        if(var12 > 512) {
                           var12 = 512;
                        }

                        this.mainFileCache.storeData(var2, var8, var12, 1451187234);
                        var8 += var12;
                     }

                     var7 = var10;
                     ++var9;
                     continue;
                  }
               }

               var10000 = true;
               return var10000;
            }
         } catch (IOException var18) {
            return false;
         }
      }
   }

   public String toString() {
      return "" + this.id * 1309187867;
   }

   public Class243(int var1, CacheFile var2, CacheFile var3, int var4) {
      this.id = -1828019437 * var1;
      this.mainFileCache = var2;
      this.cacheIDx = var3;
      this.anInt_4073 = var4 * -100610547;
   }

   static final void method3119(RSInterfaceData var0, byte var1) throws Exception_Sub1 {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      GameCoord var3 = GameCoord.createCoord((float)var2, (float)var2, (float)var2);
      Class542.aClass43_Sub1_9475.method358(var3, -2103666395);
      var3.store();
   }

   static void method3120(int var0) {
      int var1 = 0;
      if(null != Class104_Sub21.renderSettings) {
         var1 = Class104_Sub21.renderSettings.aClass540_Sub3_7307.method1431((byte)0);
      }

      int var2;
      int var3;
      if(var1 == 2) {
         var2 = Class221.clientWidth * -1364963335 > 800?800:-1364963335 * Class221.clientWidth;
         var3 = client.clientHeight * 772194201 > 600?600:772194201 * client.clientHeight;
         Class29.canvasWidth = var2 * -1100942773;
         client.canvasX = (Class221.clientWidth * -1364963335 - var2) / 2 * -428522091;
         Class597.canvasHeight = var3 * -2053228525;
         client.canvasY = 0;
      } else if(var1 == 1) {
         var2 = -1364963335 * Class221.clientWidth > 1024?1024:-1364963335 * Class221.clientWidth;
         var3 = client.clientHeight * 772194201 > 768?768:client.clientHeight * 772194201;
         Class29.canvasWidth = -1100942773 * var2;
         client.canvasX = (Class221.clientWidth * -1364963335 - var2) / 2 * -428522091;
         Class597.canvasHeight = -2053228525 * var3;
         client.canvasY = 0;
      } else {
         Class29.canvasWidth = Class221.clientWidth * 1226625011;
         client.canvasX = 0;
         Class597.canvasHeight = client.clientHeight * -1579700133;
         client.canvasY = 0;
      }

   }

   static final void method3121(RSInterfaceData var0, int var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      Class240_Sub27 var3 = Class47_Sub1.method3496(Class326.aClass326_6233, client.gameConnectionHandler.aClass528_3433, 1917447504);
      var3.aClass240_Sub8_Sub1_7370.putByte(var2.length() + 1, -1809456126);
      var3.aClass240_Sub8_Sub1_7370.putString(var2, (byte)-11);
      client.gameConnectionHandler.addPacket(var3, 2146427392);
   }

   public static void method3122(CacheDataUnpacker var0, int var1, int var2, int var3, boolean var4, byte var5) {
      Class409.method5048(var0, var1, var2, var3, var4, 0L);
   }
}
