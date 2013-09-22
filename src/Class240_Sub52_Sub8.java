
public class Class240_Sub52_Sub8 extends Class240_Sub52 {

   int anInt_1075;
   int anInt_1076;
   int anInt_1077;
   int anInt_1078;
   // $FF: synthetic field
   final Class75 aClass75_1079;


   void method5261(ByteArrayDataNode var1, byte var2) {
      this.anInt_1077 = var1.method4480(1260717178) * -2061092761;
      this.anInt_1078 = var1.method4480(1260717178) * 2079971185;
      this.anInt_1076 = var1.readByte(643615575) * 90288539;
      this.anInt_1075 = var1.readByte(1545735817) * -1367330969;
   }

   Class240_Sub52_Sub8(Class75 var1) {
      this.aClass75_1079 = var1;
   }

   void method5260(Class68 var1, byte var2) {
      var1.method703(this.anInt_1077 * 307585879, -1668675183 * this.anInt_1078, this.anInt_1076 * -1378399085, this.anInt_1075 * -294224809, -1429843982);
   }

   public static Class409 method552(ByteArrayDataNode var0, byte var1) {
      Class409 var2 = Class246.method3140(var0, (short)52);
      int var3 = var0.method4480(1260717178);
      int var4 = var0.method4480(1260717178);
      return new Class409_Sub3(var2.aClass419_7760, var2.aClass412_7761, var2.anInt_7762 * 1684132453, 731209435 * var2.anInt_7766, 1912610703 * var2.anInt_7764, var2.anInt_7765 * 1854937727, var2.anInt_7763 * -138079065, 1909120553 * var2.anInt_7767, 2062892803 * var2.anInt_7768, var3, var4);
   }

   static final void method553(int var0) {
      int[] var1 = Class15.playersIndices;

      int var2;
      for(var2 = 0; var2 < Class15.availablePlayers * -688404505; ++var2) {
         Player var3 = client.aPlayerArray[var1[var2]];
         if(null != var3) {
            var3.method3264((byte)-100);
         }
      }

      for(var2 = 0; var2 < 1636714459 * client.availableNPCS; ++var2) {
         long var4 = (long)client.npcIndices[var2];
         Class240_Sub9 var6 = (Class240_Sub9)client.npcNodeList.getNode(var4);
         if(null != var6) {
            ((RSCharacter)var6.anObject_6783).method3264((byte)-46);
         }
      }

      if(1 == client.anInt_356 * 415041591) {
         for(var2 = 0; var2 < Class95.aClass100Array_1894.length; ++var2) {
            Class100 var7 = Class95.aClass100Array_1894[var2];
            if(var7.aBoolean_1952) {
               var7.getTarget((byte)12).method3264((byte)-43);
            }
         }
      }

   }
}
