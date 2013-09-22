
public class Class113 {

   Class120[] aClass120Array_2063;
   static final int anInt_2064 = 4;
   static final int anInt_2065 = 256;
   static final int anInt_2066 = 2;
   String aString_2067;
   Class89[] aClass89Array_2068;
   Class120[] aClass120Array_2069;
   static int cacheIDCount;
   static RSServer currentServer;
   static int anInt_2072;


   public Class113(byte[] var1) throws Exception_Sub2 {
      this.method1453(var1, 1713407418);
   }

   void method1453(byte[] var1, int var2) throws Exception_Sub2 {
      Class129 var3 = new Class129(var1);
      int var4 = var3.method1663(-1611443095);
      if(var4 != 4) {
         throw new Exception_Sub2(this, var4, 4);
      } else {
         this.aString_2067 = var3.method1664(2072690802);
         this.aClass120Array_2069 = new Class120[var3.method1663(-1611443095)];
         this.aClass120Array_2063 = new Class120[var3.method1663(-1611443095)];
         this.aClass89Array_2068 = new Class89[var3.method1663(-1611443095)];

         int var5;
         for(var5 = 0; var5 < this.aClass120Array_2069.length; ++var5) {
            this.aClass120Array_2069[var5] = new Class120();
            this.aClass120Array_2069[var5].method1512(var3, 1924432831);
         }

         for(var5 = 0; var5 < this.aClass120Array_2063.length; ++var5) {
            this.aClass120Array_2063[var5] = new Class120();
            this.aClass120Array_2063[var5].method1512(var3, 2033320042);
         }

         for(var5 = 0; var5 < this.aClass89Array_2068.length; ++var5) {
            this.aClass89Array_2068[var5] = new Class89();
            this.aClass89Array_2068[var5].method1182(var3, -1080310603);
         }

      }
   }

   public static RSWorld getRSWorld(int var0, int var1) {
      return Class613.aBoolean_9956 && var0 >= -2114902407 * Class303.minServerIndex && var0 <= Class613.maxServers * 1422008859?Class613.worldArray[var0 - -2114902407 * Class303.minServerIndex]:null;
   }

   static final void method1455(RSInterfaceData var0, int var1) throws Exception_Sub1 {
      var0.intTypeIndex -= -1416056414;
      boolean var2 = var0.intTypes[-831324111 * var0.intTypeIndex] == 1;
      boolean var3 = 1 == var0.intTypes[1 + var0.intTypeIndex * -831324111];
      Class542.aClass43_Sub1_9475.method386(var2, var3, (byte)7);
   }

   public static void method1456(int var0) {
      Class316.method3897(22050, Class104_Sub21.renderSettings.aClass540_Sub9_7325.method1643(-1636632172) == 1, 2);
      Class15.aClass316_133 = Class316.method3896(Class51.clientCanvas, 0, 22050);
      ByteArrayDataNode.method4544(true, Class297.method3795((Class240_Sub41_Sub2)null, 1995908392), (byte)11);
      Class306.aClass316_6036 = Class316.method3896(Class51.clientCanvas, 1, 2048);
      Class217.aClass240_Sub41_Sub4_3757 = new Class240_Sub41_Sub4();
      Class306.aClass316_6036.method3912(Class217.aClass240_Sub41_Sub4_3757);
      Class541.aClass221_9471 = new Class221(22050, Class316.anInt_6135);
      Class134.method1792(-847108628);
   }

   public static void method1457(int var0) {
      Class401.aClass627_7624.method6669(-1187033173);
   }

   static final void method1458(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class248_Sub1.aBoolean_6455?1:0;
   }
}
