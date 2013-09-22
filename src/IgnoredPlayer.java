
public class IgnoredPlayer {

   public boolean aBoolean_110;
   public String aString_111;
   public String aString_112;
   public String aString_113;
   static NodeList aNodeList_114;


   static final void method72(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      Class554.method6142(var3, var0, (byte)-16);
   }

   static final int method73(RSCharacter var0, int var1) {
      if(var0.anInt_4340 * -231659221 == 0) {
         return 0;
      } else {
         int var5;
         GameCoord var7;
         if(var0.anInt_4312 * 1994913315 != -1) {
            Object var2 = null;
            if(var0.anInt_4312 * 1994913315 < '\u8000') {
               Class240_Sub9 var3 = (Class240_Sub9)client.npcNodeList.getNode((long)(1994913315 * var0.anInt_4312));
               if(null != var3) {
                  var2 = (RSCharacter)var3.anObject_6783;
               }
            } else if(1994913315 * var0.anInt_4312 >= '\u8000') {
               var2 = client.aPlayerArray[1994913315 * var0.anInt_4312 - '\u8000'];
            }

            if(var2 != null) {
               var7 = GameCoord.distBetween(var0.method6203().gameCoord, ((RSCharacter)var2).method6203().gameCoord);
               int var4 = (int)var7.floatX;
               var5 = (int)var7.floatZ;
               if(0 != var4 || 0 != var5) {
                  var0.method3249((int)(Math.atan2((double)var4, (double)var5) * 2607.5945876176133D) & 16383, -1144561297);
               }
            }
         }

         if(var0 instanceof Player) {
            Player var8 = (Player)var0;
            if(-1 != var8.anInt_1480 * 1917456969 && (0 == -74820059 * var8.anInt_4331 || var8.anInt_4304 * -1813174371 > 0)) {
               var8.method3249(1917456969 * var8.anInt_1480, -1144561297);
               var8.anInt_1480 = -1607630841;
            }
         } else if(var0 instanceof NPC) {
            NPC var9 = (NPC)var0;
            if(-1 != 843648435 * var9.anInt_1790 && (0 == var9.anInt_4331 * -74820059 || -1813174371 * var9.anInt_4304 > 0)) {
               var7 = var9.method6203().gameCoord;
               MapPoint var10 = client.aClass296_348.getMapArea();
               var5 = (int)var7.floatX - (var9.anInt_1790 * 1225634560 - 1799767296 * var10.loadedMapX - var10.loadedMapX * 1799767296);
               int var6 = (int)var7.floatZ - (-1081564928 * var9.anInt_1780 - var10.loadedMapY * -74849024 - -74849024 * var10.loadedMapY);
               if(0 != var5 || 0 != var6) {
                  var9.method3249((int)(Math.atan2((double)var5, (double)var6) * 2607.5945876176133D) & 16383, -1144561297);
               }

               var9.anInt_1790 = -1251502459;
            }
         }

         return var0.method3251((byte)-51);
      }
   }

   static void method74(int var0) {
      KeyboardHandler.anIntArray_6590[44] = 71;
      KeyboardHandler.anIntArray_6590[45] = 26;
      KeyboardHandler.anIntArray_6590[46] = 72;
      KeyboardHandler.anIntArray_6590[47] = 73;
      KeyboardHandler.anIntArray_6590[59] = 57;
      KeyboardHandler.anIntArray_6590[61] = 27;
      KeyboardHandler.anIntArray_6590[91] = 42;
      KeyboardHandler.anIntArray_6590[92] = 74;
      KeyboardHandler.anIntArray_6590[93] = 43;
      KeyboardHandler.anIntArray_6590[192] = 28;
      KeyboardHandler.anIntArray_6590[222] = 58;
      KeyboardHandler.anIntArray_6590[520] = 59;
   }
}
