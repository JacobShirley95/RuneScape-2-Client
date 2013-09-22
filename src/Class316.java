import java.awt.Component;
import java.util.Arrays;

public class Class316 {

   int anInt_6134 = 0;
   public static int anInt_6135;
   public static boolean aBoolean_6136;
   static int anInt_6137;
   static Class290 aClass290_6138;
   long aLong_6139 = Class373.getCurrentTime((short)3544);
   boolean aBoolean_6140 = true;
   int[] anIntArray_6141;
   boolean aBoolean_6142 = false;
   Class240_Sub41 aClass240_Sub41_6143;
   int anInt_6144 = 0;
   Class240_Sub41[] aClass240_Sub41Array_6145 = new Class240_Sub41[8];
   int anInt_6146;
   int anInt_6147;
   static boolean aBoolean_6148 = false;
   long aLong_6149 = 0L;
   int anInt_6150 = 0;
   public static final int anInt_6151 = 256;
   int anInt_6152 = 0;
   long aLong_6153 = 0L;
   int anInt_6154;
   static final int anInt_6155 = 3;
   static final int anInt_6156 = 8;
   static final int anInt_6157 = 2;
   static final int anInt_6158 = 4;
   static final int anInt_6159 = 286331153;
   static final int anInt_6160 = 16384;
   int anInt_6161 = 32;
   Class240_Sub41[] aClass240_Sub41Array_6162 = new Class240_Sub41[8];


   public static final Class316 method3896(Component var0, int var1, int var2) {
      if(anInt_6135 == 0) {
         throw new IllegalStateException();
      } else if(var1 >= 0 && var1 < 2) {
         int var3 = var2;
         if(var2 < 256) {
            var3 = 256;
         }

         if(!aBoolean_6148) {
            try {
               Class316_Sub1 var4 = new Class316_Sub1();
               var4.anIntArray_6141 = new int[256 * (aBoolean_6136?2:1)];
               var4.anInt_6147 = var3;
               var4.method3903(var0);
               var4.anInt_6146 = (var3 & -1024) + 1024;
               if(var4.anInt_6146 > 16384) {
                  var4.anInt_6146 = 16384;
               }

               var4.method3904(var4.anInt_6146);
               if(anInt_6137 > 0 && aClass290_6138 == null) {
                  aClass290_6138 = new Class290_Sub1();
                  Thread var5 = new Thread(aClass290_6138);
                  var5.setDaemon(true);
                  var5.start();
                  var5.setPriority(anInt_6137);
               }

               if(aClass290_6138 != null) {
                  if(aClass290_6138.aClass316Array_5912[var1] != null) {
                     throw new IllegalArgumentException();
                  }

                  aClass290_6138.aClass316Array_5912[var1] = var4;
               }

               return var4;
            } catch (Throwable var6) {
               ;
            }
         }

         return new Class316();
      } else {
         throw new IllegalArgumentException();
      }
   }

   public static final void method3897(int var0, boolean var1, int var2) {
      if(var0 >= 8000 && var0 <= '\ubb80') {
         anInt_6135 = var0;
         aBoolean_6136 = var1;
         anInt_6137 = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }

   final void method3898(Class240_Sub41 var1, int var2) {
      int var3 = var2 >> 5;
      Class240_Sub41 var4 = this.aClass240_Sub41Array_6162[var3];
      if(var4 == null) {
         this.aClass240_Sub41Array_6145[var3] = var1;
      } else {
         var4.aClass240_Sub41_7566 = var1;
      }

      this.aClass240_Sub41Array_6162[var3] = var1;
      var1.anInt_7565 = var2;
   }

   public final synchronized void method3899() {
      this.aBoolean_6140 = true;

      try {
         this.method3907();
      } catch (Exception var2) {
         this.method3906(false);
         this.aLong_6149 = Class373.getCurrentTime((short)25040) + 2000L;
      }

   }

   final synchronized void method3900(boolean var1) {
      if(aClass290_6138 != null) {
         boolean var2 = true;

         for(int var3 = 0; var3 < 2; ++var3) {
            if(var1 || aClass290_6138.aClass316Array_5912[var3] == this) {
               aClass290_6138.aClass316Array_5912[var3] = null;
            }

            if(aClass290_6138.aClass316Array_5912[var3] != null) {
               var2 = false;
            }
         }

         if(var2) {
            aClass290_6138.aBoolean_5911 = true;

            while(aClass290_6138.aBoolean_5910) {
               RSInterface.method1724(50L);
            }

            aClass290_6138 = null;
         }
      }

   }

   final void method3901(int var1) {
      this.anInt_6144 -= var1;
      if(this.anInt_6144 < 0) {
         this.anInt_6144 = 0;
      }

      if(this.aClass240_Sub41_6143 != null) {
         this.aClass240_Sub41_6143.method4935(var1);
      }

   }

   static final void method3902(Class240_Sub41 var0) {
      var0.aBoolean_7568 = false;
      if(var0.aClass240_Sub7_7567 != null) {
         var0.aClass240_Sub7_7567.anInt_6769 = 0;
      }

      for(Class240_Sub41 var1 = var0.method4936(); var1 != null; var1 = var0.method4931()) {
         method3902(var1);
      }

   }

   void method3903(Component var1) throws Exception {}

   void method3904(int var1) throws Exception {}

   void method3905() {
      this.method3900(true);
      this.anIntArray_6141 = null;
      this.aBoolean_6142 = true;
      aBoolean_6148 = true;
   }

   void method3906(boolean var1) {}

   void method3907() throws Exception {}

   final void method3908(int[] var1, int var2) {
      int var3 = var2;
      if(aBoolean_6136) {
         var3 = var2 << 1;
      }

      Arrays.fill(var1, 0, var3, 0);
      this.anInt_6144 -= var2;
      if(this.aClass240_Sub41_6143 != null && this.anInt_6144 <= 0) {
         this.anInt_6144 += anInt_6135 >> 4;
         method3902(this.aClass240_Sub41_6143);
         this.method3898(this.aClass240_Sub41_6143, this.aClass240_Sub41_6143.method4932());
         int var4 = 0;
         int var5 = 255;

         int var6;
         Class240_Sub41 var10;
         label101:
         for(var6 = 7; var5 != 0; --var6) {
            int var7;
            int var8;
            if(var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  Class240_Sub41 var11 = this.aClass240_Sub41Array_6145[var7];

                  while(var11 != null) {
                     Class240_Sub7 var12 = var11.aClass240_Sub7_7567;
                     if(var12 != null && var12.anInt_6769 > var8) {
                        var5 |= 1 << var7;
                        var10 = var11;
                        var11 = var11.aClass240_Sub41_7566;
                     } else {
                        var11.aBoolean_7568 = true;
                        int var13 = var11.method4933();
                        var4 += var13;
                        if(var12 != null) {
                           var12.anInt_6769 += var13;
                        }

                        if(var4 >= this.anInt_6161) {
                           break label101;
                        }

                        Class240_Sub41 var14 = var11.method4936();
                        if(var14 != null) {
                           for(int var15 = var11.anInt_7565; var14 != null; var14 = var11.method4931()) {
                              this.method3898(var14, var15 * var14.method4932() >> 8);
                           }
                        }

                        Class240_Sub41 var18 = var11.aClass240_Sub41_7566;
                        var11.aClass240_Sub41_7566 = null;
                        if(var10 == null) {
                           this.aClass240_Sub41Array_6145[var7] = var18;
                        } else {
                           var10.aClass240_Sub41_7566 = var18;
                        }

                        if(var18 == null) {
                           this.aClass240_Sub41Array_6162[var7] = var10;
                        }

                        var11 = var18;
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            Class240_Sub41 var16 = this.aClass240_Sub41Array_6145[var6];
            Class240_Sub41[] var17 = this.aClass240_Sub41Array_6145;
            this.aClass240_Sub41Array_6162[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.aClass240_Sub41_7566;
               var16.aClass240_Sub41_7566 = null;
            }
         }
      }

      if(this.anInt_6144 < 0) {
         this.anInt_6144 = 0;
      }

      if(this.aClass240_Sub41_6143 != null) {
         this.aClass240_Sub41_6143.method4937(var1, 0, var2);
      }

      this.aLong_6139 = Class373.getCurrentTime((short)15124);
   }

   public final synchronized void method3909() {
      if(!this.aBoolean_6142) {
         long var1 = Class373.getCurrentTime((short)25955);

         try {
            if(var1 > this.aLong_6139 + 6000L) {
               this.aLong_6139 = var1 - 6000L;
            }

            while(var1 > this.aLong_6139 + 5000L) {
               this.method3901(256);
               this.aLong_6139 += (long)(256000 / anInt_6135);
               var1 = Class373.getCurrentTime((short)19353);
            }
         } catch (Exception var6) {
            this.aLong_6139 = var1;
         }

         if(this.anIntArray_6141 != null) {
            try {
               if(this.aLong_6149 != 0L) {
                  if(var1 < this.aLong_6149) {
                     return;
                  }

                  this.method3904(this.anInt_6146);
                  this.aLong_6149 = 0L;
                  this.aBoolean_6140 = true;
               }

               int var3 = this.method3910();
               if(this.anInt_6152 - var3 > this.anInt_6150) {
                  this.anInt_6150 = this.anInt_6152 - var3;
               }

               int var4 = this.anInt_6147 + this.anInt_6154;
               if(var4 + 256 > 16384) {
                  var4 = 16128;
               }

               if(var4 + 256 > this.anInt_6146) {
                  this.anInt_6146 += 1024;
                  if(this.anInt_6146 > 16384) {
                     this.anInt_6146 = 16384;
                  }

                  this.method3906(false);
                  this.method3904(this.anInt_6146);
                  var3 = 0;
                  this.aBoolean_6140 = true;
                  if(var4 + 256 > this.anInt_6146) {
                     var4 = this.anInt_6146 - 256;
                     this.anInt_6154 = var4 - this.anInt_6147;
                  }
               }

               while(var3 < var4) {
                  this.method3908(this.anIntArray_6141, 256);
                  this.method3913();
                  var3 += 256;
               }

               if(var1 > this.aLong_6153) {
                  if(!this.aBoolean_6140) {
                     if(this.anInt_6150 == 0 && this.anInt_6134 == 0) {
                        this.method3906(false);
                        this.aLong_6149 = var1 + 2000L;
                        return;
                     }

                     this.anInt_6154 = Math.min(this.anInt_6134, this.anInt_6150);
                     this.anInt_6134 = this.anInt_6150;
                  } else {
                     this.aBoolean_6140 = false;
                  }

                  this.anInt_6150 = 0;
                  this.aLong_6153 = var1 + 2000L;
               }

               this.anInt_6152 = var3;
            } catch (Exception var5) {
               this.method3906(false);
               this.aLong_6149 = var1 + 2000L;
            }

         }
      }
   }

   int method3910() throws Exception {
      return this.anInt_6146;
   }

   public final synchronized void method3911() {
      this.method3900(false);
      this.method3906(true);
      this.anIntArray_6141 = null;
      this.aBoolean_6142 = true;
   }

   public final synchronized void method3912(Class240_Sub41 var1) {
      this.aClass240_Sub41_6143 = var1;
   }

   void method3913() throws Exception {}
}
