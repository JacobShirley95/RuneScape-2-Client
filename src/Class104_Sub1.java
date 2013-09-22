
public class Class104_Sub1 extends CharTask {

   final int anInt_4053;
   static final int anInt_4054 = 1;
   final int anInt_4055;
   final int anInt_4056;
   final int anInt_4057;
   final int anInt_4058;
   final int anInt_4059;
   final int anInt_4060;
   final int anInt_4061;
   final int anInt_4062;
   final int anInt_4063;
   final int anInt_4064;
   final int anInt_4065;
   final int anInt_4066;
   static final int anInt_4067 = 0;
   static int anInt_4068;


   public void execute() {
      int var2;
      int var3;
      int var4;
      RSCharacter var5;
      GameCoord var6;
      if(1172602779 * this.anInt_4057 >= 0) {
         var2 = 256 + this.anInt_4057 * -922798592;
         var3 = 256 + this.anInt_4058 * -78423552;
         var4 = 1357841587 * this.anInt_4055;
      } else {
         var5 = Class95.aClass100Array_1894[this.anInt_4056 * -748516073].getTarget((byte)61);
         var6 = var5.method6203().gameCoord;
         var2 = (int)var6.floatX;
         var3 = (int)var6.floatZ;
         var4 = var5.plane;
      }

      int var7;
      int var8;
      if(1501407661 * this.anInt_4058 >= 0) {
         var7 = 621789696 * this.anInt_4061 + 256;
         var8 = this.anInt_4062 * -1575102976 + 256;
      } else {
         var5 = Class95.aClass100Array_1894[-252826501 * this.anInt_4060].getTarget((byte)86);
         var6 = var5.method6203().gameCoord;
         var7 = (int)var6.floatX;
         var8 = (int)var6.floatZ;
         if(var4 < 0) {
            var4 = var5.plane;
         }
      }

      int var9 = 678884593 * this.anInt_4053 << 2;
      Class563_Sub1_Sub4_Sub3 var10 = new Class563_Sub1_Sub4_Sub3(client.aClass296_348.getWorldObjects(), -2015504725 * this.anInt_4064, var4, var4, var2, var3, this.anInt_4059 * 194727857 << 2, -1025618511 * client.timer, this.anInt_4065 * -944214169 + -1025618511 * client.timer, this.anInt_4066 * -1411479607, var9, -748516073 * this.anInt_4056 + 1, this.anInt_4060 * -252826501 + 1, this.anInt_4063 * 514569731 << 2, false, 0, 0);
      var10.method2332(var7, var8, this.anInt_4063 * 514569731 << 2, -944214169 * this.anInt_4065 + client.timer * -1025618511, 257169926);
      client.aNodeList_570.addNode(new Class240_Sub22_Sub4(var10), (short)-27086);
   }

   boolean method1344(int var1) {
      Class567 var2 = Class75.aClass558_1422.method6164(this.anInt_4064 * -2015504725, (byte)-3);
      boolean var3 = var2.method6238((short)256);
      Animation var4 = Class88.animeUnpacker.loadAnimation(var2.animationID * -1632377741);
      var3 &= var4.method6725(2026663340);
      return var3;
   }

   Class104_Sub1(ByteArrayDataNode var1, int var2, int var3) {
      super(var1);
      int var4;
      if(var2 == 0) {
         var4 = var1.method4480(1260717178);
         this.anInt_4057 = 85249683 * (var4 >>> 16);
         this.anInt_4058 = (var4 & '\uffff') * 1983095333;
         this.anInt_4056 = 839943513;
      } else {
         this.anInt_4057 = -85249683;
         this.anInt_4058 = -1983095333;
         this.anInt_4056 = var1.readShort(-1000608830) * -839943513;
      }

      if(0 == var3) {
         var4 = var1.method4480(1260717178);
         this.anInt_4061 = (var4 >>> 16) * 1698429985;
         this.anInt_4062 = (var4 & '\uffff') * -1004918333;
         this.anInt_4060 = 1160850765;
      } else {
         this.anInt_4061 = -1698429985;
         this.anInt_4062 = 1004918333;
         this.anInt_4060 = var1.readShort(1812904836) * -1160850765;
      }

      if(0 == var2 && 0 == var3) {
         this.anInt_4055 = var1.readByte(505433824) * 192891515;
      } else {
         this.anInt_4055 = -192891515;
      }

      this.anInt_4064 = var1.readShort(461779870) * -1654426621;
      this.anInt_4059 = var1.readByte(-901723611) * 648780113;
      this.anInt_4063 = var1.readByte(-903939315) * 199697579;
      this.anInt_4065 = var1.method4479(738776218) * -463848361;
      this.anInt_4066 = var1.readShort(190626202) * 1179665017;
      this.anInt_4053 = var1.readByte(1467442330) * 1959099409;
   }
}
