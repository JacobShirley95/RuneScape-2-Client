
public class Class240_Sub52_Sub11 extends Class240_Sub52 {

   String aString_1232;
   long aLong_1233;
   int anInt_1234;
   // $FF: synthetic field
   final Class75 aClass75_1235;


   Class240_Sub52_Sub11(Class75 var1) {
      this.aClass75_1235 = var1;
      this.aLong_1233 = -1041418482289773667L;
      this.aString_1232 = null;
      this.anInt_1234 = 0;
   }

   void method5260(Class68 var1, byte var2) {
      var1.method695(-7173045072800885429L * this.aLong_1233, this.aString_1232, 923046713 * this.anInt_1234, -576124732);
   }

   void method5261(ByteArrayDataNode var1, byte var2) {
      if(var1.readByte(489228871) != 255) {
         var1.index -= -2043502829;
         this.aLong_1233 = var1.method4538(1385013726) * 1041418482289773667L;
      }

      this.aString_1232 = var1.method4523(-892050887);
      this.anInt_1234 = var1.readShort(-843797506) * -71406839;
   }

   static final void method643(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.stringDataIndex -= 638819198;
      String var3 = (String)var0.stringData[863838783 * var0.stringDataIndex];
      String var4 = (String)var0.stringData[1 + var0.stringDataIndex * 863838783];
      if(var3.length() <= 500) {
         if(var4.length() <= 500) {
            Class209.method2645(var2, var3, var4, (byte)-16);
         }
      }
   }

   public static final void method644(RSInterface var0, int var1, int var2, int var3) {
      if(null == client.aClass132_523 && !Class18.optionsClosed) {
         if(var0 != null && Class470.method5657(var0, -2055897264)) {
            client.aClass132_523 = var0;
            client.aClass132_426 = Class338.method4193(var0, (byte)-1);
            client.anInt_481 = var1 * 1633762233;
            client.anInt_287 = -1761448785 * var2;
            GameType.anInt_9191 = 0;
            client.aBoolean_553 = false;
         }
      }
   }
}
