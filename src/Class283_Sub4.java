
final class Class283_Sub4 extends Class283 {

   Object method3666(Class187 var1, int var2) {
      return Class373.aClass373_7004 == var1.aClass373_3197?Integer.valueOf(-1):var1.aClass373_3197.method4743(-1222712465);
   }

   Class283_Sub4(Class124 var1, int var2, boolean var3, boolean var4) {
      super(var1, var2, var3, var4, (Class283_Sub5)null);
   }

   static boolean method5156(int var0) {
      Class11.anInt_58 = -1907328518;
      Class11.clientServerHandler = client.lobbyConnectionHandler;
      if(null != client.aByteArray_595) {
         ByteArrayDataNode var1 = new ByteArrayDataNode(client.aByteArray_595);
         Class11.aLong_99 = var1.method4538(1385013726) * -3016473431628976607L;
         Class11.aLong_91 = var1.method4538(1385013726) * 4480658858361632081L;
      }

      if(-6939556774457567775L * Class11.aLong_99 < 0L) {
         Class606.method6520(35, '\uff00');
         return false;
      } else {
         return Class240_Sub44.method4969(false, true, "", "", Class11.aLong_99 * -6939556774457567775L);
      }
   }

   static final void method5157(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class223.method2804((char)var2, (byte)1)?1:0;
   }
}
