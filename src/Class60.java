import java.nio.ByteBuffer;

public class Class60 {

   static float aFloat_1124;
   Class76 aClass76_1125;
   int[] anIntArray_1126 = new int[8191];
   Class414 aClass414_1127;
   final int anInt_1128 = 64;
   final int anInt_1129 = 768;
   Class379 aClass379_1130;
   final int anInt_1131 = Class125.method1607(1600, -1203321019);
   final int anInt_1132 = 64;
   int anInt_1133 = 0;
   int[] anIntArray_1134 = new int[1600];
   int[] anIntArray_1135 = new int[64];
   Class231_Sub2_Sub1[][] aClass231_Sub2_Sub1ArrayArray_1136 = new Class231_Sub2_Sub1[1600][64];
   Class231_Sub2_Sub1[][] aClass231_Sub2_Sub1ArrayArray_1137 = new Class231_Sub2_Sub1[64][768];
   Class76 aClass76_1138;
   final int anInt_1139 = 1600;


   void method586(Renderer_Sub3 var1) {
      this.aClass76_1125.method981(786336, 24);
   }

   void method587(Renderer_Sub3 var1, int var2) {
      int var3 = 0;
      ArrayViewport var4 = var1.anArrayViewport_10521;
      float var5 = var4.data[0];
      float var6 = var4.data[4];
      float var7 = var4.data[8];
      float var8 = var4.data[1];
      float var9 = var4.data[5];
      float var10 = var4.data[9];
      float var11 = var5 + var8;
      float var12 = var6 + var9;
      float var13 = var7 + var10;
      float var14 = var5 - var8;
      float var15 = var6 - var9;
      float var16 = var7 - var10;
      float var17 = var8 - var5;
      float var18 = var9 - var6;
      float var19 = var10 - var7;
      float[] var20 = new float[3];
      float[] var21 = new float[3];
      var1.anArrayViewport_10527.method4552(var1.anArrayViewport_10522);
      ByteBuffer var22 = var1.aByteBuffer_10646;
      var22.clear();

      for(int var23 = var2 - 1; var23 >= 0; --var23) {
         int var24 = this.anIntArray_1134[var23] > 64?64:this.anIntArray_1134[var23];
         if(var24 > 0) {
            int var25;
            byte var29;
            byte var31;
            byte var30;
            float var34;
            byte var32;
            float var33;
            for(var25 = var24 - 1; var25 >= 0; --var25) {
               Class231_Sub2_Sub1 var26 = this.aClass231_Sub2_Sub1ArrayArray_1136[var23][var25];
               int var27 = var26.anInt_1808;
               byte var28 = (byte)(var27 >> 16);
               var29 = (byte)(var27 >> 8);
               var30 = (byte)var27;
               var31 = (byte)(var27 >>> 24);
               if(var1.anInt_10640 == 0) {
                  var32 = var28;
                  var28 = var30;
                  var30 = var32;
               }

               float var42 = (float)(var26.anInt_1809 >> 12);
               var33 = (float)(var26.anInt_1807 >> 12);
               var34 = (float)(var26.anInt_1811 >> 12);
               int var35 = var26.anInt_1810 >> 12;
               if(var26.aShort_1814 != 0) {
                  var1.anArrayViewport_10578.method4581(var26.aShort_1814, var35, var35, 0.0F, 0.0F, 0.0F);
                  var1.anArrayViewport_10578.method4580(var1.anArrayViewport_10527);
                  var1.anArrayViewport_10578.method4558(1.0F, 0.0F, 0.0F, var20);
                  var1.anArrayViewport_10578.method4558(0.0F, 1.0F, 0.0F, var21);
                  var22.putFloat(var42 - var20[0] - var21[0]);
                  var22.putFloat(var33 - var20[1] - var21[1]);
                  var22.putFloat(var34 - var20[2] - var21[2]);
                  var22.put(var28);
                  var22.put(var29);
                  var22.put(var30);
                  var22.put(var31);
                  var22.putFloat(0.0F);
                  var22.putFloat(0.0F);
                  var22.putFloat(var42 - var20[0] + var21[0]);
                  var22.putFloat(var33 - var20[1] + var21[1]);
                  var22.putFloat(var34 - var20[2] + var21[2]);
                  var22.put(var28);
                  var22.put(var29);
                  var22.put(var30);
                  var22.put(var31);
                  var22.putFloat(0.0F);
                  var22.putFloat(1.0F);
                  var22.putFloat(var42 + var20[0] + var21[0]);
                  var22.putFloat(var33 + var20[1] + var21[1]);
                  var22.putFloat(var34 + var20[2] + var21[2]);
                  var22.put(var28);
                  var22.put(var29);
                  var22.put(var30);
                  var22.put(var31);
                  var22.putFloat(1.0F);
                  var22.putFloat(1.0F);
                  var22.putFloat(var42 + var20[0] - var21[0]);
                  var22.putFloat(var33 + var20[1] - var21[1]);
                  var22.putFloat(var34 + var20[2] - var21[2]);
                  var22.put(var28);
                  var22.put(var29);
                  var22.put(var30);
                  var22.put(var31);
                  var22.putFloat(1.0F);
                  var22.putFloat(0.0F);
               } else {
                  var22.putFloat(var42 + var11 * (float)(-var35));
                  var22.putFloat(var33 + var12 * (float)(-var35));
                  var22.putFloat(var34 + var13 * (float)(-var35));
                  var22.put(var28);
                  var22.put(var29);
                  var22.put(var30);
                  var22.put(var31);
                  var22.putFloat(0.0F);
                  var22.putFloat(0.0F);
                  var22.putFloat(var42 + var17 * (float)var35);
                  var22.putFloat(var33 + var18 * (float)var35);
                  var22.putFloat(var34 + var19 * (float)var35);
                  var22.put(var28);
                  var22.put(var29);
                  var22.put(var30);
                  var22.put(var31);
                  var22.putFloat(0.0F);
                  var22.putFloat(1.0F);
                  var22.putFloat(var42 + var11 * (float)var35);
                  var22.putFloat(var33 + var12 * (float)var35);
                  var22.putFloat(var34 + var13 * (float)var35);
                  var22.put(var28);
                  var22.put(var29);
                  var22.put(var30);
                  var22.put(var31);
                  var22.putFloat(1.0F);
                  var22.putFloat(1.0F);
                  var22.putFloat(var42 + var14 * (float)var35);
                  var22.putFloat(var33 + var15 * (float)var35);
                  var22.putFloat(var34 + var16 * (float)var35);
                  var22.put(var28);
                  var22.put(var29);
                  var22.put(var30);
                  var22.put(var31);
                  var22.putFloat(1.0F);
                  var22.putFloat(0.0F);
               }

               ++var3;
            }

            if(this.anIntArray_1134[var23] > 64) {
               var25 = this.anIntArray_1134[var23] - 64 - 1;

               for(int var39 = this.anIntArray_1135[var25] - 1; var39 >= 0; --var39) {
                  Class231_Sub2_Sub1 var40 = this.aClass231_Sub2_Sub1ArrayArray_1137[var25][var39];
                  int var41 = var40.anInt_1808;
                  var29 = (byte)(var41 >> 16);
                  var30 = (byte)(var41 >> 8);
                  var31 = (byte)var41;
                  var32 = (byte)(var41 >>> 24);
                  var33 = (float)(var40.anInt_1809 >> 12);
                  var34 = (float)(var40.anInt_1807 >> 12);
                  float var43 = (float)(var40.anInt_1811 >> 12);
                  int var36 = var40.anInt_1810 >> 12;
                  if(var1.anInt_10640 == 0) {
                     byte var37 = var29;
                     var29 = var31;
                     var31 = var37;
                  }

                  if(var40.aShort_1814 != 0) {
                     var1.anArrayViewport_10578.method4581(var40.aShort_1814, var36, var36, 0.0F, 0.0F, 0.0F);
                     var1.anArrayViewport_10578.method4580(var1.anArrayViewport_10527);
                     var1.anArrayViewport_10578.method4558(1.0F, 0.0F, 0.0F, var20);
                     var1.anArrayViewport_10578.method4558(0.0F, 1.0F, 0.0F, var21);
                     var22.putFloat(var33 - var20[0] - var21[0]);
                     var22.putFloat(var34 - var20[1] - var21[1]);
                     var22.putFloat(var43 - var20[2] - var21[2]);
                     var22.put(var29);
                     var22.put(var30);
                     var22.put(var31);
                     var22.put(var32);
                     var22.putFloat(0.0F);
                     var22.putFloat(0.0F);
                     var22.putFloat(var33 - var20[0] + var21[0]);
                     var22.putFloat(var34 - var20[1] + var21[1]);
                     var22.putFloat(var43 - var20[2] + var21[2]);
                     var22.put(var29);
                     var22.put(var30);
                     var22.put(var31);
                     var22.put(var32);
                     var22.putFloat(0.0F);
                     var22.putFloat(1.0F);
                     var22.putFloat(var33 + var20[0] + var21[0]);
                     var22.putFloat(var34 + var20[1] + var21[1]);
                     var22.putFloat(var43 + var20[2] + var21[2]);
                     var22.put(var29);
                     var22.put(var30);
                     var22.put(var31);
                     var22.put(var32);
                     var22.putFloat(1.0F);
                     var22.putFloat(1.0F);
                     var22.putFloat(var33 + var20[0] - var21[0]);
                     var22.putFloat(var34 + var20[1] - var21[1]);
                     var22.putFloat(var43 + var20[2] - var21[2]);
                     var22.put(var29);
                     var22.put(var30);
                     var22.put(var31);
                     var22.put(var32);
                     var22.putFloat(1.0F);
                     var22.putFloat(0.0F);
                  } else {
                     var22.putFloat(var33 + var11 * (float)(-var36));
                     var22.putFloat(var34 + var12 * (float)(-var36));
                     var22.putFloat(var43 + var13 * (float)(-var36));
                     var22.put(var29);
                     var22.put(var30);
                     var22.put(var31);
                     var22.put(var32);
                     var22.putFloat(0.0F);
                     var22.putFloat(0.0F);
                     var22.putFloat(var33 + var17 * (float)var36);
                     var22.putFloat(var34 + var18 * (float)var36);
                     var22.putFloat(var43 + var19 * (float)var36);
                     var22.put(var29);
                     var22.put(var30);
                     var22.put(var31);
                     var22.put(var32);
                     var22.putFloat(0.0F);
                     var22.putFloat(1.0F);
                     var22.putFloat(var33 + var11 * (float)var36);
                     var22.putFloat(var34 + var12 * (float)var36);
                     var22.putFloat(var43 + var13 * (float)var36);
                     var22.put(var29);
                     var22.put(var30);
                     var22.put(var31);
                     var22.put(var32);
                     var22.putFloat(1.0F);
                     var22.putFloat(1.0F);
                     var22.putFloat(var33 + var14 * (float)var36);
                     var22.putFloat(var34 + var15 * (float)var36);
                     var22.putFloat(var43 + var16 * (float)var36);
                     var22.put(var29);
                     var22.put(var30);
                     var22.put(var31);
                     var22.put(var32);
                     var22.putFloat(1.0F);
                     var22.putFloat(0.0F);
                  }

                  ++var3;
               }
            }
         }
      }

      this.aClass76_1125.method4853(0, var22.position(), var1.aLong_10629);
      var1.method7251(0, this.aClass76_1125);
      var1.method7251(1, this.aClass76_1138);
      var1.method7190(this.aClass379_1130);
      Class28 var38 = var1.aClass28_10611;
      var38.method207(var3);
   }

   void method588() {
      this.aClass76_1125.method824();
   }

   void method589(Renderer_Sub3 var1, Class231_Sub2 var2, int var3, int var4, int var5, Class28 var6) {
      Class231_Sub2 var7 = var2.aClass231_Sub2_7769;
      int var8 = 0;
      int var9 = -2;
      boolean var10 = true;

      for(boolean var11 = true; var7 != var2; this.method587(var1, var3)) {
         this.anInt_1133 = 0;

         int var12;
         for(var12 = 0; var12 < var3; ++var12) {
            this.anIntArray_1134[var12] = 0;
         }

         for(var12 = 0; var12 < 64; ++var12) {
            this.anIntArray_1135[var12] = 0;
         }

         while(var7 != var2) {
            Class231_Sub2_Sub1 var14 = (Class231_Sub2_Sub1)var7;
            if(var11) {
               var9 = var14.anInt_1806;
               var10 = var14.aBoolean_1815;
               var11 = false;
            }

            if(var8 > 0 && (var9 != var14.anInt_1806 || var10 != var14.aBoolean_1815)) {
               var11 = true;
               break;
            }

            this.method590(this.anIntArray_1126[var8++] - var4 >> var5, var14);
            var7 = var7.aClass231_Sub2_7769;
         }

         var6.aClass384_793 = null;
         if(var9 >= 0) {
            Class183 var13 = var1.aClass163_2802.method1996(var9, (byte)2);
            if(var13.anInt_3146 * -534969509 != -1) {
               var6.aClass384_793 = var1.aClass58_10599.method565(var13);
            }
         }

         if(var10 && var1.aFloat_10582 != aFloat_1124) {
            var1.method1947(aFloat_1124);
         } else if(var1.aFloat_10582 != 1.0F) {
            var1.method1947(1.0F);
         }
      }

   }

   void method590(int var1, Class231_Sub2_Sub1 var2) {
      if(var1 < 1600) {
         if(this.anIntArray_1134[var1] < 64) {
            this.aClass231_Sub2_Sub1ArrayArray_1136[var1][this.anIntArray_1134[var1]++] = var2;
         } else {
            if(this.anIntArray_1134[var1] == 64) {
               if(this.anInt_1133 == 64) {
                  return;
               }

               this.anIntArray_1134[var1] += 1 + this.anInt_1133++;
            }

            Class231_Sub2_Sub1[] var10000 = this.aClass231_Sub2_Sub1ArrayArray_1137[this.anIntArray_1134[var1] - 64 - 1];
            int var10002 = this.anIntArray_1134[var1] - 64 - 1;
            int var10004 = this.anIntArray_1135[this.anIntArray_1134[var1] - 64 - 1];
            this.anIntArray_1135[var10002] = this.anIntArray_1135[this.anIntArray_1134[var1] - 64 - 1] + 1;
            var10000[var10004] = var2;
         }
      }

   }

   void method591(Renderer_Sub3 var1, Class167 var2) {
      var1.enableZBuffering(false);
      aFloat_1124 = var1.aFloat_10582;
      float var3 = var1.anArrayViewport_10521.data[2];
      float var4 = var1.anArrayViewport_10521.data[6];
      float var5 = var1.anArrayViewport_10521.data[10];
      float var6 = var1.anArrayViewport_10521.data[14];
      int var7 = 0;
      int var8 = Integer.MAX_VALUE;
      int var9 = 0;
      Class231_Sub2 var10 = var2.aClass505_3024.aClass231_Sub2_9121;

      int var13;
      for(Class231_Sub2 var11 = var10.aClass231_Sub2_7769; var11 != var10; var11 = var11.aClass231_Sub2_7769) {
         Class231_Sub2_Sub1 var12 = (Class231_Sub2_Sub1)var11;
         var13 = (int)(var3 * (float)(var12.anInt_1809 >> 12) + var4 * (float)(var12.anInt_1807 >> 12) + var5 * (float)(var12.anInt_1811 >> 12) + var6);
         if(var13 > var9) {
            var9 = var13;
         }

         if(var13 < var8) {
            var8 = var13;
         }

         this.anIntArray_1126[var7++] = var13;
      }

      int var15 = var9 - var8;
      if(var15 + 2 > 1600) {
         var13 = 1 + Class125.method1607(var15, -1377166138) - this.anInt_1131;
         var15 = (var15 >> var13) + 2;
      } else {
         var13 = 0;
         var15 += 2;
      }

      var1.method7307(this.aClass414_1127);
      Class28 var14 = var1.aClass28_10611;
      var14.method206(ArrayViewport.anArrayViewport_6782);
      var14.anArrayViewport_795.reset();
      var14.anInt_796 = -1;
      this.method589(var1, var10, var15, var8, var13, var14);
      if(var1.aFloat_10582 != aFloat_1124) {
         var1.method1947(aFloat_1124);
      }

      var1.enableZBuffering(true);
   }

   Class60(Renderer_Sub3 var1) {
      this.aClass379_1130 = var1.method7250(new Class402[]{new Class402(new Class380[]{Class380.aClass380_7356, Class380.aClass380_7353, Class380.aClass380_7355}), new Class402(Class380.aClass380_7352)});
      this.aClass76_1125 = var1.method7320(true);
      this.aClass76_1138 = var1.method7320(false);
      this.aClass76_1138.method981(393168, 12);
      this.aClass414_1127 = var1.method7249(false);
      this.aClass414_1127.method5136('\ubffa');
      ByteBuffer var2 = var1.aByteBuffer_10646;
      var2.clear();

      int var3;
      for(var3 = 0; var3 < 8191; ++var3) {
         int var4 = var3 * 4;
         var2.putShort((short)var4);
         var2.putShort((short)(var4 + 1));
         var2.putShort((short)(var4 + 2));
         var2.putShort((short)(var4 + 2));
         var2.putShort((short)(var4 + 3));
         var2.putShort((short)var4);
      }

      this.aClass414_1127.method4853(0, var2.position(), var1.aLong_10629);
      var2.clear();

      for(var3 = 0; var3 < 8191; ++var3) {
         var2.putFloat(0.0F);
         var2.putFloat(-1.0F);
         var2.putFloat(0.0F);
         var2.putFloat(0.0F);
         var2.putFloat(-1.0F);
         var2.putFloat(0.0F);
         var2.putFloat(0.0F);
         var2.putFloat(-1.0F);
         var2.putFloat(0.0F);
         var2.putFloat(0.0F);
         var2.putFloat(-1.0F);
         var2.putFloat(0.0F);
      }

      this.aClass76_1138.method4853(0, var2.position(), var1.aLong_10629);
   }
}
