
public class Class563_Sub1_Sub5_Sub1 extends Class563_Sub1_Sub5 implements Class218 {

   boolean aBoolean_7852;
   final boolean aBoolean_7853;
   boolean aBoolean_7854;
   Class529 aClass529_7855;
   Class240_Sub22_Sub7 aClass240_Sub22_Sub7_7856;
   Class256 aClass256_7857;
   final int anInt_7858;
   final byte aByte_7859;
   final byte aByte_7860;
   Model aClass165_7861;
   static final int[] anIntArray_7862 = new int[]{1, 2, 4, 8};
   boolean aBoolean_7863;
   static final int[] anIntArray_7864 = new int[]{16, 32, 64, 128};


   boolean method4721(int var1) {
      return null != this.aClass165_7861?!this.aClass165_7861.method2051():true;
   }

   boolean method4722(byte var1) {
      return null != this.aClass165_7861?this.aClass165_7861.method2058():false;
   }

   public int method4732(int var1) {
      return this.aClass165_7861 != null?this.aClass165_7861.method2041():0;
   }

   public void method2726(int var1) {
      if(null != this.aClass165_7861) {
         this.aClass165_7861.method2016();
      }

   }

   Class477 method5083(Renderer var1, int var2, boolean var3, int var4) {
      Class534 var5 = this.aClass529_7855.method6015(-734646473 * this.anInt_7858, (byte)1);
      Plane var6;
      Plane var7;
      if(this.aBoolean_7853) {
         var6 = this.worldObjects.aClass171Array_4492[this.aByte_6942];
         var7 = this.worldObjects.aClass171Array_4486[0];
      } else {
         var6 = this.worldObjects.aClass171Array_4486[this.aByte_6942];
         if(this.aByte_6942 < 3) {
            var7 = this.worldObjects.aClass171Array_4486[1 + this.aByte_6942];
         } else {
            var7 = null;
         }
      }

      GameCoord var8 = this.method6203().gameCoord;
      return var5.method6045(var1, var2, this.aByte_7860, this.aByte_7859, var6, var7, (int)var8.floatX, (int)var8.floatY, (int)var8.floatZ, var3, (Class532)null, -455972723);
   }

   public boolean method2735(byte var1) {
      return this.aBoolean_7852;
   }

   Model method5085(Renderer var1, int var2, int var3) {
      if(null != this.aClass165_7861 && var1.method1940(this.aClass165_7861.method2015(), var2) == 0) {
         return this.aClass165_7861;
      } else {
         Class477 var4 = this.method5083(var1, var2, false, -1278757251);
         return var4 != null?(Model)var4.anObject_8743:null;
      }
   }

   void method4724(Renderer var1) {}

   void method4720(Renderer var1, Class563_Sub1 var2, int var3, int var4, int var5, boolean var6, int var7) {
      if(var2 instanceof Class563_Sub1_Sub5_Sub1) {
         Class563_Sub1_Sub5_Sub1 var8 = (Class563_Sub1_Sub5_Sub1)var2;
         if(null != this.aClass165_7861 && null != var8.aClass165_7861) {
            this.aClass165_7861.method2053(var8.aClass165_7861, var3, var4, var5, var6);
         }
      } else if(var2 instanceof Class563_Sub1_Sub4_Sub5) {
         Class563_Sub1_Sub4_Sub5 var9 = (Class563_Sub1_Sub4_Sub5)var2;
         if(null != this.aClass165_7861 && var9.aClass165_7914 != null) {
            this.aClass165_7861.method2053(var9.aClass165_7914, var3, var4, var5, var6);
         }
      }

   }

   boolean method4731(int var1) {
      return this.aBoolean_7863;
   }

   public Class563_Sub1_Sub5_Sub1(WorldObjects var1, Renderer var2, Class529 var3, Class534 var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, int var12, boolean var13) {
      super(var1, var7, var8, var9, var5, var6, Class187_Sub2.method7583(var11, var12, 2016221660));
      this.aClass529_7855 = var3;
      this.anInt_7858 = -784229163 * var4.anInt_9367;
      this.aBoolean_7853 = var10;
      this.aByte_7860 = (byte)var11;
      this.aByte_7859 = (byte)var12;
      this.aBoolean_7854 = 0 != 166485479 * var4.anInt_9380 && !var10;
      this.aBoolean_7863 = var13;
      this.aBoolean_7852 = var2.method1964() && var4.aBoolean_9429 && !this.aBoolean_7853 && Class104_Sub21.renderSettings.aClass540_Sub32_7303.method4388(1255382418) != 0;
      int var14 = 2048;
      if(this.aBoolean_7863) {
         var14 |= 65536;
      }

      if(var4.aBoolean_9437) {
         var14 |= 524288;
      }

      Class477 var15 = this.method5083(var2, var14, this.aBoolean_7852, -1278757251);
      if(null != var15) {
         this.aClass165_7861 = (Model)var15.anObject_8743;
         this.aClass240_Sub22_Sub7_7856 = (Class240_Sub22_Sub7)var15.anObject_8742;
         if(this.aBoolean_7863 || var4.aBoolean_9437) {
            this.aClass165_7861 = this.aClass165_7861.copy((byte)0, var14, false);
            if(var4.aBoolean_9437) {
               Class303 var16 = client.aClass296_348.method3748(-351897645);
               this.aClass165_7861.method2049(var16.anInt_6013 * -662619837, -1437615063 * var16.anInt_6011, var16.anInt_6012 * -1107082823, var16.anInt_6010 * -706421525);
            }
         }
      }

      this.method4727(1, -1500144140);
   }

   public int method2730(int var1) {
      return this.aByte_7860;
   }

   public int method2718(int var1) {
      return this.aByte_7859;
   }

   public Class256 method4735(Renderer var1, int var2) {
      GameCoord var3 = this.method6203().gameCoord;
      if(this.aClass256_7857 == null) {
         this.aClass256_7857 = Class240_Sub16.method4654((int)var3.floatX, (int)var3.floatY, (int)var3.floatZ, this.method5085(var1, 0, 150466281), -673445798);
      }

      return this.aClass256_7857;
   }

   boolean method4729(Renderer var1, int var2, int var3, byte var4) {
      Model var5 = this.method5085(var1, 131072, 150466281);
      if(null != var5) {
         Viewport var6 = this.getTransform();
         return var5.method2050(var2, var3, var6, false, 0);
      } else {
         return false;
      }
   }

   public void method2721(Renderer var1, int var2) {
      Class240_Sub22_Sub7 var3 = null;
      if(null == this.aClass240_Sub22_Sub7_7856 && this.aBoolean_7852) {
         Class477 var4 = this.method5083(var1, 262144, true, -1278757251);
         var3 = (Class240_Sub22_Sub7)(var4 != null?var4.anObject_8742:null);
      } else {
         var3 = this.aClass240_Sub22_Sub7_7856;
         this.aClass240_Sub22_Sub7_7856 = null;
      }

      GameCoord var5 = this.method6203().gameCoord;
      if(var3 != null) {
         this.worldObjects.method3436(var3, this.aByte_6942, (int)var5.floatX, (int)var5.floatZ, (boolean[])null, 901821875);
      }

   }

   public void method2722(Renderer var1, int var2) {
      Class240_Sub22_Sub7 var3 = null;
      if(this.aClass240_Sub22_Sub7_7856 == null && this.aBoolean_7852) {
         Class477 var4 = this.method5083(var1, 262144, true, -1278757251);
         var3 = (Class240_Sub22_Sub7)(var4 != null?var4.anObject_8742:null);
      } else {
         var3 = this.aClass240_Sub22_Sub7_7856;
         this.aClass240_Sub22_Sub7_7856 = null;
      }

      GameCoord var5 = this.method6203().gameCoord;
      if(null != var3) {
         this.worldObjects.method3415(var3, this.aByte_6942, (int)var5.floatX, (int)var5.floatZ, (boolean[])null, (byte)-110);
      }

   }

   void method4723(int var1) {
      this.aBoolean_7863 = false;
      if(null != this.aClass165_7861) {
         this.aClass165_7861.method2042(this.aClass165_7861.method2015() & -65537);
      }

   }

   public int method2723(byte var1) {
      return this.anInt_7858 * -734646473;
   }

   Class268 method4719(Renderer var1, int var2) {
      if(this.aClass165_7861 == null) {
         return null;
      } else {
         Viewport var3 = this.getTransform();
         Class268 var4 = Class104_Sub5.method3286(this.aBoolean_7854, 1833552428);
         this.aClass165_7861.method2069(var3, this.aClass92Array_6938[0], 0);
         return var4;
      }
   }

   static final void method5098(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class275.method3607(var3, var4, var0, 64982450);
   }

   public static Class116 method5099(int var0, int var1) {
      return var0 == -1835220801 * Class116.aClass116_2086.anInt_2085?Class116.aClass116_2086:(Class116.aClass116_2089.anInt_2085 * -1835220801 == var0?Class116.aClass116_2089:(var0 == Class116.aClass116_2087.anInt_2085 * -1835220801?Class116.aClass116_2087:(var0 == Class116.aClass116_2088.anInt_2085 * -1835220801?Class116.aClass116_2088:null)));
   }

   static final void method5100(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class625.method6654(var3, var4, var0, (byte)-77);
   }
}
