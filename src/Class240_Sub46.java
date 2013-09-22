
public class Class240_Sub46 extends NodeListNode {

   int[] anIntArray_7647 = new int[]{0};
   static final CacheNodeArrayList aClass627_7648 = new CacheNodeArrayList(11);
   static int anInt_7649;
   int[] anIntArray_7650 = new int[]{-1};
   static final NodeArrayList aNodeArrayList_7651 = new NodeArrayList(32);


   long method4979(int[] var1, int var2, int[] var3, boolean var4, byte var5) {
      long[] var6 = ByteArrayDataNode.aLongArray_6770;
      long var7 = -1L;
      var7 = var7 >>> 8 ^ var6[(int)((var7 ^ (long)(var2 >> 8)) & 255L)];
      var7 = var7 >>> 8 ^ var6[(int)((var7 ^ (long)var2) & 255L)];

      int var9;
      for(var9 = 0; var9 < var1.length; ++var9) {
         var7 = var7 >>> 8 ^ var6[(int)((var7 ^ (long)(var1[var9] >> 24)) & 255L)];
         var7 = var7 >>> 8 ^ var6[(int)((var7 ^ (long)(var1[var9] >> 16)) & 255L)];
         var7 = var7 >>> 8 ^ var6[(int)((var7 ^ (long)(var1[var9] >> 8)) & 255L)];
         var7 = var7 >>> 8 ^ var6[(int)((var7 ^ (long)var1[var9]) & 255L)];
      }

      if(var3 != null) {
         for(var9 = 0; var9 < 5; ++var9) {
            var7 = var7 >>> 8 ^ var6[(int)((var7 ^ (long)var3[var9]) & 255L)];
         }
      }

      var7 = var7 >>> 8 ^ var6[(int)((var7 ^ (long)(var4?1:0)) & 255L)];
      return var7;
   }

   final Model method4980(Renderer var1, int var2, Animator var3, int var4, boolean var5, PlayerComposite var6, int var7) {
      Model var8 = null;
      int var9 = var2;
      Class263 var10 = null;
      if(-1 != var4) {
         var10 = RandomAccessFileNode.aClass255_9018.method3343(var4, 1516291115);
      }

      int[] var11 = this.anIntArray_7650;
      if(null != var10 && null != var10.anIntArray_4586) {
         var11 = new int[var10.anIntArray_4586.length];

         for(int var12 = 0; var12 < var10.anIntArray_4586.length; ++var12) {
            int var13 = var10.anIntArray_4586[var12];
            if(var13 >= 0 && var13 < this.anIntArray_7650.length) {
               var11[var12] = this.anIntArray_7650[var13];
            } else {
               var11[var12] = -1;
            }
         }
      }

      if(var3 != null) {
         var9 = var2 | var3.getFlags((short)-13476);
      }

      long var14 = this.method4979(var11, var4, var6 != null?var6.anIntArray_9848:null, var5, (byte)-43);
      if(null != aClass627_7648) {
         var8 = (Model)aClass627_7648.getObject(var14);
      }

      if(var8 == null || var1.method1940(var8.method2015(), var9) != 0) {
         if(var8 != null) {
            var9 = var1.method1941(var9, var8.method2015());
         }

         int var16 = var9;
         boolean var17 = false;

         for(int var18 = 0; var18 < var11.length; ++var18) {
            if(var11[var18] != -1 && !Class592.cacheObjectLoader.getObjectDescriptor(var11[var18]).method5480(var5, (Class459)null, -1607232264)) {
               var17 = true;
            }
         }

         if(var17) {
            return null;
         }

         ModelData[] var27 = new ModelData[var11.length];

         int var19;
         for(var19 = 0; var19 < var11.length; ++var19) {
            if(var11[var19] != -1) {
               var27[var19] = Class592.cacheObjectLoader.getObjectDescriptor(var11[var19]).method5473(var5, (Class459)null, -1781526250);
            }
         }

         int var21;
         int var20;
         if(null != var10 && null != var10.viewportData) {
            for(var19 = 0; var19 < var10.viewportData.length; ++var19) {
               if(var10.viewportData[var19] != null && null != var27[var19]) {
                  var20 = var10.viewportData[var19][0];
                  var21 = var10.viewportData[var19][1];
                  int var22 = var10.viewportData[var19][2];
                  int var23 = var10.viewportData[var19][3];
                  int var24 = var10.viewportData[var19][4];
                  int var25 = var10.viewportData[var19][5];
                  if(var23 != 0 || 0 != var24 || var25 != 0) {
                     var27[var19].method1228(var23, var24, var25);
                  }

                  if(0 != var20 || var21 != 0 || 0 != var22) {
                     var27[var19].offset(var20, var21, var22);
                  }
               }
            }
         }

         ModelData var28 = new ModelData(var27, var27.length);
         if(null != var6) {
            var16 = var9 | 16384;
         }

         var8 = var1.createModel(var28, var16, anInt_7649 * 736218847, 64, 855);
         if(null != var6) {
            for(var20 = 0; var20 < 10; ++var20) {
               for(var21 = 0; var21 < PlayerComposite.aShortArrayArray_9853[var20].length; ++var21) {
                  if(var6.anIntArray_9848[var20] < PlayerComposite.aShortArrayArrayArray_9854[var20][var21].length) {
                     var8.method2030(PlayerComposite.aShortArrayArray_9853[var20][var21], PlayerComposite.aShortArrayArrayArray_9854[var20][var21][var6.anIntArray_9848[var20]]);
                  }
               }
            }
         }

         if(aClass627_7648 != null) {
            var8.method2042(var9);
            aClass627_7648.insert(var8, var14);
         }
      }

      if(var3 == null) {
         return var8;
      } else {
         Model var26 = var8.copy((byte)1, var9, true);
         var3.applyToModel(var26, 0, 29272131);
         return var26;
      }
   }

   public static void method4981(int var0, int var1) {
      if(Class620.method6632(631970412)) {
         if(Class11.anInt_105 * 1674910981 != var0) {
            Class11.aLong_99 = 3016473431628976607L;
         }

         Class11.anInt_105 = -822335539 * var0;
         Class418.method5190(9, (byte)-66);
      }
   }
}
