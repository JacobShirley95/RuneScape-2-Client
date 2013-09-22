
public abstract class AbstractUpdateServerConnector {

   static final int anInt_4744 = 5;
   Class240_Sub22_Sub15_Sub1 aClass240_Sub22_Sub15_Sub1_4745 = null;
   static final int anInt_4746 = 20;
   static final int anInt_4747 = 3;
   public volatile int anInt_4748 = 0;
   Class494 aClass494_4749 = new Class494();
   Class494 aClass494_4750 = new Class494();
   Class494 aClass494_4751 = new Class494();
   static final int anInt_4752 = 5;
   Class494 aClass494_4753 = new Class494();
   int anInt_4754;
   long aLong_4755;
   static final int anInt_4756 = 512;
   byte aByte_4757 = 0;
   public volatile int status = 0;
   ByteArrayDataNode aClass240_Sub8_4759 = new ByteArrayDataNode(5);
   static final int anInt_4760 = 100;
   ByteArrayDataNode aClass240_Sub8_4761 = new ByteArrayDataNode(5);
   int anInt_4762 = 0;
   ByteArrayDataNode aClass240_Sub8_4763 = new ByteArrayDataNode(6);
   public static int viewOfMapImageY;


   Class240_Sub22_Sub15_Sub1 addNode(int var1, int var2, byte var3, boolean var4, byte var5) {
      long var6 = ((long)var1 << 32) + (long)var2;
      Class240_Sub22_Sub15_Sub1 var8 = new Class240_Sub22_Sub15_Sub1();
      var8.aLong_7278 = var6 * -390861045572062217L;
      var8.aByte_3236 = var3;
      var8.aBoolean_3670 = var4;
      if(var4) {
         if(this.method3640((byte)16) >= 100) {
            throw new RuntimeException();
         }

         this.aClass494_4750.insert(var8, 1427674089);
      } else {
         if(this.method3632((short)5454) >= 20) {
            throw new RuntimeException();
         }

         this.aClass494_4749.insert(var8, 528715243);
      }

      return var8;
   }

   public boolean method3630(int var1) {
      return this.method3632((short)30253) >= 20;
   }

   public boolean method3631(byte var1) {
      return this.method3640((byte)3) >= 100;
   }

   int method3632(short var1) {
      return this.aClass494_4749.getSize(-1606763639) + this.aClass494_4753.getSize(-1606763639);
   }

   abstract void method3633(int var1);

   public abstract void method3634(Object var1, boolean var2, int var3);

   public abstract void method3635(byte var1);

   public abstract void method3636(int var1);

   public abstract void closeConnection();

   public abstract boolean method3638(byte var1);

   public abstract void method3639(boolean var1, int var2);

   public int method3640(byte var1) {
      return this.aClass494_4750.getSize(-1606763639) + this.aClass494_4751.getSize(-1606763639);
   }

   static final void method3641(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class557.method6153(var3, var4, var0, (byte)-112);
   }

   static final void method3642(RSInterfaceData var0, short var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      CacheNodeArrayList.method6679(var3, var4, var0, 1341881234);
   }
}
