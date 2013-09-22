
public class ScreenCharText {

   int anInt_6165;
   int anInt_6166;
   int anInt_6167;
   int anInt_6168;
   String message;
   public static Class214[] aClass214Array_6170;
   public static int anInt_6171;
   static int anInt_6172;


   public String method3924(byte var1) {
      return this.message;
   }

   public int method3925(int var1) {
      return -373047473 * this.anInt_6166;
   }

   public int method3926(byte var1) {
      return this.anInt_6167 * -1657821241;
   }

   public int method3927(int var1) {
      return this.anInt_6165 * 388049815;
   }

   public int method3928(int var1) {
      return this.anInt_6168 * -1150531829;
   }

   static void method3929(RSInterfaceData var0, int var1) {
      var0.intTypes[var0.intTypeIndex * -831324111 - 2] = HintMarker.aClass583_3709.method6327(var0.intTypes[-831324111 * var0.intTypeIndex - 2], -44658847).anIntArrayArray_9567[var0.intTypes[-831324111 * var0.intTypeIndex - 1]][0];
      var0.intTypeIndex -= -708028207;
   }

   static final void method3930(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, byte var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      if(Class557.extractInterfaceIntData(var4, var2, 1748343285) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2528 = Class133.extractInterfaceData(var4, var2, (byte)62);
      var0.aBoolean_2524 = true;
   }

   static final void method3931(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[-831324111 * var0.intTypeIndex + 1];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class53.method548(var2, var3, true, 1836465089);
   }

   static final void method3932(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0 != (var2 & 1 << var3)?1:0;
   }

   static final void method3933(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(var2 < 0 || var2 > 5 || 2 == var2) {
         var2 = 3;
      }

      Class462.setRenderToolkit(var2, false, -1851375226);
   }

   static final void method3934(RSInterfaceData var0, int var1) {
      boolean var2 = false;
      String var3 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      if(client.aBoolean_452) {
         try {
            Object var4 = Class332.aClass332_6423.method4107(new Object[]{var3}, -1632757454);
            if(var4 != null) {
               var2 = ((Boolean)var4).booleanValue();
            }
         } catch (Throwable var5) {
            ;
         }
      }

      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2?1:0;
   }

   public static final void method3935(byte var0) {
      if(!client.aBoolean_391) {
         client.aFloat_390 += (-12.0F - client.aFloat_390) / 2.0F;
         client.aBoolean_395 = true;
         client.aBoolean_391 = true;
      }
   }
}
