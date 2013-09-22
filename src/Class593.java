import java.util.LinkedList;
import java.util.Queue;

public class Class593 {

   static final Class585_Sub2 aClass585_Sub2_9808 = new Class585_Sub2();
   static long aLong_9809 = 5336192216723270243L;
   static int anInt_9810 = 0;
   static boolean aBoolean_9811 = true;
   static final Class585_Sub1 aClass585_Sub1_9812 = new Class585_Sub1();
   static Queue aQueue_9813 = new LinkedList();


   Class593() throws Throwable {
      throw new Error();
   }

   static final void method6423(RSInterfaceData var0, int var1) {
      var0.objectData[var0.anIntArray_9518[-1756266293 * var0.anInt_9510]] = var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
   }

   public static boolean method6424(char var0, int var1) {
      return var0 >= 32 && var0 <= 126?true:(var0 >= 160 && var0 <= 255?true:8364 == var0 || var0 == 338 || 8212 == var0 || var0 == 339 || var0 == 376);
   }

   public static void method6425(byte var0) {
      CacheNodeArrayList var1 = PlayerComposite.longTermPlayerCache;
      synchronized(PlayerComposite.longTermPlayerCache) {
         PlayerComposite.longTermPlayerCache.method6665((byte)5);
      }

      var1 = PlayerComposite.playerModelCache;
      synchronized(PlayerComposite.playerModelCache) {
         PlayerComposite.playerModelCache.method6665((byte)5);
      }
   }

   static final void method6426(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub21_7306.method4047(-1112560708) == 1?1:0;
   }

   static final void method6427(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      FriendPlayer.method58(var3, var0, 799344197);
   }
}
