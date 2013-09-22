import java.util.LinkedList;

public class Class293 {

   static LinkedList aLinkedList_5920 = new LinkedList();
   static Class594[] aClass594Array_5921;
   public static CacheDataUnpacker cacheFile5Unpacker;
   static long aLong_5923;


   Class293() throws Throwable {
      throw new Error();
   }

   static final void method3717(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class612.method6570(var3, var4, var0, 1922752998);
   }

   static final void method3718(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= 1462854468;
      Class271.method3556(var0.intTypes[-831324111 * var0.intTypeIndex], var0.intTypes[1 + var0.intTypeIndex * -831324111], var0.intTypes[2 + -831324111 * var0.intTypeIndex], var0.intTypes[3 + var0.intTypeIndex * -831324111], false, 256, -708028207);
   }

   static final void method3719(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub16_7301.method1778(-518896354) && Class286.gameRenderer.supportsTexture()?1:0;
   }

   static final void method3720(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class104_Sub18.method7378(var3, var4, var0, -708028207);
   }

   public static void method3721(int var0, int var1) {
      Class104_Sub13.anInt_10681 = 1957312725 * var0;
      CacheNodeArrayList var2 = PlayerComposite.playerModelCache;
      synchronized(PlayerComposite.playerModelCache) {
         PlayerComposite.playerModelCache.method6669(-1944691185);
      }

      var2 = PlayerComposite.longTermPlayerCache;
      synchronized(PlayerComposite.longTermPlayerCache) {
         PlayerComposite.longTermPlayerCache.method6669(-1997861185);
      }
   }

   static void method3722(int var0) {
      Class11.clientServerHandler.init((byte)-17);
      Class11.clientServerHandler.serverDataNode.index = 0;
      Class11.clientServerHandler.aClass428_3434 = null;
      Class11.clientServerHandler.aClass428_3451 = null;
      Class11.clientServerHandler.aClass428_3446 = null;
      Class11.clientServerHandler.anInt_3444 = 0;
      client.anInt_450 = 0;
      Class110.method1416((byte)7);
      client.anInt_567 = 0;
      client.friendsCount = 0;
      client.ignoreListCount = 0;
      client.aString_542 = null;
      Class298.anInt_5996 = 0;
      ScreenCharText.aClass214Array_6170 = null;
      Class104_Sub11.aClass68_10198 = null;
      Class253.aClass68_4385 = null;
      Class4.method19((byte)-37);

      for(int var1 = 0; var1 < Class240_Sub41_Sub3.aClass23_1024.aClass591Array_205.length; ++var1) {
         Class591 var2 = new Class591(IteratorNodeList.aClass574_9195.method6285(var1, 1978390168), false);
         var2.method6400(0, 537445924);
         var2.method6403(0, -243034353);
         Class240_Sub41_Sub3.aClass23_1024.aClass591Array_205[var1] = var2;
      }

      Class240_Sub41_Sub3.aClass23_1024.aClass608_202.method6544((byte)1);
      PlayerComposite.method6462(994072130);
   }
}
