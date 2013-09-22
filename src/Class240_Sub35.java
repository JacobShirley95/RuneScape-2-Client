
public class Class240_Sub35 extends NodeListNode {

   NodeArrayList aNodeArrayList_7492;
   byte[] aByteArray_7493;


   void method4891() {
      if(this.aNodeArrayList_7492 == null) {
         this.aNodeArrayList_7492 = new NodeArrayList(16);
         int[] var1 = new int[16];
         int[] var2 = new int[16];
         var2[9] = 128;
         var1[9] = 128;
         Class122 var4 = new Class122(this.aByteArray_7493);
         int var5 = var4.method1549();

         int var6;
         for(var6 = 0; var6 < var5; ++var6) {
            var4.method1538(var6);
            var4.method1541(var6);
            var4.method1539(var6);
         }

         while(true) {
            var6 = var4.method1546();
            int var7 = var4.anIntArray_2254[var6];

            while(var4.anIntArray_2254[var6] == var7) {
               var4.method1538(var6);
               int var8 = var4.method1542(var6);
               if(var8 == 1) {
                  var4.method1536();
                  var4.method1539(var6);
                  if(var4.method1547()) {
                     return;
                  }
                  break;
               }

               int var9 = var8 & 240;
               int var10;
               int var11;
               int var12;
               if(var9 == 176) {
                  var10 = var8 & 15;
                  var11 = var8 >> 8 & 127;
                  var12 = var8 >> 16 & 127;
                  if(var11 == 0) {
                     var1[var10] = (var1[var10] & -2080769) + (var12 << 14);
                  }

                  if(var11 == 32) {
                     var1[var10] = (var1[var10] & -16257) + (var12 << 7);
                  }
               }

               if(var9 == 192) {
                  var10 = var8 & 15;
                  var11 = var8 >> 8 & 127;
                  var2[var10] = var1[var10] + var11;
               }

               if(var9 == 144) {
                  var10 = var8 & 15;
                  var11 = var8 >> 8 & 127;
                  var12 = var8 >> 16 & 127;
                  if(var12 > 0) {
                     int var13 = var2[var10];
                     Class240_Sub9 var14 = (Class240_Sub9)this.aNodeArrayList_7492.getNode((long)var13);
                     if(var14 == null) {
                        var14 = new Class240_Sub9(new byte[128]);
                        this.aNodeArrayList_7492.insert(var14, (long)var13);
                     }

                     ((byte[])((byte[])var14.anObject_6783))[var11] = 1;
                  }
               }

               var4.method1541(var6);
               var4.method1539(var6);
            }
         }
      }
   }

   static Class240_Sub35 method4892(CacheDataUnpacker var0, int var1, int var2) {
      byte[] var3 = var0.getDataBytes(var1, var2, -553689751);
      return var3 == null?null:new Class240_Sub35(new ByteArrayDataNode(var3));
   }

   Class240_Sub35(ByteArrayDataNode var1) {
      var1.index = (var1.data.length - 3) * -2043502829;
      int var2 = var1.readByte(1378050807);
      int var3 = var1.readShort(-798170795);
      int var4 = 14 + var2 * 10;
      var1.index = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;

      int var14;
      int var15;
      while(var13 < var2) {
         var14 = -1;

         while(true) {
            var15 = var1.readByte(-923046500);
            if(var15 != var14) {
               ++var4;
            }

            var14 = var15 & 15;
            if(var15 == 7) {
               ++var13;
               break;
            }

            if(var15 == 23) {
               ++var5;
            } else if(var14 == 0) {
               ++var7;
            } else if(var14 == 1) {
               ++var8;
            } else if(var14 == 2) {
               ++var6;
            } else if(var14 == 3) {
               ++var9;
            } else if(var14 == 4) {
               ++var10;
            } else if(var14 == 5) {
               ++var11;
            } else {
               if(var14 != 6) {
                  throw new RuntimeException();
               }

               ++var12;
            }
         }
      }

      var4 += 5 * var5;
      var4 += 2 * (var7 + var8 + var6 + var9 + var11);
      var4 += var10 + var12;
      var13 = var1.index * 964952859;
      var14 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;

      for(var15 = 0; var15 < var14; ++var15) {
         var1.method4471(1544416920);
      }

      var4 += var1.index * 964952859 - var13;
      var15 = var1.index * 964952859;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      int var20 = 0;
      int var21 = 0;
      int var22 = 0;
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28 = 0;

      int var29;
      for(var29 = 0; var29 < var6; ++var29) {
         var28 = var28 + var1.readByte(-226050987) & 127;
         if(var28 != 0 && var28 != 32) {
            if(var28 == 1) {
               ++var16;
            } else if(var28 == 33) {
               ++var17;
            } else if(var28 == 7) {
               ++var18;
            } else if(var28 == 39) {
               ++var19;
            } else if(var28 == 10) {
               ++var20;
            } else if(var28 == 42) {
               ++var21;
            } else if(var28 == 99) {
               ++var22;
            } else if(var28 == 98) {
               ++var23;
            } else if(var28 == 101) {
               ++var24;
            } else if(var28 == 100) {
               ++var25;
            } else if(var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
               ++var27;
            } else {
               ++var26;
            }
         } else {
            ++var12;
         }
      }

      var29 = 0;
      int var30 = var1.index * 964952859;
      var1.index += var26 * -2043502829;
      int var31 = var1.index * 964952859;
      var1.index += var11 * -2043502829;
      int var32 = var1.index * 964952859;
      var1.index += var10 * -2043502829;
      int var33 = var1.index * 964952859;
      var1.index += var9 * -2043502829;
      int var34 = var1.index * 964952859;
      var1.index += var16 * -2043502829;
      int var35 = var1.index * 964952859;
      var1.index += var18 * -2043502829;
      int var36 = var1.index * 964952859;
      var1.index += var20 * -2043502829;
      int var37 = var1.index * 964952859;
      var1.index += (var7 + var8 + var11) * -2043502829;
      int var38 = var1.index * 964952859;
      var1.index += var7 * -2043502829;
      int var39 = var1.index * 964952859;
      var1.index += var27 * -2043502829;
      int var40 = var1.index * 964952859;
      var1.index += var8 * -2043502829;
      int var41 = var1.index * 964952859;
      var1.index += var17 * -2043502829;
      int var42 = var1.index * 964952859;
      var1.index += var19 * -2043502829;
      int var43 = var1.index * 964952859;
      var1.index += var21 * -2043502829;
      int var44 = var1.index * 964952859;
      var1.index += var12 * -2043502829;
      int var45 = var1.index * 964952859;
      var1.index += var9 * -2043502829;
      int var46 = var1.index * 964952859;
      var1.index += var22 * -2043502829;
      int var47 = var1.index * 964952859;
      var1.index += var23 * -2043502829;
      int var48 = var1.index * 964952859;
      var1.index += var24 * -2043502829;
      int var49 = var1.index * 964952859;
      var1.index += var25 * -2043502829;
      int var50 = var1.index * 964952859;
      var1.index += var5 * -1835541191;
      this.aByteArray_7493 = new byte[var4];
      ByteArrayDataNode var51 = new ByteArrayDataNode(this.aByteArray_7493);
      var51.putIntBE(1297377380, 2062892803);
      var51.putIntBE(6, 2062892803);
      var51.method4463(var2 > 1?1:0, -2120773363);
      var51.method4463(var2, 1938805144);
      var51.method4463(var3, 549880752);
      var1.index = var13 * -2043502829;
      int var52 = 0;
      int var53 = 0;
      int var54 = 0;
      int var55 = 0;
      int var56 = 0;
      int var57 = 0;
      int var58 = 0;
      int[] var59 = new int[128];
      var28 = 0;
      int var60 = 0;

      while(var60 < var2) {
         var51.putIntBE(1297379947, 2062892803);
         var51.index += 415923276;
         int var61 = var51.index * 964952859;
         int var62 = -1;

         while(true) {
            int var63 = var1.method4471(1649907869);
            var51.method4520(var63, 785250019);
            int var64 = var1.data[var29++] & 255;
            boolean var65 = var64 != var62;
            var62 = var64 & 15;
            if(var64 == 7) {
               if(var65) {
                  var51.putByte(255, 690000708);
               }

               var51.putByte(47, 289413238);
               var51.putByte(0, 58291614);
               var51.method4530(var51.index * 964952859 - var61, (byte)-21);
               ++var60;
               break;
            }

            if(var64 == 23) {
               if(var65) {
                  var51.putByte(255, -1976451966);
               }

               var51.putByte(81, 837471683);
               var51.putByte(3, 1479724236);
               var51.putByte(var1.data[var50++], 615850023);
               var51.putByte(var1.data[var50++], 884434579);
               var51.putByte(var1.data[var50++], -1517461355);
            } else {
               var52 ^= var64 >> 4;
               if(var62 == 0) {
                  if(var65) {
                     var51.putByte(144 + var52, 805277837);
                  }

                  var53 += var1.data[var37++];
                  var54 += var1.data[var38++];
                  var51.putByte(var53 & 127, -1721208224);
                  var51.putByte(var54 & 127, -200599687);
               } else if(var62 == 1) {
                  if(var65) {
                     var51.putByte(128 + var52, 1200298095);
                  }

                  var53 += var1.data[var37++];
                  var55 += var1.data[var40++];
                  var51.putByte(var53 & 127, -1843819584);
                  var51.putByte(var55 & 127, 1645171819);
               } else if(var62 == 2) {
                  if(var65) {
                     var51.putByte(176 + var52, 752458629);
                  }

                  var28 = var28 + var1.data[var15++] & 127;
                  var51.putByte(var28, -1596190039);
                  byte var66;
                  if(var28 != 0 && var28 != 32) {
                     if(var28 == 1) {
                        var66 = var1.data[var34++];
                     } else if(var28 == 33) {
                        var66 = var1.data[var41++];
                     } else if(var28 == 7) {
                        var66 = var1.data[var35++];
                     } else if(var28 == 39) {
                        var66 = var1.data[var42++];
                     } else if(var28 == 10) {
                        var66 = var1.data[var36++];
                     } else if(var28 == 42) {
                        var66 = var1.data[var43++];
                     } else if(var28 == 99) {
                        var66 = var1.data[var46++];
                     } else if(var28 == 98) {
                        var66 = var1.data[var47++];
                     } else if(var28 == 101) {
                        var66 = var1.data[var48++];
                     } else if(var28 == 100) {
                        var66 = var1.data[var49++];
                     } else if(var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
                        var66 = var1.data[var39++];
                     } else {
                        var66 = var1.data[var30++];
                     }
                  } else {
                     var66 = var1.data[var44++];
                  }

                  int var67 = var66 + var59[var28];
                  var59[var28] = var67;
                  var51.putByte(var67 & 127, 1253168159);
               } else if(var62 == 3) {
                  if(var65) {
                     var51.putByte(224 + var52, 607041689);
                  }

                  var56 += var1.data[var45++];
                  var56 += var1.data[var33++] << 7;
                  var51.putByte(var56 & 127, -579548684);
                  var51.putByte(var56 >> 7 & 127, 1679895283);
               } else if(var62 == 4) {
                  if(var65) {
                     var51.putByte(208 + var52, 358079614);
                  }

                  var57 += var1.data[var32++];
                  var51.putByte(var57 & 127, 653091084);
               } else if(var62 == 5) {
                  if(var65) {
                     var51.putByte(160 + var52, -625679071);
                  }

                  var53 += var1.data[var37++];
                  var58 += var1.data[var31++];
                  var51.putByte(var53 & 127, 1243077874);
                  var51.putByte(var58 & 127, 174586685);
               } else {
                  if(var62 != 6) {
                     throw new RuntimeException();
                  }

                  if(var65) {
                     var51.putByte(192 + var52, -589945929);
                  }

                  var51.putByte(var1.data[var44++], 1226189907);
               }
            }
         }
      }

   }

   void method4893() {
      this.aNodeArrayList_7492 = null;
   }
}
