
public class Class123 {

   public final int anInt_2266;
   static final int anInt_2267 = 1;
   int anInt_2268 = 0;
   Class240_Sub35 aClass240_Sub35_2269;
   static final int anInt_2270 = 2;
   static final int anInt_2271 = 0;
   Class240_Sub41_Sub2 aClass240_Sub41_Sub2_2272;
   Class312 aClass312_2273 = null;
   final CacheDataUnpacker aCacheUnpacker_2274;
   static Class436 aClass436_2275;
   static Class240_Sub41_Sub2 aClass240_Sub41_Sub2_2276;


   Class240_Sub35 method1564(byte var1) {
      return this.aClass240_Sub35_2269;
   }

   public boolean method1565(int var1) {
      Class16.method87(443451524);
      if(0 == this.anInt_2268 * 377815935) {
         this.aClass240_Sub35_2269 = Class240_Sub35.method4892(this.aCacheUnpacker_2274, this.anInt_2266 * -1216432127, 0);
         if(null == this.aClass240_Sub35_2269) {
            return false;
         }

         this.aClass312_2273 = new Class312(Class134.aCacheUnpacker_2619, Class134.aCacheUnpacker_2610);
         this.anInt_2268 = 1267645567;
      }

      if(1 == this.anInt_2268 * 377815935) {
         if(!this.aClass240_Sub41_Sub2_2272.method468(this.aClass240_Sub35_2269, Class134.aCacheUnpacker_2618, this.aClass312_2273, 22050, 445532435)) {
            return false;
         }

         this.anInt_2268 = -1759676162;
      }

      return true;
   }

   public boolean method1566(byte var1) {
      return 2 == 377815935 * this.anInt_2268;
   }

   public Class123(CacheDataUnpacker var1, int var2) {
      this.aCacheUnpacker_2274 = var1;
      this.anInt_2266 = var2 * -322877439;
      this.aClass240_Sub41_Sub2_2272 = new Class240_Sub41_Sub2();
      this.aClass240_Sub41_Sub2_2272.method476(9, 128, 1377194424);
   }

   Class240_Sub41_Sub2 method1567(int var1) {
      return this.aClass240_Sub41_Sub2_2272;
   }

   public static Class413 method1568(ByteArrayDataNode var0, int var1) {
      int var2 = var0.readByte(2064184579);
      Class419 var3 = Class130.method1672(352246665)[var0.readByte(1734177861)];
      Class412 var4 = GamePack.method5981(19124361)[var0.readByte(-110635132)];
      int var5 = var0.method4478((byte)1);
      int var6 = var0.method4478((byte)1);
      int var7 = var0.readShort(1399171581);
      int var8 = var0.readShort(-80115030);
      int var9 = var0.method4480(1260717178);
      int var10 = var0.method4480(1260717178);
      int var11 = var0.method4480(1260717178);
      boolean var12 = var0.readByte(-284796513) == 1;
      return new Class413(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   static void method1569(RSInterfaceData var0, int var1) {
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = HintMarker.aClass583_3709.method6327(var0.intTypes[var0.intTypeIndex * -831324111 - 2], -1440655558).aStringArray_9573[var0.intTypes[var0.intTypeIndex * -831324111 - 1]];
      var0.intTypeIndex -= -1416056414;
   }

   static final void method1570(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class45.aClass432_960.method5411(var2, -419957348).anInt_8436 * 1902522835;
   }

   static final void method1571(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class66_Sub1.method2796(1424446115).getLanguageID(911703324);
   }

   static final void method1572(RSInterfaceData var0, byte var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      long var3 = Class552.method6126((byte)66);
      if(var3 == 0L) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 5;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = AbstractServerConnection.method3070(var3, var2, 31974798);
      }
   }
}
