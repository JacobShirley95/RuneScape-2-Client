
public class Class104_Sub13 extends CharTask {

   final long aLong_10679;
   final int anInt_10680;
   static int anInt_10681;


   Class104_Sub13(ByteArrayDataNode var1, boolean var2) {
      super(var1);
      int var3 = var1.readShort(858412828);
      if(var2) {
         this.aLong_10679 = 1307351718026718695L * (4294967296L | (long)var3);
      } else {
         this.aLong_10679 = (long)var3 * 1307351718026718695L;
      }

      this.anInt_10680 = var1.method4480(1260717178) * 1330264145;
   }

   public void execute() {
      IndexNode var2 = (IndexNode)Class95.aNodeArrayList_1886.getNode(this.aLong_10679 * 6051520092727678423L);
      if(var2 != null) {
         var2.cacheID = this.anInt_10680 * 1681949875;
      } else {
         Class95.aNodeArrayList_1886.insert(new IndexNode(this.anInt_10680 * 654971057), 6051520092727678423L * this.aLong_10679);
      }
   }

   public static final void method7348(int var0) {
      if(!client.aBoolean_442) {
         client.aFloat_389 += (-24.0F - client.aFloat_389) / 2.0F;
         client.aBoolean_395 = true;
         client.aBoolean_442 = true;
      }
   }

   static final void method7349(RSInterfaceData var0, int var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      int var3 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      Class131.method1688(var2, var3, -1628974404);
   }

   static final void method7350(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class377.method4814(var3, var4, var0, -297669338);
   }

   static int method7351(int var0) {
      return 13;
   }

   static final void method7352(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class417.method5186(var3, var4, var0, -688066361);
   }
}
