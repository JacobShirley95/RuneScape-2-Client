import java.util.Iterator;

public class Class296 {

   WorldObjects worldObjects;
   Class40 aClass40_5949;
   int failed = 0;
   Class281 aClass281_5951;
   Class377_Sub1 aClass377_Sub1_5952;
   Class377_Sub1 aClass377_Sub1_5953;
   Class305 aClass305_5954;
   MapPoint loadedMap = new MapPoint();
   int anInt_5956;
   int anInt_5957;
   int anInt_5958;
   int anInt_5959;
   int[][][] anIntArrayArrayArray_5960;
   Class588 aClass588_5961;
   boolean aBoolean_5962;
   public long aLong_5963;
   int anInt_5964;
   MapOverviewNode aClass240_Sub22_Sub8_5965;
   MapElements worldMapStaticElements;
   MapPoint aClass626_5967 = new MapPoint();
   float aFloat_5968;
   byte[][] aByteArrayArray_5969;
   int[][] anIntArrayArray_5970;
   int[][] anIntArrayArray_5971;
   byte[][][] aByteArrayArrayArray_5972;
   Class298 aClass298_5973;
   Class529 aClass529_5974;
   Class303 aClass303_5975 = new Class303(0, 0, 0, 0);
   int anInt_5976 = 0;
   int anInt_5977 = -2002533945;
   int anInt_5978 = -1728300877;
   Class305 aClass305_5979;
   int[] anIntArray_5980;
   int[] anIntArray_5981;
   byte[][] aByteArrayArray_5982;
   byte[][] aByteArrayArray_5983;
   byte[][] aByteArrayArray_5984;
   int anInt_5985 = 0;
   byte[][] aByteArrayArray_5986;
   int anInt_5987;
   public boolean aBoolean_5988 = false;
   int anInt_5989;


   public Class305 method3742(int var1) {
      return this.aClass305_5979;
   }

   public int method3743(int var1) {
      return 100 - this.failed * -14974340 / (this.anInt_5978 * 691615355);
   }

   public MapPoint getMapArea() {
      return this.loadedMap;
   }

   public int getMaxX(byte var1) {
      return -1807019437 * this.anInt_5958;
   }

   public int getMaxY(int var1) {
      return -509677085 * this.anInt_5959;
   }

   public MapElements getMMElements() {
      return this.worldMapStaticElements;
   }

   public Class303 method3748(int var1) {
      return this.aClass303_5975;
   }

   public float method3749(int var1) {
      return this.aFloat_5968;
   }

   void method3750(int var1) {
      this.aClass305_5954 = this.aClass305_5979;
      this.method3767(Class40.aClass40_878, 375872214);

      int var2;
      int var3;
      int var4;
      for(var2 = 0; var2 < 4; ++var2) {
         for(var3 = 0; var3 < -1807019437 * this.anInt_5958 >> 3; ++var3) {
            for(var4 = 0; var4 < -509677085 * this.anInt_5959 >> 3; ++var4) {
               this.anIntArrayArrayArray_5960[var2][var3][var4] = -1;
            }
         }
      }

      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      for(Class240_Sub28 var20 = (Class240_Sub28)Class95.aNodeList_1888.getBaseNode_2((byte)18); var20 != null; var20 = (Class240_Sub28)Class95.aNodeList_1888.getNext(-1832904535)) {
         var3 = var20.anInt_7384 * 1865625073;
         boolean var22 = 1 == (var3 & 1);
         var5 = var20.anInt_7377 * -1877531981 >> 3;
         var6 = var20.anInt_7376 * 1755213637 >> 3;
         var7 = var20.anInt_7378 * -1903378635;
         var8 = var20.anInt_7381 * 143240607;
         var9 = 1895284863 * var20.anInt_7380;
         var10 = var20.anInt_7379 * 1546605125;
         var11 = -1814089967 * var20.anInt_7382;
         int var12 = var20.anInt_7383 * -1945782885;
         int var13 = 0;
         int var14 = 0;
         byte var15 = 1;
         byte var16 = 1;
         if(var3 == 1) {
            var14 = var11 - 1;
            var15 = -1;
         } else if(2 == var3) {
            var14 = var11 - 1;
            var13 = var12 - 1;
            var15 = -1;
            var16 = -1;
         } else if(3 == var3) {
            var13 = var12 - 1;
            var15 = 1;
            var16 = -1;
         }

         for(int var17 = var6; var17 < var6 + var12; var13 += var16) {
            int var18 = var14;

            for(int var19 = var5; var19 < var11 + var5; var18 += var15) {
               if(var22) {
                  this.anIntArrayArrayArray_5960[var10][var7 + var13][var18 + var8] = (var9 << 24) + (var19 << 14) + (var17 << 3) + (var3 << 1);
               } else {
                  this.anIntArrayArrayArray_5960[var10][var7 + var18][var13 + var8] = (var19 << 14) + (var9 << 24) + (var17 << 3) + (var3 << 1);
               }

               ++var19;
            }

            ++var17;
         }
      }

      var2 = client.anInt_333 * 1450221831;
      this.anIntArray_5980 = new int[var2];
      this.anIntArray_5981 = new int[var2];
      this.aByteArrayArray_5982 = new byte[var2][];
      this.aByteArrayArray_5983 = new byte[var2][];
      this.aByteArrayArray_5984 = (byte[][])null;
      this.aByteArrayArray_5969 = new byte[var2][];
      this.aByteArrayArray_5986 = new byte[var2][];
      var2 = 0;

      for(Class240_Sub28 var21 = (Class240_Sub28)Class95.aNodeList_1888.getBaseNode_2((byte)94); null != var21; var21 = (Class240_Sub28)Class95.aNodeList_1888.getNext(-646918730)) {
         var4 = var21.anInt_7377 * -1877531981 >>> 3;
         var5 = var21.anInt_7376 * 1755213637 >>> 3;
         var6 = var4 + var21.anInt_7382 * -1814089967;
         if((var6 & 7) == 0) {
            --var6;
         }

         var6 >>>= 3;
         var7 = -1945782885 * var21.anInt_7383 + var5;
         if((var7 & 7) == 0) {
            --var7;
         }

         var7 >>>= 3;

         for(var8 = var4 >>> 3; var8 <= var6; ++var8) {
            var9 = var5 >>> 3;

            while(var9 <= var7) {
               var10 = var8 << 8 | var9;
               var11 = 0;

               while(true) {
                  if(var11 < var2) {
                     if(this.anIntArray_5980[var11] != var10) {
                        ++var11;
                        continue;
                     }
                  } else if(Class293.cacheFile5Unpacker.method3565(this.method3785(var8, var9, (byte)-36), Class271.aClass271_4686.anInt_4684 * -759200297, 1246137530)) {
                     this.anIntArray_5980[var2] = var10;
                     this.anIntArray_5981[var2] = this.method3785(var8, var9, (byte)-53);
                     ++var2;
                  }

                  ++var9;
                  break;
               }
            }
         }
      }

      this.anInt_5985 = 685970571 * var2;
      this.method3769(-1807019437 * this.anInt_5958 >> 4, -509677085 * this.anInt_5959 >> 4, 10, false, (byte)-37);
   }

   void method3751(int var1) {
      this.method3767(Class564.method6221(Class104_Sub21.renderSettings.aClass540_Sub7_7291.method1586(1779309497), (byte)-66), -2111459617);
      int var2 = this.loadedMap.loadedMapX * 1265321541;
      int var3 = -1996781083 * this.loadedMap.loadedMapY;
      int var4 = (var2 >> 3) + (Class330.anInt_6406 * 1199090811 >> 12);
      int var5 = (var3 >> 3) + (1527060537 * Class373.anInt_7118 >> 12);
      Class521.myPlayer.plane = 0;
      CacheFileID.anInt_2036 = 0;
      Class521.myPlayer.method1011(8, 8, 1516314782);
      byte var6 = 18;
      this.anIntArray_5980 = new int[var6];
      this.anIntArray_5981 = new int[var6];
      this.aByteArrayArray_5982 = new byte[var6][];
      this.aByteArrayArray_5983 = new byte[var6][];
      this.aByteArrayArray_5984 = new byte[var6][];
      this.aByteArrayArray_5969 = new byte[var6][];
      this.aByteArrayArray_5986 = new byte[var6][];
      int var10 = 0;

      for(int var7 = (var4 - (-1807019437 * this.anInt_5958 >> 4)) / 8; var7 <= (var4 + (this.anInt_5958 * -1807019437 >> 4)) / 8; ++var7) {
         for(int var8 = (var5 - (-509677085 * this.anInt_5959 >> 4)) / 8; var8 <= ((-509677085 * this.anInt_5959 >> 4) + var5) / 8; ++var8) {
            int var9 = var8 + (var7 << 8);
            if(Class293.cacheFile5Unpacker.method3565(this.method3785(var7, var8, (byte)-51), -759200297 * Class271.aClass271_4686.anInt_4684, 724776483)) {
               this.anIntArray_5980[var10] = var9;
               this.anIntArray_5981[var10] = this.method3785(var7, var8, (byte)-4);
               ++var10;
            }
         }
      }

      this.anInt_5985 = 685970571 * var10;
      byte var11;
      if(-243034353 * client.loginStage == 5) {
         var11 = 13;
      } else if(client.loginStage * -243034353 == 2) {
         var11 = 11;
      } else if(4 == -243034353 * client.loginStage) {
         var11 = 14;
      } else {
         if(client.loginStage * -243034353 != 3) {
            throw new RuntimeException("" + -243034353 * client.loginStage);
         }

         var11 = 12;
      }

      this.method3769(var4, var5, var11, false, (byte)92);
   }

   public byte[][] method3752(int var1, int var2) {
      return null != this.aClass377_Sub1_5953 && null != this.aClass377_Sub1_5953.aByteArrayArrayArray_7201 && this.aClass377_Sub1_5953.aByteArrayArrayArray_7201[var1] != null?this.aClass377_Sub1_5953.aByteArrayArrayArray_7201[var1]:(byte[][])null;
   }

   public Class281 method3753() {
      return this.aClass281_5951;
   }

   public Class588 method3754(int var1) {
      return this.aClass588_5961;
   }

   public Class529 method3755(int var1) {
      return this.aClass529_5974;
   }

   public int[][] method3756(int var1) {
      return this.anIntArrayArray_5970;
   }

   public int[][] method3757(byte var1) {
      return this.anIntArrayArray_5971;
   }

   public byte[][][] method3758(int var1) {
      return this.aByteArrayArrayArray_5972;
   }

   public void method3759(byte[][][] var1, int var2) {
      this.aByteArrayArrayArray_5972 = var1;
   }

   public Class377_Sub1 method3760(int var1) {
      return this.aClass377_Sub1_5953;
   }

   public void method3761(int var1) {
      this.loadedMap = new MapPoint();
      this.anInt_5957 = 0;
      this.anInt_5956 = 0;
   }

   public void method3762(int var1) {
      this.anInt_5987 = -1878286648;
      if(this.anInt_5958 * -1807019437 == 0) {
         this.anInt_5964 = 1505363102;
      } else {
         this.anInt_5964 = (int)(34.46D * (double)(this.anInt_5958 * -1807019437)) * 1232061257;
      }

      this.anInt_5964 = 1232061257 * (this.anInt_5964 * -1784373511 << 2);
      if(Class286.gameRenderer.method1900()) {
         this.anInt_5964 += -544828928;
      }

   }

   void method3763(Class296 var1, int var2) {
      boolean var3 = var1.aBoolean_5962;
      var1.aBoolean_5962 = this.aBoolean_5962;
      this.aBoolean_5962 = var3;
      Class305 var4 = var1.aClass305_5954;
      var1.aClass305_5954 = this.aClass305_5954;
      this.aClass305_5954 = var4;
      var1.aClass626_5967 = this.loadedMap;
      this.aClass626_5967 = var1.loadedMap;
      this.aClass588_5961.method6375(var1.method3754(-399538696), (short)-705);
   }

   public void method3764(Class297 var1, int var2) {
      this.aClass305_5979 = var1.aClass305_5991;
      if(Class305.aClass305_6025 == this.aClass305_5979) {
         this.method3751(-1731895258);
      } else if(Class305.aClass305_6024 == this.aClass305_5979) {
         this.method3765(var1.aClass240_Sub8_Sub1_5990, (byte)122);
      } else if(Class305.aClass305_6023 == this.aClass305_5979) {
         this.method3750(982191452);
      } else if(this.aClass305_5979.method3839(1973400942)) {
         this.method3766(var1.aClass240_Sub8_Sub1_5990, -2135816945);
      }

   }

   void method3765(ByteArrayDataNode_Sub1 var1, byte var2) {
      int var3 = var1.readByte(1591290636);
      int var4 = var1.method4529(1466559550);
      int var5 = var1.method4502((short)-32418);
      int var6 = var1.method4527(1966399096);
      boolean var7 = var1.method4502((short)-6403) == 1;
      if(!this.aBoolean_5962) {
         this.method3768((byte)-98);
      }

      this.method3767(Class564.method6221(var3, (byte)-83), -1977344301);
      this.anIntArray_5980 = new int[var5];
      this.anIntArray_5981 = new int[var5];
      this.aByteArrayArray_5982 = new byte[var5][];
      this.aByteArrayArray_5983 = new byte[var5][];
      this.aByteArrayArray_5984 = (byte[][])null;
      this.aByteArrayArray_5969 = new byte[var5][];
      this.aByteArrayArray_5986 = new byte[var5][];
      var5 = 0;

      for(int var8 = (var6 - (-1807019437 * this.anInt_5958 >> 4)) / 8; var8 <= (var6 + (this.anInt_5958 * -1807019437 >> 4)) / 8; ++var8) {
         for(int var9 = (var4 - (this.anInt_5959 * -509677085 >> 4)) / 8; var9 <= ((-509677085 * this.anInt_5959 >> 4) + var4) / 8; ++var9) {
            if(Class293.cacheFile5Unpacker.method3565(this.method3785(var8, var9, (byte)-82), Class271.aClass271_4686.anInt_4684 * -759200297, 1111838542)) {
               this.anIntArray_5980[var5] = var9 + (var8 << 8);
               this.anIntArray_5981[var5] = this.method3785(var8, var9, (byte)-17);
               ++var5;
            }
         }
      }

      this.anInt_5985 = var5 * 685970571;
      this.method3769(var6, var4, 10, var7, (byte)102);
   }

   void method3766(ByteArrayDataNode_Sub1 var1, int var2) {
      int var3 = var1.method4462((byte)78);
      if(var3 == 1) {
         this.aClass305_5979 = Class305.aClass305_6027;
      } else if(2 == var3) {
         this.aClass305_5979 = Class305.aClass305_6026;
      } else if(var3 == 3) {
         this.aClass305_5979 = Class305.aClass305_6031;
      } else if(var3 == 4) {
         this.aClass305_5979 = Class305.aClass305_6029;
      }

      int var4 = var1.method4531(295178810);
      int var5 = var1.method4531(571331732);
      int var6 = var1.method4502((short)243);
      boolean var7 = 0 != (var6 & 1);
      int var8 = var1.readByte(864282169);
      if(!this.aBoolean_5962) {
         this.method3768((byte)-10);
      }

      this.method3767(Class564.method6221(var8, (byte)86), 1632091982);
      var1.method294((byte)72);

      int var9;
      int var10;
      int var11;
      int var12;
      for(var9 = 0; var9 < 4; ++var9) {
         for(var10 = 0; var10 < this.anInt_5958 * -1807019437 >> 3; ++var10) {
            for(var11 = 0; var11 < this.anInt_5959 * -509677085 >> 3; ++var11) {
               var12 = var1.method291(1, 1832157798);
               if(var12 == 1) {
                  this.anIntArrayArrayArray_5960[var9][var10][var11] = var1.method291(26, 1832157798);
               } else {
                  this.anIntArrayArrayArray_5960[var9][var10][var11] = -1;
               }
            }
         }
      }

      var1.method292(432394462);
      var9 = var1.readByte(886787966);
      this.anIntArray_5980 = new int[var9];
      this.anIntArray_5981 = new int[var9];
      this.aByteArrayArray_5982 = new byte[var9][];
      this.aByteArrayArray_5983 = new byte[var9][];
      this.aByteArrayArray_5984 = (byte[][])null;
      this.aByteArrayArray_5969 = new byte[var9][];
      this.aByteArrayArray_5986 = new byte[var9][];
      var9 = 0;

      for(var10 = 0; var10 < 4; ++var10) {
         for(var11 = 0; var11 < this.anInt_5958 * -1807019437 >> 3; ++var11) {
            for(var12 = 0; var12 < -509677085 * this.anInt_5959 >> 3; ++var12) {
               int var13 = this.anIntArrayArrayArray_5960[var10][var11][var12];
               if(var13 != -1) {
                  int var14 = var13 >> 14 & 1023;
                  int var15 = var13 >> 3 & 2047;
                  int var16 = var15 / 8 + (var14 / 8 << 8);

                  int var17;
                  for(var17 = 0; var17 < var9; ++var17) {
                     if(this.anIntArray_5980[var17] == var16) {
                        var16 = -1;
                        break;
                     }
                  }

                  if(-1 != var16) {
                     var17 = var16 >> 8 & 255;
                     int var18 = var16 & 255;
                     if(Class293.cacheFile5Unpacker.method3565(this.method3785(var17, var18, (byte)-96), -759200297 * Class271.aClass271_4686.anInt_4684, 925602946)) {
                        this.anIntArray_5980[var9] = var16;
                        this.anIntArray_5981[var9] = this.method3785(var17, var18, (byte)-119);
                        ++var9;
                     }
                  }
               }
            }
         }
      }

      this.anInt_5985 = var9 * 685970571;
      this.method3769(var5, var4, 10, var7, (byte)70);
   }

   void method3767(Class40 var1, int var2) {
      if(this.aClass40_5949 != var1) {
         this.anInt_5958 = (this.anInt_5959 = 654802085 * var1.anInt_879) * 747622449;
         this.anIntArrayArrayArray_5960 = new int[4][this.anInt_5958 * -1807019437 >> 3][this.anInt_5959 * -509677085 >> 3];
         this.anIntArrayArray_5970 = new int[this.anInt_5958 * -1807019437][-509677085 * this.anInt_5959];
         this.anIntArrayArray_5971 = new int[this.anInt_5958 * -1807019437][this.anInt_5959 * -509677085];
         this.aByteArrayArrayArray_5972 = new byte[4][-1807019437 * this.anInt_5958][this.anInt_5959 * -509677085];
         this.aClass281_5951 = new Class281(4, this.anInt_5958 * -1807019437, -509677085 * this.anInt_5959);
         this.method3786(-2141899301);
         this.aClass40_5949 = var1;
      }
   }

   void method3768(byte var1) {
      if(this.aClass305_5979 != Class305.aClass305_6023 && this.aClass305_5954 != Class305.aClass305_6023) {
         if(this.aClass305_5979 == Class305.aClass305_6027 || Class305.aClass305_6031 == this.aClass305_5979 || this.aClass305_5979 != this.aClass305_5954 && (Class305.aClass305_6024 == this.aClass305_5979 || Class305.aClass305_6024 == this.aClass305_5954)) {
            client.availableNPCS = 0;
            client.anInt_334 = 0;
            client.npcNodeList.method5938(1664095609);
         }

         this.aClass305_5954 = this.aClass305_5979;
      }
   }

   void method3769(int var1, int var2, int var3, boolean var4, byte var5) {
      if(2 == client.anInt_356 * 415041591) {
         if(this.aBoolean_5962) {
            throw new IllegalStateException();
         }

         client.anInt_356 = -563825124;
         client.anInt_544 = -93521583;
      }

      if(var4 || var1 != this.anInt_5956 * 210015403 || 1888189517 * this.anInt_5957 != var2) {
         this.anInt_5956 = 845334019 * var1;
         this.anInt_5957 = var2 * -1783620475;
         if(!this.aBoolean_5962) {
            Class418.method5190(var3, (byte)-36);
            Class599.method6484(ServerString.loadingStr.getText(Class599.clientLanguage, 1582883550), true, Class286.gameRenderer, CacheDataNode.aTextRenderer_3243, Class1.aRSFont_10, 1783306337);
         }

         if(null != this.loadedMap) {
            this.aClass626_5967 = this.loadedMap;
         } else {
            this.aClass626_5967 = new MapPoint(0, 0, 0);
         }

         this.loadedMap = new MapPoint(0, (this.anInt_5956 * 210015403 - (-1807019437 * this.anInt_5958 >> 4)) * 8, 8 * (1888189517 * this.anInt_5957 - (this.anInt_5959 * -509677085 >> 4)));
         this.aClass240_Sub22_Sub8_5965 = Class248.method3175(1265321541 * this.loadedMap.loadedMapX, -1996781083 * this.loadedMap.loadedMapY);
         this.worldMapStaticElements = null;
         if(!this.aBoolean_5962) {
            this.method3781(var3, -821610060);
         }

      }
   }

   public void method3770(int var1) {
      this.aClass298_5973 = Class298.aClass298_5995;
      this.failed = 0;
      this.anInt_5978 = -1728300877;
      this.anInt_5976 = 0;
      this.anInt_5977 = -2002533945;
      this.anInt_5989 = 0;
   }

   public Class298 method3771(byte var1) {
      return this.aClass298_5973;
   }

   public boolean loadGameData() {
      if(!this.aBoolean_5962) {
         Class18.method99(false, 894402935);
      }

      this.failed = 0;

      int var2;
      for(var2 = 0; var2 < this.anInt_5985 * -1398426845; ++var2) {
         if(!Class293.cacheFile5Unpacker.method3571(this.anIntArray_5981[var2], -321607746)) {
            this.failed += 1065864263;
         }
      }

      if(this.worldMapStaticElements == null) {
         if(null != this.aClass240_Sub22_Sub8_5965 && CacheDownload.cache23Unpacker.entryExists(this.aClass240_Sub22_Sub8_5965.identifier + "_staticelements", (byte)74)) {
            if(!CacheDownload.cache23Unpacker.loadDataEntry(this.aClass240_Sub22_Sub8_5965.identifier + "_staticelements", 1573362439)) {
               this.failed += 1065864263;
            } else {
               this.worldMapStaticElements = Class486.method5740(CacheDownload.cache23Unpacker, this.aClass240_Sub22_Sub8_5965.identifier + "_staticelements", client.aBoolean_270, -1225838433);
            }
         } else {
            this.worldMapStaticElements = new MapElements(0);
         }
      }

      if(1717837175 * this.failed > 0) {
         if(this.anInt_5978 * 691615355 < 1717837175 * this.failed) {
            this.anInt_5978 = this.failed * 664183349;
         }

         this.aClass298_5973 = Class298.aClass298_5992;
         return false;
      } else {
         for(var2 = 0; var2 < this.anInt_5985 * -1398426845; ++var2) {
            if(null == this.aByteArrayArray_5982[var2]) {
               this.aByteArrayArray_5982[var2] = Class293.cacheFile5Unpacker.getDataBytes(this.anIntArray_5981[var2], Class271.aClass271_4686.anInt_4684 * -759200297, 685006961);
            }

            if(null == this.aByteArrayArray_5983[var2]) {
               this.aByteArrayArray_5983[var2] = Class293.cacheFile5Unpacker.getDataBytes(this.anIntArray_5981[var2], -759200297 * Class271.aClass271_4692.anInt_4684, -581308340);
            }

            if(this.aByteArrayArray_5969[var2] == null) {
               this.aByteArrayArray_5969[var2] = Class293.cacheFile5Unpacker.getDataBytes(this.anIntArray_5981[var2], -759200297 * Class271.aClass271_4687.anInt_4684, -839770203);
            }

            if(null == this.aByteArrayArray_5986[var2]) {
               this.aByteArrayArray_5986[var2] = Class293.cacheFile5Unpacker.getDataBytes(this.anIntArray_5981[var2], Class271.aClass271_4688.anInt_4684 * -759200297, -1706853888);
            }

            if(this.aByteArrayArray_5984 != null && this.aByteArrayArray_5984[var2] == null) {
               this.aByteArrayArray_5984[var2] = Class293.cacheFile5Unpacker.getDataBytes(this.anIntArray_5981[var2], Class271.aClass271_4685.anInt_4684 * -759200297, -889861458);
            }
         }

         var2 = 1159840285 * this.anInt_5976;
         Class580 var3 = new Class580(-1);
         Class580 var4 = new Class580(-1);
         this.anInt_5976 = 0;

         int var5;
         int var8;
         int var9;
         for(var5 = 0; var5 < this.anInt_5985 * -1398426845; ++var5) {
            byte[] var6 = this.aByteArrayArray_5983[var5];
            int var7;
            if(null != var6) {
               var7 = 64 * (this.anIntArray_5980[var5] >> 8) - 1265321541 * this.loadedMap.loadedMapX;
               var8 = 64 * (this.anIntArray_5980[var5] & 255) - this.loadedMap.loadedMapY * -1996781083;
               if(this.aClass305_5979.method3839(-2113892595)) {
                  var7 = 10;
                  var8 = 10;
               }

               var9 = Class283_Sub2.method5018(this.aClass529_5974, var6, var7, var8, -1807019437 * this.anInt_5958, this.anInt_5959 * -509677085, var4, var3, -582607209);
               if(var9 > 0) {
                  this.anInt_5976 += -1382739915 * var9;
               }
            }

            var6 = this.aByteArrayArray_5986[var5];
            if(var6 != null) {
               var7 = (this.anIntArray_5980[var5] >> 8) * 64 - this.loadedMap.loadedMapX * 1265321541;
               var8 = (this.anIntArray_5980[var5] & 255) * 64 - this.loadedMap.loadedMapY * -1996781083;
               if(this.aClass305_5979.method3839(352114985)) {
                  var7 = 10;
                  var8 = 10;
               }

               var9 = Class283_Sub2.method5018(this.aClass529_5974, var6, var7, var8, -1807019437 * this.anInt_5958, this.anInt_5959 * -509677085, var4, var3, 1402297138);
               if(var9 > 0) {
                  this.anInt_5976 += var9 * -1382739915;
               }
            }
         }

         if(1159840285 * this.anInt_5976 > 0) {
            if(this.anInt_5976 * 1159840285 == var2) {
               if(0 != -1636985579 * this.anInt_5989 && 1000 == client.timer * -1025618511 - -1636985579 * this.anInt_5989) {
                  Class71.method822(-2019063975 * var4.anInt_9703, var3.anInt_9703 * -2019063975, this.anInt_5976 * 1159840285, 417735300);
                  Class18.method94(-1975071764);
               }
            } else {
               this.anInt_5989 = client.timer * 431420717;
            }

            if(858763255 * this.anInt_5977 < 1159840285 * this.anInt_5976) {
               this.anInt_5977 = 822919563 * this.anInt_5976;
            }

            this.aClass298_5973 = Class298.aClass298_5994;
            return false;
         } else {
            if(!this.aBoolean_5962 && this.aClass298_5973 != Class298.aClass298_5995) {
               Class599.method6484(ServerString.loadingStr.getText(Class599.clientLanguage, -834278895) + Class8.aString_40 + "(100%)", true, Class286.gameRenderer, CacheDataNode.aTextRenderer_3243, Class1.aRSFont_10, -1079910025);
            }

            this.aClass298_5973 = Class298.aClass298_5993;
            if(!this.aBoolean_5962) {
               Class417.method5179((byte)24);
            }

            if(!this.aBoolean_5962) {
               for(var5 = 0; var5 < 2048; ++var5) {
                  Player var18 = client.aPlayerArray[var5];
                  if(null != var18) {
                     var18.worldObjects = null;
                  }
               }

               for(var5 = 0; var5 < client.aClass240_Sub9Array_271.length; ++var5) {
                  Class240_Sub9 var21 = client.aClass240_Sub9Array_271[var5];
                  if(null != var21) {
                     ((Class563_Sub1)var21.anObject_6783).worldObjects = null;
                  }
               }
            }

            if(!this.aBoolean_5962) {
               Class416.method5154(true, (byte)-7);
            }

            if(!this.aBoolean_5962) {
               Class225.method2843(1254339920);
            }

            boolean var20 = false;
            int var19;
            if(Class104_Sub21.renderSettings.aClass540_Sub22_7310.method4061(-1169455042) == 2) {
               for(var19 = 0; var19 < this.anInt_5985 * -1398426845; ++var19) {
                  if(null != this.aByteArrayArray_5986[var19] || null != this.aByteArrayArray_5969[var19]) {
                     var20 = true;
                     break;
                  }
               }
            }

            var19 = Class413.method5130(Class104_Sub21.renderSettings.aClass540_Sub28_7287.method4269(-819085062), -2008169634).anInt_1049 * -1953880856;
            if(Class286.gameRenderer.method1900()) {
               ++var19;
            }

            this.method3762(980291308);
            this.method3782(1267367216);
            this.worldObjects = new WorldObjects(Class286.gameRenderer, 9, 4, -1807019437 * this.anInt_5958, this.anInt_5959 * -509677085, var19, var20, Class286.gameRenderer.method1994() > 0);
            this.worldObjects.method3404(false, (byte)3);
            this.worldObjects.method3403(client.anInt_312 * 898537059, (byte)1);
            if(client.anInt_312 * 898537059 != 0) {
               this.worldObjects.method3451(Class585.aTextRenderer_9728, (byte)39);
            } else {
               this.worldObjects.method3451((FontRenderer)null, (byte)6);
            }

            this.aClass303_5975 = new Class303();
            this.aFloat_5968 = -0.05F + (float)(Math.random() / 10.0D);
            this.aClass377_Sub1_5953 = new Class377_Sub1(this.worldObjects, this.aClass529_5974, 4, -1807019437 * this.anInt_5958, this.anInt_5959 * -509677085, false, this.aClass281_5951, this.aClass588_5961);
            this.aClass377_Sub1_5953.method4789(298192685);
            this.aClass377_Sub1_5953.anInt_7191 = Class104_Sub21.renderSettings.aClass540_Sub32_7303.method4388(-1370363400) * -101648813;
            this.aClass377_Sub1_5953.aBoolean_7192 = Class104_Sub21.renderSettings.aClass540_Sub22_7310.method4061(-1607744629) == 2;
            this.aClass377_Sub1_5953.aBoolean_7193 = Class104_Sub21.renderSettings.aClass540_Sub26_7308.method4199(-279960341) == 1;
            this.aClass377_Sub1_5953.aBoolean_7196 = Class104_Sub21.renderSettings.aClass540_Sub1_7295.method1402((byte)-107) == 1;
            this.aClass377_Sub1_5953.aBoolean_7195 = Class104_Sub21.renderSettings.aClass540_Sub17_7299.method3986(1201038336) == 1;
            if(!this.aClass305_5979.method3839(1801009924)) {
               this.method3773(this.aClass377_Sub1_5953, this.aByteArrayArray_5982, -1045572911);
            } else {
               this.method3774(this.aClass377_Sub1_5953, this.aByteArrayArray_5982, (byte)-21);
            }

            if(this.aBoolean_5962) {
               this.method3784(50, (byte)88);
            }

            this.aClass588_5961.method6380(this.anInt_5958 * -1807019437 >> 4, this.anInt_5959 * -509677085 >> 4, -1623907584);
            this.aClass588_5961.method6373(this, -1348534751);
            if(var20) {
               this.worldObjects.method3404(true, (byte)3);
               this.aClass377_Sub1_5952 = new Class377_Sub1(this.worldObjects, this.aClass529_5974, 1, -1807019437 * this.anInt_5958, this.anInt_5959 * -509677085, true, this.aClass281_5951, this.aClass588_5961);
               this.aClass377_Sub1_5952.method4789(-62349515);
               this.aClass377_Sub1_5952.anInt_7191 = Class104_Sub21.renderSettings.aClass540_Sub32_7303.method4388(584962439) * -101648813;
               this.aClass377_Sub1_5952.aBoolean_7192 = Class104_Sub21.renderSettings.aClass540_Sub22_7310.method4061(-376293886) == 2;
               this.aClass377_Sub1_5952.aBoolean_7193 = Class104_Sub21.renderSettings.aClass540_Sub26_7308.method4199(-1969136642) == 1;
               this.aClass377_Sub1_5952.aBoolean_7196 = Class104_Sub21.renderSettings.aClass540_Sub1_7295.method1402((byte)-95) == 1;
               this.aClass377_Sub1_5952.aBoolean_7195 = Class104_Sub21.renderSettings.aClass540_Sub17_7299.method3986(831051702) == 1;
               if(!this.aClass305_5979.method3839(1959833796)) {
                  this.method3773(this.aClass377_Sub1_5952, this.aByteArrayArray_5969, -1045572911);
                  if(!this.aBoolean_5962) {
                     Class18.method99(true, 120979301);
                  }
               } else {
                  this.method3774(this.aClass377_Sub1_5952, this.aByteArrayArray_5969, (byte)14);
                  if(!this.aBoolean_5962) {
                     Class18.method99(true, -334159739);
                  }
               }

               this.aClass377_Sub1_5952.method4794(0, this.aClass377_Sub1_5953.anIntArrayArrayArray_7263[0]);
               this.aClass377_Sub1_5952.method4795(Class286.gameRenderer, (int[][][])null, 1838123054);
               this.worldObjects.method3404(false, (byte)3);
               if(this.aBoolean_5962) {
                  this.method3784(50, (byte)-107);
               }
            }

            this.aClass377_Sub1_5953.method4795(Class286.gameRenderer, var20?this.aClass377_Sub1_5952.anIntArrayArrayArray_7263:(int[][][])null, 513080882);
            if(!this.aClass305_5979.method3839(-521286586)) {
               if(!this.aBoolean_5962) {
                  Class18.method99(true, -1603149395);
               }

               this.method3775(this.aClass377_Sub1_5953, this.aByteArrayArray_5983, -286429515);
               if(this.aByteArrayArray_5984 != null) {
                  this.method3777(1107711675);
               }
            } else {
               if(!this.aBoolean_5962) {
                  Class18.method99(true, -100462728);
               }

               this.method3776(this.aClass377_Sub1_5953, this.aByteArrayArray_5983, 26693363);
            }

            if(!this.aBoolean_5962) {
               Class18.method99(true, 132733218);
            }

            this.aClass377_Sub1_5953.method4798(Class286.gameRenderer, var20?this.worldObjects.aClass171Array_4492[0]:null, (Plane)null, 792832006);
            if(this.aBoolean_5962) {
               this.method3784(75, (byte)-118);
            }

            this.aClass377_Sub1_5953.method5406(Class286.gameRenderer, false, (byte)0);
            if(this.aBoolean_5962) {
               this.method3784(75, (byte)33);
            }

            if(!this.aBoolean_5962) {
               Class18.method99(true, 1755042727);
            }

            if(var20) {
               this.worldObjects.method3404(true, (byte)3);
               if(!this.aBoolean_5962) {
                  Class18.method99(true, 1454934559);
               }

               if(!this.aClass305_5979.method3839(-727787581)) {
                  this.method3775(this.aClass377_Sub1_5952, this.aByteArrayArray_5986, 88176175);
               } else {
                  this.method3776(this.aClass377_Sub1_5952, this.aByteArrayArray_5986, -1226373071);
               }

               if(!this.aBoolean_5962) {
                  Class18.method99(true, -1318859359);
               }

               this.aClass377_Sub1_5952.method4798(Class286.gameRenderer, (Plane)null, this.worldObjects.aClass171Array_4486[0], -1393376182);
               this.aClass377_Sub1_5952.method5406(Class286.gameRenderer, true, (byte)0);
               if(!this.aBoolean_5962) {
                  Class18.method99(true, 556700598);
               }

               this.worldObjects.method3404(false, (byte)3);
               if(this.aBoolean_5962) {
                  this.method3784(50, (byte)4);
               }
            }

            this.aClass377_Sub1_5953.method4790(-793247680);
            if(null != this.aClass377_Sub1_5952) {
               this.aClass377_Sub1_5952.method4790(910733974);
            }

            this.worldObjects.method3452((byte)22);
            if(this.aBoolean_5962) {
               Class373.getCurrentTime((short)9803);

               while(!Class286.gameRenderer.method1943(-1543706537)) {
                  this.method3784(1, (byte)15);
               }
            }

            boolean var22 = false;
            if(this.aBoolean_5962) {
               Class296 var23 = client.aClass296_348;
               this.method3763(var23, -1465422122);
               Class476.aClass306_8741.method3852(var23, -708028207);
               var22 = true;
               Class373.getCurrentTime((short)22018);
               Object var24 = client.anObject_351;
               synchronized(client.anObject_351) {
                  client.aBoolean_349 = true;

                  try {
                     client.anObject_351.wait();
                  } catch (InterruptedException var16) {
                     ;
                  }
               }

               client.aClass296_348 = this;
               var23.method3782(1357805796);
               this.method3781(10, -924952065);
               this.method3768((byte)-66);
            } else {
               Class417.method5179((byte)24);
               this.aClass588_5961.method6386(-1744746237);
               Class77.method983(2105014757);
            }

            int var10;
            for(var8 = 0; var8 < 4; ++var8) {
               for(var9 = 0; var9 < this.anInt_5958 * -1807019437; ++var9) {
                  for(var10 = 0; var10 < this.anInt_5959 * -509677085; ++var10) {
                     Class377_Sub1.method5409(var8, var9, var10, (byte)9);
                  }
               }
            }

            for(var8 = 0; var8 < client.aClass235Array_306.length; ++var8) {
               if(null != client.aClass235Array_306[var8]) {
                  client.aClass235Array_306[var8].method3049(this.worldObjects, -831324111);
               }
            }

            Class488.method5744((byte)1);
            Class283_Sub3.method5140(700646522);
            Class240_Sub27 var26;
            if(Class363.method4614(590569383) == Class224.aClass224_3843 && client.gameConnectionHandler.getServerConnection() != null && -243034353 * client.loginStage == 10) {
               var26 = Class47_Sub1.method3496(Class326.aClass326_6309, client.gameConnectionHandler.aClass528_3433, 1917447504);
               var26.aClass240_Sub8_Sub1_7370.putIntBE(1057001181, 2062892803);
               client.gameConnectionHandler.addPacket(var26, 707312379);
            }

            if(!this.aClass305_5979.method3839(-1698547248)) {
               var8 = (this.anInt_5956 * 210015403 - (this.anInt_5958 * -1807019437 >> 4)) / 8;
               var9 = (210015403 * this.anInt_5956 + (-1807019437 * this.anInt_5958 >> 4)) / 8;
               var10 = (this.anInt_5957 * 1888189517 - (-509677085 * this.anInt_5959 >> 4)) / 8;
               int var11 = (1888189517 * this.anInt_5957 + (-509677085 * this.anInt_5959 >> 4)) / 8;

               for(int var12 = var8 - 1; var12 <= var9 + 1; ++var12) {
                  for(int var13 = var10 - 1; var13 <= var11 + 1; ++var13) {
                     if(var12 < var8 || var12 > var9 || var13 < var10 || var13 > var11) {
                        Class293.cacheFile5Unpacker.method3567(this.method3785(var12, var13, (byte)-106), (byte)31);
                     }
                  }
               }
            }

            if(-243034353 * client.loginStage == 13) {
               Class418.method5190(5, (byte)-48);
            } else if(14 == -243034353 * client.loginStage) {
               Class418.method5190(4, (byte)-30);
            } else if(-243034353 * client.loginStage == 11) {
               Class418.method5190(2, (byte)-36);
            } else if(client.loginStage * -243034353 == 12) {
               Class418.method5190(3, (byte)-112);
            } else {
               Class418.method5190(6, (byte)-122);
               if(client.gameConnectionHandler.getServerConnection() != null) {
                  var26 = Class47_Sub1.method3496(Class326.aClass326_6235, client.gameConnectionHandler.aClass528_3433, 1917447504);
                  client.gameConnectionHandler.addPacket(var26, 891741186);
               }
            }

            Class212.method2664(-218781707);
            if(this.aBoolean_5988) {
               Class19.addStringToConsole(Long.toString(Class373.getCurrentTime((short)12126) - -501230014718230693L * this.aLong_5963), -210808977);
               this.aBoolean_5988 = false;
            }

            if(var22) {
               Object var25 = client.anObject_350;
               synchronized(client.anObject_350) {
                  client.anObject_350.notify();
               }
            }

            return true;
         }
      }
   }

   void method3773(Class377_Sub1 var1, byte[][] var2, int var3) {
      int var4 = var2.length;

      int var5;
      for(var5 = 0; var5 < var4; ++var5) {
         byte[] var6 = var2[var5];
         if(null != var6) {
            ByteArrayDataNode var7 = new ByteArrayDataNode(var6);
            int var8 = this.anIntArray_5980[var5] >> 8;
            int var9 = this.anIntArray_5980[var5] & 255;
            int var10 = 64 * var8 - 1265321541 * this.loadedMap.loadedMapX;
            int var11 = 64 * var9 - -1996781083 * this.loadedMap.loadedMapY;
            if(!this.aBoolean_5962) {
               Class417.method5179((byte)24);
            }

            var1.method4792(var7, var10, var11, 1265321541 * this.loadedMap.loadedMapX, -1996781083 * this.loadedMap.loadedMapY, -233735650);
            var1.method5399(Class286.gameRenderer, var7, var10, var11, 784717923);
         }
      }

      for(var5 = 0; var5 < var4; ++var5) {
         int var12 = (this.anIntArray_5980[var5] >> 8) * 64 - this.loadedMap.loadedMapX * 1265321541;
         int var13 = 64 * (this.anIntArray_5980[var5] & 255) - -1996781083 * this.loadedMap.loadedMapY;
         byte[] var14 = var2[var5];
         if(var14 == null && 1888189517 * this.anInt_5957 < 800) {
            if(!this.aBoolean_5962) {
               Class417.method5179((byte)24);
            }

            var1.method4806(var12, var13, 64, 64, 2024021112);
         }
      }

   }

   void method3774(Class377_Sub1 var1, byte[][] var2, byte var3) {
      int var4;
      int var5;
      int var6;
      int var7;
      for(var4 = 0; var4 < var1.cubeStack * 1527979441; ++var4) {
         if(!this.aBoolean_5962) {
            Class417.method5179((byte)24);
         }

         for(var5 = 0; var5 < this.anInt_5958 * -1807019437 >> 3; ++var5) {
            for(var6 = 0; var6 < this.anInt_5959 * -509677085 >> 3; ++var6) {
               var7 = this.anIntArrayArrayArray_5960[var4][var5][var6];
               if(var7 != -1) {
                  int var8 = var7 >> 24 & 3;
                  if(!var1.aBoolean_7199 || 0 == var8) {
                     int var9 = var7 >> 1 & 3;
                     int var10 = var7 >> 14 & 1023;
                     int var11 = var7 >> 3 & 2047;
                     int var12 = (var10 / 8 << 8) + var11 / 8;

                     for(int var13 = 0; var13 < this.anIntArray_5980.length; ++var13) {
                        if(this.anIntArray_5980[var13] == var12 && var2[var13] != null) {
                           ByteArrayDataNode var14 = new ByteArrayDataNode(var2[var13]);
                           var1.method4793(var14, var4, 8 * var5, var6 * 8, var8, var10, var11, var9, -668803762);
                           var1.method5400(Class286.gameRenderer, var14, var4, var5 * 8, 8 * var6, var8, var10, var11, var9, 23950713);
                           break;
                        }
                     }
                  }
               }
            }
         }
      }

      for(var4 = 0; var4 < 1527979441 * var1.cubeStack; ++var4) {
         if(!this.aBoolean_5962) {
            Class417.method5179((byte)24);
         }

         for(var5 = 0; var5 < -1807019437 * this.anInt_5958 >> 3; ++var5) {
            for(var6 = 0; var6 < this.anInt_5959 * -509677085 >> 3; ++var6) {
               var7 = this.anIntArrayArrayArray_5960[var4][var5][var6];
               if(-1 == var7) {
                  var1.method4791(var4, 8 * var5, 8 * var6, 8, 8, 1984721177);
               }
            }
         }
      }

   }

   void method3775(Class377_Sub1 var1, byte[][] var2, int var3) {
      for(int var4 = 0; var4 < -1398426845 * this.anInt_5985; ++var4) {
         byte[] var5 = var2[var4];
         if(null != var5) {
            int var6 = (this.anIntArray_5980[var4] >> 8) * 64 - this.loadedMap.loadedMapX * 1265321541;
            int var7 = 64 * (this.anIntArray_5980[var4] & 255) - this.loadedMap.loadedMapY * -1996781083;
            if(!this.aBoolean_5962) {
               Class417.method5179((byte)24);
            }

            var1.method5398(Class286.gameRenderer, var5, var6, var7, -1600072879);
            if(this.aBoolean_5962) {
               this.method3784(10, (byte)-71);
            }
         }
      }

   }

   void method3776(Class377_Sub1 var1, byte[][] var2, int var3) {
      for(int var4 = 0; var4 < 1527979441 * var1.cubeStack; ++var4) {
         if(!this.aBoolean_5962) {
            Class417.method5179((byte)24);
         }

         for(int var5 = 0; var5 < this.anInt_5958 * -1807019437 >> 3; ++var5) {
            for(int var6 = 0; var6 < -509677085 * this.anInt_5959 >> 3; ++var6) {
               int var7 = this.anIntArrayArrayArray_5960[var4][var5][var6];
               if(-1 != var7) {
                  int var8 = var7 >> 24 & 3;
                  if(!var1.aBoolean_7199 || var8 == 0) {
                     int var9 = var7 >> 1 & 3;
                     int var10 = var7 >> 14 & 1023;
                     int var11 = var7 >> 3 & 2047;
                     int var12 = (var10 / 8 << 8) + var11 / 8;

                     for(int var13 = 0; var13 < this.anIntArray_5980.length; ++var13) {
                        if(var12 == this.anIntArray_5980[var13] && null != var2[var13]) {
                           var1.method5404(Class286.gameRenderer, var2[var13], var4, 8 * var5, var6 * 8, var8, 8 * (var10 & 7), 8 * (var11 & 7), var9, (byte)60);
                           break;
                        }
                     }
                  }
               }

               if(this.aBoolean_5962) {
                  this.method3784(5, (byte)-44);
               }
            }
         }
      }

   }

   void method3777(int var1) {
      int var2 = this.aByteArrayArray_5984.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         if(null != this.aByteArrayArray_5984[var3]) {
            int var4 = -1;

            for(int var5 = 0; var5 < client.anInt_353 * -202870881; ++var5) {
               if(client.anIntArray_352[var5] == this.anIntArray_5980[var3]) {
                  var4 = var5;
                  break;
               }
            }

            if(var4 == -1) {
               client.anIntArray_352[-202870881 * client.anInt_353] = this.anIntArray_5980[var3];
               var4 = (client.anInt_353 += 455666783) * -202870881 - 1;
            }

            ByteArrayDataNode var18 = new ByteArrayDataNode(this.aByteArrayArray_5984[var3]);
            int var6 = 0;

            while(var18.index * 964952859 < this.aByteArrayArray_5984[var3].length && var6 < 511 && 1636714459 * client.availableNPCS < 1023) {
               int var7 = var4 | var6++ << 6;
               int var8 = var18.readShort(-78534511);
               int var9 = var8 >> 14;
               int var10 = var8 >> 7 & 63;
               int var11 = var8 & 63;
               int var12 = 64 * (this.anIntArray_5980[var3] >> 8) - 1265321541 * this.loadedMap.loadedMapX + var10;
               int var13 = 64 * (this.anIntArray_5980[var3] & 255) - -1996781083 * this.loadedMap.loadedMapY + var11;
               NPCComposite var14 = Class104_Sub6.characterUnpacker.method5670(var18.readShort(-515869781), 780407722);
               Class240_Sub9 var15 = (Class240_Sub9)client.npcNodeList.getNode((long)var7);
               if(var15 == null && (var14.aByte_8671 & 1) > 0 && var12 >= 0 && -1792142631 * var14.anInt_8665 + var12 < -1807019437 * this.anInt_5958 && var13 >= 0 && var13 + var14.anInt_8665 * -1792142631 < -509677085 * this.anInt_5959) {
                  NPC var16 = new NPC(this.worldObjects);
                  var16.index = var7 * -1106794769;
                  Class240_Sub9 var17 = new Class240_Sub9(var16);
                  client.npcNodeList.insert(var17, (long)var7);
                  client.aClass240_Sub9Array_271[(client.anInt_334 += -471050069) * 1910301187 - 1] = var17;
                  client.npcIndices[(client.availableNPCS += 451173459) * 1636714459 - 1] = var7;
                  var16.anInt_4290 = client.timer * 926176209;
                  var16.method1151(var14, 919538933);
                  var16.method3256(var16.npcComposite.anInt_8665 * -1792142631, 59220262);
                  var16.anInt_4340 = 258100611 * (-1526252727 * var16.npcComposite.anInt_8660 << 3);
                  var16.turnTo(var16.npcComposite.aClass536_8621.method6066(-1006622413).getLanguageID(-1866104656) << 11 & 16383, true, -1617078419);
                  var16.method1157(var9, var12, var13, true, var16.method3257(), 1212475861);
               }
            }
         }
      }

   }

   public int method3778(int var1) {
      return -902920639 * this.anInt_5987;
   }

   public int method3779(int var1) {
      return 100 - 19911508 * this.anInt_5976 / (this.anInt_5977 * 858763255);
   }

   public int method3780(int var1) {
      return this.anInt_5964 * -1784373511;
   }

   void method3781(int var1, int var2) {
      int var3 = this.loadedMap.loadedMapX * 1265321541 - 1265321541 * this.aClass626_5967.loadedMapX;
      int var4 = -1996781083 * this.loadedMap.loadedMapY - -1996781083 * this.aClass626_5967.loadedMapY;
      int var5;
      int var8;
      int var17;
      int var16;
      if(var1 == 10) {
         for(var5 = 0; var5 < 1910301187 * client.anInt_334; ++var5) {
            Class240_Sub9 var6 = client.aClass240_Sub9Array_271[var5];
            if(var6 != null) {
               NPC var7 = (NPC)var6.anObject_6783;

               for(var8 = 0; var8 < var7.tilePosArrayX.length; ++var8) {
                  var7.tilePosArrayX[var8] -= var3;
                  var7.tilePosArrayY[var8] -= var4;
               }

               GameCoord var22 = GameCoord.method4308(var7.method6203().gameCoord);
               var22.floatX -= (float)(512 * var3);
               var22.floatZ -= (float)(512 * var4);
               var7.setPos(var22);
               var22.store();
            }
         }
      } else {
         boolean var14 = false;
         client.availableNPCS = 0;
         var16 = this.anInt_5958 * -1775983104 - 512;
         var17 = 1038337536 * this.anInt_5959 - 512;

         for(var8 = 0; var8 < 1910301187 * client.anInt_334; ++var8) {
            Class240_Sub9 var9 = client.aClass240_Sub9Array_271[var8];
            if(var9 != null) {
               NPC var10 = (NPC)var9.anObject_6783;
               GameCoord var11 = GameCoord.method4308(var10.method6203().gameCoord);
               var11.floatX -= (float)(512 * var3);
               var11.floatZ -= (float)(var4 * 512);
               var10.setPos(var11);
               if((int)var11.floatX >= 0 && (int)var11.floatX <= var16 && (int)var11.floatZ >= 0 && (int)var11.floatZ <= var17) {
                  boolean var12 = true;

                  for(int var13 = 0; var13 < var10.tilePosArrayX.length; ++var13) {
                     var10.tilePosArrayX[var13] -= var3;
                     var10.tilePosArrayY[var13] -= var4;
                     if(var10.tilePosArrayX[var13] < 0 || var10.tilePosArrayX[var13] >= -1807019437 * this.anInt_5958 || var10.tilePosArrayY[var13] < 0 || var10.tilePosArrayY[var13] >= this.anInt_5959 * -509677085) {
                        var12 = false;
                     }
                  }

                  if(var12) {
                     client.npcIndices[(client.availableNPCS += 451173459) * 1636714459 - 1] = 50743311 * var10.index;
                  } else {
                     var10.method1151((NPCComposite)null, -153323776);
                     var9.shiftNext();
                     var14 = true;
                  }
               } else {
                  var10.method1151((NPCComposite)null, -2084176107);
                  var9.shiftNext();
                  var14 = true;
               }

               var11.store();
            }
         }

         if(var14) {
            client.anInt_334 = client.npcNodeList.size() * -471050069;
            var8 = 0;

            Class240_Sub9 var27;
            for(Iterator var24 = client.npcNodeList.iterator(); var24.hasNext(); client.aClass240_Sub9Array_271[var8++] = var27) {
               var27 = (Class240_Sub9)var24.next();
            }
         }
      }

      for(var5 = 0; var5 < 2048; ++var5) {
         Player var15 = client.aPlayerArray[var5];
         if(null != var15) {
            for(var17 = 0; var17 < var15.tilePosArrayX.length; ++var17) {
               var15.tilePosArrayX[var17] -= var3;
               var15.tilePosArrayY[var17] -= var4;
            }

            GameCoord var23 = GameCoord.method4308(var15.method6203().gameCoord);
            var23.floatX -= (float)(512 * var3);
            var23.floatZ -= (float)(var4 * 512);
            var15.setPos(var23);
            var23.store();
         }
      }

      HintMarker[] var18 = client.hintMarkers;

      for(var16 = 0; var16 < var18.length; ++var16) {
         HintMarker var21 = var18[var16];
         if(var21 != null) {
            var21.markerX -= -1501790720 * var3;
            var21.markerZ -= var4 * 1847198208;
         }
      }

      Class240_Sub30 var19;
      for(var19 = (Class240_Sub30)Class240_Sub30.aNodeList_7421.getBaseNode_2((byte)103); var19 != null; var19 = (Class240_Sub30)Class240_Sub30.aNodeList_7421.getNext(-1319815812)) {
         var19.anInt_7409 -= var3 * 813050941;
         var19.anInt_7422 -= var4 * 1933126473;
         if(this.aClass305_5979 != Class305.aClass305_6029 && (-1480406251 * var19.anInt_7409 < 0 || -1398294791 * var19.anInt_7422 < 0 || var19.anInt_7409 * -1480406251 >= this.anInt_5958 * -1807019437 || -1398294791 * var19.anInt_7422 >= this.anInt_5959 * -509677085)) {
            var19.shiftNext();
         }
      }

      for(var19 = (Class240_Sub30)Class240_Sub30.aNodeList_7408.getBaseNode_2((byte)75); null != var19; var19 = (Class240_Sub30)Class240_Sub30.aNodeList_7408.getNext(-533267515)) {
         var19.anInt_7409 -= 813050941 * var3;
         var19.anInt_7422 -= var4 * 1933126473;
         if(Class305.aClass305_6029 != this.aClass305_5979 && (var19.anInt_7409 * -1480406251 < 0 || var19.anInt_7422 * -1398294791 < 0 || var19.anInt_7409 * -1480406251 >= -1807019437 * this.anInt_5958 || var19.anInt_7422 * -1398294791 >= -509677085 * this.anInt_5959)) {
            var19.shiftNext();
         }
      }

      for(Class240_Sub25 var20 = (Class240_Sub25)client.groundItems.start(); var20 != null; var20 = (Class240_Sub25)client.groundItems.next()) {
         var17 = (int)(4058728944299054175L * var20.id >> 28 & 3L);
         var8 = (int)(4058728944299054175L * var20.id & 16383L);
         int var25 = var8 - this.loadedMap.loadedMapX * 1265321541;
         int var28 = (int)(4058728944299054175L * var20.id >> 14 & 16383L);
         int var26 = var28 - -1996781083 * this.loadedMap.loadedMapY;
         if(null != this.worldObjects) {
            if(var25 >= 0 && var26 >= 0 && var25 < -1807019437 * this.anInt_5958 && var26 < this.anInt_5959 * -509677085 && var25 < 1346434785 * this.worldObjects.anInt_4481 && var26 < this.worldObjects.anInt_4479 * -1775771909) {
               if(this.worldObjects.tiles != null) {
                  this.worldObjects.method3445(var17, var25, var26, -580525454);
               }
            } else if(Class305.aClass305_6029 != this.aClass305_5979) {
               var20.shiftNext();
            }
         }
      }

      if(-516904107 * Class192.flagX != 0) {
         Class192.flagX -= var3 * 624818685;
         Class192.flagY -= var4 * -2043346881;
      }

      Class131.method1684(173772231);
      Class357.method4549(false, (byte)-102);
      if(10 == var1) {
         client.anInt_385 -= var3 * -29291008;
         client.anInt_534 -= 1274947072 * var4;
         Class326.anInt_6334 -= 1763187200 * var3;
         Class349.anInt_6617 -= var4 * -1695207936;
         if(1735950531 * Class509.anInt_9182 != 4 && 2 != Class509.anInt_9182 * 1735950531) {
            Plane.method2165(AbstractCacheData.method4679(647514803), (byte)17);
         }
      } else {
         Class183.anInt_3179 -= 746340469 * var3;
         Class326.anInt_6335 -= -1653277631 * var4;
         ParameterNode.anInt_8078 -= 924766747 * var3;
         Class34_Sub1.anInt_3742 -= var4 * 1559848513;
         Class330.anInt_6406 -= var3 * 1084581376;
         Class373.anInt_7118 -= 1319899648 * var4;
         if(Math.abs(var3) > this.anInt_5958 * -1807019437 || Math.abs(var4) > -509677085 * this.anInt_5959) {
            this.aClass588_5961.method6383((byte)-69);
         }
      }

      Class297.method3799(-1434407615);
      Class300.method3814(2078031433);
      client.aNodeArrayList_277.method5938(1572031240);
      client.aNodeList_570.clear(-1205870048);
      client.aClass512_457.method5928(-2101615122);
      Class43_Sub1.method3319((byte)-36);
   }

   void method3782(int var1) {
      this.aClass377_Sub1_5952 = null;
      this.aClass377_Sub1_5953 = null;
      if(null != this.aClass281_5951) {
         this.aClass281_5951.method3643((byte)-3);
      }

      if(null != this.aClass588_5961) {
         this.aClass588_5961.method6379(-559645309);
      }

      if(null != this.worldObjects) {
         this.worldObjects.aClass636_4518.method6715(-359119602);
         this.worldObjects = null;
      }

   }

   public WorldObjects getWorldObjects() {
      return this.worldObjects;
   }

   void method3784(int var1, byte var2) {
      try {
         Thread.sleep((long)var1);
      } catch (InterruptedException var4) {
         ;
      }

   }

   int method3785(int var1, int var2, byte var3) {
      return var1 | var2 << 7;
   }

   public Class296(boolean var1) {
      this.aBoolean_5962 = var1;
   }

   public void method3786(int var1) {
      this.aClass588_5961 = new Class588(Class286.gameRenderer, this.anInt_5958 * -1807019437 >> 3, -509677085 * this.anInt_5959 >> 3);
   }

   public void method3787(short var1) {
      if(this.worldObjects != null) {
         FontRenderer_Sub1.method7080(-792089044);
         this.worldObjects.aClass636_4518.method6715(-359119602);
         this.worldObjects = null;
      }

   }

   public void method3788(Class529 var1, byte var2) {
      this.aClass529_5974 = var1;
   }

   public void method3789(byte var1) {
      if(this.aBoolean_5962) {
         this.method3770(1722939566);
         Class494.method5780(true, -1626899059);
         Class296 var2 = client.aClass296_348;
         this.anInt_5985 = 1 * var2.anInt_5985;
         this.anIntArray_5980 = var2.anIntArray_5980;
         this.anIntArray_5981 = var2.anIntArray_5981;
         this.aByteArrayArray_5982 = var2.aByteArrayArray_5982;
         this.aByteArrayArray_5983 = var2.aByteArrayArray_5983;
         this.aByteArrayArray_5984 = var2.aByteArrayArray_5984;
         this.aByteArrayArray_5969 = var2.aByteArrayArray_5969;
         this.aByteArrayArray_5986 = var2.aByteArrayArray_5986;
         this.aClass281_5951 = var2.aClass281_5951;
         this.aClass588_5961 = var2.aClass588_5961;
         this.anIntArrayArrayArray_5960 = var2.anIntArrayArrayArray_5960;
         this.anInt_5987 = 1 * var2.anInt_5987;
         this.anInt_5964 = 1 * var2.anInt_5964;
         this.aClass240_Sub22_Sub8_5965 = var2.aClass240_Sub22_Sub8_5965;
         this.worldMapStaticElements = var2.worldMapStaticElements;
         this.anIntArrayArray_5970 = var2.anIntArrayArray_5970;
         this.anIntArrayArray_5971 = var2.anIntArrayArray_5971;
         this.aByteArrayArrayArray_5972 = var2.aByteArrayArrayArray_5972;
         this.aClass305_5979 = var2.aClass305_5979;
         this.aClass40_5949 = var2.aClass40_5949;
         this.loadedMap = var2.loadedMap;
         this.aClass626_5967 = var2.aClass626_5967;
         this.anInt_5956 = 1 * var2.anInt_5956;
         this.anInt_5957 = var2.anInt_5957 * 1;
         this.anInt_5958 = var2.anInt_5958 * 1;
         this.anInt_5959 = var2.anInt_5959 * 1;
      } else if(5 == -243034353 * client.loginStage) {
         Class418.method5190(13, (byte)-22);
      } else if(-243034353 * client.loginStage == 4) {
         Class418.method5190(14, (byte)-76);
      } else if(2 == client.loginStage * -243034353) {
         Class418.method5190(11, (byte)-56);
      } else if(client.loginStage * -243034353 == 6) {
         Class418.method5190(10, (byte)-11);
      } else if(3 == -243034353 * client.loginStage) {
         Class418.method5190(12, (byte)-109);
      }

   }

   static final void method3790(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1999959911 * Class11.anInt_101;
   }

   static final void method3791(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = (int)(-4167777861970946613L * Class276.aLong_4726 / 60000L);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = (int)((Class276.aLong_4726 * -4167777861970946613L - Class373.getCurrentTime((short)4745) - -5994637023512605499L * ParameterNode.aLong_8077) / 60000L);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class582.aBoolean_9707?1:0;
   }

   static final void method3792(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      if(Class557.extractInterfaceIntData(var4, var2, 1856578416) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2570 = Class133.extractInterfaceData(var4, var2, (byte)35);
      var0.aBoolean_2524 = true;
   }

   static final void method3793(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -1416056414;
      if(var0.intTypes[var0.intTypeIndex * -831324111] > var0.intTypes[1 + -831324111 * var0.intTypeIndex]) {
         var0.anInt_9510 += -1856838429 * var0.anIntArray_9518[var0.anInt_9510 * -1756266293];
      }

   }

   static final void method3794(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      Class35.method275(var3, var0, 1546393031);
   }
}
