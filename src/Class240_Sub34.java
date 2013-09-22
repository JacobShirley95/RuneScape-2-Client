
public class Class240_Sub34 extends NodeListNode {

   byte[] aByteArray_7482 = new byte[128];
   Class240_Sub7_Sub1[] aClass240_Sub7_Sub1Array_7483 = new Class240_Sub7_Sub1[128];
   int[] anIntArray_7484 = new int[128];
   short[] aShortArray_7485 = new short[128];
   int anInt_7486;
   Class119[] aClass119Array_7487 = new Class119[128];
   byte[] aByteArray_7488 = new byte[128];
   byte[] aByteArray_7489 = new byte[128];


   void method4888(short var1) {
      this.anIntArray_7484 = null;
   }

   boolean method4889(Class312 var1, byte[] var2, int[] var3, int var4) {
      boolean var5 = true;
      int var6 = 0;
      Object var7 = null;

      for(int var8 = 0; var8 < 128; ++var8) {
         if(var2 == null || 0 != var2[var8]) {
            int var9 = this.anIntArray_7484[var8];
            if(0 != var9) {
               if(var6 != var9) {
                  var6 = var9--;
                  if((var9 & 1) == 0) {
                     var7 = var1.method3881(var9 >> 2, var3, (byte)2);
                  } else {
                     var7 = var1.method3882(var9 >> 2, var3, 1955397364);
                  }

                  if(var7 == null) {
                     var5 = false;
                  }
               }

               if(var7 != null) {
                  this.aClass240_Sub7_Sub1Array_7483[var8] = (Class240_Sub7_Sub1)var7;
                  this.anIntArray_7484[var8] = 0;
               }
            }
         }
      }

      return var5;
   }

   Class240_Sub34(byte[] var1) {
      ByteArrayDataNode var2 = new ByteArrayDataNode(var1);

      int var3;
      for(var3 = 0; 0 != var2.data[var3 + var2.index * 964952859]; ++var3) {
         ;
      }

      byte[] var4 = new byte[var3];

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         var4[var5] = var2.getByte((byte)93);
      }

      var2.index += -2043502829;
      ++var3;
      var5 = 964952859 * var2.index;
      var2.index += -2043502829 * var3;

      int var6;
      for(var6 = 0; 0 != var2.data[var6 + var2.index * 964952859]; ++var6) {
         ;
      }

      byte[] var7 = new byte[var6];

      int var8;
      for(var8 = 0; var8 < var6; ++var8) {
         var7[var8] = var2.getByte((byte)21);
      }

      var2.index += -2043502829;
      ++var6;
      var8 = 964952859 * var2.index;
      var2.index += var6 * -2043502829;

      int var9;
      for(var9 = 0; var2.data[var9 + 964952859 * var2.index] != 0; ++var9) {
         ;
      }

      byte[] var10 = new byte[var9];

      for(int var11 = 0; var11 < var9; ++var11) {
         var10[var11] = var2.getByte((byte)14);
      }

      var2.index += -2043502829;
      ++var9;
      byte[] var36 = new byte[var9];
      int var13;
      int var14;
      if(var9 > 1) {
         var36[1] = 1;
         int var12 = 1;
         var13 = 2;

         for(var14 = 2; var14 < var9; ++var14) {
            int var15 = var2.readByte(-675305093);
            if(0 == var15) {
               var12 = var13++;
            } else {
               if(var15 <= var12) {
                  --var15;
               }

               var12 = var15;
            }

            var36[var14] = (byte)var12;
         }
      } else {
         var13 = var9;
      }

      Class119[] var37 = new Class119[var13];

      Class119 var40;
      for(var14 = 0; var14 < var37.length; ++var14) {
         var40 = var37[var14] = new Class119();
         int var16 = var2.readByte(2084885181);
         if(var16 > 0) {
            var40.aByteArray_2105 = new byte[var16 * 2];
         }

         var16 = var2.readByte(1941260273);
         if(var16 > 0) {
            var40.aByteArray_2102 = new byte[2 * var16 + 2];
            var40.aByteArray_2102[1] = 64;
         }
      }

      var14 = var2.readByte(576199077);
      byte[] var39 = var14 > 0?new byte[var14 * 2]:null;
      var14 = var2.readByte(749840836);
      byte[] var38 = var14 > 0?new byte[2 * var14]:null;

      int var17;
      for(var17 = 0; 0 != var2.data[var17 + 964952859 * var2.index]; ++var17) {
         ;
      }

      byte[] var18 = new byte[var17];

      int var19;
      for(var19 = 0; var19 < var17; ++var19) {
         var18[var19] = var2.getByte((byte)20);
      }

      var2.index += -2043502829;
      ++var17;
      var19 = 0;

      int var20;
      for(var20 = 0; var20 < 128; ++var20) {
         var19 += var2.readByte(1379103626);
         this.aShortArray_7485[var20] = (short)var19;
      }

      var19 = 0;

      for(var20 = 0; var20 < 128; ++var20) {
         var19 += var2.readByte(3725773);
         this.aShortArray_7485[var20] = (short)(this.aShortArray_7485[var20] + (var19 << 8));
      }

      var20 = 0;
      int var21 = 0;
      int var22 = 0;

      int var23;
      for(var23 = 0; var23 < 128; ++var23) {
         if(var20 == 0) {
            if(var21 < var18.length) {
               var20 = var18[var21++];
            } else {
               var20 = -1;
            }

            var22 = var2.method4471(-1760422058);
         }

         this.aShortArray_7485[var23] = (short)(this.aShortArray_7485[var23] + ((var22 - 1 & 2) << 14));
         this.anIntArray_7484[var23] = var22;
         --var20;
      }

      var20 = 0;
      var21 = 0;
      var23 = 0;

      int var24;
      for(var24 = 0; var24 < 128; ++var24) {
         if(0 != this.anIntArray_7484[var24]) {
            if(0 == var20) {
               if(var21 < var4.length) {
                  var20 = var4[var21++];
               } else {
                  var20 = -1;
               }

               var23 = var2.data[var5++] - 1;
            }

            this.aByteArray_7488[var24] = (byte)var23;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      var24 = 0;

      for(int var25 = 0; var25 < 128; ++var25) {
         if(this.anIntArray_7484[var25] != 0) {
            if(0 == var20) {
               if(var21 < var7.length) {
                  var20 = var7[var21++];
               } else {
                  var20 = -1;
               }

               var24 = var2.data[var8++] + 16 << 2;
            }

            this.aByteArray_7482[var25] = (byte)var24;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      Class119 var42 = null;

      int var26;
      for(var26 = 0; var26 < 128; ++var26) {
         if(0 != this.anIntArray_7484[var26]) {
            if(0 == var20) {
               var42 = var37[var36[var21]];
               if(var21 < var10.length) {
                  var20 = var10[var21++];
               } else {
                  var20 = -1;
               }
            }

            this.aClass119Array_7487[var26] = var42;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      var26 = 0;

      int var27;
      for(var27 = 0; var27 < 128; ++var27) {
         if(var20 == 0) {
            if(var21 < var18.length) {
               var20 = var18[var21++];
            } else {
               var20 = -1;
            }

            if(this.anIntArray_7484[var27] > 0) {
               var26 = var2.readByte(1076242407) + 1;
            }
         }

         this.aByteArray_7489[var27] = (byte)var26;
         --var20;
      }

      this.anInt_7486 = (var2.readByte(1200751382) + 1) * -1961532461;

      int var29;
      Class119 var28;
      for(var27 = 0; var27 < var13; ++var27) {
         var28 = var37[var27];
         if(var28.aByteArray_2105 != null) {
            for(var29 = 1; var29 < var28.aByteArray_2105.length; var29 += 2) {
               var28.aByteArray_2105[var29] = var2.getByte((byte)6);
            }
         }

         if(var28.aByteArray_2102 != null) {
            for(var29 = 3; var29 < var28.aByteArray_2102.length - 2; var29 += 2) {
               var28.aByteArray_2102[var29] = var2.getByte((byte)68);
            }
         }
      }

      if(null != var39) {
         for(var27 = 1; var27 < var39.length; var27 += 2) {
            var39[var27] = var2.getByte((byte)64);
         }
      }

      if(null != var38) {
         for(var27 = 1; var27 < var38.length; var27 += 2) {
            var38[var27] = var2.getByte((byte)17);
         }
      }

      for(var27 = 0; var27 < var13; ++var27) {
         var28 = var37[var27];
         if(var28.aByteArray_2102 != null) {
            var19 = 0;

            for(var29 = 2; var29 < var28.aByteArray_2102.length; var29 += 2) {
               var19 = 1 + var19 + var2.readByte(2103665842);
               var28.aByteArray_2102[var29] = (byte)var19;
            }
         }
      }

      for(var27 = 0; var27 < var13; ++var27) {
         var28 = var37[var27];
         if(null != var28.aByteArray_2105) {
            var19 = 0;

            for(var29 = 2; var29 < var28.aByteArray_2105.length; var29 += 2) {
               var19 = 1 + var19 + var2.readByte(-659938690);
               var28.aByteArray_2105[var29] = (byte)var19;
            }
         }
      }

      byte var30;
      int var34;
      int var32;
      int var33;
      int var43;
      byte var47;
      if(var39 != null) {
         var19 = var2.readByte(1479356975);
         var39[0] = (byte)var19;

         for(var27 = 2; var27 < var39.length; var27 += 2) {
            var19 = var19 + 1 + var2.readByte(-803863749);
            var39[var27] = (byte)var19;
         }

         var47 = var39[0];
         byte var45 = var39[1];

         for(var29 = 0; var29 < var47; ++var29) {
            this.aByteArray_7489[var29] = (byte)(var45 * this.aByteArray_7489[var29] + 32 >> 6);
         }

         for(var29 = 2; var29 < var39.length; var29 += 2) {
            var30 = var39[var29];
            byte var31 = var39[1 + var29];
            var32 = (var30 - var47) / 2 + (var30 - var47) * var45;

            for(var33 = var47; var33 < var30; ++var33) {
               var34 = Class556.method6150(var32, var30 - var47, (byte)1);
               this.aByteArray_7489[var33] = (byte)(var34 * this.aByteArray_7489[var33] + 32 >> 6);
               var32 += var31 - var45;
            }

            var47 = var30;
            var45 = var31;
         }

         for(var43 = var47; var43 < 128; ++var43) {
            this.aByteArray_7489[var43] = (byte)(var45 * this.aByteArray_7489[var43] + 32 >> 6);
         }

         var40 = null;
      }

      if(null != var38) {
         var19 = var2.readByte(1752422339);
         var38[0] = (byte)var19;

         for(var27 = 2; var27 < var38.length; var27 += 2) {
            var19 = var19 + 1 + var2.readByte(1008887890);
            var38[var27] = (byte)var19;
         }

         var47 = var38[0];
         int var46 = var38[1] << 1;

         for(var29 = 0; var29 < var47; ++var29) {
            var43 = var46 + (this.aByteArray_7482[var29] & 255);
            if(var43 < 0) {
               var43 = 0;
            }

            if(var43 > 128) {
               var43 = 128;
            }

            this.aByteArray_7482[var29] = (byte)var43;
         }

         int var44;
         for(var29 = 2; var29 < var38.length; var29 += 2) {
            var30 = var38[var29];
            var44 = var38[1 + var29] << 1;
            var32 = (var30 - var47) * var46 + (var30 - var47) / 2;

            for(var33 = var47; var33 < var30; ++var33) {
               var34 = Class556.method6150(var32, var30 - var47, (byte)1);
               int var35 = (this.aByteArray_7482[var33] & 255) + var34;
               if(var35 < 0) {
                  var35 = 0;
               }

               if(var35 > 128) {
                  var35 = 128;
               }

               this.aByteArray_7482[var33] = (byte)var35;
               var32 += var44 - var46;
            }

            var47 = var30;
            var46 = var44;
         }

         for(var43 = var47; var43 < 128; ++var43) {
            var44 = (this.aByteArray_7482[var43] & 255) + var46;
            if(var44 < 0) {
               var44 = 0;
            }

            if(var44 > 128) {
               var44 = 128;
            }

            this.aByteArray_7482[var43] = (byte)var44;
         }

         Object var41 = null;
      }

      for(var27 = 0; var27 < var13; ++var27) {
         var37[var27].anInt_2103 = var2.readByte(780722386) * -303896675;
      }

      for(var27 = 0; var27 < var13; ++var27) {
         var28 = var37[var27];
         if(null != var28.aByteArray_2105) {
            var28.anInt_2101 = var2.readByte(-1087159633) * -441321689;
         }

         if(var28.aByteArray_2102 != null) {
            var28.anInt_2109 = var2.readByte(-89775271) * 1106344971;
         }

         if(456775349 * var28.anInt_2103 > 0) {
            var28.anInt_2106 = var2.readByte(-1083753708) * -224259455;
         }
      }

      for(var27 = 0; var27 < var13; ++var27) {
         var37[var27].anInt_2108 = var2.readByte(1788292422) * 1223099267;
      }

      for(var27 = 0; var27 < var13; ++var27) {
         var28 = var37[var27];
         if(777167659 * var28.anInt_2108 > 0) {
            var28.anInt_2107 = var2.readByte(1685926726) * 339436631;
         }
      }

      for(var27 = 0; var27 < var13; ++var27) {
         var28 = var37[var27];
         if(1054721895 * var28.anInt_2107 > 0) {
            var28.anInt_2104 = var2.readByte(-1003571567) * -404092661;
         }
      }

   }

   public static void method4890(int var0, int var1) {
      if(3 == client.loginStage * -243034353) {
         Class240_Sub27 var2 = Class47_Sub1.method3496(Class326.aClass326_6323, client.lobbyConnectionHandler.aClass528_3433, 1917447504);
         var2.aClass240_Sub8_Sub1_7370.putByte(var0, -1908163756);
         client.lobbyConnectionHandler.addPacket(var2, 628910951);
      }
   }
}
