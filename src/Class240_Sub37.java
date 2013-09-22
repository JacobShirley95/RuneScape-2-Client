import java.nio.ByteBuffer;

public class Class240_Sub37 extends NodeListNode {

   int anInt_7498 = 0;
   final Class171_Sub3 aClass171_Sub3_7499;
   final int anInt_7500;
   final float aFloat_7501;
   Class105 aClass105_7502;
   Class76 aClass76_7503;
   int[] anIntArray_7504;
   int anInt_7505 = 0;
   int anInt_7506 = 0;
   int anInt_7507 = 0;
   final Renderer_Sub3 aRenderer_Sub3_7508;
   long aLong_7509;


   void method4896(int[] var1, int var2) {
      this.anInt_7507 = 0;
      this.anInt_7498 = 32767;
      this.anInt_7506 = -32768;
      ByteBuffer var3 = this.aRenderer_Sub3_7508.aByteBuffer_10646;

      for(int var4 = 0; var4 < var2; ++var4) {
         int var5 = var1[var4];
         short[] var6 = this.aClass171_Sub3_7499.aShortArrayArray_11086[var5];
         int var7 = this.anIntArray_7504[var5];
         if(var7 != 0 && var6 != null) {
            int var8 = 0;
            int var9 = 0;

            while(var9 < var6.length) {
               if((var7 & 1 << var8++) != 0) {
                  for(int var10 = 0; var10 < 3; ++var10) {
                     int var11 = var6[var9++] & '\uffff';
                     if(var11 > this.anInt_7506) {
                        this.anInt_7506 = var11;
                     }

                     if(var11 < this.anInt_7498) {
                        this.anInt_7498 = var11;
                     }

                     var3.putShort((short)var11);
                  }

                  this.anInt_7507 += 3;
               } else {
                  var9 += 3;
               }
            }
         }
      }

   }

   void method4897(int var1) {
      this.aLong_7509 = this.aRenderer_Sub3_7508.anUnsafe_10510.allocateMemory((long)(var1 * 4));

      for(int var2 = 3; var2 < var1 * 4; var2 += 4) {
         this.aRenderer_Sub3_7508.anUnsafe_10510.putByte(this.aLong_7509 + (long)var2, (byte)0);
      }

   }

   void method4898(int var1, int var2, int var3, float var4) {
      int var6;
      int var7;
      if(this.anInt_7500 != -1) {
         Class183 var5 = this.aRenderer_Sub3_7508.aClass163_2802.method1996(this.anInt_7500, (byte)2);
         var6 = var5.aByte_3165 & 255;
         int var9;
         if(var6 != 0 && var5.aByte_3169 != 4) {
            if(var3 < 0) {
               var7 = 0;
            } else if(var3 > 127) {
               var7 = 16777215;
            } else {
               var7 = 131586 * var3;
            }

            if(var6 == 256) {
               var2 = var7;
            } else {
               var9 = 256 - var6;
               var2 = ((var7 & 16711935) * var6 + (var2 & 16711935) * var9 & -16711936) + ((var7 & '\uff00') * var6 + (var2 & '\uff00') * var9 & 16711680) >> 8;
            }
         }

         var7 = var5.aByte_3176 & 255;
         if(var7 != 0) {
            var7 += 256;
            int var8 = ((var2 & 16711680) >> 16) * var7;
            if(var8 > '\uffff') {
               var8 = '\uffff';
            }

            var9 = ((var2 & '\uff00') >> 8) * var7;
            if(var9 > '\uffff') {
               var9 = '\uffff';
            }

            int var10 = (var2 & 255) * var7;
            if(var10 > '\uffff') {
               var10 = '\uffff';
            }

            var2 = (var8 << 8 & 16711680) + (var9 & '\uff00') + (var10 >> 8);
         }
      }

      if(var4 != 1.0F) {
         int var11 = var2 >> 16 & 255;
         var6 = var2 >> 8 & 255;
         var7 = var2 & 255;
         var11 = (int)((float)var11 * var4);
         if(var11 < 0) {
            var11 = 0;
         } else if(var11 > 255) {
            var11 = 255;
         }

         var6 = (int)((float)var6 * var4);
         if(var6 < 0) {
            var6 = 0;
         } else if(var6 > 255) {
            var6 = 255;
         }

         var7 = (int)((float)var7 * var4);
         if(var7 < 0) {
            var7 = 0;
         } else if(var7 > 255) {
            var7 = 255;
         }

         var2 = var11 << 16 | var6 << 8 | var7;
      }

      if(this.aRenderer_Sub3_7508.anInt_10640 == 0) {
         this.aRenderer_Sub3_7508.anUnsafe_10510.putByte(this.aLong_7509 + (long)(var1 * 4) + 0L, (byte)(var2 >> 16));
         this.aRenderer_Sub3_7508.anUnsafe_10510.putByte(this.aLong_7509 + (long)(var1 * 4) + 1L, (byte)(var2 >> 8));
         this.aRenderer_Sub3_7508.anUnsafe_10510.putByte(this.aLong_7509 + (long)(var1 * 4) + 2L, (byte)var2);
      } else {
         this.aRenderer_Sub3_7508.anUnsafe_10510.putByte(this.aLong_7509 + (long)(var1 * 4) + 0L, (byte)var2);
         this.aRenderer_Sub3_7508.anUnsafe_10510.putByte(this.aLong_7509 + (long)(var1 * 4) + 1L, (byte)(var2 >> 8));
         this.aRenderer_Sub3_7508.anUnsafe_10510.putByte(this.aLong_7509 + (long)(var1 * 4) + 2L, (byte)(var2 >> 16));
      }

   }

   void method4899(int var1) {
      this.aClass76_7503 = this.aRenderer_Sub3_7508.method7320(false);
      this.aClass76_7503.method981(var1 * 4, 4);
      this.aClass76_7503.method4853(0, var1 * 4, this.aLong_7509);
      this.aRenderer_Sub3_7508.anUnsafe_10510.freeMemory(this.aLong_7509);
   }

   void method4900(int var1) {
      this.aRenderer_Sub3_7508.anUnsafe_10510.putByte(this.aLong_7509 + (long)(var1 * 4) + 3L, (byte)-1);
   }

   void method4901(int var1, int var2, int var3) {
      this.anIntArray_7504[var2 * this.aClass171_Sub3_7499.maxWidth * 1658489349 + var1] |= 1 << var3;
      ++this.anInt_7505;
   }

   Class240_Sub37(Class171_Sub3 var1, int var2, int var3, Class105 var4) {
      this.aClass171_Sub3_7499 = var1;
      this.aRenderer_Sub3_7508 = this.aClass171_Sub3_7499.aRenderer_Sub3_11082;
      this.anInt_7500 = var2;
      this.aFloat_7501 = (float)var3;
      this.aClass105_7502 = var4;
      this.anIntArray_7504 = new int[this.aClass171_Sub3_7499.maxWidth * 1658489349 * this.aClass171_Sub3_7499.maxHeight * 445373459];
   }
}
