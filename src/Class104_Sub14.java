
public class Class104_Sub14 extends CharTask {

   final int anInt_10683;
   final int anInt_10684;
   final int anInt_10685;
   final int anInt_10686;
   final int anInt_10687;
   public static Class212_Sub1_Sub1 aClass212_Sub1_Sub1_10688;


   public void execute() {
      Class192.method2512(this.anInt_10687 * -1250794347, 786675643 * this.anInt_10685, this.anInt_10684 * 537681561, 100, 100, false, 191950945);
      Class301.method3823(1652282009 * this.anInt_10686, 227944971 * this.anInt_10683, 0, -2124193788);
      client.aBoolean_357 = true;
   }

   Class104_Sub14(ByteArrayDataNode var1) {
      super(var1);
      this.anInt_10687 = var1.readShort(-291841103) * 18826941;
      this.anInt_10684 = var1.readShort(-994595770) * -1886710359;
      this.anInt_10685 = var1.readShort(243310860) * 343176563;
      this.anInt_10686 = var1.readShort(-488392731) * 1021731241;
      this.anInt_10683 = var1.readShort(1914973762) * 1637454243;
   }

   static final void method7355(RSInterfaceData var0, int var1) {
      RSWorld var2 = Class32_Sub1.method3354(785007570);
      if(null != var2) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2.serverIndex * -1592717877;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1696859433 * var2.flags;
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var2.locAcc;
         Class625 var3 = var2.method4392(-2030714365);
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.anInt_10045 * 571842637;
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var3.aString_10046;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2.players * 485515171;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -524571829 * var2.ping;
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var2.worldAddress;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
      }

   }

   public static GameType method7356(int var0, int var1) {
      GameType[] var2 = Class592.method6422(-899279113);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         GameType var4 = var2[var3];
         if(1990054249 * var4.id == var0) {
            return var4;
         }
      }

      return null;
   }
}
