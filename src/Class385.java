import java.nio.ByteBuffer;

public class Class385 {

   Class384 aClass384_7443;
   static final int anInt_7444 = 128;
   final int anInt_7445;
   final Class64 aClass64_7446;
   final int anInt_7447;
   int anInt_7448 = -1;
   final int anInt_7449;
   static final int anInt_7450 = 7;
   final Renderer_Sub3 aRenderer_Sub3_7451;
   Class414 aClass414_7452;
   boolean aBoolean_7453 = true;
   int anInt_7454;
   int anInt_7455;
   int[] anIntArray_7456;
   byte[] aByteArray_7457;


   void method4877() {
      if(this.aBoolean_7453) {
         this.aBoolean_7453 = false;
         byte[] var1 = this.aClass64_7446.aByteArray_1238;
         int var2 = 0;
         int var3 = this.aClass64_7446.anInt_1240;
         int var4 = this.anInt_7447 + this.anInt_7449 * this.aClass64_7446.anInt_1240;

         int var5;
         for(var5 = -128; var5 < 0; ++var5) {
            var2 = (var2 << 8) - var2;

            for(int var6 = -128; var6 < 0; ++var6) {
               if(var1[var4++] != 0) {
                  ++var2;
               }
            }

            var4 += var3 - 128;
         }

         if(this.aClass384_7443 != null && this.anInt_7448 == var2) {
            this.aBoolean_7453 = false;
         } else {
            this.anInt_7448 = var2;
            var5 = 0;
            var4 = this.anInt_7447 + this.anInt_7449 * var3;
            int var7;
            int var8;
            int var9;
            if(this.aRenderer_Sub3_7451.method7212(Class136.aClass136_2626, Class87.aClass87_1759)) {
               if(this.aByteArray_7457 == null) {
                  this.aByteArray_7457 = new byte[16384];
               }

               byte[] var10 = this.aByteArray_7457;

               for(var7 = -128; var7 < 0; ++var7) {
                  for(var8 = -128; var8 < 0; ++var8) {
                     if(var1[var4] != 0) {
                        var10[var5++] = 68;
                     } else {
                        var9 = 0;
                        if(var1[var4 - 1] != 0) {
                           ++var9;
                        }

                        if(var1[var4 + 1] != 0) {
                           ++var9;
                        }

                        if(var1[var4 - var3] != 0) {
                           ++var9;
                        }

                        if(var1[var4 + var3] != 0) {
                           ++var9;
                        }

                        var10[var5++] = (byte)(17 * var9);
                     }

                     ++var4;
                  }

                  var4 += this.aClass64_7446.anInt_1240 - 128;
               }

               if(this.aClass384_7443 == null) {
                  this.aClass384_7443 = this.aRenderer_Sub3_7451.method7215(Class136.aClass136_2626, 128, 128, false, this.aByteArray_7457);
                  this.aClass384_7443.method4869(false, false);
               } else {
                  this.aClass384_7443.method4870(0, 0, 128, 128, this.aByteArray_7457, Class136.aClass136_2626, 0, 128);
               }
            } else {
               if(this.anIntArray_7456 == null) {
                  this.anIntArray_7456 = new int[16384];
               }

               int[] var11 = this.anIntArray_7456;

               for(var7 = -128; var7 < 0; ++var7) {
                  for(var8 = -128; var8 < 0; ++var8) {
                     if(var1[var4] != 0) {
                        var11[var5++] = 1140850688;
                     } else {
                        var9 = 0;
                        if(var1[var4 - 1] != 0) {
                           ++var9;
                        }

                        if(var1[var4 + 1] != 0) {
                           ++var9;
                        }

                        if(var1[var4 - var3] != 0) {
                           ++var9;
                        }

                        if(var1[var4 + var3] != 0) {
                           ++var9;
                        }

                        var11[var5++] = 17 * var9 << 24;
                     }

                     ++var4;
                  }

                  var4 += this.aClass64_7446.anInt_1240 - 128;
               }

               if(this.aClass384_7443 == null) {
                  this.aClass384_7443 = this.aRenderer_Sub3_7451.method7297(128, 128, false, this.anIntArray_7456);
                  this.aClass384_7443.method4869(false, false);
               } else {
                  this.aClass384_7443.method4867(0, 0, 128, 128, this.anIntArray_7456, 0, 128);
               }
            }

         }
      }
   }

   void method4878(Class27 var1, Class414 var2, int var3, int var4) {
      if(var4 > 0) {
         this.method4877();
         this.aRenderer_Sub3_7451.method7307(var2);
         var1.aClass384_762 = this.aClass384_7443;
         var1.anInt_768 = this.anInt_7454;
         var1.anInt_782 = this.anInt_7455 - this.anInt_7454 + 1;
         var1.anInt_779 = var3;
         var1.anInt_784 = var4;
         var1.method191(false);
      }

   }

   void method4879(Class27 var1) {
      this.method4878(var1, this.aClass414_7452, 0, this.anInt_7445);
   }

   Class385(Renderer_Sub3 var1, Class64 var2, Class171_Sub3 var3, int var4, int var5, int var6, int var7, int var8) {
      this.aRenderer_Sub3_7451 = var1;
      this.aClass64_7446 = var2;
      this.anInt_7447 = var7;
      this.anInt_7449 = var8;
      int var9 = 1 << var6;
      int var10 = 0;
      int var11 = var4 << var6;
      int var12 = var5 << var6;

      int var14;
      int var15;
      for(int var13 = 0; var13 < var9; ++var13) {
         var14 = (var12 + var13) * var3.maxWidth * 1658489349 + var11;

         for(var15 = 0; var15 < var9; ++var15) {
            short[] var16 = var3.aShortArrayArray_11086[var14++];
            if(var16 != null) {
               var10 += var16.length;
            }
         }
      }

      if(var10 > 0) {
         this.anInt_7455 = Integer.MIN_VALUE;
         this.anInt_7454 = Integer.MAX_VALUE;
         this.aClass414_7452 = this.aRenderer_Sub3_7451.method7249(false);
         this.aClass414_7452.method5136(var10);
         ByteBuffer var20 = this.aRenderer_Sub3_7451.aByteBuffer_10646;
         var20.clear();

         for(var14 = 0; var14 < var9; ++var14) {
            var15 = (var12 + var14) * var3.maxWidth * 1658489349 + var11;

            for(int var21 = 0; var21 < var9; ++var21) {
               short[] var17 = var3.aShortArrayArray_11086[var15++];
               if(var17 != null) {
                  for(int var18 = 0; var18 < var17.length; ++var18) {
                     int var19 = var17[var18] & '\uffff';
                     if(var19 < this.anInt_7454) {
                        this.anInt_7454 = var19;
                     }

                     if(var19 > this.anInt_7455) {
                        this.anInt_7455 = var19;
                     }

                     var20.putShort((short)var19);
                  }
               }
            }
         }

         this.aClass414_7452.method4853(0, var20.position(), this.aRenderer_Sub3_7451.aLong_10629);
         this.anInt_7445 = var10 / 3;
      } else {
         this.anInt_7445 = 0;
         this.aClass384_7443 = null;
      }

   }
}
