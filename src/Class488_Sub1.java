
public class Class488_Sub1 extends Class488 implements Class262 {

   Class488_Sub1(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8, int var9) {
      super(var1, var2, var3 > '\uffff'?'\uffff':var3, var4, var5 > 255?255:var5, var6, var7, var8, var9 > 255?255:var9);
   }

   public void method3492(byte var1) {
      Class240_Sub27 var2 = Class47_Sub1.method3496(Class326.aClass326_6274, client.gameConnectionHandler.aClass528_3433, 1917447504);
      int var3 = (this.aBoolean_8995?2:0) | (this.aBoolean_9001?1:0);
      var2.aClass240_Sub8_Sub1_7370.method4477(var3, (byte)41);
      var2.aClass240_Sub8_Sub1_7370.method4514(-1406735475 * this.anInt_8994, -115878143);
      var2.aClass240_Sub8_Sub1_7370.method4500(-874016331 * this.anInt_8997, (byte)-18);
      var2.aClass240_Sub8_Sub1_7370.method4528(-718788739 * this.anInt_8996, -1572116967);
      var2.aClass240_Sub8_Sub1_7370.method4515(-2119671869 * this.anInt_9000, -1060908955);
      var2.aClass240_Sub8_Sub1_7370.method4477(-131672851 * this.anInt_8998, (byte)106);
      var2.aClass240_Sub8_Sub1_7370.method4477(this.anInt_8999 * 161377881, (byte)81);
      var2.aClass240_Sub8_Sub1_7370.putByte(this.anInt_9002 * 955754327, 24261378);
      client.gameConnectionHandler.addPacket(var2, 1042854603);
   }
}
