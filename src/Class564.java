
public class Class564 {

   final int anInt_9602;
   final MapPoint aClass626_9603;
   final int anInt_9604;
   static short aShort_9605;


   public Class218 method6214(int var1) {
      Class218 var2 = this.method6215(-1181310646);
      return var2 == null?null:(var2.method2723((byte)-119) != this.anInt_9604 * -1247795249?null:var2);
   }

   Class218 method6215(int var1) {
      int var2 = this.aClass626_9603.plane * -1025256637;
      MapPoint var3 = client.aClass296_348.getMapArea();
      int var4 = this.aClass626_9603.loadedMapX * 1265321541 - 1265321541 * var3.loadedMapX;
      int var5 = -1996781083 * this.aClass626_9603.loadedMapY - -1996781083 * var3.loadedMapY;
      if(var4 >= 0 && var5 >= 0 && var4 < client.aClass296_348.getMaxX((byte)-115) && var5 < client.aClass296_348.getMaxY(561463443)) {
         switch(this.method6216(1661922907)) {
         case 0:
            return (Class218)client.aClass296_348.getWorldObjects().method3423(var2, var4, var5, (byte)-113);
         case 1:
            return (Class218)client.aClass296_348.getWorldObjects().method3425(var2, var4, var5, -791749075);
         case 2:
            return (Class218)client.aClass296_348.getWorldObjects().method3416(var2, var4, var5, client.aClass264_482, -886339847);
         case 3:
            return (Class218)client.aClass296_348.getWorldObjects().method3428(var2, var4, var5, -1205933264);
         default:
            return null;
         }
      } else {
         return null;
      }
   }

   public Class564(MapPoint var1, int var2, int var3, int var4) {
      this.aClass626_9603 = var1;
      this.anInt_9602 = var2 * 1004688565;
      this.anInt_9604 = 735543087 * var4;
   }

   int method6216(int var1) {
      return client.anIntArray_354[425130397 * this.anInt_9602];
   }

   static final void method6217(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.anInt_2495 * 586830225;
   }

   static final void method6218(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class520.aBoolean_9244?1:0;
   }

   static final void method6219(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(2 == -826987519 * client.anInt_567 && var2 < -1301826725 * client.friendsCount) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.friendsList[var2].aBoolean_45?1:0;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   static void method6220(Class520 var0, byte var1) {
      Class3.aClass520_21 = var0;
   }

   public static Class40 method6221(int var0, byte var1) {
      Class40[] var2 = Class23.method143(-172622235);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Class40 var4 = var2[var3];
         if(746264091 * var4.anInt_873 == var0) {
            return var4;
         }
      }

      return null;
   }
}
