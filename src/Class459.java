
public class Class459 {

   public short[] aShortArray_8576;
   static final int anInt_8577 = 4;
   public short[] aShortArray_8578;
   static final int anInt_8579 = 8;
   static final int anInt_8580 = 2;
   public int[] anIntArray_8581 = new int[3];
   public int[] anIntArray_8582 = new int[2];
   public int[] anIntArray_8583 = new int[2];
   public int[] anIntArray_8584 = new int[3];
   static final int anInt_8585 = 1;


   Class459(ObjectDescriptor var1) {
      this.anIntArray_8584[0] = -12960199 * var1.anInt_8478;
      this.anIntArray_8584[1] = var1.anInt_8451 * -615229187;
      this.anIntArray_8584[2] = var1.anInt_8460 * 1299696045;
      this.anIntArray_8581[0] = var1.anInt_8480 * 421053815;
      this.anIntArray_8581[1] = var1.anInt_8449 * -1090233185;
      this.anIntArray_8581[2] = 102701445 * var1.anInt_8483;
      this.anIntArray_8582[0] = 359547541 * var1.anInt_8490;
      this.anIntArray_8582[1] = 1009167343 * var1.anInt_8459;
      this.anIntArray_8583[0] = var1.anInt_8492 * 733970347;
      this.anIntArray_8583[1] = -730376201 * var1.anInt_8493;
      if(null != var1.aShortArray_8455) {
         this.aShortArray_8578 = new short[var1.aShortArray_8455.length];
         System.arraycopy(var1.aShortArray_8455, 0, this.aShortArray_8578, 0, this.aShortArray_8578.length);
      }

      if(var1.aShortArray_8479 != null) {
         this.aShortArray_8576 = new short[var1.aShortArray_8479.length];
         System.arraycopy(var1.aShortArray_8479, 0, this.aShortArray_8576, 0, this.aShortArray_8576.length);
      }

   }

   static long method5569(Class218 var0, int var1, int var2, int var3) {
      long var4 = 4194304L;
      long var6 = Long.MIN_VALUE;
      Class534 var8 = client.aClass296_348.method3755(2063314408).method6015(var0.method2723((byte)-80), (byte)1);
      long var9 = (long)(var1 | var2 << 7 | var0.method2730(-184970616) << 14 | var0.method2718(-1984317776) << 20 | 1073741824);
      if(var8.anInt_9380 * 166485479 == 0) {
         var9 |= var6;
      }

      if(1 == var8.anInt_9413 * -1248943027) {
         var9 |= var4;
      }

      var9 |= (long)var0.method2723((byte)-87) << 32;
      return var9;
   }

   static void method5570(ArrayViewport var0, boolean var1, float var2, float var3, float var4, float var5, int var6, int var7, byte var8) {
      int var9 = client.aClass296_348.method3780(709161939);
      int var10 = client.aClass296_348.method3778(-1499242076);
      var0.method4563(var2, var3, var4, var5, (float)var10, (float)var9, (float)var6, (float)var7);
   }

   static final void method5571(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(1854782309 * client.anInt_468 != -1) {
         if(0 == var2) {
            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.anInt_468 * 1854782309;
            return;
         }

         --var2;
      }

      Class240_Sub16 var3;
      for(var3 = (Class240_Sub16)client.widgets.start(); var2-- > 0; var3 = (Class240_Sub16)client.widgets.next()) {
         ;
      }

      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.widgetID * 1320796941;
   }

   public static int method5572(int var0, int var1) {
      var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
      var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
      var0 = var0 + (var0 >>> 4) & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }
}
