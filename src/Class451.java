
public class Class451 {

   public int anInt_8544 = -906663936;
   public int anInt_8545 = 0;
   public int anInt_8546 = 1543960576;
   public int anInt_8547 = 0;


   void method5524(ByteArrayDataNode var1, int var2) {
      while(true) {
         int var3 = var1.readByte(493825510);
         if(var3 == 0) {
            return;
         }

         this.method5525(var1, var3, -2062329972);
      }
   }

   void method5525(ByteArrayDataNode var1, int var2, int var3) {
      if(var2 == 1) {
         this.anInt_8547 = var1.readByte(976457717) * -1602393659;
      } else if(2 == var2) {
         this.anInt_8544 = var1.readShort(1004801986) * -1273413971;
      } else if(3 == var2) {
         this.anInt_8546 = var1.readShort(873946622) * 577470687;
      } else if(var2 == 4) {
         this.anInt_8545 = var1.method4478((byte)1) * 703093571;
      }

   }

   static final void method5526(RSInterfaceData var0, int var1) throws Exception_Sub1 {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      Class52 var3 = Class540_Sub15.method1776(var2, (byte)70);
      if(null == var3) {
         throw new RuntimeException();
      } else {
         Class542.aClass43_Sub1_9475.method355(var3, (byte)18);
      }
   }

   static final void method5527(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class240_Sub22_Sub9.method2581(var3, var4, var0, 1570231010);
   }
}
