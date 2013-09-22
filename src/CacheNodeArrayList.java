
public final class CacheNodeArrayList {

   NodeArrayList aNodeArrayList_10052;
   int anInt_10053;
   int anInt_10054;
   Class494 aClass494_10055;


   public void method6665(byte var1) {
      for(Class240_Sub22_Sub14 var2 = (Class240_Sub22_Sub14)this.aClass494_10055.method5772(-543070531); null != var2; var2 = (Class240_Sub22_Sub14)this.aClass494_10055.method5771(-1898007931)) {
         if(var2.method2649((byte)19)) {
            var2.shiftNext();
            var2.shiftNext();
            this.anInt_10054 += 833042283 * var2.anInt_3609;
         }
      }

   }

   public CacheNodeArrayList(int var1, int var2) {
      this.aClass494_10055 = new Class494();
      this.anInt_10053 = -376777545 * var1;
      this.anInt_10054 = -124325805 * var1;

      int var3;
      for(var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
         ;
      }

      this.aNodeArrayList_10052 = new NodeArrayList(var3);
   }

   public Object getObject(long var1) {
      Class240_Sub22_Sub14 var3 = (Class240_Sub22_Sub14)this.aNodeArrayList_10052.getNode(var1);
      if(var3 == null) {
         return null;
      } else {
         Object var4 = var3.method2648(-831324111);
         if(var4 == null) {
            var3.shiftNext();
            var3.shiftNext();
            this.anInt_10054 += var3.anInt_3609 * 833042283;
            return null;
         } else {
            if(var3.method2649((byte)53)) {
               Class240_Sub22_Sub14_Sub1 var5 = new Class240_Sub22_Sub14_Sub1(var4, var3.anInt_3609 * 65378697);
               this.aNodeArrayList_10052.insert(var5, 4058728944299054175L * var3.id);
               this.aClass494_10055.insert(var5, 110273631);
               var5.aLong_7278 = 0L;
               var3.shiftNext();
               var3.shiftNext();
            } else {
               this.aClass494_10055.insert(var3, 426441112);
               var3.aLong_7278 = 0L;
            }

            return var4;
         }
      }
   }

   void method6667(Class240_Sub22_Sub14 var1, byte var2) {
      if(var1 != null) {
         var1.shiftNext();
         var1.shiftNext();
         this.anInt_10054 += var1.anInt_3609 * 833042283;
      }

   }

   public void insert(Object var1, long var2, int var4, int var5) {
      if(var4 > 433342727 * this.anInt_10053) {
         throw new IllegalStateException();
      } else {
         this.method6675(var2);

         Class240_Sub22_Sub14 var6;
         for(this.anInt_10054 -= var4 * -124325805; this.anInt_10054 * 1820644315 < 0; this.method6667(var6, (byte)67)) {
            var6 = (Class240_Sub22_Sub14)this.aClass494_10055.method5776(-853945191);
            if(!var6.method2649((byte)-83)) {
               ;
            }
         }

         Class240_Sub22_Sub14_Sub1 var7 = new Class240_Sub22_Sub14_Sub1(var1, var4);
         this.aNodeArrayList_10052.insert(var7, var2);
         this.aClass494_10055.insert(var7, 1366258856);
         var7.aLong_7278 = 0L;
      }
   }

   public void method6669(int var1) {
      this.aClass494_10055.method5770(-2034740284);
      this.aNodeArrayList_10052.method5938(1804998605);
      this.anInt_10054 = this.anInt_10053 * -161202875;
   }

   public int method6670(int var1) {
      return 433342727 * this.anInt_10053;
   }

   public int method6671(int var1) {
      return this.anInt_10054 * 1820644315;
   }

   public Object method6672(byte var1) {
      Class240_Sub22_Sub14 var4;
      for(Class240_Sub22_Sub14 var2 = (Class240_Sub22_Sub14)this.aNodeArrayList_10052.start(); null != var2; this.anInt_10054 += var4.anInt_3609 * 833042283) {
         Object var3 = var2.method2648(-831324111);
         if(null != var3) {
            return var3;
         }

         var4 = var2;
         var2 = (Class240_Sub22_Sub14)this.aNodeArrayList_10052.next();
         var4.shiftNext();
         var4.shiftNext();
      }

      return null;
   }

   public void insert(Object var1, long var2) {
      this.insert(var1, var2, 1, -761861266);
   }

   public Object method6674(byte var1) {
      Class240_Sub22_Sub14 var4;
      for(Class240_Sub22_Sub14 var2 = (Class240_Sub22_Sub14)this.aNodeArrayList_10052.next(); null != var2; this.anInt_10054 += 833042283 * var4.anInt_3609) {
         Object var3 = var2.method2648(-831324111);
         if(var3 != null) {
            return var3;
         }

         var4 = var2;
         var2 = (Class240_Sub22_Sub14)this.aNodeArrayList_10052.next();
         var4.shiftNext();
         var4.shiftNext();
      }

      return null;
   }

   public CacheNodeArrayList(int var1) {
      this(var1, var1);
   }

   public void method6675(long var1) {
      Class240_Sub22_Sub14 var3 = (Class240_Sub22_Sub14)this.aNodeArrayList_10052.getNode(var1);
      this.method6667(var3, (byte)22);
   }

   public int method6676(int var1) {
      int var2 = 0;

      for(Class240_Sub22_Sub14 var3 = (Class240_Sub22_Sub14)this.aClass494_10055.method5772(-1134657277); var3 != null; var3 = (Class240_Sub22_Sub14)this.aClass494_10055.method5771(-1908585242)) {
         if(!var3.method2649((byte)-105)) {
            ++var2;
         }
      }

      return var2;
   }

   public void method6677(int var1, int var2) {
      for(Class240_Sub22_Sub14 var3 = (Class240_Sub22_Sub14)this.aClass494_10055.method5772(-920890260); null != var3; var3 = (Class240_Sub22_Sub14)this.aClass494_10055.method5771(-569917191)) {
         if(var3.method2649((byte)-3)) {
            if(var3.method2648(-831324111) == null) {
               var3.shiftNext();
               var3.shiftNext();
               this.anInt_10054 += var3.anInt_3609 * 833042283;
            }
         } else if((var3.aLong_7278 += -390861045572062217L) * 2950103203925786055L > (long)var1) {
            Class240_Sub22_Sub14_Sub2 var4 = new Class240_Sub22_Sub14_Sub2(var3.method2648(-831324111), var3.anInt_3609 * 65378697);
            this.aNodeArrayList_10052.insert(var4, 4058728944299054175L * var3.id);
            Class32.method228(var4, var3, -660995694);
            var3.shiftNext();
            var3.shiftNext();
         }
      }

   }

   static final void method6678(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      var0.anInt_2458 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111] * 1702051789;
      Class110_Sub1.method3149(var0, -696372974);
   }

   static final void method6679(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      if(Class557.extractInterfaceIntData(var4, var2, 1826025510) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2561 = Class133.extractInterfaceData(var4, var2, (byte)73);
      var0.aBoolean_2524 = true;
   }

   static final void method6680(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      Class418.method5191(var2 >> 14 & 16383, var2 & 16383, 555965946);
   }

   public static void method6681(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, short var8) {
      if(var1 >= 0 && var2 >= 0 && var1 < client.aClass296_348.getMaxX((byte)-105) - 1 && var2 < client.aClass296_348.getMaxY(-1624063367) - 1) {
         if(client.aClass296_348.getWorldObjects() == null) {
            return;
         }

         Class218 var9;
         if(var3 == 0) {
            var9 = (Class218)client.aClass296_348.getWorldObjects().method3423(var0, var1, var2, (byte)-48);
            Class218 var10 = (Class218)client.aClass296_348.getWorldObjects().method3424(var0, var1, var2, 965027076);
            if(null != var9 && var4 != 2) {
               if(var9 instanceof Class563_Sub1_Sub5_Sub2) {
                  ((Class563_Sub1_Sub5_Sub2)var9).aClass319_7972.method3937(var6, var7, (byte)58);
               } else {
                  Class483.method5723(var0, var3, var1, var2, var9.method2723((byte)-85), var5, var4, var6, var7, -81082712);
               }
            }

            if(null != var10) {
               if(var10 instanceof Class563_Sub1_Sub5_Sub2) {
                  ((Class563_Sub1_Sub5_Sub2)var10).aClass319_7972.method3937(var6, var7, (byte)5);
               } else {
                  Class483.method5723(var0, var3, var1, var2, var10.method2723((byte)-2), var5, var4, var6, var7, 942770305);
               }
            }
         } else if(var3 == 1) {
            var9 = (Class218)client.aClass296_348.getWorldObjects().method3425(var0, var1, var2, -1063905272);
            if(var9 != null) {
               if(var9 instanceof Class563_Sub1_Sub3_Sub2) {
                  ((Class563_Sub1_Sub3_Sub2)var9).aClass319_8277.method3937(var6, var7, (byte)-67);
               } else {
                  int var11 = var9.method2723((byte)-68);
                  if(var4 != 4 && var4 != 5) {
                     if(var4 == 6) {
                        Class483.method5723(var0, var3, var1, var2, var11, 4 + var5, 4, var6, var7, 583082692);
                     } else if(var4 == 7) {
                        Class483.method5723(var0, var3, var1, var2, var11, 4 + (2 + var5 & 3), 4, var6, var7, -1894353863);
                     } else if(8 == var4) {
                        Class483.method5723(var0, var3, var1, var2, var11, var5 + 4, 4, var6, var7, 1549518427);
                        Class483.method5723(var0, var3, var1, var2, var11, (2 + var5 & 3) + 4, 4, var6, var7, 612640690);
                     }
                  } else {
                     Class483.method5723(var0, var3, var1, var2, var11, var5, 4, var6, var7, -76880430);
                  }
               }
            }
         } else if(var3 == 2) {
            var9 = (Class218)client.aClass296_348.getWorldObjects().method3416(var0, var1, var2, client.aClass264_482, 1283934045);
            if(var9 != null) {
               if(var4 == 11) {
                  var4 = 10;
               }

               if(var9 instanceof Class563_Sub1_Sub4_Sub6) {
                  ((Class563_Sub1_Sub4_Sub6)var9).aClass319_8275.method3937(var6, var7, (byte)-37);
               } else {
                  Class483.method5723(var0, var3, var1, var2, var9.method2723((byte)-121), var5, var4, var6, var7, 1367846967);
               }
            }
         } else if(3 == var3) {
            var9 = (Class218)client.aClass296_348.getWorldObjects().method3428(var0, var1, var2, 1064745344);
            if(null != var9) {
               if(var9 instanceof Class563_Sub1_Sub1_Sub2) {
                  ((Class563_Sub1_Sub1_Sub2)var9).aClass319_7951.method3937(var6, var7, (byte)-19);
               } else {
                  Class483.method5723(var0, var3, var1, var2, var9.method2723((byte)-119), var5, var4, var6, var7, -1816685326);
               }
            }
         }
      }

   }

   static final void method6682(RSInterface[] var0, int var1, byte var2) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         RSInterface var4 = var0[var3];
         if(var4 != null) {
            if(var4.index * 1916189739 == 0) {
               if(var4.children != null) {
                  method6682(var4.children, var1, (byte)29);
               }

               Class240_Sub16 var5 = (Class240_Sub16)client.widgets.getNode((long)(var4.cacheID * 1278853609));
               if(null != var5) {
                  Class462.method5591(1320796941 * var5.widgetID, var1, 1685123114);
               }
            }

            Class240_Sub17 var6;
            if(0 == var1 && null != var4.anObjectArray_2561) {
               var6 = new Class240_Sub17();
               var6.aClass132_6903 = var4;
               var6.anObjectArray_6907 = var4.anObjectArray_2561;
               Class411.method5074(var6, (byte)1);
            }

            if(var1 == 1 && null != var4.anObjectArray_2562) {
               if(var4.anInt_2428 * -1001687885 >= 0) {
                  RSInterface var7 = RSServerQueue.getInterface(1278853609 * var4.cacheID, (byte)105);
                  if(var7 == null || null == var7.aClass132Array_2579 || -1001687885 * var4.anInt_2428 >= var7.aClass132Array_2579.length || var7.aClass132Array_2579[var4.anInt_2428 * -1001687885] != var4) {
                     continue;
                  }
               }

               var6 = new Class240_Sub17();
               var6.aClass132_6903 = var4;
               var6.anObjectArray_6907 = var4.anObjectArray_2562;
               Class411.method5074(var6, (byte)1);
            }
         }
      }

   }

   public static void getSpriteOffsets(CacheDataUnpacker var0, int var1) {
      Class1.headIconsPK = var0.getCacheOffset("headicons_pk") * 857806033;
      Class1.headIconsPrayer = var0.getCacheOffset("headicons_prayer") * 164738411;
      Class212_Sub1_Sub1.hintHeadicons = var0.getCacheOffset("hint_headicons") * 276149385;
      Class1.hintMarkersOffset = var0.getCacheOffset("hint_mapmarkers") * 753971273;
      Class1.flagCacheOffset = var0.getCacheOffset("mapflag") * -534111901;
      ChatMessageCache.crossOffset = var0.getCacheOffset("cross") * -1936573243;
      Class1.mapDotsOffset = var0.getCacheOffset("mapdots") * -1190172701;
      Class1.nameIconsOffset = var0.getCacheOffset("name_icons") * 1644751269;
      IndexNode.floorShadowsOffset = var0.getCacheOffset("floorshadows") * -1934653431;
      Class278.compassCacheOffset = var0.getCacheOffset("compass") * 1826109175;
      Class602.otherLevelOffset = var0.getCacheOffset("otherlevel") * -395681029;
      AbstractServerConnection.mapEdgeHintOffset = var0.getCacheOffset("hint_mapedge") * 1053431395;
   }

   static void method6684(int var0, int var1, int var2) {
      Class240_Sub22_Sub5 var3 = Class65_Sub1_Sub2.method866(6, (long)var0);
      var3.method596((byte)74);
      var3.anInt_1175 = var1 * 134353971;
   }
}
