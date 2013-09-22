
public class Class502_Sub1 extends Class502 implements Class262 {

   public void method4698(int var1, int var2) {
      this.setting = 2041303939 * var1;
   }

   public void method3492(byte var1) {
      Class240_Sub27 var2 = Class47_Sub1.method3496(Class326.aClass326_6247, client.gameConnectionHandler.aClass528_3433, 1917447504);
      var2.aClass240_Sub8_Sub1_7370.method4511(this.anInt_9090 * 579417841, 998980290);
      var2.aClass240_Sub8_Sub1_7370.method4499(this.setting * 1714443051, (byte)-39);
      var2.aClass240_Sub8_Sub1_7370.method4512(this.anInt_9101 * -1498119793, -68498856);
      var2.aClass240_Sub8_Sub1_7370.putShort(this.anInt_9099 * 313477781, -1851346765);
      var2.aClass240_Sub8_Sub1_7370.putShort(this.flags * -730641663, -1396499838);
      var2.aClass240_Sub8_Sub1_7370.method4499(this.anInt_9104 * -45568375, (byte)-60);
      var2.aClass240_Sub8_Sub1_7370.method4511(this.anInt_9100 * 168975285, 998980290);
      client.gameConnectionHandler.addPacket(var2, 189406307);
   }

   public void method4700(int var1, int var2, byte var3) {
      if(0 == var1 && var2 > 32767) {
         var2 = 32767;
      } else if(var2 > 8388607) {
         var2 = 8388607;
      }

      switch(var1) {
      case 0:
         this.anInt_9099 = -810405699 * var2;
         break;
      case 1:
         this.anInt_9101 = var2 * 1970765167;
      case 2:
      default:
         break;
      case 3:
         this.anInt_9090 = -1594033647 * var2;
      }

   }

   public void setFlag(int var1, int var2) {
      this.flags = (-730641663 * this.flags | var1) * -1333414655;
   }

   public void method4702(int var1, byte var2) {
      this.anInt_9104 = var1 * 1141581753;
   }

   public static void method4703(int var0, byte var1) {
      Class240_Sub22_Sub5 var2 = Class65_Sub1_Sub2.method866(23, (long)var0);
      var2.method597((byte)0);
   }
}
