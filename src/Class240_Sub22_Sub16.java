
public class Class240_Sub22_Sub16 extends Class240_Sub22 {

   int[] anIntArray_3690;
   static Sprite[] hintHeadIconsSprites;
   Class490 aClass490_3692;
   int[][] anIntArrayArray_3693;
   public int[] anIntArray_3694;
   public boolean aBoolean_3695 = true;
   String[] aStringArray_3696;


   public void method2676(ByteArrayDataNode var1, int[] var2, int var3) {
      if(null != this.anIntArray_3690) {
         for(int var4 = 0; var4 < this.anIntArray_3690.length && var4 < var2.length; ++var4) {
            int var5 = this.method2682(var4, (byte)127).anInt_9677 * -376718181;
            if(var5 > 0) {
               var1.method4468((long)var2[var4], var5, 2047701604);
            }
         }

      }
   }

   void method2677(ByteArrayDataNode var1, byte var2) {
      while(true) {
         int var3 = var1.readByte(146440858);
         if(var3 == 0) {
            return;
         }

         this.method2678(var1, var3, 290366199);
      }
   }

   void method2678(ByteArrayDataNode var1, int var2, int var3) {
      if(1 == var2) {
         this.aStringArray_3696 = Class136.method1799(var1.method4485(672903665), '<', (byte)62);
      } else {
         int var4;
         int var5;
         if(var2 == 2) {
            var4 = var1.readByte(1434221253);
            this.anIntArray_3694 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArray_3694[var5] = var1.readShort(1557172043);
            }
         } else if(3 == var2) {
            var4 = var1.readByte(981632982);
            this.anIntArray_3690 = new int[var4];
            this.anIntArrayArray_3693 = new int[var4][];

            for(var5 = 0; var5 < var4; ++var5) {
               int var6 = var1.readShort(1284175237);
               Class577 var7 = NodeList.method5818(var6, 147588577);
               if(var7 != null) {
                  this.anIntArray_3690[var5] = var6;
                  this.anIntArrayArray_3693[var5] = new int[var7.anInt_9669 * -1781795067];

                  for(int var8 = 0; var8 < -1781795067 * var7.anInt_9669; ++var8) {
                     this.anIntArrayArray_3693[var5][var8] = var1.readShort(651759141);
                  }
               }
            }
         } else if(4 == var2) {
            this.aBoolean_3695 = false;
         }
      }

   }

   public String method2679(ByteArrayDataNode var1, int var2) {
      StringBuilder var3 = new StringBuilder(80);
      if(null != this.anIntArray_3690) {
         for(int var4 = 0; var4 < this.anIntArray_3690.length; ++var4) {
            var3.append(this.aStringArray_3696[var4]);
            var3.append(this.aClass490_3692.method5749(this.method2682(var4, (byte)100), this.anIntArrayArray_3693[var4], var1.method4483(NodeList.method5818(this.anIntArray_3690[var4], 147588577).anInt_9681 * -966135903, (byte)47)));
         }
      }

      var3.append(this.aStringArray_3696[this.aStringArray_3696.length - 1]);
      return var3.toString();
   }

   public String method2680(int var1) {
      StringBuilder var2 = new StringBuilder(80);
      if(null == this.aStringArray_3696) {
         return "";
      } else {
         var2.append(this.aStringArray_3696[0]);

         for(int var3 = 1; var3 < this.aStringArray_3696.length; ++var3) {
            for(int var4 = 0; var4 < 3; ++var4) {
               var2.append('.');
            }

            var2.append(this.aStringArray_3696[var3]);
         }

         return var2.toString();
      }
   }

   public int method2681(int var1) {
      return this.anIntArray_3690 == null?0:this.anIntArray_3690.length;
   }

   public Class577 method2682(int var1, byte var2) {
      return null != this.anIntArray_3690 && var1 >= 0 && var1 <= this.anIntArray_3690.length?NodeList.method5818(this.anIntArray_3690[var1], 147588577):null;
   }

   public int method2683(int var1, int var2, int var3) {
      return this.anIntArray_3690 != null && var1 >= 0 && var1 <= this.anIntArray_3690.length?(this.anIntArrayArray_3693[var1] != null && var2 >= 0 && var2 <= this.anIntArrayArray_3693[var1].length?this.anIntArrayArray_3693[var1][var2]:-1):-1;
   }

   void method2684(short var1) {
      if(this.anIntArray_3694 != null) {
         for(int var2 = 0; var2 < this.anIntArray_3694.length; ++var2) {
            this.anIntArray_3694[var2] |= '\u8000';
         }
      }

   }

}
