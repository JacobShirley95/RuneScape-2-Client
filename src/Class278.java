import java.awt.Container;
import java.awt.Insets;
import java.io.File;
import java.util.Date;

public class Class278 {

   static final int anInt_4729 = 0;
   static final int anInt_4730 = 1;
   static final int anInt_4731 = 2;
   static final int anInt_4732 = 3;
   static final int anInt_4733 = 4;
   static final int anInt_4734 = 6;
   static final int anInt_4735 = 7;
   static int compassCacheOffset;
   public static CacheDataUnpacker aCacheUnpacker_4737;


   Class278() throws Throwable {
      throw new Error();
   }

   static final void method3618(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class540_Sub21.method4049(-39612443);
   }

   public static byte[] method3619(File var0, int var1) {
      return Class576.method6294(var0, (int)var0.length(), (byte)1);
   }

   public static void method3620(int var0) {
      client var1 = DamageAnimeLoader.gameClient;
      synchronized(DamageAnimeLoader.gameClient) {
         if(Class102.aFrame_1967 == null) {
            Container var2 = DrawingTarget.getGameContainer(-733981958);
            if(var2 != null) {
               Class221.clientWidth = var2.getSize().width * -92323255;
               client.clientHeight = var2.getSize().height * 1202332841;
               Insets var3;
               if(ConnectionUpdate.clientFrame == var2) {
                  var3 = ConnectionUpdate.clientFrame.getInsets();
                  Class221.clientWidth -= -92323255 * (var3.left + var3.right);
                  client.clientHeight -= (var3.bottom + var3.top) * 1202332841;
               }

               if(-1364963335 * Class221.clientWidth <= 0) {
                  Class221.clientWidth = -92323255;
               }

               if(772194201 * client.clientHeight <= 0) {
                  client.clientHeight = 1202332841;
               }

               if(Class445.method5491(1917504476) != 1) {
                  Class243.method3120(-497125241);
               } else {
                  Class29.canvasWidth = client.anInt_343 * 21467411;
                  client.canvasX = -428522091 * ((Class221.clientWidth * -1364963335 - 688709465 * client.anInt_343) / 2);
                  Class597.canvasHeight = 2037150235 * client.anInt_435;
                  client.canvasY = 0;
               }

               if(Class209.currentGameMode != Class554.aClass554_9529 && 1111410531 * Class29.canvasWidth < 1024 && Class597.canvasHeight * -75607525 < 768) {
                  ;
               }

               Class51.clientCanvas.setSize(Class29.canvasWidth * 1111410531, -75607525 * Class597.canvasHeight);
               if(null != Class286.gameRenderer) {
                  Class286.gameRenderer.method1976(Class51.clientCanvas, Class29.canvasWidth * 1111410531, -75607525 * Class597.canvasHeight, -681405326);
               }

               if(ConnectionUpdate.clientFrame == var2) {
                  var3 = ConnectionUpdate.clientFrame.getInsets();
                  Class51.clientCanvas.setLocation(client.canvasX * -1703748163 + var3.left, -1448718273 * client.canvasY + var3.top);
               } else {
                  Class51.clientCanvas.setLocation(-1703748163 * client.canvasX, client.canvasY * -1448718273);
               }

               Class172.method2173(444380755);
               if(1854782309 * client.anInt_468 != -1) {
                  Class211.method2659(true, -1075362724);
               }

               Class408.method5039(1890701475);
            }
         }
      }
   }

   public static void method3621(RSCharacter var0, int[] var1, int[] var2, int[] var3, byte var4) {
      for(int var5 = 0; var5 < var1.length; ++var5) {
         int var6 = var1[var5];
         int var7 = var3[var5];
         int var8 = var2[var5];

         for(int var9 = 0; var7 != 0 && var9 < var0.emotesPossible.length; var7 >>>= 1) {
            if((var7 & 1) != 0) {
               if(var6 == -1) {
                  var0.emotesPossible[var9] = null;
               } else {
                  Animation var10 = Class88.animeUnpacker.loadAnimation(var6);
                  int var11 = -84331573 * var10.anInt_10104;
                  Class507_Sub1_Sub1 var12 = var0.emotesPossible[var9];
                  if(null != var12 && var12.isAnimating(2131494223)) {
                     if(var6 == var12.getAnimationID(-228854672)) {
                        if(0 == var11) {
                           var0.emotesPossible[var9] = null;
                           var12 = null;
                        } else if(1 == var11) {
                           var12.method5881((byte)118);
                           var12.anInt_3298 = var8 * 1667474137;
                        } else if(2 == var11) {
                           var12.method5880(-1576742063);
                        }
                     } else if(var10.anInt_10113 * 459293499 >= var12.getAnimation(-1241459372).anInt_10113 * 459293499) {
                        var0.emotesPossible[var9] = null;
                        var12 = null;
                     }
                  }

                  if(var12 == null || !var12.isAnimating(1816698554)) {
                     var12 = var0.emotesPossible[var9] = new Class507_Sub1_Sub1(var0);
                     var12.animate(var6, 1593151072);
                     var12.anInt_3298 = 1667474137 * var8;
                  }
               }
            }

            ++var9;
         }
      }

   }

   static String method3622(long var0) {
      return Class90.method1190(new Date(var0), "EEE dd-MMM-yyyy HH:mm:ss zzz", -390382400);
   }
}
