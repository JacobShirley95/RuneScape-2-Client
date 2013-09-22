
public class Class47_Sub1 extends Class47 {

   Class133 aClass133_4550;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_4551;
   Class125 aClass125_4552;


   boolean method3494(int var1) throws Exception_Sub6 {
      this.aClass133_4550 = this.aRenderer_Sub3_1010.method7130("BatchedSprite");
      this.aClass240_Sub50_Sub1_4551 = this.aClass133_4550.method1753("SpriteSampler");
      this.aClass125_4552 = this.aClass133_4550.method1760("Normal");
      this.aClass133_4550.method1734(this.aClass125_4552);
      return true;
   }

   public void method484() {
      this.aClass133_4550.method1726();
      this.aClass133_4550.method1747(this.aClass240_Sub50_Sub1_4551, 0, this.aClass384_1009, -2104577786);
   }

   public Class47_Sub1(Renderer_Sub3 var1) throws Exception_Sub6 {
      super(var1);
      this.method3494(-1333761276);
   }

   public static Class240_Sub27 method3496(Class326 var0, Class528 var1, int var2) {
      Class240_Sub27 var3 = SoftwareRenderer.method6843((short)16384);
      var3.aClass326_7375 = var0;
      var3.anInt_7371 = var0.anInt_6332 * 1844188431;
      if(var3.anInt_7371 * 1254114933 == -1) {
         var3.aClass240_Sub8_Sub1_7370 = new ByteArrayDataNode_Sub1(260);
      } else if(var3.anInt_7371 * 1254114933 == -2) {
         var3.aClass240_Sub8_Sub1_7370 = new ByteArrayDataNode_Sub1(10000);
      } else if(var3.anInt_7371 * 1254114933 <= 18) {
         var3.aClass240_Sub8_Sub1_7370 = new ByteArrayDataNode_Sub1(20);
      } else if(var3.anInt_7371 * 1254114933 <= 98) {
         var3.aClass240_Sub8_Sub1_7370 = new ByteArrayDataNode_Sub1(100);
      } else {
         var3.aClass240_Sub8_Sub1_7370 = new ByteArrayDataNode_Sub1(260);
      }

      var3.aClass240_Sub8_Sub1_7370.method287(var1, -273184987);
      var3.aClass240_Sub8_Sub1_7370.method288(var3.aClass326_7375.anInt_6331 * -1528786579, 2141861361);
      var3.anInt_7373 = 0;
      return var3;
   }

   public static Class399 method3497(ByteArrayDataNode var0, int var1) {
      String var2 = var0.method4485(636379539);
      Class419 var3 = Class130.method1672(-496927539)[var0.readByte(1985436706)];
      Class412 var4 = GamePack.method5981(-2026718133)[var0.readByte(-527817835)];
      int var5 = var0.method4478((byte)1);
      int var6 = var0.method4478((byte)1);
      int var7 = var0.readByte(-664538604);
      int var8 = var0.readByte(1180570163);
      int var9 = var0.readByte(-214219935);
      int var10 = var0.readShort(766135610);
      int var11 = var0.readShort(-115584105);
      int var12 = var0.method4493(-157074556);
      int var13 = var0.method4480(1260717178);
      int var14 = var0.method4480(1260717178);
      return new Class399(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
   }

   static final void method3498(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      Class476 var4 = Class240_Sub1.aClass465_6506.method5610(var3, 939585185);
      if(var4.method5681(-1484167193)) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = client.aClass296_348.method3755(1239203685).method6015(var2, (byte)1).method6057(var3, var4.aString_8738, 1214737767);
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.aClass296_348.method3755(-756507048).method6015(var2, (byte)1).method6054(var3, var4.anInt_8739 * -80630797, -1550424155);
      }

   }

   public static final void method3499(int var0) {
      String var1 = Class228_Sub2.aString_7871 != null?Class228_Sub2.aString_7871:CacheObjectLoader.method5585(-2025380627);
      Class167.method2082(var1, false, client.aBoolean_285, (byte)-126);
   }
}
