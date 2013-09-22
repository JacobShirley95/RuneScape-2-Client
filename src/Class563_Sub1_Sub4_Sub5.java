
public class Class563_Sub1_Sub4_Sub5 extends PositionEntity implements Class218 {

   boolean aBoolean_7908;
   final byte aByte_7909;
   Class240_Sub22_Sub7 aClass240_Sub22_Sub7_7910;
   Class256 aClass256_7911;
   final byte aByte_7912;
   Class529 aClass529_7913;
   Model aClass165_7914;
   final boolean aBoolean_7915;
   boolean aBoolean_7916;
   final int anInt_7917;
   boolean aBoolean_7918;


   boolean method4721(int var1) {
      return this.aClass165_7914 != null?!this.aClass165_7914.method2051():true;
   }

   public int method4732(int var1) {
      return null != this.aClass165_7914?this.aClass165_7914.method2041():0;
   }

   Class268 method4719(Renderer var1, int var2) {
      if(null == this.aClass165_7914) {
         return null;
      } else {
         Viewport var3 = this.getTransform();
         Class268 var4 = Class104_Sub5.method3286(this.aBoolean_7916, 2060644571);
         this.aClass165_7914.method2069(var3, this.aClass92Array_6938[0], 0);
         return var4;
      }
   }

   Class477 method5161(Renderer var1, int var2, boolean var3, int var4) {
      Class534 var5 = this.aClass529_7913.method6015(this.anInt_7917 * -81088481, (byte)1);
      Plane var6;
      Plane var7;
      if(this.aBoolean_7915) {
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
      return var5.method6045(var1, var2, Class495.aClass495_9060.anInt_9062 * -1965975883 != this.aByte_7912?this.aByte_7912:-1965975883 * Class495.aClass495_9054.anInt_9062, this.aByte_7912 == Class495.aClass495_9060.anInt_9062 * -1965975883?this.aByte_7909 + 4:this.aByte_7909, var6, var7, (int)var8.floatX, (int)var8.floatY, (int)var8.floatZ, var3, (Class532)null, -455972723);
   }

   public Class256 method4735(Renderer var1, int var2) {
      GameCoord var3 = this.method6203().gameCoord;
      if(null == this.aClass256_7911) {
         this.aClass256_7911 = Class240_Sub16.method4654((int)var3.floatX, (int)var3.floatY, (int)var3.floatZ, this.method5172(var1, 0, (byte)-4), -678035568);
      }

      return this.aClass256_7911;
   }

   boolean method4729(Renderer var1, int var2, int var3, byte var4) {
      Model var5 = this.method5172(var1, 131072, (byte)64);
      if(null != var5) {
         Viewport var6 = this.getTransform();
         return var5.method2050(var2, var3, var6, false, 0);
      } else {
         return false;
      }
   }

   boolean method4731(int var1) {
      return this.aBoolean_7908;
   }

   public Class563_Sub1_Sub4_Sub5(WorldObjects var1, Renderer var2, Class529 var3, Class534 var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, int var12, int var13, int var14, int var15, int var16, boolean var17) {
      super(var1, var5, var6, var7, var8, var9, var11, var12, var13, var14, 1 == -1248943027 * var4.anInt_9413, Class572.method6277(var15, var16, (byte)-10));
      this.aClass529_7913 = var3;
      this.anInt_7917 = var4.anInt_9367 * -1180172579;
      this.aByte_6942 = (byte)var6;
      this.aBoolean_7915 = var10;
      this.aByte_7912 = (byte)var15;
      this.aByte_7909 = (byte)var16;
      this.aBoolean_7916 = 166485479 * var4.anInt_9380 != 0 && !var10;
      this.aBoolean_7908 = var17;
      this.aBoolean_7918 = var2.method1964() && var4.aBoolean_9429 && !this.aBoolean_7915 && Class104_Sub21.renderSettings.aClass540_Sub32_7303.method4388(716737092) != 0;
      int var18 = 2048;
      if(this.aBoolean_7908) {
         var18 |= 65536;
      }

      if(var4.aBoolean_9437) {
         var18 |= 524288;
      }

      Class477 var19 = this.method5161(var2, var18, this.aBoolean_7918, 551858749);
      if(var19 != null) {
         this.aClass165_7914 = (Model)var19.anObject_8743;
         this.aClass240_Sub22_Sub7_7910 = (Class240_Sub22_Sub7)var19.anObject_8742;
         if(this.aBoolean_7908 || var4.aBoolean_9437) {
            this.aClass165_7914 = this.aClass165_7914.copy((byte)0, var18, false);
            if(var4.aBoolean_9437) {
               Class303 var20 = client.aClass296_348.method3748(-1474099116);
               this.aClass165_7914.method2049(var20.anInt_6013 * -662619837, var20.anInt_6011 * -1437615063, var20.anInt_6012 * -1107082823, -706421525 * var20.anInt_6010);
            }
         }
      }

      this.method4727(1, -1169202330);
   }

   void method4723(int var1) {
      this.aBoolean_7908 = false;
      if(this.aClass165_7914 != null) {
         this.aClass165_7914.method2042(this.aClass165_7914.method2015() & -65537);
      }

   }

   public int method2723(byte var1) {
      return this.anInt_7917 * -81088481;
   }

   public int method2730(int var1) {
      return this.aByte_7912;
   }

   public int method2718(int var1) {
      return this.aByte_7909;
   }

   public void method2726(int var1) {
      if(this.aClass165_7914 != null) {
         this.aClass165_7914.method2016();
      }

   }

   public void method2721(Renderer var1, int var2) {
      Class240_Sub22_Sub7 var3 = null;
      if(null == this.aClass240_Sub22_Sub7_7910 && this.aBoolean_7918) {
         Class477 var4 = this.method5161(var1, 262144, true, 743329041);
         var3 = (Class240_Sub22_Sub7)(var4 != null?var4.anObject_8742:null);
      } else {
         var3 = this.aClass240_Sub22_Sub7_7910;
         this.aClass240_Sub22_Sub7_7910 = null;
      }

      GameCoord var5 = this.method6203().gameCoord;
      if(null != var3) {
         this.worldObjects.method3436(var3, this.aByte_6942, (int)var5.floatX, (int)var5.floatZ, (boolean[])null, 901821875);
      }

   }

   public int method5171(short var1) {
      return null != this.aClass165_7914?this.aClass165_7914.method2037() / 4:15;
   }

   Model method5172(Renderer var1, int var2, byte var3) {
      if(null != this.aClass165_7914 && var1.method1940(this.aClass165_7914.method2015(), var2) == 0) {
         return this.aClass165_7914;
      } else {
         Class477 var4 = this.method5161(var1, var2, false, -202384918);
         return var4 != null?(Model)var4.anObject_8743:null;
      }
   }

   public boolean method2735(byte var1) {
      return this.aBoolean_7918;
   }

   void method4724(Renderer var1) {}

   public void method2722(Renderer var1, int var2) {
      Class240_Sub22_Sub7 var3 = null;
      if(this.aClass240_Sub22_Sub7_7910 == null && this.aBoolean_7918) {
         Class477 var4 = this.method5161(var1, 262144, true, 106098356);
         var3 = (Class240_Sub22_Sub7)(var4 != null?var4.anObject_8742:null);
      } else {
         var3 = this.aClass240_Sub22_Sub7_7910;
         this.aClass240_Sub22_Sub7_7910 = null;
      }

      GameCoord var5 = this.method6203().gameCoord;
      if(null != var3) {
         this.worldObjects.method3415(var3, this.aByte_6942, (int)var5.floatX, (int)var5.floatZ, (boolean[])null, (byte)-52);
      }

   }

   boolean method4722(byte var1) {
      return null != this.aClass165_7914?this.aClass165_7914.method2058():false;
   }

   void method4720(Renderer var1, Class563_Sub1 var2, int var3, int var4, int var5, boolean var6, int var7) {
      if(var2 instanceof Class563_Sub1_Sub5_Sub1) {
         Class563_Sub1_Sub5_Sub1 var8 = (Class563_Sub1_Sub5_Sub1)var2;
         if(null != this.aClass165_7914 && null != var8.aClass165_7861) {
            this.aClass165_7914.method2053(var8.aClass165_7861, var3, var4, var5, var6);
         }
      } else if(var2 instanceof Class563_Sub1_Sub4_Sub5) {
         Class563_Sub1_Sub4_Sub5 var9 = (Class563_Sub1_Sub4_Sub5)var2;
         if(null != this.aClass165_7914 && null != var9.aClass165_7914) {
            this.aClass165_7914.method2053(var9.aClass165_7914, var3, var4, var5, var6);
         }
      }

   }
}
