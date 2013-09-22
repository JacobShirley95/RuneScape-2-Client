import java.awt.Canvas;

public class SoftwareRenderer extends Renderer {

   Class210[] aClass210Array_10155;
   boolean aBoolean_10156;
   int anInt_10157;
   int[] renderArray;
   float[] aFloatArray_10159;
   int renderWidth;
   CacheNodeArrayList aClass627_10161;
   int anInt_10162;
   int targetY;
   boolean aBoolean_10164;
   int targetHeight;
   int renderHeight;
   int anInt_10167;
   float renderY;
   int anInt_10169;
   int anInt_10170;
   int anInt_10171;
   Viewport aViewport_10172;
   ArrayViewport anArrayViewport_10173;
   int anInt_10174;
   ArrayViewport renderData;
   float[][] aFloatArrayArray_10176;
   int anInt_10177;
   int targetWidth;
   int anInt_10179;
   int anInt_10180;
   float scaleX;
   float renderX;
   float scaleY;
   ArrayViewport anArrayViewport_10184;
   float aFloat_10185;
   float aFloat_10186;
   int anInt_10187;
   int anInt_10188;
   int targetX;
   CacheNodeArrayList aClass627_10190;
   Sprite aClass170_10191;
   int anInt_10192;


   SoftwareRenderer(Class163 var1, Class96 var2) {
      super(var1, var2);
      this.aBoolean_10164 = false;
      this.aBoolean_10156 = false;
      this.targetX = 0;
      this.targetY = 0;
      this.targetWidth = 0;
      this.targetHeight = 0;
      this.anInt_10169 = -1752486845;
      this.anInt_10170 = 1331962734;
      this.anInt_10171 = -1727305542;
      this.aFloatArrayArray_10176 = new float[6][4];
      this.aFloat_10185 = 1.0F;
      this.aFloat_10186 = 0.0F;
      this.aClass627_10190 = new CacheNodeArrayList(16);
      this.anInt_10174 = 1035116139;

      try {
         this.aClass627_10161 = new CacheNodeArrayList(6291456, 256);
         this.aViewport_10172 = new Viewport();
         this.anArrayViewport_10173 = new ArrayViewport();
         this.anArrayViewport_10184 = new ArrayViewport();
         this.renderData = new ArrayViewport();
         this.method6786(1);
         this.method6785(0);
         Class86.method1127(true, true, (byte)-114);
         this.aBoolean_10156 = true;
         this.anInt_10157 = (int)Class373.getCurrentTime((short)24043) * 426717699;
      } catch (Throwable var4) {
         var4.printStackTrace();
         this.method1939(-1500363801);
         throw new RuntimeException("");
      }
   }

   public RendererInfo getRendererInfo() {
      return new RendererInfo(0, "Pure Java", 1, "CPU", 0L);
   }

   void method1886(int var1, int var2) throws Exception_Sub7 {
      this.softwareTarget.method7574(var1, var2);
      if(this.aClass96_2801 != null) {
         this.aClass96_2801.method1254(885708914);
      }

   }

   public void method1962() {}

   void method1888() {
      if(this.aBoolean_10156) {
         Class19.method103(true, false, (byte)1);
         this.aBoolean_10156 = false;
      }

      this.aBoolean_10164 = true;
   }

   int[] method6736(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_10161;
      Class240_Sub45 var4;
      synchronized(this.aClass627_10161) {
         var4 = (Class240_Sub45)this.aClass627_10161.getObject((long)(var2 & '\uffff' | (var1 & '\uffff') << 16) | Long.MIN_VALUE);
         if(null == var4) {
            Class183 var5 = this.aClass163_2802.method1996(var1, (byte)2);
            int var6 = -1446355517 * var5.anInt_3112;
            if(!this.aClass96_2801.method1263(var2, Class610.aClass610_9945, 0.7F, var6, var6, true, (byte)34)) {
               return null;
            }

            int[] var7;
            if(Class620.aClass620_10022 == var5.aClass620_3153) {
               var7 = this.aClass96_2801.method1257(var2, 0.7F, var6, var6, true, (byte)1);
            } else {
               var7 = this.aClass96_2801.method1251(var2, 0.7F, var6, var6, true, -970785875);
            }

            var4 = new Class240_Sub45(var1, var2, var6, var7, Class620.aClass620_10021 != var5.aClass620_3153);
            this.aClass627_10161.insert(var4, (long)(var2 & '\uffff' | (var1 & '\uffff') << 16) | Long.MIN_VALUE, var6 * var6, -1873790732);
         }
      }

      var4.aBoolean_7641 = true;
      return var4.method4975();
   }

   public void method1909(int var1, int var2, int var3, int var4) {
      this.anInt_10177 = 1562303503 * var1;
      this.anInt_10162 = 713938695 * var2;
      this.anInt_10179 = 284483925 * var3;
      this.anInt_10180 = var4 * -1846122251;
      this.method6827();
   }

   Class620 method6738(int var1) {
      return this.aClass163_2802.method1996(var1, (byte)2).aClass620_3153;
   }

   int method6739(int var1) {
      return this.aClass163_2802.method1996(var1, (byte)2).aShort_3118 & '\uffff';
   }

   void method6740(boolean var1, boolean var2, boolean var3, int var4, int var5, float var6, int var7, int var8, short var9, int var10, int var11, int var12) {
      if(var7 != 0 && var8 != 0) {
         if(var9 != -1) {
            Class183 var13 = this.aClass163_2802.method1996(var9, (byte)2);
            if(!var13.aBoolean_3174) {
               if(var9 != -1326456387 * this.anInt_10174) {
                  Sprite var14 = (Sprite)this.aClass627_10190.getObject((long)var9);
                  if(null == var14) {
                     int[] var15 = this.method6736(var9, var13.anInt_3146 * -534969509);
                     if(null == var15) {
                        return;
                     }

                     int var16 = -1446355517 * var13.anInt_3112;
                     var14 = this.defineSprite(var15, 0, var16, var16, var16);
                     this.aClass627_10190.insert(var14, (long)var9);
                  }

                  this.anInt_10174 = var9 * -1035116139;
                  this.aClass170_10191 = var14;
               }

               ((SoftwareSprite)this.aClass170_10191).method7554(var1, var2, var3, var4 - var7, var5 - var8, var6, var7 << 1, var8 << 1, var11, var10, var12, 1, var13.aClass620_3153 != Class620.aClass620_10022);
               return;
            }
         }

         this.method6792(var2, var4, var5, var6, var7, var10, var12);
      }
   }

   public boolean method1892() {
      return true;
   }

   public int[] method1906(int var1, int var2, int var3, int var4) {
      if(this.renderArray == null) {
         throw new IllegalStateException("");
      } else {
         int[] var5 = new int[var3 * var4];
         int var6 = 0;

         for(int var7 = 0; var7 < var4; ++var7) {
            int var8 = this.renderWidth * 1176497263 * (var2 + var7) + var1;

            for(int var9 = 0; var9 < var3; ++var9) {
               var5[var6++] = this.renderArray[var9 + var8];
            }
         }

         return var5;
      }
   }

   public boolean method1959() {
      return false;
   }

   public boolean method1964() {
      return false;
   }

   public boolean method1963() {
      return false;
   }

   public boolean method1900() {
      return false;
   }

   public boolean method1894() {
      return true;
   }

   public void method1957(int var1, Class105 var2) {
      for(int var3 = 0; var3 < this.aClass210Array_10155.length; ++var3) {
         this.aClass210Array_10155[var3].anInt_3617 = this.aClass210Array_10155[var3].anInt_3616 * 1727895961;
         this.aClass210Array_10155[var3].anInt_3611 = -255043327 * var1;
         this.aClass210Array_10155[var3].anInt_3616 = 550893745 * var2.anInt_1982;
         this.aClass210Array_10155[var3].anInt_3651 = -347643315 * var2.anInt_1981;
         this.aClass210Array_10155[var3].aBoolean_3618 = true;
      }

   }

   Class174_Sub2 method1903(Canvas var1, int var2, int var3) {
      return Class461.method5588(this, var1, var2, var3, -1356314095);
   }

   void method6750(int var1, int var2, int[] var3, float[] var4) {
      this.renderWidth = -856231281 * var1;
      this.renderHeight = var2 * -1520779169;
      this.renderArray = var3;
      this.aFloatArray_10159 = var4;

      for(int var5 = 0; var5 < this.anInt_10187 * 367589431; ++var5) {
         this.aClass210Array_10155[var5].update(236874311);
      }

      this.method1967();
      this.method1908();
   }

   public void method1951(int var1, int var2, int var3, int var4, int var5) {
      if(null != this.renderArray) {
         if(var1 >= -346770183 * this.targetX && var1 < 1163141991 * this.targetY) {
            if(var2 < this.targetWidth * 759884099) {
               var3 -= this.targetWidth * 759884099 - var2;
               var2 = this.targetWidth * 759884099;
            }

            if(var3 + var2 > this.targetHeight * 108427145) {
               var3 = this.targetHeight * 108427145 - var2;
            }

            int var6 = this.renderWidth * 1176497263 * var2 + var1;
            int var7 = var4 >>> 24;
            int var8;
            if(0 != var5 && (1 != var5 || 255 != var7)) {
               int var9;
               int var10;
               int var11;
               if(var5 == 1) {
                  var4 = ((var4 & '\uff00') * var7 >> 8 & '\uff00') + ((var4 & 16711935) * var7 >> 8 & 16711935) + (var7 << 24);
                  var8 = 256 - var7;

                  for(var9 = 0; var9 < var3; ++var9) {
                     var10 = var6 + var9 * this.renderWidth * 1176497263;
                     var11 = this.renderArray[var10];
                     var11 = (var8 * (var11 & '\uff00') >> 8 & '\uff00') + ((var11 & 16711935) * var8 >> 8 & 16711935);
                     this.renderArray[var10] = var4 + var11;
                  }
               } else {
                  if(var5 != 2) {
                     throw new IllegalArgumentException();
                  }

                  for(var8 = 0; var8 < var3; ++var8) {
                     var9 = var8 * 1176497263 * this.renderWidth + var6;
                     var10 = this.renderArray[var9];
                     var11 = var10 + var4;
                     int var12 = (var4 & 16711935) + (var10 & 16711935);
                     var10 = (var11 - var12 & 65536) + (var12 & 16777472);
                     this.renderArray[var9] = var11 - var10 | var10 - (var10 >>> 8);
                  }
               }
            } else {
               for(var8 = 0; var8 < var3; ++var8) {
                  this.renderArray[var6 + var8 * 1176497263 * this.renderWidth] = var4;
               }
            }

         }
      }
   }

   void method6752() {
      if(this.aFloatArray_10159 != null) {
         int var1;
         int var2;
         int var3;
         if(this.targetX * -346770183 == 0 && this.renderWidth * 1176497263 == this.targetY * 1163141991 && 759884099 * this.targetWidth == 0 && 108427145 * this.targetHeight == this.renderHeight * -763913313) {
            var1 = this.aFloatArray_10159.length;
            var2 = var1 - (var1 & 7);

            for(var3 = 0; var3 < var2; this.aFloatArray_10159[var3++] = 2.14748365E9F) {
               this.aFloatArray_10159[var3++] = 2.14748365E9F;
               this.aFloatArray_10159[var3++] = 2.14748365E9F;
               this.aFloatArray_10159[var3++] = 2.14748365E9F;
               this.aFloatArray_10159[var3++] = 2.14748365E9F;
               this.aFloatArray_10159[var3++] = 2.14748365E9F;
               this.aFloatArray_10159[var3++] = 2.14748365E9F;
               this.aFloatArray_10159[var3++] = 2.14748365E9F;
            }

            while(var3 < var1) {
               this.aFloatArray_10159[var3++] = 2.14748365E9F;
            }
         } else {
            var1 = 1163141991 * this.targetY - this.targetX * -346770183;
            var2 = this.targetHeight * 108427145 - this.targetWidth * 759884099;
            var3 = 1176497263 * this.renderWidth - var1;
            int var4 = 759884099 * this.targetWidth * 1176497263 * this.renderWidth + -346770183 * this.targetX;
            int var5 = var1 >> 3;
            int var6 = var1 & 7;
            var1 = var4 - 1;

            for(int var7 = -var2; var7 < 0; ++var7) {
               int var8;
               if(var5 > 0) {
                  var8 = var5;

                  do {
                     ++var1;
                     this.aFloatArray_10159[var1] = 2.14748365E9F;
                     ++var1;
                     this.aFloatArray_10159[var1] = 2.14748365E9F;
                     ++var1;
                     this.aFloatArray_10159[var1] = 2.14748365E9F;
                     ++var1;
                     this.aFloatArray_10159[var1] = 2.14748365E9F;
                     ++var1;
                     this.aFloatArray_10159[var1] = 2.14748365E9F;
                     ++var1;
                     this.aFloatArray_10159[var1] = 2.14748365E9F;
                     ++var1;
                     this.aFloatArray_10159[var1] = 2.14748365E9F;
                     ++var1;
                     this.aFloatArray_10159[var1] = 2.14748365E9F;
                     --var8;
                  } while(var8 > 0);
               }

               if(var6 > 0) {
                  var8 = var6;

                  do {
                     ++var1;
                     this.aFloatArray_10159[var1] = 2.14748365E9F;
                     --var8;
                  } while(var8 > 0);
               }

               var1 += var3;
            }
         }

      }
   }

   public void enableZBuffering(boolean var1) {
      Class210 var2 = this.method6787(Thread.currentThread());
      var2.aBoolean_3639 = var1;
   }

   public void method1908() {
      this.anInt_10177 = 0;
      this.anInt_10162 = 0;
      this.anInt_10179 = -1590489125 * this.renderWidth;
      this.anInt_10180 = -1652914389 * this.renderHeight;
      this.method6827();
   }

   public void method1965(int var1, int var2, int var3, int var4) {
      if(var1 < 0) {
         var1 = 0;
      }

      if(var2 < 0) {
         var2 = 0;
      }

      if(var3 > 1176497263 * this.renderWidth) {
         var3 = this.renderWidth * 1176497263;
      }

      if(var4 > this.renderHeight * -763913313) {
         var4 = this.renderHeight * -763913313;
      }

      this.targetX = var1 * 1402326345;
      this.targetY = -921352105 * var3;
      this.targetWidth = -1691292821 * var2;
      this.targetHeight = var4 * -1067372871;
      this.method6827();
   }

   public void method1911(int var1, int var2, int var3, int var4) {
      if(this.targetX * -346770183 < var1) {
         this.targetX = 1402326345 * var1;
      }

      if(this.targetWidth * 759884099 < var2) {
         this.targetWidth = -1691292821 * var2;
      }

      if(this.targetY * 1163141991 > var3) {
         this.targetY = var3 * -921352105;
      }

      if(108427145 * this.targetHeight > var4) {
         this.targetHeight = -1067372871 * var4;
      }

      this.method6827();
   }

   public void method1913(int[] var1) {
      var1[0] = this.targetX * -346770183;
      var1[1] = 759884099 * this.targetWidth;
      var1[2] = 1163141991 * this.targetY;
      var1[3] = 108427145 * this.targetHeight;
   }

   public void method1977(int var1, int var2) {
      if((var1 & 1) != 0) {
         this.drawOutline(0, 0, this.renderWidth * 1176497263, -763913313 * this.renderHeight, var2, 0);
      }

      if(0 != (var1 & 2)) {
         this.method6752();
      }

   }

   public void drawOutline(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(this.renderArray != null) {
         if(var1 < this.targetX * -346770183) {
            var3 -= this.targetX * -346770183 - var1;
            var1 = this.targetX * -346770183;
         }

         if(var2 < 759884099 * this.targetWidth) {
            var4 -= 759884099 * this.targetWidth - var2;
            var2 = this.targetWidth * 759884099;
         }

         if(var3 + var1 > this.targetY * 1163141991) {
            var3 = this.targetY * 1163141991 - var1;
         }

         if(var2 + var4 > 108427145 * this.targetHeight) {
            var4 = this.targetHeight * 108427145 - var2;
         }

         if(var3 > 0 && var4 > 0 && var1 <= this.targetY * 1163141991 && var2 <= 108427145 * this.targetHeight) {
            int var7 = this.renderWidth * 1176497263 - var3;
            int var8 = var1 + var2 * 1176497263 * this.renderWidth;
            int var9 = var5 >>> 24;
            int var10;
            int var11;
            int var12;
            if(var6 != 0 && (var6 != 1 || 255 != var9)) {
               int var13;
               if(1 == var6) {
                  var5 = (var9 * ((var5 & -16711936) >>> 8) & -16711936) + ((var5 & 16711935) * var9 >> 8 & 16711935);
                  var10 = 256 - var9;

                  for(var11 = 0; var11 < var4; ++var11) {
                     for(var12 = -var3; var12 < 0; ++var12) {
                        var13 = this.renderArray[var8];
                        var13 = (var10 * (var13 & 16711935) >> 8 & 16711935) + (var10 * ((var13 & -16711936) >>> 8) & -16711936);
                        this.renderArray[var8++] = var5 + var13;
                     }

                     var8 += var7;
                  }
               } else {
                  if(2 != var6) {
                     throw new IllegalArgumentException();
                  }

                  for(var10 = 0; var10 < var4; ++var10) {
                     for(var11 = -var3; var11 < 0; ++var11) {
                        var12 = this.renderArray[var8];
                        var13 = var5 + var12;
                        int var14 = (var5 & 16711935) + (var12 & 16711935);
                        var12 = (var14 & 16777472) + (var13 - var14 & 65536);
                        this.renderArray[var8++] = var13 - var12 | var12 - (var12 >>> 8);
                     }

                     var8 += var7;
                  }
               }
            } else {
               var10 = var3 >> 3;
               var11 = var3 & 7;
               var3 = var8 - 1;

               for(var12 = -var4; var12 < 0; ++var12) {
                  if(var10 > 0) {
                     var1 = var10;

                     do {
                        ++var3;
                        this.renderArray[var3] = var5;
                        ++var3;
                        this.renderArray[var3] = var5;
                        ++var3;
                        this.renderArray[var3] = var5;
                        ++var3;
                        this.renderArray[var3] = var5;
                        ++var3;
                        this.renderArray[var3] = var5;
                        ++var3;
                        this.renderArray[var3] = var5;
                        ++var3;
                        this.renderArray[var3] = var5;
                        ++var3;
                        this.renderArray[var3] = var5;
                        --var1;
                     } while(var1 > 0);
                  }

                  if(var11 > 0) {
                     var1 = var11;

                     do {
                        ++var3;
                        this.renderArray[var3] = var5;
                        --var1;
                     } while(var1 > 0);
                  }

                  var3 += var7;
               }
            }

         }
      }
   }

   public boolean method1992() {
      return false;
   }

   public Class99 method1905(int var1, int var2, int var3) {
      return new Class203(var1, var2);
   }

   public void method1922(int var1, int var2, int var3, int var4, int var5) {
      if(this.renderArray != null) {
         if(var2 >= this.targetWidth * 759884099 && var2 < 108427145 * this.targetHeight) {
            if(var1 < -346770183 * this.targetX) {
               var3 -= this.targetX * -346770183 - var1;
               var1 = this.targetX * -346770183;
            }

            if(var1 + var3 > this.targetY * 1163141991) {
               var3 = this.targetY * 1163141991 - var1;
            }

            int var6 = var2 * this.renderWidth * 1176497263 + var1;
            int var7 = var4 >>> 24;
            int var8;
            if(var5 != 0 && (1 != var5 || var7 != 255)) {
               int var9;
               int var10;
               if(1 == var5) {
                  var4 = ((var4 & '\uff00') * var7 >> 8 & '\uff00') + ((var4 & 16711935) * var7 >> 8 & 16711935) + (var7 << 24);
                  var8 = 256 - var7;

                  for(var9 = 0; var9 < var3; ++var9) {
                     var10 = this.renderArray[var9 + var6];
                     var10 = ((var10 & 16711935) * var8 >> 8 & 16711935) + (var8 * (var10 & '\uff00') >> 8 & '\uff00');
                     this.renderArray[var6 + var9] = var10 + var4;
                  }
               } else {
                  if(var5 != 2) {
                     throw new IllegalArgumentException();
                  }

                  for(var8 = 0; var8 < var3; ++var8) {
                     var9 = this.renderArray[var6 + var8];
                     var10 = var9 + var4;
                     int var11 = (var9 & 16711935) + (var4 & 16711935);
                     var9 = (var10 - var11 & 65536) + (var11 & 16777472);
                     this.renderArray[var6 + var8] = var10 - var9 | var9 - (var9 >>> 8);
                  }
               }
            } else {
               for(var8 = 0; var8 < var3; ++var8) {
                  this.renderArray[var8 + var6] = var4;
               }
            }

         }
      }
   }

   void method6763(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(null != this.renderArray) {
         if(var2 >= this.targetWidth * 759884099 && var2 < this.targetHeight * 108427145) {
            int var9 = var2 * this.renderWidth * 1176497263 + var1;
            int var10 = var4 >>> 24;
            int var11 = var7 + var6;
            int var12 = var8 % var11;
            int var13;
            if(var5 != 0 && (var5 != 1 || 255 != var10)) {
               int var14;
               int var15;
               if(var5 == 1) {
                  var4 = ((var4 & '\uff00') * var10 >> 8 & '\uff00') + ((var4 & 16711935) * var10 >> 8 & 16711935) + (var10 << 24);
                  var13 = 256 - var10;

                  for(var14 = 0; var14 < var3; var12 %= var11) {
                     if(var14 + var1 >= this.targetX * -346770183 && var14 + var1 < this.targetY * 1163141991 && var12 < var6) {
                        var15 = this.renderArray[var9 + var14];
                        var15 = (var13 * (var15 & 16711935) >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        this.renderArray[var9 + var14] = var15 + var4;
                     }

                     ++var14;
                     ++var12;
                  }
               } else {
                  if(2 != var5) {
                     throw new IllegalArgumentException();
                  }

                  for(var13 = 0; var13 < var3; var12 %= var11) {
                     if(var13 + var1 >= -346770183 * this.targetX && var13 + var1 < 1163141991 * this.targetY && var12 < var6) {
                        var14 = this.renderArray[var9 + var13];
                        var15 = var4 + var14;
                        int var16 = (var14 & 16711935) + (var4 & 16711935);
                        var14 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.renderArray[var9 + var13] = var15 - var14 | var14 - (var14 >>> 8);
                     }

                     ++var13;
                     ++var12;
                  }
               }
            } else {
               for(var13 = 0; var13 < var3; var12 %= var11) {
                  if(var1 + var13 >= this.targetX * -346770183 && var1 + var13 < this.targetY * 1163141991 && var12 < var6) {
                     this.renderArray[var13 + var9] = var4;
                  }

                  ++var13;
                  ++var12;
               }
            }

         }
      }
   }

   void method6764() {
      this.anArrayViewport_10173.setViewport(this.aViewport_10172);
      this.renderData.replaceWith(this.anArrayViewport_10173);
      this.renderData.method4580(this.anArrayViewport_10184);
      this.renderData.method4584(this.aFloatArrayArray_10176[0]);
      this.renderData.method4582(this.aFloatArrayArray_10176[1]);
      this.renderData.method4583(this.aFloatArrayArray_10176[2]);
      this.renderData.method4567(this.aFloatArrayArray_10176[3]);
      this.renderData.method4568(this.aFloatArrayArray_10176[4]);
      this.renderData.method4553(this.aFloatArrayArray_10176[5]);
      float var1 = this.anArrayViewport_10184.method4565();
      float var2 = (var1 - 255.0F) * this.anArrayViewport_10184.data[10] + this.anArrayViewport_10184.data[14];
      float var3 = this.anArrayViewport_10184.data[14] + var1 * this.anArrayViewport_10184.data[10];
      float var4 = var3 - var2;

      for(int var5 = 0; var5 < this.anInt_10187 * 367589431; ++var5) {
         Class210 var6 = this.aClass210Array_10155[var5];
         var6.aFloat_3614 = var2;
         var6.aFloat_3624 = var4;
      }

   }

   void method6765(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(null != this.renderArray) {
         if(var1 >= this.targetX * -346770183 && var1 < 1163141991 * this.targetY) {
            int var9 = 1176497263 * this.renderWidth * var2 + var1;
            int var10 = var4 >>> 24;
            int var11 = var6 + var7;
            int var12 = var8 % var11;
            int var13;
            if(var5 != 0 && (1 != var5 || 255 != var10)) {
               int var14;
               int var15;
               int var16;
               if(1 == var5) {
                  var4 = (var10 << 24) + ((var4 & '\uff00') * var10 >> 8 & '\uff00') + ((var4 & 16711935) * var10 >> 8 & 16711935);
                  var13 = 256 - var10;

                  for(var14 = 0; var14 < var3; var12 %= var11) {
                     if(var2 + var14 >= 759884099 * this.targetWidth && var2 + var14 < this.targetHeight * 108427145 && var12 < var6) {
                        var15 = 1176497263 * this.renderWidth * var14 + var9;
                        var16 = this.renderArray[var15];
                        var16 = (var13 * (var16 & '\uff00') >> 8 & '\uff00') + (var13 * (var16 & 16711935) >> 8 & 16711935);
                        this.renderArray[var15] = var4 + var16;
                     }

                     ++var14;
                     ++var12;
                  }
               } else {
                  if(2 != var5) {
                     throw new IllegalArgumentException();
                  }

                  for(var13 = 0; var13 < var3; var12 %= var11) {
                     if(var2 + var13 >= this.targetWidth * 759884099 && var13 + var2 < 108427145 * this.targetHeight && var12 < var6) {
                        var14 = var9 + 1176497263 * this.renderWidth * var13;
                        var15 = this.renderArray[var14];
                        var16 = var15 + var4;
                        int var17 = (var4 & 16711935) + (var15 & 16711935);
                        var15 = (var16 - var17 & 65536) + (var17 & 16777472);
                        this.renderArray[var14] = var16 - var15 | var15 - (var15 >>> 8);
                     }

                     ++var13;
                     ++var12;
                  }
               }
            } else {
               for(var13 = 0; var13 < var3; var12 %= var11) {
                  if(var13 + var2 >= this.targetWidth * 759884099 && var13 + var2 < this.targetHeight * 108427145 && var12 < var6) {
                     this.renderArray[var13 * 1176497263 * this.renderWidth + var9] = var4;
                  }

                  ++var13;
                  ++var12;
               }
            }

         }
      }
   }

   public void method1968(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(this.renderArray != null) {
         var3 -= var1;
         var4 -= var2;
         if(var4 == 0) {
            if(var3 >= 0) {
               this.method1922(var1, var2, 1 + var3, var5, var6);
            } else {
               this.method1922(var3 + var1, var2, 1 + -var3, var5, var6);
            }

         } else if(0 == var3) {
            if(var4 >= 0) {
               this.method1951(var1, var2, 1 + var4, var5, var6);
            } else {
               this.method1951(var1, var2 + var4, -var4 + 1, var5, var6);
            }

         } else {
            if(var4 + var3 < 0) {
               var1 += var3;
               var3 = -var3;
               var2 += var4;
               var4 = -var4;
            }

            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            int var13;
            if(var3 > var4) {
               var2 <<= 16;
               var2 += '\u8000';
               var4 <<= 16;
               var7 = (int)Math.floor(0.5D + (double)var4 / (double)var3);
               var3 += var1;
               if(var1 < this.targetX * -346770183) {
                  var2 += (-346770183 * this.targetX - var1) * var7;
                  var1 = -346770183 * this.targetX;
               }

               if(var3 >= this.targetY * 1163141991) {
                  var3 = 1163141991 * this.targetY - 1;
               }

               var8 = var5 >>> 24;
               if(var6 != 0 && (1 != var6 || 255 != var8)) {
                  if(1 == var6) {
                     var5 = (var8 << 24) + (var8 * (var5 & 16711935) >> 8 & 16711935) + (var8 * (var5 & '\uff00') >> 8 & '\uff00');

                     for(var9 = 256 - var8; var1 <= var3; ++var1) {
                        var10 = var2 >> 16;
                        if(var10 >= 759884099 * this.targetWidth && var10 < this.targetHeight * 108427145) {
                           var11 = var1 + var10 * 1176497263 * this.renderWidth;
                           var12 = this.renderArray[var11];
                           var12 = ((var12 & '\uff00') * var9 >> 8 & '\uff00') + (var9 * (var12 & 16711935) >> 8 & 16711935);
                           this.renderArray[var11] = var12 + var5;
                        }

                        var2 += var7;
                     }
                  } else {
                     if(2 != var6) {
                        throw new IllegalArgumentException();
                     }

                     while(var1 <= var3) {
                        var9 = var2 >> 16;
                        if(var9 >= 759884099 * this.targetWidth && var9 < 108427145 * this.targetHeight) {
                           var10 = var1 + 1176497263 * this.renderWidth * var9;
                           var11 = this.renderArray[var10];
                           var12 = var5 + var11;
                           var13 = (var11 & 16711935) + (var5 & 16711935);
                           var11 = (var13 & 16777472) + (var12 - var13 & 65536);
                           this.renderArray[var10] = var12 - var11 | var11 - (var11 >>> 8);
                        }

                        var2 += var7;
                        ++var1;
                     }
                  }
               } else {
                  while(var1 <= var3) {
                     var9 = var2 >> 16;
                     if(var9 >= this.targetWidth * 759884099 && var9 < this.targetHeight * 108427145) {
                        this.renderArray[var9 * 1176497263 * this.renderWidth + var1] = var5;
                     }

                     var2 += var7;
                     ++var1;
                  }
               }
            } else {
               var1 <<= 16;
               var1 += '\u8000';
               var3 <<= 16;
               var7 = (int)Math.floor((double)var3 / (double)var4 + 0.5D);
               var4 += var2;
               if(var2 < 759884099 * this.targetWidth) {
                  var1 += var7 * (759884099 * this.targetWidth - var2);
                  var2 = this.targetWidth * 759884099;
               }

               if(var4 >= 108427145 * this.targetHeight) {
                  var4 = this.targetHeight * 108427145 - 1;
               }

               var8 = var5 >>> 24;
               if(var6 != 0 && (var6 != 1 || var8 != 255)) {
                  if(1 == var6) {
                     var5 = (var8 << 24) + ((var5 & '\uff00') * var8 >> 8 & '\uff00') + ((var5 & 16711935) * var8 >> 8 & 16711935);

                     for(var9 = 256 - var8; var2 <= var4; ++var2) {
                        var10 = var1 >> 16;
                        if(var10 >= this.targetX * -346770183 && var10 < this.targetY * 1163141991) {
                           var11 = 1176497263 * this.renderWidth * var2 + var10;
                           var12 = this.renderArray[var11];
                           var12 = ((var12 & '\uff00') * var9 >> 8 & '\uff00') + (var9 * (var12 & 16711935) >> 8 & 16711935);
                           this.renderArray[var10 + 1176497263 * this.renderWidth * var2] = var5 + var12;
                        }

                        var1 += var7;
                     }
                  } else {
                     if(var6 != 2) {
                        throw new IllegalArgumentException();
                     }

                     while(var2 <= var4) {
                        var9 = var1 >> 16;
                        if(var9 >= -346770183 * this.targetX && var9 < 1163141991 * this.targetY) {
                           var10 = var9 + var2 * 1176497263 * this.renderWidth;
                           var11 = this.renderArray[var10];
                           var12 = var11 + var5;
                           var13 = (var5 & 16711935) + (var11 & 16711935);
                           var11 = (var13 & 16777472) + (var12 - var13 & 65536);
                           this.renderArray[var10] = var12 - var11 | var11 - (var11 >>> 8);
                        }

                        var1 += var7;
                        ++var2;
                     }
                  }
               } else {
                  while(var2 <= var4) {
                     var9 = var1 >> 16;
                     if(var9 >= -346770183 * this.targetX && var9 < 1163141991 * this.targetY) {
                        this.renderArray[var9 + this.renderWidth * 1176497263 * var2] = var5;
                     }

                     var1 += var7;
                     ++var2;
                  }
               }
            }

         }
      }
   }

   public void method1923(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if(this.renderArray != null) {
         var3 -= var1;
         var4 -= var2;
         int var10;
         if(0 == var4) {
            if(var3 >= 0) {
               this.method6763(var1, var2, 1 + var3, var5, var6, var7, var8, var9);
            } else {
               var10 = var8 + var7;
               var9 %= var10;
               var9 = var10 + var7 - var9 - (-var3 + 1) % var10;
               var9 %= var10;
               if(var9 < 0) {
                  var9 += var10;
               }

               this.method6763(var3 + var1, var2, 1 + -var3, var5, var6, var7, var8, var9);
            }

         } else if(0 == var3) {
            if(var4 >= 0) {
               this.method6765(var1, var2, var4 + 1, var5, var6, var7, var8, var9);
            } else {
               var10 = var7 + var8;
               var9 %= var10;
               var9 = var10 + var7 - var9 - (1 + -var4) % var10;
               var9 %= var10;
               if(var9 < 0) {
                  var9 += var10;
               }

               this.method6765(var1, var2 + var4, -var4 + 1, var5, var6, var7, var8, var9);
            }

         } else {
            var9 <<= 8;
            var7 <<= 8;
            var8 <<= 8;
            var10 = var8 + var7;
            var9 %= var10;
            int var11;
            int var12;
            if(var4 + var3 < 0) {
               var11 = (int)(Math.sqrt((double)(var3 * var3 + var4 * var4)) * 256.0D);
               var12 = var11 % var10;
               var9 = var7 + var10 - var9 - var12;
               var9 %= var10;
               if(var9 < 0) {
                  var9 += var10;
               }

               var1 += var3;
               var3 = -var3;
               var2 += var4;
               var4 = -var4;
            }

            int var13;
            int var14;
            int var15;
            int var17;
            int var16;
            int var18;
            if(var3 > var4) {
               var2 <<= 16;
               var2 += '\u8000';
               var4 <<= 16;
               var11 = (int)Math.floor((double)var4 / (double)var3 + 0.5D);
               var3 += var1;
               var12 = var5 >>> 24;
               var13 = (int)Math.sqrt((double)((var11 >> 8) * (var11 >> 8) + 65536));
               if(var6 != 0 && (var6 != 1 || 255 != var12)) {
                  if(1 == var6) {
                     var5 = (var12 << 24) + ((var5 & '\uff00') * var12 >> 8 & '\uff00') + ((var5 & 16711935) * var12 >> 8 & 16711935);

                     for(var14 = 256 - var12; var1 <= var3; var9 %= var10) {
                        var15 = var2 >> 16;
                        if(var1 >= this.targetX * -346770183 && var1 < 1163141991 * this.targetY && var15 >= this.targetWidth * 759884099 && var15 < 108427145 * this.targetHeight && var9 < var7) {
                           var16 = var1 + var15 * this.renderWidth * 1176497263;
                           var17 = this.renderArray[var16];
                           var17 = ((var17 & '\uff00') * var14 >> 8 & '\uff00') + ((var17 & 16711935) * var14 >> 8 & 16711935);
                           this.renderArray[var16] = var5 + var17;
                        }

                        var2 += var11;
                        ++var1;
                        var9 += var13;
                     }
                  } else {
                     if(var6 != 2) {
                        throw new IllegalArgumentException();
                     }

                     while(var1 <= var3) {
                        var14 = var2 >> 16;
                        if(var1 >= this.targetX * -346770183 && var1 < this.targetY * 1163141991 && var14 >= this.targetWidth * 759884099 && var14 < 108427145 * this.targetHeight && var9 < var7) {
                           var15 = var1 + this.renderWidth * 1176497263 * var14;
                           var16 = this.renderArray[var15];
                           var17 = var16 + var5;
                           var18 = (var16 & 16711935) + (var5 & 16711935);
                           var16 = (var17 - var18 & 65536) + (var18 & 16777472);
                           this.renderArray[var15] = var17 - var16 | var16 - (var16 >>> 8);
                        }

                        var2 += var11;
                        ++var1;
                        var9 += var13;
                        var9 %= var10;
                     }
                  }
               } else {
                  while(var1 <= var3) {
                     var14 = var2 >> 16;
                     if(var1 >= this.targetX * -346770183 && var1 < this.targetY * 1163141991 && var14 >= this.targetWidth * 759884099 && var14 < this.targetHeight * 108427145 && var9 < var7) {
                        this.renderArray[var1 + var14 * 1176497263 * this.renderWidth] = var5;
                     }

                     var2 += var11;
                     ++var1;
                     var9 += var13;
                     var9 %= var10;
                  }
               }
            } else {
               var1 <<= 16;
               var1 += '\u8000';
               var3 <<= 16;
               var11 = (int)Math.floor((double)var3 / (double)var4 + 0.5D);
               var4 += var2;
               var12 = var5 >>> 24;
               var13 = (int)Math.sqrt((double)(65536 + (var11 >> 8) * (var11 >> 8)));
               if(0 != var6 && (1 != var6 || 255 != var12)) {
                  if(var6 == 1) {
                     var5 = ((var5 & '\uff00') * var12 >> 8 & '\uff00') + (var12 * (var5 & 16711935) >> 8 & 16711935) + (var12 << 24);

                     for(var14 = 256 - var12; var2 <= var4; var9 %= var10) {
                        var15 = var1 >> 16;
                        if(var2 >= 759884099 * this.targetWidth && var2 < 108427145 * this.targetHeight && var15 >= this.targetX * -346770183 && var15 < this.targetY * 1163141991 && var9 < var7) {
                           var16 = var2 * this.renderWidth * 1176497263 + var15;
                           var17 = this.renderArray[var16];
                           var17 = (var14 * (var17 & '\uff00') >> 8 & '\uff00') + (var14 * (var17 & 16711935) >> 8 & 16711935);
                           this.renderArray[var15 + this.renderWidth * 1176497263 * var2] = var17 + var5;
                        }

                        var1 += var11;
                        ++var2;
                        var9 += var13;
                     }
                  } else {
                     if(2 != var6) {
                        throw new IllegalArgumentException();
                     }

                     while(var2 <= var4) {
                        var14 = var1 >> 16;
                        if(var2 >= 759884099 * this.targetWidth && var2 < this.targetHeight * 108427145 && var14 >= this.targetX * -346770183 && var14 < this.targetY * 1163141991 && var9 < var7) {
                           var15 = 1176497263 * this.renderWidth * var2 + var14;
                           var16 = this.renderArray[var15];
                           var17 = var5 + var16;
                           var18 = (var5 & 16711935) + (var16 & 16711935);
                           var16 = (var17 - var18 & 65536) + (var18 & 16777472);
                           this.renderArray[var15] = var17 - var16 | var16 - (var16 >>> 8);
                        }

                        var1 += var11;
                        ++var2;
                        var9 += var13;
                        var9 %= var10;
                     }
                  }
               } else {
                  while(var2 <= var4) {
                     var14 = var1 >> 16;
                     if(var2 >= this.targetWidth * 759884099 && var2 < 108427145 * this.targetHeight && var14 >= -346770183 * this.targetX && var14 < 1163141991 * this.targetY && var9 < var7) {
                        this.renderArray[var14 + 1176497263 * this.renderWidth * var2] = var5;
                     }

                     var1 += var11;
                     ++var2;
                     var9 += var13;
                     var9 %= var10;
                  }
               }
            }

         }
      }
   }

   public void method1954(int var1, int var2, int var3, int var4, int var5, int var6, Class1024 var7, int var8, int var9) {
      if(null != this.renderArray) {
         Class1024_Sub3 var10 = (Class1024_Sub3)var7;
         int[] var11 = var10.anIntArray_10982;
         int[] var12 = var10.anIntArray_10981;
         int var13 = 759884099 * this.targetWidth > var9?this.targetWidth * 759884099:var9;
         int var14 = 108427145 * this.targetHeight < var11.length + var9?this.targetHeight * 108427145:var11.length + var9;
         var3 -= var1;
         var4 -= var2;
         if(var3 + var4 < 0) {
            var1 += var3;
            var3 = -var3;
            var2 += var4;
            var4 = -var4;
         }

         int var15;
         int var17;
         int var16;
         int var19;
         int var18;
         int var21;
         int var20;
         int var23;
         int var22;
         if(var3 > var4) {
            var2 <<= 16;
            var2 += '\u8000';
            var4 <<= 16;
            var15 = (int)Math.floor((double)var4 / (double)var3 + 0.5D);
            var3 += var1;
            if(var1 < this.targetX * -346770183) {
               var2 += (this.targetX * -346770183 - var1) * var15;
               var1 = -346770183 * this.targetX;
            }

            if(var3 >= 1163141991 * this.targetY) {
               var3 = this.targetY * 1163141991 - 1;
            }

            var16 = var5 >>> 24;
            if(0 != var6 && (var6 != 1 || 255 != var16)) {
               if(1 == var6) {
                  var5 = ((var5 & 16711935) * var16 >> 8 & 16711935) + (var16 * (var5 & '\uff00') >> 8 & '\uff00') + (var16 << 24);

                  for(var17 = 256 - var16; var1 <= var3; ++var1) {
                     var18 = var2 >> 16;
                     var19 = var18 - var9;
                     if(var18 >= var13 && var18 < var14) {
                        var20 = var8 + var11[var19];
                        if(var1 >= var20 && var1 < var20 + var12[var19]) {
                           var21 = var18 * this.renderWidth * 1176497263 + var1;
                           var22 = this.renderArray[var21];
                           var22 = (var17 * (var22 & 16711935) >> 8 & 16711935) + (var17 * (var22 & '\uff00') >> 8 & '\uff00');
                           this.renderArray[var21] = var5 + var22;
                        }
                     }

                     var2 += var15;
                  }
               } else {
                  if(var6 != 2) {
                     throw new IllegalArgumentException();
                  }

                  while(var1 <= var3) {
                     var17 = var2 >> 16;
                     var18 = var17 - var9;
                     if(var17 >= var13 && var17 < var14) {
                        var19 = var11[var18] + var8;
                        if(var1 >= var19 && var1 < var12[var18] + var19) {
                           var20 = this.renderWidth * 1176497263 * var17 + var1;
                           var21 = this.renderArray[var20];
                           var22 = var5 + var21;
                           var23 = (var5 & 16711935) + (var21 & 16711935);
                           var21 = (var23 & 16777472) + (var22 - var23 & 65536);
                           this.renderArray[var20] = var22 - var21 | var21 - (var21 >>> 8);
                        }
                     }

                     var2 += var15;
                     ++var1;
                  }
               }
            } else {
               while(var1 <= var3) {
                  var17 = var2 >> 16;
                  var18 = var17 - var9;
                  if(var17 >= var13 && var17 < var14) {
                     var19 = var11[var18] + var8;
                     if(var1 >= var19 && var1 < var19 + var12[var18]) {
                        this.renderArray[var1 + this.renderWidth * 1176497263 * var17] = var5;
                     }
                  }

                  var2 += var15;
                  ++var1;
               }
            }
         } else {
            var1 <<= 16;
            var1 += '\u8000';
            var3 <<= 16;
            var15 = (int)Math.floor(0.5D + (double)var3 / (double)var4);
            var4 += var2;
            if(var2 < var13) {
               var1 += var15 * (var13 - var2);
               var2 = var13;
            }

            if(var4 >= var14) {
               var4 = var14 - 1;
            }

            var16 = var5 >>> 24;
            if(var6 != 0 && (1 != var6 || 255 != var16)) {
               if(1 == var6) {
                  var5 = (var16 << 24) + (var16 * (var5 & '\uff00') >> 8 & '\uff00') + ((var5 & 16711935) * var16 >> 8 & 16711935);

                  for(var17 = 256 - var16; var2 <= var4; ++var2) {
                     var18 = var1 >> 16;
                     var19 = var2 - var9;
                     var20 = var8 + var11[var19];
                     if(var18 >= this.targetX * -346770183 && var18 < this.targetY * 1163141991 && var18 >= var20 && var18 < var20 + var12[var19]) {
                        var21 = var18 + var2 * 1176497263 * this.renderWidth;
                        var22 = this.renderArray[var21];
                        var22 = ((var22 & 16711935) * var17 >> 8 & 16711935) + (var17 * (var22 & '\uff00') >> 8 & '\uff00');
                        this.renderArray[var18 + var2 * this.renderWidth * 1176497263] = var22 + var5;
                     }

                     var1 += var15;
                  }
               } else {
                  if(2 != var6) {
                     throw new IllegalArgumentException();
                  }

                  while(var2 <= var4) {
                     var17 = var1 >> 16;
                     var18 = var2 - var9;
                     var19 = var8 + var11[var18];
                     if(var17 >= -346770183 * this.targetX && var17 < this.targetY * 1163141991 && var17 >= var19 && var17 < var19 + var12[var18]) {
                        var20 = var17 + this.renderWidth * 1176497263 * var2;
                        var21 = this.renderArray[var20];
                        var22 = var21 + var5;
                        var23 = (var21 & 16711935) + (var5 & 16711935);
                        var21 = (var22 - var23 & 65536) + (var23 & 16777472);
                        this.renderArray[var20] = var22 - var21 | var21 - (var21 >>> 8);
                     }

                     var1 += var15;
                     ++var2;
                  }
               }
            } else {
               while(var2 <= var4) {
                  var17 = var1 >> 16;
                  var18 = var2 - var9;
                  var19 = var11[var18] + var8;
                  if(var17 >= -346770183 * this.targetX && var17 < 1163141991 * this.targetY && var17 >= var19 && var17 < var19 + var12[var18]) {
                     this.renderArray[this.renderWidth * 1176497263 * var2 + var17] = var5;
                  }

                  var1 += var15;
                  ++var2;
               }
            }
         }

      }
   }

   public void method1974(int var1, int var2, int var3, int var4, int var5, int var6, Class1024 var7, int var8, int var9, int var10, int var11, int var12) {
      if(null != this.renderArray) {
         Class1024_Sub3 var13 = (Class1024_Sub3)var7;
         int[] var14 = var13.anIntArray_10982;
         int[] var15 = var13.anIntArray_10981;
         int var16 = this.targetWidth * 759884099 > var9?this.targetWidth * 759884099:var9;
         int var17 = this.targetHeight * 108427145 < var9 + var14.length?this.targetHeight * 108427145:var14.length + var9;
         var12 <<= 8;
         var10 <<= 8;
         var11 <<= 8;
         int var18 = var10 + var11;
         var12 %= var18;
         var3 -= var1;
         var4 -= var2;
         int var19;
         int var20;
         if(var4 + var3 < 0) {
            var19 = (int)(Math.sqrt((double)(var3 * var3 + var4 * var4)) * 256.0D);
            var20 = var19 % var18;
            var12 = var10 + var18 - var12 - var20;
            var12 %= var18;
            if(var12 < 0) {
               var12 += var18;
            }

            var1 += var3;
            var3 = -var3;
            var2 += var4;
            var4 = -var4;
         }

         int var21;
         int var23;
         int var22;
         int var25;
         int var24;
         int var27;
         int var26;
         if(var3 > var4) {
            var2 <<= 16;
            var2 += '\u8000';
            var4 <<= 16;
            var19 = (int)Math.floor(0.5D + (double)var4 / (double)var3);
            var3 += var1;
            var20 = var5 >>> 24;
            var21 = (int)Math.sqrt((double)((var19 >> 8) * (var19 >> 8) + 65536));
            if(0 != var6 && (1 != var6 || var20 != 255)) {
               if(1 == var6) {
                  var5 = ((var5 & 16711935) * var20 >> 8 & 16711935) + (var20 * (var5 & '\uff00') >> 8 & '\uff00') + (var20 << 24);

                  for(var22 = 256 - var20; var1 <= var3; var12 %= var18) {
                     var23 = var2 >> 16;
                     var24 = var23 - var9;
                     if(var1 >= -346770183 * this.targetX && var1 < this.targetY * 1163141991 && var23 >= var16 && var23 < var17 && var12 < var10) {
                        var25 = var8 + var14[var24];
                        if(var1 >= var25 && var1 < var25 + var15[var24]) {
                           var26 = 1176497263 * this.renderWidth * var23 + var1;
                           var27 = this.renderArray[var26];
                           var27 = ((var27 & 16711935) * var22 >> 8 & 16711935) + ((var27 & '\uff00') * var22 >> 8 & '\uff00');
                           this.renderArray[var26] = var27 + var5;
                        }
                     }

                     var2 += var19;
                     ++var1;
                     var12 += var21;
                  }
               } else {
                  if(2 != var6) {
                     throw new IllegalArgumentException();
                  }

                  while(var1 <= var3) {
                     var22 = var2 >> 16;
                     var23 = var22 - var9;
                     if(var1 >= -346770183 * this.targetX && var1 < 1163141991 * this.targetY && var22 >= var16 && var22 < var17 && var12 < var10) {
                        var24 = var14[var23] + var8;
                        if(var1 >= var24 && var1 < var24 + var15[var23]) {
                           var25 = this.renderWidth * 1176497263 * var22 + var1;
                           var26 = this.renderArray[var25];
                           var27 = var26 + var5;
                           int var28 = (var26 & 16711935) + (var5 & 16711935);
                           var26 = (var28 & 16777472) + (var27 - var28 & 65536);
                           this.renderArray[var25] = var27 - var26 | var26 - (var26 >>> 8);
                        }
                     }

                     var2 += var19;
                     ++var1;
                     var12 += var21;
                     var12 %= var18;
                  }
               }
            } else {
               while(var1 <= var3) {
                  var22 = var2 >> 16;
                  var23 = var22 - var9;
                  if(var1 >= this.targetX * -346770183 && var1 < this.targetY * 1163141991 && var22 >= var16 && var22 < var17 && var12 < var10) {
                     var24 = var14[var23] + var8;
                     if(var1 >= var24 && var1 < var15[var23] + var24) {
                        this.renderArray[this.renderWidth * 1176497263 * var22 + var1] = var5;
                     }
                  }

                  var2 += var19;
                  ++var1;
                  var12 += var21;
                  var12 %= var18;
               }
            }
         } else {
            var1 <<= 16;
            var1 += '\u8000';
            var3 <<= 16;
            var19 = (int)Math.floor(0.5D + (double)var3 / (double)var4);
            var20 = (int)Math.sqrt((double)(65536 + (var19 >> 8) * (var19 >> 8)));
            var4 += var2;
            var21 = var5 >>> 24;
            if(var6 != 0 && (1 != var6 || 255 != var21)) {
               if(var6 == 1) {
                  var5 = ((var5 & '\uff00') * var21 >> 8 & '\uff00') + (var21 * (var5 & 16711935) >> 8 & 16711935) + (var21 << 24);

                  for(var22 = 256 - var21; var2 <= var4; var12 %= var18) {
                     var23 = var1 >> 16;
                     var24 = var2 - var9;
                     if(var2 >= var16 && var2 < var17 && var23 >= -346770183 * this.targetX && var23 < 1163141991 * this.targetY && var12 < var10 && var23 >= var14[var24] + var8 && var23 < var15[var24] + var14[var24] + var8) {
                        var25 = var23 + 1176497263 * this.renderWidth * var2;
                        var26 = this.renderArray[var25];
                        var26 = ((var26 & 16711935) * var22 >> 8 & 16711935) + ((var26 & '\uff00') * var22 >> 8 & '\uff00');
                        this.renderArray[var2 * this.renderWidth * 1176497263 + var23] = var5 + var26;
                     }

                     var1 += var19;
                     ++var2;
                     var12 += var20;
                  }
               } else {
                  if(2 != var6) {
                     throw new IllegalArgumentException();
                  }

                  while(var2 <= var4) {
                     var22 = var1 >> 16;
                     var23 = var2 - var9;
                     if(var2 >= var16 && var2 < var17 && var22 >= this.targetX * -346770183 && var22 < this.targetY * 1163141991 && var12 < var10 && var22 >= var14[var23] + var8 && var22 < var8 + var14[var23] + var15[var23]) {
                        var24 = var2 * 1176497263 * this.renderWidth + var22;
                        var25 = this.renderArray[var24];
                        var26 = var5 + var25;
                        var27 = (var25 & 16711935) + (var5 & 16711935);
                        var25 = (var27 & 16777472) + (var26 - var27 & 65536);
                        this.renderArray[var24] = var26 - var25 | var25 - (var25 >>> 8);
                     }

                     var1 += var19;
                     ++var2;
                     var12 += var20;
                     var12 %= var18;
                  }
               }
            } else {
               while(var2 <= var4) {
                  var22 = var1 >> 16;
                  var23 = var2 - var9;
                  if(var2 >= var16 && var2 < var17 && var22 >= this.targetX * -346770183 && var22 < 1163141991 * this.targetY && var12 < var10 && var22 >= var14[var23] + var8 && var22 < var14[var23] + var8 + var15[var23]) {
                     this.renderArray[var22 + var2 * this.renderWidth * 1176497263] = var5;
                  }

                  var1 += var19;
                  ++var2;
                  var12 += var20;
                  var12 %= var18;
               }
            }
         }

      }
   }

   public void method1986(Class240_Sub51 var1) {}

   public Sprite method1929(int var1, int var2, boolean var3, boolean var4) {
      return (Sprite)(var3?new Class170_Sub3_Sub1(this, var1, var2):new SoftwareSprite_Sub1(this, var1, var2));
   }

   public Sprite method1930(int[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      boolean var7 = false;
      int var8 = var2;

      for(int var9 = 0; var9 < var5; ++var9) {
         for(int var10 = 0; var10 < var4; ++var10) {
            int var11 = var1[var8++] >>> 24;
            if(0 != var11 && 255 != var11) {
               var7 = true;
               return (Sprite)(var7?new Class170_Sub3_Sub1(this, var1, var2, var3, var4, var5, var6):new SoftwareSprite_Sub1(this, var1, var2, var3, var4, var5, var6));
            }
         }
      }

      return (Sprite)(var7?new Class170_Sub3_Sub1(this, var1, var2, var3, var4, var5, var6):new SoftwareSprite_Sub1(this, var1, var2, var3, var4, var5, var6));
   }

   public Sprite loadSprite(AbstractImageData var1, boolean var2) {
      int var3 = var1.getWidth();
      int var4 = var1.getHeight();
      Object var11;
      if(var2 && !var1.method1376() && var1.method1364()) {
         ImageData var12 = (ImageData)var1;
         int[] var6 = new int[var12.anIntArray_10491.length];
         byte[] var7 = new byte[var4 * var3];

         int var8;
         for(var8 = 0; var8 < var4; ++var8) {
            int var9 = var8 * var3;

            for(int var10 = 0; var10 < var3; ++var10) {
               var7[var9 + var10] = var12.data[var10 + var9];
            }
         }

         for(var8 = 0; var8 < var12.anIntArray_10491.length; ++var8) {
            var6[var8] = var12.anIntArray_10491[var8];
         }

         var11 = new Class170_Sub3_Sub2(this, var7, var6, var3, var4);
      } else {
         int[] var5 = var1.getPixelData(false);
         if(var1.method1376()) {
            var11 = new Class170_Sub3_Sub1(this, var5, var3, var4);
         } else {
            var11 = new SoftwareSprite_Sub1(this, var5, var3, var4);
         }
      }

      ((Sprite)var11).setDimensions(var1.method1368(), var1.method1366(), var1.method1379(), var1.method1367());
      return (Sprite)var11;
   }

   public Class1024 method1910(int var1, int var2, int[] var3, int[] var4) {
      return new Class1024_Sub3(var1, var2, var3, var4);
   }

   public void method1934(int var1, Class1024 var2, int var3, int var4) {
      if(this.renderArray != null) {
         Class1024_Sub3 var5 = (Class1024_Sub3)var2;
         int[] var6 = var5.anIntArray_10982;
         int[] var7 = var5.anIntArray_10981;
         int var8;
         if(this.targetHeight * 108427145 < var6.length + var4) {
            var8 = 108427145 * this.targetHeight - var4;
         } else {
            var8 = var6.length;
         }

         int var9;
         if(759884099 * this.targetWidth > var4) {
            var9 = this.targetWidth * 759884099 - var4;
            var4 = this.targetWidth * 759884099;
         } else {
            var9 = 0;
         }

         if(var8 - var9 > 0) {
            int var10 = 1176497263 * this.renderWidth * var4;

            for(int var11 = var9; var11 < var8; ++var11) {
               int var12 = var6[var11] + var3;
               int var13 = var7[var11];
               if(-346770183 * this.targetX > var12) {
                  var13 -= this.targetX * -346770183 - var12;
                  var12 = -346770183 * this.targetX;
               }

               if(1163141991 * this.targetY < var13 + var12) {
                  var13 = 1163141991 * this.targetY - var12;
               }

               var12 += var10;

               for(int var14 = -var13; var14 < 0; ++var14) {
                  this.renderArray[var12++] = var1;
               }

               var10 += this.renderWidth * 1176497263;
            }

         }
      }
   }

   int method6776(int var1) {
      return this.aClass163_2802.method1996(var1, (byte)2).anInt_3112 * -1446355517;
   }

   public void method1938(int var1) {
      Class165_Sub3.anInt_10997 = var1;
      Class165_Sub3.anInt_11011 = var1;
      if(367589431 * this.anInt_10187 > 1) {
         throw new IllegalStateException();
      } else {
         this.method6786(367589431 * this.anInt_10187);
         this.method6785(0);
      }
   }

   public Model createModel(ModelData var1, int var2, int var3, int var4, int var5) {
      return new Class165_Sub3(this, var1, var2, var4, var5, var3);
   }

   public Plane createPlane(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7) {
      return new SoftwarePlane(this, var6, var7, var1, var2, var3, var4, var5);
   }

   public ArrayViewport method1936() {
      Class210 var1 = this.method6787(Thread.currentThread());
      return var1.anArrayViewport_3622;
   }

   public Viewport method1979() {
      Class210 var1 = this.method6787(Thread.currentThread());
      return var1.aViewport_3615;
   }

   public int method1994() {
      return 0;
   }

   public Class240_Sub53 method1950(int var1, int var2, int var3, int var4, int var5, float var6) {
      return null;
   }

   public void method1958(int var1, Class105 var2) {
      Class210 var3 = this.method6787(Thread.currentThread());
      var3.anInt_3611 = var1 * -255043327;
      var3.anInt_3616 = var2.anInt_1982 * 550893745;
      var3.anInt_3651 = -347643315 * var2.anInt_1981;
   }

   void method6785(int var1) {
      this.aClass210Array_10155[var1].method2651(Thread.currentThread(), (byte)-93);
   }

   void method6786(int var1) {
      this.anInt_10187 = var1 * 151010695;
      this.aClass210Array_10155 = new Class210[this.anInt_10187 * 367589431];

      for(int var2 = 0; var2 < 367589431 * this.anInt_10187; ++var2) {
         this.aClass210Array_10155[var2] = new Class210(this);
      }

   }

   Class210 method6787(Runnable var1) {
      for(int var2 = 0; var2 < 367589431 * this.anInt_10187; ++var2) {
         if(var1 == this.aClass210Array_10155[var2].aRunnable_3631) {
            return this.aClass210Array_10155[var2];
         }
      }

      return null;
   }

   public void method1944(Class167 var1) {
      this.method6822(this.renderArray != null, null != this.aFloatArray_10159, false, var1);
   }

   public void method1961(boolean var1) {}

   void method6790(boolean var1, boolean var2, boolean var3, Class231_Sub2_Sub1 var4, int var5, int var6, float var7, int var8) {
      int var9 = var4.anInt_1806;
      int var10 = var8;
      var8 <<= 1;
      if(-1 == var9) {
         this.method6792(var2, var5, var6, var7, var10, var4.anInt_1808, 1);
      } else {
         if(var9 != this.anInt_10174 * -1326456387) {
            Sprite var11 = (Sprite)this.aClass627_10190.getObject((long)var9);
            if(null == var11) {
               Class183 var12 = this.aClass163_2802.method1996(var9, (byte)2);
               int[] var13 = this.method6736(var9, -534969509 * var12.anInt_3146);
               if(var13 == null) {
                  return;
               }

               int var14 = -1446355517 * var12.anInt_3112;
               var11 = this.defineSprite(var13, 0, var14, var14, var14);
               this.aClass627_10190.insert(var11, (long)var9);
            }

            this.anInt_10174 = var9 * -1035116139;
            this.aClass170_10191 = var11;
         }

         ++var8;
         ((SoftwareSprite)this.aClass170_10191).method7554(var1, var2, var3, var5 - var10, var6 - var10, var7, var8, var8, 0, var4.anInt_1808, 1, 1, false);
      }

   }

   public void method1967() {
      this.targetX = 0;
      this.targetWidth = 0;
      this.targetY = 1534300601 * this.renderWidth;
      this.targetHeight = this.renderHeight * -844822553;
      this.method6827();
   }

   void method6792(boolean var1, int var2, int var3, float var4, int var5, int var6, int var7) {
      if(null != this.renderArray) {
         if(var5 < 0) {
            var5 = -var5;
         }

         int var8 = var3 - var5;
         if(var8 < this.targetWidth * 759884099) {
            var8 = 759884099 * this.targetWidth;
         }

         int var9 = var5 + var3 + 1;
         if(var9 > this.targetHeight * 108427145) {
            var9 = this.targetHeight * 108427145;
         }

         int var10 = var8;
         int var11 = var5 * var5;
         int var12 = 0;
         int var13 = var3 - var8;
         int var14 = var13 * var13;
         int var15 = var14 - var13;
         if(var3 > var9) {
            var3 = var9;
         }

         int var16 = var6 >>> 24;
         int var17;
         int var19;
         int var18;
         int var20;
         if(0 != var7 && (1 != var7 || 255 != var16)) {
            int var21;
            int var22;
            if(var7 == 1) {
               var6 = (var16 << 24) + (var16 * (var6 & 16711935) >> 8 & 16711935) + ((var6 & '\uff00') * var16 >> 8 & '\uff00');

               for(var17 = 256 - var16; var10 < var3; var15 -= var13 + var13) {
                  while(var15 <= var11 || var14 <= var11) {
                     var14 += var12 + var12;
                     var15 += var12++ + var12;
                  }

                  var18 = var2 - var12 + 1;
                  if(var18 < this.targetX * -346770183) {
                     var18 = -346770183 * this.targetX;
                  }

                  var19 = var12 + var2;
                  if(var19 > 1163141991 * this.targetY) {
                     var19 = 1163141991 * this.targetY;
                  }

                  var20 = var18 + var10 * 1176497263 * this.renderWidth;

                  for(var21 = var18; var21 < var19; ++var21) {
                     if(!var1 || var4 < this.aFloatArray_10159[var20]) {
                        var22 = this.renderArray[var20];
                        var22 = (var17 * (var22 & '\uff00') >> 8 & '\uff00') + ((var22 & 16711935) * var17 >> 8 & 16711935);
                        this.renderArray[var20] = var22 + var6;
                     }

                     ++var20;
                  }

                  ++var10;
                  var14 -= var13-- + var13;
               }

               var12 = var5;
               var13 = -var13;
               var15 = var11 + var13 * var13;
               var14 = var15 - var5;

               for(var15 -= var13; var10 < var9; var14 += var13++ + var13) {
                  while(var15 > var11 && var14 > var11) {
                     var15 -= var12-- + var12;
                     var14 -= var12 + var12;
                  }

                  var18 = var2 - var12;
                  if(var18 < this.targetX * -346770183) {
                     var18 = this.targetX * -346770183;
                  }

                  var19 = var2 + var12;
                  if(var19 > this.targetY * 1163141991 - 1) {
                     var19 = this.targetY * 1163141991 - 1;
                  }

                  var20 = 1176497263 * this.renderWidth * var10 + var18;

                  for(var21 = var18; var21 <= var19; ++var21) {
                     if(!var1 || var4 < this.aFloatArray_10159[var20]) {
                        var22 = this.renderArray[var20];
                        var22 = (var17 * (var22 & 16711935) >> 8 & 16711935) + (var17 * (var22 & '\uff00') >> 8 & '\uff00');
                        this.renderArray[var20] = var22 + var6;
                     }

                     ++var20;
                  }

                  ++var10;
                  var15 += var13 + var13;
               }
            } else {
               if(2 != var7) {
                  throw new IllegalArgumentException();
               }

               int var23;
               while(var10 < var3) {
                  while(var15 <= var11 || var14 <= var11) {
                     var14 += var12 + var12;
                     var15 += var12++ + var12;
                  }

                  var17 = var2 - var12 + 1;
                  if(var17 < this.targetX * -346770183) {
                     var17 = this.targetX * -346770183;
                  }

                  var18 = var12 + var2;
                  if(var18 > 1163141991 * this.targetY) {
                     var18 = 1163141991 * this.targetY;
                  }

                  var19 = var17 + var10 * this.renderWidth * 1176497263;

                  for(var20 = var17; var20 < var18; ++var20) {
                     if(!var1 || var4 < this.aFloatArray_10159[var19]) {
                        var21 = this.renderArray[var19];
                        var22 = var21 + var6;
                        var23 = (var21 & 16711935) + (var6 & 16711935);
                        var21 = (var22 - var23 & 65536) + (var23 & 16777472);
                        this.renderArray[var19] = var22 - var21 | var21 - (var21 >>> 8);
                     }

                     ++var19;
                  }

                  ++var10;
                  var14 -= var13-- + var13;
                  var15 -= var13 + var13;
               }

               var12 = var5;
               var13 = -var13;
               var15 = var13 * var13 + var11;
               var14 = var15 - var5;

               for(var15 -= var13; var10 < var9; var14 += var13++ + var13) {
                  while(var15 > var11 && var14 > var11) {
                     var15 -= var12-- + var12;
                     var14 -= var12 + var12;
                  }

                  var17 = var2 - var12;
                  if(var17 < -346770183 * this.targetX) {
                     var17 = this.targetX * -346770183;
                  }

                  var18 = var12 + var2;
                  if(var18 > 1163141991 * this.targetY - 1) {
                     var18 = this.targetY * 1163141991 - 1;
                  }

                  var19 = var10 * 1176497263 * this.renderWidth + var17;

                  for(var20 = var17; var20 <= var18; ++var20) {
                     if(!var1 || var4 < this.aFloatArray_10159[var19]) {
                        var21 = this.renderArray[var19];
                        var22 = var21 + var6;
                        var23 = (var21 & 16711935) + (var6 & 16711935);
                        var21 = (var23 & 16777472) + (var22 - var23 & 65536);
                        this.renderArray[var19] = var22 - var21 | var21 - (var21 >>> 8);
                     }

                     ++var19;
                  }

                  ++var10;
                  var15 += var13 + var13;
               }
            }
         } else {
            while(var10 < var3) {
               while(var15 <= var11 || var14 <= var11) {
                  var14 += var12 + var12;
                  var15 += var12++ + var12;
               }

               var17 = 1 + (var2 - var12);
               if(var17 < this.targetX * -346770183) {
                  var17 = -346770183 * this.targetX;
               }

               var18 = var2 + var12;
               if(var18 > 1163141991 * this.targetY) {
                  var18 = 1163141991 * this.targetY;
               }

               var19 = var17 + var10 * 1176497263 * this.renderWidth;

               for(var20 = var17; var20 < var18; ++var20) {
                  if(!var1 || var4 < this.aFloatArray_10159[var19]) {
                     this.renderArray[var19] = var6;
                  }

                  ++var19;
               }

               ++var10;
               var14 -= var13-- + var13;
               var15 -= var13 + var13;
            }

            var12 = var5;
            var13 = var10 - var3;
            var15 = var11 + var13 * var13;
            var14 = var15 - var5;

            for(var15 -= var13; var10 < var9; var14 += var13++ + var13) {
               while(var15 > var11 && var14 > var11) {
                  var15 -= var12-- + var12;
                  var14 -= var12 + var12;
               }

               var17 = var2 - var12;
               if(var17 < this.targetX * -346770183) {
                  var17 = this.targetX * -346770183;
               }

               var18 = var12 + var2;
               if(var18 > this.targetY * 1163141991 - 1) {
                  var18 = 1163141991 * this.targetY - 1;
               }

               var19 = 1176497263 * this.renderWidth * var10 + var17;

               for(var20 = var17; var20 <= var18; ++var20) {
                  if(!var1 || var4 < this.aFloatArray_10159[var19]) {
                     this.renderArray[var19] = var6;
                  }

                  ++var19;
               }

               ++var10;
               var15 += var13 + var13;
            }
         }

      }
   }

   public boolean method1891() {
      return false;
   }

   public void method1946(ArrayViewport var1) {
      this.anArrayViewport_10184.replaceWith(var1);
      this.method6764();
   }

   public ArrayViewport method1984() {
      return new ArrayViewport(this.anArrayViewport_10184);
   }

   public void method1993(int var1, Class240_Sub53[] var2) {}

   public void method1948(int var1) {}

   public Class177 method1952(int var1) {
      return null;
   }

   public FontRenderer method1935(RSFont var1, ImageData[] var2, boolean var3) {
      int[] var4 = new int[var2.length];
      int[] var5 = new int[var2.length];
      boolean var6 = false;

      for(int var7 = 0; var7 < var2.length; ++var7) {
         var4[var7] = var2[var7].getWidth();
         var5[var7] = var2[var7].getHeight();
         if(var2[var7].method1376()) {
            var6 = true;
         }
      }

      if(var3) {
         if(var6) {
            return new FontRenderer_Sub3(this, var1, var2, var4, var5);
         } else {
            return new FontRenderer_Sub4(this, var1, var2, var4, var5);
         }
      } else if(var6) {
         throw new IllegalArgumentException("");
      } else {
         return new FontRenderer_Sub1(this, var1, var2, var4, var5);
      }
   }

   public void method1990() {}

   public boolean method1989() {
      return false;
   }

   void method1955(float var1, float var2, float var3, float var4, float var5, float var6) {}

   public void method1973() {}

   public boolean method1953() {
      return false;
   }

   public void method1981() {
      for(int var1 = 0; var1 < this.aClass210Array_10155.length; ++var1) {
         this.aClass210Array_10155[var1].anInt_3616 = -1459180887 * this.aClass210Array_10155[var1].anInt_3617;
         this.aClass210Array_10155[var1].aBoolean_3618 = false;
      }

   }

   public void method1921(int var1, int var2, float var3, int var4, int var5, float var6, int var7, int var8, float var9, int var10, int var11, int var12, int var13) {
      boolean var14 = null != this.renderArray;
      boolean var15 = this.aFloatArray_10159 != null;
      if(var14 || var15) {
         Class210 var16 = this.method6787(Thread.currentThread());
         Class202 var17 = var16.aClass202_3630;
         var17.aBoolean_3475 = false;
         var1 -= this.targetX * -346770183;
         var4 -= -346770183 * this.targetX;
         var7 -= this.targetX * -346770183;
         var2 -= 759884099 * this.targetWidth;
         var5 -= this.targetWidth * 759884099;
         var8 -= 759884099 * this.targetWidth;
         var17.aBoolean_3481 = var1 < 0 || var1 > var17.anInt_3487 || var4 < 0 || var4 > var17.anInt_3487 || var7 < 0 || var7 > var17.anInt_3487;
         int var18 = var10 >>> 24;
         if(0 != var13 && (var13 != 1 || 255 != var18)) {
            if(var13 == 1) {
               var17.anInt_3509 = 255 - var18;
               var17.aBoolean_3476 = false;
               var17.method2567(var14, var15, false, (float)var2, (float)var5, (float)var8, (float)var1, (float)var4, (float)var7, var3, var6, var9, var10, var11, var12);
            } else {
               if(var13 != 2) {
                  throw new IllegalArgumentException();
               }

               var17.anInt_3509 = 128;
               var17.aBoolean_3476 = true;
               var17.method2567(var14, var15, false, (float)var2, (float)var5, (float)var8, (float)var1, (float)var4, (float)var7, var3, var6, var9, var10, var11, var12);
            }
         } else {
            var17.anInt_3509 = 0;
            var17.aBoolean_3476 = false;
            var17.method2567(var14, var15, false, (float)var2, (float)var5, (float)var8, (float)var1, (float)var4, (float)var7, var3, var6, var9, var10, var11, var12);
         }

         var17.aBoolean_3475 = true;
      }
   }

   public void getScreenPosHidden(float var1, float var2, float var3, float[] var4) {
      float var5 = this.renderData.data[11] * var3 + this.renderData.data[15] + this.renderData.data[3] * var1 + var2 * this.renderData.data[7];
      float var6 = var3 * this.renderData.data[8] + this.renderData.data[4] * var2 + this.renderData.data[0] * var1 + this.renderData.data[12];
      float var7 = this.renderData.data[9] * var3 + this.renderData.data[5] * var2 + this.renderData.data[13] + this.renderData.data[1] * var1;
      float var8 = this.anArrayViewport_10173.data[6] * var2 + var1 * this.anArrayViewport_10173.data[2] + this.anArrayViewport_10173.data[14] + this.anArrayViewport_10173.data[10] * var3;
      var4[0] = this.renderX + var6 * this.scaleX / var5;
      var4[1] = this.renderY + this.scaleY * var7 / var5;
      var4[2] = var8;
   }

   public void getScreenPosVisible(float var1, float var2, float var3, float[] var4) {
      float var5 = this.renderData.data[14] + var1 * this.renderData.data[2] + var2 * this.renderData.data[6] + var3 * this.renderData.data[10];
      float var6 = var3 * this.renderData.data[11] + this.renderData.data[15] + var1 * this.renderData.data[3] + this.renderData.data[7] * var2;
      if(var5 >= -var6 && var5 <= var6) {
         float var7 = var1 * this.renderData.data[0] + this.renderData.data[12] + var2 * this.renderData.data[4] + this.renderData.data[8] * var3;
         if(var7 >= -var6 && var7 <= var6) {
            float var8 = var3 * this.renderData.data[9] + var2 * this.renderData.data[5] + this.renderData.data[13] + var1 * this.renderData.data[1];
            if(var8 >= -var6 && var8 <= var6) {
               float var9 = this.anArrayViewport_10173.data[14] + this.anArrayViewport_10173.data[2] * var1 + this.anArrayViewport_10173.data[6] * var2 + var3 * this.anArrayViewport_10173.data[10];
               var4[0] = var7 * this.scaleX / var6 + this.renderX;
               var4[1] = this.renderY + var8 * this.scaleY / var6;
               var4[2] = var9;
            } else {
               var4[2] = Float.NaN;
               var4[1] = Float.NaN;
               var4[0] = Float.NaN;
            }
         } else {
            var4[2] = Float.NaN;
            var4[1] = Float.NaN;
            var4[0] = Float.NaN;
         }
      } else {
         var4[2] = Float.NaN;
         var4[1] = Float.NaN;
         var4[0] = Float.NaN;
      }
   }

   public Class174_Sub1 method1890() {
      return new Class174_Sub1_Sub3(this);
   }

   Class101 method6810(int var1, int var2) {
      return new Class204(var1, var2);
   }

   public Class99 method1918(int var1, int var2) {
      return new Class203(var1, var2);
   }

   public void method1949(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.aClass210Array_10155.length; ++var4) {
         Class210 var5 = this.aClass210Array_10155[var4];
         var5.anInt_3616 = (var1 & 16777215) * 1995250543;
         int var6 = -2058706033 * var5.anInt_3616 >>> 16 & 255;
         if(var6 < 2) {
            var6 = 2;
         }

         int var7 = var5.anInt_3616 * -2058706033 >> 8 & 255;
         if(var7 < 2) {
            var7 = 2;
         }

         int var8 = var5.anInt_3616 * -2058706033 & 255;
         if(var8 < 2) {
            var8 = 2;
         }

         var5.anInt_3616 = 1995250543 * (var6 << 16 | var7 << 8 | var8);
         if(var2 < 0) {
            var5.aBoolean_3613 = false;
         } else {
            var5.aBoolean_3613 = true;
         }
      }

   }

   public int method1941(int var1, int var2) {
      return var1 | var2;
   }

   public void method1956(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(this.renderArray != null) {
         Class210 var8 = this.method6787(Thread.currentThread());
         Class202 var9 = var8.aClass202_3630;
         int var10 = var3 - var1;
         int var11 = var4 - var2;
         int var12 = var10 >= 0?var10:-var10;
         int var13 = var11 >= 0?var11:-var11;
         int var14 = var12;
         if(var12 < var13) {
            var14 = var13;
         }

         if(0 != var14) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var11 << 16) / var14;
            var10 += var15 >> 16;
            var11 += var16 >> 16;
            if(var16 <= var15) {
               var15 = -var15;
            } else {
               var16 = -var16;
            }

            int var17 = var16 * var6 >> 17;
            int var18 = 1 + var6 * var16 >> 17;
            int var19 = var6 * var15 >> 17;
            int var20 = 1 + var15 * var6 >> 17;
            var1 -= var9.method2559();
            var2 -= var9.method2570();
            int var21 = var17 + var1;
            int var22 = var1 - var18;
            int var23 = var10 + var1 - var18;
            int var24 = var17 + var10 + var1;
            int var25 = var2 + var19;
            int var26 = var2 - var20;
            int var27 = var11 + var2 - var20;
            int var28 = var2 + var11 + var19;
            if(var7 == 0) {
               var9.anInt_3509 = 0;
            } else {
               if(1 != var7) {
                  throw new IllegalArgumentException();
               }

               var9.anInt_3509 = 255 - (var5 >>> 24);
            }

            this.enableZBuffering(false);
            var9.aBoolean_3481 = var21 < 0 || var21 > var9.anInt_3487 || var22 < 0 || var22 > var9.anInt_3487 || var23 < 0 || var23 > var9.anInt_3487;
            var9.method2562(true, false, false, (float)var25, (float)var26, (float)var27, (float)var21, (float)var22, (float)var23, 100.0F, 100.0F, 100.0F, var5);
            var9.aBoolean_3481 = var21 < 0 || var21 > var9.anInt_3487 || var23 < 0 || var23 > var9.anInt_3487 || var24 < 0 || var24 > var9.anInt_3487;
            var9.method2562(true, false, false, (float)var25, (float)var27, (float)var28, (float)var21, (float)var23, (float)var24, 100.0F, 100.0F, 100.0F, var5);
            this.enableZBuffering(true);
         }
      }
   }

   public Class101 method1927(int var1, int var2, Class136 var3, Class87 var4, int var5) {
      return this.method6810(var1, var2);
   }

   public Class240_Sub51 method1926(int var1) {
      return null;
   }

   public Sprite method1932(int var1, int var2, int var3, int var4, boolean var5) {
      if(this.renderArray == null) {
         throw new IllegalStateException("");
      } else {
         int[] var6 = new int[var4 * var3];
         int var7 = var2 * 1176497263 * this.renderWidth + var1;
         int var8 = this.renderWidth * 1176497263 - var3;

         for(int var9 = 0; var9 < var4; ++var9) {
            int var10 = var9 * var3;

            for(int var11 = 0; var11 < var3; ++var11) {
               var6[var10 + var11] = this.renderArray[var7++];
            }

            var7 += var8;
         }

         if(var5) {
            return new Class170_Sub3_Sub1(this, var6, var3, var4);
         } else {
            return new SoftwareSprite_Sub1(this, var6, var3, var4);
         }
      }
   }

   SoftwareRenderer(Canvas var1, Class163 var2, Class96 var3, int var4, int var5) {
      this(var2, var3);

      try {
         this.addDrawingTarget(var1, var4, var5, (byte)39);
         this.method1982(var1, 1058931123);
      } catch (Throwable var7) {
         var7.printStackTrace();
         this.method1939(-1500363801);
         throw new RuntimeException("");
      }
   }

   public boolean supportsTexture() {
      return false;
   }

   public void cleanup(int var1) {
      int var2 = var1 - this.anInt_10157 * -1430746965;

      for(Class240_Sub45 var3 = (Class240_Sub45)this.aClass627_10161.method6672((byte)0); null != var3; var3 = (Class240_Sub45)this.aClass627_10161.method6674((byte)11)) {
         if(var3.aBoolean_7641) {
            var3.anInt_7643 += var2;
            int var4 = var3.anInt_7643 / 50;
            if(var4 > 0) {
               Class183 var5 = this.aClass163_2802.method1996(var3.anInt_7646, (byte)2);
               float var6 = (float)(-1446355517 * var5.anInt_3112);
               var3.method4974((int)(var6 * ((float)var5.aByte_3145 * ((float)var2 / 1000.0F) / 64.0F)), (int)(var6 * ((float)var2 / 1000.0F * (float)var5.aByte_3157 / 64.0F)));
               var3.anInt_7643 -= 50 * var4;
            }

            var3.aBoolean_7641 = false;
         }
      }

      this.anInt_10157 = var1 * 426717699;
      this.aClass627_10190.method6677(5, -2039425609);
      this.aClass627_10161.method6677(5, -1464640777);
   }

   boolean method6820() {
      return this.aBoolean_10164;
   }

   public int method1940(int var1, int var2) {
      var1 |= 133120;
      return var1 & var2 ^ var2;
   }

   void method6822(boolean var1, boolean var2, boolean var3, Class167 var4) {
      Class210 var5 = this.method6787(Thread.currentThread());

      for(Class231_Sub2_Sub1 var6 = (Class231_Sub2_Sub1)var4.aClass505_3024.method5861((byte)75); var6 != null; var6 = (Class231_Sub2_Sub1)var4.aClass505_3024.method5863(-2146129002)) {
         int var7 = var6.anInt_1809 >> 12;
         int var8 = var6.anInt_1807 >> 12;
         int var9 = var6.anInt_1811 >> 12;
         float var10 = (float)var9 * this.renderData.data[10] + this.renderData.data[2] * (float)var7 + this.renderData.data[6] * (float)var8 + this.renderData.data[14];
         float var11 = (float)var7 * this.renderData.data[3] + (float)var8 * this.renderData.data[7] + this.renderData.data[11] * (float)var9 + this.renderData.data[15];
         if(var10 >= -var11) {
            float var12 = this.aFloat_10186 + this.aFloat_10185 * var10 / var11;
            if(var10 <= var5.aFloat_3614) {
               float var13 = this.renderData.data[12] + this.renderData.data[4] * (float)var8 + (float)var7 * this.renderData.data[0] + this.renderData.data[8] * (float)var9;
               float var14 = this.renderData.data[13] + (float)var8 * this.renderData.data[5] + (float)var7 * this.renderData.data[1] + (float)var9 * this.renderData.data[9];
               if(var13 >= -var11 && var13 <= var11 && var14 >= -var11 && var14 <= var11) {
                  float var15 = (float)var6.anInt_1810 / 4096.0F;
                  float var16 = var13 + this.anArrayViewport_10184.data[0] * var15;
                  float var17 = this.anArrayViewport_10184.data[3] * var15 + var11;
                  float var18 = this.renderX + this.scaleX * var13 / var11;
                  float var19 = this.renderY + this.scaleY * var14 / var11;
                  float var20 = this.scaleX * var16 / var17 + this.renderX;
                  this.method6790(var1, var2, var3, var6, (int)var18, (int)var19, var12, (int)(var20 < var18?var18 - var20:var20 - var18));
               }
            }
         }
      }

   }

   public void method1991(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9) {
      if(this.renderArray != null) {
         if(var3 > 0 && var4 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (var8 << 16) / var3;
            int var13 = (var7.length / var8 << 16) / var4;
            int var14 = var1 + this.renderWidth * 1176497263 * var2;
            int var15 = 1176497263 * this.renderWidth - var3;
            if(var2 + var4 > 108427145 * this.targetHeight) {
               var4 -= var2 + var4 - this.targetHeight * 108427145;
            }

            int var16;
            if(var2 < 759884099 * this.targetWidth) {
               var16 = this.targetWidth * 759884099 - var2;
               var4 -= var16;
               var14 += this.renderWidth * 1176497263 * var16;
               var11 += var16 * var13;
            }

            if(var1 + var3 > 1163141991 * this.targetY) {
               var16 = var1 + var3 - 1163141991 * this.targetY;
               var3 -= var16;
               var15 += var16;
            }

            if(var1 < this.targetX * -346770183) {
               var16 = this.targetX * -346770183 - var1;
               var3 -= var16;
               var14 += var16;
               var10 += var12 * var16;
               var15 += var16;
            }

            var16 = var5 >>> 24;
            int var17 = var6 >>> 24;
            int var19;
            int var18;
            int var21;
            int var20;
            if(var9 != 0 && (var9 != 1 || var16 != 255 || 255 != var17)) {
               int var23;
               int var22;
               int var25;
               int var24;
               if(1 == var9) {
                  var18 = var10;

                  for(var19 = -var4; var19 < 0; ++var19) {
                     var20 = var8 * (var11 >> 16);

                     for(var21 = -var3; var21 < 0; ++var21) {
                        var22 = var5;
                        if(var7[(var10 >> 16) + var20] != 0) {
                           var22 = var6;
                        }

                        var23 = var22 >>> 24;
                        var24 = 255 - var23;
                        var25 = this.renderArray[var14];
                        this.renderArray[var14++] = (var23 * (var22 & 16711935) + (var25 & 16711935) * var24 & -16711936) + ((var25 & '\uff00') * var24 + var23 * (var22 & '\uff00') & 16711680) >> 8;
                        var10 += var12;
                     }

                     var11 += var13;
                     var10 = var18;
                     var14 += var15;
                  }
               } else {
                  if(var9 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var18 = var10;

                  for(var19 = -var4; var19 < 0; ++var19) {
                     var20 = (var11 >> 16) * var8;

                     for(var21 = -var3; var21 < 0; ++var21) {
                        var22 = var5;
                        if(var7[var20 + (var10 >> 16)] != 0) {
                           var22 = var6;
                        }

                        if(var22 != 0) {
                           var23 = this.renderArray[var14];
                           var24 = var22 + var23;
                           var25 = (var23 & 16711935) + (var22 & 16711935);
                           var23 = (var25 & 16777472) + (var24 - var25 & 65536);
                           this.renderArray[var14++] = var24 - var23 | var23 - (var23 >>> 8);
                        } else {
                           ++var14;
                        }

                        var10 += var12;
                     }

                     var11 += var13;
                     var10 = var18;
                     var14 += var15;
                  }
               }
            } else {
               var18 = var10;

               for(var19 = -var4; var19 < 0; ++var19) {
                  var20 = var8 * (var11 >> 16);

                  for(var21 = -var3; var21 < 0; ++var21) {
                     if(0 != var7[(var10 >> 16) + var20]) {
                        this.renderArray[var14++] = var6;
                     } else {
                        this.renderArray[var14++] = var5;
                     }

                     var10 += var12;
                  }

                  var11 += var13;
                  var10 = var18;
                  var14 += var15;
               }
            }

         }
      }
   }

   public void method1947(float var1) {
      this.anInt_10171 = 1309373987 * (int)(var1 * 65535.0F);
   }

   void method1937(int var1, int var2, int var3, int var4, int var5) {
      if(this.renderArray != null) {
         if(var3 < 0) {
            var3 = -var3;
         }

         int var6 = var2 - var3;
         if(var6 < this.targetWidth * 759884099) {
            var6 = 759884099 * this.targetWidth;
         }

         int var7 = var3 + var2 + 1;
         if(var7 > 108427145 * this.targetHeight) {
            var7 = 108427145 * this.targetHeight;
         }

         int var8 = var6;
         int var9 = var3 * var3;
         int var10 = 0;
         int var11 = var2 - var6;
         int var12 = var11 * var11;
         int var13 = var12 - var11;
         if(var2 > var7) {
            var2 = var7;
         }

         int var14 = var4 >>> 24;
         int var15;
         int var17;
         int var16;
         int var18;
         if(0 != var5 && (1 != var5 || 255 != var14)) {
            int var19;
            int var20;
            if(var5 == 1) {
               var4 = (var14 << 24) + (var14 * (var4 & '\uff00') >> 8 & '\uff00') + ((var4 & 16711935) * var14 >> 8 & 16711935);

               for(var15 = 256 - var14; var8 < var2; var13 -= var11 + var11) {
                  while(var13 <= var9 || var12 <= var9) {
                     var12 += var10 + var10;
                     var13 += var10++ + var10;
                  }

                  var16 = var1 - var10 + 1;
                  if(var16 < -346770183 * this.targetX) {
                     var16 = this.targetX * -346770183;
                  }

                  var17 = var10 + var1;
                  if(var17 > this.targetY * 1163141991) {
                     var17 = this.targetY * 1163141991;
                  }

                  var18 = var16 + 1176497263 * this.renderWidth * var8;

                  for(var19 = var16; var19 < var17; ++var19) {
                     var20 = this.renderArray[var18];
                     var20 = ((var20 & 16711935) * var15 >> 8 & 16711935) + ((var20 & '\uff00') * var15 >> 8 & '\uff00');
                     this.renderArray[var18++] = var4 + var20;
                  }

                  ++var8;
                  var12 -= var11-- + var11;
               }

               var10 = var3;
               var11 = -var11;
               var13 = var9 + var11 * var11;
               var12 = var13 - var3;

               for(var13 -= var11; var8 < var7; var12 += var11++ + var11) {
                  while(var13 > var9 && var12 > var9) {
                     var13 -= var10-- + var10;
                     var12 -= var10 + var10;
                  }

                  var16 = var1 - var10;
                  if(var16 < -346770183 * this.targetX) {
                     var16 = this.targetX * -346770183;
                  }

                  var17 = var10 + var1;
                  if(var17 > 1163141991 * this.targetY - 1) {
                     var17 = this.targetY * 1163141991 - 1;
                  }

                  var18 = var16 + 1176497263 * this.renderWidth * var8;

                  for(var19 = var16; var19 <= var17; ++var19) {
                     var20 = this.renderArray[var18];
                     var20 = ((var20 & '\uff00') * var15 >> 8 & '\uff00') + ((var20 & 16711935) * var15 >> 8 & 16711935);
                     this.renderArray[var18++] = var4 + var20;
                  }

                  ++var8;
                  var13 += var11 + var11;
               }
            } else {
               if(2 != var5) {
                  throw new IllegalArgumentException();
               }

               int var21;
               while(var8 < var2) {
                  while(var13 <= var9 || var12 <= var9) {
                     var12 += var10 + var10;
                     var13 += var10++ + var10;
                  }

                  var15 = var1 - var10 + 1;
                  if(var15 < this.targetX * -346770183) {
                     var15 = this.targetX * -346770183;
                  }

                  var16 = var1 + var10;
                  if(var16 > this.targetY * 1163141991) {
                     var16 = 1163141991 * this.targetY;
                  }

                  var17 = var15 + var8 * this.renderWidth * 1176497263;

                  for(var18 = var15; var18 < var16; ++var18) {
                     var19 = this.renderArray[var17];
                     var20 = var19 + var4;
                     var21 = (var4 & 16711935) + (var19 & 16711935);
                     var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                     this.renderArray[var17++] = var20 - var19 | var19 - (var19 >>> 8);
                  }

                  ++var8;
                  var12 -= var11-- + var11;
                  var13 -= var11 + var11;
               }

               var10 = var3;
               var11 = -var11;
               var13 = var11 * var11 + var9;
               var12 = var13 - var3;

               for(var13 -= var11; var8 < var7; var12 += var11++ + var11) {
                  while(var13 > var9 && var12 > var9) {
                     var13 -= var10-- + var10;
                     var12 -= var10 + var10;
                  }

                  var15 = var1 - var10;
                  if(var15 < -346770183 * this.targetX) {
                     var15 = this.targetX * -346770183;
                  }

                  var16 = var1 + var10;
                  if(var16 > this.targetY * 1163141991 - 1) {
                     var16 = 1163141991 * this.targetY - 1;
                  }

                  var17 = var15 + 1176497263 * this.renderWidth * var8;

                  for(var18 = var15; var18 <= var16; ++var18) {
                     var19 = this.renderArray[var17];
                     var20 = var19 + var4;
                     var21 = (var19 & 16711935) + (var4 & 16711935);
                     var19 = (var20 - var21 & 65536) + (var21 & 16777472);
                     this.renderArray[var17++] = var20 - var19 | var19 - (var19 >>> 8);
                  }

                  ++var8;
                  var13 += var11 + var11;
               }
            }
         } else {
            while(var8 < var2) {
               while(var13 <= var9 || var12 <= var9) {
                  var12 += var10 + var10;
                  var13 += var10++ + var10;
               }

               var15 = 1 + (var1 - var10);
               if(var15 < -346770183 * this.targetX) {
                  var15 = -346770183 * this.targetX;
               }

               var16 = var1 + var10;
               if(var16 > this.targetY * 1163141991) {
                  var16 = 1163141991 * this.targetY;
               }

               var17 = var8 * 1176497263 * this.renderWidth + var15;

               for(var18 = var15; var18 < var16; ++var18) {
                  this.renderArray[var17++] = var4;
               }

               ++var8;
               var12 -= var11-- + var11;
               var13 -= var11 + var11;
            }

            var10 = var3;
            var11 = var8 - var2;
            var13 = var11 * var11 + var9;
            var12 = var13 - var3;

            for(var13 -= var11; var8 < var7; var12 += var11++ + var11) {
               while(var13 > var9 && var12 > var9) {
                  var13 -= var10-- + var10;
                  var12 -= var10 + var10;
               }

               var15 = var1 - var10;
               if(var15 < this.targetX * -346770183) {
                  var15 = this.targetX * -346770183;
               }

               var16 = var1 + var10;
               if(var16 > 1163141991 * this.targetY - 1) {
                  var16 = this.targetY * 1163141991 - 1;
               }

               var17 = var15 + 1176497263 * this.renderWidth * var8;

               for(var18 = var15; var18 <= var16; ++var18) {
                  this.renderArray[var17++] = var4;
               }

               ++var8;
               var13 += var11 + var11;
            }
         }

      }
   }

   public boolean method1969() {
      return false;
   }

   void method6827() {
      int var1 = this.targetY * 1163141991 - this.targetX * -346770183;
      int var2 = 108427145 * this.targetHeight - 759884099 * this.targetWidth;
      float var3 = this.scaleX = (float)(473175037 * this.anInt_10179) / 2.0F;
      float var4 = this.scaleY = (float)(this.anInt_10180 * -660798627) / 2.0F;
      this.renderX = (float)(777032431 * this.anInt_10177) + var3;
      this.renderY = var4 + (float)(-511842633 * this.anInt_10162);

      int var5;
      for(var5 = 0; var5 < this.anInt_10187 * 367589431; ++var5) {
         Class210 var6 = this.aClass210Array_10155[var5];
         Class202 var7 = var6.aClass202_3630;
         var7.aFloat_3490 = var3;
         var7.aFloat_3484 = var4;
         var7.aFloat_3495 = this.renderX - (float)(-346770183 * this.targetX);
         var7.aFloat_3483 = this.renderY - (float)(this.targetWidth * 759884099);
         var7.anInt_3487 = var1;
         var7.anInt_3480 = var2;
      }

      var5 = 759884099 * this.targetWidth * 1176497263 * this.renderWidth + this.targetX * -346770183;

      for(int var8 = this.targetWidth * 759884099; var8 < 108427145 * this.targetHeight; ++var8) {
         for(int var9 = 0; var9 < 367589431 * this.anInt_10187; ++var9) {
            this.aClass210Array_10155[var9].aClass202_3630.anIntArray_3492[var8 - this.targetWidth * 759884099] = var5;
         }

         var5 += 1176497263 * this.renderWidth;
      }

   }

   public void setViewport(Viewport var1) {
      this.aViewport_10172 = var1;
      this.method6764();
   }

   boolean method6829(int var1, int var2) {
      return this.aClass96_2801.method1263(var1, Class610.aClass610_9945, 0.7F, var2, var2, true, (byte)19);
   }

   public Viewport getViewport() {
      return new Viewport(this.aViewport_10172);
   }

   public Class177 method1985(Class177 var1, Class177 var2, float var3, Class177 var4) {
      return null;
   }

   public int method1978(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      float var8 = (float)var3 * this.renderData.data[10] + this.renderData.data[2] * (float)var1 + this.renderData.data[14] + (float)var2 * this.renderData.data[6];
      float var9 = this.renderData.data[10] * (float)var6 + this.renderData.data[6] * (float)var5 + this.renderData.data[2] * (float)var4 + this.renderData.data[14];
      float var10 = this.renderData.data[7] * (float)var2 + (float)var1 * this.renderData.data[3] + this.renderData.data[15] + this.renderData.data[11] * (float)var3;
      float var11 = this.renderData.data[11] * (float)var6 + this.renderData.data[3] * (float)var4 + this.renderData.data[15] + (float)var5 * this.renderData.data[7];
      if(var8 < -var10 && var9 < -var11) {
         var7 |= 16;
      } else if(var8 > var10 && var9 > var11) {
         var7 |= 32;
      }

      float var12 = this.renderData.data[4] * (float)var2 + this.renderData.data[12] + this.renderData.data[0] * (float)var1 + this.renderData.data[8] * (float)var3;
      float var13 = (float)var6 * this.renderData.data[8] + (float)var5 * this.renderData.data[4] + this.renderData.data[12] + (float)var4 * this.renderData.data[0];
      if(var12 < -var10 && var13 < -var11) {
         var7 |= 1;
      }

      if(var12 > var10 && var13 > var11) {
         var7 |= 2;
      }

      float var14 = this.renderData.data[9] * (float)var3 + this.renderData.data[5] * (float)var2 + this.renderData.data[1] * (float)var1 + this.renderData.data[13];
      float var15 = (float)var4 * this.renderData.data[1] + this.renderData.data[13] + this.renderData.data[5] * (float)var5 + (float)var6 * this.renderData.data[9];
      if(var14 < -var10 && var15 < -var11) {
         var7 |= 4;
      }

      if(var14 > var10 && var15 > var11) {
         var7 |= 8;
      }

      return var7;
   }

   public void method1925(Class177 var1) {}

   public void method1907() {}

   public void method1945(int var1, float var2, float var3, float var4, float var5, float var6) {
      this.anInt_10169 = (int)(var2 * 65535.0F) * -1983448387;
      this.anInt_10170 = -173656113 * (int)(65535.0F * var3);
      float var7 = (float)Math.sqrt((double)(var5 * var5 + var4 * var4 + var6 * var6));
      this.anInt_10192 = (int)(var4 * 65535.0F / var7) * -317108339;
      this.anInt_10167 = 1618205187 * (int)(var5 * 65535.0F / var7);
      this.anInt_10188 = 1437880729 * (int)(var6 * 65535.0F / var7);
   }

   public int getHeap() {
      return 0;
   }

   public void method1887(int var1, int var2, int var3, int var4) {}

   public void method1920(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.method1922(var1, var2, var3, var5, var6);
      this.method1922(var1, var4 + var2 - 1, var3, var5, var6);
      this.method1951(var1, var2 + 1, var4 - 2, var5, var6);
      this.method1951(var1 + var3 - 1, var2 + 1, var4 - 2, var5, var6);
   }

   boolean method6839(int var1) {
      Class183 var2 = this.aClass163_2802.method1996(var1, (byte)2);
      return 0 != var2.aByte_3154 || var2.aByte_3111 != 0;
   }

   public void method1970(float var1, float var2) {
      this.aFloat_10185 = var2 - var1;
      this.aFloat_10186 = var2 + var1 - 1.0F;

      for(int var3 = 0; var3 < 367589431 * this.anInt_10187; ++var3) {
         Class210 var4 = this.aClass210Array_10155[var3];
         Class202 var5 = var4.aClass202_3630;
         var5.aFloat_3489 = this.aFloat_10185;
         var5.aFloat_3485 = this.aFloat_10186;
      }

   }

   boolean method6841(int var1) {
      Class183 var2 = this.aClass163_2802.method1996(var1, (byte)2);
      return this.method6829(-534969509 * var2.anInt_3146, -1446355517 * var2.anInt_3112);
   }

   public void method1895(int[] var1) {
      var1[0] = 1176497263 * this.renderWidth;
      var1[1] = -763913313 * this.renderHeight;
   }

   static Class240_Sub27 method6843(short var0) {
      return Class240_Sub27.anInt_7372 * -1472012959 == 0?new Class240_Sub27():Class240_Sub27.aClass240_Sub27Array_7374[(Class240_Sub27.anInt_7372 -= 1699907233) * -1472012959];
   }
}
