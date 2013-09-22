import java.awt.Frame;

public class Class102 {

   int anInt_1961;
   final Class495 aClass495_1962;
   final int anInt_1963;
   int anInt_1964;
   int anInt_1965;
   int anInt_1966;
   public static Frame aFrame_1967;
   public static int anInt_1968;


   Class102(ByteArrayDataNode var1) {
      this.anInt_1963 = var1.method4493(-157074556) * -835976323;
      this.aClass495_1962 = (Class495)Class559.method6185(Class105.method1355(-439561834), var1.readByte(1264198559), (byte)-89);
   }

   void method1310(int var1, int var2, int var3, int var4, int var5) {
      Class581.method6322(var1, var2, var3, -2144718709 * this.aClass495_1962.anInt_9041, -1999712811 * this.anInt_1963, -1965975883 * this.aClass495_1962.anInt_9062, var4, (byte)-119);
      this.anInt_1964 = 1792152261 * var1;
      this.anInt_1965 = -1216406343 * var2;
      this.anInt_1961 = -780382099 * var3;
      this.anInt_1966 = -771903325 * var4;
   }

   boolean method1311(int var1) {
      if(-1999712811 * this.anInt_1963 < 0) {
         return true;
      } else {
         Class534 var2 = Class535.aClass529_9441.method6015(this.anInt_1963 * -1999712811, (byte)1);
         boolean var3 = var2.method6044(-1965975883 * this.aClass495_1962.anInt_9062, (byte)8);
         int[] var4 = var2.method6051((byte)-92);
         if(var4 != null) {
            int[] var5 = var4;

            for(int var6 = 0; var6 < var5.length; ++var6) {
               int var7 = var5[var6];
               var3 &= Class88.animeUnpacker.loadAnimation(var7).method6725(30777805);
            }
         }

         return var3;
      }
   }

   void method1312(int var1) {
      Class581.method6322(-626942963 * this.anInt_1964, this.anInt_1965 * 207628681, -1933821595 * this.anInt_1961, this.aClass495_1962.anInt_9041 * -2144718709, -1, -1965975883 * this.aClass495_1962.anInt_9062, this.anInt_1966 * -506297589, (byte)-62);
   }

   public static void method1313(int var0, int var1) {
      if(var0 < 0 || var0 > 2) {
         var0 = 0;
      }

      Class597.anInt_9865 = var0 * -706982307;
      Class293.aClass594Array_5921 = new Class594[Class84.anIntArray_1709[-80546315 * Class597.anInt_9865] + 1];
      Class597.anInt_9863 = 0;
      Class597.anInt_9867 = 0;
   }

   static final void method1314(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      int var4 = Class525.aClass490_9274.method5748(var2, (byte)108).method2682(var3, (byte)109).anInt_9665 * 1550870007;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var4;
   }

   public static RSWorld method1315(int var0) {
      return Class503.anInt_9107 * -1372294533 < Class503.rsWorldList.length?Class503.rsWorldList[(Class503.anInt_9107 += 40082611) * -1372294533 - 1]:null;
   }

   static final void method1316(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var0.aClass240_Sub47_9501.aClass37Array_7661[var2].aString_853;
   }
}
