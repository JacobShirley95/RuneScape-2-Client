import java.awt.Canvas;

public class Class51 {

   Class240_Sub50[] aClass240_Sub50Array_1059;
   NodeArrayList aNodeArrayList_1060;
   final Class42 aClass42_1061;
   public static Canvas clientCanvas;


   public Class240_Sub50 method513(int var1, byte var2) {
      return var1 >= this.aClass240_Sub50Array_1059.length?null:this.aClass240_Sub50Array_1059[var1];
   }

   public Class240_Sub50 method514(String var1, byte var2) {
      long var3 = this.aClass42_1061.method347(var1, -1521047900);

      for(Class240_Sub50 var5 = (Class240_Sub50)this.aNodeArrayList_1060.getNode(var3); null != var5; var5 = (Class240_Sub50)this.aNodeArrayList_1060.method5939(-1135136201)) {
         if(var5.aString_7704.equals(var1)) {
            return var5;
         }
      }

      return null;
   }

   public void method515(int var1, String var2, Class240_Sub50 var3, byte var4) {
      Class240_Sub50 var5 = this.method514(var2, (byte)-46);
      if(null != var5 && 1679633497 * var5.anInt_7703 != var1) {
         throw new IllegalArgumentException(var2);
      } else {
         this.method516(var1, -799892790);
         if(var1 >= this.aClass240_Sub50Array_1059.length) {
            int var6;
            for(var6 = this.aClass240_Sub50Array_1059.length; var1 >= var6; var6 += var6) {
               ;
            }

            this.aNodeArrayList_1060 = new NodeArrayList(var6);

            for(int var7 = 0; var7 < this.aClass240_Sub50Array_1059.length; ++var7) {
               Class240_Sub50 var8 = this.aClass240_Sub50Array_1059[var7];
               if(var8 != null) {
                  this.aNodeArrayList_1060.insert(var8, var8.id * 4058728944299054175L);
               }
            }

            Class240_Sub50[] var9 = new Class240_Sub50[var6];

            for(int var10 = 0; var10 < this.aClass240_Sub50Array_1059.length; ++var10) {
               var9[var10] = this.aClass240_Sub50Array_1059[var10];
            }

            this.aClass240_Sub50Array_1059 = var9;
         }

         var3.anInt_7703 = var1 * 642210793;
         var3.aString_7704 = var2;
         this.aNodeArrayList_1060.insert(var3, this.aClass42_1061.method347(var2, 1254852249));
         this.aClass240_Sub50Array_1059[var1] = var3;
      }
   }

   void method516(int var1, int var2) {
      Class240_Sub50 var3 = this.method513(var1, (byte)32);
      if(null != var3) {
         var3.shiftNext();
         this.aClass240_Sub50Array_1059[1679633497 * var3.anInt_7703] = null;
      }

   }

   public Class51(int var1, Class42 var2) {
      int var3;
      for(var3 = 1; var3 < var1; var3 += var3) {
         ;
      }

      this.aNodeArrayList_1060 = new NodeArrayList(var3);
      this.aClass240_Sub50Array_1059 = new Class240_Sub50[var3];
      this.aClass42_1061 = var2;
   }

   static final void method517(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      var0.anInt_2520 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111] * 1734530533;
   }

   static final void method518(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub16_7301.method1783(1761028768) == 1?1:0;
   }

   static final void method519(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      long var2 = (long)var0.intTypes[-831324111 * var0.intTypeIndex];
      long var4 = (long)var0.intTypes[-831324111 * var0.intTypeIndex + 1];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = (int)(var2 + var2 * var4 / 100L);
   }

   public static boolean method520(int var0, short var1) {
      return var0 >= -1965975883 * Class495.aClass495_9053.anInt_9062 && var0 <= Class495.aClass495_9042.anInt_9062 * -1965975883 || Class495.aClass495_9043.anInt_9062 * -1965975883 == var0;
   }
}
