
public class Class240_Sub22_Sub10 extends Class240_Sub22 {

   public char[] aCharArray_3539;
   public int[] anIntArray_3540;
   public String aString_3541;
   public int[] anIntArray_3542;
   public char[] aCharArray_3543;


   void method2603(ByteArrayDataNode var1, short var2) {
      while(true) {
         int var3 = var1.readByte(-703606286);
         if(0 == var3) {
            return;
         }

         this.method2604(var1, var3, 64692189);
      }
   }

   void method2604(ByteArrayDataNode var1, int var2, int var3) {
      if(1 == var2) {
         this.aString_3541 = var1.method4485(1378495146);
      } else {
         int var4;
         int var5;
         byte var6;
         if(2 == var2) {
            var4 = var1.readByte(1951288484);
            this.anIntArray_3540 = new int[var4];
            this.aCharArray_3543 = new char[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArray_3540[var5] = var1.readShort(-189871279);
               var6 = var1.getByte((byte)87);
               this.aCharArray_3543[var5] = 0 == var6?0:Class97.method1274(var6, 2104250302);
            }
         } else if(3 == var2) {
            var4 = var1.readByte(1658175716);
            this.anIntArray_3542 = new int[var4];
            this.aCharArray_3539 = new char[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArray_3542[var5] = var1.readShort(788374310);
               var6 = var1.getByte((byte)94);
               this.aCharArray_3539[var5] = 0 == var6?0:Class97.method1274(var6, 2055922408);
            }
         } else if(4 == var2) {
            ;
         }
      }

   }

   public int method2605(char var1, byte var2) {
      if(this.anIntArray_3540 == null) {
         return -1;
      } else {
         for(int var3 = 0; var3 < this.anIntArray_3540.length; ++var3) {
            if(this.aCharArray_3543[var3] == var1) {
               return this.anIntArray_3540[var3];
            }
         }

         return -1;
      }
   }

   public int method2606(char var1, int var2) {
      if(this.anIntArray_3542 == null) {
         return -1;
      } else {
         for(int var3 = 0; var3 < this.anIntArray_3542.length; ++var3) {
            if(var1 == this.aCharArray_3539[var3]) {
               return this.anIntArray_3542[var3];
            }
         }

         return -1;
      }
   }

   void method2607(byte var1) {
      int var2;
      if(this.anIntArray_3542 != null) {
         for(var2 = 0; var2 < this.anIntArray_3542.length; ++var2) {
            this.anIntArray_3542[var2] |= '\u8000';
         }
      }

      if(null != this.anIntArray_3540) {
         for(var2 = 0; var2 < this.anIntArray_3540.length; ++var2) {
            this.anIntArray_3540[var2] |= '\u8000';
         }
      }

   }

   public static int method2608(byte var0) {
      CacheNodeArrayList var1 = PlayerComposite.longTermPlayerCache;
      synchronized(PlayerComposite.longTermPlayerCache) {
         return PlayerComposite.longTermPlayerCache.method6676(-1499994198);
      }
   }

   public static void method2609(int var0, int var1) {
      Class134.anInt_2617 = 642235515;
      ConnectionUpdate.aCacheUnpacker_119 = null;
      Class134.anInt_2611 = 981507397;
      Class489.anInt_9003 = 2057939165;
      Class123.aClass240_Sub41_Sub2_2276 = null;
      Class586.anInt_9739 = 0;
      Class134.aBoolean_2612 = false;
      Class134.anInt_2620 = var0 * 639547177;
      Class586.aClass110_9743 = null;
   }
}
