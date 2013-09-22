
public abstract class Class621 {

   static final int anInt_10025 = 2;
   static final int anInt_10026 = 1;
   public int players;
   static final int anInt_10028 = 8;
   public int flags;
   int anInt_10030;
   static final int anInt_10031 = 4;
   static Sprite aClass170_10032;


   public boolean method6634(int var1) {
      return 0 != (this.flags * -1696859433 & 1);
   }

   public boolean method6635(int var1) {
      return (-1696859433 * this.flags & 4) != 0;
   }

   public boolean method6636(int var1) {
      return 0 != (-1696859433 * this.flags & 8);
   }

   public boolean method6637(int var1) {
      return (-1696859433 * this.flags & 2) != 0;
   }

   static final void method6638(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1062321687 * var3.anInt_2569;
   }

   static final void method6639(RSInterfaceData var0, short var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(null != client.aString_542 && var2 < 1282766579 * Class298.anInt_5996) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = ScreenCharText.aClass214Array_6170[var2].aString_3710;
      } else {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
      }

   }
}
