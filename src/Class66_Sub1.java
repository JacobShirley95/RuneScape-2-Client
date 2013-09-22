import java.awt.Dimension;

public abstract class Class66_Sub1 extends Class66 {

   float aFloat_3791 = 0.0F;
   Class341 aClass341_3792;
   float aFloat_3793 = 0.0F;


   public void method666(float var1, int[][][] var2, Class281 var3, int var4, int var5, int var6) {
      float var7 = this.aClass341_3792.method4216();
      if(this.aFloat_3791 < var7) {
         this.aFloat_3793 = this.method2792(var7, this.aFloat_3793, var1, (short)4857);
         this.aFloat_3791 += this.aFloat_3793;
         if(this.aFloat_3791 > var7) {
            this.aFloat_3791 = var7;
         }

      }
   }

   public Class240_Sub6 method668(int var1) {
      GameCoord var2 = this.aClass341_3792.method4210(this.aFloat_3791);
      return new Class240_Sub6(0, (int)var2.floatX, (int)var2.floatY, (int)var2.floatZ);
   }

   public boolean method672(byte var1) {
      return this.aClass341_3792 != null;
   }

   public GameCoord method667(int var1) {
      return GameCoord.method4308(this.aClass341_3792.method4210(this.aFloat_3791));
   }

   public float method2787(int var1) {
      return this.aClass341_3792.method4213(this.aFloat_3791);
   }

   public void method670(Class115 var1, int var2, int var3, int var4) {
      GameCoord var5 = this.aClass341_3792.method4210(this.aFloat_3791);
      var1.anInt_2084 = 1892926905 * ((int)var5.floatX - var2);
      var1.anInt_2083 = (int)(-var5.floatY) * -213214267;
      var1.anInt_2082 = ((int)var5.floatZ - var3) * -851374433;
   }

   public void method671(ByteArrayDataNode var1, byte var2) {
      this.aClass341_3792 = new Class341(var1);
      this.aFloat_3791 = 0.0F;
      this.aFloat_3793 = 0.0F;
      this.method2790(var1, -229843434);
   }

   abstract void method2790(ByteArrayDataNode var1, int var2);

   Class66_Sub1(Class43 var1) {
      super(var1);
   }

   public void method2791(Class341 var1, int var2, byte var3) {
      this.aClass341_3792 = var1;
      this.aFloat_3791 = 0.0F;
      this.aFloat_3793 = 0.0F;
   }

   abstract float method2792(float var1, float var2, float var3, short var4);

   public float method669(int var1) {
      return this.aClass341_3792.method4214(this.aFloat_3791);
   }

   static void method2794(int var0) {
      if(Class286.gameRenderer.method1894()) {
         Class286.gameRenderer.method1899(Class51.clientCanvas, -1016343725);
         Class34.method264(1952918521);
         Dimension var1 = Class51.clientCanvas.getSize();
         Class286.gameRenderer.addDrawingTarget(Class51.clientCanvas, var1.width, var1.height, (byte)50);
         Class286.gameRenderer.method1982(Class51.clientCanvas, 739905011);
      } else {
         Class462.setRenderToolkit(Class104_Sub21.renderSettings.currentToolkit.getToolkitID(), false, -1975679583);
      }

      Class104_Sub3.method3180(2105623373);
   }

   static final void method2795(RSInterfaceData var0, int var1) {
      int var2 = var0.anIntArray_9518[var0.anInt_9510 * -1756266293] >> 16;
      int var3 = var0.anIntArray_9518[-1756266293 * var0.anInt_9510] & '\uffff';
      int var4 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(var4 >= 0 && var4 <= 5000) {
         var0.anIntArray_9495[var2] = var4;
         byte var5 = -1;
         if(105 == var3) {
            var5 = 0;
         }

         for(int var6 = 0; var6 < var4; ++var6) {
            var0.anIntArrayArray_9496[var2][var6] = var5;
         }

      } else {
         throw new RuntimeException();
      }
   }

   public static Class521 method2796(int var0) {
      return Class3.aClass521_22 == null?Class521.aClass521_9249:Class3.aClass521_22;
   }
}
