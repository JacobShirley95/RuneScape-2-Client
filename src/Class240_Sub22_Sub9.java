
public class Class240_Sub22_Sub9 extends Class240_Sub22 {

   byte[][] aByteArrayArray_3524;
   int anInt_3525;
   Class98[] aClass98Array_3526;


   public boolean method2577(int var1, int var2) {
      return this.aClass98Array_3526[var1].aBoolean_1941;
   }

   public boolean method2578(int var1, int var2) {
      return this.aClass98Array_3526[var1].aBoolean_1944;
   }

   public Class240_Sub22_Sub9(int var1) {
      this.anInt_3525 = var1 * 1714836855;
   }

   public boolean method2579(int var1, int var2) {
      return this.aClass98Array_3526[var1].aBoolean_1940;
   }

   public boolean method2580(byte var1) {
      if(null != this.aClass98Array_3526) {
         return true;
      } else {
         if(null == this.aByteArrayArray_3524) {
            CacheDataUnpacker var2 = Class430.aCacheUnpacker_8267;
            synchronized(Class430.aCacheUnpacker_8267) {
               if(!Class430.aCacheUnpacker_8267.method3571(-33090489 * this.anInt_3525, 161439653)) {
                  return false;
               }

               int[] var3 = Class430.aCacheUnpacker_8267.getSubOffsets(-33090489 * this.anInt_3525);
               this.aByteArrayArray_3524 = new byte[var3.length][];

               for(int var4 = 0; var4 < var3.length; ++var4) {
                  this.aByteArrayArray_3524[var4] = Class430.aCacheUnpacker_8267.getDataBytes(-33090489 * this.anInt_3525, var3[var4], 716064323);
               }
            }
         }

         boolean var16 = true;

         int var6;
         for(int var17 = 0; var17 < this.aByteArrayArray_3524.length; ++var17) {
            byte[] var19 = this.aByteArrayArray_3524[var17];
            ByteArrayDataNode var5 = new ByteArrayDataNode(var19);
            var5.index = -2043502829;
            var6 = var5.readShort(598258079);
            CacheDataUnpacker var7 = Class22.aCacheUnpacker_201;
            synchronized(Class22.aCacheUnpacker_201) {
               var16 &= Class22.aCacheUnpacker_201.hasData(var6, -1779315270);
            }
         }

         if(!var16) {
            return false;
         } else {
            NodeList var18 = new NodeList();
            CacheDataUnpacker var20 = Class430.aCacheUnpacker_8267;
            int[] var21;
            synchronized(Class430.aCacheUnpacker_8267) {
               var6 = Class430.aCacheUnpacker_8267.method3575(-33090489 * this.anInt_3525, -1077318104);
               this.aClass98Array_3526 = new Class98[var6];
               var21 = Class430.aCacheUnpacker_8267.getSubOffsets(-33090489 * this.anInt_3525);
            }

            int var22 = 0;

            while(var22 < var21.length) {
               byte[] var23 = this.aByteArrayArray_3524[var22];
               ByteArrayDataNode var24 = new ByteArrayDataNode(var23);
               var24.index = -2043502829;
               int var8 = var24.readShort(-816001221);
               Class240_Sub26 var9 = null;
               Class240_Sub26 var10 = (Class240_Sub26)var18.getBaseNode_2((byte)98);

               while(true) {
                  if(null != var10) {
                     if(1061221629 * var10.anInt_7345 != var8) {
                        var10 = (Class240_Sub26)var18.getNext(102206585);
                        continue;
                     }

                     var9 = var10;
                  }

                  if(null == var9) {
                     CacheDataUnpacker var25 = Class22.aCacheUnpacker_201;
                     synchronized(Class22.aCacheUnpacker_201) {
                        var9 = new Class240_Sub26(var8, Class22.aCacheUnpacker_201.method3566(var8, 1518954652));
                     }

                     var18.addNode(var9, (short)8817);
                  }

                  this.aClass98Array_3526[var21[var22]] = new Class98(var23, var9);
                  ++var22;
                  break;
               }
            }

            this.aByteArrayArray_3524 = (byte[][])null;
            return true;
         }
      }
   }

   static final void method2581(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      var2.intTypeIndex -= -1416056414;
      var0.anInt_2478 = var2.intTypes[-831324111 * var2.intTypeIndex] * -679849379;
      var0.anInt_2479 = -1312744193 * var2.intTypes[-831324111 * var2.intTypeIndex + 1];
      Class110_Sub1.method3149(var0, -1134404397);
   }
}
