
public abstract class Class133 {

   String aString_2595;
   Class125[] aClass125Array_2596;
   Class51 aClass51_2597;
   Class51 aClass51_2598;
   int anInt_2599;
   protected int anInt_2600 = -299379563;
   static final Class42 aClass42_2601 = new Class127();
   int anInt_2602;
   public static Class565 aClass565_2603;


   public final void method1725(Class240_Sub50_Sub1 var1, float var2, float var3, int var4) {
      this.aClass125Array_2596[this.anInt_2600 * -1962301117].method1590(var1, var2, var3);
   }

   public abstract void method1726();

   public final void method1727(int var1, ArrayViewport var2, byte var3) {
      this.aClass125Array_2596[this.anInt_2600 * -1962301117].method1598(var1, var2);
   }

   public abstract boolean method1728();

   abstract Class125 method1729(Renderer_Sub3 var1, Class89 var2);

   public final int method1730(int var1) {
      return this.aClass125Array_2596.length;
   }

   public final Class125 method1731(int var1, int var2) {
      return this.aClass125Array_2596[var1];
   }

   public int method1732(Class125 var1, byte var2) {
      for(int var3 = 0; var3 < this.aClass125Array_2596.length; ++var3) {
         if(this.aClass125Array_2596[var3] == var1) {
            return var3;
         }
      }

      return -1;
   }

   public Class125 method1733(int var1) {
      Class125[] var2 = this.aClass125Array_2596;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Class125 var4 = var2[var3];
         if(var4.method1588()) {
            return var4;
         }
      }

      return null;
   }

   public abstract boolean method1734(Class125 var1);

   public final Class125 method1735(int var1) {
      return -1962301117 * this.anInt_2600 >= 0?this.aClass125Array_2596[this.anInt_2600 * -1962301117]:null;
   }

   public final int method1736(int var1) {
      return -1962301117 * this.anInt_2600;
   }

   abstract Class240_Sub50_Sub1 method1737(Class120 var1);

   public final void method1738(Class240_Sub50_Sub1 var1, float var2, int var3) {
      this.aClass125Array_2596[this.anInt_2600 * -1962301117].method1589(var1, var2);
   }

   Class133(Renderer_Sub3 var1, Class113 var2) {
      this.aString_2595 = var2.aString_2067;
      this.anInt_2599 = -1791906507 * var2.aClass120Array_2069.length;
      this.aClass51_2597 = new Class51(-1934951139 * this.anInt_2599, aClass42_2601);

      int var3;
      for(var3 = 0; var3 < -1934951139 * this.anInt_2599; ++var3) {
         this.aClass51_2597.method515(var3, var2.aClass120Array_2069[var3].aString_2112, this.method1737(var2.aClass120Array_2069[var3]), (byte)-45);
      }

      this.anInt_2602 = var2.aClass120Array_2063.length * 464647757;
      this.aClass51_2598 = new Class51(this.anInt_2602 * 1546662533, aClass42_2601);

      for(var3 = 0; var3 < 1546662533 * this.anInt_2602; ++var3) {
         this.aClass51_2598.method515(var3, var2.aClass120Array_2063[var3].aString_2112, this.method1737(var2.aClass120Array_2063[var3]), (byte)-90);
      }

      this.aClass125Array_2596 = new Class125[var2.aClass89Array_2068.length];

      for(var3 = 0; var3 < var2.aClass89Array_2068.length; ++var3) {
         this.aClass125Array_2596[var3] = this.method1729(var1, var2.aClass89Array_2068[var3]);
      }

   }

   public final void method1739(Class240_Sub50_Sub1 var1, float var2, float var3, float var4, int var5) {
      this.aClass125Array_2596[-1962301117 * this.anInt_2600].method1591(var1, var2, var3, var4);
   }

   public final void method1740(Class240_Sub50_Sub1 var1, float var2, float var3, float var4, float var5, int var6) {
      this.aClass125Array_2596[-1962301117 * this.anInt_2600].method1592(var1, var2, var3, var4, var5);
   }

   public final void method1741(Class240_Sub50_Sub1 var1, GameCoord var2, int var3) {
      this.aClass125Array_2596[this.anInt_2600 * -1962301117].method1591(var1, var2.floatX, var2.floatY, var2.floatZ);
   }

   public final void method1742(Class240_Sub50_Sub1 var1, Class356 var2, int var3) {
      this.aClass125Array_2596[-1962301117 * this.anInt_2600].method1592(var1, var2.aFloat_6767, var2.aFloat_6766, var2.aFloat_6768, var2.aFloat_6765);
   }

   public final void method1743(Class240_Sub50_Sub1 var1, float[] var2, int var3) {
      this.aClass125Array_2596[-1962301117 * this.anInt_2600].method1593(var1, var2, var2.length);
   }

   public final void method1744(Class240_Sub50_Sub1 var1, int var2, int var3) {
      float var4 = (float)(var2 >> 16 & 255) / 255.0F;
      float var5 = (float)(var2 >> 8 & 255) / 255.0F;
      float var6 = (float)(var2 & 255) / 255.0F;
      float var7 = (float)(var2 >> 24 & 255) / 255.0F;
      this.method1740(var1, var4, var5, var6, var7, 779573251);
   }

   public final void method1745(int var1, GameCoord var2, int var3) {
      this.aClass125Array_2596[this.anInt_2600 * -1962301117].method1600(var1, var2.floatX, var2.floatY, var2.floatZ);
   }

   public final void method1746(Class240_Sub50_Sub1 var1, ArrayViewport var2, byte var3) {
      this.aClass125Array_2596[this.anInt_2600 * -1962301117].method1587(var1, var2);
   }

   public final void method1747(Class240_Sub50_Sub1 var1, int var2, Class403 var3, int var4) {
      this.aClass125Array_2596[-1962301117 * this.anInt_2600].method1595(var1, var2, var3);
   }

   public final void method1748(int var1, float var2, float var3, float var4, float var5, int var6) {
      this.aClass125Array_2596[this.anInt_2600 * -1962301117].method1596(var1, var2, var3, var4, var5);
   }

   public String method1749(byte var1) {
      return this.aString_2595;
   }

   public final void method1750(int var1, float[] var2, int var3, int var4) {
      this.aClass125Array_2596[-1962301117 * this.anInt_2600].method1594(var1, var2, var3);
   }

   public final void method1751(int var1, ArrayViewport var2, byte var3) {
      this.aClass125Array_2596[this.anInt_2600 * -1962301117].method1597(var1, var2);
   }

   public final void method1752(int var1, ArrayViewport var2, int var3) {
      this.aClass125Array_2596[this.anInt_2600 * -1962301117].method1603(var1, var2);
   }

   public Class240_Sub50_Sub1 method1753(String var1) throws Exception_Sub6_Sub1 {
      Class240_Sub50_Sub1 var3 = (Class240_Sub50_Sub1)this.aClass51_2597.method514(var1, (byte)-39);
      if(var3 == null) {
         throw new Exception_Sub6_Sub1(var1);
      } else {
         return var3;
      }
   }

   public int method1754(byte var1) {
      return this.anInt_2602 * 1546662533;
   }

   public Class240_Sub50_Sub1 method1755(int var1, byte var2) {
      return (Class240_Sub50_Sub1)this.aClass51_2598.method513(var1, (byte)36);
   }

   public int method1756(int var1) {
      return this.anInt_2599 * -1934951139;
   }

   public Class240_Sub50_Sub1 method1757(int var1, byte var2) {
      return (Class240_Sub50_Sub1)this.aClass51_2597.method513(var1, (byte)124);
   }

   public final void method1758(int var1, int var2, Class403 var3, byte var4) {
      this.aClass125Array_2596[-1962301117 * this.anInt_2600].method1599(var1, var2, var3);
   }

   public final void method1759(int var1, float var2, float var3, float var4, byte var5) {
      this.aClass125Array_2596[this.anInt_2600 * -1962301117].method1600(var1, var2, var3, var4);
   }

   public Class125 method1760(String var1) throws Exception_Sub6_Sub2 {
      Class125[] var3 = this.aClass125Array_2596;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Class125 var5 = var3[var4];
         String var6 = var5.method1601(677569669);
         if(var6 != null && var6.equals(var1)) {
            if(!var5.method1588()) {
               throw new Exception_Sub6_Sub2(var1);
            }

            return var5;
         }
      }

      throw new Exception_Sub6_Sub2(var1);
   }

   public final void method1761(Class240_Sub50_Sub1 var1, ArrayViewport var2, int var3) {
      this.aClass125Array_2596[this.anInt_2600 * -1962301117].method1602(var1, var2);
   }

   void method1762() {}

   public Class240_Sub50_Sub1 method1763(String var1, int var2) {
      return (Class240_Sub50_Sub1)this.aClass51_2598.method514(var1, (byte)-102);
   }

   public abstract void method1764();

   static final Object[] extractInterfaceData(String var0, RSInterfaceData var1, byte var2) {
      Object[] var3 = new Object[var0.length() + 1];

      int var4;
      for(var4 = var3.length - 1; var4 >= 1; --var4) {
         if(var0.charAt(var4 - 1) == 115) {
            var3[var4] = var1.stringData[(var1.stringDataIndex -= -1828074049) * 863838783];
         } else if(var0.charAt(var4 - 1) == 167) {
            var3[var4] = new Long(var1.aLongArray_9519[(var1.longTypeIndex -= -1088659337) * 973044039]);
         } else {
            var3[var4] = new Integer(var1.intTypes[(var1.intTypeIndex -= -708028207) * -831324111]);
         }
      }

      var4 = var1.intTypes[(var1.intTypeIndex -= -708028207) * -831324111];
      if(-1 != var4) {
         var3[0] = new Integer(var4);
      } else {
         var3 = null;
      }

      return var3;
   }

   static final void method1766(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class473.method5660(-2001261666).getLanguageID(-1480186967);
   }

   static final void method1767(RSInterfaceData var0, int var1) {
      Class32.method231(0, 0, -533669195 * client.aClass132_476.width, 1833812087 * client.aClass132_476.height, false, 1844434806);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.anInt_563 * -195430259;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -914495911 * client.anInt_564;
   }

   public static String addTextColour(int var0, byte var1) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }

   static final int method1769(Renderer var0, Class571 var1, int var2) {
      if(2098723055 * var1.anInt_9640 != -1) {
         return 2098723055 * var1.anInt_9640;
      } else {
         if(var1.anInt_9638 * -533682665 != -1) {
            Class183 var3 = var0.aClass163_2802.method1996(-533682665 * var1.anInt_9638, (byte)2);
            if(!var3.aBoolean_3174) {
               return var3.aShort_3118;
            }
         }

         return 768249075 * var1.anInt_9634;
      }
   }

   public static void method1770(int var0, int var1) {
      Class240_Sub25.anInt_7333 = 1831380353 * var0;
      Class240_Sub43_Sub2.aClass240_Sub43_Sub2Array_3584 = new Class240_Sub43_Sub2[var0];
      Class516.anInt_9217 = 0;
   }
}
