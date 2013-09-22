import java.math.BigInteger;

public class Class24 {

   static final String aString_206 = "m=accountappeal/login.ws";
   static final int anInt_207 = 4;
   static final int anInt_208 = 2;
   static final int anInt_209 = 3;
   static final BigInteger aBigInteger_210 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
   static final BigInteger aBigInteger_211 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
   static final int anInt_212 = 2;
   static final String aString_213 = "passwordchoice.ws";
   static final int anInt_214 = 1000;
   public static final int anInt_215 = 5;
   static final int anInt_216 = 6;
   static final int anInt_217 = 7;
   static final String aString_218 = "services";
   static CacheDataUnpacker aCacheUnpacker_219;


   Class24() throws Throwable {
      throw new Error();
   }

   public static boolean method149(int var0, int[] var1, int var2) {
      if(Class527.loadedInterfaces[var0]) {
         return true;
      } else {
         RSInterface.interfaceGroups[var0] = Class473.loadInterfaceGroup(var0, var1, RSInterface.interfaceGroups[var0], false, -1880058963);
         if(null == RSInterface.interfaceGroups[var0]) {
            return false;
         } else {
            Class527.loadedInterfaces[var0] = true;
            return true;
         }
      }
   }

   static final void method150(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class234.method3013(var3, var4, false, 1, var0, 1419353735);
   }

   static final void method151(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = Integer.toString(var2);
   }

   public static Class429 method152(ByteArrayDataNode var0, short var1) {
      int var2 = var0.method4480(1260717178);
      return new Class429(var2);
   }
}
