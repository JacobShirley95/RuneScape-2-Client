
public class ModelData {

   public int[] anIntArray_1844;
   public short[] aShortArray_1845;
   static final int anInt_1846 = 0;
   int anInt_1847 = 0;
   public int anInt_1848 = 12;
   public int anInt_1849 = 0;
   public int anInt_1850 = 0;
   byte[] aByteArray_1851;
   public short[] aShortArray_1852;
   public int[] anIntArray_1853;
   public Class86[] aClass86Array_1854;
   static final int anInt_1855 = 3;
   public int anInt_1856 = 0;
   public short[] aShortArray_1857;
   public int[] anIntArray_1858;
   public short[] aShortArray_1859;
   public byte[] aByteArray_1860;
   public byte[] aByteArray_1861;
   public short[] aShortArray_1862;
   public short[] aShortArray_1863;
   public byte[] aByteArray_1864;
   public int[] anIntArray_1865;
   public int[] anIntArray_1866;
   byte aByte_1867 = 0;
   public short[] aShortArray_1868;
   public short[] aShortArray_1869;
   public byte[] aByteArray_1870;
   public short[] aShortArray_1871;
   public short[] aShortArray_1872;
   public int[] anIntArray_1873;
   public int[] anIntArray_1874;
   public int[] anIntArray_1875;
   public short[] aShortArray_1876;
   public int[] anIntArray_1877;
   static final int anInt_1878 = 1;
   public int[] anIntArray_1879;
   public int[] anIntArray_1880;
   public byte[] aByteArray_1881;
   static final int anInt_1882 = 26;
   public Class172[] aClass172Array_1883;
   public Class107[] aClass107Array_1884;


   public void method1217(short var1, short var2) {
      if(this.aShortArray_1859 != null) {
         for(int var3 = 0; var3 < this.anInt_1856; ++var3) {
            if(this.aShortArray_1859[var3] == var1) {
               this.aShortArray_1859[var3] = var2;
            }
         }

      }
   }

   public ModelData(int var1, int var2, int var3) {
      this.anIntArray_1858 = new int[var1];
      this.anIntArray_1880 = new int[var1];
      this.anIntArray_1853 = new int[var1];
      this.anIntArray_1844 = new int[var1];
      this.aShortArray_1857 = new short[var2];
      this.aShortArray_1845 = new short[var2];
      this.aShortArray_1869 = new short[var2];
      this.aByteArray_1860 = new byte[var2];
      this.aByteArray_1861 = new byte[var2];
      this.aByteArray_1864 = new byte[var2];
      this.aShortArray_1863 = new short[var2];
      this.aShortArray_1876 = new short[var2];
      this.aShortArray_1859 = new short[var2];
      this.anIntArray_1866 = new int[var2];
      if(var3 > 0) {
         this.aByteArray_1870 = new byte[var3];
         this.aShortArray_1871 = new short[var3];
         this.aShortArray_1872 = new short[var3];
         this.aShortArray_1852 = new short[var3];
         this.anIntArray_1874 = new int[var3];
         this.anIntArray_1875 = new int[var3];
         this.anIntArray_1865 = new int[var3];
         this.aByteArray_1851 = new byte[var3];
         this.aByteArray_1881 = new byte[var3];
         this.anIntArray_1877 = new int[var3];
         this.anIntArray_1873 = new int[var3];
         this.anIntArray_1879 = new int[var3];
      }

   }

   public ModelData(ModelData[] models, int modelCount) {
      this.anInt_1849 = 0;
      this.anInt_1856 = 0;
      this.anInt_1847 = 0;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      this.aByte_1867 = -1;

      int var12;
      for(var12 = 0; var12 < modelCount; ++var12) {
         ModelData modelData = models[var12];
         if(modelData != null) {
            this.anInt_1849 += modelData.anInt_1849;
            this.anInt_1856 += modelData.anInt_1856;
            this.anInt_1847 += modelData.anInt_1847;
            if(modelData.aClass86Array_1854 != null) {
               var3 += modelData.aClass86Array_1854.length;
            }

            if(modelData.aClass172Array_1883 != null) {
               var4 += modelData.aClass172Array_1883.length;
            }

            if(modelData.aClass107Array_1884 != null) {
               var5 += modelData.aClass107Array_1884.length;
            }

            var6 |= modelData.aByteArray_1860 != null;
            if(modelData.aByteArray_1861 != null) {
               var7 = true;
            } else {
               if(this.aByte_1867 == -1) {
                  this.aByte_1867 = modelData.aByte_1867;
               }

               if(this.aByte_1867 != modelData.aByte_1867) {
                  var7 = true;
               }
            }

            var8 |= modelData.aByteArray_1864 != null;
            var9 |= modelData.aShortArray_1863 != null;
            var10 |= modelData.aShortArray_1859 != null;
            var11 |= modelData.anIntArray_1866 != null;
         }
      }

      this.anIntArray_1858 = new int[this.anInt_1849];
      this.anIntArray_1880 = new int[this.anInt_1849];
      this.anIntArray_1853 = new int[this.anInt_1849];
      this.anIntArray_1844 = new int[this.anInt_1849];
      this.aShortArray_1862 = new short[this.anInt_1849];
      this.aShortArray_1857 = new short[this.anInt_1856];
      this.aShortArray_1845 = new short[this.anInt_1856];
      this.aShortArray_1869 = new short[this.anInt_1856];
      if(var6) {
         this.aByteArray_1860 = new byte[this.anInt_1856];
      }

      if(var7) {
         this.aByteArray_1861 = new byte[this.anInt_1856];
      }

      if(var8) {
         this.aByteArray_1864 = new byte[this.anInt_1856];
      }

      if(var9) {
         this.aShortArray_1863 = new short[this.anInt_1856];
      }

      this.aShortArray_1876 = new short[this.anInt_1856];
      if(var10) {
         this.aShortArray_1859 = new short[this.anInt_1856];
      }

      if(var11) {
         this.anIntArray_1866 = new int[this.anInt_1856];
      }

      this.aShortArray_1868 = new short[this.anInt_1856];
      if(this.anInt_1847 > 0) {
         this.aByteArray_1870 = new byte[this.anInt_1847];
         this.aShortArray_1871 = new short[this.anInt_1847];
         this.aShortArray_1872 = new short[this.anInt_1847];
         this.aShortArray_1852 = new short[this.anInt_1847];
         this.anIntArray_1874 = new int[this.anInt_1847];
         this.anIntArray_1875 = new int[this.anInt_1847];
         this.anIntArray_1865 = new int[this.anInt_1847];
         this.aByteArray_1851 = new byte[this.anInt_1847];
         this.aByteArray_1881 = new byte[this.anInt_1847];
         this.anIntArray_1877 = new int[this.anInt_1847];
         this.anIntArray_1873 = new int[this.anInt_1847];
         this.anIntArray_1879 = new int[this.anInt_1847];
      }

      if(var5 > 0) {
         this.aClass107Array_1884 = new Class107[var5];
      }

      if(var3 > 0) {
         this.aClass86Array_1854 = new Class86[var3];
      }

      if(var4 > 0) {
         this.aClass172Array_1883 = new Class172[var4];
      }

      this.anInt_1849 = 0;
      this.anInt_1856 = 0;
      this.anInt_1847 = 0;
      var3 = 0;
      var4 = 0;
      var5 = 0;

      int var16;
      for(var12 = 0; var12 < modelCount; ++var12) {
         short var21 = (short)(1 << var12);
         ModelData modelData = models[var12];
         int var15 = this.anInt_1856;
         if(modelData != null) {
            if(modelData.aClass107Array_1884 != null) {
               for(var16 = 0; var16 < modelData.aClass107Array_1884.length; ++var16) {
                  Class107 var17 = modelData.aClass107Array_1884[var16];
                  this.aClass107Array_1884[var5++] = var17.method1383(var17.anInt_1989 * 1921905305 + this.anInt_1856, -2029550446);
               }
            }

            for(var16 = 0; var16 < modelData.anInt_1856; ++var16) {
               if(var6 && modelData.aByteArray_1860 != null) {
                  this.aByteArray_1860[this.anInt_1856] = modelData.aByteArray_1860[var16];
               }

               if(var7) {
                  if(modelData.aByteArray_1861 != null) {
                     this.aByteArray_1861[this.anInt_1856] = modelData.aByteArray_1861[var16];
                  } else {
                     this.aByteArray_1861[this.anInt_1856] = modelData.aByte_1867;
                  }
               }

               if(var8 && modelData.aByteArray_1864 != null) {
                  this.aByteArray_1864[this.anInt_1856] = modelData.aByteArray_1864[var16];
               }

               if(var10) {
                  if(modelData.aShortArray_1859 != null) {
                     this.aShortArray_1859[this.anInt_1856] = modelData.aShortArray_1859[var16];
                  } else {
                     this.aShortArray_1859[this.anInt_1856] = -1;
                  }
               }

               if(var11) {
                  if(modelData.anIntArray_1866 != null) {
                     this.anIntArray_1866[this.anInt_1856] = modelData.anIntArray_1866[var16];
                  } else {
                     this.anIntArray_1866[this.anInt_1856] = -1;
                  }
               }

               this.aShortArray_1857[this.anInt_1856] = (short)this.method1218(modelData, modelData.aShortArray_1857[var16], var21);
               this.aShortArray_1845[this.anInt_1856] = (short)this.method1218(modelData, modelData.aShortArray_1845[var16], var21);
               this.aShortArray_1869[this.anInt_1856] = (short)this.method1218(modelData, modelData.aShortArray_1869[var16], var21);
               this.aShortArray_1868[this.anInt_1856] = var21;
               this.aShortArray_1876[this.anInt_1856] = modelData.aShortArray_1876[var16];
               ++this.anInt_1856;
            }

            int var25;
            if(modelData.aClass86Array_1854 != null) {
               for(var16 = 0; var16 < modelData.aClass86Array_1854.length; ++var16) {
                  var25 = this.method1218(modelData, modelData.aClass86Array_1854[var16].anInt_1740 * -146104779, var21);
                  int var18 = this.method1218(modelData, modelData.aClass86Array_1854[var16].anInt_1744 * -1747600183, var21);
                  int var19 = this.method1218(modelData, modelData.aClass86Array_1854[var16].anInt_1745 * -2092357753, var21);
                  this.aClass86Array_1854[var3] = modelData.aClass86Array_1854[var16].method1125(modelData.aClass86Array_1854[var16].anInt_1754 * -1827055815 + var15, var25, var18, var19, -486998016);
                  ++var3;
               }
            }

            if(modelData.aClass172Array_1883 != null) {
               for(var16 = 0; var16 < modelData.aClass172Array_1883.length; ++var16) {
                  var25 = this.method1218(modelData, modelData.aClass172Array_1883[var16].anInt_3036 * 1218049443, var21);
                  this.aClass172Array_1883[var4] = modelData.aClass172Array_1883[var16].method2168(var25, (short)31124);
                  ++var4;
               }
            }
         }
      }

      var12 = 0;
      this.anInt_1850 = this.anInt_1849;

      for(int var20 = 0; var20 < modelCount; ++var20) {
         short var23 = (short)(1 << var20);
         ModelData var22 = models[var20];
         if(var22 != null) {
            for(var16 = 0; var16 < var22.anInt_1856; ++var16) {
               if(var9) {
                  this.aShortArray_1863[var12++] = (short)(var22.aShortArray_1863 != null && var22.aShortArray_1863[var16] != -1?var22.aShortArray_1863[var16] + this.anInt_1847:-1);
               }
            }

            for(var16 = 0; var16 < var22.anInt_1847; ++var16) {
               byte var24 = this.aByteArray_1870[this.anInt_1847] = var22.aByteArray_1870[var16];
               if(var24 == 0) {
                  this.aShortArray_1871[this.anInt_1847] = (short)this.method1218(var22, var22.aShortArray_1871[var16], var23);
                  this.aShortArray_1872[this.anInt_1847] = (short)this.method1218(var22, var22.aShortArray_1872[var16], var23);
                  this.aShortArray_1852[this.anInt_1847] = (short)this.method1218(var22, var22.aShortArray_1852[var16], var23);
               }

               if(var24 >= 1 && var24 <= 3) {
                  this.aShortArray_1871[this.anInt_1847] = var22.aShortArray_1871[var16];
                  this.aShortArray_1872[this.anInt_1847] = var22.aShortArray_1872[var16];
                  this.aShortArray_1852[this.anInt_1847] = var22.aShortArray_1852[var16];
                  this.anIntArray_1874[this.anInt_1847] = var22.anIntArray_1874[var16];
                  this.anIntArray_1875[this.anInt_1847] = var22.anIntArray_1875[var16];
                  this.anIntArray_1865[this.anInt_1847] = var22.anIntArray_1865[var16];
                  this.aByteArray_1851[this.anInt_1847] = var22.aByteArray_1851[var16];
                  this.aByteArray_1881[this.anInt_1847] = var22.aByteArray_1881[var16];
                  this.anIntArray_1877[this.anInt_1847] = var22.anIntArray_1877[var16];
               }

               if(var24 == 2) {
                  this.anIntArray_1873[this.anInt_1847] = var22.anIntArray_1873[var16];
                  this.anIntArray_1879[this.anInt_1847] = var22.anIntArray_1879[var16];
               }

               ++this.anInt_1847;
            }
         }
      }

   }

   final int method1218(ModelData var1, int var2, short var3) {
      int var4 = var1.anIntArray_1858[var2];
      int var5 = var1.anIntArray_1880[var2];
      int var6 = var1.anIntArray_1853[var2];

      for(int var7 = 0; var7 < this.anInt_1849; ++var7) {
         if(var4 == this.anIntArray_1858[var7] && var5 == this.anIntArray_1880[var7] && var6 == this.anIntArray_1853[var7]) {
            this.aShortArray_1862[var7] |= var3;
            return var7;
         }
      }

      this.anIntArray_1858[this.anInt_1849] = var4;
      this.anIntArray_1880[this.anInt_1849] = var5;
      this.anIntArray_1853[this.anInt_1849] = var6;
      this.aShortArray_1862[this.anInt_1849] = var3;
      this.anIntArray_1844[this.anInt_1849] = var1.anIntArray_1844 != null?var1.anIntArray_1844[var2]:-1;
      return this.anInt_1849++;
   }

   void method1219(byte[] var1) {
      ByteArrayDataNode var2 = new ByteArrayDataNode(var1);
      ByteArrayDataNode var3 = new ByteArrayDataNode(var1);
      ByteArrayDataNode var4 = new ByteArrayDataNode(var1);
      ByteArrayDataNode var5 = new ByteArrayDataNode(var1);
      ByteArrayDataNode var6 = new ByteArrayDataNode(var1);
      ByteArrayDataNode var7 = new ByteArrayDataNode(var1);
      ByteArrayDataNode var8 = new ByteArrayDataNode(var1);
      int var9 = var2.readByte(768530238);
      if(var9 != 1) {
         System.out.println("" + var9);
      } else {
         var2.readByte(1476648484);
         this.anInt_1848 = var2.readByte(282219105);
         var2.index = (var1.length - 26) * -2043502829;
         this.anInt_1849 = var2.readShort(-1267913046);
         this.anInt_1856 = var2.readShort(219179818);
         this.anInt_1847 = var2.readShort(1126399736);
         int var10 = var2.readByte(-249003000);
         boolean var11 = (var10 & 1) == 1;
         boolean var12 = (var10 & 2) == 2;
         boolean var13 = (var10 & 4) == 4;
         boolean var14 = (var10 & 16) == 16;
         boolean var15 = (var10 & 32) == 32;
         boolean var16 = (var10 & 64) == 64;
         int var17 = var2.readByte(1533466491);
         int var18 = var2.readByte(-463215759);
         int var19 = var2.readByte(1685969403);
         int var20 = var2.readByte(663133044);
         int var21 = var2.readByte(467595456);
         int var22 = var2.readShort(-868219046);
         int var23 = var2.readShort(-1043080751);
         int var24 = var2.readShort(1755623643);
         int var25 = var2.readShort(1429428678);
         int var26 = var2.readShort(-274206599);
         int var27 = var2.readShort(-1189565550);
         int var28 = var2.readShort(998903200);
         if(!var14) {
            if(var21 == 1) {
               var27 = this.anInt_1849;
            } else {
               var27 = 0;
            }
         }

         if(!var15) {
            if(var19 == 1) {
               var28 = this.anInt_1856;
            } else {
               var28 = 0;
            }
         }

         int var29 = 0;
         int var30 = 0;
         int var31 = 0;
         int var32;
         if(this.anInt_1847 > 0) {
            this.aByteArray_1870 = new byte[this.anInt_1847];
            var2.index = -1835541191;

            for(var32 = 0; var32 < this.anInt_1847; ++var32) {
               byte var33 = this.aByteArray_1870[var32] = var2.getByte((byte)74);
               if(var33 == 0) {
                  ++var29;
               }

               if(var33 >= 1 && var33 <= 3) {
                  ++var30;
               }

               if(var33 == 2) {
                  ++var31;
               }
            }
         }

         var32 = 3 + this.anInt_1847;
         int var64 = var32;
         var32 += this.anInt_1849;
         int var34 = var32;
         if(var11) {
            var32 += this.anInt_1856;
         }

         int var35 = var32;
         var32 += this.anInt_1856;
         int var36 = var32;
         if(var17 == 255) {
            var32 += this.anInt_1856;
         }

         int var37 = var32;
         var32 += var28;
         int var38 = var32;
         var32 += var27;
         int var39 = var32;
         if(var18 == 1) {
            var32 += this.anInt_1856;
         }

         int var40 = var32;
         var32 += var25;
         int var41 = var32;
         if(var20 == 1) {
            var32 += this.anInt_1856 * 2;
         }

         int var42 = var32;
         var32 += var26;
         int var43 = var32;
         var32 += this.anInt_1856 * 2;
         int var44 = var32;
         var32 += var22;
         int var45 = var32;
         var32 += var23;
         int var46 = var32;
         var32 += var24;
         int var47 = var32;
         var32 += var29 * 6;
         int var48 = var32;
         var32 += var30 * 6;
         byte var49 = 6;
         if(this.anInt_1848 == 14) {
            var49 = 7;
         } else if(this.anInt_1848 >= 15) {
            var49 = 9;
         }

         int var50 = var32;
         var32 += var30 * var49;
         int var51 = var32;
         var32 += var30;
         int var52 = var32;
         var32 += var30;
         int var53 = var32;
         var32 += var30 + var31 * 2;
         this.anIntArray_1858 = new int[this.anInt_1849];
         this.anIntArray_1880 = new int[this.anInt_1849];
         this.anIntArray_1853 = new int[this.anInt_1849];
         this.aShortArray_1857 = new short[this.anInt_1856];
         this.aShortArray_1845 = new short[this.anInt_1856];
         this.aShortArray_1869 = new short[this.anInt_1856];
         if(var21 == 1) {
            this.anIntArray_1844 = new int[this.anInt_1849];
         }

         if(var11) {
            this.aByteArray_1860 = new byte[this.anInt_1856];
         }

         if(var17 == 255) {
            this.aByteArray_1861 = new byte[this.anInt_1856];
         } else {
            this.aByte_1867 = (byte)var17;
         }

         if(var18 == 1) {
            this.aByteArray_1864 = new byte[this.anInt_1856];
         }

         if(var19 == 1) {
            this.anIntArray_1866 = new int[this.anInt_1856];
         }

         if(var20 == 1) {
            this.aShortArray_1859 = new short[this.anInt_1856];
         }

         if(var20 == 1 && this.anInt_1847 > 0) {
            this.aShortArray_1863 = new short[this.anInt_1856];
         }

         this.aShortArray_1876 = new short[this.anInt_1856];
         if(this.anInt_1847 > 0) {
            this.aShortArray_1871 = new short[this.anInt_1847];
            this.aShortArray_1872 = new short[this.anInt_1847];
            this.aShortArray_1852 = new short[this.anInt_1847];
            if(var30 > 0) {
               this.anIntArray_1874 = new int[var30];
               this.anIntArray_1875 = new int[var30];
               this.anIntArray_1865 = new int[var30];
               this.aByteArray_1851 = new byte[var30];
               this.aByteArray_1881 = new byte[var30];
               this.anIntArray_1877 = new int[var30];
            }

            if(var31 > 0) {
               this.anIntArray_1873 = new int[var31];
               this.anIntArray_1879 = new int[var31];
            }
         }

         var2.index = var64 * -2043502829;
         var3.index = var44 * -2043502829;
         var4.index = var45 * -2043502829;
         var5.index = var46 * -2043502829;
         var6.index = var38 * -2043502829;
         int var55 = 0;
         int var56 = 0;
         int var57 = 0;

         int var59;
         int var58;
         int var62;
         int var61;
         int var60;
         for(var58 = 0; var58 < this.anInt_1849; ++var58) {
            var59 = var2.readByte(1068746693);
            var60 = 0;
            if((var59 & 1) != 0) {
               var60 = var3.method4489(1158549501);
            }

            var61 = 0;
            if((var59 & 2) != 0) {
               var61 = var4.method4489(1158549501);
            }

            var62 = 0;
            if((var59 & 4) != 0) {
               var62 = var5.method4489(1158549501);
            }

            this.anIntArray_1858[var58] = var55 + var60;
            this.anIntArray_1880[var58] = var56 + var61;
            this.anIntArray_1853[var58] = var57 + var62;
            var55 = this.anIntArray_1858[var58];
            var56 = this.anIntArray_1880[var58];
            var57 = this.anIntArray_1853[var58];
            if(var21 == 1) {
               if(var14) {
                  this.anIntArray_1844[var58] = var6.method4532(1006221158);
               } else {
                  this.anIntArray_1844[var58] = var6.readByte(793391508);
                  if(this.anIntArray_1844[var58] == 255) {
                     this.anIntArray_1844[var58] = -1;
                  }
               }
            }
         }

         var2.index = var43 * -2043502829;
         var3.index = var34 * -2043502829;
         var4.index = var36 * -2043502829;
         var5.index = var39 * -2043502829;
         var6.index = var37 * -2043502829;
         var7.index = var41 * -2043502829;
         var8.index = var42 * -2043502829;

         for(var58 = 0; var58 < this.anInt_1856; ++var58) {
            this.aShortArray_1876[var58] = (short)var2.readShort(1425349039);
            if(var11) {
               this.aByteArray_1860[var58] = var3.getByte((byte)108);
            }

            if(var17 == 255) {
               this.aByteArray_1861[var58] = var4.getByte((byte)83);
            }

            if(var18 == 1) {
               this.aByteArray_1864[var58] = var5.getByte((byte)28);
            }

            if(var19 == 1) {
               if(var15) {
                  this.anIntArray_1866[var58] = var6.method4532(1016841800);
               } else {
                  this.anIntArray_1866[var58] = var6.readByte(3577695);
                  if(this.anIntArray_1866[var58] == 255) {
                     this.anIntArray_1866[var58] = -1;
                  }
               }
            }

            if(var20 == 1) {
               this.aShortArray_1859[var58] = (short)(var7.readShort(-266222471) - 1);
            }

            if(this.aShortArray_1863 != null) {
               if(this.aShortArray_1859[var58] != -1) {
                  if(this.anInt_1848 >= 16) {
                     this.aShortArray_1863[var58] = (short)(var8.method4490((byte)0) - 1);
                  } else {
                     this.aShortArray_1863[var58] = (short)(var8.readByte(1073630150) - 1);
                  }
               } else {
                  this.aShortArray_1863[var58] = -1;
               }
            }
         }

         this.anInt_1850 = -1;
         var2.index = var40 * -2043502829;
         var3.index = var35 * -2043502829;
         this.method1221(var2, var3);
         var2.index = var47 * -2043502829;
         var3.index = var48 * -2043502829;
         var4.index = var50 * -2043502829;
         var5.index = var51 * -2043502829;
         var6.index = var52 * -2043502829;
         var7.index = var53 * -2043502829;
         this.method1231(var2, var3, var4, var5, var6, var7);
         var2.index = var32 * -2043502829;
         if(var12) {
            var58 = var2.readByte(-886757656);
            if(var58 > 0) {
               this.aClass86Array_1854 = new Class86[var58];

               for(var59 = 0; var59 < var58; ++var59) {
                  var60 = var2.readShort(-684619108);
                  var61 = var2.readShort(1166059062);
                  byte var65;
                  if(var17 == 255) {
                     var65 = this.aByteArray_1861[var61];
                  } else {
                     var65 = (byte)var17;
                  }

                  this.aClass86Array_1854[var59] = new Class86(var60, var61, this.aShortArray_1857[var61], this.aShortArray_1845[var61], this.aShortArray_1869[var61], var65);
               }
            }

            var59 = var2.readByte(-7341597);
            if(var59 > 0) {
               this.aClass172Array_1883 = new Class172[var59];

               for(var60 = 0; var60 < var59; ++var60) {
                  var61 = var2.readShort(1903265759);
                  var62 = var2.readShort(1430409200);
                  this.aClass172Array_1883[var60] = new Class172(var61, var62);
               }
            }
         }

         if(var13) {
            var58 = var2.readByte(1655800328);
            if(var58 > 0) {
               this.aClass107Array_1884 = new Class107[var58];

               for(var59 = 0; var59 < var58; ++var59) {
                  var60 = var2.readShort(612000989);
                  var61 = var2.readShort(219712735);
                  if(var16) {
                     var62 = var2.method4532(1785822436);
                  } else {
                     var62 = var2.readByte(781105665);
                     if(var62 == 255) {
                        var62 = -1;
                     }
                  }

                  byte var63 = var2.getByte((byte)98);
                  this.aClass107Array_1884[var59] = new Class107(var60, var61, var62, var63);
               }
            }
         }

      }
   }

   public int method1220(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt_1849; ++var4) {
         if(this.anIntArray_1858[var4] == var1 && this.anIntArray_1880[var4] == var2 && this.anIntArray_1853[var4] == var3) {
            return var4;
         }
      }

      this.anIntArray_1858[this.anInt_1849] = var1;
      this.anIntArray_1880[this.anInt_1849] = var2;
      this.anIntArray_1853[this.anInt_1849] = var3;
      this.anInt_1850 = this.anInt_1849 + 1;
      return this.anInt_1849++;
   }

   void method1221(ByteArrayDataNode var1, ByteArrayDataNode var2) {
      short var3 = 0;
      short var4 = 0;
      short var5 = 0;
      short var6 = 0;

      for(int var7 = 0; var7 < this.anInt_1856; ++var7) {
         int var8 = var2.readByte(515138786);
         if(var8 == 1) {
            var3 = (short)(var1.method4489(1158549501) + var6);
            var4 = (short)(var1.method4489(1158549501) + var3);
            var5 = (short)(var1.method4489(1158549501) + var4);
            var6 = var5;
            this.aShortArray_1857[var7] = var3;
            this.aShortArray_1845[var7] = var4;
            this.aShortArray_1869[var7] = var5;
            if(var3 > this.anInt_1850) {
               this.anInt_1850 = var3;
            }

            if(var4 > this.anInt_1850) {
               this.anInt_1850 = var4;
            }

            if(var5 > this.anInt_1850) {
               this.anInt_1850 = var5;
            }
         }

         if(var8 == 2) {
            var4 = var5;
            var5 = (short)(var1.method4489(1158549501) + var6);
            var6 = var5;
            this.aShortArray_1857[var7] = var3;
            this.aShortArray_1845[var7] = var4;
            this.aShortArray_1869[var7] = var5;
            if(var5 > this.anInt_1850) {
               this.anInt_1850 = var5;
            }
         }

         if(var8 == 3) {
            var3 = var5;
            var5 = (short)(var1.method4489(1158549501) + var6);
            var6 = var5;
            this.aShortArray_1857[var7] = var3;
            this.aShortArray_1845[var7] = var4;
            this.aShortArray_1869[var7] = var5;
            if(var5 > this.anInt_1850) {
               this.anInt_1850 = var5;
            }
         }

         if(var8 == 4) {
            short var9 = var3;
            var3 = var4;
            var4 = var9;
            var5 = (short)(var1.method4489(1158549501) + var6);
            var6 = var5;
            this.aShortArray_1857[var7] = var3;
            this.aShortArray_1845[var7] = var9;
            this.aShortArray_1869[var7] = var5;
            if(var5 > this.anInt_1850) {
               this.anInt_1850 = var5;
            }
         }
      }

      ++this.anInt_1850;
   }

   void method1222(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      ByteArrayDataNode var4 = new ByteArrayDataNode(var1);
      ByteArrayDataNode var5 = new ByteArrayDataNode(var1);
      ByteArrayDataNode var6 = new ByteArrayDataNode(var1);
      ByteArrayDataNode var7 = new ByteArrayDataNode(var1);
      ByteArrayDataNode var8 = new ByteArrayDataNode(var1);
      int var9 = var4.readByte(1259272017);
      if(var9 != 0) {
         System.out.println("" + var9);
      } else {
         var4.index = (var1.length - 18) * -2043502829;
         this.anInt_1849 = var4.readShort(1229047479);
         this.anInt_1856 = var4.readShort(-477949475);
         this.anInt_1847 = var4.readByte(527166783);
         int var10 = var4.readByte(-667931888);
         int var11 = var4.readByte(875295267);
         int var12 = var4.readByte(-597922706);
         int var13 = var4.readByte(-716047980);
         int var14 = var4.readByte(2142132584);
         int var15 = var4.readShort(-1256681160);
         int var16 = var4.readShort(68239177);
         int var17 = var4.readShort(1006517832);
         int var18 = var4.readShort(403891563);
         byte var19 = 0;
         int var43 = var19 + this.anInt_1849;
         int var21 = var43;
         var43 += this.anInt_1856;
         int var22 = var43;
         if(var11 == 255) {
            var43 += this.anInt_1856;
         }

         int var23 = var43;
         if(var13 == 1) {
            var43 += this.anInt_1856;
         }

         int var24 = var43;
         if(var10 == 1) {
            var43 += this.anInt_1856;
         }

         int var25 = var43;
         if(var14 == 1) {
            var43 += this.anInt_1849;
         }

         int var26 = var43;
         if(var12 == 1) {
            var43 += this.anInt_1856;
         }

         int var27 = var43;
         var43 += var18;
         int var28 = var43;
         var43 += this.anInt_1856 * 2;
         int var29 = var43;
         var43 += this.anInt_1847 * 6;
         int var30 = var43;
         var43 += var15;
         int var31 = var43;
         var43 += var16;
         int var10000 = var43 + var17;
         this.anIntArray_1858 = new int[this.anInt_1849];
         this.anIntArray_1880 = new int[this.anInt_1849];
         this.anIntArray_1853 = new int[this.anInt_1849];
         this.aShortArray_1857 = new short[this.anInt_1856];
         this.aShortArray_1845 = new short[this.anInt_1856];
         this.aShortArray_1869 = new short[this.anInt_1856];
         if(this.anInt_1847 > 0) {
            this.aByteArray_1870 = new byte[this.anInt_1847];
            this.aShortArray_1871 = new short[this.anInt_1847];
            this.aShortArray_1872 = new short[this.anInt_1847];
            this.aShortArray_1852 = new short[this.anInt_1847];
         }

         if(var14 == 1) {
            this.anIntArray_1844 = new int[this.anInt_1849];
         }

         if(var10 == 1) {
            this.aByteArray_1860 = new byte[this.anInt_1856];
            this.aShortArray_1863 = new short[this.anInt_1856];
            this.aShortArray_1859 = new short[this.anInt_1856];
         }

         if(var11 == 255) {
            this.aByteArray_1861 = new byte[this.anInt_1856];
         } else {
            this.aByte_1867 = (byte)var11;
         }

         if(var12 == 1) {
            this.aByteArray_1864 = new byte[this.anInt_1856];
         }

         if(var13 == 1) {
            this.anIntArray_1866 = new int[this.anInt_1856];
         }

         this.aShortArray_1876 = new short[this.anInt_1856];
         var4.index = var19 * -2043502829;
         var5.index = var30 * -2043502829;
         var6.index = var31 * -2043502829;
         var7.index = var43 * -2043502829;
         var8.index = var25 * -2043502829;
         int var33 = 0;
         int var34 = 0;
         int var35 = 0;

         int var36;
         int var37;
         int var40;
         for(var36 = 0; var36 < this.anInt_1849; ++var36) {
            var37 = var4.readByte(1064043692);
            int var38 = 0;
            if((var37 & 1) != 0) {
               var38 = var5.method4489(1158549501);
            }

            int var39 = 0;
            if((var37 & 2) != 0) {
               var39 = var6.method4489(1158549501);
            }

            var40 = 0;
            if((var37 & 4) != 0) {
               var40 = var7.method4489(1158549501);
            }

            this.anIntArray_1858[var36] = var33 + var38;
            this.anIntArray_1880[var36] = var34 + var39;
            this.anIntArray_1853[var36] = var35 + var40;
            var33 = this.anIntArray_1858[var36];
            var34 = this.anIntArray_1880[var36];
            var35 = this.anIntArray_1853[var36];
            if(var14 == 1) {
               this.anIntArray_1844[var36] = var8.readByte(-1003901521);
            }
         }

         var4.index = var28 * -2043502829;
         var5.index = var24 * -2043502829;
         var6.index = var22 * -2043502829;
         var7.index = var26 * -2043502829;
         var8.index = var23 * -2043502829;

         for(var36 = 0; var36 < this.anInt_1856; ++var36) {
            this.aShortArray_1876[var36] = (short)var4.readShort(956340212);
            if(var10 == 1) {
               var37 = var5.readByte(-687117633);
               if((var37 & 1) == 1) {
                  this.aByteArray_1860[var36] = 1;
                  var2 = true;
               } else {
                  this.aByteArray_1860[var36] = 0;
               }

               if((var37 & 2) == 2) {
                  this.aShortArray_1863[var36] = (short)((byte)(var37 >> 2));
                  this.aShortArray_1859[var36] = this.aShortArray_1876[var36];
                  this.aShortArray_1876[var36] = 127;
                  if(this.aShortArray_1859[var36] != -1) {
                     var3 = true;
                  }
               } else {
                  this.aShortArray_1863[var36] = -1;
                  this.aShortArray_1859[var36] = -1;
               }
            }

            if(var11 == 255) {
               this.aByteArray_1861[var36] = var6.getByte((byte)120);
            }

            if(var12 == 1) {
               this.aByteArray_1864[var36] = var7.getByte((byte)3);
            }

            if(var13 == 1) {
               this.anIntArray_1866[var36] = var8.readByte(8793837);
            }
         }

         this.anInt_1850 = -1;
         var4.index = var27 * -2043502829;
         var5.index = var21 * -2043502829;
         short var46 = 0;
         short var45 = 0;
         short var44 = 0;
         short var47 = 0;

         int var41;
         for(var40 = 0; var40 < this.anInt_1856; ++var40) {
            var41 = var5.readByte(1702483790);
            if(var41 == 1) {
               var46 = (short)(var4.method4489(1158549501) + var47);
               var45 = (short)(var4.method4489(1158549501) + var46);
               var44 = (short)(var4.method4489(1158549501) + var45);
               var47 = var44;
               this.aShortArray_1857[var40] = var46;
               this.aShortArray_1845[var40] = var45;
               this.aShortArray_1869[var40] = var44;
               if(var46 > this.anInt_1850) {
                  this.anInt_1850 = var46;
               }

               if(var45 > this.anInt_1850) {
                  this.anInt_1850 = var45;
               }

               if(var44 > this.anInt_1850) {
                  this.anInt_1850 = var44;
               }
            }

            if(var41 == 2) {
               var45 = var44;
               var44 = (short)(var4.method4489(1158549501) + var47);
               var47 = var44;
               this.aShortArray_1857[var40] = var46;
               this.aShortArray_1845[var40] = var45;
               this.aShortArray_1869[var40] = var44;
               if(var44 > this.anInt_1850) {
                  this.anInt_1850 = var44;
               }
            }

            if(var41 == 3) {
               var46 = var44;
               var44 = (short)(var4.method4489(1158549501) + var47);
               var47 = var44;
               this.aShortArray_1857[var40] = var46;
               this.aShortArray_1845[var40] = var45;
               this.aShortArray_1869[var40] = var44;
               if(var44 > this.anInt_1850) {
                  this.anInt_1850 = var44;
               }
            }

            if(var41 == 4) {
               short var42 = var46;
               var46 = var45;
               var45 = var42;
               var44 = (short)(var4.method4489(1158549501) + var47);
               var47 = var44;
               this.aShortArray_1857[var40] = var46;
               this.aShortArray_1845[var40] = var42;
               this.aShortArray_1869[var40] = var44;
               if(var44 > this.anInt_1850) {
                  this.anInt_1850 = var44;
               }
            }
         }

         ++this.anInt_1850;
         var4.index = var29 * -2043502829;

         for(var40 = 0; var40 < this.anInt_1847; ++var40) {
            this.aByteArray_1870[var40] = 0;
            this.aShortArray_1871[var40] = (short)var4.readShort(530602047);
            this.aShortArray_1872[var40] = (short)var4.readShort(-1180028806);
            this.aShortArray_1852[var40] = (short)var4.readShort(464343814);
         }

         if(this.aShortArray_1863 != null) {
            boolean var48 = false;

            for(var41 = 0; var41 < this.anInt_1856; ++var41) {
               int var49 = this.aShortArray_1863[var41] & 255;
               if(var49 != 255) {
                  if((this.aShortArray_1871[var49] & '\uffff') == this.aShortArray_1857[var41] && (this.aShortArray_1872[var49] & '\uffff') == this.aShortArray_1845[var41] && (this.aShortArray_1852[var49] & '\uffff') == this.aShortArray_1869[var41]) {
                     this.aShortArray_1863[var41] = -1;
                  } else {
                     var48 = true;
                  }
               }
            }

            if(!var48) {
               this.aShortArray_1863 = null;
            }
         }

         if(!var3) {
            this.aShortArray_1859 = null;
         }

         if(!var2) {
            this.aByteArray_1860 = null;
         }

      }
   }

   public int method1223(int var1, int var2, int var3, byte var4, byte var5, short var6, byte var7, short var8) {
      this.aShortArray_1857[this.anInt_1856] = (short)var1;
      this.aShortArray_1845[this.anInt_1856] = (short)var2;
      this.aShortArray_1869[this.anInt_1856] = (short)var3;
      this.aByteArray_1860[this.anInt_1856] = var4;
      this.aShortArray_1863[this.anInt_1856] = (short)var5;
      this.aShortArray_1876[this.anInt_1856] = var6;
      this.aByteArray_1864[this.anInt_1856] = var7;
      this.aShortArray_1859[this.anInt_1856] = var8;
      return this.anInt_1856++;
   }

   public byte method1224(short var1, short var2, short var3, short var4, short var5, short var6, byte var7, byte var8, byte var9) {
      if(this.anInt_1847 >= 255) {
         throw new IllegalStateException();
      } else {
         this.aByteArray_1870[this.anInt_1847] = 3;
         this.aShortArray_1871[this.anInt_1847] = var1;
         this.aShortArray_1872[this.anInt_1847] = var2;
         this.aShortArray_1852[this.anInt_1847] = var3;
         this.anIntArray_1874[this.anInt_1847] = var4;
         this.anIntArray_1875[this.anInt_1847] = var5;
         this.anIntArray_1865[this.anInt_1847] = var6;
         this.aByteArray_1851[this.anInt_1847] = var7;
         this.aByteArray_1881[this.anInt_1847] = var8;
         this.anIntArray_1877[this.anInt_1847] = var9;
         return (byte)(this.anInt_1847++);
      }
   }

   public int[][] method1225() {
      int[] var1 = new int[256];
      int var2 = 0;

      int var4;
      for(int var3 = 0; var3 < this.aClass107Array_1884.length; ++var3) {
         var4 = this.aClass107Array_1884[var3].anInt_1990 * 3797535;
         if(var4 >= 0) {
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }
      }

      int[][] var6 = new int[var2 + 1][];

      for(var4 = 0; var4 <= var2; ++var4) {
         var6[var4] = new int[var1[var4]];
         var1[var4] = 0;
      }

      for(var4 = 0; var4 < this.aClass107Array_1884.length; ++var4) {
         int var5 = this.aClass107Array_1884[var4].anInt_1990 * 3797535;
         if(var5 >= 0) {
            var6[var5][var1[var5]++] = var4;
         }
      }

      return var6;
   }

   public void method1226(short var1, short var2) {
      for(int var3 = 0; var3 < this.anInt_1856; ++var3) {
         if(this.aShortArray_1876[var3] == var1) {
            this.aShortArray_1876[var3] = var2;
         }
      }

   }

   ModelData(byte[] var1) {
      if(var1[0] == 1) {
         this.method1219(var1);
      } else if(var1[0] == 0) {
         this.method1222(var1);
      }

   }

   public void offset(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt_1849; ++var4) {
         this.anIntArray_1858[var4] += var1;
         this.anIntArray_1880[var4] += var2;
         this.anIntArray_1853[var4] += var3;
      }

   }

   public void method1228(int var1, int var2, int var3) {
      int var4;
      int var5;
      int var6;
      int var7;
      if(var3 != 0) {
         var4 = Class362.cosArray[var3];
         var5 = Class362.sinArray[var3];

         for(var6 = 0; var6 < this.anInt_1849; ++var6) {
            var7 = this.anIntArray_1880[var6] * var4 + this.anIntArray_1858[var6] * var5 >> 14;
            this.anIntArray_1880[var6] = this.anIntArray_1880[var6] * var5 - this.anIntArray_1858[var6] * var4 >> 14;
            this.anIntArray_1858[var6] = var7;
         }
      }

      if(var1 != 0) {
         var4 = Class362.cosArray[var1];
         var5 = Class362.sinArray[var1];

         for(var6 = 0; var6 < this.anInt_1849; ++var6) {
            var7 = this.anIntArray_1880[var6] * var5 - this.anIntArray_1853[var6] * var4 >> 14;
            this.anIntArray_1853[var6] = this.anIntArray_1880[var6] * var4 + this.anIntArray_1853[var6] * var5 >> 14;
            this.anIntArray_1880[var6] = var7;
         }
      }

      if(var2 != 0) {
         var4 = Class362.cosArray[var2];
         var5 = Class362.sinArray[var2];

         for(var6 = 0; var6 < this.anInt_1849; ++var6) {
            var7 = this.anIntArray_1853[var6] * var4 + this.anIntArray_1858[var6] * var5 >> 14;
            this.anIntArray_1853[var6] = this.anIntArray_1853[var6] * var5 - this.anIntArray_1858[var6] * var4 >> 14;
            this.anIntArray_1858[var6] = var7;
         }
      }

   }

   public void method1229(int var1) {
      int var2;
      for(var2 = 0; var2 < this.anInt_1849; ++var2) {
         this.anIntArray_1858[var2] <<= var1;
         this.anIntArray_1880[var2] <<= var1;
         this.anIntArray_1853[var2] <<= var1;
      }

      if(this.anInt_1847 > 0 && this.anIntArray_1874 != null) {
         for(var2 = 0; var2 < this.anIntArray_1874.length; ++var2) {
            this.anIntArray_1874[var2] <<= var1;
            this.anIntArray_1875[var2] <<= var1;
            if(this.aByteArray_1870[var2] != 1) {
               this.anIntArray_1865[var2] <<= var1;
            }
         }
      }

   }

   public static ModelData createModelUnpacker(CacheDataUnpacker var0, int var1, int var2) {
      byte[] var3 = var0.getDataBytes(var1, var2, -427826829);
      return var3 == null?null:new ModelData(var3);
   }

   void method1231(ByteArrayDataNode var1, ByteArrayDataNode var2, ByteArrayDataNode var3, ByteArrayDataNode var4, ByteArrayDataNode var5, ByteArrayDataNode var6) {
      for(int var7 = 0; var7 < this.anInt_1847; ++var7) {
         int var8 = this.aByteArray_1870[var7] & 255;
         if(var8 == 0) {
            this.aShortArray_1871[var7] = (short)var1.readShort(-343497308);
            this.aShortArray_1872[var7] = (short)var1.readShort(1544348660);
            this.aShortArray_1852[var7] = (short)var1.readShort(-1275643801);
         }

         if(var8 == 1) {
            this.aShortArray_1871[var7] = (short)var2.readShort(-972884806);
            this.aShortArray_1872[var7] = (short)var2.readShort(1334636362);
            this.aShortArray_1852[var7] = (short)var2.readShort(1575701212);
            if(this.anInt_1848 < 15) {
               this.anIntArray_1874[var7] = var3.readShort(-913521552);
               if(this.anInt_1848 < 14) {
                  this.anIntArray_1875[var7] = var3.readShort(1884652421);
               } else {
                  this.anIntArray_1875[var7] = var3.method4479(738776218);
               }

               this.anIntArray_1865[var7] = var3.readShort(-511050988);
            } else {
               this.anIntArray_1874[var7] = var3.method4479(738776218);
               this.anIntArray_1875[var7] = var3.method4479(738776218);
               this.anIntArray_1865[var7] = var3.method4479(738776218);
            }

            this.aByteArray_1851[var7] = var4.getByte((byte)35);
            this.aByteArray_1881[var7] = var5.getByte((byte)61);
            this.anIntArray_1877[var7] = var6.getByte((byte)67);
         }

         if(var8 == 2) {
            this.aShortArray_1871[var7] = (short)var2.readShort(2001352668);
            this.aShortArray_1872[var7] = (short)var2.readShort(1079226886);
            this.aShortArray_1852[var7] = (short)var2.readShort(348229991);
            if(this.anInt_1848 < 15) {
               this.anIntArray_1874[var7] = var3.readShort(-1284697563);
               if(this.anInt_1848 < 14) {
                  this.anIntArray_1875[var7] = var3.readShort(1512093063);
               } else {
                  this.anIntArray_1875[var7] = var3.method4479(738776218);
               }

               this.anIntArray_1865[var7] = var3.readShort(-1112549154);
            } else {
               this.anIntArray_1874[var7] = var3.method4479(738776218);
               this.anIntArray_1875[var7] = var3.method4479(738776218);
               this.anIntArray_1865[var7] = var3.method4479(738776218);
            }

            this.aByteArray_1851[var7] = var4.getByte((byte)126);
            this.aByteArray_1881[var7] = var5.getByte((byte)26);
            this.anIntArray_1877[var7] = var6.getByte((byte)74);
            this.anIntArray_1873[var7] = var6.getByte((byte)70);
            this.anIntArray_1879[var7] = var6.getByte((byte)52);
         }

         if(var8 == 3) {
            this.aShortArray_1871[var7] = (short)var2.readShort(-183801406);
            this.aShortArray_1872[var7] = (short)var2.readShort(-917998853);
            this.aShortArray_1852[var7] = (short)var2.readShort(-641769503);
            if(this.anInt_1848 < 15) {
               this.anIntArray_1874[var7] = var3.readShort(767148490);
               if(this.anInt_1848 < 14) {
                  this.anIntArray_1875[var7] = var3.readShort(-362428925);
               } else {
                  this.anIntArray_1875[var7] = var3.method4479(738776218);
               }

               this.anIntArray_1865[var7] = var3.readShort(2010090364);
            } else {
               this.anIntArray_1874[var7] = var3.method4479(738776218);
               this.anIntArray_1875[var7] = var3.method4479(738776218);
               this.anIntArray_1865[var7] = var3.method4479(738776218);
            }

            this.aByteArray_1851[var7] = var4.getByte((byte)40);
            this.aByteArray_1881[var7] = var5.getByte((byte)20);
            this.anIntArray_1877[var7] = var6.getByte((byte)44);
         }
      }

   }

   public int[][] method1232() {
      int[] var1 = new int[256];
      int var2 = 0;

      int var4;
      for(int var3 = 0; var3 < this.anInt_1856; ++var3) {
         var4 = this.anIntArray_1866[var3];
         if(var4 >= 0) {
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }
      }

      int[][] var6 = new int[var2 + 1][];

      for(var4 = 0; var4 <= var2; ++var4) {
         var6[var4] = new int[var1[var4]];
         var1[var4] = 0;
      }

      for(var4 = 0; var4 < this.anInt_1856; ++var4) {
         int var5 = this.anIntArray_1866[var4];
         if(var5 >= 0) {
            var6[var5][var1[var5]++] = var4;
         }
      }

      return var6;
   }

   public int[][] method1233(boolean var1) {
      int[] var2 = new int[400];
      int var3 = 0;
      int var4 = var1?this.anInt_1849:this.anInt_1850;

      int var6;
      for(int var5 = 0; var5 < var4; ++var5) {
         var6 = this.anIntArray_1844[var5];
         if(var6 >= 0) {
            ++var2[var6];
            if(var6 > var3) {
               var3 = var6;
            }
         }
      }

      int[][] var8 = new int[var3 + 1][];

      for(var6 = 0; var6 <= var3; ++var6) {
         var8[var6] = new int[var2[var6]];
         var2[var6] = 0;
      }

      for(var6 = 0; var6 < var4; ++var6) {
         int var7 = this.anIntArray_1844[var6];
         if(var7 >= 0) {
            var8[var7][var2[var7]++] = var6;
         }
      }

      return var8;
   }
}
