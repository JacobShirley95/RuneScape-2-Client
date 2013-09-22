import jaggl.OpenGL;

public class Class158 {

   float[] aFloatArray_2771 = new float[16];
   BufferDataNode aClass240_Sub8_Sub2_2772 = new BufferDataNode(786336);
   OGLBuffer anOGLBuffer_2773;
   final int anInt_2774 = 768;
   OGLBufferPointer anOGLBufferPointer_2775;
   final int anInt_2776 = Class125.method1607(1600, -1032821488);
   final int anInt_2777 = 64;
   final int anInt_2778 = 64;
   final int anInt_2779 = 1600;
   Class231_Sub2_Sub1[][] aClass231_Sub2_Sub1ArrayArray_2780 = new Class231_Sub2_Sub1[1600][64];
   OGLBufferPointer anOGLBufferPointer_2781;
   int[] anIntArray_2782 = new int[8191];
   int[] anIntArray_2783 = new int[1600];
   int[] anIntArray_2784 = new int[64];
   OGLBufferPointer anOGLBufferPointer_2785;
   Class231_Sub2_Sub1[][] aClass231_Sub2_Sub1ArrayArray_2786 = new Class231_Sub2_Sub1[64][768];
   int anInt_2787 = 0;
   static float aFloat_2788;


   void method1858(OpenGLRenderer var1) {
      this.anOGLBuffer_2773 = var1.createOGLBuffer(24, (byte[])null, 196584, true);
      this.anOGLBufferPointer_2785 = new OGLBufferPointer(this.anOGLBuffer_2773, 5126, 2, 0);
      this.anOGLBufferPointer_2781 = new OGLBufferPointer(this.anOGLBuffer_2773, 5126, 3, 8);
      this.anOGLBufferPointer_2775 = new OGLBufferPointer(this.anOGLBuffer_2773, 5121, 4, 20);
   }

   void method1859(OpenGLRenderer var1, Class167 var2) {
      if(var1.anArrayViewport_10355 != null) {
         this.method1860(var1);
         float var3 = var1.anArrayViewport_10355.data[2];
         float var4 = var1.anArrayViewport_10355.data[6];
         float var5 = var1.anArrayViewport_10355.data[10];
         float var6 = var1.anArrayViewport_10355.data[14];

         try {
            int var7 = 0;
            int var8 = Integer.MAX_VALUE;
            int var9 = 0;
            Class231_Sub2 var10 = var2.aClass505_3024.aClass231_Sub2_9121;

            Class231_Sub2 var11;
            int var13;
            for(var11 = var10.aClass231_Sub2_7769; var11 != var10; var11 = var11.aClass231_Sub2_7769) {
               Class231_Sub2_Sub1 var12 = (Class231_Sub2_Sub1)var11;
               var13 = (int)(var3 * (float)(var12.anInt_1809 >> 12) + var4 * (float)(var12.anInt_1807 >> 12) + var5 * (float)(var12.anInt_1811 >> 12) + var6);
               if(var13 > var9) {
                  var9 = var13;
               }

               if(var13 < var8) {
                  var8 = var13;
               }

               this.anIntArray_2782[var7++] = var13;
            }

            int var20 = var9 - var8;
            if(var20 + 2 > 1600) {
               var13 = 1 + Class125.method1607(var20, 1654996195) - this.anInt_2776;
               var20 = (var20 >> var13) + 2;
            } else {
               var13 = 0;
               var20 += 2;
            }

            var11 = var10.aClass231_Sub2_7769;
            var7 = 0;
            int var14 = -2;
            boolean var15 = true;

            for(boolean var16 = true; var11 != var10; this.method1862(var1, var20)) {
               this.anInt_2787 = 0;

               int var17;
               for(var17 = 0; var17 < var20; ++var17) {
                  this.anIntArray_2783[var17] = 0;
               }

               for(var17 = 0; var17 < 64; ++var17) {
                  this.anIntArray_2784[var17] = 0;
               }

               for(; var11 != var10; var11 = var11.aClass231_Sub2_7769) {
                  Class231_Sub2_Sub1 var21 = (Class231_Sub2_Sub1)var11;
                  if(var16) {
                     var14 = var21.anInt_1806;
                     var15 = var21.aBoolean_1815;
                     var16 = false;
                  }

                  if(var7 > 0 && (var14 != var21.anInt_1806 || var15 != var21.aBoolean_1815)) {
                     var16 = true;
                     break;
                  }

                  int var18 = this.anIntArray_2782[var7++] - var8 >> var13;
                  if(var18 < 1600) {
                     if(this.anIntArray_2783[var18] < 64) {
                        this.aClass231_Sub2_Sub1ArrayArray_2780[var18][this.anIntArray_2783[var18]++] = var21;
                     } else {
                        if(this.anIntArray_2783[var18] == 64) {
                           if(this.anInt_2787 == 64) {
                              continue;
                           }

                           this.anIntArray_2783[var18] += 1 + this.anInt_2787++;
                        }

                        Class231_Sub2_Sub1[] var10000 = this.aClass231_Sub2_Sub1ArrayArray_2786[this.anIntArray_2783[var18] - 64 - 1];
                        int var10002 = this.anIntArray_2783[var18] - 64 - 1;
                        int var10004 = this.anIntArray_2784[this.anIntArray_2783[var18] - 64 - 1];
                        this.anIntArray_2784[var10002] = this.anIntArray_2784[this.anIntArray_2783[var18] - 64 - 1] + 1;
                        var10000[var10004] = var21;
                     }
                  }
               }

               if(var14 >= 0) {
                  var1.method6957(var14);
               } else {
                  var1.method6957(-1);
               }

               if(var15 && var1.aFloat_10421 != aFloat_2788) {
                  var1.method1947(aFloat_2788);
               } else if(var1.aFloat_10421 != 1.0F) {
                  var1.method1947(1.0F);
               }
            }
         } catch (Exception var19) {
            ;
         }

         this.method1861(var1);
      }
   }

   void method1860(OpenGLRenderer var1) {
      aFloat_2788 = var1.aFloat_10421;
      var1.method7013();
      OpenGL.glDisable(16384);
      OpenGL.glDisable(16385);
      var1.method7029(false);
      OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
   }

   void method1861(OpenGLRenderer var1) {
      var1.method7029(true);
      OpenGL.glEnable(16384);
      OpenGL.glEnable(16385);
      if(var1.aFloat_10421 != aFloat_2788) {
         var1.method1947(aFloat_2788);
      }

   }

   void method1862(OpenGLRenderer renderer, int var2) {
      OpenGL.glGetFloatv(2982, this.aFloatArray_2771, 0);
      float var3 = this.aFloatArray_2771[0];
      float var4 = this.aFloatArray_2771[4];
      float var5 = this.aFloatArray_2771[8];
      float var6 = this.aFloatArray_2771[1];
      float var7 = this.aFloatArray_2771[5];
      float var8 = this.aFloatArray_2771[9];
      float var9 = var3 + var6;
      float var10 = var4 + var7;
      float var11 = var5 + var8;
      float var12 = var3 - var6;
      float var13 = var4 - var7;
      float var14 = var5 - var8;
      float var15 = var6 - var3;
      float var16 = var7 - var4;
      float var17 = var8 - var5;
      float[] var18 = new float[3];
      float[] var19 = new float[3];
      renderer.anArrayViewport_10371.method4552(renderer.anArrayViewport_10356);
      this.aClass240_Sub8_Sub2_2772.index = 0;
      int var21;
      int var20;
      Class231_Sub2_Sub1 var23;
      int var22;
      byte var25;
      int var24;
      byte var27;
      byte var26;
      float var29;
      byte var28;
      float var31;
      float var30;
      int var34;
      int var35;
      int var32;
      int var33;
      float var38;
      Class231_Sub2_Sub1 var36;
      byte var37;
      if(renderer.isBigEndian) {
         for(var20 = var2 - 1; var20 >= 0; --var20) {
            var21 = this.anIntArray_2783[var20] > 64?64:this.anIntArray_2783[var20];
            if(var21 > 0) {
               for(var22 = var21 - 1; var22 >= 0; --var22) {
                  var23 = this.aClass231_Sub2_Sub1ArrayArray_2780[var20][var22];
                  var24 = var23.anInt_1808;
                  var25 = (byte)(var24 >> 16);
                  var26 = (byte)(var24 >> 8);
                  var27 = (byte)var24;
                  var28 = (byte)(var24 >>> 24);
                  var29 = (float)(var23.anInt_1809 >> 12);
                  var30 = (float)(var23.anInt_1807 >> 12);
                  var31 = (float)(var23.anInt_1811 >> 12);
                  var32 = var23.anInt_1810 >> 12;
                  if(var23.aShort_1814 != 0) {
                     renderer.anArrayViewport_10372.method4581(var23.aShort_1814, var32, var32, 0.0F, 0.0F, 0.0F);
                     renderer.anArrayViewport_10372.method4580(renderer.anArrayViewport_10371);
                     renderer.anArrayViewport_10372.method4558(1.0F, 0.0F, 0.0F, var18);
                     renderer.anArrayViewport_10372.method4558(0.0F, 1.0F, 0.0F, var19);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(0.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(0.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(var29 - var18[0] - var19[0]);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(var30 - var18[1] - var19[1]);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(var31 - var18[2] - var19[2]);
                     this.aClass240_Sub8_Sub2_2772.putByte(var25, 1598345902);
                     this.aClass240_Sub8_Sub2_2772.putByte(var26, 1867508029);
                     this.aClass240_Sub8_Sub2_2772.putByte(var27, -1395348819);
                     this.aClass240_Sub8_Sub2_2772.putByte(var28, -864226759);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(0.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(1.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(var29 - var18[0] + var19[0]);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(var30 - var18[1] + var19[1]);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(var31 - var18[2] + var19[2]);
                     this.aClass240_Sub8_Sub2_2772.putByte(var25, 1851004808);
                     this.aClass240_Sub8_Sub2_2772.putByte(var26, -406457193);
                     this.aClass240_Sub8_Sub2_2772.putByte(var27, 1711220695);
                     this.aClass240_Sub8_Sub2_2772.putByte(var28, 200802764);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(1.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(1.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(var29 + var18[0] + var19[0]);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(var30 + var18[1] + var19[1]);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(var31 + var18[2] + var19[2]);
                     this.aClass240_Sub8_Sub2_2772.putByte(var25, 1988292473);
                     this.aClass240_Sub8_Sub2_2772.putByte(var26, -223197037);
                     this.aClass240_Sub8_Sub2_2772.putByte(var27, -239279077);
                     this.aClass240_Sub8_Sub2_2772.putByte(var28, -382140562);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(1.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(0.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(var29 + var18[0] - var19[0]);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(var30 + var18[1] - var19[1]);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(var31 + var18[2] - var19[2]);
                     this.aClass240_Sub8_Sub2_2772.putByte(var25, 1883933705);
                     this.aClass240_Sub8_Sub2_2772.putByte(var26, -1039254567);
                     this.aClass240_Sub8_Sub2_2772.putByte(var27, 1440154033);
                     this.aClass240_Sub8_Sub2_2772.putByte(var28, 1469221214);
                  } else {
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(0.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(0.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(var29 + var9 * (float)(-var32));
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(var30 + var10 * (float)(-var32));
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(var31 + var11 * (float)(-var32));
                     this.aClass240_Sub8_Sub2_2772.putByte(var25, 1143142069);
                     this.aClass240_Sub8_Sub2_2772.putByte(var26, 345747480);
                     this.aClass240_Sub8_Sub2_2772.putByte(var27, 762858349);
                     this.aClass240_Sub8_Sub2_2772.putByte(var28, -1965337573);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(0.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(1.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(var29 + var15 * (float)var32);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(var30 + var16 * (float)var32);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(var31 + var17 * (float)var32);
                     this.aClass240_Sub8_Sub2_2772.putByte(var25, 152644982);
                     this.aClass240_Sub8_Sub2_2772.putByte(var26, 1416701283);
                     this.aClass240_Sub8_Sub2_2772.putByte(var27, -672987317);
                     this.aClass240_Sub8_Sub2_2772.putByte(var28, -1372900916);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(1.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(1.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(var29 + var9 * (float)var32);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(var30 + var10 * (float)var32);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(var31 + var11 * (float)var32);
                     this.aClass240_Sub8_Sub2_2772.putByte(var25, -1811743887);
                     this.aClass240_Sub8_Sub2_2772.putByte(var26, -187530515);
                     this.aClass240_Sub8_Sub2_2772.putByte(var27, -1769631256);
                     this.aClass240_Sub8_Sub2_2772.putByte(var28, 466626105);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(1.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(0.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(var29 + var12 * (float)var32);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(var30 + var13 * (float)var32);
                     this.aClass240_Sub8_Sub2_2772.putFloatBE(var31 + var14 * (float)var32);
                     this.aClass240_Sub8_Sub2_2772.putByte(var25, -124933440);
                     this.aClass240_Sub8_Sub2_2772.putByte(var26, -150662572);
                     this.aClass240_Sub8_Sub2_2772.putByte(var27, 1765003976);
                     this.aClass240_Sub8_Sub2_2772.putByte(var28, -1556445202);
                  }
               }

               if(this.anIntArray_2783[var20] > 64) {
                  var22 = this.anIntArray_2783[var20] - 64 - 1;

                  for(var34 = this.anIntArray_2784[var22] - 1; var34 >= 0; --var34) {
                     var36 = this.aClass231_Sub2_Sub1ArrayArray_2786[var22][var34];
                     var35 = var36.anInt_1808;
                     var26 = (byte)(var35 >> 16);
                     var27 = (byte)(var35 >> 8);
                     var28 = (byte)var35;
                     var37 = (byte)(var35 >>> 24);
                     var30 = (float)(var36.anInt_1809 >> 12);
                     var31 = (float)(var36.anInt_1807 >> 12);
                     var38 = (float)(var36.anInt_1811 >> 12);
                     var33 = var36.anInt_1810 >> 12;
                     if(var36.aShort_1814 != 0) {
                        renderer.anArrayViewport_10372.method4581(var36.aShort_1814, var33, var33, 0.0F, 0.0F, 0.0F);
                        renderer.anArrayViewport_10372.method4580(renderer.anArrayViewport_10371);
                        renderer.anArrayViewport_10372.method4558(1.0F, 0.0F, 0.0F, var18);
                        renderer.anArrayViewport_10372.method4558(0.0F, 1.0F, 0.0F, var19);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(0.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(0.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(var30 - var18[0] - var19[0]);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(var31 - var18[1] - var19[1]);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(var38 - var18[2] - var19[2]);
                        this.aClass240_Sub8_Sub2_2772.putByte(var26, 1007396277);
                        this.aClass240_Sub8_Sub2_2772.putByte(var27, -1902903026);
                        this.aClass240_Sub8_Sub2_2772.putByte(var28, -1447275022);
                        this.aClass240_Sub8_Sub2_2772.putByte(var37, 2077469074);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(0.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(1.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(var30 - var18[0] + var19[0]);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(var31 - var18[1] + var19[1]);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(var38 - var18[2] + var19[2]);
                        this.aClass240_Sub8_Sub2_2772.putByte(var26, -611606858);
                        this.aClass240_Sub8_Sub2_2772.putByte(var27, 298603656);
                        this.aClass240_Sub8_Sub2_2772.putByte(var28, -1670791347);
                        this.aClass240_Sub8_Sub2_2772.putByte(var37, 620561352);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(1.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(1.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(var30 + var18[0] + var19[0]);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(var31 + var18[1] + var19[1]);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(var38 + var18[2] + var19[2]);
                        this.aClass240_Sub8_Sub2_2772.putByte(var26, -709199610);
                        this.aClass240_Sub8_Sub2_2772.putByte(var27, -1395363937);
                        this.aClass240_Sub8_Sub2_2772.putByte(var28, 467445164);
                        this.aClass240_Sub8_Sub2_2772.putByte(var37, 1126352401);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(1.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(0.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(var30 + var18[0] - var19[0]);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(var31 + var18[1] - var19[1]);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(var38 + var18[2] - var19[2]);
                        this.aClass240_Sub8_Sub2_2772.putByte(var26, -907546563);
                        this.aClass240_Sub8_Sub2_2772.putByte(var27, 78418182);
                        this.aClass240_Sub8_Sub2_2772.putByte(var28, -1519485222);
                        this.aClass240_Sub8_Sub2_2772.putByte(var37, -871277977);
                     } else {
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(0.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(0.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(var30 + var9 * (float)(-var33));
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(var31 + var10 * (float)(-var33));
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(var38 + var11 * (float)(-var33));
                        this.aClass240_Sub8_Sub2_2772.putByte(var26, -1351148505);
                        this.aClass240_Sub8_Sub2_2772.putByte(var27, 1357885548);
                        this.aClass240_Sub8_Sub2_2772.putByte(var28, 135112915);
                        this.aClass240_Sub8_Sub2_2772.putByte(var37, 841638904);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(0.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(1.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(var30 + var15 * (float)var33);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(var31 + var16 * (float)var33);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(var38 + var17 * (float)var33);
                        this.aClass240_Sub8_Sub2_2772.putByte(var26, 588504408);
                        this.aClass240_Sub8_Sub2_2772.putByte(var27, -586752625);
                        this.aClass240_Sub8_Sub2_2772.putByte(var28, 1395027606);
                        this.aClass240_Sub8_Sub2_2772.putByte(var37, 611011892);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(1.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(1.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(var30 + var9 * (float)var33);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(var31 + var10 * (float)var33);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(var38 + var11 * (float)var33);
                        this.aClass240_Sub8_Sub2_2772.putByte(var26, -1579757025);
                        this.aClass240_Sub8_Sub2_2772.putByte(var27, -801397966);
                        this.aClass240_Sub8_Sub2_2772.putByte(var28, 12186583);
                        this.aClass240_Sub8_Sub2_2772.putByte(var37, -364284578);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(1.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(0.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(var30 + var12 * (float)var33);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(var31 + var13 * (float)var33);
                        this.aClass240_Sub8_Sub2_2772.putFloatBE(var38 + var14 * (float)var33);
                        this.aClass240_Sub8_Sub2_2772.putByte(var26, 1799617370);
                        this.aClass240_Sub8_Sub2_2772.putByte(var27, -283067084);
                        this.aClass240_Sub8_Sub2_2772.putByte(var28, 1376863794);
                        this.aClass240_Sub8_Sub2_2772.putByte(var37, -509211999);
                     }
                  }
               }
            }
         }
      } else {
         for(var20 = var2 - 1; var20 >= 0; --var20) {
            var21 = this.anIntArray_2783[var20] > 64?64:this.anIntArray_2783[var20];
            if(var21 > 0) {
               for(var22 = var21 - 1; var22 >= 0; --var22) {
                  var23 = this.aClass231_Sub2_Sub1ArrayArray_2780[var20][var22];
                  var24 = var23.anInt_1808;
                  var25 = (byte)(var24 >> 16);
                  var26 = (byte)(var24 >> 8);
                  var27 = (byte)var24;
                  var28 = (byte)(var24 >>> 24);
                  var29 = (float)(var23.anInt_1809 >> 12);
                  var30 = (float)(var23.anInt_1807 >> 12);
                  var31 = (float)(var23.anInt_1811 >> 12);
                  var32 = var23.anInt_1810 >> 12;
                  if(var23.aShort_1814 != 0) {
                     renderer.anArrayViewport_10372.method4581(var23.aShort_1814, var32, var32, 0.0F, 0.0F, 0.0F);
                     renderer.anArrayViewport_10372.method4580(renderer.anArrayViewport_10371);
                     renderer.anArrayViewport_10372.method4558(1.0F, 0.0F, 0.0F, var18);
                     renderer.anArrayViewport_10372.method4558(0.0F, 1.0F, 0.0F, var19);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(0.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(0.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(var29 - var18[0] - var19[0]);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(var30 - var18[1] - var19[1]);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(var31 - var18[2] - var19[2]);
                     this.aClass240_Sub8_Sub2_2772.putByte(var25, 24952408);
                     this.aClass240_Sub8_Sub2_2772.putByte(var26, 550975063);
                     this.aClass240_Sub8_Sub2_2772.putByte(var27, -352180652);
                     this.aClass240_Sub8_Sub2_2772.putByte(var28, 826466740);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(0.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(1.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(var29 - var18[0] + var19[0]);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(var30 - var18[1] + var19[1]);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(var31 - var18[2] + var19[2]);
                     this.aClass240_Sub8_Sub2_2772.putByte(var25, 1382099519);
                     this.aClass240_Sub8_Sub2_2772.putByte(var26, 1955479441);
                     this.aClass240_Sub8_Sub2_2772.putByte(var27, 1160767723);
                     this.aClass240_Sub8_Sub2_2772.putByte(var28, -1381600979);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(1.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(1.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(var29 + var18[0] + var19[0]);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(var30 + var18[1] + var19[1]);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(var31 + var18[2] + var19[2]);
                     this.aClass240_Sub8_Sub2_2772.putByte(var25, -1671698112);
                     this.aClass240_Sub8_Sub2_2772.putByte(var26, 1717978589);
                     this.aClass240_Sub8_Sub2_2772.putByte(var27, -1620132183);
                     this.aClass240_Sub8_Sub2_2772.putByte(var28, 2135475215);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(1.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(0.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(var29 + var18[0] - var19[0]);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(var30 + var18[1] - var19[1]);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(var31 + var18[2] - var19[2]);
                     this.aClass240_Sub8_Sub2_2772.putByte(var25, 1400124834);
                     this.aClass240_Sub8_Sub2_2772.putByte(var26, -1569187766);
                     this.aClass240_Sub8_Sub2_2772.putByte(var27, -1996002848);
                     this.aClass240_Sub8_Sub2_2772.putByte(var28, 278710038);
                  } else {
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(0.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(0.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(var29 + var9 * (float)(-var32));
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(var30 + var10 * (float)(-var32));
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(var31 + var11 * (float)(-var32));
                     this.aClass240_Sub8_Sub2_2772.putByte(var25, -1575549225);
                     this.aClass240_Sub8_Sub2_2772.putByte(var26, 2042033866);
                     this.aClass240_Sub8_Sub2_2772.putByte(var27, -1362268616);
                     this.aClass240_Sub8_Sub2_2772.putByte(var28, -1755180781);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(0.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(1.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(var29 + var15 * (float)var32);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(var30 + var16 * (float)var32);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(var31 + var17 * (float)var32);
                     this.aClass240_Sub8_Sub2_2772.putByte(var25, -1706104345);
                     this.aClass240_Sub8_Sub2_2772.putByte(var26, -1061091090);
                     this.aClass240_Sub8_Sub2_2772.putByte(var27, 1641561289);
                     this.aClass240_Sub8_Sub2_2772.putByte(var28, -745798549);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(1.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(1.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(var29 + var9 * (float)var32);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(var30 + var10 * (float)var32);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(var31 + var11 * (float)var32);
                     this.aClass240_Sub8_Sub2_2772.putByte(var25, -275820721);
                     this.aClass240_Sub8_Sub2_2772.putByte(var26, -285462293);
                     this.aClass240_Sub8_Sub2_2772.putByte(var27, -382196567);
                     this.aClass240_Sub8_Sub2_2772.putByte(var28, 1124509083);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(1.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(0.0F);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(var29 + var12 * (float)var32);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(var30 + var13 * (float)var32);
                     this.aClass240_Sub8_Sub2_2772.putFloatLE(var31 + var14 * (float)var32);
                     this.aClass240_Sub8_Sub2_2772.putByte(var25, -211959452);
                     this.aClass240_Sub8_Sub2_2772.putByte(var26, 2104239442);
                     this.aClass240_Sub8_Sub2_2772.putByte(var27, 329724955);
                     this.aClass240_Sub8_Sub2_2772.putByte(var28, -2001257196);
                  }
               }

               if(this.anIntArray_2783[var20] > 64) {
                  var22 = this.anIntArray_2783[var20] - 64 - 1;

                  for(var34 = this.anIntArray_2784[var22] - 1; var34 >= 0; --var34) {
                     var36 = this.aClass231_Sub2_Sub1ArrayArray_2786[var22][var34];
                     var35 = var36.anInt_1808;
                     var26 = (byte)(var35 >> 16);
                     var27 = (byte)(var35 >> 8);
                     var28 = (byte)var35;
                     var37 = (byte)(var35 >>> 24);
                     var30 = (float)(var36.anInt_1809 >> 12);
                     var31 = (float)(var36.anInt_1807 >> 12);
                     var38 = (float)(var36.anInt_1811 >> 12);
                     var33 = var36.anInt_1810 >> 12;
                     if(var36.aShort_1814 != 0) {
                        renderer.anArrayViewport_10372.method4581(var36.aShort_1814, var33, var33, 0.0F, 0.0F, 0.0F);
                        renderer.anArrayViewport_10372.method4580(renderer.anArrayViewport_10371);
                        renderer.anArrayViewport_10372.method4558(1.0F, 0.0F, 0.0F, var18);
                        renderer.anArrayViewport_10372.method4558(0.0F, 1.0F, 0.0F, var19);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(0.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(0.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(var30 - var18[0] - var19[0]);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(var31 - var18[1] - var19[1]);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(var38 - var18[2] - var19[2]);
                        this.aClass240_Sub8_Sub2_2772.putByte(var26, 336730185);
                        this.aClass240_Sub8_Sub2_2772.putByte(var27, 193452770);
                        this.aClass240_Sub8_Sub2_2772.putByte(var28, 1783437021);
                        this.aClass240_Sub8_Sub2_2772.putByte(var37, -750620205);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(0.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(1.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(var30 - var18[0] + var19[0]);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(var31 - var18[1] + var19[1]);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(var38 - var18[2] + var19[2]);
                        this.aClass240_Sub8_Sub2_2772.putByte(var26, 630900200);
                        this.aClass240_Sub8_Sub2_2772.putByte(var27, 1518450752);
                        this.aClass240_Sub8_Sub2_2772.putByte(var28, -343331979);
                        this.aClass240_Sub8_Sub2_2772.putByte(var37, 1546756814);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(1.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(1.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(var30 + var18[0] + var19[0]);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(var31 + var18[1] + var19[1]);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(var38 + var18[2] + var19[2]);
                        this.aClass240_Sub8_Sub2_2772.putByte(var26, -392606823);
                        this.aClass240_Sub8_Sub2_2772.putByte(var27, -1707359645);
                        this.aClass240_Sub8_Sub2_2772.putByte(var28, 1373786559);
                        this.aClass240_Sub8_Sub2_2772.putByte(var37, -2024058260);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(1.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(0.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(var30 + var18[0] - var19[0]);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(var31 + var18[1] - var19[1]);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(var38 + var18[2] - var19[2]);
                        this.aClass240_Sub8_Sub2_2772.putByte(var26, -746626009);
                        this.aClass240_Sub8_Sub2_2772.putByte(var27, -1142534277);
                        this.aClass240_Sub8_Sub2_2772.putByte(var28, 1670680327);
                        this.aClass240_Sub8_Sub2_2772.putByte(var37, 1631454649);
                     } else {
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(0.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(0.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(var30 + var9 * (float)(-var33));
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(var31 + var10 * (float)(-var33));
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(var38 + var11 * (float)(-var33));
                        this.aClass240_Sub8_Sub2_2772.putByte(var26, -1106499372);
                        this.aClass240_Sub8_Sub2_2772.putByte(var27, 1878959219);
                        this.aClass240_Sub8_Sub2_2772.putByte(var28, 1722279505);
                        this.aClass240_Sub8_Sub2_2772.putByte(var37, 825770919);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(0.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(1.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(var30 + var15 * (float)var33);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(var31 + var16 * (float)var33);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(var38 + var17 * (float)var33);
                        this.aClass240_Sub8_Sub2_2772.putByte(var26, -1180603587);
                        this.aClass240_Sub8_Sub2_2772.putByte(var27, 1441880928);
                        this.aClass240_Sub8_Sub2_2772.putByte(var28, 330248341);
                        this.aClass240_Sub8_Sub2_2772.putByte(var37, -1362927868);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(1.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(1.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(var30 + var9 * (float)var33);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(var31 + var10 * (float)var33);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(var38 + var11 * (float)var33);
                        this.aClass240_Sub8_Sub2_2772.putByte(var26, 1719642429);
                        this.aClass240_Sub8_Sub2_2772.putByte(var27, 1101142482);
                        this.aClass240_Sub8_Sub2_2772.putByte(var28, 1522523038);
                        this.aClass240_Sub8_Sub2_2772.putByte(var37, -124000339);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(1.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(0.0F);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(var30 + var12 * (float)var33);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(var31 + var13 * (float)var33);
                        this.aClass240_Sub8_Sub2_2772.putFloatLE(var38 + var14 * (float)var33);
                        this.aClass240_Sub8_Sub2_2772.putByte(var26, 686776717);
                        this.aClass240_Sub8_Sub2_2772.putByte(var27, -306043403);
                        this.aClass240_Sub8_Sub2_2772.putByte(var28, -1615123297);
                        this.aClass240_Sub8_Sub2_2772.putByte(var37, 1021413919);
                     }
                  }
               }
            }
         }
      }

      if(this.aClass240_Sub8_Sub2_2772.index * 964952859 != 0) {
         this.anOGLBuffer_2773.putData(24, this.aClass240_Sub8_Sub2_2772.data, this.aClass240_Sub8_Sub2_2772.index * 964952859);
         renderer.setPointers(this.anOGLBufferPointer_2781, (OGLBufferPointer)null, this.anOGLBufferPointer_2775, this.anOGLBufferPointer_2785);
         renderer.method7008(7, 0, this.aClass240_Sub8_Sub2_2772.index * 964952859 / 24);
      }

   }
}
