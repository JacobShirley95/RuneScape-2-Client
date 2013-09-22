
public class Class286 {

   static CacheDataUnpacker aCacheUnpacker_4796;
   final int anInt_4797;
   int anInt_4798;
   Class308 aClass308_4799;
   boolean aBoolean_4800;
   Class308[] aClass308Array_4801;
   int anInt_4802;
   int anInt_4803;
   final int anInt_4804;
   final int anInt_4805;
   final int anInt_4806;
   byte[] aByteArray_4807;
   Sprite aClass170_4808;
   int anInt_4809;
   Class308[] aClass308Array_4810;
   boolean aBoolean_4811 = true;
   Class266 aClass266_4812;
   int anInt_4813;
   Model aClass165_4814;
   int anInt_4815;
   int anInt_4816 = -453622409;
   Class286 aClass286_4817;
   int anInt_4818;
   static final int anInt_4819 = 512;
   int anInt_4820;
   static AbstractServerConnection aClass237_4821;
   public static Class592 aClass592_4822;
   static int anInt_4823;
   public static Renderer gameRenderer;


   void method3683(Renderer var1, int var2, int var3, int var4, int var5, int var6) {
      Viewport var7 = var1.getViewport();
      Viewport var8 = new Viewport();
      var8.setPos(0.0F, 0.0F, 0.0F);
      var8.method4630(0.0F, -1.0F, 0.0F, Class362.toRadians(-var3 & 16383));
      var8.method4630(-1.0F, 0.0F, 0.0F, Class362.toRadians(-var2 & 16383));
      var8.method4630(0.0F, 0.0F, -1.0F, Class362.toRadians(-var4 & 16383));
      var1.setViewport(var8);
      Viewport var9 = new Viewport();
      if(var5 != 8867051 * this.anInt_4803) {
         this.aClass165_4814.method2060((byte)var5, this.aByteArray_4807);
         this.anInt_4803 = -1743586365 * var5;
      }

      this.aClass165_4814.method2069(var9, (Class92)null, 0);
      var1.setViewport(var7);
   }

   public void method3684(int var1, int var2, byte var3) {
      if(!this.aBoolean_4800) {
         ;
      }

      this.anInt_4818 = (897767081 * this.anInt_4820 + var1 * (var2 - this.anInt_4820 * 897767081) / 255) * 1678553551;
   }

   public void method3685(int var1) {
      this.aBoolean_4800 = false;
      this.aClass286_4817 = null;
      this.anInt_4818 = 0;
   }

   public Class286(int var1, Class308[] var2, int var3, int var4, int var5, int var6, Class266 var7, int var8) {
      this.anInt_4804 = -115315203 * var4;
      this.anInt_4805 = 1213955353 * var5;
      this.anInt_4806 = -1428872537 * var6;
      this.anInt_4797 = var1 * 1025406605;
      this.aClass308Array_4810 = var2;
      this.aClass266_4812 = var7;
      if(var2 != null) {
         this.aClass308Array_4801 = new Class308[var2.length];
         this.aClass308_4799 = var3 >= 0?var2[var3]:null;
      } else {
         this.aClass308Array_4801 = null;
         this.aClass308_4799 = null;
      }

      this.anInt_4813 = var8 * 1319845205;
   }

   public boolean method3686(int var1) {
      return this.aBoolean_4800;
   }

   public Class286 method3687(int var1) {
      return this.aClass286_4817;
   }

   public boolean method3688(Renderer var1, int var2, int var3, byte var4) {
      if(this.anInt_4816 * -84026439 != var2) {
         this.anInt_4816 = var2 * 453622409;
         int var5 = Class234.method3016(var2, (byte)75);
         if(var5 > 512) {
            var5 = 512;
         }

         if(var5 <= 0) {
            var5 = 1;
         }

         if(-1986645603 * this.anInt_4798 != var5) {
            this.anInt_4798 = 1293737141 * var5;
            this.aClass170_4808 = null;
         }

         if(null != this.aClass308Array_4810) {
            this.anInt_4802 = 0;
            int[] var6 = new int[this.aClass308Array_4810.length];

            for(int var7 = 0; var7 < this.aClass308Array_4810.length; ++var7) {
               Class308 var8 = this.aClass308Array_4810[var7];
               if(var8.method3859(-1274226859 * this.anInt_4804, -1724346583 * this.anInt_4805, this.anInt_4806 * 438461719, this.anInt_4816 * -84026439)) {
                  var6[1954547861 * this.anInt_4802] = var8.anInt_6038;
                  this.aClass308Array_4801[(this.anInt_4802 += 656835261) * 1954547861 - 1] = var8;
               }
            }

            Class522.method5976(var6, this.aClass308Array_4801, 0, this.anInt_4802 * 1954547861 - 1, (byte)90);
         }

         this.aBoolean_4811 = true;
      }

      boolean var9 = false;
      if(this.aBoolean_4811) {
         this.aBoolean_4811 = false;

         for(int var10 = this.anInt_4802 * 1954547861 - 1; var10 >= 0; --var10) {
            boolean var11 = this.aClass308Array_4801[var10].method3862(var1, this.aClass308_4799);
            this.aBoolean_4811 |= !var11;
            var9 |= var11;
         }
      }

      if(var3 != 0 && var1.method1959()) {
         if(null == this.aClass165_4814 && 1597691901 * this.anInt_4813 >= 0) {
            this.method3689(var1, 1012640996);
         }
      } else {
         this.aClass165_4814 = null;
      }

      if(this.aClass286_4817 != null && this != this.aClass286_4817) {
         this.aClass286_4817.method3685(-1548440019);
         var9 |= this.aClass286_4817.method3688(var1, var2, var3, (byte)-92);
      }

      return var9;
   }

   void method3689(Renderer var1, int var2) {
      try {
         boolean var3 = aCacheUnpacker_4796.method3571(this.anInt_4813 * 1597691901, -1851730375);
         if(var3) {
            var1.method1945(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
            ModelData var4 = ModelData.createModelUnpacker(aCacheUnpacker_4796, this.anInt_4813 * 1597691901, 0);
            this.aClass165_4814 = var1.createModel(var4, 1099776, 0, 255, 1);
            byte[] var5 = this.aClass165_4814.method2048();
            if(var5 == null) {
               this.aByteArray_4807 = null;
            } else {
               this.aByteArray_4807 = new byte[var5.length];
               System.arraycopy(var5, 0, this.aByteArray_4807, 0, var5.length);
            }
         }
      } catch (Exception var6) {
         ;
      }

   }

   public void method3690(Renderer var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.method3691(var1, var2, var3, var4, var5, var6, var7, var8, 0, var10, true, false, 1789547835);
   }

   public void method3691(Renderer var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11, boolean var12, int var13) {
      int var14 = 0;
      if(this.aBoolean_4800) {
         var14 = this.anInt_4818 * 1506587951;
      }

      if(this.aClass286_4817 != null) {
         Class286 var15 = this;
         Class286 var16 = this.aClass286_4817;
         if(this.hashCode() > var16.hashCode()) {
            var15 = this.aClass286_4817;
            var16 = this;
            var14 = 255 - var14;
         }

         var15.method3692(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var14, -1733370703);
         var16.method3692(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, false, var12, 255 - var14, 1350779946);
      } else {
         this.method3692(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var14, 243796193);
      }

   }

   void method3692(Renderer var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11, boolean var12, int var13, int var14) {
      int var15 = 255 - var13;
      var1.method1933();
      if(this.aClass165_4814 == null) {
         var1.method1977(2, 0);
         var8 = var2 + var8 & 16383;
         if(this.anInt_4797 * -347784123 != -1 && this.anInt_4798 * -1986645603 != 0) {
            Class183 var16 = Class104_Sub4.aClass163_4155.method1996(-347784123 * this.anInt_4797, (byte)2);
            if(this.aClass170_4808 == null && Class104_Sub21.aClass96_10733.method1263(var16.anInt_3146 * -534969509, Class620.aClass620_10022 == var16.aClass620_3153?Class610.aClass610_9945:Class610.aClass610_9944, 0.7F, this.anInt_4798 * -1986645603, -1986645603 * this.anInt_4798, false, (byte)82)) {
               int[] var17 = var16.aClass620_3153 == Class620.aClass620_10022?Class104_Sub21.aClass96_10733.method1257(-534969509 * var16.anInt_3146, 0.7F, -1986645603 * this.anInt_4798, this.anInt_4798 * -1986645603, false, (byte)1):Class104_Sub21.aClass96_10733.method1251(-534969509 * var16.anInt_3146, 0.7F, this.anInt_4798 * -1986645603, this.anInt_4798 * -1986645603, false, -1394544936);
               this.anInt_4815 = 1315396349 * var17[0];
               this.anInt_4809 = var17[var17.length - 1] * -1973716367;
               this.aClass170_4808 = var1.defineSprite(var17, 0, var16.anInt_3112 * -1446355517, -1446355517 * var16.anInt_3112, var16.anInt_3112 * -1446355517);
            }

            int var25 = 255 == var15?(var16.aClass620_3153 == Class620.aClass620_10022?1:0):1;
            if(var25 == 1 && var11) {
               var1.drawOutline(var3, var4, var5, var6, var10, 0);
            }

            if(this.aClass170_4808 != null) {
               int var18 = var7 * var6 / -4096;

               int var19;
               for(var19 = (var5 - var6) / 2 + var6 * var8 / 4096; var19 > var6; var19 -= var6) {
                  ;
               }

               while(var19 < 0) {
                  var19 += var6;
               }

               int var20;
               if(this.aClass266_4812 == Class266.aClass266_4638) {
                  for(var20 = var19 - var6; var20 < var5; var20 += var6) {
                     this.aClass170_4808.method2130(var20 + var3, var4 + var18, var6, var6, 0, var15 << 24 | 16777215, var25);
                  }

                  if((this.anInt_4815 * -1455615403 & -16777216) != 0) {
                     var1.method1915(0, 0, var5, var4 + var18 + 1, -1455615403 * this.anInt_4815, (byte)-5);
                  }

                  if(0 != (this.anInt_4809 * -522123631 & -16777216)) {
                     var1.method1915(0, var6 + var18 + var4, var5, var6 - (var6 + var4 + var18), -522123631 * this.anInt_4809, (byte)24);
                  }
               } else {
                  while(var18 > var6) {
                     var18 -= var6;
                  }

                  while(var18 < 0) {
                     var18 += var6;
                  }

                  for(var20 = var19 - var6; var20 < var5; var20 += var6) {
                     for(int var21 = var18 - var6; var21 < var6; var21 += var6) {
                        this.aClass170_4808.method2130(var3 + var20, var4 + var21, var6, var6, 0, var15 << 24 | 16777215, var25);
                     }
                  }
               }
            }
         } else {
            var1.drawOutline(var3, var4, var5, var6, var15 << 24 | var10, 1);
         }
      } else if(var12) {
         ArrayViewport var23 = var1.method1984();
         ArrayViewport var24 = var1.method1984();
         var23.data[2] = var23.data[3];
         var23.data[6] = var23.data[7];
         var23.data[10] = var23.data[11];
         var23.data[14] = var23.data[15];
         var1.method1946(var23);
         this.method3683(var1, var7, var8, var9, var13, -1133590522);
         var1.method1946(var24);
      } else {
         if(var11) {
            var1.method1977(3, var10);
         }

         this.method3683(var1, var7, var8, var9, var13, 1479163633);
      }

      for(int var22 = this.anInt_4802 * 1954547861 - 1; var22 >= 0; --var22) {
         this.aClass308Array_4801[var22].method3860(var1, var3, var4, var5, var6, var7, var8, this.anInt_4804 * -1274226859, -1724346583 * this.anInt_4805, this.anInt_4806 * 438461719, var15);
      }

      var1.method1977(2, 0);
      var1.method1933();
   }

   public void method3693(Class286 var1, short var2) {
      if(this.aBoolean_4800) {
         this.anInt_4820 = -204501993 * this.anInt_4818;
      } else if(null != var1 && var1.aBoolean_4800) {
         this.anInt_4820 = -1872008345 - var1.anInt_4818 * -204501993;
      } else {
         this.anInt_4820 = 0;
      }

      this.aBoolean_4800 = true;
      this.aClass286_4817 = var1;
      this.anInt_4818 = 0;
   }

   static final void method3694(ByteArrayDataNode_Sub1 var0, int var1, int var2) {
      Class15.anInt_131 = 0;
      Class84.method1101(var0, (byte)8);
      Class267.method3528(var0, (byte)16);
      if(var1 != var0.index * 964952859) {
         throw new RuntimeException(964952859 * var0.index + " " + var1);
      }
   }

   static void method3695(short var0) {
      Class343.aClass627_6546.method6669(1154479969);
   }

   static void method3696(int var0) {
      if(Class217.aClass321_3761 != null) {
         Class217.aClass321_3761 = null;
         Class104_Sub5.method3284(256, (short)-30206);
      }

   }
}
