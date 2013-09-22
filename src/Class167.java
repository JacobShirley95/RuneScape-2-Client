
public class Class167 {

   public Class505 aClass505_3024 = new Class505();
   public static final int anInt_3025 = 8191;
   static int anInt_3026;
   static int anInt_3027;
   public static Class185 aClass185_3028;


   static final void method2079(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      if(Class557.extractInterfaceIntData(var4, var2, 1856996245) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2593 = Class133.extractInterfaceData(var4, var2, (byte)71);
      var0.aBoolean_2524 = true;
   }

   static final void method2080(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      if(var2 == 0) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = (int)Math.pow((double)var2, (double)var3);
      }

   }

   static final void method2081(RSInterfaceData var0, int var1) {
      float var2 = Class362.toRadians(var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111]);
      Class240_Sub22_Sub12_Sub2 var3 = new Class240_Sub22_Sub12_Sub2(Class542.aClass43_Sub1_9475.method3317(-1222900163), var2);
      Class542.aClass43_Sub1_9475.method363(var3, 1310188962);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1890428917 * var3.anInt_3604;
   }

   public static void method2082(String var0, boolean var1, boolean var2, byte var3) {
      Class303.method3832(var0, var1, "openjs", var2, 1610140316);
   }

   public static final void method2083(int var0, int var1, int var2, int var3, int var4, int var5) {
      ParameterNode.anInt_8078 = var0 * 924766747;
      Class34_Sub1.anInt_3742 = var1 * 1559848513;
      anInt_3026 = 1618856315 * var2;
      Class304.anInt_6021 = 585412519 * var3;
      FontUnpacker.anInt_6466 = 1407474025 * var4;
      if(165791449 * FontUnpacker.anInt_6466 >= 100) {
         int var6 = ParameterNode.anInt_8078 * -1821366784 + 256;
         int var7 = 1934852608 * Class34_Sub1.anInt_3742 + 256;
         int var8 = CompProfile.getHeight(var6, var7, CacheFileID.anInt_2036 * -763239015) - anInt_3026 * 1701621171;
         int var9 = var6 - 1199090811 * Class330.anInt_6406;
         int var10 = var8 - 1386321257 * Class1.anInt_17;
         int var11 = var7 - Class373.anInt_7118 * 1527060537;
         int var12 = (int)Math.sqrt((double)(var9 * var9 + var11 * var11));
         Class631.anInt_10082 = ((int)(Math.atan2((double)var10, (double)var12) * 2607.5945876176133D) & 16383) * 351528041;
         Class474.anInt_8724 = ((int)(Math.atan2((double)var9, (double)var11) * -2607.5945876176133D) & 16383) * -449062061;
         Class283_Sub5.anInt_8259 = 0;
         if(1728048089 * Class631.anInt_10082 < 1024) {
            Class631.anInt_10082 = -812538880;
         }

         if(Class631.anInt_10082 * 1728048089 > 3072) {
            Class631.anInt_10082 = 1857350656;
         }
      }

      Class509.anInt_9182 = 1309863831;
      Class102.anInt_1968 = -1061791373;
      Class571.anInt_9652 = -1694464327;
   }

   static boolean method2084(int var0, int var1, int var2, byte var3) {
      WorldObjects var4 = client.aClass296_348.getWorldObjects();
      boolean var5 = true;
      Class218 var6 = (Class218)var4.method3423(var0, var1, var2, (byte)-34);
      if(null != var6) {
         var5 &= Class463.method5593(var6, 335643645);
      }

      var6 = (Class218)var4.method3416(var0, var1, var2, client.aClass264_482, -847607932);
      if(var6 != null) {
         var5 &= Class463.method5593(var6, -145535440);
      }

      var6 = (Class218)var4.method3428(var0, var1, var2, 229849169);
      if(null != var6) {
         var5 &= Class463.method5593(var6, 1070563644);
      }

      return var5;
   }

   static final void method2085(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class19.method106(var3, var4, var0, (short)-12082);
   }
}
