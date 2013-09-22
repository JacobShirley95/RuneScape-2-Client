import java.util.BitSet;

public class Class240_Sub47 extends NodeListNode {

   public byte aByte_7659;
   boolean aBoolean_7660;
   public Class37[] aClass37Array_7661;
   public int anInt_7662 = 0;
   public byte aByte_7663;
   boolean aBoolean_7664 = true;
   public String aString_7665 = null;
   long aLong_7666;
   int[] anIntArray_7667;
   public static int visibleTilesX;
   static CacheDataUnpacker imageUnpacker;


   public int[] method4982(int var1) {
      if(null == this.anIntArray_7667) {
         String[] var2 = new String[899618089 * this.anInt_7662];
         this.anIntArray_7667 = new int[this.anInt_7662 * 899618089];

         for(int var3 = 0; var3 < 899618089 * this.anInt_7662; this.anIntArray_7667[var3] = var3++) {
            var2[var3] = this.aClass37Array_7661[var3].aString_853;
         }

         WorldObjects.method3459(var2, this.anIntArray_7667, 151031131);
      }

      return this.anIntArray_7667;
   }

   void method4983(Class37 var1, int var2) {
      if(this.aClass37Array_7661 == null || this.anInt_7662 * 899618089 >= this.aClass37Array_7661.length) {
         this.method4985(this.anInt_7662 * 899618089 + 5, 1571162828);
      }

      this.aClass37Array_7661[(this.anInt_7662 += 1272338201) * 899618089 - 1] = var1;
      this.anIntArray_7667 = null;
   }

   public int method4984(String var1, int var2) {
      for(int var3 = 0; var3 < 899618089 * this.anInt_7662; ++var3) {
         if(this.aClass37Array_7661[var3].aString_853.equalsIgnoreCase(var1)) {
            return var3;
         }
      }

      return -1;
   }

   void method4985(int var1, int var2) {
      if(null != this.aClass37Array_7661) {
         System.arraycopy(this.aClass37Array_7661, 0, this.aClass37Array_7661 = new Class37[var1], 0, this.anInt_7662 * 899618089);
      } else {
         this.aClass37Array_7661 = new Class37[var1];
      }

   }

   static {
      new BitSet(65536);
   }

   public Class240_Sub47(ByteArrayDataNode var1) {
      this.method4986(var1, -881674332);
   }

   void method4986(ByteArrayDataNode var1, int var2) {
      int var3 = var1.readByte(-982900473);
      if((var3 & 1) != 0) {
         this.aBoolean_7660 = true;
      }

      if(0 != (var3 & 2)) {
         this.aBoolean_7664 = true;
      }

      int var4 = 2;
      if(0 != (var3 & 4)) {
         var4 = var1.readByte(1939849376);
      }

      this.id = var1.method4538(1385013726) * -3961580539627386977L;
      this.aLong_7666 = var1.method4538(1385013726) * 3680757434486004053L;
      this.aString_7665 = var1.method4485(1669357036);
      var1.readByte(-7819348);
      this.aByte_7659 = var1.getByte((byte)19);
      this.aByte_7663 = var1.getByte((byte)70);
      this.anInt_7662 = var1.readShort(1900380535) * 1272338201;
      if(899618089 * this.anInt_7662 > 0) {
         this.aClass37Array_7661 = new Class37[899618089 * this.anInt_7662];

         for(int var5 = 0; var5 < 899618089 * this.anInt_7662; ++var5) {
            Class37 var6 = new Class37();
            if(this.aBoolean_7660) {
               var1.method4538(1385013726);
            }

            if(this.aBoolean_7664) {
               var6.aString_853 = var1.method4485(1787728890);
            }

            var6.aByte_855 = var1.getByte((byte)18);
            var6.anInt_854 = var1.readShort(954382895) * -1528017455;
            if(var4 >= 3) {
               var1.readByte(-368720064);
            }

            this.aClass37Array_7661[var5] = var6;
         }
      }

   }

   void method4987(int var1, int var2) {
      this.anInt_7662 -= 1272338201;
      if(this.anInt_7662 * 899618089 == 0) {
         this.aClass37Array_7661 = null;
      } else {
         System.arraycopy(this.aClass37Array_7661, 1 + var1, this.aClass37Array_7661, var1, 899618089 * this.anInt_7662 - var1);
      }

      this.anIntArray_7667 = null;
   }

   static void method4988(RSInterfaceData var0, int var1) {
      var0.intTypes[var0.intTypeIndex * -831324111 - 2] = HintMarker.aClass583_3709.method6327(var0.intTypes[var0.intTypeIndex * -831324111 - 2], -1709157786).anIntArrayArray_9567[var0.intTypes[-831324111 * var0.intTypeIndex - 1]][1];
      var0.intTypeIndex -= -708028207;
   }

   static final void method4989(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class25.method154(var3, var4, var0, (byte)-13);
   }
}
