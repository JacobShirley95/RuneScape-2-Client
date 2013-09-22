
public class Class12 {

   static final int anInt_108 = 63;
   static final int anInt_109 = 7;


   Class12() throws Throwable {
      throw new Error();
   }

   static void method68(Renderer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if((Class77.aClass170_1457 == null || Class255.aClass170_4408 == null || Class571.aClass170_9653 == null) && Class301.mmUnpacker.hasData(-1830741849 * Exception_Sub1.anInt_1771, -1989003418) && Class301.mmUnpacker.hasData(-1095094143 * Setting.anInt_9466, 1724821131) && Class301.mmUnpacker.hasData(-1602026809 * Class104_Sub20.anInt_10732, -1666527825)) {
         AbstractImageData var7 = ImageUtils.getImageData(Class301.mmUnpacker, Setting.anInt_9466 * -1095094143, 0);
         Class255.aClass170_4408 = var0.loadSprite(var7, true);
         var7.method1378();
         Exception_Sub1.aClass170_1772 = var0.loadSprite(var7, true);
         Class77.aClass170_1457 = var0.loadSprite(ImageUtils.getImageData(Class301.mmUnpacker, -1830741849 * Exception_Sub1.anInt_1771, 0), true);
         AbstractImageData var8 = ImageUtils.getImageData(Class301.mmUnpacker, Class104_Sub20.anInt_10732 * -1602026809, 0);
         Class571.aClass170_9653 = var0.loadSprite(var8, true);
         var8.method1378();
         Class225.aClass170_3881 = var0.loadSprite(var8, true);
      }

      if(Class77.aClass170_1457 != null && Class255.aClass170_4408 != null && Class571.aClass170_9653 != null) {
         int var10 = (var3 - Class571.aClass170_9653.getWidth() * 2) / Class77.aClass170_1457.getWidth();

         int var11;
         for(var11 = 0; var11 < var10; ++var11) {
            Class77.aClass170_1457.drawAt(var1 + Class571.aClass170_9653.getWidth() + var11 * Class77.aClass170_1457.getWidth(), var4 + var2 - Class77.aClass170_1457.getHeight());
         }

         var11 = (var4 - var5 - Class571.aClass170_9653.getHeight()) / Class255.aClass170_4408.getHeight();

         for(int var9 = 0; var9 < var11; ++var9) {
            Class255.aClass170_4408.drawAt(var1, var5 + var2 + var9 * Class255.aClass170_4408.getHeight());
            Exception_Sub1.aClass170_1772.drawAt(var1 + var3 - Exception_Sub1.aClass170_1772.getWidth(), var2 + var5 + var9 * Class255.aClass170_4408.getHeight());
         }

         Class571.aClass170_9653.drawAt(var1, var4 + var2 - Class571.aClass170_9653.getHeight());
         Class225.aClass170_3881.drawAt(var1 + var3 - Class571.aClass170_9653.getWidth(), var2 + var4 - Class571.aClass170_9653.getHeight());
      }

   }

   static final void method69(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.aBoolean_447?1:0;
   }

   public static Class539[] method70(byte var0) {
      return new Class539[]{Class539.aClass539_9457, Class539.aClass539_9458, Class539.aClass539_9456, Class539.aClass539_9455};
   }

   public static Class240_Sub43_Sub2 method71(int var0, int var1, int var2, int var3, byte var4) {
      Class240_Sub43_Sub2[] var5 = Class240_Sub43_Sub2.aClass240_Sub43_Sub2Array_3584;
      synchronized(Class240_Sub43_Sub2.aClass240_Sub43_Sub2Array_3584) {
         Class240_Sub43_Sub2 var6;
         if(Class516.anInt_9217 * 1888887529 == 0) {
            var6 = new Class240_Sub43_Sub2();
         } else {
            var6 = Class240_Sub43_Sub2.aClass240_Sub43_Sub2Array_3584[(Class516.anInt_9217 -= 494064985) * 1888887529];
         }

         var6.mouseX = -776177785 * var0;
         var6.mouseY = 1091144929 * var1;
         var6.anInt_3576 = -701104823 * var2;
         var6.anInt_3598 = var3 * -514293429;
         var6.aLong_3599 = Class373.getCurrentTime((short)29675) * -713618952015107031L;
         return var6;
      }
   }
}
