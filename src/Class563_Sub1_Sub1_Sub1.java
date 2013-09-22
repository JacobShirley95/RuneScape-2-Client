
public class Class563_Sub1_Sub1_Sub1 extends Class563_Sub1_Sub1 implements Class218 {

   boolean aBoolean_7875;
   Class529 aClass529_7876;
   Class240_Sub22_Sub7 aClass240_Sub22_Sub7_7877;
   Class256 aClass256_7878;
   final int anInt_7879;
   final byte aByte_7880;
   final boolean aBoolean_7881;
   boolean aBoolean_7882;
   boolean aBoolean_7883;
   Model aClass165_7884;


   boolean method4721(int var1) {
      return this.aClass165_7884 != null?!this.aClass165_7884.method2051():true;
   }

   public int method4732(int var1) {
      return null != this.aClass165_7884?this.aClass165_7884.method2041():0;
   }

   Model method5111(Renderer var1, int var2, short var3) {
      if(this.aClass165_7884 != null && var1.method1940(this.aClass165_7884.method2015(), var2) == 0) {
         return this.aClass165_7884;
      } else {
         Class477 var4 = this.method5126(var1, var2, false, -1093174668);
         return null != var4?(Model)var4.anObject_8743:null;
      }
   }

   public Class256 method4735(Renderer var1, int var2) {
      GameCoord var3 = this.method6203().gameCoord;
      if(this.aClass256_7878 == null) {
         this.aClass256_7878 = Class240_Sub16.method4654((int)var3.floatX, (int)var3.floatY, (int)var3.floatZ, this.method5111(var1, 0, (short)-31210), 11807492);
      }

      return this.aClass256_7878;
   }

   Class268 method4719(Renderer var1, int var2) {
      if(null == this.aClass165_7884) {
         return null;
      } else {
         Viewport var3 = this.getTransform();
         Class268 var4 = Class104_Sub5.method3286(this.aBoolean_7882, 1905060387);
         this.aClass165_7884.method2069(var3, this.aClass92Array_6938[0], 0);
         return var4;
      }
   }

   void method4724(Renderer var1) {}

   boolean method4731(int var1) {
      return this.aBoolean_7883;
   }

   boolean method4722(byte var1) {
      return this.aClass165_7884 != null?this.aClass165_7884.method2058():false;
   }

   public int method2718(int var1) {
      return this.aByte_7880;
   }

   public void method2726(int var1) {
      if(this.aClass165_7884 != null) {
         this.aClass165_7884.method2016();
      }

   }

   public boolean method2735(byte var1) {
      return this.aBoolean_7875;
   }

   public void method2721(Renderer var1, int var2) {
      Class240_Sub22_Sub7 var3 = null;
      if(this.aClass240_Sub22_Sub7_7877 == null && this.aBoolean_7875) {
         Class477 var4 = this.method5126(var1, 262144, true, -521987181);
         var3 = (Class240_Sub22_Sub7)(var4 != null?var4.anObject_8742:null);
      } else {
         var3 = this.aClass240_Sub22_Sub7_7877;
         this.aClass240_Sub22_Sub7_7877 = null;
      }

      GameCoord var5 = this.method6203().gameCoord;
      if(var3 != null) {
         this.worldObjects.method3436(var3, this.aByte_6942, (int)var5.floatX, (int)var5.floatZ, (boolean[])null, 901821875);
      }

   }

   public int method2730(int var1) {
      return -1965975883 * Class495.aClass495_9061.anInt_9062;
   }

   boolean method4729(Renderer var1, int var2, int var3, byte var4) {
      Model var5 = this.method5111(var1, 131072, (short)-12300);
      if(null != var5) {
         Viewport var6 = this.getTransform();
         return var5.method2050(var2, var3, var6, false, 0);
      } else {
         return false;
      }
   }

   public Class563_Sub1_Sub1_Sub1(WorldObjects var1, Renderer var2, Class529 var3, Class534 var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, boolean var12) {
      super(var1, var7, var8, var9, var5, var6, var4.anInt_9414 * -1504446669);
      this.aClass529_7876 = var3;
      this.anInt_7879 = 616358609 * var4.anInt_9367;
      this.aBoolean_7881 = var10;
      this.aByte_7880 = (byte)var11;
      this.aBoolean_7882 = 166485479 * var4.anInt_9380 != 0 && !var10;
      this.aBoolean_7883 = var12;
      this.aBoolean_7875 = var2.method1964() && var4.aBoolean_9429 && !this.aBoolean_7881 && Class104_Sub21.renderSettings.aClass540_Sub32_7303.method4388(-1529435053) != 0;
      int var13 = 2048;
      if(this.aBoolean_7883) {
         var13 |= 65536;
      }

      if(var4.aBoolean_9437) {
         var13 |= 524288;
      }

      Class477 var14 = this.method5126(var2, var13, this.aBoolean_7875, -886932150);
      if(var14 != null) {
         this.aClass165_7884 = (Model)var14.anObject_8743;
         this.aClass240_Sub22_Sub7_7877 = (Class240_Sub22_Sub7)var14.anObject_8742;
         if(this.aBoolean_7883 || var4.aBoolean_9437) {
            this.aClass165_7884 = this.aClass165_7884.copy((byte)0, var13, false);
            if(var4.aBoolean_9437) {
               Class303 var15 = client.aClass296_348.method3748(-1819264695);
               this.aClass165_7884.method2049(var15.anInt_6013 * -662619837, var15.anInt_6011 * -1437615063, -1107082823 * var15.anInt_6012, -706421525 * var15.anInt_6010);
            }
         }
      }

      this.method4727(1, -936210352);
   }

   public void method2722(Renderer var1, int var2) {
      Class240_Sub22_Sub7 var3 = null;
      if(this.aClass240_Sub22_Sub7_7877 == null && this.aBoolean_7875) {
         Class477 var4 = this.method5126(var1, 262144, true, 810903111);
         var3 = (Class240_Sub22_Sub7)(null != var4?var4.anObject_8742:null);
      } else {
         var3 = this.aClass240_Sub22_Sub7_7877;
         this.aClass240_Sub22_Sub7_7877 = null;
      }

      GameCoord var5 = this.method6203().gameCoord;
      if(var3 != null) {
         this.worldObjects.method3415(var3, this.aByte_6942, (int)var5.floatX, (int)var5.floatZ, (boolean[])null, (byte)-24);
      }

   }

   public int method2723(byte var1) {
      return this.anInt_7879 * 1543689043;
   }

   void method4723(int var1) {
      this.aBoolean_7883 = false;
      if(null != this.aClass165_7884) {
         this.aClass165_7884.method2042(this.aClass165_7884.method2015() & -65537);
      }

   }

   Class477 method5126(Renderer var1, int var2, boolean var3, int var4) {
      Class534 var5 = this.aClass529_7876.method6015(1543689043 * this.anInt_7879, (byte)1);
      Plane var6;
      Plane var7;
      if(this.aBoolean_7881) {
         var6 = this.worldObjects.aClass171Array_4492[this.aByte_6942];
         var7 = this.worldObjects.aClass171Array_4486[0];
      } else {
         var6 = this.worldObjects.aClass171Array_4486[this.aByte_6942];
         if(this.aByte_6942 < 3) {
            var7 = this.worldObjects.aClass171Array_4486[this.aByte_6942 + 1];
         } else {
            var7 = null;
         }
      }

      GameCoord var8 = this.method6203().gameCoord;
      return var5.method6045(var1, var2, -1965975883 * Class495.aClass495_9061.anInt_9062, this.aByte_7880, var6, var7, (int)var8.floatX, (int)var8.floatY, (int)var8.floatZ, var3, (Class532)null, -455972723);
   }

   void method4720(Renderer var1, Class563_Sub1 var2, int var3, int var4, int var5, boolean var6, int var7) {
      if(var2 instanceof Class563_Sub1_Sub1_Sub1) {
         Class563_Sub1_Sub1_Sub1 var8 = (Class563_Sub1_Sub1_Sub1)var2;
         if(null != this.aClass165_7884 && null != var8.aClass165_7884) {
            this.aClass165_7884.method2053(var8.aClass165_7884, var3, var4, var5, var6);
         }
      }

   }

   public static final void method5128(byte var0) {
      Class2.anImage_19 = null;
      Class370.clientFont = null;
   }
}
