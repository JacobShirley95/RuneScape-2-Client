import java.util.Random;

public abstract class FontRenderer {

   static String[] aStringArray_1533 = new String[100];
   Renderer aRenderer_1534;
   public static final int anInt_1535 = 0;
   RSFont renderFont;
   static int anInt_1537 = 0;
   static int anInt_1538 = 1564331969;
   static int anInt_1539 = 0;
   static int anInt_1540 = 487135667;
   static int anInt_1541 = 0;
   static int anInt_1542 = 0;
   static int anInt_1543 = 0;
   static int anInt_1544 = 0;
   public static final int anInt_1545 = 0;


   void method1062(int var1, int var2, int var3) {
      anInt_1540 = 487135667;
      anInt_1538 = 1564331969;
      anInt_1537 = (anInt_1539 = var1 * -520013597) * -644944851;
      anInt_1543 = 0;
      anInt_1544 = 0;
      if(-1 == var2) {
         var2 = 0;
      }

      anInt_1542 = (anInt_1541 = 1224656881 * var2) * -547852923;
   }

   public void method1063(String var1, int var2, int var3, int var4, int var5, short var6) {
      if(null != var1) {
         this.method1062(var4, var5, 18945872);
         this.method1077(var1, var2 - this.renderFont.method5566(var1, 852572580) / 2, var3, (Sprite[])null, (int[])null, (Class1024)null, 0, 0, (byte)1);
      }
   }

   public int method1064(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Sprite[] var12, int[] var13, Class1024 var14, int var15, int var16, int var17) {
      if(null == var1) {
         return 0;
      } else {
         this.method1062(var6, var7, -1847255198);
         if(var10 == 0) {
            var10 = this.renderFont.fontHeight * -63684197;
         }

         int[] var18;
         if(var5 < var10 + this.renderFont.anInt_8571 * 2080531379 + this.renderFont.anInt_8573 * 915612327 && var5 < var10 + var10) {
            var18 = null;
         } else {
            var18 = new int[]{var4};
         }

         int var19 = this.renderFont.method5563(var1, var18, aStringArray_1533, var12, (byte)1);
         if(-1 == var11) {
            var11 = var5 / var10;
            if(var11 <= 0) {
               var11 = 1;
            }
         }

         if(var11 > 0 && var19 >= var11) {
            aStringArray_1533[var11 - 1] = this.renderFont.method5558(aStringArray_1533[var11 - 1], var4, var12, -897286353);
            var19 = var11;
         }

         if(3 == var9 && 1 == var19) {
            var9 = 1;
         }

         int var21;
         int var20;
         if(var9 == 0) {
            var20 = this.renderFont.anInt_8573 * 915612327 + var3;
         } else if(1 == var9) {
            var20 = var3 + this.renderFont.anInt_8573 * 915612327 + (var5 - 915612327 * this.renderFont.anInt_8573 - this.renderFont.anInt_8571 * 2080531379 - var10 * (var19 - 1)) / 2;
         } else if(2 == var9) {
            var20 = var3 + var5 - 2080531379 * this.renderFont.anInt_8571 - var10 * (var19 - 1);
         } else {
            var21 = (var5 - 915612327 * this.renderFont.anInt_8573 - this.renderFont.anInt_8571 * 2080531379 - (var19 - 1) * var10) / (var19 + 1);
            if(var21 < 0) {
               var21 = 0;
            }

            var20 = var21 + 915612327 * this.renderFont.anInt_8573 + var3;
            var10 += var21;
         }

         for(var21 = 0; var21 < var19; ++var21) {
            if(var8 == 0) {
               this.method1077(aStringArray_1533[var21], var2, var20, var12, var13, var14, var15, var16, (byte)1);
            } else if(1 == var8) {
               this.method1077(aStringArray_1533[var21], var2 + (var4 - this.renderFont.method5566(aStringArray_1533[var21], 1077303998)) / 2, var20, var12, var13, var14, var15, var16, (byte)1);
            } else if(2 == var8) {
               this.method1077(aStringArray_1533[var21], var2 + var4 - this.renderFont.method5566(aStringArray_1533[var21], 72323690), var20, var12, var13, var14, var15, var16, (byte)1);
            } else if(var19 - 1 == var21) {
               this.method1077(aStringArray_1533[var21], var2, var20, var12, var13, var14, var15, var16, (byte)1);
            } else {
               this.method1075(aStringArray_1533[var21], var4, 1277300007);
               this.method1077(aStringArray_1533[var21], var2, var20, var12, var13, var14, var15, var16, (byte)1);
               anInt_1543 = 0;
            }

            var20 += var10;
         }

         return var19;
      }
   }

   public void method1065(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 != null) {
         this.method1062(var4, var5, -1755482562);
         int var8 = var1.length();
         int[] var9 = new int[var8];

         for(int var10 = 0; var10 < var8; ++var10) {
            var9[var10] = (int)(Math.sin((double)var6 / 5.0D + (double)var10 / 2.0D) * 5.0D);
         }

         this.method1070(var1, var2 - this.renderFont.method5566(var1, 880361053) / 2, var3, (Sprite[])null, (int[])null, (int[])null, var9, -793872022);
      }
   }

   public void method1066(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 != null) {
         this.method1062(var4, var5, 549900938);
         int var8 = var1.length();
         int[] var9 = new int[var8];
         int[] var10 = new int[var8];

         for(int var11 = 0; var11 < var8; ++var11) {
            var9[var11] = (int)(Math.sin((double)var11 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var10[var11] = (int)(Math.sin((double)var6 / 5.0D + (double)var11 / 3.0D) * 5.0D);
         }

         this.method1070(var1, var2 - this.renderFont.method5566(var1, -728308390) / 2, var3, (Sprite[])null, (int[])null, var9, var10, 1160686581);
      }
   }

   public void method1067(String var1, int var2, int var3, int var4, int var5, int var6, int var7, short var8) {
      if(null != var1) {
         this.method1062(var4, var5, -834822700);
         double var9 = 7.0D - (double)var7 / 8.0D;
         if(var9 < 0.0D) {
            var9 = 0.0D;
         }

         int var11 = var1.length();
         int[] var12 = new int[var11];

         for(int var13 = 0; var13 < var11; ++var13) {
            var12[var13] = (int)(Math.sin((double)var13 / 1.5D + (double)var6 / 1.0D) * var9);
         }

         this.method1070(var1, var2 - this.renderFont.method5566(var1, 801181356) / 2, var3, (Sprite[])null, (int[])null, (int[])null, var12, -1512529618);
      }
   }

   void method1068(String var1, int var2) {
      try {
         if(var1.startsWith("col=")) {
            anInt_1537 = (-711974953 * anInt_1537 & -16777216 | Class343.method4253(var1.substring(4), 16, 1145471504) & 16777215) * -1500363801;
         } else if(var1.equals("/col")) {
            anInt_1537 = -1500363801 * (-711974953 * anInt_1537 & -16777216 | anInt_1539 * 1341246667 & 16777215);
         }

         if(var1.startsWith("argb=")) {
            anInt_1537 = Class343.method4253(var1.substring(5), 16, 1145471504) * -1500363801;
         } else if(var1.equals("/argb")) {
            anInt_1537 = anInt_1539 * -644944851;
         } else if(var1.startsWith("str=")) {
            anInt_1540 = (anInt_1537 * -711974953 & -16777216 | Class343.method4253(var1.substring(4), 16, 1145471504)) * -487135667;
         } else if(var1.equals("str")) {
            anInt_1540 = -487135667 * (anInt_1537 * -711974953 & -16777216 | 8388608);
         } else if(var1.equals("/str")) {
            anInt_1540 = 487135667;
         } else if(var1.startsWith("u=")) {
            anInt_1538 = (anInt_1537 * -711974953 & -16777216 | Class343.method4253(var1.substring(2), 16, 1145471504)) * -1564331969;
         } else if(var1.equals("u")) {
            anInt_1538 = -1564331969 * (anInt_1537 * -711974953 & -16777216);
         } else if(var1.equals("/u")) {
            anInt_1538 = 1564331969;
         } else if(var1.equalsIgnoreCase("shad=-1")) {
            anInt_1542 = 0;
         } else if(var1.startsWith("shad=")) {
            anInt_1542 = (-711974953 * anInt_1537 & -16777216 | Class343.method4253(var1.substring(5), 16, 1145471504)) * 290946357;
         } else if(var1.equals("shad")) {
            anInt_1542 = (anInt_1537 * -711974953 & -16777216) * 290946357;
         } else if(var1.equals("/shad")) {
            anInt_1542 = anInt_1541 * -547852923;
         } else if(var1.equals("br")) {
            this.method1062(1341246667 * anInt_1539, anInt_1541 * 1512130833, 272865905);
         }
      } catch (Exception var4) {
         ;
      }

   }

   public void renderText(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method1062(var4, var5, 1478903674);
         this.method1077(var1, var2, var3, (Sprite[])null, (int[])null, (Class1024)null, 0, 0, (byte)1);
      }
   }

   void method1070(String var1, int var2, int var3, Sprite[] var4, int[] var5, int[] var6, int[] var7, int var8) {
      var3 -= -63684197 * this.renderFont.fontHeight;
      int var9 = -1;
      int var10 = -1;
      int var11 = 0;
      int var12 = var1.length();

      for(int var13 = 0; var13 < var12; ++var13) {
         char var14 = (char)(Class120.method1515(var1.charAt(var13), -871732736) & 255);
         if(var14 == 60) {
            var9 = var13;
         } else {
            int var17;
            int var16;
            if(var14 == 62 && var9 != -1) {
               String var15 = var1.substring(var9 + 1, var13);
               var9 = -1;
               if(var15.equals("lt")) {
                  var14 = 60;
               } else if(var15.equals("gt")) {
                  var14 = 62;
               } else if(var15.equals("nbsp")) {
                  var14 = 160;
               } else if(var15.equals("shy")) {
                  var14 = 173;
               } else if(var15.equals("times")) {
                  var14 = 215;
               } else if(var15.equals("euro")) {
                  var14 = 8364;
               } else if(var15.equals("copy")) {
                  var14 = 169;
               } else {
                  if(!var15.equals("reg")) {
                     if(var15.startsWith("img=")) {
                        try {
                           if(var6 != null) {
                              var16 = var6[var11];
                           } else {
                              var16 = 0;
                           }

                           if(var7 != null) {
                              var17 = var7[var11];
                           } else {
                              var17 = 0;
                           }

                           ++var11;
                           int var18 = LoadProgress.method4427(var15.substring(4), 1390131730);
                           Sprite var19 = var4[var18];
                           int var20 = var5 != null?var5[var18]:var19.getFurthestY();
                           var19.drawAt(var16 + var2, this.renderFont.fontHeight * -63684197 + var3 - var20 + var17, 1, -1, 1);
                           var2 += var4[var18].getFurthestX();
                           var10 = -1;
                        } catch (Exception var21) {
                           ;
                        }
                     } else {
                        this.method1068(var15, 1164206533);
                     }
                     continue;
                  }

                  var14 = 174;
               }
            }

            if(var9 == -1) {
               if(-1 != var10) {
                  var2 += this.renderFont.method5565(var10, var14, (byte)2);
               }

               int var22;
               if(var6 != null) {
                  var22 = var6[var11];
               } else {
                  var22 = 0;
               }

               if(var7 != null) {
                  var16 = var7[var11];
               } else {
                  var16 = 0;
               }

               ++var11;
               if(var14 != 32) {
                  if((anInt_1542 * -455955171 & -16777216) != 0) {
                     this.method1074(var14, var22 + 1 + var2, 1 + var3 + var16, -455955171 * anInt_1542, true);
                  }

                  this.method1074(var14, var22 + var2, var16 + var3, -711974953 * anInt_1537, false);
               } else if(anInt_1543 * -38222937 > 0) {
                  anInt_1544 += anInt_1543 * 96976125;
                  var2 += 706721395 * anInt_1544 >> 8;
                  anInt_1544 = 1433067195 * (706721395 * anInt_1544 & 255);
               }

               var17 = this.renderFont.getCharWidth(var14, (byte)13);
               if(-1 != anInt_1540 * -368786811) {
                  this.aRenderer_1534.method1917(var2, var3 + (int)(0.7D * (double)(this.renderFont.fontHeight * -63684197)), var17, anInt_1540 * -368786811, (byte)66);
               }

               if(anInt_1538 * -920535105 != -1) {
                  this.aRenderer_1534.method1917(var2, var3 + -63684197 * this.renderFont.fontHeight, var17, -920535105 * anInt_1538, (byte)68);
               }

               var2 += var17;
               var10 = var14;
            }
         }
      }

   }

   abstract void method1071(char var1, int var2, int var3, int var4, boolean var5, Class1024 var6, int var7, int var8);

   public int method1072(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Random var10, int var11, int[] var12, Sprite[] var13, int[] var14, int var15) {
      if(null == var1) {
         return 0;
      } else {
         var10.setSeed((long)var11);
         int var16 = 192 + (var10.nextInt() & 31);
         this.method1062(var16 << 24 | var6 & 16777215, -1 == var7?0:var16 << 24 | var7 & 16777215, -355117222);
         int var17 = var1.length();
         int[] var18 = new int[var17];
         int var19 = 0;

         int var20;
         for(var20 = 0; var20 < var17; ++var20) {
            var18[var20] = var19;
            if((var10.nextInt() & 3) == 0) {
               ++var19;
            }
         }

         var20 = var2;
         int var21 = var3 + this.renderFont.anInt_8573 * 915612327;
         int var22 = -1;
         if(1 == var9) {
            var21 += (var5 - this.renderFont.anInt_8573 * 915612327 - 2080531379 * this.renderFont.anInt_8571) / 2;
         } else if(2 == var9) {
            var21 = var3 + var5 - 2080531379 * this.renderFont.anInt_8571;
         }

         if(var8 == 1) {
            var22 = this.renderFont.method5566(var1, 1193633632) + var19;
            var20 = var2 + (var4 - var22) / 2;
         } else if(var8 == 2) {
            var22 = this.renderFont.method5566(var1, 227201410) + var19;
            var20 = var2 + (var4 - var22);
         }

         this.method1070(var1, var20, var21, var13, var14, var18, (int[])null, -534113634);
         if(null != var12) {
            if(-1 == var22) {
               var22 = this.renderFont.method5566(var1, 1892194455) + var19;
            }

            var12[0] = var20;
            var12[1] = var21 - this.renderFont.anInt_8573 * 915612327;
            var12[2] = var22;
            var12[3] = this.renderFont.anInt_8571 * 2080531379 + 915612327 * this.renderFont.anInt_8573;
         }

         return var19;
      }
   }

   public int method1073(String var1, int var2, int var3, int var4, int var5, Random var6, int var7, Sprite[] var8, int[] var9, byte var10) {
      if(var1 == null) {
         return 0;
      } else {
         var6.setSeed((long)var7);
         int var11 = 192 + (var6.nextInt() & 31);
         this.method1062(var11 << 24 | var4 & 16777215, var11 << 24 | var5 & 16777215, 681836752);
         int var12 = var1.length();
         int[] var13 = new int[var12];
         int var14 = 0;

         for(int var15 = 0; var15 < var12; ++var15) {
            var13[var15] = var14;
            if((var6.nextInt() & 3) == 0) {
               ++var14;
            }
         }

         this.method1070(var1, var2, var3, var8, var9, var13, (int[])null, -1233734952);
         return var14;
      }
   }

   abstract void method1074(char var1, int var2, int var3, int var4, boolean var5);

   void method1075(String var1, int var2, int var3) {
      int var4 = 0;
      boolean var5 = false;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         char var7 = var1.charAt(var6);
         if(var7 == 60) {
            var5 = true;
         } else if(62 == var7) {
            var5 = false;
         } else if(!var5 && 32 == var7) {
            ++var4;
         }
      }

      if(var4 > 0) {
         anInt_1543 = (var2 - this.renderFont.method5566(var1, 205881468) << 8) / var4 * 2099491863;
      }

   }

   public void renderColourText(String var1, int var2, int var3, int var4, int var5, byte var6) {
      if(null != var1) {
         this.method1062(var4, var5, 1380104606);
         this.method1077(var1, var2 - this.renderFont.method5566(var1, 1269950527), var3, (Sprite[])null, (int[])null, (Class1024)null, 0, 0, (byte)1);
      }
   }

   void method1077(String var1, int var2, int var3, Sprite[] var4, int[] var5, Class1024 var6, int var7, int var8, byte var9) {
      var3 -= -63684197 * this.renderFont.fontHeight;
      int var10 = -1;
      int var11 = -1;
      int var12 = var1.length();

      for(int var13 = 0; var13 < var12; ++var13) {
         char var14 = (char)(Class120.method1515(var1.charAt(var13), 1801623038) & 255);
         if(60 == var14) {
            var10 = var13;
         } else {
            if(62 == var14 && var10 != -1) {
               String var15 = var1.substring(var10 + 1, var13);
               var10 = -1;
               if(var15.equals("lt")) {
                  var14 = 60;
               } else if(var15.equals("gt")) {
                  var14 = 62;
               } else if(var15.equals("nbsp")) {
                  var14 = 160;
               } else if(var15.equals("shy")) {
                  var14 = 173;
               } else if(var15.equals("times")) {
                  var14 = 215;
               } else if(var15.equals("euro")) {
                  var14 = 8364;
               } else if(var15.equals("copy")) {
                  var14 = 169;
               } else {
                  if(!var15.equals("reg")) {
                     if(var15.startsWith("img=")) {
                        try {
                           int var16 = LoadProgress.method4427(var15.substring(4), 1667944122);
                           Sprite sprite = var4[var16];
                           int height = null != var5?var5[var16]:sprite.getFurthestY();
                           if(-16777216 == (anInt_1537 * -711974953 & -16777216)) {
                              sprite.drawAt(var2, var3 + -63684197 * this.renderFont.fontHeight - height, 1, -1, 1);
                           } else {
                              sprite.drawAt(var2, var3 + -63684197 * this.renderFont.fontHeight - height, 0, anInt_1537 * -711974953 & -16777216 | 16777215, 1);
                           }

                           var2 += sprite.getFurthestX();
                           var11 = -1;
                        } catch (Exception var19) {
                           ;
                        }
                     } else {
                        this.method1068(var15, 1953437088);
                     }
                     continue;
                  }

                  var14 = 174;
               }
            }

            if(var10 == -1) {
               if(-1 != var11) {
                  var2 += this.renderFont.method5565(var11, var14, (byte)2);
               }

               if(var14 != 32) {
                  if(null == var6) {
                     if(0 != (anInt_1542 * -455955171 & -16777216)) {
                        this.method1074(var14, var2 + 1, 1 + var3, -455955171 * anInt_1542, true);
                     }

                     this.method1074(var14, var2, var3, anInt_1537 * -711974953, false);
                  } else {
                     if(0 != (anInt_1542 * -455955171 & -16777216)) {
                        this.method1071(var14, var2 + 1, var3 + 1, anInt_1542 * -455955171, true, var6, var7, var8);
                     }

                     this.method1071(var14, var2, var3, anInt_1537 * -711974953, false, var6, var7, var8);
                  }
               } else if(-38222937 * anInt_1543 > 0) {
                  anInt_1544 += anInt_1543 * 96976125;
                  var2 += 706721395 * anInt_1544 >> 8;
                  anInt_1544 = 1433067195 * (706721395 * anInt_1544 & 255);
               }

               int var20 = this.renderFont.getCharWidth(var14, (byte)39);
               if(-1 != anInt_1540 * -368786811) {
                  this.aRenderer_1534.method1917(var2, (int)((double)(this.renderFont.fontHeight * -63684197) * 0.7D) + var3, var20, -368786811 * anInt_1540, (byte)84);
               }

               if(-1 != anInt_1538 * -920535105) {
                  this.aRenderer_1534.method1917(var2, 1 + var3 + this.renderFont.fontHeight * -63684197, var20, -920535105 * anInt_1538, (byte)93);
               }

               var2 += var20;
               var11 = var14;
            }
         }
      }

   }

   FontRenderer(Renderer var1, RSFont var2) {
      this.aRenderer_1534 = var1;
      this.renderFont = var2;
   }

   public int method1078(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Sprite[] var11, int[] var12, Class1024 var13, int var14, int var15, int var16) {
      return this.method1064(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, 0, var11, var12, var13, var14, var15, 248877771);
   }

   public static Sprite method1079(CacheDataUnpacker var0, int var1, int var2) {
      Sprite var3 = (Sprite)Class343.aClass627_6546.getObject((long)var1);
      if(null == var3) {
         if(Class474.aBoolean_8726) {
            var3 = Class286.gameRenderer.loadSprite(ImageUtils.method1794(var0, var1), true);
         } else {
            var3 = Class411.method5069(var0.method3566(var1, 398286711), (byte)-87);
         }

         Class343.aClass627_6546.insert(var3, (long)var1);
      }

      return var3;
   }

   public static int method1080(int var0) {
      return Class601.anInt_9882 * 530505289;
   }

   static final void method1081(RSInterfaceData var0, short var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class192.method2510(var3, var4, var0, (byte)7);
   }

   static final void method1082(RSInterfaceData var0, int var1) {
      var0.stringDataIndex -= 638819198;
      String var2 = (String)var0.stringData[863838783 * var0.stringDataIndex];
      String var3 = (String)var0.stringData[1 + 863838783 * var0.stringDataIndex];
      ParameterNode.method5294(var2, var3, -2051010786);
   }

   static final void method1083(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
   }

   public static void method1084(int var0, byte var1) {
      Class248_Sub1.anInt_6453 = -2140620407 * var0;
      Class248_Sub1.anInt_6454 = 1309236803;
      Class533.anInt_9358 = 1414042335;
      Class467.anInt_8690 = -1752306084;
   }
}
