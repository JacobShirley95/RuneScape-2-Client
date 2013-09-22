import java.io.IOException;

public class Class231 {

   public Class231 aClass231_3954;
   public Class231 aClass231_3955;


   public void method2931(int var1) {
      if(null != this.aClass231_3955) {
         this.aClass231_3955.aClass231_3954 = this.aClass231_3954;
         this.aClass231_3954.aClass231_3955 = this.aClass231_3955;
         this.aClass231_3954 = null;
         this.aClass231_3955 = null;
      }
   }

   static void method2932(int var0) {
      if(null != Class3.aClass26_26) {
         try {
            short var1;
            if(-1549947895 * Class3.anInt_23 == 0) {
               var1 = 250;
            } else {
               var1 = 2000;
            }

            Class3.anInt_20 += 387845285;
            if(Class3.anInt_20 * -1184171219 > var1) {
               Class303.method3831((short)32767);
            }

            int var3;
            if(Class3.aClass26_26 == Class26.aClass26_268) {
               client.lobbyConnectionHandler.setServerConnection(Class606.createServerConnection(Class503.lobbyConnectionDesc.createSocketConnection(1233748007), 15000, -1958224236), Class503.lobbyConnectionDesc.hostIP, (byte)-109);
               client.lobbyConnectionHandler.init((byte)-25);
               Class240_Sub27 var2 = Class586.method6363((byte)87);
               var2.aClass240_Sub8_Sub1_7370.putByte(311892347 * Class335.aClass335_6475.anInt_6478, -985375535);
               var2.aClass240_Sub8_Sub1_7370.method4463(0, -1133179644);
               var3 = var2.aClass240_Sub8_Sub1_7370.index * 964952859;
               var2.aClass240_Sub8_Sub1_7370.method4463(768, 945085274);
               var2.aClass240_Sub8_Sub1_7370.method4463(1, -922151776);
               Class3.anIntArray_27 = Class240_Sub6.method4448(var2, 1296135176);
               int var4 = var2.aClass240_Sub8_Sub1_7370.index * 964952859;
               var2.aClass240_Sub8_Sub1_7370.putString(client.aString_290, (byte)-109);
               var2.aClass240_Sub8_Sub1_7370.method4463(1020203353 * client.anInt_275, -579938342);
               var2.aClass240_Sub8_Sub1_7370.putIntBE(client.anInt_280 * -56315749, 2062892803);
               var2.aClass240_Sub8_Sub1_7370.putIntBE(1966576173 * client.anInt_326, 2062892803);
               var2.aClass240_Sub8_Sub1_7370.putString(Class50.aString_1052, (byte)-19);
               var2.aClass240_Sub8_Sub1_7370.putByte(Class599.clientLanguage.getLanguageID(-1747287250), -755872902);
               var2.aClass240_Sub8_Sub1_7370.putByte(-265238991 * client.currentGamePack.anInt_9269, 285806210);
               ParameterNode.method5290(var2.aClass240_Sub8_Sub1_7370, (byte)53);
               String var5 = client.aString_283;
               var2.aClass240_Sub8_Sub1_7370.putByte(var5 == null?0:1, 1893287675);
               if(null != var5) {
                  var2.aClass240_Sub8_Sub1_7370.putString(var5, (byte)-34);
               }

               Class494.aClass240_Sub15_9037.method4649(var2.aClass240_Sub8_Sub1_7370, (byte)12);
               var2.aClass240_Sub8_Sub1_7370.index += -1419617915;
               var2.aClass240_Sub8_Sub1_7370.method4496(Class3.anIntArray_27, var4, 964952859 * var2.aClass240_Sub8_Sub1_7370.index, -763494346);
               var2.aClass240_Sub8_Sub1_7370.method4472(var2.aClass240_Sub8_Sub1_7370.index * 964952859 - var3, -980867182);
               client.lobbyConnectionHandler.addPacket(var2, 1307811478);
               client.lobbyConnectionHandler.method2541((byte)-61);
               Class3.aClass26_26 = Class26.aClass26_267;
            }

            if(Class3.aClass26_26 == Class26.aClass26_267) {
               if(client.lobbyConnectionHandler.getServerConnection() == null) {
                  Class303.method3831((short)32767);
                  return;
               }

               if(!client.lobbyConnectionHandler.getServerConnection().method3065(1, -2021643633)) {
                  return;
               }

               client.lobbyConnectionHandler.getServerConnection().method3064(client.lobbyConnectionHandler.serverDataNode.data, 0, 1, (short)-4406);
               Class3.aClass531_25 = (Class531)Class559.method6185(Class598.method6475(2128800981), client.lobbyConnectionHandler.serverDataNode.data[0] & 255, (byte)-69);
               if(Class531.aClass531_9328 == Class3.aClass531_25) {
                  client.lobbyConnectionHandler.aClass528_3433 = new Class528(Class3.anIntArray_27);
                  int[] var7 = new int[4];

                  for(var3 = 0; var3 < 4; ++var3) {
                     var7[var3] = Class3.anIntArray_27[var3] + 50;
                  }

                  client.lobbyConnectionHandler.aClass528_3440 = new Class528(var7);
                  new Class528(var7);
                  client.lobbyConnectionHandler.serverDataNode.method287(client.lobbyConnectionHandler.aClass528_3440, -1406434066);
                  Class418.method5190(3, (byte)-84);
                  client.lobbyConnectionHandler.init((byte)-80);
                  client.lobbyConnectionHandler.serverDataNode.index = 0;
                  client.lobbyConnectionHandler.aClass428_3434 = null;
                  client.lobbyConnectionHandler.aClass428_3451 = null;
                  client.lobbyConnectionHandler.aClass428_3446 = null;
                  client.lobbyConnectionHandler.anInt_3444 = 0;
                  Class240_Sub41_Sub3.aClass23_1024.aClass608_202.method6544((byte)1);
                  PlayerComposite.method6462(1092363512);
               } else {
                  client.lobbyConnectionHandler.method2545((byte)27);
               }

               client.lobbyConnectionHandler.aClass428_3448 = null;
               Class3.aClass26_26 = null;
            }
         } catch (IOException var6) {
            Class303.method3831((short)32767);
         }

      }
   }
}
