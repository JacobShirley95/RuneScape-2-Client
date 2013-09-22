
public class Class49 {

   public boolean aBoolean_1028;
   public int anInt_1029 = -2116393096;
   public int anInt_1030;
   public int anInt_1031;
   public int anInt_1032;
   public int anInt_1033;
   public int anInt_1034 = -1119569221;
   public int anInt_1035;
   public int anInt_1036;
   public int anInt_1037;
   public int anInt_1038;
   static GameType currentGameType;
   static int anInt_1040;


   void method501(ByteArrayDataNode var1, int var2) {
      while(true) {
         int var3 = var1.readByte(-441115713);
         if(var3 == 0) {
            return;
         }

         this.method502(var1, var3, (short)17417);
      }
   }

   void method502(ByteArrayDataNode var1, int var2, short var3) {
      if(1 == var2) {
         this.anInt_1029 = var1.readShort(-842108523) * 809192687;
      } else if(var2 == 2) {
         this.aBoolean_1028 = true;
      } else if(var2 == 3) {
         this.anInt_1036 = var1.method4478((byte)1) * 23560457;
         this.anInt_1031 = var1.method4478((byte)1) * -1892389315;
         this.anInt_1032 = var1.method4478((byte)1) * 1167178399;
      } else if(4 == var2) {
         this.anInt_1033 = var1.readByte(998822763) * -1899833427;
      } else if(var2 == 5) {
         this.anInt_1035 = var1.method4493(-157074556) * 1071898793;
      } else if(6 == var2) {
         this.anInt_1034 = var1.method4479(738776218) * -2017770171;
      } else if(7 == var2) {
         this.anInt_1030 = var1.method4478((byte)1) * -1746960357;
         this.anInt_1037 = var1.method4478((byte)1) * 980587649;
         this.anInt_1038 = var1.method4478((byte)1) * -2137369415;
      }

   }
}
