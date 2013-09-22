
public class Class540_Sub15 extends Setting {

   public static final int anInt_2604 = 1;
   public static final int anInt_2605 = 0;
   static final int anInt_2606 = 2;


   public Class540_Sub15(int var1, RenderSettings var2) {
      super(var1, var2);
   }

   public void method1771(int var1) {
      if(this.aClass240_Sub23_9464.method4825(-943365902) == GamePack.stellardawnPack) {
         this.mode = 1516179238;
      }

      if(-2021544293 * this.mode < 0 || -2021544293 * this.mode > 2) {
         this.mode = this.method6079((byte)15) * -1389394029;
      }

   }

   int method6082(int var1, int var2) {
      return 1;
   }

   void method6081(int var1, int var2) {
      this.mode = -1389394029 * var1;
   }

   public Class540_Sub15(RenderSettings var1) {
      super(var1);
   }

   public int method1774(int var1) {
      return this.mode * -2021544293;
   }

   int method6079(byte var1) {
      return 1;
   }

   public static Class52 method1776(int var0, byte var1) {
      return var0 == Class52.aClass52_1068.anInt_1070 * 244916499?Class52.aClass52_1068:(244916499 * Class52.aClass52_1069.anInt_1070 == var0?Class52.aClass52_1069:(var0 == 244916499 * Class52.aClass52_1067.anInt_1070?Class52.aClass52_1067:null));
   }

   static final void method1777(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      if(Class521.myPlayer.composite != null) {
         int var4;
         for(var4 = 0; var4 < Class79.anIntArray_1521.length; ++var4) {
            if(Class79.anIntArray_1521[var4] == var2) {
               Class521.myPlayer.composite.method6448(var4, var3, Class598.aClass71_9878, 2013408829);
               return;
            }
         }

         for(var4 = 0; var4 < Class79.anIntArray_1517.length; ++var4) {
            if(var2 == Class79.anIntArray_1517[var4]) {
               Class521.myPlayer.composite.method6448(var4, var3, Class598.aClass71_9878, 2013408829);
               return;
            }
         }

      }
   }
}
