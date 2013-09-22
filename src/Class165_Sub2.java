import jaclib.memory.Stream;
import jaggl.OpenGL;

public class Class165_Sub2 extends Model {

   static final int anInt_10777 = 16;
   Class172[] aClass172Array_10778;
   static final int anInt_10779 = 1;
   static final int anInt_10780 = 2;
   static final int anInt_10781 = 4;
   static final int anInt_10782 = 8;
   short[] aShortArray_10783;
   short[] aShortArray_10784;
   float[] aFloatArray_10785;
   static int anInt_10786;
   static final int[] anIntArray_10787 = new int[8];
   short aShort_10788;
   short aShort_10789;
   OGLBufferPointer anOGLBufferPointer_10790;
   boolean aBoolean_10791 = false;
   int anInt_10792 = 0;
   int vertexCount = 0;
   Class179 aClass179_10794;
   int[] anIntArray_10795;
   int[] anIntArray_10796;
   static final int anInt_10797 = 4;
   int[] anIntArray_10798;
   Class175[] aClass175Array_10799;
   short[] aShortArray_10800;
   short[] aShortArray_10801;
   short[] aShortArray_10802;
   byte[] aByteArray_10803;
   int anInt_10804;
   float[] aFloatArray_10805;
   byte aByte_10806;
   final OpenGLRenderer aRenderer_Sub2_10807;
   int anInt_10808 = 0;
   short[] aShortArray_10809;
   int[] anIntArray_10810;
   Class166 aClass166_10811;
   short[] aShortArray_10812;
   short[] aShortArray_10813;
   short[] aShortArray_10814;
   int[][] anIntArrayArray_10815;
   short[] aShortArray_10816;
   OGLBufferPointer vertexPointer;
   OGLBufferPointer anOGLBufferPointer_10818;
   OGLBufferPointer anOGLBufferPointer_10819;
   int anInt_10820 = 0;
   int anInt_10821;
   static boolean aBoolean_10822;
   OGLBuffer anOGLBuffer_10823;
   boolean aBoolean_10824 = true;
   int anInt_10825;
   byte[] aByteArray_10826;
   boolean aBoolean_10827 = false;
   short aShort_10828;
   short aShort_10829;
   short aShort_10830;
   short aShort_10831;
   int[][] anIntArrayArray_10832;
   short aShort_10833;
   boolean aBoolean_10834 = false;
   int[] anIntArray_10835;
   Class140 aClass140_10836;
   Class86[] aClass86Array_10837;
   int anInt_10838 = 0;
   int anInt_10839;
   short[] aShortArray_10840;
   Class144[] aClass144Array_10841;
   int[][] anIntArrayArray_10842;
   static long[] aLongArray_10843;
   static float[] aFloatArray_10844 = new float[2];
   static final int[] anIntArray_10845 = new int[8];
   short aShort_10846;
   static final int[] anIntArray_10847 = new int[8];
   static int anInt_10848;
   static final int anInt_10849 = 7;
   static int anInt_10850;
   int anInt_10851;


   short method7424(ModelData var1, int var2, long var3, int var5, int var6, int var7, int var8, float var9, float var10) {
      int var11 = this.anIntArray_10835[var2];
      int var12 = this.anIntArray_10835[var2 + 1];
      int var13 = 0;

      for(int var14 = var11; var14 < var12; ++var14) {
         short var15 = this.aShortArray_10783[var14];
         if(var15 == 0) {
            var13 = var14;
            break;
         }

         if(aLongArray_10843[var14] == var3) {
            return (short)(var15 - 1);
         }
      }

      this.aShortArray_10783[var13] = (short)(this.anInt_10838 + 1);
      aLongArray_10843[var13] = var3;
      this.aShortArray_10802[this.anInt_10838] = (short)var5;
      this.aShortArray_10801[this.anInt_10838] = (short)var6;
      this.aShortArray_10800[this.anInt_10838] = (short)var7;
      this.aByteArray_10803[this.anInt_10838] = (byte)var8;
      this.aFloatArray_10805[this.anInt_10838] = var9;
      this.aFloatArray_10785[this.anInt_10838] = var10;
      return (short)(this.anInt_10838++);
   }

   Model method7425(Class165_Sub2 var1, Class165_Sub2 var2, int var3, boolean var4, boolean var5) {
      var1.aByte_10806 = 0;
      var1.anInt_10804 = var3;
      var1.anInt_10851 = this.anInt_10851;
      var1.aShort_10788 = this.aShort_10788;
      var1.aShort_10789 = this.aShort_10789;
      var1.anInt_10792 = this.anInt_10792;
      var1.vertexCount = this.vertexCount;
      var1.anInt_10838 = this.anInt_10838;
      var1.anInt_10820 = this.anInt_10820;
      var1.anInt_10808 = this.anInt_10808;
      var1.anInt_10839 = this.anInt_10839;
      if((var3 & 256) != 0) {
         var1.aBoolean_10834 = true;
      } else {
         var1.aBoolean_10834 = this.aBoolean_10834;
      }

      var1.aBoolean_10791 = this.aBoolean_10791;
      boolean var6 = Class191.method2465(var3, this.anInt_10851);
      boolean var7 = Class191.method2485(var3, this.anInt_10851);
      boolean var8 = Class191.method2483(var3, this.anInt_10851);
      boolean var9 = var6 | var7 | var8;
      int var10;
      if(var9) {
         if(var6) {
            if(var2.anIntArray_10798 != null && var2.anIntArray_10798.length >= this.anInt_10792) {
               var1.anIntArray_10798 = var2.anIntArray_10798;
            } else {
               var1.anIntArray_10798 = var2.anIntArray_10798 = new int[this.anInt_10792];
            }
         } else {
            var1.anIntArray_10798 = this.anIntArray_10798;
         }

         if(var7) {
            if(var2.anIntArray_10795 != null && var2.anIntArray_10795.length >= this.anInt_10792) {
               var1.anIntArray_10795 = var2.anIntArray_10795;
            } else {
               var1.anIntArray_10795 = var2.anIntArray_10795 = new int[this.anInt_10792];
            }
         } else {
            var1.anIntArray_10795 = this.anIntArray_10795;
         }

         if(var8) {
            if(var2.anIntArray_10796 != null && var2.anIntArray_10796.length >= this.anInt_10792) {
               var1.anIntArray_10796 = var2.anIntArray_10796;
            } else {
               var1.anIntArray_10796 = var2.anIntArray_10796 = new int[this.anInt_10792];
            }
         } else {
            var1.anIntArray_10796 = this.anIntArray_10796;
         }

         for(var10 = 0; var10 < this.anInt_10792; ++var10) {
            if(var6) {
               var1.anIntArray_10798[var10] = this.anIntArray_10798[var10];
            }

            if(var7) {
               var1.anIntArray_10795[var10] = this.anIntArray_10795[var10];
            }

            if(var8) {
               var1.anIntArray_10796[var10] = this.anIntArray_10796[var10];
            }
         }
      } else {
         var1.anIntArray_10798 = this.anIntArray_10798;
         var1.anIntArray_10795 = this.anIntArray_10795;
         var1.anIntArray_10796 = this.anIntArray_10796;
      }

      if(Class191.method2493(var3, this.anInt_10851)) {
         if(var4) {
            var1.aByte_10806 = (byte)(var1.aByte_10806 | 1);
         }

         var1.vertexPointer = var2.vertexPointer;
         var1.vertexPointer.offset = this.vertexPointer.offset;
         var1.vertexPointer.buffer = this.vertexPointer.buffer;
      } else if(Class191.method2477(var3, this.anInt_10851)) {
         var1.vertexPointer = this.vertexPointer;
      } else {
         var1.vertexPointer = null;
      }

      if(Class191.method2470(var3, this.anInt_10851)) {
         if(var2.aShortArray_10809 != null && var2.aShortArray_10809.length >= this.anInt_10820) {
            var1.aShortArray_10809 = var2.aShortArray_10809;
         } else {
            var1.aShortArray_10809 = var2.aShortArray_10809 = new short[this.anInt_10820];
         }

         for(var10 = 0; var10 < this.anInt_10820; ++var10) {
            var1.aShortArray_10809[var10] = this.aShortArray_10809[var10];
         }
      } else {
         var1.aShortArray_10809 = this.aShortArray_10809;
      }

      if(Class191.method2471(var3, this.anInt_10851)) {
         if(var2.aByteArray_10826 != null && var2.aByteArray_10826.length >= this.anInt_10820) {
            var1.aByteArray_10826 = var2.aByteArray_10826;
         } else {
            var1.aByteArray_10826 = var2.aByteArray_10826 = new byte[this.anInt_10820];
         }

         for(var10 = 0; var10 < this.anInt_10820; ++var10) {
            var1.aByteArray_10826[var10] = this.aByteArray_10826[var10];
         }
      } else {
         var1.aByteArray_10826 = this.aByteArray_10826;
      }

      if(Class191.method2479(var3, this.anInt_10851)) {
         if(var4) {
            var1.aByte_10806 = (byte)(var1.aByte_10806 | 2);
         }

         var1.anOGLBufferPointer_10818 = var2.anOGLBufferPointer_10818;
         var1.anOGLBufferPointer_10818.offset = this.anOGLBufferPointer_10818.offset;
         var1.anOGLBufferPointer_10818.buffer = this.anOGLBufferPointer_10818.buffer;
      } else if(Class191.method2477(var3, this.anInt_10851)) {
         var1.anOGLBufferPointer_10818 = this.anOGLBufferPointer_10818;
      } else {
         var1.anOGLBufferPointer_10818 = null;
      }

      int var11;
      if(Class191.method2469(var3, this.anInt_10851)) {
         if(var2.aShortArray_10802 != null && var2.aShortArray_10802.length >= this.anInt_10838) {
            var1.aShortArray_10802 = var2.aShortArray_10802;
            var1.aShortArray_10801 = var2.aShortArray_10801;
            var1.aShortArray_10800 = var2.aShortArray_10800;
         } else {
            var10 = this.anInt_10838;
            var1.aShortArray_10802 = var2.aShortArray_10802 = new short[var10];
            var1.aShortArray_10801 = var2.aShortArray_10801 = new short[var10];
            var1.aShortArray_10800 = var2.aShortArray_10800 = new short[var10];
         }

         if(this.aClass179_10794 != null) {
            if(var2.aClass179_10794 == null) {
               var2.aClass179_10794 = new Class179();
            }

            Class179 var12 = var1.aClass179_10794 = var2.aClass179_10794;
            if(var12.aShortArray_3093 == null || var12.aShortArray_3093.length < this.anInt_10838) {
               var11 = this.anInt_10838;
               var12.aShortArray_3093 = new short[var11];
               var12.aShortArray_3091 = new short[var11];
               var12.aShortArray_3092 = new short[var11];
               var12.aByteArray_3094 = new byte[var11];
            }

            for(var11 = 0; var11 < this.anInt_10838; ++var11) {
               var1.aShortArray_10802[var11] = this.aShortArray_10802[var11];
               var1.aShortArray_10801[var11] = this.aShortArray_10801[var11];
               var1.aShortArray_10800[var11] = this.aShortArray_10800[var11];
               var12.aShortArray_3093[var11] = this.aClass179_10794.aShortArray_3093[var11];
               var12.aShortArray_3091[var11] = this.aClass179_10794.aShortArray_3091[var11];
               var12.aShortArray_3092[var11] = this.aClass179_10794.aShortArray_3092[var11];
               var12.aByteArray_3094[var11] = this.aClass179_10794.aByteArray_3094[var11];
            }
         } else {
            for(var10 = 0; var10 < this.anInt_10838; ++var10) {
               var1.aShortArray_10802[var10] = this.aShortArray_10802[var10];
               var1.aShortArray_10801[var10] = this.aShortArray_10801[var10];
               var1.aShortArray_10800[var10] = this.aShortArray_10800[var10];
            }
         }

         var1.aByteArray_10803 = this.aByteArray_10803;
      } else {
         var1.aClass179_10794 = this.aClass179_10794;
         var1.aShortArray_10802 = this.aShortArray_10802;
         var1.aShortArray_10801 = this.aShortArray_10801;
         var1.aShortArray_10800 = this.aShortArray_10800;
         var1.aByteArray_10803 = this.aByteArray_10803;
      }

      if(Class191.method2473(var3, this.anInt_10851)) {
         if(var4) {
            var1.aByte_10806 = (byte)(var1.aByte_10806 | 4);
         }

         var1.anOGLBufferPointer_10819 = var2.anOGLBufferPointer_10819;
         var1.anOGLBufferPointer_10819.offset = this.anOGLBufferPointer_10819.offset;
         var1.anOGLBufferPointer_10819.buffer = this.anOGLBufferPointer_10819.buffer;
      } else if(Class191.method2475(var3, this.anInt_10851)) {
         var1.anOGLBufferPointer_10819 = this.anOGLBufferPointer_10819;
      } else {
         var1.anOGLBufferPointer_10819 = null;
      }

      if(Class191.method2472(var3, this.anInt_10851)) {
         if(var2.aFloatArray_10805 != null && var2.aFloatArray_10805.length >= this.anInt_10820) {
            var1.aFloatArray_10805 = var2.aFloatArray_10805;
            var1.aFloatArray_10785 = var2.aFloatArray_10785;
         } else {
            var10 = this.anInt_10838;
            var1.aFloatArray_10805 = var2.aFloatArray_10805 = new float[var10];
            var1.aFloatArray_10785 = var2.aFloatArray_10785 = new float[var10];
         }

         for(var10 = 0; var10 < this.anInt_10838; ++var10) {
            var1.aFloatArray_10805[var10] = this.aFloatArray_10805[var10];
            var1.aFloatArray_10785[var10] = this.aFloatArray_10785[var10];
         }
      } else {
         var1.aFloatArray_10805 = this.aFloatArray_10805;
         var1.aFloatArray_10785 = this.aFloatArray_10785;
      }

      if(Class191.method2480(var3, this.anInt_10851)) {
         if(var4) {
            var1.aByte_10806 = (byte)(var1.aByte_10806 | 8);
         }

         var1.anOGLBufferPointer_10790 = var2.anOGLBufferPointer_10790;
         var1.anOGLBufferPointer_10790.offset = this.anOGLBufferPointer_10790.offset;
         var1.anOGLBufferPointer_10790.buffer = this.anOGLBufferPointer_10790.buffer;
      } else if(Class191.method2477(var3, this.anInt_10851)) {
         var1.anOGLBufferPointer_10790 = this.anOGLBufferPointer_10790;
      } else {
         var1.anOGLBufferPointer_10790 = null;
      }

      if(Class191.method2466(var3, this.anInt_10851)) {
         if(var2.aShortArray_10784 != null && var2.aShortArray_10784.length >= this.anInt_10820) {
            var1.aShortArray_10784 = var2.aShortArray_10784;
            var1.aShortArray_10812 = var2.aShortArray_10812;
            var1.aShortArray_10813 = var2.aShortArray_10813;
         } else {
            var10 = this.anInt_10820;
            var1.aShortArray_10784 = var2.aShortArray_10784 = new short[var10];
            var1.aShortArray_10812 = var2.aShortArray_10812 = new short[var10];
            var1.aShortArray_10813 = var2.aShortArray_10813 = new short[var10];
         }

         for(var10 = 0; var10 < this.anInt_10820; ++var10) {
            var1.aShortArray_10784[var10] = this.aShortArray_10784[var10];
            var1.aShortArray_10812[var10] = this.aShortArray_10812[var10];
            var1.aShortArray_10813[var10] = this.aShortArray_10813[var10];
         }
      } else {
         var1.aShortArray_10784 = this.aShortArray_10784;
         var1.aShortArray_10812 = this.aShortArray_10812;
         var1.aShortArray_10813 = this.aShortArray_10813;
      }

      if(Class191.method2481(var3, this.anInt_10851)) {
         if(var4) {
            var1.aByte_10806 = (byte)(var1.aByte_10806 | 16);
         }

         var1.aClass140_10836 = var2.aClass140_10836;
         var1.aClass140_10836.aClass166_2660 = this.aClass140_10836.aClass166_2660;
      } else if(Class191.method2477(var3, this.anInt_10851)) {
         var1.aClass140_10836 = this.aClass140_10836;
      } else {
         var1.aClass140_10836 = null;
      }

      if(Class191.method2494(var3, this.anInt_10851)) {
         if(var2.aShortArray_10814 != null && var2.aShortArray_10814.length >= this.anInt_10820) {
            var1.aShortArray_10814 = var2.aShortArray_10814;
         } else {
            var10 = this.anInt_10820;
            var1.aShortArray_10814 = var2.aShortArray_10814 = new short[var10];
         }

         for(var10 = 0; var10 < this.anInt_10820; ++var10) {
            var1.aShortArray_10814[var10] = this.aShortArray_10814[var10];
         }
      } else {
         var1.aShortArray_10814 = this.aShortArray_10814;
      }

      if(Class191.method2491(var3, this.anInt_10851)) {
         if(var2.aClass144Array_10841 != null && var2.aClass144Array_10841.length >= this.anInt_10839) {
            var1.aClass144Array_10841 = var2.aClass144Array_10841;

            for(var10 = 0; var10 < this.anInt_10839; ++var10) {
               var1.aClass144Array_10841[var10].method1815(this.aClass144Array_10841[var10]);
            }
         } else {
            var10 = this.anInt_10839;
            var1.aClass144Array_10841 = var2.aClass144Array_10841 = new Class144[var10];

            for(var11 = 0; var11 < this.anInt_10839; ++var11) {
               var1.aClass144Array_10841[var11] = this.aClass144Array_10841[var11].method1814();
            }
         }
      } else {
         var1.aClass144Array_10841 = this.aClass144Array_10841;
      }

      var1.aClass175Array_10799 = this.aClass175Array_10799;
      if(this.aBoolean_10827) {
         var1.anInt_10825 = this.anInt_10825;
         var1.anInt_10821 = this.anInt_10821;
         var1.aShort_10830 = this.aShort_10830;
         var1.aShort_10831 = this.aShort_10831;
         var1.aShort_10828 = this.aShort_10828;
         var1.aShort_10846 = this.aShort_10846;
         var1.aShort_10829 = this.aShort_10829;
         var1.aShort_10833 = this.aShort_10833;
         var1.aBoolean_10827 = true;
      } else {
         var1.aBoolean_10827 = false;
      }

      var1.anIntArrayArray_10832 = this.anIntArrayArray_10832;
      var1.anIntArrayArray_10815 = this.anIntArrayArray_10815;
      var1.anIntArrayArray_10842 = this.anIntArrayArray_10842;
      var1.aShortArray_10783 = this.aShortArray_10783;
      var1.anIntArray_10835 = this.anIntArray_10835;
      var1.aShortArray_10840 = this.aShortArray_10840;
      var1.aShortArray_10816 = this.aShortArray_10816;
      var1.anIntArray_10810 = this.anIntArray_10810;
      var1.aClass86Array_10837 = this.aClass86Array_10837;
      var1.aClass172Array_10778 = this.aClass172Array_10778;
      return var1;
   }

   public int method2015() {
      return this.anInt_10804;
   }

   public void method2042(int var1) {
      this.anInt_10804 = var1;
      if(this.aClass179_10794 != null && (this.anInt_10804 & 65536) == 0) {
         this.aShortArray_10802 = this.aClass179_10794.aShortArray_3093;
         this.aShortArray_10801 = this.aClass179_10794.aShortArray_3091;
         this.aShortArray_10800 = this.aClass179_10794.aShortArray_3092;
         this.aByteArray_10803 = this.aClass179_10794.aByteArray_3094;
         this.aClass179_10794 = null;
      }

      this.aBoolean_10824 = true;
      this.method7472();
   }

   public Model copy(byte var1, int var2, boolean var3) {
      boolean var4 = false;
      Class165_Sub2 var5;
      Class165_Sub2 var6;
      if(var1 > 0 && var1 <= 7) {
         var5 = this.aRenderer_Sub2_10807.aClass165_Sub2Array_10402[var1 - 1];
         var6 = this.aRenderer_Sub2_10807.aClass165_Sub2Array_10420[var1 - 1];
         var4 = true;
      } else {
         var6 = var5 = new Class165_Sub2(this.aRenderer_Sub2_10807);
      }

      return this.method7425(var6, var5, var2, var4, var3);
   }

   void method2034(int var1, int var2, int var3, int var4) {
      int var5;
      int var11;
      if(var1 == 0) {
         var5 = 0;
         anInt_10848 = 0;
         anInt_10786 = 0;
         anInt_10850 = 0;

         for(var11 = 0; var11 < this.vertexCount; ++var11) {
            anInt_10848 += this.anIntArray_10798[var11];
            anInt_10786 += this.anIntArray_10795[var11];
            anInt_10850 += this.anIntArray_10796[var11];
            ++var5;
         }

         if(var5 > 0) {
            anInt_10848 = anInt_10848 / var5 + var2;
            anInt_10786 = anInt_10786 / var5 + var3;
            anInt_10850 = anInt_10850 / var5 + var4;
         } else {
            anInt_10848 = var2;
            anInt_10786 = var3;
            anInt_10850 = var4;
         }

      } else if(var1 == 1) {
         for(var5 = 0; var5 < this.vertexCount; ++var5) {
            this.anIntArray_10798[var5] += var2;
            this.anIntArray_10795[var5] += var3;
            this.anIntArray_10796[var5] += var4;
         }

      } else {
         int var7;
         int var8;
         if(var1 == 2) {
            for(var5 = 0; var5 < this.vertexCount; ++var5) {
               this.anIntArray_10798[var5] -= anInt_10848;
               this.anIntArray_10795[var5] -= anInt_10786;
               this.anIntArray_10796[var5] -= anInt_10850;
               if(var4 != 0) {
                  var11 = Class362.cosArray[var4];
                  var7 = Class362.sinArray[var4];
                  var8 = this.anIntArray_10795[var5] * var11 + this.anIntArray_10798[var5] * var7 + 16383 >> 14;
                  this.anIntArray_10795[var5] = this.anIntArray_10795[var5] * var7 - this.anIntArray_10798[var5] * var11 + 16383 >> 14;
                  this.anIntArray_10798[var5] = var8;
               }

               if(var2 != 0) {
                  var11 = Class362.cosArray[var2];
                  var7 = Class362.sinArray[var2];
                  var8 = this.anIntArray_10795[var5] * var7 - this.anIntArray_10796[var5] * var11 + 16383 >> 14;
                  this.anIntArray_10796[var5] = this.anIntArray_10795[var5] * var11 + this.anIntArray_10796[var5] * var7 + 16383 >> 14;
                  this.anIntArray_10795[var5] = var8;
               }

               if(var3 != 0) {
                  var11 = Class362.cosArray[var3];
                  var7 = Class362.sinArray[var3];
                  var8 = this.anIntArray_10796[var5] * var11 + this.anIntArray_10798[var5] * var7 + 16383 >> 14;
                  this.anIntArray_10796[var5] = this.anIntArray_10796[var5] * var7 - this.anIntArray_10798[var5] * var11 + 16383 >> 14;
                  this.anIntArray_10798[var5] = var8;
               }

               this.anIntArray_10798[var5] += anInt_10848;
               this.anIntArray_10795[var5] += anInt_10786;
               this.anIntArray_10796[var5] += anInt_10850;
            }

         } else if(var1 == 3) {
            for(var5 = 0; var5 < this.vertexCount; ++var5) {
               this.anIntArray_10798[var5] -= anInt_10848;
               this.anIntArray_10795[var5] -= anInt_10786;
               this.anIntArray_10796[var5] -= anInt_10850;
               this.anIntArray_10798[var5] = this.anIntArray_10798[var5] * var2 / 128;
               this.anIntArray_10795[var5] = this.anIntArray_10795[var5] * var3 / 128;
               this.anIntArray_10796[var5] = this.anIntArray_10796[var5] * var4 / 128;
               this.anIntArray_10798[var5] += anInt_10848;
               this.anIntArray_10795[var5] += anInt_10786;
               this.anIntArray_10796[var5] += anInt_10850;
            }

         } else {
            Class175 var10;
            Class144 var12;
            if(var1 == 5) {
               for(var5 = 0; var5 < this.anInt_10820; ++var5) {
                  var11 = (this.aByteArray_10826[var5] & 255) + var2 * 8;
                  if(var11 < 0) {
                     var11 = 0;
                  } else if(var11 > 255) {
                     var11 = 255;
                  }

                  this.aByteArray_10826[var5] = (byte)var11;
               }

               if(this.anOGLBufferPointer_10818 != null) {
                  this.anOGLBufferPointer_10818.buffer = null;
               }

               if(this.aClass175Array_10799 != null) {
                  for(var5 = 0; var5 < this.anInt_10839; ++var5) {
                     var10 = this.aClass175Array_10799[var5];
                     var12 = this.aClass144Array_10841[var5];
                     var12.anInt_2692 = var12.anInt_2692 & 16777215 | 255 - (this.aByteArray_10826[var10.anInt_3055] & 255) << 24;
                  }
               }

            } else if(var1 == 7) {
               for(var5 = 0; var5 < this.anInt_10820; ++var5) {
                  var11 = this.aShortArray_10809[var5] & '\uffff';
                  var7 = var11 >> 10 & 63;
                  var8 = var11 >> 7 & 7;
                  int var9 = var11 & 127;
                  var7 = var7 + var2 & 63;
                  var8 += var3 / 4;
                  if(var8 < 0) {
                     var8 = 0;
                  } else if(var8 > 7) {
                     var8 = 7;
                  }

                  var9 += var4;
                  if(var9 < 0) {
                     var9 = 0;
                  } else if(var9 > 127) {
                     var9 = 127;
                  }

                  this.aShortArray_10809[var5] = (short)(var7 << 10 | var8 << 7 | var9);
               }

               if(this.anOGLBufferPointer_10818 != null) {
                  this.anOGLBufferPointer_10818.buffer = null;
               }

               if(this.aClass175Array_10799 != null) {
                  for(var5 = 0; var5 < this.anInt_10839; ++var5) {
                     var10 = this.aClass175Array_10799[var5];
                     var12 = this.aClass144Array_10841[var5];
                     var12.anInt_2692 = var12.anInt_2692 & -16777216 | Class541.anIntArray_9470[this.aShortArray_10809[var10.anInt_3055] & '\uffff'] & 16777215;
                  }
               }

            } else {
               Class144 var6;
               if(var1 == 8) {
                  for(var5 = 0; var5 < this.anInt_10839; ++var5) {
                     var6 = this.aClass144Array_10841[var5];
                     var6.anInt_2687 += var2;
                     var6.anInt_2691 += var3;
                  }

               } else if(var1 == 10) {
                  for(var5 = 0; var5 < this.anInt_10839; ++var5) {
                     var6 = this.aClass144Array_10841[var5];
                     var6.anInt_2690 = var6.anInt_2690 * var2 >> 7;
                     var6.anInt_2688 = var6.anInt_2688 * var3 >> 7;
                  }

               } else if(var1 == 9) {
                  for(var5 = 0; var5 < this.anInt_10839; ++var5) {
                     var6 = this.aClass144Array_10841[var5];
                     var6.anInt_2689 = var6.anInt_2689 + var2 & 16383;
                  }

               }
            }
         }
      }
   }

   public void method2017(int var1) {
      int var2 = Class362.cosArray[var1];
      int var3 = Class362.sinArray[var1];

      for(int var4 = 0; var4 < this.vertexCount; ++var4) {
         int var5 = this.anIntArray_10796[var4] * var2 + this.anIntArray_10798[var4] * var3 >> 14;
         this.anIntArray_10796[var4] = this.anIntArray_10796[var4] * var3 - this.anIntArray_10798[var4] * var2 >> 14;
         this.anIntArray_10798[var4] = var5;
      }

      if(this.vertexPointer != null) {
         this.vertexPointer.buffer = null;
      }

      this.aBoolean_10827 = false;
   }

   public void method2055(int var1) {
      int var2 = Class362.cosArray[var1];
      int var3 = Class362.sinArray[var1];

      int var4;
      int var5;
      for(var4 = 0; var4 < this.vertexCount; ++var4) {
         var5 = this.anIntArray_10796[var4] * var2 + this.anIntArray_10798[var4] * var3 >> 14;
         this.anIntArray_10796[var4] = this.anIntArray_10796[var4] * var3 - this.anIntArray_10798[var4] * var2 >> 14;
         this.anIntArray_10798[var4] = var5;
      }

      for(var4 = 0; var4 < this.anInt_10838; ++var4) {
         var5 = this.aShortArray_10800[var4] * var2 + this.aShortArray_10802[var4] * var3 >> 14;
         this.aShortArray_10800[var4] = (short)(this.aShortArray_10800[var4] * var3 - this.aShortArray_10802[var4] * var2 >> 14);
         this.aShortArray_10802[var4] = (short)var5;
      }

      if(this.anOGLBufferPointer_10819 == null && this.anOGLBufferPointer_10818 != null) {
         this.anOGLBufferPointer_10818.buffer = null;
      }

      if(this.anOGLBufferPointer_10819 != null) {
         this.anOGLBufferPointer_10819.buffer = null;
      }

      if(this.vertexPointer != null) {
         this.vertexPointer.buffer = null;
      }

      this.aBoolean_10827 = false;
   }

   public void rotateY(int var1) {
      int var2 = Class362.cosArray[var1];
      int var3 = Class362.sinArray[var1];

      for(int var4 = 0; var4 < this.vertexCount; ++var4) {
         int var5 = this.anIntArray_10795[var4] * var3 - this.anIntArray_10796[var4] * var2 >> 14;
         this.anIntArray_10796[var4] = this.anIntArray_10795[var4] * var2 + this.anIntArray_10796[var4] * var3 >> 14;
         this.anIntArray_10795[var4] = var5;
      }

      if(this.vertexPointer != null) {
         this.vertexPointer.buffer = null;
      }

      this.aBoolean_10827 = false;
   }

   public void rotateX(int var1) {
      int var2 = Class362.cosArray[var1];
      int var3 = Class362.sinArray[var1];

      for(int var4 = 0; var4 < this.vertexCount; ++var4) {
         int var5 = this.anIntArray_10795[var4] * var2 + this.anIntArray_10798[var4] * var3 >> 14;
         this.anIntArray_10795[var4] = this.anIntArray_10795[var4] * var3 - this.anIntArray_10798[var4] * var2 >> 14;
         this.anIntArray_10798[var4] = var5;
      }

      if(this.vertexPointer != null) {
         this.vertexPointer.buffer = null;
      }

      this.aBoolean_10827 = false;
   }

   public void offset(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.vertexCount; ++var4) {
         if(var1 != 0) {
            this.anIntArray_10798[var4] += var1;
         }

         if(var2 != 0) {
            this.anIntArray_10795[var4] += var2;
         }

         if(var3 != 0) {
            this.anIntArray_10796[var4] += var3;
         }
      }

      if(this.vertexPointer != null) {
         this.vertexPointer.buffer = null;
      }

      this.aBoolean_10827 = false;
   }

   public void method2021() {
      int var1;
      for(var1 = 0; var1 < this.vertexCount; ++var1) {
         this.anIntArray_10796[var1] = -this.anIntArray_10796[var1];
      }

      for(var1 = 0; var1 < this.anInt_10838; ++var1) {
         this.aShortArray_10800[var1] = (short)(-this.aShortArray_10800[var1]);
      }

      for(var1 = 0; var1 < this.anInt_10820; ++var1) {
         short var2 = this.aShortArray_10784[var1];
         this.aShortArray_10784[var1] = this.aShortArray_10813[var1];
         this.aShortArray_10813[var1] = var2;
      }

      if(this.anOGLBufferPointer_10819 == null && this.anOGLBufferPointer_10818 != null) {
         this.anOGLBufferPointer_10818.buffer = null;
      }

      if(this.anOGLBufferPointer_10819 != null) {
         this.anOGLBufferPointer_10819.buffer = null;
      }

      if(this.vertexPointer != null) {
         this.vertexPointer.buffer = null;
      }

      if(this.aClass140_10836 != null) {
         this.aClass140_10836.aClass166_2660 = null;
      }

      this.aBoolean_10827 = false;
   }

   public void method2023(int var1, int var2, Plane var3, Plane var4, int var5, int var6, int var7) {
      if(!this.aBoolean_10827) {
         this.method7475();
      }

      int var8 = var5 + this.aShort_10830;
      int var9 = var5 + this.aShort_10831;
      int var10 = var7 + this.aShort_10829;
      int var11 = var7 + this.aShort_10833;
      if(var1 != 1 && var1 != 2 && var1 != 3 && var1 != 5 || var8 >= 0 && var9 + var3.anInt_3031 * 69671577 >> var3.shiftAmount * 1694172417 < var3.maxWidth * 1658489349 && var10 >= 0 && var11 + var3.anInt_3031 * 69671577 >> var3.shiftAmount * 1694172417 < var3.maxHeight * 445373459) {
         if(var1 != 4 && var1 != 5) {
            var8 >>= var3.shiftAmount * 1694172417;
            var9 = var9 + (var3.anInt_3031 * 69671577 - 1) >> var3.shiftAmount * 1694172417;
            var10 >>= var3.shiftAmount * 1694172417;
            var11 = var11 + (var3.anInt_3031 * 69671577 - 1) >> var3.shiftAmount * 1694172417;
            if(var3.method2155(var8, var10, (short)-5507) == var6 && var3.method2155(var9, var10, (short)19646) == var6 && var3.method2155(var8, var11, (short)-24129) == var6 && var3.method2155(var9, var11, (short)3784) == var6) {
               return;
            }
         } else {
            if(var4 == null) {
               return;
            }

            if(var8 < 0 || var9 + var4.anInt_3031 * 69671577 >> var4.shiftAmount * 1694172417 >= var4.maxWidth * 1658489349 || var10 < 0 || var11 + var4.anInt_3031 * 69671577 >> var4.shiftAmount * 1694172417 >= var4.maxHeight * 445373459) {
               return;
            }
         }

         int var12;
         if(var1 == 1) {
            for(var12 = 0; var12 < this.vertexCount; ++var12) {
               this.anIntArray_10795[var12] = this.anIntArray_10795[var12] + var3.getHeight(this.anIntArray_10798[var12] + var5, this.anIntArray_10796[var12] + var7) - var6;
            }
         } else {
            int var13;
            int var14;
            if(var1 == 2) {
               short var19 = this.aShort_10828;
               if(var19 == 0) {
                  return;
               }

               for(var13 = 0; var13 < this.vertexCount; ++var13) {
                  var14 = (this.anIntArray_10795[var13] << 16) / var19;
                  if(var14 < var2) {
                     this.anIntArray_10795[var13] += (var3.getHeight(this.anIntArray_10798[var13] + var5, this.anIntArray_10796[var13] + var7) - var6) * (var2 - var14) / var2;
                  }
               }
            } else {
               int var15;
               if(var1 == 3) {
                  var12 = (var2 & 255) * 4;
                  var13 = (var2 >> 8 & 255) * 4;
                  var14 = (var2 >> 16 & 255) << 6;
                  var15 = (var2 >> 24 & 255) << 6;
                  if(var5 - (var12 >> 1) < 0 || var5 + (var12 >> 1) + var3.anInt_3031 * 69671577 >= var3.maxWidth * 1658489349 << var3.shiftAmount * 1694172417 || var7 - (var13 >> 1) < 0 || var7 + (var13 >> 1) + var3.anInt_3031 * 69671577 >= var3.maxHeight * 445373459 << var3.shiftAmount * 1694172417) {
                     return;
                  }

                  this.method2061(var3, var5, var6, var7, var12, var13, var14, var15);
               } else if(var1 == 4) {
                  var12 = this.aShort_10846 - this.aShort_10828;

                  for(var13 = 0; var13 < this.vertexCount; ++var13) {
                     this.anIntArray_10795[var13] = this.anIntArray_10795[var13] + (var4.getHeight(this.anIntArray_10798[var13] + var5, this.anIntArray_10796[var13] + var7) - var6) + var12;
                  }
               } else if(var1 == 5) {
                  var12 = this.aShort_10846 - this.aShort_10828;

                  for(var13 = 0; var13 < this.vertexCount; ++var13) {
                     var14 = this.anIntArray_10798[var13] + var5;
                     var15 = this.anIntArray_10796[var13] + var7;
                     int var16 = var3.getHeight(var14, var15);
                     int var17 = var4.getHeight(var14, var15);
                     int var18 = var16 - var17 - var2;
                     this.anIntArray_10795[var13] = ((this.anIntArray_10795[var13] << 8) / var12 * var18 >> 8) - (var6 - var16);
                  }
               }
            }
         }

         if(this.vertexPointer != null) {
            this.vertexPointer.buffer = null;
         }

         this.aBoolean_10827 = false;
      }
   }

   public void method2060(byte var1, byte[] var2) {
      int var3;
      if(var2 == null) {
         for(var3 = 0; var3 < this.anInt_10820; ++var3) {
            this.aByteArray_10826[var3] = var1;
         }
      } else {
         for(var3 = 0; var3 < this.anInt_10820; ++var3) {
            int var4 = 255 - (255 - (var2[var3] & 255)) * (255 - (var1 & 255)) / 255;
            this.aByteArray_10826[var3] = (byte)var4;
         }
      }

      if(this.anOGLBufferPointer_10818 != null) {
         this.anOGLBufferPointer_10818.buffer = null;
      }

   }

   public int method2037() {
      if(!this.aBoolean_10827) {
         this.method7475();
      }

      return this.anInt_10821;
   }

   public void method2044(int var1) {
      this.aShort_10788 = (short)var1;
      if(this.anOGLBufferPointer_10818 != null) {
         this.anOGLBufferPointer_10818.buffer = null;
      }

   }

   public int method2039() {
      if(!this.aBoolean_10827) {
         this.method7475();
      }

      return this.aShort_10830;
   }

   public void method2012(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.vertexCount; ++var4) {
         if(var1 != 128) {
            this.anIntArray_10798[var4] = this.anIntArray_10798[var4] * var1 >> 7;
         }

         if(var2 != 128) {
            this.anIntArray_10795[var4] = this.anIntArray_10795[var4] * var2 >> 7;
         }

         if(var3 != 128) {
            this.anIntArray_10796[var4] = this.anIntArray_10796[var4] * var3 >> 7;
         }
      }

      if(this.vertexPointer != null) {
         this.vertexPointer.buffer = null;
      }

      this.aBoolean_10827 = false;
   }

   public int method2038() {
      if(!this.aBoolean_10827) {
         this.method7475();
      }

      return this.anInt_10825;
   }

   public int method2056() {
      if(!this.aBoolean_10827) {
         this.method7475();
      }

      return this.aShort_10846;
   }

   public int method2065() {
      if(!this.aBoolean_10827) {
         this.method7475();
      }

      return this.aShort_10829;
   }

   public int method2043() {
      if(!this.aBoolean_10827) {
         this.method7475();
      }

      return this.aShort_10833;
   }

   public void method2053(Model var1, int var2, int var3, int var4, boolean var5) {
      Class165_Sub2 var6 = (Class165_Sub2)var1;
      if(this.anInt_10820 != 0 && var6.anInt_10820 != 0) {
         int var7 = var6.vertexCount;
         int[] var8 = var6.anIntArray_10798;
         int[] var9 = var6.anIntArray_10795;
         int[] var10 = var6.anIntArray_10796;
         short[] var11 = var6.aShortArray_10802;
         short[] var12 = var6.aShortArray_10801;
         short[] var13 = var6.aShortArray_10800;
         byte[] var14 = var6.aByteArray_10803;
         short[] var15;
         short[] var17;
         short[] var16;
         byte[] var18;
         if(this.aClass179_10794 != null) {
            var15 = this.aClass179_10794.aShortArray_3093;
            var16 = this.aClass179_10794.aShortArray_3091;
            var17 = this.aClass179_10794.aShortArray_3092;
            var18 = this.aClass179_10794.aByteArray_3094;
         } else {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
         }

         short[] var19;
         short[] var21;
         short[] var20;
         byte[] var22;
         if(var6.aClass179_10794 != null) {
            var19 = var6.aClass179_10794.aShortArray_3093;
            var20 = var6.aClass179_10794.aShortArray_3091;
            var21 = var6.aClass179_10794.aShortArray_3092;
            var22 = var6.aClass179_10794.aByteArray_3094;
         } else {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
         }

         int[] var23 = var6.anIntArray_10835;
         short[] var24 = var6.aShortArray_10783;
         if(!var6.aBoolean_10827) {
            var6.method7475();
         }

         short var25 = var6.aShort_10828;
         short var26 = var6.aShort_10846;
         short var27 = var6.aShort_10830;
         short var28 = var6.aShort_10831;
         short var29 = var6.aShort_10829;
         short var30 = var6.aShort_10833;

         for(int var31 = 0; var31 < this.vertexCount; ++var31) {
            int var32 = this.anIntArray_10795[var31] - var3;
            if(var32 >= var25 && var32 <= var26) {
               int var33 = this.anIntArray_10798[var31] - var2;
               if(var33 >= var27 && var33 <= var28) {
                  int var34 = this.anIntArray_10796[var31] - var4;
                  if(var34 >= var29 && var34 <= var30) {
                     int var35 = -1;
                     int var36 = this.anIntArray_10835[var31];
                     int var37 = this.anIntArray_10835[var31 + 1];

                     int var38;
                     for(var38 = var36; var38 < var37; ++var38) {
                        var35 = this.aShortArray_10783[var38] - 1;
                        if(var35 == -1 || this.aByteArray_10803[var35] != 0) {
                           break;
                        }
                     }

                     if(var35 != -1) {
                        for(var38 = 0; var38 < var7; ++var38) {
                           if(var33 == var8[var38] && var34 == var10[var38] && var32 == var9[var38]) {
                              int var39 = -1;
                              var36 = var23[var38];
                              var37 = var23[var38 + 1];

                              for(int var40 = var36; var40 < var37; ++var40) {
                                 var39 = var24[var40] - 1;
                                 if(var39 == -1 || var14[var39] != 0) {
                                    break;
                                 }
                              }

                              if(var39 != -1) {
                                 if(var15 == null) {
                                    this.aClass179_10794 = new Class179();
                                    var15 = this.aClass179_10794.aShortArray_3093 = Class104_Sub15.method7368(this.aShortArray_10802, 2045256722);
                                    var16 = this.aClass179_10794.aShortArray_3091 = Class104_Sub15.method7368(this.aShortArray_10801, 2048147539);
                                    var17 = this.aClass179_10794.aShortArray_3092 = Class104_Sub15.method7368(this.aShortArray_10800, 2033768819);
                                    var18 = this.aClass179_10794.aByteArray_3094 = Class570.method6262(this.aByteArray_10803, -708028207);
                                 }

                                 if(var19 == null) {
                                    Class179 var47 = var6.aClass179_10794 = new Class179();
                                    var19 = var47.aShortArray_3093 = Class104_Sub15.method7368(var11, 2022473290);
                                    var20 = var47.aShortArray_3091 = Class104_Sub15.method7368(var12, 2052236486);
                                    var21 = var47.aShortArray_3092 = Class104_Sub15.method7368(var13, 2145214603);
                                    var22 = var47.aByteArray_3094 = Class570.method6262(var14, -708028207);
                                 }

                                 short var46 = this.aShortArray_10802[var35];
                                 short var41 = this.aShortArray_10801[var35];
                                 short var42 = this.aShortArray_10800[var35];
                                 byte var43 = this.aByteArray_10803[var35];
                                 var36 = var23[var38];
                                 var37 = var23[var38 + 1];

                                 int var44;
                                 int var45;
                                 for(var44 = var36; var44 < var37; ++var44) {
                                    var45 = var24[var44] - 1;
                                    if(var45 == -1) {
                                       break;
                                    }

                                    if(var22[var45] != 0) {
                                       var19[var45] += var46;
                                       var20[var45] += var41;
                                       var21[var45] += var42;
                                       var22[var45] += var43;
                                    }
                                 }

                                 var46 = var11[var39];
                                 var41 = var12[var39];
                                 var42 = var13[var39];
                                 var43 = var14[var39];
                                 var36 = this.anIntArray_10835[var31];
                                 var37 = this.anIntArray_10835[var31 + 1];

                                 for(var44 = var36; var44 < var37; ++var44) {
                                    var45 = this.aShortArray_10783[var44] - 1;
                                    if(var45 == -1) {
                                       break;
                                    }

                                    if(var18[var45] != 0) {
                                       var15[var45] += var46;
                                       var16[var45] += var41;
                                       var17[var45] += var42;
                                       var18[var45] += var43;
                                    }
                                 }

                                 if(this.anOGLBufferPointer_10819 == null && this.anOGLBufferPointer_10818 != null) {
                                    this.anOGLBufferPointer_10818.buffer = null;
                                 }

                                 if(this.anOGLBufferPointer_10819 != null) {
                                    this.anOGLBufferPointer_10819.buffer = null;
                                 }

                                 if(var6.anOGLBufferPointer_10819 == null && var6.anOGLBufferPointer_10818 != null) {
                                    var6.anOGLBufferPointer_10818.buffer = null;
                                 }

                                 if(var6.anOGLBufferPointer_10819 != null) {
                                    var6.anOGLBufferPointer_10819.buffer = null;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

      }
   }

   public void method2028(int var1) {
      this.aShort_10789 = (short)var1;
      if(this.anOGLBufferPointer_10818 != null) {
         this.anOGLBufferPointer_10818.buffer = null;
      }

      if(this.anOGLBufferPointer_10819 != null) {
         this.anOGLBufferPointer_10819.buffer = null;
      }

   }

   public int method2046() {
      return this.aShort_10788;
   }

   public int method2047() {
      return this.aShort_10789;
   }

   public void method2030(short var1, short var2) {
      int var3;
      for(var3 = 0; var3 < this.anInt_10820; ++var3) {
         if(this.aShortArray_10809[var3] == var1) {
            this.aShortArray_10809[var3] = var2;
         }
      }

      if(this.aClass175Array_10799 != null) {
         for(var3 = 0; var3 < this.anInt_10839; ++var3) {
            Class175 var4 = this.aClass175Array_10799[var3];
            Class144 var5 = this.aClass144Array_10841[var3];
            var5.anInt_2692 = var5.anInt_2692 & -16777216 | Class541.anIntArray_9470[this.aShortArray_10809[var4.anInt_3055] & '\uffff'] & 16777215;
         }
      }

      if(this.anOGLBufferPointer_10818 != null) {
         this.anOGLBufferPointer_10818.buffer = null;
      }

   }

   public void method2035(short var1, short var2) {
      Class163 var3 = this.aRenderer_Sub2_10807.aClass163_2802;

      for(int var4 = 0; var4 < this.anInt_10820; ++var4) {
         if(this.aShortArray_10814[var4] == var1) {
            this.aShortArray_10814[var4] = var2;
         }
      }

      byte var11 = 0;
      byte var5 = 0;
      if(var1 != -1) {
         Class183 var6 = var3.method1996(var1 & '\uffff', (byte)2);
         var11 = var6.aByte_3165;
         var5 = var6.aByte_3176;
      }

      byte var12 = 0;
      byte var7 = 0;
      if(var2 != -1) {
         Class183 var8 = var3.method1996(var2 & '\uffff', (byte)2);
         var12 = var8.aByte_3165;
         var7 = var8.aByte_3176;
         if(var8.aByte_3145 != 0 || var8.aByte_3157 != 0) {
            this.aBoolean_10791 = true;
         }
      }

      if(var11 != var12 | var5 != var7) {
         if(this.aClass175Array_10799 != null) {
            for(int var13 = 0; var13 < this.anInt_10839; ++var13) {
               Class175 var9 = this.aClass175Array_10799[var13];
               Class144 var10 = this.aClass144Array_10841[var13];
               var10.anInt_2692 = var10.anInt_2692 & -16777216 | Class541.anIntArray_9470[this.aShortArray_10809[var9.anInt_3055] & '\uffff'] & 16777215;
            }
         }

         if(this.anOGLBufferPointer_10818 != null) {
            this.anOGLBufferPointer_10818.buffer = null;
         }
      }

   }

   public void method2049(int var1, int var2, int var3, int var4) {
      int var5;
      for(var5 = 0; var5 < this.anInt_10820; ++var5) {
         int var6 = this.aShortArray_10809[var5] & '\uffff';
         int var7 = var6 >> 10 & 63;
         int var8 = var6 >> 7 & 7;
         int var9 = var6 & 127;
         if(var1 != -1) {
            var7 += (var1 - var7) * var4 >> 7;
         }

         if(var2 != -1) {
            var8 += (var2 - var8) * var4 >> 7;
         }

         if(var3 != -1) {
            var9 += (var3 - var9) * var4 >> 7;
         }

         this.aShortArray_10809[var5] = (short)(var7 << 10 | var8 << 7 | var9);
      }

      if(this.aClass175Array_10799 != null) {
         for(var5 = 0; var5 < this.anInt_10839; ++var5) {
            Class175 var10 = this.aClass175Array_10799[var5];
            Class144 var11 = this.aClass144Array_10841[var5];
            var11.anInt_2692 = var11.anInt_2692 & -16777216 | Class541.anIntArray_9470[this.aShortArray_10809[var10.anInt_3055] & '\uffff'] & 16777215;
         }
      }

      if(this.anOGLBufferPointer_10818 != null) {
         this.anOGLBufferPointer_10818.buffer = null;
      }

   }

   public boolean method2066() {
      if(this.aShortArray_10814 == null) {
         return true;
      } else {
         for(int var1 = 0; var1 < this.aShortArray_10814.length; ++var1) {
            if(this.aShortArray_10814[var1] != -1) {
               Class183 var2 = this.aRenderer_Sub2_10807.aClass163_2802.method1996(this.aShortArray_10814[var1] & '\uffff', (byte)2);
               if(var2.anInt_3146 * -534969509 != -1 && !this.aRenderer_Sub2_10807.aClass173_10320.method2178(var2, -1)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public boolean method2051() {
      return this.aBoolean_10791;
   }

   void method2064() {}

   void method2025() {}

   boolean method2031() {
      if(this.anIntArrayArray_10832 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < this.anInt_10792; ++var1) {
            this.anIntArray_10798[var1] <<= 4;
            this.anIntArray_10795[var1] <<= 4;
            this.anIntArray_10796[var1] <<= 4;
         }

         anInt_10848 = 0;
         anInt_10786 = 0;
         anInt_10850 = 0;
         return true;
      }
   }

   void method2033(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8) {
      int var9 = var2.length;
      int var10;
      int var11;
      int var15;
      int var50;
      int var49;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var10 = 0;
         anInt_10848 = 0;
         anInt_10786 = 0;
         anInt_10850 = 0;

         for(var11 = 0; var11 < var9; ++var11) {
            var50 = var2[var11];
            if(var50 < this.anIntArrayArray_10832.length) {
               int[] var52 = this.anIntArrayArray_10832[var50];

               for(var49 = 0; var49 < var52.length; ++var49) {
                  var15 = var52[var49];
                  if(this.aShortArray_10840 == null || (var7 & this.aShortArray_10840[var15]) != 0) {
                     anInt_10848 += this.anIntArray_10798[var15];
                     anInt_10786 += this.anIntArray_10795[var15];
                     anInt_10850 += this.anIntArray_10796[var15];
                     ++var10;
                  }
               }
            }
         }

         if(var10 > 0) {
            anInt_10848 = anInt_10848 / var10 + var3;
            anInt_10786 = anInt_10786 / var10 + var4;
            anInt_10850 = anInt_10850 / var10 + var5;
            aBoolean_10822 = true;
         } else {
            anInt_10848 = var3;
            anInt_10786 = var4;
            anInt_10850 = var5;
         }

      } else {
         int[] var12;
         int var13;
         if(var1 == 1) {
            if(var8 != null) {
               var10 = var8[0] * var3 + var8[1] * var4 + var8[2] * var5 + 8192 >> 14;
               var11 = var8[3] * var3 + var8[4] * var4 + var8[5] * var5 + 8192 >> 14;
               var50 = var8[6] * var3 + var8[7] * var4 + var8[8] * var5 + 8192 >> 14;
               var3 = var10;
               var4 = var11;
               var5 = var50;
            }

            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;

            for(var10 = 0; var10 < var9; ++var10) {
               var11 = var2[var10];
               if(var11 < this.anIntArrayArray_10832.length) {
                  var12 = this.anIntArrayArray_10832[var11];

                  for(var13 = 0; var13 < var12.length; ++var13) {
                     var49 = var12[var13];
                     if(this.aShortArray_10840 == null || (var7 & this.aShortArray_10840[var49]) != 0) {
                        this.anIntArray_10798[var49] += var3;
                        this.anIntArray_10795[var49] += var4;
                        this.anIntArray_10796[var49] += var5;
                     }
                  }
               }
            }

         } else {
            int var17;
            int var16;
            int var19;
            int var18;
            int var21;
            int var20;
            int var23;
            int var22;
            int var24;
            int var27;
            int var26;
            int var28;
            int var30;
            int var34;
            int[] var35;
            int var32;
            int var33;
            int var38;
            int var39;
            int var36;
            int var37;
            int var40;
            if(var1 == 2) {
               if(var8 != null) {
                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var50 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var49 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(aBoolean_10822) {
                     var16 = var8[0] * anInt_10848 + var8[3] * anInt_10786 + var8[6] * anInt_10850 + 8192 >> 14;
                     var17 = var8[1] * anInt_10848 + var8[4] * anInt_10786 + var8[7] * anInt_10850 + 8192 >> 14;
                     var18 = var8[2] * anInt_10848 + var8[5] * anInt_10786 + var8[8] * anInt_10850 + 8192 >> 14;
                     var16 += var13;
                     var17 += var49;
                     var18 += var15;
                     anInt_10848 = var16;
                     anInt_10786 = var17;
                     anInt_10850 = var18;
                     aBoolean_10822 = false;
                  }

                  int[] var51 = new int[9];
                  var17 = Class362.sinArray[var3];
                  var18 = Class362.cosArray[var3];
                  var19 = Class362.sinArray[var4];
                  var20 = Class362.cosArray[var4];
                  var21 = Class362.sinArray[var5];
                  var22 = Class362.cosArray[var5];
                  var23 = var18 * var21 + 8192 >> 14;
                  var24 = var18 * var22 + 8192 >> 14;
                  var51[0] = var19 * var21 + var20 * var24 + 8192 >> 14;
                  var51[1] = -var19 * var22 + var20 * var23 + 8192 >> 14;
                  var51[2] = var20 * var17 + 8192 >> 14;
                  var51[3] = var17 * var22 + 8192 >> 14;
                  var51[4] = var17 * var21 + 8192 >> 14;
                  var51[5] = -var18;
                  var51[6] = -var20 * var21 + var19 * var24 + 8192 >> 14;
                  var51[7] = var20 * var22 + var19 * var23 + 8192 >> 14;
                  var51[8] = var19 * var17 + 8192 >> 14;
                  int var53 = var51[0] * -anInt_10848 + var51[1] * -anInt_10786 + var51[2] * -anInt_10850 + 8192 >> 14;
                  var26 = var51[3] * -anInt_10848 + var51[4] * -anInt_10786 + var51[5] * -anInt_10850 + 8192 >> 14;
                  var27 = var51[6] * -anInt_10848 + var51[7] * -anInt_10786 + var51[8] * -anInt_10850 + 8192 >> 14;
                  var28 = var53 + anInt_10848;
                  int var54 = var26 + anInt_10786;
                  var30 = var27 + anInt_10850;
                  int[] var55 = new int[9];

                  for(var32 = 0; var32 < 3; ++var32) {
                     for(var33 = 0; var33 < 3; ++var33) {
                        var34 = 0;

                        for(int var56 = 0; var56 < 3; ++var56) {
                           var34 += var51[var32 * 3 + var56] * var8[var33 * 3 + var56];
                        }

                        var55[var32 * 3 + var33] = var34 + 8192 >> 14;
                     }
                  }

                  var32 = var51[0] * var13 + var51[1] * var49 + var51[2] * var15 + 8192 >> 14;
                  var33 = var51[3] * var13 + var51[4] * var49 + var51[5] * var15 + 8192 >> 14;
                  var34 = var51[6] * var13 + var51[7] * var49 + var51[8] * var15 + 8192 >> 14;
                  var32 += var28;
                  var33 += var54;
                  var34 += var30;
                  var35 = new int[9];

                  for(var36 = 0; var36 < 3; ++var36) {
                     for(var37 = 0; var37 < 3; ++var37) {
                        var38 = 0;

                        for(var39 = 0; var39 < 3; ++var39) {
                           var38 += var8[var36 * 3 + var39] * var55[var37 + var39 * 3];
                        }

                        var35[var36 * 3 + var37] = var38 + 8192 >> 14;
                     }
                  }

                  var36 = var8[0] * var32 + var8[1] * var33 + var8[2] * var34 + 8192 >> 14;
                  var37 = var8[3] * var32 + var8[4] * var33 + var8[5] * var34 + 8192 >> 14;
                  var38 = var8[6] * var32 + var8[7] * var33 + var8[8] * var34 + 8192 >> 14;
                  var36 += var10;
                  var37 += var11;
                  var38 += var50;

                  for(var39 = 0; var39 < var9; ++var39) {
                     var40 = var2[var39];
                     if(var40 < this.anIntArrayArray_10832.length) {
                        int[] var41 = this.anIntArrayArray_10832[var40];

                        for(int var42 = 0; var42 < var41.length; ++var42) {
                           int var43 = var41[var42];
                           if(this.aShortArray_10840 == null || (var7 & this.aShortArray_10840[var43]) != 0) {
                              int var44 = var35[0] * this.anIntArray_10798[var43] + var35[1] * this.anIntArray_10795[var43] + var35[2] * this.anIntArray_10796[var43] + 8192 >> 14;
                              int var45 = var35[3] * this.anIntArray_10798[var43] + var35[4] * this.anIntArray_10795[var43] + var35[5] * this.anIntArray_10796[var43] + 8192 >> 14;
                              int var46 = var35[6] * this.anIntArray_10798[var43] + var35[7] * this.anIntArray_10795[var43] + var35[8] * this.anIntArray_10796[var43] + 8192 >> 14;
                              var44 += var36;
                              var45 += var37;
                              var46 += var38;
                              this.anIntArray_10798[var43] = var44;
                              this.anIntArray_10795[var43] = var45;
                              this.anIntArray_10796[var43] = var46;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray_10832.length) {
                        var12 = this.anIntArrayArray_10832[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var49 = var12[var13];
                           if(this.aShortArray_10840 == null || (var7 & this.aShortArray_10840[var49]) != 0) {
                              this.anIntArray_10798[var49] -= anInt_10848;
                              this.anIntArray_10795[var49] -= anInt_10786;
                              this.anIntArray_10796[var49] -= anInt_10850;
                              if(var5 != 0) {
                                 var15 = Class362.cosArray[var5];
                                 var16 = Class362.sinArray[var5];
                                 var17 = this.anIntArray_10795[var49] * var15 + this.anIntArray_10798[var49] * var16 + 16383 >> 14;
                                 this.anIntArray_10795[var49] = this.anIntArray_10795[var49] * var16 - this.anIntArray_10798[var49] * var15 + 16383 >> 14;
                                 this.anIntArray_10798[var49] = var17;
                              }

                              if(var3 != 0) {
                                 var15 = Class362.cosArray[var3];
                                 var16 = Class362.sinArray[var3];
                                 var17 = this.anIntArray_10795[var49] * var16 - this.anIntArray_10796[var49] * var15 + 16383 >> 14;
                                 this.anIntArray_10796[var49] = this.anIntArray_10795[var49] * var15 + this.anIntArray_10796[var49] * var16 + 16383 >> 14;
                                 this.anIntArray_10795[var49] = var17;
                              }

                              if(var4 != 0) {
                                 var15 = Class362.cosArray[var4];
                                 var16 = Class362.sinArray[var4];
                                 var17 = this.anIntArray_10796[var49] * var15 + this.anIntArray_10798[var49] * var16 + 16383 >> 14;
                                 this.anIntArray_10796[var49] = this.anIntArray_10796[var49] * var16 - this.anIntArray_10798[var49] * var15 + 16383 >> 14;
                                 this.anIntArray_10798[var49] = var17;
                              }

                              this.anIntArray_10798[var49] += anInt_10848;
                              this.anIntArray_10795[var49] += anInt_10786;
                              this.anIntArray_10796[var49] += anInt_10850;
                           }
                        }
                     }
                  }

                  if(var6) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.anIntArrayArray_10832.length) {
                           var12 = this.anIntArrayArray_10832[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var49 = var12[var13];
                              if(this.aShortArray_10840 == null || (var7 & this.aShortArray_10840[var49]) != 0) {
                                 var15 = this.anIntArray_10835[var49];
                                 var16 = this.anIntArray_10835[var49 + 1];

                                 for(var17 = var15; var17 < var16; ++var17) {
                                    var18 = this.aShortArray_10783[var17] - 1;
                                    if(var18 == -1) {
                                       break;
                                    }

                                    if(var5 != 0) {
                                       var19 = Class362.cosArray[var5];
                                       var20 = Class362.sinArray[var5];
                                       var21 = this.aShortArray_10801[var18] * var19 + this.aShortArray_10802[var18] * var20 + 16383 >> 14;
                                       this.aShortArray_10801[var18] = (short)(this.aShortArray_10801[var18] * var20 - this.aShortArray_10802[var18] * var19 + 16383 >> 14);
                                       this.aShortArray_10802[var18] = (short)var21;
                                    }

                                    if(var3 != 0) {
                                       var19 = Class362.cosArray[var3];
                                       var20 = Class362.sinArray[var3];
                                       var21 = this.aShortArray_10801[var18] * var20 - this.aShortArray_10800[var18] * var19 + 16383 >> 14;
                                       this.aShortArray_10800[var18] = (short)(this.aShortArray_10801[var18] * var19 + this.aShortArray_10800[var18] * var20 + 16383 >> 14);
                                       this.aShortArray_10801[var18] = (short)var21;
                                    }

                                    if(var4 != 0) {
                                       var19 = Class362.cosArray[var4];
                                       var20 = Class362.sinArray[var4];
                                       var21 = this.aShortArray_10800[var18] * var19 + this.aShortArray_10802[var18] * var20 + 16383 >> 14;
                                       this.aShortArray_10800[var18] = (short)(this.aShortArray_10800[var18] * var20 - this.aShortArray_10802[var18] * var19 + 16383 >> 14);
                                       this.aShortArray_10802[var18] = (short)var21;
                                    }
                                 }
                              }
                           }
                        }
                     }

                     if(this.anOGLBufferPointer_10819 == null && this.anOGLBufferPointer_10818 != null) {
                        this.anOGLBufferPointer_10818.buffer = null;
                     }

                     if(this.anOGLBufferPointer_10819 != null) {
                        this.anOGLBufferPointer_10819.buffer = null;
                     }
                  }
               }

            } else if(var1 == 3) {
               if(var8 != null) {
                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var50 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var49 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(aBoolean_10822) {
                     var16 = var8[0] * anInt_10848 + var8[3] * anInt_10786 + var8[6] * anInt_10850 + 8192 >> 14;
                     var17 = var8[1] * anInt_10848 + var8[4] * anInt_10786 + var8[7] * anInt_10850 + 8192 >> 14;
                     var18 = var8[2] * anInt_10848 + var8[5] * anInt_10786 + var8[8] * anInt_10850 + 8192 >> 14;
                     var16 += var13;
                     var17 += var49;
                     var18 += var15;
                     anInt_10848 = var16;
                     anInt_10786 = var17;
                     anInt_10850 = var18;
                     aBoolean_10822 = false;
                  }

                  var16 = var3 << 15 >> 7;
                  var17 = var4 << 15 >> 7;
                  var18 = var5 << 15 >> 7;
                  var19 = var16 * -anInt_10848 + 8192 >> 14;
                  var20 = var17 * -anInt_10786 + 8192 >> 14;
                  var21 = var18 * -anInt_10850 + 8192 >> 14;
                  var22 = var19 + anInt_10848;
                  var23 = var20 + anInt_10786;
                  var24 = var21 + anInt_10850;
                  int[] var25 = new int[]{var16 * var8[0] + 8192 >> 14, var16 * var8[3] + 8192 >> 14, var16 * var8[6] + 8192 >> 14, var17 * var8[1] + 8192 >> 14, var17 * var8[4] + 8192 >> 14, var17 * var8[7] + 8192 >> 14, var18 * var8[2] + 8192 >> 14, var18 * var8[5] + 8192 >> 14, var18 * var8[8] + 8192 >> 14};
                  var26 = var16 * var13 + 8192 >> 14;
                  var27 = var17 * var49 + 8192 >> 14;
                  var28 = var18 * var15 + 8192 >> 14;
                  var26 += var22;
                  var27 += var23;
                  var28 += var24;
                  int[] var29 = new int[9];

                  int var31;
                  for(var30 = 0; var30 < 3; ++var30) {
                     for(var31 = 0; var31 < 3; ++var31) {
                        var32 = 0;

                        for(var33 = 0; var33 < 3; ++var33) {
                           var32 += var8[var30 * 3 + var33] * var25[var31 + var33 * 3];
                        }

                        var29[var30 * 3 + var31] = var32 + 8192 >> 14;
                     }
                  }

                  var30 = var8[0] * var26 + var8[1] * var27 + var8[2] * var28 + 8192 >> 14;
                  var31 = var8[3] * var26 + var8[4] * var27 + var8[5] * var28 + 8192 >> 14;
                  var32 = var8[6] * var26 + var8[7] * var27 + var8[8] * var28 + 8192 >> 14;
                  var30 += var10;
                  var31 += var11;
                  var32 += var50;

                  for(var33 = 0; var33 < var9; ++var33) {
                     var34 = var2[var33];
                     if(var34 < this.anIntArrayArray_10832.length) {
                        var35 = this.anIntArrayArray_10832[var34];

                        for(var36 = 0; var36 < var35.length; ++var36) {
                           var37 = var35[var36];
                           if(this.aShortArray_10840 == null || (var7 & this.aShortArray_10840[var37]) != 0) {
                              var38 = var29[0] * this.anIntArray_10798[var37] + var29[1] * this.anIntArray_10795[var37] + var29[2] * this.anIntArray_10796[var37] + 8192 >> 14;
                              var39 = var29[3] * this.anIntArray_10798[var37] + var29[4] * this.anIntArray_10795[var37] + var29[5] * this.anIntArray_10796[var37] + 8192 >> 14;
                              var40 = var29[6] * this.anIntArray_10798[var37] + var29[7] * this.anIntArray_10795[var37] + var29[8] * this.anIntArray_10796[var37] + 8192 >> 14;
                              var38 += var30;
                              var39 += var31;
                              var40 += var32;
                              this.anIntArray_10798[var37] = var38;
                              this.anIntArray_10795[var37] = var39;
                              this.anIntArray_10796[var37] = var40;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray_10832.length) {
                        var12 = this.anIntArrayArray_10832[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var49 = var12[var13];
                           if(this.aShortArray_10840 == null || (var7 & this.aShortArray_10840[var49]) != 0) {
                              this.anIntArray_10798[var49] -= anInt_10848;
                              this.anIntArray_10795[var49] -= anInt_10786;
                              this.anIntArray_10796[var49] -= anInt_10850;
                              this.anIntArray_10798[var49] = this.anIntArray_10798[var49] * var3 >> 7;
                              this.anIntArray_10795[var49] = this.anIntArray_10795[var49] * var4 >> 7;
                              this.anIntArray_10796[var49] = this.anIntArray_10796[var49] * var5 >> 7;
                              this.anIntArray_10798[var49] += anInt_10848;
                              this.anIntArray_10795[var49] += anInt_10786;
                              this.anIntArray_10796[var49] += anInt_10850;
                           }
                        }
                     }
                  }
               }

            } else {
               Class175 var47;
               Class144 var48;
               if(var1 == 5) {
                  if(this.anIntArrayArray_10815 != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.anIntArrayArray_10815.length) {
                           var12 = this.anIntArrayArray_10815[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var49 = var12[var13];
                              if(this.aShortArray_10816 == null || (var7 & this.aShortArray_10816[var49]) != 0) {
                                 var15 = (this.aByteArray_10826[var49] & 255) + var3 * 8;
                                 if(var15 < 0) {
                                    var15 = 0;
                                 } else if(var15 > 255) {
                                    var15 = 255;
                                 }

                                 this.aByteArray_10826[var49] = (byte)var15;
                                 if(this.anOGLBufferPointer_10818 != null) {
                                    this.anOGLBufferPointer_10818.buffer = null;
                                 }
                              }
                           }
                        }
                     }

                     if(this.aClass175Array_10799 != null) {
                        for(var10 = 0; var10 < this.anInt_10839; ++var10) {
                           var47 = this.aClass175Array_10799[var10];
                           var48 = this.aClass144Array_10841[var10];
                           var48.anInt_2692 = var48.anInt_2692 & 16777215 | 255 - (this.aByteArray_10826[var47.anInt_3055] & 255) << 24;
                        }
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray_10815 != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.anIntArrayArray_10815.length) {
                           var12 = this.anIntArrayArray_10815[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var49 = var12[var13];
                              if(this.aShortArray_10816 == null || (var7 & this.aShortArray_10816[var49]) != 0) {
                                 var15 = this.aShortArray_10809[var49] & '\uffff';
                                 var16 = var15 >> 10 & 63;
                                 var17 = var15 >> 7 & 7;
                                 var18 = var15 & 127;
                                 var16 = var16 + var3 & 63;
                                 var17 += var4 / 4;
                                 if(var17 < 0) {
                                    var17 = 0;
                                 } else if(var17 > 7) {
                                    var17 = 7;
                                 }

                                 var18 += var5;
                                 if(var18 < 0) {
                                    var18 = 0;
                                 } else if(var18 > 127) {
                                    var18 = 127;
                                 }

                                 this.aShortArray_10809[var49] = (short)(var16 << 10 | var17 << 7 | var18);
                                 if(this.anOGLBufferPointer_10818 != null) {
                                    this.anOGLBufferPointer_10818.buffer = null;
                                 }
                              }
                           }
                        }
                     }

                     if(this.aClass175Array_10799 != null) {
                        for(var10 = 0; var10 < this.anInt_10839; ++var10) {
                           var47 = this.aClass175Array_10799[var10];
                           var48 = this.aClass144Array_10841[var10];
                           var48.anInt_2692 = var48.anInt_2692 & -16777216 | Class541.anIntArray_9470[this.aShortArray_10809[var47.anInt_3055] & '\uffff'] & 16777215;
                        }
                     }
                  }

               } else {
                  Class144 var14;
                  if(var1 == 8) {
                     if(this.anIntArrayArray_10842 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray_10842.length) {
                              var12 = this.anIntArrayArray_10842[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass144Array_10841[var12[var13]];
                                 var14.anInt_2687 += var3;
                                 var14.anInt_2691 += var4;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray_10842 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray_10842.length) {
                              var12 = this.anIntArrayArray_10842[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass144Array_10841[var12[var13]];
                                 var14.anInt_2690 = var14.anInt_2690 * var3 >> 7;
                                 var14.anInt_2688 = var14.anInt_2688 * var4 >> 7;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray_10842 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray_10842.length) {
                              var12 = this.anIntArrayArray_10842[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass144Array_10841[var12[var13]];
                                 var14.anInt_2689 = var14.anInt_2689 + var3 & 16383;
                              }
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   void method2032(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var2.length;
      int var9;
      int var10;
      int var14;
      int var23;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var9 = 0;
         anInt_10848 = 0;
         anInt_10786 = 0;
         anInt_10850 = 0;

         for(var10 = 0; var10 < var8; ++var10) {
            int var24 = var2[var10];
            if(var24 < this.anIntArrayArray_10832.length) {
               int[] var25 = this.anIntArrayArray_10832[var24];

               for(var23 = 0; var23 < var25.length; ++var23) {
                  var14 = var25[var23];
                  anInt_10848 += this.anIntArray_10798[var14];
                  anInt_10786 += this.anIntArray_10795[var14];
                  anInt_10850 += this.anIntArray_10796[var14];
                  ++var9;
               }
            }
         }

         if(var9 > 0) {
            anInt_10848 = anInt_10848 / var9 + var3;
            anInt_10786 = anInt_10786 / var9 + var4;
            anInt_10850 = anInt_10850 / var9 + var5;
         } else {
            anInt_10848 = var3;
            anInt_10786 = var4;
            anInt_10850 = var5;
         }

      } else {
         int[] var11;
         int var12;
         if(var1 == 1) {
            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;

            for(var9 = 0; var9 < var8; ++var9) {
               var10 = var2[var9];
               if(var10 < this.anIntArrayArray_10832.length) {
                  var11 = this.anIntArrayArray_10832[var10];

                  for(var12 = 0; var12 < var11.length; ++var12) {
                     var23 = var11[var12];
                     this.anIntArray_10798[var23] += var3;
                     this.anIntArray_10795[var23] += var4;
                     this.anIntArray_10796[var23] += var5;
                  }
               }
            }

         } else {
            int var15;
            int var17;
            int var16;
            if(var1 == 2) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray_10832.length) {
                     var11 = this.anIntArrayArray_10832[var10];
                     if((var6 & 1) == 0) {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var23 = var11[var12];
                           this.anIntArray_10798[var23] -= anInt_10848;
                           this.anIntArray_10795[var23] -= anInt_10786;
                           this.anIntArray_10796[var23] -= anInt_10850;
                           if(var5 != 0) {
                              var14 = Class362.cosArray[var5];
                              var15 = Class362.sinArray[var5];
                              var16 = this.anIntArray_10795[var23] * var14 + this.anIntArray_10798[var23] * var15 + 16383 >> 14;
                              this.anIntArray_10795[var23] = this.anIntArray_10795[var23] * var15 - this.anIntArray_10798[var23] * var14 + 16383 >> 14;
                              this.anIntArray_10798[var23] = var16;
                           }

                           if(var3 != 0) {
                              var14 = Class362.cosArray[var3];
                              var15 = Class362.sinArray[var3];
                              var16 = this.anIntArray_10795[var23] * var15 - this.anIntArray_10796[var23] * var14 + 16383 >> 14;
                              this.anIntArray_10796[var23] = this.anIntArray_10795[var23] * var14 + this.anIntArray_10796[var23] * var15 + 16383 >> 14;
                              this.anIntArray_10795[var23] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class362.cosArray[var4];
                              var15 = Class362.sinArray[var4];
                              var16 = this.anIntArray_10796[var23] * var14 + this.anIntArray_10798[var23] * var15 + 16383 >> 14;
                              this.anIntArray_10796[var23] = this.anIntArray_10796[var23] * var15 - this.anIntArray_10798[var23] * var14 + 16383 >> 14;
                              this.anIntArray_10798[var23] = var16;
                           }

                           this.anIntArray_10798[var23] += anInt_10848;
                           this.anIntArray_10795[var23] += anInt_10786;
                           this.anIntArray_10796[var23] += anInt_10850;
                        }
                     } else {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var23 = var11[var12];
                           this.anIntArray_10798[var23] -= anInt_10848;
                           this.anIntArray_10795[var23] -= anInt_10786;
                           this.anIntArray_10796[var23] -= anInt_10850;
                           if(var3 != 0) {
                              var14 = Class362.cosArray[var3];
                              var15 = Class362.sinArray[var3];
                              var16 = this.anIntArray_10795[var23] * var15 - this.anIntArray_10796[var23] * var14 + 16383 >> 14;
                              this.anIntArray_10796[var23] = this.anIntArray_10795[var23] * var14 + this.anIntArray_10796[var23] * var15 + 16383 >> 14;
                              this.anIntArray_10795[var23] = var16;
                           }

                           if(var5 != 0) {
                              var14 = Class362.cosArray[var5];
                              var15 = Class362.sinArray[var5];
                              var16 = this.anIntArray_10795[var23] * var14 + this.anIntArray_10798[var23] * var15 + 16383 >> 14;
                              this.anIntArray_10795[var23] = this.anIntArray_10795[var23] * var15 - this.anIntArray_10798[var23] * var14 + 16383 >> 14;
                              this.anIntArray_10798[var23] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class362.cosArray[var4];
                              var15 = Class362.sinArray[var4];
                              var16 = this.anIntArray_10796[var23] * var14 + this.anIntArray_10798[var23] * var15 + 16383 >> 14;
                              this.anIntArray_10796[var23] = this.anIntArray_10796[var23] * var15 - this.anIntArray_10798[var23] * var14 + 16383 >> 14;
                              this.anIntArray_10798[var23] = var16;
                           }

                           this.anIntArray_10798[var23] += anInt_10848;
                           this.anIntArray_10795[var23] += anInt_10786;
                           this.anIntArray_10796[var23] += anInt_10850;
                        }
                     }
                  }
               }

               if(var7) {
                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var2[var9];
                     if(var10 < this.anIntArrayArray_10832.length) {
                        var11 = this.anIntArrayArray_10832[var10];

                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var23 = var11[var12];
                           var14 = this.anIntArray_10835[var23];
                           var15 = this.anIntArray_10835[var23 + 1];

                           for(var16 = var14; var16 < var15; ++var16) {
                              var17 = this.aShortArray_10783[var16] - 1;
                              if(var17 == -1) {
                                 break;
                              }

                              int var19;
                              int var18;
                              int var20;
                              if(var5 != 0) {
                                 var18 = Class362.cosArray[var5];
                                 var19 = Class362.sinArray[var5];
                                 var20 = this.aShortArray_10801[var17] * var18 + this.aShortArray_10802[var17] * var19 + 16383 >> 14;
                                 this.aShortArray_10801[var17] = (short)(this.aShortArray_10801[var17] * var19 - this.aShortArray_10802[var17] * var18 + 16383 >> 14);
                                 this.aShortArray_10802[var17] = (short)var20;
                              }

                              if(var3 != 0) {
                                 var18 = Class362.cosArray[var3];
                                 var19 = Class362.sinArray[var3];
                                 var20 = this.aShortArray_10801[var17] * var19 - this.aShortArray_10800[var17] * var18 + 16383 >> 14;
                                 this.aShortArray_10800[var17] = (short)(this.aShortArray_10801[var17] * var18 + this.aShortArray_10800[var17] * var19 + 16383 >> 14);
                                 this.aShortArray_10801[var17] = (short)var20;
                              }

                              if(var4 != 0) {
                                 var18 = Class362.cosArray[var4];
                                 var19 = Class362.sinArray[var4];
                                 var20 = this.aShortArray_10800[var17] * var18 + this.aShortArray_10802[var17] * var19 + 16383 >> 14;
                                 this.aShortArray_10800[var17] = (short)(this.aShortArray_10800[var17] * var19 - this.aShortArray_10802[var17] * var18 + 16383 >> 14);
                                 this.aShortArray_10802[var17] = (short)var20;
                              }
                           }
                        }
                     }
                  }

                  if(this.anOGLBufferPointer_10819 == null && this.anOGLBufferPointer_10818 != null) {
                     this.anOGLBufferPointer_10818.buffer = null;
                  }

                  if(this.anOGLBufferPointer_10819 != null) {
                     this.anOGLBufferPointer_10819.buffer = null;
                  }
               }

            } else if(var1 == 3) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray_10832.length) {
                     var11 = this.anIntArrayArray_10832[var10];

                     for(var12 = 0; var12 < var11.length; ++var12) {
                        var23 = var11[var12];
                        this.anIntArray_10798[var23] -= anInt_10848;
                        this.anIntArray_10795[var23] -= anInt_10786;
                        this.anIntArray_10796[var23] -= anInt_10850;
                        this.anIntArray_10798[var23] = this.anIntArray_10798[var23] * var3 >> 7;
                        this.anIntArray_10795[var23] = this.anIntArray_10795[var23] * var4 >> 7;
                        this.anIntArray_10796[var23] = this.anIntArray_10796[var23] * var5 >> 7;
                        this.anIntArray_10798[var23] += anInt_10848;
                        this.anIntArray_10795[var23] += anInt_10786;
                        this.anIntArray_10796[var23] += anInt_10850;
                     }
                  }
               }

            } else {
               Class175 var21;
               Class144 var22;
               if(var1 == 5) {
                  if(this.anIntArrayArray_10815 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if(var10 < this.anIntArrayArray_10815.length) {
                           var11 = this.anIntArrayArray_10815[var10];

                           for(var12 = 0; var12 < var11.length; ++var12) {
                              var23 = var11[var12];
                              var14 = (this.aByteArray_10826[var23] & 255) + var3 * 8;
                              if(var14 < 0) {
                                 var14 = 0;
                              } else if(var14 > 255) {
                                 var14 = 255;
                              }

                              this.aByteArray_10826[var23] = (byte)var14;
                           }

                           if(var11.length > 0 && this.anOGLBufferPointer_10818 != null) {
                              this.anOGLBufferPointer_10818.buffer = null;
                           }
                        }
                     }

                     if(this.aClass175Array_10799 != null) {
                        for(var9 = 0; var9 < this.anInt_10839; ++var9) {
                           var21 = this.aClass175Array_10799[var9];
                           var22 = this.aClass144Array_10841[var9];
                           var22.anInt_2692 = var22.anInt_2692 & 16777215 | 255 - (this.aByteArray_10826[var21.anInt_3055] & 255) << 24;
                        }
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray_10815 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if(var10 < this.anIntArrayArray_10815.length) {
                           var11 = this.anIntArrayArray_10815[var10];

                           for(var12 = 0; var12 < var11.length; ++var12) {
                              var23 = var11[var12];
                              var14 = this.aShortArray_10809[var23] & '\uffff';
                              var15 = var14 >> 10 & 63;
                              var16 = var14 >> 7 & 7;
                              var17 = var14 & 127;
                              var15 = var15 + var3 & 63;
                              var16 += var4 / 4;
                              if(var16 < 0) {
                                 var16 = 0;
                              } else if(var16 > 7) {
                                 var16 = 7;
                              }

                              var17 += var5;
                              if(var17 < 0) {
                                 var17 = 0;
                              } else if(var17 > 127) {
                                 var17 = 127;
                              }

                              this.aShortArray_10809[var23] = (short)(var15 << 10 | var16 << 7 | var17);
                           }

                           if(var11.length > 0 && this.anOGLBufferPointer_10818 != null) {
                              this.anOGLBufferPointer_10818.buffer = null;
                           }
                        }
                     }

                     if(this.aClass175Array_10799 != null) {
                        for(var9 = 0; var9 < this.anInt_10839; ++var9) {
                           var21 = this.aClass175Array_10799[var9];
                           var22 = this.aClass144Array_10841[var9];
                           var22.anInt_2692 = var22.anInt_2692 & -16777216 | Class541.anIntArray_9470[this.aShortArray_10809[var21.anInt_3055] & '\uffff'] & 16777215;
                        }
                     }
                  }

               } else {
                  Class144 var13;
                  if(var1 == 8) {
                     if(this.anIntArrayArray_10842 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray_10842.length) {
                              var11 = this.anIntArrayArray_10842[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass144Array_10841[var11[var12]];
                                 var13.anInt_2687 += var3;
                                 var13.anInt_2691 += var4;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray_10842 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray_10842.length) {
                              var11 = this.anIntArrayArray_10842[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass144Array_10841[var11[var12]];
                                 var13.anInt_2690 = var13.anInt_2690 * var3 >> 7;
                                 var13.anInt_2688 = var13.anInt_2688 * var4 >> 7;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray_10842 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray_10842.length) {
                              var11 = this.anIntArrayArray_10842[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass144Array_10841[var11[var12]];
                                 var13.anInt_2689 = var13.anInt_2689 + var3 & 16383;
                              }
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   public void applyViewport(Viewport var1, int var2, boolean var3) {
      if(this.aShortArray_10840 != null) {
         Viewport var4 = var1;
         if(var3) {
            var4 = this.aRenderer_Sub2_10807.aViewport_10370;
            var4.method4643(var1);
         }

         float[] var5 = new float[3];

         for(int var6 = 0; var6 < this.vertexCount; ++var6) {
            if((var2 & this.aShortArray_10840[var6]) != 0) {
               var4.method4635((float)this.anIntArray_10798[var6], (float)this.anIntArray_10795[var6], (float)this.anIntArray_10796[var6], var5);
               this.anIntArray_10798[var6] = (int)var5[0];
               this.anIntArray_10795[var6] = (int)var5[1];
               this.anIntArray_10796[var6] = (int)var5[2];
            }
         }

      }
   }

   public Class172[] method2040() {
      return this.aClass172Array_10778;
   }

   public Class86[] method2059() {
      return this.aClass86Array_10837;
   }

   public boolean method2050(int var1, int var2, Viewport var3, boolean var4, int var5) {
      ArrayViewport var6 = this.aRenderer_Sub2_10807.anArrayViewport_10371;
      var6.setViewport(var3);
      var6.method4580(this.aRenderer_Sub2_10807.anArrayViewport_10306);
      boolean var7 = false;
      int var8 = Integer.MAX_VALUE;
      int var9 = Integer.MIN_VALUE;
      int var10 = Integer.MAX_VALUE;
      int var11 = Integer.MIN_VALUE;
      if(!this.aBoolean_10827) {
         this.method7475();
      }

      int var12 = this.aShort_10831 - this.aShort_10830 >> 1;
      int var13 = this.aShort_10846 - this.aShort_10828 >> 1;
      int var14 = this.aShort_10833 - this.aShort_10829 >> 1;
      int var15 = this.aShort_10830 + var12;
      int var16 = this.aShort_10828 + var13;
      int var17 = this.aShort_10829 + var14;
      int var18 = var15 - (var12 << var5);
      int var19 = var16 - (var13 << var5);
      int var20 = var17 - (var14 << var5);
      int var21 = var15 + (var12 << var5);
      int var22 = var16 + (var13 << var5);
      int var23 = var17 + (var14 << var5);
      anIntArray_10845[0] = var18;
      anIntArray_10787[0] = var19;
      anIntArray_10847[0] = var20;
      anIntArray_10845[1] = var21;
      anIntArray_10787[1] = var19;
      anIntArray_10847[1] = var20;
      anIntArray_10845[2] = var18;
      anIntArray_10787[2] = var22;
      anIntArray_10847[2] = var20;
      anIntArray_10845[3] = var21;
      anIntArray_10787[3] = var22;
      anIntArray_10847[3] = var20;
      anIntArray_10845[4] = var18;
      anIntArray_10787[4] = var19;
      anIntArray_10847[4] = var23;
      anIntArray_10845[5] = var21;
      anIntArray_10787[5] = var19;
      anIntArray_10847[5] = var23;
      anIntArray_10845[6] = var18;
      anIntArray_10787[6] = var22;
      anIntArray_10847[6] = var23;
      anIntArray_10845[7] = var21;
      anIntArray_10787[7] = var22;
      anIntArray_10847[7] = var23;

      int var25;
      int var27;
      int var26;
      float var29;
      float var28;
      float var31;
      float var30;
      int var33;
      for(int var24 = 0; var24 < 8; ++var24) {
         var25 = anIntArray_10845[var24];
         var26 = anIntArray_10787[var24];
         var27 = anIntArray_10847[var24];
         var28 = var6.data[2] * (float)var25 + var6.data[6] * (float)var26 + var6.data[10] * (float)var27 + var6.data[14];
         var29 = var6.data[3] * (float)var25 + var6.data[7] * (float)var26 + var6.data[11] * (float)var27 + var6.data[15];
         if(var28 >= -var29) {
            var30 = var6.data[0] * (float)var25 + var6.data[4] * (float)var26 + var6.data[8] * (float)var27 + var6.data[12];
            var31 = var6.data[1] * (float)var25 + var6.data[5] * (float)var26 + var6.data[9] * (float)var27 + var6.data[13];
            int var32 = (int)(this.aRenderer_Sub2_10807.aFloat_10395 + this.aRenderer_Sub2_10807.aFloat_10363 * var30 / var29);
            var33 = (int)(this.aRenderer_Sub2_10807.aFloat_10364 + this.aRenderer_Sub2_10807.aFloat_10365 * var31 / var29);
            if(var32 < var8) {
               var8 = var32;
            }

            if(var32 > var9) {
               var9 = var32;
            }

            if(var33 < var10) {
               var10 = var33;
            }

            if(var33 > var11) {
               var11 = var33;
            }

            var7 = true;
         }
      }

      if(var7 && var1 > var8 && var1 < var9 && var2 > var10 && var2 < var11) {
         if(var4) {
            return true;
         }

         if(this.aRenderer_Sub2_10807.anIntArray_10466.length < this.anInt_10838) {
            this.aRenderer_Sub2_10807.anIntArray_10466 = new int[this.anInt_10838];
            this.aRenderer_Sub2_10807.anIntArray_10467 = new int[this.anInt_10838];
         }

         int[] var38 = this.aRenderer_Sub2_10807.anIntArray_10466;
         int[] var39 = this.aRenderer_Sub2_10807.anIntArray_10467;

         for(var33 = 0; var33 < this.vertexCount; ++var33) {
            var25 = this.anIntArray_10798[var33];
            var26 = this.anIntArray_10795[var33];
            var27 = this.anIntArray_10796[var33];
            var28 = var6.data[2] * (float)var25 + var6.data[6] * (float)var26 + var6.data[10] * (float)var27 + var6.data[14];
            var29 = var6.data[3] * (float)var25 + var6.data[7] * (float)var26 + var6.data[11] * (float)var27 + var6.data[15];
            int var34;
            int var35;
            int var36;
            int var37;
            if(var28 >= -var29) {
               var30 = var6.data[0] * (float)var25 + var6.data[4] * (float)var26 + var6.data[8] * (float)var27 + var6.data[12];
               var31 = var6.data[1] * (float)var25 + var6.data[5] * (float)var26 + var6.data[9] * (float)var27 + var6.data[13];
               var34 = this.anIntArray_10835[var33];
               var35 = this.anIntArray_10835[var33 + 1];

               for(var36 = var34; var36 < var35; ++var36) {
                  var37 = this.aShortArray_10783[var36] - 1;
                  if(var37 == -1) {
                     break;
                  }

                  var38[var37] = (int)(this.aRenderer_Sub2_10807.aFloat_10395 + this.aRenderer_Sub2_10807.aFloat_10363 * var30 / var29);
                  var39[var37] = (int)(this.aRenderer_Sub2_10807.aFloat_10364 + this.aRenderer_Sub2_10807.aFloat_10365 * var31 / var29);
               }
            } else {
               var34 = this.anIntArray_10835[var33];
               var35 = this.anIntArray_10835[var33 + 1];

               for(var36 = var34; var36 < var35; ++var36) {
                  var37 = this.aShortArray_10783[var36] - 1;
                  if(var37 == -1) {
                     break;
                  }

                  var38[this.aShortArray_10783[var36] - 1] = -999999;
               }
            }
         }

         for(var33 = 0; var33 < this.anInt_10820; ++var33) {
            if(var38[this.aShortArray_10784[var33]] != -999999 && var38[this.aShortArray_10812[var33]] != -999999 && var38[this.aShortArray_10813[var33]] != -999999 && this.method7479(var1, var2, var39[this.aShortArray_10784[var33]], var39[this.aShortArray_10812[var33]], var39[this.aShortArray_10813[var33]], var38[this.aShortArray_10784[var33]], var38[this.aShortArray_10812[var33]], var38[this.aShortArray_10813[var33]])) {
               return true;
            }
         }
      }

      return false;
   }

   static byte[] method7464(byte[] var0, int var1) {
      byte[] var2 = new byte[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   public void method2069(Viewport var1, Class92 var2, int var3) {
      if((var3 & 2) != 0) {
         OpenGL.glPolygonMode(1032, 6913);
      }

      if(this.anInt_10838 != 0) {
         ArrayViewport var4 = this.aRenderer_Sub2_10807.anArrayViewport_10416;
         ArrayViewport var5 = this.aRenderer_Sub2_10807.anArrayViewport_10371;
         ArrayViewport var6 = this.aRenderer_Sub2_10807.anArrayViewport_10372;
         var5.setViewport(var1);
         var6.replaceWith(var5);
         var6.method4580(this.aRenderer_Sub2_10807.anArrayViewport_10306);
         if(!this.aBoolean_10827) {
            this.method7475();
         }

         float[] var7 = this.aRenderer_Sub2_10807.aFloatArray_10298;
         var5.method4558(0.0F, (float)this.aShort_10828, 0.0F, var7);
         float var8 = var7[0];
         float var9 = var7[1];
         float var10 = var7[2];
         var5.method4558(0.0F, (float)this.aShort_10846, 0.0F, var7);
         float var11 = var7[0];
         float var12 = var7[1];
         float var13 = var7[2];

         float var17;
         float var16;
         for(int var14 = 0; var14 < 6; ++var14) {
            float[] var15 = this.aRenderer_Sub2_10807.aFloatArrayArray_10360[var14];
            var16 = var15[0] * var8 + var15[1] * var9 + var15[2] * var10 + var15[3] + (float)this.anInt_10821;
            var17 = var15[0] * var11 + var15[1] * var12 + var15[2] * var13 + var15[3] + (float)this.anInt_10821;
            if(var16 < 0.0F && var17 < 0.0F) {
               return;
            }
         }

         if(var2 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.aShort_10830 + this.aShort_10831 >> 1;
            int var21 = this.aShort_10829 + this.aShort_10833 >> 1;
            short var23 = this.aShort_10828;
            float var34 = var6.data[0] * (float)var20 + var6.data[4] * (float)var23 + var6.data[8] * (float)var21 + var6.data[12];
            float var33 = var6.data[1] * (float)var20 + var6.data[5] * (float)var23 + var6.data[9] * (float)var21 + var6.data[13];
            var16 = var6.data[2] * (float)var20 + var6.data[6] * (float)var23 + var6.data[10] * (float)var21 + var6.data[14];
            var17 = var6.data[3] * (float)var20 + var6.data[7] * (float)var23 + var6.data[11] * (float)var21 + var6.data[15];
            if(var16 >= -var17) {
               var2.anInt_1829 = (int)(this.aRenderer_Sub2_10807.aFloat_10395 + this.aRenderer_Sub2_10807.aFloat_10363 * var34 / var17);
               var2.anInt_1826 = (int)(this.aRenderer_Sub2_10807.aFloat_10364 + this.aRenderer_Sub2_10807.aFloat_10365 * var33 / var17);
            } else {
               var18 = true;
            }

            var23 = this.aShort_10846;
            float var25 = var6.data[0] * (float)var20 + var6.data[4] * (float)var23 + var6.data[8] * (float)var21 + var6.data[12];
            float var26 = var6.data[1] * (float)var20 + var6.data[5] * (float)var23 + var6.data[9] * (float)var21 + var6.data[13];
            float var27 = var6.data[2] * (float)var20 + var6.data[6] * (float)var23 + var6.data[10] * (float)var21 + var6.data[14];
            float var28 = var6.data[3] * (float)var20 + var6.data[7] * (float)var23 + var6.data[11] * (float)var21 + var6.data[15];
            if(var27 >= -var28) {
               var2.anInt_1827 = (int)(this.aRenderer_Sub2_10807.aFloat_10395 + this.aRenderer_Sub2_10807.aFloat_10363 * var25 / var28);
               var2.anInt_1830 = (int)(this.aRenderer_Sub2_10807.aFloat_10364 + this.aRenderer_Sub2_10807.aFloat_10365 * var26 / var28);
            } else {
               var18 = true;
            }

            float var29;
            float var30;
            if(var18) {
               if(var16 < -var17 && var27 < -var28) {
                  var19 = false;
               } else {
                  float var31;
                  float var32;
                  if(var16 < -var17) {
                     var29 = (var16 + var17) / (var27 + var28) - 1.0F;
                     var30 = var34 + var29 * (var25 - var34);
                     var31 = var33 + var29 * (var26 - var33);
                     var32 = var17 + var29 * (var28 - var17);
                     var2.anInt_1829 = (int)(this.aRenderer_Sub2_10807.aFloat_10395 + this.aRenderer_Sub2_10807.aFloat_10363 * var30 / var32);
                     var2.anInt_1826 = (int)(this.aRenderer_Sub2_10807.aFloat_10364 + this.aRenderer_Sub2_10807.aFloat_10365 * var31 / var32);
                  } else if(var27 < -var28) {
                     var29 = (var27 + var28) / (var16 + var17) - 1.0F;
                     var30 = var25 + var29 * (var34 - var25);
                     var31 = var26 + var29 * (var33 - var26);
                     var32 = var28 + var29 * (var17 - var28);
                     var2.anInt_1827 = (int)(this.aRenderer_Sub2_10807.aFloat_10395 + this.aRenderer_Sub2_10807.aFloat_10363 * var30 / var32);
                     var2.anInt_1830 = (int)(this.aRenderer_Sub2_10807.aFloat_10364 + this.aRenderer_Sub2_10807.aFloat_10365 * var31 / var32);
                  }
               }
            }

            if(var19) {
               if(var16 / var17 > var27 / var28) {
                  var29 = var34 + var4.data[0] * (float)this.anInt_10821 + var4.data[12];
                  var30 = var17 + var4.data[3] * (float)this.anInt_10821 + var4.data[15];
                  var2.anInt_1831 = (int)(this.aRenderer_Sub2_10807.aFloat_10395 - (float)var2.anInt_1829 + this.aRenderer_Sub2_10807.aFloat_10363 * var29 / var30);
               } else {
                  var29 = var25 + var4.data[0] * (float)this.anInt_10821 + var4.data[12];
                  var30 = var28 + var4.data[3] * (float)this.anInt_10821 + var4.data[15];
                  var2.anInt_1831 = (int)(this.aRenderer_Sub2_10807.aFloat_10395 - (float)var2.anInt_1827 + this.aRenderer_Sub2_10807.aFloat_10363 * var29 / var30);
               }

               var2.aBoolean_1828 = true;
            }
         }

         this.aRenderer_Sub2_10807.method7013();
         this.aRenderer_Sub2_10807.method7036(var5);
         this.method7485();
         this.aRenderer_Sub2_10807.method6975();
         var5.method4580(this.aRenderer_Sub2_10807.anArrayViewport_10355);
         this.method7466(var5);
         if((var3 & 2) != 0) {
            OpenGL.glPolygonMode(1028, 6914);
         }

      }
   }

   void method7466(ArrayViewport var1) {
      if(this.aClass175Array_10799 != null) {
         ArrayViewport var2 = this.aRenderer_Sub2_10807.anArrayViewport_10326;
         this.aRenderer_Sub2_10807.method6973();
         this.aRenderer_Sub2_10807.enableZBuffering(!this.aBoolean_10834);
         this.aRenderer_Sub2_10807.method7066(false);
         this.aRenderer_Sub2_10807.setPointers(this.aRenderer_Sub2_10807.anOGLBufferPointer_10305, (OGLBufferPointer)null, (OGLBufferPointer)null, this.aRenderer_Sub2_10807.anOGLBufferPointer_10461);

         for(int var3 = 0; var3 < this.anInt_10839; ++var3) {
            Class175 var4 = this.aClass175Array_10799[var3];
            Class144 var5 = this.aClass144Array_10841[var3];
            if(!var4.aBoolean_3058 || !this.aRenderer_Sub2_10807.method1989()) {
               float var6 = (float)(this.anIntArray_10798[var4.anInt_3059] + this.anIntArray_10798[var4.anInt_3052] + this.anIntArray_10798[var4.anInt_3053]) * 0.3333333F;
               float var7 = (float)(this.anIntArray_10795[var4.anInt_3059] + this.anIntArray_10795[var4.anInt_3052] + this.anIntArray_10795[var4.anInt_3053]) * 0.3333333F;
               float var8 = (float)(this.anIntArray_10796[var4.anInt_3059] + this.anIntArray_10796[var4.anInt_3052] + this.anIntArray_10796[var4.anInt_3053]) * 0.3333333F;
               float var9 = var1.data[0] * var6 + var1.data[4] * var7 + var1.data[8] * var8 + var1.data[12];
               float var10 = var1.data[1] * var6 + var1.data[5] * var7 + var1.data[9] * var8 + var1.data[13];
               float var11 = var1.data[2] * var6 + var1.data[6] * var7 + var1.data[10] * var8 + var1.data[14];
               float var12 = (float)(1.0D / Math.sqrt((double)(var9 * var9 + var10 * var10 + var11 * var11))) * (float)var4.anInt_3060;
               var2.method4581(var5.anInt_2689, var5.anInt_2690 * var4.aShort_3051 >> 7, var5.anInt_2688 * var4.aShort_3056 >> 7, var9 + (float)var5.anInt_2687 - var9 * var12, var10 + (float)var5.anInt_2691 - var10 * var12, var11 - var11 * var12);
               this.aRenderer_Sub2_10807.method6974(var2);
               int var13 = var5.anInt_2692;
               OpenGL.glColor4ub((byte)(var13 >> 16), (byte)(var13 >> 8), (byte)var13, (byte)(var13 >> 24));
               this.aRenderer_Sub2_10807.method6957(var4.aShort_3057);
               this.aRenderer_Sub2_10807.setBlendFunc(var4.aByte_3054);
               this.aRenderer_Sub2_10807.method7008(7, 0, 4);
            }
         }

         this.aRenderer_Sub2_10807.enableZBuffering(true);
         this.aRenderer_Sub2_10807.method6975();
      }

   }

   void method7467(boolean var1) {
      if(this.aRenderer_Sub2_10807.aClass240_Sub8_Sub2_10359.data.length < this.anInt_10808 * 6) {
         this.aRenderer_Sub2_10807.aClass240_Sub8_Sub2_10359 = new BufferDataNode((this.anInt_10808 + 100) * 6);
      } else {
         this.aRenderer_Sub2_10807.aClass240_Sub8_Sub2_10359.index = 0;
      }

      BufferDataNode var2 = this.aRenderer_Sub2_10807.aClass240_Sub8_Sub2_10359;
      int var3;
      if(this.aRenderer_Sub2_10807.isBigEndian) {
         for(var3 = 0; var3 < this.anInt_10808; ++var3) {
            var2.method4463(this.aShortArray_10784[var3], -975703458);
            var2.method4463(this.aShortArray_10812[var3], -1564594972);
            var2.method4463(this.aShortArray_10813[var3], -115986001);
         }
      } else {
         for(var3 = 0; var3 < this.anInt_10808; ++var3) {
            var2.method4464(this.aShortArray_10784[var3], (byte)1);
            var2.method4464(this.aShortArray_10812[var3], (byte)1);
            var2.method4464(this.aShortArray_10813[var3], (byte)1);
         }
      }

      if(var2.index * 964952859 != 0) {
         if(var1) {
            if(this.aClass166_10811 == null) {
               this.aClass166_10811 = this.aRenderer_Sub2_10807.method7003(5123, var2.data, var2.index * 964952859, true);
            } else {
               this.aClass166_10811.method2072(5123, var2.data, var2.index * 964952859);
            }

            this.aClass140_10836.aClass166_2660 = this.aClass166_10811;
         } else {
            this.aClass140_10836.aClass166_2660 = this.aRenderer_Sub2_10807.method7003(5123, var2.data, var2.index * 964952859, false);
         }

         if(!var1) {
            this.aBoolean_10824 = true;
         }

      }
   }

   void method7468(boolean var1) {
      boolean var2 = this.anOGLBufferPointer_10818 != null && this.anOGLBufferPointer_10818.buffer == null;
      boolean var3 = this.anOGLBufferPointer_10819 != null && this.anOGLBufferPointer_10819.buffer == null;
      boolean hasVertices = this.vertexPointer != null && this.vertexPointer.buffer == null;
      boolean var5 = this.anOGLBufferPointer_10790 != null && this.anOGLBufferPointer_10790.buffer == null;
      if(var1) {
         var2 &= (this.aByte_10806 & 2) != 0;
         var3 &= (this.aByte_10806 & 4) != 0;
         hasVertices &= (this.aByte_10806 & 1) != 0;
         var5 &= (this.aByte_10806 & 8) != 0;
      }

      byte var6 = 0;
      byte var7 = 0;
      byte var8 = 0;
      byte var9 = 0;
      byte var10 = 0;
      if(hasVertices) {
         var7 = var6;
         var6 = (byte)(var6 + 12);
      }

      if(var2) {
         var8 = var6;
         var6 = (byte)(var6 + 4);
      }

      if(var3) {
         var9 = var6;
         var6 = (byte)(var6 + 12);
      }

      if(var5) {
         var10 = var6;
         var6 = (byte)(var6 + 8);
      }

      if(var6 != 0) {
         if(this.aRenderer_Sub2_10807.aClass240_Sub8_Sub2_10359.data.length < this.anInt_10838 * var6) {
            this.aRenderer_Sub2_10807.aClass240_Sub8_Sub2_10359 = new BufferDataNode((this.anInt_10838 + 100) * var6);
         } else {
            this.aRenderer_Sub2_10807.aClass240_Sub8_Sub2_10359.index = 0;
         }

         BufferDataNode var11 = this.aRenderer_Sub2_10807.aClass240_Sub8_Sub2_10359;
         int var12;
         int var13;
         int var19;
         int var18;
         if(hasVertices) {
            int var14;
            int var15;
            int var17;
            int var16;
            if(this.aRenderer_Sub2_10807.isBigEndian) {
               for(var12 = 0; var12 < this.vertexCount; ++var12) {
                  var13 = Stream.floatToRawIntBits((float)this.anIntArray_10798[var12]);
                  var14 = Stream.floatToRawIntBits((float)this.anIntArray_10795[var12]);
                  var15 = Stream.floatToRawIntBits((float)this.anIntArray_10796[var12]);
                  var16 = this.anIntArray_10835[var12];
                  var17 = this.anIntArray_10835[var12 + 1];

                  for(var18 = var16; var18 < var17; ++var18) {
                     var19 = this.aShortArray_10783[var18] - 1;
                     if(var19 == -1) {
                        break;
                     }

                     var11.index = var19 * var6 * -2043502829;
                     var11.putIntBE(var13, 2062892803);
                     var11.putIntBE(var14, 2062892803);
                     var11.putIntBE(var15, 2062892803);
                  }
               }
            } else {
               for(var12 = 0; var12 < this.vertexCount; ++var12) {
                  var13 = Stream.floatToRawIntBits((float)this.anIntArray_10798[var12]);
                  var14 = Stream.floatToRawIntBits((float)this.anIntArray_10795[var12]);
                  var15 = Stream.floatToRawIntBits((float)this.anIntArray_10796[var12]);
                  var16 = this.anIntArray_10835[var12];
                  var17 = this.anIntArray_10835[var12 + 1];

                  for(var18 = var16; var18 < var17; ++var18) {
                     var19 = (this.aShortArray_10783[var18] & '\uffff') - 1;
                     if(var19 == -1) {
                        break;
                     }

                     var11.index = var19 * var6 * -2043502829;
                     var11.putInt(var13, -839899458);
                     var11.putInt(var14, 1198576477);
                     var11.putInt(var15, -883520697);
                  }
               }
            }
         }

         float var28;
         short[] var34;
         short[] var35;
         byte[] var38;
         float var39;
         short[] var36;
         if(var2) {
            if(this.anOGLBufferPointer_10819 == null) {
               if(this.aClass179_10794 != null) {
                  var35 = this.aClass179_10794.aShortArray_3093;
                  var34 = this.aClass179_10794.aShortArray_3091;
                  var36 = this.aClass179_10794.aShortArray_3092;
                  var38 = this.aClass179_10794.aByteArray_3094;
               } else {
                  var35 = this.aShortArray_10802;
                  var34 = this.aShortArray_10801;
                  var36 = this.aShortArray_10800;
                  var38 = this.aByteArray_10803;
               }

               float var20 = this.aRenderer_Sub2_10807.aFloatArray_10391[0];
               float var21 = this.aRenderer_Sub2_10807.aFloatArray_10391[1];
               float var22 = this.aRenderer_Sub2_10807.aFloatArray_10391[2];
               float var23 = this.aRenderer_Sub2_10807.aFloat_10421;
               float var24 = this.aRenderer_Sub2_10807.aFloat_10357 * 768.0F / (float)this.aShort_10789;
               float var25 = this.aRenderer_Sub2_10807.aFloat_10294 * 768.0F / (float)this.aShort_10789;

               for(int var26 = 0; var26 < this.anInt_10820; ++var26) {
                  int var27 = this.method7469(this.aShortArray_10809[var26], this.aShortArray_10814[var26], this.aShort_10788, this.aByteArray_10826[var26]);
                  float var43 = (float)(var27 >>> 24) * this.aRenderer_Sub2_10807.aFloat_10394;
                  var28 = (float)(var27 >> 16 & 255) * this.aRenderer_Sub2_10807.aFloat_10318;
                  float var29 = (float)(var27 >> 8 & 255) * this.aRenderer_Sub2_10807.aFloat_10280;
                  short var30 = this.aShortArray_10784[var26];
                  short var37 = (short)var38[var30];
                  if(var37 == 0) {
                     var39 = (var20 * (float)var35[var30] + var21 * (float)var34[var30] + var22 * (float)var36[var30]) * 0.0026041667F;
                  } else {
                     var39 = (var20 * (float)var35[var30] + var21 * (float)var34[var30] + var22 * (float)var36[var30]) / (float)(var37 * 256);
                  }

                  float var41 = var23 + var39 * (var39 < 0.0F?var25:var24);
                  int var31 = (int)(var43 * var41);
                  if(var31 < 0) {
                     var31 = 0;
                  } else if(var31 > 255) {
                     var31 = 255;
                  }

                  int var32 = (int)(var28 * var41);
                  if(var32 < 0) {
                     var32 = 0;
                  } else if(var32 > 255) {
                     var32 = 255;
                  }

                  int var33 = (int)(var29 * var41);
                  if(var33 < 0) {
                     var33 = 0;
                  } else if(var33 > 255) {
                     var33 = 255;
                  }

                  var11.index = (var8 + var30 * var6) * -2043502829;
                  var11.putByte(var31, -1490547760);
                  var11.putByte(var32, -1639097612);
                  var11.putByte(var33, 294937133);
                  var11.putByte(255 - (this.aByteArray_10826[var26] & 255), 678635817);
                  var30 = this.aShortArray_10812[var26];
                  var37 = (short)var38[var30];
                  if(var37 == 0) {
                     var39 = (var20 * (float)var35[var30] + var21 * (float)var34[var30] + var22 * (float)var36[var30]) * 0.0026041667F;
                  } else {
                     var39 = (var20 * (float)var35[var30] + var21 * (float)var34[var30] + var22 * (float)var36[var30]) / (float)(var37 * 256);
                  }

                  var41 = var23 + var39 * (var39 < 0.0F?var25:var24);
                  var31 = (int)(var43 * var41);
                  if(var31 < 0) {
                     var31 = 0;
                  } else if(var31 > 255) {
                     var31 = 255;
                  }

                  var32 = (int)(var28 * var41);
                  if(var32 < 0) {
                     var32 = 0;
                  } else if(var32 > 255) {
                     var32 = 255;
                  }

                  var33 = (int)(var29 * var41);
                  if(var33 < 0) {
                     var33 = 0;
                  } else if(var33 > 255) {
                     var33 = 255;
                  }

                  var11.index = (var8 + var30 * var6) * -2043502829;
                  var11.putByte(var31, 537670342);
                  var11.putByte(var32, -1344312883);
                  var11.putByte(var33, -1846784537);
                  var11.putByte(255 - (this.aByteArray_10826[var26] & 255), -1725868112);
                  var30 = this.aShortArray_10813[var26];
                  var37 = (short)var38[var30];
                  if(var37 == 0) {
                     var39 = (var20 * (float)var35[var30] + var21 * (float)var34[var30] + var22 * (float)var36[var30]) * 0.0026041667F;
                  } else {
                     var39 = (var20 * (float)var35[var30] + var21 * (float)var34[var30] + var22 * (float)var36[var30]) / (float)(var37 * 256);
                  }

                  var41 = var23 + var39 * (var39 < 0.0F?var25:var24);
                  var31 = (int)(var43 * var41);
                  if(var31 < 0) {
                     var31 = 0;
                  } else if(var31 > 255) {
                     var31 = 255;
                  }

                  var32 = (int)(var28 * var41);
                  if(var32 < 0) {
                     var32 = 0;
                  } else if(var32 > 255) {
                     var32 = 255;
                  }

                  var33 = (int)(var29 * var41);
                  if(var33 < 0) {
                     var33 = 0;
                  } else if(var33 > 255) {
                     var33 = 255;
                  }

                  var11.index = (var8 + var30 * var6) * -2043502829;
                  var11.putByte(var31, -2044683654);
                  var11.putByte(var32, 886246942);
                  var11.putByte(var33, 1365526123);
                  var11.putByte(255 - (this.aByteArray_10826[var26] & 255), -531745500);
               }
            } else {
               for(var12 = 0; var12 < this.anInt_10820; ++var12) {
                  var13 = this.method7469(this.aShortArray_10809[var12], this.aShortArray_10814[var12], this.aShort_10788, this.aByteArray_10826[var12]);
                  var11.index = (var8 + (this.aShortArray_10784[var12] & '\uffff') * var6) * -2043502829;
                  var11.putIntBE(var13, 2062892803);
                  var11.index = (var8 + (this.aShortArray_10812[var12] & '\uffff') * var6) * -2043502829;
                  var11.putIntBE(var13, 2062892803);
                  var11.index = (var8 + (this.aShortArray_10813[var12] & '\uffff') * var6) * -2043502829;
                  var11.putIntBE(var13, 2062892803);
               }
            }
         }

         if(var3) {
            if(this.aClass179_10794 != null) {
               var35 = this.aClass179_10794.aShortArray_3093;
               var34 = this.aClass179_10794.aShortArray_3091;
               var36 = this.aClass179_10794.aShortArray_3092;
               var38 = this.aClass179_10794.aByteArray_3094;
            } else {
               var35 = this.aShortArray_10802;
               var34 = this.aShortArray_10801;
               var36 = this.aShortArray_10800;
               var38 = this.aByteArray_10803;
            }

            float var40 = 3.0F / (float)this.aShort_10789;
            var39 = 3.0F / (float)(this.aShort_10789 + this.aShort_10789 / 2);
            var11.index = var9 * -2043502829;
            if(this.aRenderer_Sub2_10807.isBigEndian) {
               for(var18 = 0; var18 < this.anInt_10838; ++var18) {
                  var19 = var38[var18] & 255;
                  if(var19 == 0) {
                     var11.putFloatBE((float)var35[var18] * var39);
                     var11.putFloatBE((float)var34[var18] * var39);
                     var11.putFloatBE((float)var36[var18] * var39);
                  } else {
                     var28 = var40 / (float)var19;
                     var11.putFloatBE((float)var35[var18] * var28);
                     var11.putFloatBE((float)var34[var18] * var28);
                     var11.putFloatBE((float)var36[var18] * var28);
                  }

                  var11.index += (var6 - 12) * -2043502829;
               }
            } else {
               for(var18 = 0; var18 < this.anInt_10838; ++var18) {
                  var19 = var38[var18] & 255;
                  if(var19 == 0) {
                     var11.putFloatLE((float)var35[var18] * var39);
                     var11.putFloatLE((float)var34[var18] * var39);
                     var11.putFloatLE((float)var36[var18] * var39);
                  } else {
                     var28 = var40 / (float)var19;
                     var11.putFloatLE((float)var35[var18] * var28);
                     var11.putFloatLE((float)var34[var18] * var28);
                     var11.putFloatLE((float)var36[var18] * var28);
                  }

                  var11.index += (var6 - 12) * -2043502829;
               }
            }
         }

         if(var5) {
            var11.index = var10 * -2043502829;
            if(this.aRenderer_Sub2_10807.isBigEndian) {
               for(var12 = 0; var12 < this.anInt_10838; ++var12) {
                  var11.putFloatBE(this.aFloatArray_10805[var12]);
                  var11.putFloatBE(this.aFloatArray_10785[var12]);
                  var11.index += (var6 - 8) * -2043502829;
               }
            } else {
               for(var12 = 0; var12 < this.anInt_10838; ++var12) {
                  var11.putFloatLE(this.aFloatArray_10805[var12]);
                  var11.putFloatLE(this.aFloatArray_10785[var12]);
                  var11.index += (var6 - 8) * -2043502829;
               }
            }
         }

         var11.index = var6 * this.anInt_10838 * -2043502829;
         OGLBuffer var42;
         if(var1) {
            if(this.anOGLBuffer_10823 == null) {
               this.anOGLBuffer_10823 = this.aRenderer_Sub2_10807.createOGLBuffer(var6, var11.data, var11.index * 964952859, true);
            } else {
               this.anOGLBuffer_10823.putData(var6, var11.data, var11.index * 964952859);
            }

            var42 = this.anOGLBuffer_10823;
            this.aByte_10806 = 0;
         } else {
            var42 = this.aRenderer_Sub2_10807.createOGLBuffer(var6, var11.data, var11.index * 964952859, false);
            this.aBoolean_10824 = true;
         }

         if(hasVertices) {
            this.vertexPointer.buffer = var42;
            this.vertexPointer.offset = var7;
         }

         if(var5) {
            this.anOGLBufferPointer_10790.buffer = var42;
            this.anOGLBufferPointer_10790.offset = var10;
         }

         if(var2) {
            this.anOGLBufferPointer_10818.buffer = var42;
            this.anOGLBufferPointer_10818.offset = var8;
         }

         if(var3) {
            this.anOGLBufferPointer_10819.buffer = var42;
            this.anOGLBufferPointer_10819.offset = var9;
         }

      }
   }

   int method7469(int var1, short var2, int var3, byte var4) {
      int var5 = Class541.anIntArray_9470[method7470(var1, var3)];
      if(var2 != -1) {
         Class183 var6 = this.aRenderer_Sub2_10807.aClass163_2802.method1996(var2 & '\uffff', (byte)2);
         int var7 = var6.aByte_3165 & 255;
         int var8;
         int var10;
         if(var7 != 0) {
            if(var3 < 0) {
               var8 = 0;
            } else if(var3 > 127) {
               var8 = 16777215;
            } else {
               var8 = 131586 * var3;
            }

            if(var7 == 256) {
               var5 = var8;
            } else {
               var10 = 256 - var7;
               var5 = ((var8 & 16711935) * var7 + (var5 & 16711935) * var10 & -16711936) + ((var8 & '\uff00') * var7 + (var5 & '\uff00') * var10 & 16711680) >> 8;
            }
         }

         var8 = var6.aByte_3176 & 255;
         if(var8 != 0) {
            var8 += 256;
            int var9 = ((var5 & 16711680) >> 16) * var8;
            if(var9 > '\uffff') {
               var9 = '\uffff';
            }

            var10 = ((var5 & '\uff00') >> 8) * var8;
            if(var10 > '\uffff') {
               var10 = '\uffff';
            }

            int var11 = (var5 & 255) * var8;
            if(var11 > '\uffff') {
               var11 = '\uffff';
            }

            var5 = (var9 << 8 & 16711680) + (var10 & '\uff00') + (var11 >> 8);
         }
      }

      return var5 << 8 | 255 - (var4 & 255);
   }

   static final int method7470(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   static short[] method7471(short[] var0, int var1) {
      short[] var2 = new short[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   void method7472() {
      if(this.aBoolean_10824) {
         this.aBoolean_10824 = false;
         if(this.aClass86Array_10837 == null && this.aClass172Array_10778 == null && this.aClass175Array_10799 == null && !Class191.method2468(this.anInt_10804, this.anInt_10851)) {
            boolean var1 = false;
            boolean var2 = false;
            boolean var3 = false;
            if(this.anIntArray_10798 != null && !Class191.method2482(this.anInt_10804, this.anInt_10851)) {
               if(this.vertexPointer != null && this.vertexPointer.buffer == null) {
                  this.aBoolean_10824 = true;
               } else {
                  if(!this.aBoolean_10827) {
                     this.method7475();
                  }

                  var1 = true;
               }
            }

            if(this.anIntArray_10795 != null && !Class191.method2476(this.anInt_10804, this.anInt_10851)) {
               if(this.vertexPointer != null && this.vertexPointer.buffer == null) {
                  this.aBoolean_10824 = true;
               } else {
                  if(!this.aBoolean_10827) {
                     this.method7475();
                  }

                  var2 = true;
               }
            }

            if(this.anIntArray_10796 != null && !Class191.method2489(this.anInt_10804, this.anInt_10851)) {
               if(this.vertexPointer != null && this.vertexPointer.buffer == null) {
                  this.aBoolean_10824 = true;
               } else {
                  if(!this.aBoolean_10827) {
                     this.method7475();
                  }

                  var3 = true;
               }
            }

            if(var1) {
               this.anIntArray_10798 = null;
            }

            if(var2) {
               this.anIntArray_10795 = null;
            }

            if(var3) {
               this.anIntArray_10796 = null;
            }
         }

         if(this.aShortArray_10783 != null && this.anIntArray_10798 == null && this.anIntArray_10795 == null && this.anIntArray_10796 == null) {
            this.aShortArray_10783 = null;
            this.anIntArray_10835 = null;
         }

         if(this.aByteArray_10803 != null && !Class191.method2488(this.anInt_10804, this.anInt_10851)) {
            if(this.anOGLBufferPointer_10819 != null) {
               if(this.anOGLBufferPointer_10819.buffer != null) {
                  this.aShortArray_10800 = null;
                  this.aShortArray_10801 = null;
                  this.aShortArray_10802 = null;
                  this.aByteArray_10803 = null;
               } else {
                  this.aBoolean_10824 = true;
               }
            } else if(this.anOGLBufferPointer_10818 != null && this.anOGLBufferPointer_10818.buffer == null) {
               this.aBoolean_10824 = true;
            } else {
               this.aShortArray_10800 = null;
               this.aShortArray_10801 = null;
               this.aShortArray_10802 = null;
               this.aByteArray_10803 = null;
            }
         }

         if(this.aShortArray_10809 != null && !Class191.method2484(this.anInt_10804, this.anInt_10851)) {
            if(this.anOGLBufferPointer_10818 != null && this.anOGLBufferPointer_10818.buffer == null) {
               this.aBoolean_10824 = true;
            } else {
               this.aShortArray_10809 = null;
            }
         }

         if(this.aByteArray_10826 != null && !Class191.method2490(this.anInt_10804, this.anInt_10851)) {
            if(this.anOGLBufferPointer_10818 != null && this.anOGLBufferPointer_10818.buffer == null) {
               this.aBoolean_10824 = true;
            } else {
               this.aByteArray_10826 = null;
            }
         }

         if(this.aFloatArray_10805 != null && !Class191.method2478(this.anInt_10804, this.anInt_10851)) {
            if(this.anOGLBufferPointer_10790 != null && this.anOGLBufferPointer_10790.buffer == null) {
               this.aBoolean_10824 = true;
            } else {
               this.aFloatArray_10785 = null;
               this.aFloatArray_10805 = null;
            }
         }

         if(this.aShortArray_10814 != null && !Class191.method2487(this.anInt_10804, this.anInt_10851)) {
            if(this.anOGLBufferPointer_10818 != null && this.anOGLBufferPointer_10818.buffer == null) {
               this.aBoolean_10824 = true;
            } else {
               this.aShortArray_10814 = null;
            }
         }

         if(this.aShortArray_10784 != null && !Class191.method2464(this.anInt_10804, this.anInt_10851)) {
            if((this.aClass140_10836 == null || this.aClass140_10836.aClass166_2660 != null) && (this.anOGLBufferPointer_10818 == null || this.anOGLBufferPointer_10818.buffer != null)) {
               this.aShortArray_10813 = null;
               this.aShortArray_10812 = null;
               this.aShortArray_10784 = null;
            } else {
               this.aBoolean_10824 = true;
            }
         }

         if(this.anIntArrayArray_10815 != null && !Class191.method2486(this.anInt_10804, this.anInt_10851)) {
            this.anIntArrayArray_10815 = (int[][])null;
            this.aShortArray_10816 = null;
         }

         if(this.anIntArrayArray_10832 != null && !Class191.method2492(this.anInt_10804, this.anInt_10851)) {
            this.anIntArrayArray_10832 = (int[][])null;
            this.aShortArray_10840 = null;
         }

         if(this.anIntArrayArray_10842 != null && !Class191.method2467(this.anInt_10804, this.anInt_10851)) {
            this.anIntArrayArray_10842 = (int[][])null;
         }

         if(this.anIntArray_10810 != null && (this.anInt_10804 & 2048) == 0 && (this.anInt_10804 & 262144) == 0) {
            this.anIntArray_10810 = null;
         }

      }
   }

   public void method2016() {
      if(this.anInt_10838 > 0 && this.anInt_10808 > 0) {
         this.method7468(false);
         if((this.aByte_10806 & 16) == 0 && this.aClass140_10836.aClass166_2660 == null) {
            this.method7467(false);
         }

         this.method7472();
      }
   }

   void method7474(Class240_Sub22_Sub7_Sub1 var1) {
      if(this.aRenderer_Sub2_10807.anIntArray_10466.length < this.anInt_10838) {
         this.aRenderer_Sub2_10807.anIntArray_10466 = new int[this.anInt_10838];
         this.aRenderer_Sub2_10807.anIntArray_10467 = new int[this.anInt_10838];
      }

      int[] var2 = this.aRenderer_Sub2_10807.anIntArray_10466;
      int[] var3 = this.aRenderer_Sub2_10807.anIntArray_10467;
      int var4 = 0;

      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      while(var4 < this.vertexCount) {
         var5 = (this.anIntArray_10798[var4] - (this.anIntArray_10795[var4] * this.aRenderer_Sub2_10807.anInt_10403 >> 8) >> this.aRenderer_Sub2_10807.anInt_10407) - var1.anInt_3064;
         var6 = (this.anIntArray_10796[var4] - (this.anIntArray_10795[var4] * this.aRenderer_Sub2_10807.anInt_10435 >> 8) >> this.aRenderer_Sub2_10807.anInt_10407) - var1.anInt_3066;
         var7 = this.anIntArray_10835[var4];
         var8 = this.anIntArray_10835[var4 + 1];
         var9 = var7;

         while(true) {
            if(var9 < var8) {
               var10 = (this.aShortArray_10783[var9] & '\uffff') - 1;
               if(var10 != -1) {
                  var2[var10] = var5;
                  var3[var10] = var6;
                  ++var9;
                  continue;
               }
            }

            ++var4;
            break;
         }
      }

      for(var4 = 0; var4 < this.anInt_10808; ++var4) {
         if(this.aByteArray_10826 == null || this.aByteArray_10826[var4] <= 128) {
            var5 = this.aShortArray_10784[var4] & '\uffff';
            var6 = this.aShortArray_10812[var4] & '\uffff';
            var7 = this.aShortArray_10813[var4] & '\uffff';
            var8 = var2[var5];
            var9 = var2[var6];
            var10 = var2[var7];
            int var11 = var3[var5];
            int var12 = var3[var6];
            int var13 = var3[var7];
            if((var8 - var9) * (var12 - var13) - (var12 - var11) * (var10 - var9) > 0) {
               var1.method2207(var11, var12, var13, var8, var9, var10);
            }
         }
      }

   }

   void method7475() {
      int var1 = 32767;
      int var2 = 32767;
      int var3 = 32767;
      int var4 = -32768;
      int var5 = -32768;
      int var6 = -32768;
      int var7 = 0;
      int var8 = 0;

      for(int var9 = 0; var9 < this.vertexCount; ++var9) {
         int var10 = this.anIntArray_10798[var9];
         int var11 = this.anIntArray_10795[var9];
         int var12 = this.anIntArray_10796[var9];
         if(var10 < var1) {
            var1 = var10;
         }

         if(var10 > var4) {
            var4 = var10;
         }

         if(var11 < var2) {
            var2 = var11;
         }

         if(var11 > var5) {
            var5 = var11;
         }

         if(var12 < var3) {
            var3 = var12;
         }

         if(var12 > var6) {
            var6 = var12;
         }

         int var13 = var10 * var10 + var12 * var12;
         if(var13 > var7) {
            var7 = var13;
         }

         var13 = var10 * var10 + var12 * var12 + var11 * var11;
         if(var13 > var8) {
            var8 = var13;
         }
      }

      this.aShort_10830 = (short)var1;
      this.aShort_10831 = (short)var4;
      this.aShort_10828 = (short)var2;
      this.aShort_10846 = (short)var5;
      this.aShort_10829 = (short)var3;
      this.aShort_10833 = (short)var6;
      this.anInt_10821 = (int)(Math.sqrt((double)var7) + 0.99D);
      this.anInt_10825 = (int)(Math.sqrt((double)var8) + 0.99D);
      this.aBoolean_10827 = true;
   }

   public Class240_Sub22_Sub7 method2054(Class240_Sub22_Sub7 var1) {
      if(this.anInt_10838 == 0) {
         return null;
      } else {
         if(!this.aBoolean_10827) {
            this.method7475();
         }

         int var2;
         int var3;
         if(this.aRenderer_Sub2_10807.anInt_10403 > 0) {
            var2 = this.aShort_10830 - (this.aShort_10846 * this.aRenderer_Sub2_10807.anInt_10403 >> 8) >> this.aRenderer_Sub2_10807.anInt_10407;
            var3 = this.aShort_10831 - (this.aShort_10828 * this.aRenderer_Sub2_10807.anInt_10403 >> 8) >> this.aRenderer_Sub2_10807.anInt_10407;
         } else {
            var2 = this.aShort_10830 - (this.aShort_10828 * this.aRenderer_Sub2_10807.anInt_10403 >> 8) >> this.aRenderer_Sub2_10807.anInt_10407;
            var3 = this.aShort_10831 - (this.aShort_10846 * this.aRenderer_Sub2_10807.anInt_10403 >> 8) >> this.aRenderer_Sub2_10807.anInt_10407;
         }

         int var4;
         int var5;
         if(this.aRenderer_Sub2_10807.anInt_10435 > 0) {
            var4 = this.aShort_10829 - (this.aShort_10846 * this.aRenderer_Sub2_10807.anInt_10435 >> 8) >> this.aRenderer_Sub2_10807.anInt_10407;
            var5 = this.aShort_10833 - (this.aShort_10828 * this.aRenderer_Sub2_10807.anInt_10435 >> 8) >> this.aRenderer_Sub2_10807.anInt_10407;
         } else {
            var4 = this.aShort_10829 - (this.aShort_10828 * this.aRenderer_Sub2_10807.anInt_10435 >> 8) >> this.aRenderer_Sub2_10807.anInt_10407;
            var5 = this.aShort_10833 - (this.aShort_10846 * this.aRenderer_Sub2_10807.anInt_10435 >> 8) >> this.aRenderer_Sub2_10807.anInt_10407;
         }

         int var6 = var3 - var2 + 1;
         int var7 = var5 - var4 + 1;
         Class240_Sub22_Sub7_Sub1 var8 = (Class240_Sub22_Sub7_Sub1)var1;
         Class240_Sub22_Sub7_Sub1 var9;
         if(var8 != null && var8.method2209(var6, var7)) {
            var9 = var8;
            var8.method2206();
         } else {
            var9 = new Class240_Sub22_Sub7_Sub1(this.aRenderer_Sub2_10807, var6, var7);
         }

         var9.method2210(var2, var4, var3, var5);
         this.method7474(var9);
         return var9;
      }
   }

   Class165_Sub2(OpenGLRenderer var1, ModelData var2, int var3, int var4, int var5, int var6) {
      this.aRenderer_Sub2_10807 = var1;
      this.anInt_10804 = var3;
      this.anInt_10851 = var6;
      if(Class191.method2477(var3, var6)) {
         this.vertexPointer = new OGLBufferPointer((OGLBuffer)null, 5126, 3, 0);
      }

      if(Class191.method2477(var3, var6)) {
         this.anOGLBufferPointer_10790 = new OGLBufferPointer((OGLBuffer)null, 5126, 2, 0);
      }

      if(Class191.method2475(var3, var6)) {
         this.anOGLBufferPointer_10819 = new OGLBufferPointer((OGLBuffer)null, 5126, 3, 0);
      }

      if(Class191.method2477(var3, var6)) {
         this.anOGLBufferPointer_10818 = new OGLBufferPointer((OGLBuffer)null, 5121, 4, 0);
      }

      if(Class191.method2477(var3, var6)) {
         this.aClass140_10836 = new Class140();
      }

      Class163 var7 = var1.aClass163_2802;
      int[] var8 = new int[var2.anInt_1856];
      this.anIntArray_10835 = new int[var2.anInt_1850 + 1];

      for(int var9 = 0; var9 < var2.anInt_1856; ++var9) {
         if(var2.aByteArray_1860 == null || var2.aByteArray_1860[var9] != 2) {
            if(var2.aShortArray_1859 != null && var2.aShortArray_1859[var9] != -1) {
               Class183 var10 = var7.method1996(var2.aShortArray_1859[var9] & '\uffff', (byte)2);
               if(((this.anInt_10851 & 64) == 0 || !var10.aBoolean_3174) && var10.aBoolean_3152) {
                  continue;
               }
            }

            var8[this.anInt_10820++] = var9;
            ++this.anIntArray_10835[var2.aShortArray_1857[var9]];
            ++this.anIntArray_10835[var2.aShortArray_1845[var9]];
            ++this.anIntArray_10835[var2.aShortArray_1869[var9]];
         }
      }

      this.anInt_10808 = this.anInt_10820;
      long[] var67 = new long[this.anInt_10820];
      boolean var68 = (this.anInt_10804 & 256) != 0;

      int var12;
      int var14;
      int var19;
      Class183 var22;
      int var71;
      short var78;
      for(int var11 = 0; var11 < this.anInt_10820; ++var11) {
         var12 = var8[var11];
         Class183 var13 = null;
         var14 = 0;
         byte var15 = 0;
         byte var16 = 0;
         byte var17 = 0;
         boolean var18;
         if(var2.aClass107Array_1884 != null) {
            var18 = false;

            for(var19 = 0; var19 < var2.aClass107Array_1884.length; ++var19) {
               Class107 var20 = var2.aClass107Array_1884[var19];
               if(var12 == var20.anInt_1989 * 1921905305) {
                  Class397 var21 = Class366.method4667(var20.anInt_1991 * 2120936855, (byte)-59);
                  if(var21.aBoolean_7595) {
                     var18 = true;
                  }

                  if(var21.anInt_7589 * 741866845 != -1) {
                     var22 = var7.method1996(var21.anInt_7589 * 741866845, (byte)2);
                     if(var22.aClass620_3153 == Class620.aClass620_10022) {
                        this.aBoolean_10834 = true;
                     }
                  }
               }
            }

            if(var18) {
               var67[var11] = Long.MAX_VALUE;
               --this.anInt_10808;
               continue;
            }
         }

         if(var2.aClass86Array_1854 != null) {
            var18 = false;

            for(var19 = 0; var19 < var2.aClass86Array_1854.length; ++var19) {
               Class86 var83 = var2.aClass86Array_1854[var19];
               if(var12 == var83.anInt_1754 * -1827055815) {
                  Class411 var88 = Class110.method1411(var83.anInt_1746 * 87629913, -901182020);
                  if(var88.aBoolean_7825) {
                     var18 = true;
                  }
               }
            }

            if(var18) {
               var67[var11] = Long.MAX_VALUE;
               --this.anInt_10808;
               continue;
            }
         }

         var78 = -1;
         if(var2.aShortArray_1859 != null) {
            var78 = var2.aShortArray_1859[var12];
            if(var78 != -1) {
               var13 = var7.method1996(var78 & '\uffff', (byte)2);
               if((this.anInt_10851 & 64) != 0 && var13.aBoolean_3174) {
                  var78 = -1;
                  var13 = null;
               } else {
                  var16 = var13.aByte_3169;
                  var17 = var13.aByte_3170;
                  if(var13.aByte_3145 != 0 || var13.aByte_3157 != 0) {
                     this.aBoolean_10791 = true;
                  }
               }
            }
         }

         boolean var82 = var2.aByteArray_1864 != null && var2.aByteArray_1864[var12] != 0 || var13 != null && var13.aClass620_3153 != Class620.aClass620_10020;
         if((var68 || var82) && var2.aByteArray_1861 != null) {
            var14 += var2.aByteArray_1861[var12] << 17;
         }

         if(var82) {
            var14 += 65536;
         }

         var14 += (var16 & 255) << 8;
         var14 += var17 & 255;
         var71 = var15 + ((var78 & '\uffff') << 16);
         var71 += var11 & '\uffff';
         var67[var11] = ((long)var14 << 32) + (long)var71;
         this.aBoolean_10834 |= var82;
         this.aBoolean_10791 |= var13 != null && (var13.aByte_3145 != 0 || var13.aByte_3157 != 0);
      }

      Class131.method1686(var67, var8, 611061910);
      this.anInt_10792 = var2.anInt_1849;
      this.vertexCount = var2.anInt_1850;
      this.anIntArray_10798 = var2.anIntArray_1858;
      this.anIntArray_10795 = var2.anIntArray_1880;
      this.anIntArray_10796 = var2.anIntArray_1853;
      this.aShortArray_10840 = var2.aShortArray_1862;
      Class138[] var69 = new Class138[this.vertexCount];
      this.aClass86Array_10837 = var2.aClass86Array_1854;
      this.aClass172Array_10778 = var2.aClass172Array_1883;
      int var77;
      if(var2.aClass107Array_1884 != null) {
         this.anInt_10839 = var2.aClass107Array_1884.length;
         this.aClass175Array_10799 = new Class175[this.anInt_10839];
         this.aClass144Array_10841 = new Class144[this.anInt_10839];

         for(var12 = 0; var12 < this.anInt_10839; ++var12) {
            Class107 var72 = var2.aClass107Array_1884[var12];
            Class397 var73 = Class366.method4667(var72.anInt_1991 * 2120936855, (byte)37);
            var71 = -1;

            for(var77 = 0; var77 < this.anInt_10820; ++var77) {
               if(var8[var77] == var72.anInt_1989 * 1921905305) {
                  var71 = var77;
                  break;
               }
            }

            if(var71 == -1) {
               throw new RuntimeException();
            }

            var77 = Class541.anIntArray_9470[var2.aShortArray_1876[var72.anInt_1989 * 1921905305] & '\uffff'] & 16777215;
            var77 |= 255 - (var2.aByteArray_1864 != null?var2.aByteArray_1864[var72.anInt_1989 * 1921905305]:0) << 24;
            this.aClass175Array_10799[var12] = new Class175(var71, var2.aShortArray_1857[var72.anInt_1989 * 1921905305], var2.aShortArray_1845[var72.anInt_1989 * 1921905305], var2.aShortArray_1869[var72.anInt_1989 * 1921905305], var73.anInt_7590 * 300602345, var73.anInt_7586 * -1519311519, var73.anInt_7589 * 741866845, var73.anInt_7593 * 1295500681, var73.anInt_7592 * -782198371, var73.aBoolean_7595, var73.aBoolean_7594, var72.anInt_1988 * 514945959);
            this.aClass144Array_10841[var12] = new Class144(var77);
         }
      }

      var12 = this.anInt_10820 * 3;
      this.aShortArray_10802 = new short[var12];
      this.aShortArray_10801 = new short[var12];
      this.aShortArray_10800 = new short[var12];
      this.aByteArray_10803 = new byte[var12];
      this.aFloatArray_10805 = new float[var12];
      this.aFloatArray_10785 = new float[var12];
      this.aShortArray_10809 = new short[this.anInt_10820];
      this.aByteArray_10826 = new byte[this.anInt_10820];
      this.aShortArray_10784 = new short[this.anInt_10820];
      this.aShortArray_10812 = new short[this.anInt_10820];
      this.aShortArray_10813 = new short[this.anInt_10820];
      this.aShortArray_10814 = new short[this.anInt_10820];
      if(var2.aShortArray_1868 != null) {
         this.aShortArray_10816 = new short[this.anInt_10820];
      }

      this.aShort_10788 = (short)var4;
      this.aShort_10789 = (short)var5;
      this.aShortArray_10783 = new short[var12];
      aLongArray_10843 = new long[var12];
      int var70 = 0;

      for(var14 = 0; var14 < var2.anInt_1850; ++var14) {
         var71 = this.anIntArray_10835[var14];
         this.anIntArray_10835[var14] = var70;
         var70 += var71;
         var69[var14] = new Class138();
      }

      this.anIntArray_10835[var2.anInt_1850] = var70;
      Class93 var75 = this.method2063(var2, var8, this.anInt_10820);
      Class159[] var76 = new Class159[var2.anInt_1856];

      short var74;
      int var81;
      short var80;
      int var89;
      for(var77 = 0; var77 < var2.anInt_1856; ++var77) {
         var74 = var2.aShortArray_1857[var77];
         var78 = var2.aShortArray_1845[var77];
         var80 = var2.aShortArray_1869[var77];
         var81 = this.anIntArray_10798[var78] - this.anIntArray_10798[var74];
         var89 = this.anIntArray_10795[var78] - this.anIntArray_10795[var74];
         int var84 = this.anIntArray_10796[var78] - this.anIntArray_10796[var74];
         int var23 = this.anIntArray_10798[var80] - this.anIntArray_10798[var74];
         int var24 = this.anIntArray_10795[var80] - this.anIntArray_10795[var74];
         int var25 = this.anIntArray_10796[var80] - this.anIntArray_10796[var74];
         int var26 = var89 * var25 - var24 * var84;
         int var27 = var84 * var23 - var25 * var81;

         int var28;
         for(var28 = var81 * var24 - var23 * var89; var26 > 8192 || var27 > 8192 || var28 > 8192 || var26 < -8192 || var27 < -8192 || var28 < -8192; var28 >>= 1) {
            var26 >>= 1;
            var27 >>= 1;
         }

         int var29 = (int)Math.sqrt((double)(var26 * var26 + var27 * var27 + var28 * var28));
         if(var29 <= 0) {
            var29 = 1;
         }

         var26 = var26 * 256 / var29;
         var27 = var27 * 256 / var29;
         var28 = var28 * 256 / var29;
         byte var30 = var2.aByteArray_1860 == null?0:var2.aByteArray_1860[var77];
         if(var30 == 0) {
            Class138 var31 = var69[var74];
            var31.anInt_2648 += var26;
            var31.anInt_2646 += var27;
            var31.anInt_2647 += var28;
            ++var31.anInt_2645;
            var31 = var69[var78];
            var31.anInt_2648 += var26;
            var31.anInt_2646 += var27;
            var31.anInt_2647 += var28;
            ++var31.anInt_2645;
            var31 = var69[var80];
            var31.anInt_2648 += var26;
            var31.anInt_2646 += var27;
            var31.anInt_2647 += var28;
            ++var31.anInt_2645;
         } else if(var30 == 1) {
            Class159 var101 = var76[var77] = new Class159();
            var101.anInt_2791 = var26;
            var101.anInt_2789 = var27;
            var101.anInt_2790 = var28;
         }
      }

      int var87;
      for(var77 = 0; var77 < this.anInt_10820; ++var77) {
         int var79 = var8[var77];
         var87 = var2.aShortArray_1876[var79] & '\uffff';
         if(var2.aShortArray_1863 == null) {
            var19 = -1;
         } else {
            var19 = var2.aShortArray_1863[var79];
         }

         if(var2.aByteArray_1864 == null) {
            var81 = 0;
         } else {
            var81 = var2.aByteArray_1864[var79] & 255;
         }

         short var90 = var2.aShortArray_1859 == null?-1:var2.aShortArray_1859[var79];
         if(var90 != -1 && (this.anInt_10851 & 64) != 0) {
            var22 = var7.method1996(var90 & '\uffff', (byte)2);
            if(var22.aBoolean_3174) {
               var90 = -1;
            }
         }

         float var85 = 0.0F;
         float var86 = 0.0F;
         float var93 = 0.0F;
         float var91 = 0.0F;
         float var95 = 0.0F;
         float var94 = 0.0F;
         byte var97 = 0;
         byte var98 = 0;
         int var96 = 0;
         short var34;
         short var35;
         short var36;
         byte var99;
         if(var90 != -1) {
            if(var19 == -1) {
               var85 = 0.0F;
               var86 = 1.0F;
               var93 = 1.0F;
               var91 = 1.0F;
               var97 = 1;
               var95 = 0.0F;
               var94 = 0.0F;
               var98 = 2;
            } else {
               var19 &= '\uffff';
               var99 = var2.aByteArray_1870[var19];
               short var32;
               short var33;
               float var42;
               float var40;
               float var41;
               float var55;
               float var54;
               float var53;
               float var52;
               float var57;
               float var56;
               if(var99 == 0) {
                  var32 = var2.aShortArray_1857[var79];
                  var33 = var2.aShortArray_1845[var79];
                  var34 = var2.aShortArray_1869[var79];
                  var35 = var2.aShortArray_1871[var19];
                  var36 = var2.aShortArray_1872[var19];
                  short var37 = var2.aShortArray_1852[var19];
                  float var38 = (float)var2.anIntArray_1858[var35];
                  float var39 = (float)var2.anIntArray_1880[var35];
                  var40 = (float)var2.anIntArray_1853[var35];
                  var41 = (float)var2.anIntArray_1858[var36] - var38;
                  var42 = (float)var2.anIntArray_1880[var36] - var39;
                  float var43 = (float)var2.anIntArray_1853[var36] - var40;
                  float var44 = (float)var2.anIntArray_1858[var37] - var38;
                  float var45 = (float)var2.anIntArray_1880[var37] - var39;
                  float var46 = (float)var2.anIntArray_1853[var37] - var40;
                  float var47 = (float)var2.anIntArray_1858[var32] - var38;
                  float var48 = (float)var2.anIntArray_1880[var32] - var39;
                  float var49 = (float)var2.anIntArray_1853[var32] - var40;
                  float var50 = (float)var2.anIntArray_1858[var33] - var38;
                  float var51 = (float)var2.anIntArray_1880[var33] - var39;
                  var52 = (float)var2.anIntArray_1853[var33] - var40;
                  var53 = (float)var2.anIntArray_1858[var34] - var38;
                  var54 = (float)var2.anIntArray_1880[var34] - var39;
                  var55 = (float)var2.anIntArray_1853[var34] - var40;
                  var56 = var42 * var46 - var43 * var45;
                  var57 = var43 * var44 - var41 * var46;
                  float var58 = var41 * var45 - var42 * var44;
                  float var59 = var45 * var58 - var46 * var57;
                  float var60 = var46 * var56 - var44 * var58;
                  float var61 = var44 * var57 - var45 * var56;
                  float var62 = 1.0F / (var59 * var41 + var60 * var42 + var61 * var43);
                  var85 = (var59 * var47 + var60 * var48 + var61 * var49) * var62;
                  var93 = (var59 * var50 + var60 * var51 + var61 * var52) * var62;
                  var95 = (var59 * var53 + var60 * var54 + var61 * var55) * var62;
                  var59 = var42 * var58 - var43 * var57;
                  var60 = var43 * var56 - var41 * var58;
                  var61 = var41 * var57 - var42 * var56;
                  var62 = 1.0F / (var59 * var44 + var60 * var45 + var61 * var46);
                  var86 = (var59 * var47 + var60 * var48 + var61 * var49) * var62;
                  var91 = (var59 * var50 + var60 * var51 + var61 * var52) * var62;
                  var94 = (var59 * var53 + var60 * var54 + var61 * var55) * var62;
               } else {
                  var32 = var2.aShortArray_1857[var79];
                  var33 = var2.aShortArray_1845[var79];
                  var34 = var2.aShortArray_1869[var79];
                  int var103 = var75.anIntArray_1836[var19];
                  int var102 = var75.anIntArray_1832[var19];
                  int var107 = var75.anIntArray_1834[var19];
                  float[] var105 = var75.aFloatArrayArray_1835[var19];
                  byte var104 = var2.aByteArray_1881[var19];
                  var40 = (float)var2.anIntArray_1877[var19] / 256.0F;
                  if(var99 == 1) {
                     var41 = (float)var2.anIntArray_1865[var19] / 1024.0F;
                     this.method2062(var2.anIntArray_1858[var32], var2.anIntArray_1880[var32], var2.anIntArray_1853[var32], var103, var102, var107, var105, var41, var104, var40, aFloatArray_10844);
                     var85 = aFloatArray_10844[0];
                     var86 = aFloatArray_10844[1];
                     this.method2062(var2.anIntArray_1858[var33], var2.anIntArray_1880[var33], var2.anIntArray_1853[var33], var103, var102, var107, var105, var41, var104, var40, aFloatArray_10844);
                     var93 = aFloatArray_10844[0];
                     var91 = aFloatArray_10844[1];
                     this.method2062(var2.anIntArray_1858[var34], var2.anIntArray_1880[var34], var2.anIntArray_1853[var34], var103, var102, var107, var105, var41, var104, var40, aFloatArray_10844);
                     var95 = aFloatArray_10844[0];
                     var94 = aFloatArray_10844[1];
                     var42 = var41 / 2.0F;
                     if((var104 & 1) == 0) {
                        if(var93 - var85 > var42) {
                           var93 -= var41;
                           var97 = 1;
                        } else if(var85 - var93 > var42) {
                           var93 += var41;
                           var97 = 2;
                        }

                        if(var95 - var85 > var42) {
                           var95 -= var41;
                           var98 = 1;
                        } else if(var85 - var95 > var42) {
                           var95 += var41;
                           var98 = 2;
                        }
                     } else {
                        if(var91 - var86 > var42) {
                           var91 -= var41;
                           var97 = 1;
                        } else if(var86 - var91 > var42) {
                           var91 += var41;
                           var97 = 2;
                        }

                        if(var94 - var86 > var42) {
                           var94 -= var41;
                           var98 = 1;
                        } else if(var86 - var94 > var42) {
                           var94 += var41;
                           var98 = 2;
                        }
                     }
                  } else if(var99 == 2) {
                     var41 = (float)var2.anIntArray_1873[var19] / 256.0F;
                     var42 = (float)var2.anIntArray_1879[var19] / 256.0F;
                     int var111 = var2.anIntArray_1858[var33] - var2.anIntArray_1858[var32];
                     int var112 = var2.anIntArray_1880[var33] - var2.anIntArray_1880[var32];
                     int var108 = var2.anIntArray_1853[var33] - var2.anIntArray_1853[var32];
                     int var109 = var2.anIntArray_1858[var34] - var2.anIntArray_1858[var32];
                     int var110 = var2.anIntArray_1880[var34] - var2.anIntArray_1880[var32];
                     int var115 = var2.anIntArray_1853[var34] - var2.anIntArray_1853[var32];
                     int var116 = var112 * var115 - var110 * var108;
                     int var113 = var108 * var109 - var115 * var111;
                     int var114 = var111 * var110 - var109 * var112;
                     var52 = 64.0F / (float)var2.anIntArray_1874[var19];
                     var53 = 64.0F / (float)var2.anIntArray_1875[var19];
                     var54 = 64.0F / (float)var2.anIntArray_1865[var19];
                     var55 = ((float)var116 * var105[0] + (float)var113 * var105[1] + (float)var114 * var105[2]) / var52;
                     var56 = ((float)var116 * var105[3] + (float)var113 * var105[4] + (float)var114 * var105[5]) / var53;
                     var57 = ((float)var116 * var105[6] + (float)var113 * var105[7] + (float)var114 * var105[8]) / var54;
                     var96 = this.method2045(var55, var56, var57);
                     this.method2011(var2.anIntArray_1858[var32], var2.anIntArray_1880[var32], var2.anIntArray_1853[var32], var103, var102, var107, var96, var105, var104, var40, var41, var42, aFloatArray_10844);
                     var85 = aFloatArray_10844[0];
                     var86 = aFloatArray_10844[1];
                     this.method2011(var2.anIntArray_1858[var33], var2.anIntArray_1880[var33], var2.anIntArray_1853[var33], var103, var102, var107, var96, var105, var104, var40, var41, var42, aFloatArray_10844);
                     var93 = aFloatArray_10844[0];
                     var91 = aFloatArray_10844[1];
                     this.method2011(var2.anIntArray_1858[var34], var2.anIntArray_1880[var34], var2.anIntArray_1853[var34], var103, var102, var107, var96, var105, var104, var40, var41, var42, aFloatArray_10844);
                     var95 = aFloatArray_10844[0];
                     var94 = aFloatArray_10844[1];
                  } else if(var99 == 3) {
                     this.method2010(var2.anIntArray_1858[var32], var2.anIntArray_1880[var32], var2.anIntArray_1853[var32], var103, var102, var107, var105, var104, var40, aFloatArray_10844);
                     var85 = aFloatArray_10844[0];
                     var86 = aFloatArray_10844[1];
                     this.method2010(var2.anIntArray_1858[var33], var2.anIntArray_1880[var33], var2.anIntArray_1853[var33], var103, var102, var107, var105, var104, var40, aFloatArray_10844);
                     var93 = aFloatArray_10844[0];
                     var91 = aFloatArray_10844[1];
                     this.method2010(var2.anIntArray_1858[var34], var2.anIntArray_1880[var34], var2.anIntArray_1853[var34], var103, var102, var107, var105, var104, var40, aFloatArray_10844);
                     var95 = aFloatArray_10844[0];
                     var94 = aFloatArray_10844[1];
                     if((var104 & 1) == 0) {
                        if(var93 - var85 > 0.5F) {
                           --var93;
                           var97 = 1;
                        } else if(var85 - var93 > 0.5F) {
                           ++var93;
                           var97 = 2;
                        }

                        if(var95 - var85 > 0.5F) {
                           --var95;
                           var98 = 1;
                        } else if(var85 - var95 > 0.5F) {
                           ++var95;
                           var98 = 2;
                        }
                     } else {
                        if(var91 - var86 > 0.5F) {
                           --var91;
                           var97 = 1;
                        } else if(var86 - var91 > 0.5F) {
                           ++var91;
                           var97 = 2;
                        }

                        if(var94 - var86 > 0.5F) {
                           --var94;
                           var98 = 1;
                        } else if(var86 - var94 > 0.5F) {
                           ++var94;
                           var98 = 2;
                        }
                     }
                  }
               }
            }
         }

         if(var2.aByteArray_1860 == null) {
            var99 = 0;
         } else {
            var99 = var2.aByteArray_1860[var79];
         }

         if(var99 == 0) {
            long var63 = (long)(var19 << 2) + ((long)(var96 << 24) + (long)(var87 << 8) + (long)var81 << 32);
            var34 = var2.aShortArray_1857[var79];
            var35 = var2.aShortArray_1845[var79];
            var36 = var2.aShortArray_1869[var79];
            Class138 var106 = var69[var34];
            this.aShortArray_10784[var77] = this.method7424(var2, var34, var63, var106.anInt_2648, var106.anInt_2646, var106.anInt_2647, var106.anInt_2645, var85, var86);
            var106 = var69[var35];
            this.aShortArray_10812[var77] = this.method7424(var2, var35, var63 + (long)var97, var106.anInt_2648, var106.anInt_2646, var106.anInt_2647, var106.anInt_2645, var93, var91);
            var106 = var69[var36];
            this.aShortArray_10813[var77] = this.method7424(var2, var36, var63 + (long)var98, var106.anInt_2648, var106.anInt_2646, var106.anInt_2647, var106.anInt_2645, var95, var94);
         } else if(var99 == 1) {
            Class159 var100 = var76[var79];
            long var65 = (long)((var19 << 2) + (var100.anInt_2791 > 0?1024:2048) + (var100.anInt_2789 + 256 << 12) + (var100.anInt_2790 + 256 << 22)) + ((long)(var96 << 24) + (long)(var87 << 8) + (long)var81 << 32);
            this.aShortArray_10784[var77] = this.method7424(var2, var2.aShortArray_1857[var79], var65, var100.anInt_2791, var100.anInt_2789, var100.anInt_2790, 0, var85, var86);
            this.aShortArray_10812[var77] = this.method7424(var2, var2.aShortArray_1845[var79], var65 + (long)var97, var100.anInt_2791, var100.anInt_2789, var100.anInt_2790, 0, var93, var91);
            this.aShortArray_10813[var77] = this.method7424(var2, var2.aShortArray_1869[var79], var65 + (long)var98, var100.anInt_2791, var100.anInt_2789, var100.anInt_2790, 0, var95, var94);
         }

         if(var2.aByteArray_1864 != null) {
            this.aByteArray_10826[var77] = var2.aByteArray_1864[var79];
         }

         if(var2.aShortArray_1868 != null) {
            this.aShortArray_10816[var77] = var2.aShortArray_1868[var79];
         }

         this.aShortArray_10809[var77] = var2.aShortArray_1876[var79];
         this.aShortArray_10814[var77] = var90;
      }

      var77 = 0;
      var74 = -10000;

      for(var87 = 0; var87 < this.anInt_10808; ++var87) {
         var80 = this.aShortArray_10814[var87];
         if(var80 != var74) {
            ++var77;
            var74 = var80;
         }
      }

      this.anIntArray_10810 = new int[var77 + 1];
      var77 = 0;
      var74 = -10000;

      for(var87 = 0; var87 < this.anInt_10808; ++var87) {
         var80 = this.aShortArray_10814[var87];
         if(var80 != var74) {
            this.anIntArray_10810[var77++] = var87;
            var74 = var80;
         }
      }

      this.anIntArray_10810[var77] = this.anInt_10808;
      aLongArray_10843 = null;
      this.aShortArray_10802 = method7471(this.aShortArray_10802, this.anInt_10838);
      this.aShortArray_10801 = method7471(this.aShortArray_10801, this.anInt_10838);
      this.aShortArray_10800 = method7471(this.aShortArray_10800, this.anInt_10838);
      this.aByteArray_10803 = method7464(this.aByteArray_10803, this.anInt_10838);
      this.aFloatArray_10805 = method7484(this.aFloatArray_10805, this.anInt_10838);
      this.aFloatArray_10785 = method7484(this.aFloatArray_10785, this.anInt_10838);
      if(var2.anIntArray_1844 != null && Class191.method2492(var3, this.anInt_10851)) {
         this.anIntArrayArray_10832 = var2.method1233(false);
      }

      if(var2.aClass107Array_1884 != null && Class191.method2467(var3, this.anInt_10851)) {
         this.anIntArrayArray_10842 = var2.method1225();
      }

      if(var2.anIntArray_1866 != null && Class191.method2486(var3, this.anInt_10851)) {
         var87 = 0;
         int[] var92 = new int[256];

         for(var81 = 0; var81 < this.anInt_10820; ++var81) {
            var89 = var2.anIntArray_1866[var8[var81]];
            if(var89 >= 0) {
               ++var92[var89];
               if(var89 > var87) {
                  var87 = var89;
               }
            }
         }

         this.anIntArrayArray_10815 = new int[var87 + 1][];

         for(var81 = 0; var81 <= var87; ++var81) {
            this.anIntArrayArray_10815[var81] = new int[var92[var81]];
            var92[var81] = 0;
         }

         for(var81 = 0; var81 < this.anInt_10820; ++var81) {
            var89 = var2.anIntArray_1866[var8[var81]];
            if(var89 >= 0) {
               this.anIntArrayArray_10815[var89][var92[var89]++] = var81;
            }
         }
      }

   }

   void method2024() {
      for(int var1 = 0; var1 < this.anInt_10792; ++var1) {
         this.anIntArray_10798[var1] = this.anIntArray_10798[var1] + 7 >> 4;
         this.anIntArray_10795[var1] = this.anIntArray_10795[var1] + 7 >> 4;
         this.anIntArray_10796[var1] = this.anIntArray_10796[var1] + 7 >> 4;
      }

      if(this.vertexPointer != null) {
         this.vertexPointer.buffer = null;
      }

      this.aBoolean_10827 = false;
   }

   public byte[] method2048() {
      return this.aByteArray_10826;
   }

   boolean method7479(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      return var2 < var3 && var2 < var4 && var2 < var5?false:(var2 > var3 && var2 > var4 && var2 > var5?false:(var1 < var6 && var1 < var7 && var1 < var8?false:var1 <= var6 || var1 <= var7 || var1 <= var8));
   }

   public int method2041() {
      if(!this.aBoolean_10827) {
         this.method7475();
      }

      return this.aShort_10828;
   }

   public int method2022() {
      if(!this.aBoolean_10827) {
         this.method7475();
      }

      return this.aShort_10831;
   }

   Class165_Sub2(OpenGLRenderer var1) {
      this.aRenderer_Sub2_10807 = var1;
      this.vertexPointer = new OGLBufferPointer((OGLBuffer)null, 5126, 3, 0);
      this.anOGLBufferPointer_10790 = new OGLBufferPointer((OGLBuffer)null, 5126, 2, 0);
      this.anOGLBufferPointer_10819 = new OGLBufferPointer((OGLBuffer)null, 5126, 3, 0);
      this.anOGLBufferPointer_10818 = new OGLBufferPointer((OGLBuffer)null, 5121, 4, 0);
      this.aClass140_10836 = new Class140();
   }

   public void method2052(Viewport var1) {
      ArrayViewport var2 = this.aRenderer_Sub2_10807.anArrayViewport_10371;
      var2.setViewport(var1);
      int var3;
      if(this.aClass86Array_10837 != null) {
         for(var3 = 0; var3 < this.aClass86Array_10837.length; ++var3) {
            Class86 var4 = this.aClass86Array_10837[var3];
            Class86 var5 = var4;
            if(var4.aClass86_1742 != null) {
               var5 = var4.aClass86_1742;
            }

            var5.anInt_1747 = (int)(var2.data[12] + var2.data[0] * (float)this.anIntArray_10798[var4.anInt_1740 * -146104779] + var2.data[4] * (float)this.anIntArray_10795[var4.anInt_1740 * -146104779] + var2.data[8] * (float)this.anIntArray_10796[var4.anInt_1740 * -146104779]) * 346431023;
            var5.anInt_1741 = (int)(var2.data[13] + var2.data[1] * (float)this.anIntArray_10798[var4.anInt_1740 * -146104779] + var2.data[5] * (float)this.anIntArray_10795[var4.anInt_1740 * -146104779] + var2.data[9] * (float)this.anIntArray_10796[var4.anInt_1740 * -146104779]) * -1274764179;
            var5.anInt_1749 = (int)(var2.data[14] + var2.data[2] * (float)this.anIntArray_10798[var4.anInt_1740 * -146104779] + var2.data[6] * (float)this.anIntArray_10795[var4.anInt_1740 * -146104779] + var2.data[10] * (float)this.anIntArray_10796[var4.anInt_1740 * -146104779]) * 1829222211;
            var5.anInt_1750 = (int)(var2.data[12] + var2.data[0] * (float)this.anIntArray_10798[var4.anInt_1744 * -1747600183] + var2.data[4] * (float)this.anIntArray_10795[var4.anInt_1744 * -1747600183] + var2.data[8] * (float)this.anIntArray_10796[var4.anInt_1744 * -1747600183]) * 203218289;
            var5.anInt_1751 = (int)(var2.data[13] + var2.data[1] * (float)this.anIntArray_10798[var4.anInt_1744 * -1747600183] + var2.data[5] * (float)this.anIntArray_10795[var4.anInt_1744 * -1747600183] + var2.data[9] * (float)this.anIntArray_10796[var4.anInt_1744 * -1747600183]) * -91675159;
            var5.anInt_1752 = (int)(var2.data[14] + var2.data[2] * (float)this.anIntArray_10798[var4.anInt_1744 * -1747600183] + var2.data[6] * (float)this.anIntArray_10795[var4.anInt_1744 * -1747600183] + var2.data[10] * (float)this.anIntArray_10796[var4.anInt_1744 * -1747600183]) * -396351427;
            var5.anInt_1753 = (int)(var2.data[12] + var2.data[0] * (float)this.anIntArray_10798[var4.anInt_1745 * -2092357753] + var2.data[4] * (float)this.anIntArray_10795[var4.anInt_1745 * -2092357753] + var2.data[8] * (float)this.anIntArray_10796[var4.anInt_1745 * -2092357753]) * -527219251;
            var5.anInt_1743 = (int)(var2.data[13] + var2.data[1] * (float)this.anIntArray_10798[var4.anInt_1745 * -2092357753] + var2.data[5] * (float)this.anIntArray_10795[var4.anInt_1745 * -2092357753] + var2.data[9] * (float)this.anIntArray_10796[var4.anInt_1745 * -2092357753]) * -807730159;
            var5.anInt_1748 = (int)(var2.data[14] + var2.data[2] * (float)this.anIntArray_10798[var4.anInt_1745 * -2092357753] + var2.data[6] * (float)this.anIntArray_10795[var4.anInt_1745 * -2092357753] + var2.data[10] * (float)this.anIntArray_10796[var4.anInt_1745 * -2092357753]) * -277851451;
         }
      }

      if(this.aClass172Array_10778 != null) {
         for(var3 = 0; var3 < this.aClass172Array_10778.length; ++var3) {
            Class172 var6 = this.aClass172Array_10778[var3];
            Class172 var7 = var6;
            if(var6.aClass172_3035 != null) {
               var7 = var6.aClass172_3035;
            }

            if(var6.anArrayViewport_3038 != null) {
               var6.anArrayViewport_3038.replaceWith(var2);
            } else {
               var6.anArrayViewport_3038 = new ArrayViewport(var2);
            }

            var7.anInt_3034 = (int)(var2.data[12] + var2.data[0] * (float)this.anIntArray_10798[var6.anInt_3036 * 1218049443] + var2.data[4] * (float)this.anIntArray_10795[var6.anInt_3036 * 1218049443] + var2.data[8] * (float)this.anIntArray_10796[var6.anInt_3036 * 1218049443]) * -2049585273;
            var7.anInt_3039 = (int)(var2.data[13] + var2.data[1] * (float)this.anIntArray_10798[var6.anInt_3036 * 1218049443] + var2.data[5] * (float)this.anIntArray_10795[var6.anInt_3036 * 1218049443] + var2.data[9] * (float)this.anIntArray_10796[var6.anInt_3036 * 1218049443]) * -701126557;
            var7.anInt_3037 = (int)(var2.data[14] + var2.data[2] * (float)this.anIntArray_10798[var6.anInt_3036 * 1218049443] + var2.data[6] * (float)this.anIntArray_10795[var6.anInt_3036 * 1218049443] + var2.data[10] * (float)this.anIntArray_10796[var6.anInt_3036 * 1218049443]) * 93477565;
         }
      }

   }

   public boolean method2058() {
      return this.aBoolean_10834;
   }

   static float[] method7484(float[] var0, int var1) {
      float[] var2 = new float[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   void method7485() {
      if(this.anInt_10808 != 0) {
         if(this.aByte_10806 != 0) {
            this.method7468(true);
         }

         this.method7468(false);
         if(this.aClass140_10836 != null) {
            if(this.aClass140_10836.aClass166_2660 == null) {
               this.method7467((this.aByte_10806 & 16) != 0);
            }

            if(this.aClass140_10836.aClass166_2660 != null) {
               this.aRenderer_Sub2_10807.method7066(this.anOGLBufferPointer_10819 != null);
               this.aRenderer_Sub2_10807.setPointers(this.vertexPointer, this.anOGLBufferPointer_10819, this.anOGLBufferPointer_10818, this.anOGLBufferPointer_10790);
               int var1 = this.anIntArray_10810.length - 1;

               for(int var2 = 0; var2 < var1; ++var2) {
                  int var3 = this.anIntArray_10810[var2];
                  int var4 = this.anIntArray_10810[var2 + 1];
                  int var5 = this.aShortArray_10814[var3] == -1?-1:this.aShortArray_10814[var3] & '\uffff';
                  this.aRenderer_Sub2_10807.method7015(var5, this.anOGLBufferPointer_10819 != null);
                  this.aRenderer_Sub2_10807.method7009(this.aClass140_10836.aClass166_2660, 4, var3 * 3, (var4 - var3) * 3);
               }
            }
         }

         this.method7472();
      }
   }
}
