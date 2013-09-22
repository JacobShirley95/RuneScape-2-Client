import java.io.IOException;

public class Class290_Sub1 extends Class290 implements Runnable {

   public void run() {
      this.aBoolean_5910 = true;

      try {
         while(!this.aBoolean_5911) {
            for(int var1 = 0; var1 < 2; ++var1) {
               Class316 var2 = this.aClass316Array_5912[var1];
               if(var2 != null) {
                  var2.method3909();
               }
            }

            RSInterface.method1724(10L);
            Class456.method5545((Object)null, 1441813986);
         }
      } catch (Exception var6) {
         CacheFileID.method1397((String)null, var6, -1595385054);
      } finally {
         this.aBoolean_5910 = false;
      }

   }

   static final boolean method7524(ConnectionHandler var0, byte var1) {
      try {
         return Class497.method5823(var0, 1887361263);
      } catch (IOException var6) {
         if(2 == -243034353 * client.loginStage) {
            var0.close((byte)8);
            return false;
         } else {
            Class221.method2781(1685001563);
            return true;
         }
      } catch (Exception var7) {
         MapPoint var3 = client.aClass296_348.getMapArea();
         String var4 = (null != var0.aClass428_3448?var0.aClass428_3448.anInt_8257 * 414445389:-1) + Class8.commaStr + (var0.aClass428_3451 != null?var0.aClass428_3451.anInt_8257 * 414445389:-1) + Class8.commaStr + (var0.aClass428_3446 != null?414445389 * var0.aClass428_3446.anInt_8257:-1) + " " + var0.anInt_3450 * 1463379377 + Class8.commaStr + (1265321541 * var3.loadedMapX + Class521.myPlayer.tilePosArrayX[0]) + Class8.commaStr + (-1996781083 * var3.loadedMapY + Class521.myPlayer.tilePosArrayY[0]) + " ";

         for(int var5 = 0; var5 < 1463379377 * var0.anInt_3450 && var5 < 50; ++var5) {
            var4 = var4 + var0.serverDataNode.data[var5] + Class8.commaStr;
         }

         CacheFileID.method1397(var4, var7, 908600784);
         Class125.method1608(false, (byte)-38);
         return true;
      }
   }

   static final void method7525(RSInterfaceData var0, byte var1) {
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub1_7295, var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111] != 0?1:0, 1438198908);
      Class83.method1089(-814730157);
      client.aClass296_348.method3789((byte)26);
   }
}
