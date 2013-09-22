import java.util.HashMap;
import java.util.Map;

public class Class587 {

   public int anInt_9744 = 436498222;
   public int[] damageY = null;
   public int anInt_9746 = 1604131711;
   static final int anInt_9747 = 4;
   static final int anInt_9748 = 4;
   public int anInt_9749 = -449935611;
   static final int anInt_9750 = 4;
   public int anInt_9751 = 1534306804;
   static final int anInt_9752 = 7;
   public int[] damageX = null;
   public boolean aBoolean_9754 = true;
   public int anInt_9755;
   public int anInt_9756;
   public boolean aBoolean_9757 = true;
   public short[][] aShortArrayArray_9758;
   public short[][][] aShortArrayArrayArray_9759;
   public boolean aBoolean_9760 = true;
   public int anInt_9761 = 466095220;
   public int anInt_9762 = -1548771956;
   public int anInt_9763 = -459326483;
   public int anInt_9764 = 457412517;
   public int anInt_9765 = 208398447;
   public boolean aBoolean_9766;


   public Class587(CacheDataUnpacker var1) {
      byte[] var2 = var1.method3566(631638583 * Class590.aClass590_9785.anInt_9792, 662049188);
      this.method6367(new ByteArrayDataNode(var2), (byte)9);
   }

   void method6367(ByteArrayDataNode var1, byte var2) {
      boolean var3 = false;

      while(true) {
         int var4 = var1.readByte(210930403);
         if(var4 == 0) {
            if(!var3) {
               if(this.damageX == null) {
                  this.anInt_9762 = -1548771956;
                  this.damageX = new int[4];
                  this.damageY = new int[4];
               }

               for(var4 = 0; var4 < this.damageX.length; ++var4) {
                  this.damageX[var4] = 0;
                  this.damageY[var4] = var4 * 20;
               }
            }

            return;
         }

         int var5;
         if(var4 == 1) {
            if(this.damageX == null) {
               this.anInt_9762 = -1548771956;
               this.damageX = new int[4];
               this.damageY = new int[4];
            }

            for(var5 = 0; var5 < this.damageX.length; ++var5) {
               this.damageX[var5] = var1.method4478((byte)1);
               this.damageY[var5] = var1.method4478((byte)1);
            }

            var3 = true;
         } else if(2 == var4) {
            this.anInt_9746 = var1.method4493(-157074556) * -1604131711;
         } else if(var4 == 3) {
            this.anInt_9762 = var1.readByte(1973044082) * 1760290659;
            this.damageX = new int[this.anInt_9762 * 1658638923];
            this.damageY = new int[this.anInt_9762 * 1658638923];
         } else if(var4 == 4) {
            this.aBoolean_9757 = false;
         } else if(5 == var4) {
            this.anInt_9755 = var1.method4479(738776218) * -1429879181;
         } else if(6 == var4) {
            this.anInt_9756 = var1.method4479(738776218) * -963861383;
         } else if(var4 != 7) {
            if(var4 == 8) {
               this.aBoolean_9760 = false;
            } else if(var4 == 9) {
               this.anInt_9744 = var1.readByte(1129467176) * 218249111;
            } else if(10 == var4) {
               this.aBoolean_9754 = false;
            } else if(11 == var4) {
               this.anInt_9763 = var1.readByte(834454103) * -1584764593;
            } else if(var4 == 12) {
               this.anInt_9764 = var1.readShort(-244169386) * -457412517;
               this.anInt_9765 = var1.readShort(520315615) * -208398447;
            } else if(13 == var4) {
               this.anInt_9751 = var1.readByte(709790968) * -690165123;
            } else if(14 == var4) {
               this.anInt_9761 = var1.readByte(-459419412) * -957218019;
            } else if(15 == var4) {
               this.anInt_9749 = var1.readByte(882085375) * -1291410029;
            } else if(16 == var4) {
               this.aBoolean_9766 = true;
            }
         } else {
            this.aShortArrayArray_9758 = new short[10][4];
            this.aShortArrayArrayArray_9759 = new short[10][4][];

            for(var5 = 0; var5 < 10; ++var5) {
               for(int var6 = 0; var6 < 4; ++var6) {
                  int var7 = var1.readShort(405630820);
                  if(var7 == '\uffff') {
                     var7 = -1;
                  }

                  this.aShortArrayArray_9758[var5][var6] = (short)var7;
                  int var8 = var1.readShort(-1264454924);
                  this.aShortArrayArrayArray_9759[var5][var6] = new short[var8];

                  for(int var9 = 0; var9 < var8; ++var9) {
                     int var10 = var1.readShort(-291482717);
                     if(var10 == '\uffff') {
                        var10 = -1;
                     }

                     this.aShortArrayArrayArray_9759[var5][var6][var9] = (short)var10;
                  }
               }
            }
         }
      }
   }

   static final void method6368(RSInterfaceData var0, byte var1) {
      var0.longTypeIndex -= -1088659337;
   }

   static final void method6369(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1497821577 * client.aClass301Array_286[var2].anInt_6003;
   }

   static final void method6370(RSInterfaceData var0, int var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      StringBuilder var3 = new StringBuilder(var2.length());
      boolean var4 = false;

      for(int var5 = 0; var5 < var2.length(); ++var5) {
         char var6 = var2.charAt(var5);
         if(var6 == 60) {
            var4 = true;
         } else if(var6 == 62) {
            var4 = false;
         } else if(!var4) {
            var3.append(var6);
         }
      }

      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var3.toString();
   }

   public static Class551 method6371(Class var0, int var1, int var2) {
      Map var3 = Class576.aMap_9663;
      synchronized(Class576.aMap_9663) {
         Object var4 = (Map)Class576.aMap_9663.get(var0);
         if(var4 == null) {
            var4 = new HashMap();
            Class551[] var5 = (Class551[])((Class551[])var0.getEnumConstants());

            for(int var6 = 0; var6 < var5.length; ++var6) {
               Class551 var7 = var5[var6];
               ((Map)var4).put(Integer.valueOf(var7.getLanguageID(-1854566763)), var7);
            }

            Class576.aMap_9663.put(var0, var4);
         }

         return (Class551)((Map)var4).get(Integer.valueOf(var1));
      }
   }

   public static CacheDataUnpacker getCacheDataUnpacker(CacheFileID var0, boolean var1, int var2, boolean var3, boolean var4, byte var5) {
      if(null == Class300.cacheDataArray) {
         Class300.cacheDataArray = new CacheData[Class416.getCacheFileCount(1482141202)];
      }

      Class243 var6 = null;
      int id = var0.getID();
      if(null != client.cacheDat2 && !MapIcon.aBoolean_10006) {
         var6 = new Class243(id, client.cacheDat2, RendererInfo.cacheFileArray[id], 1500000);
      }

      Class300.cacheDataArray[id] = FontUnpacker.cacheDownload.getCacheData(id, var6, LoadProgress.mainCacheLoader);
      if(var4) {
         Class300.cacheDataArray[id].init();
      }

      return new CacheDataUnpacker(Class300.cacheDataArray[id], var1, var2);
   }
}
