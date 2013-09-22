
public final class Class240_Sub30 extends NodeListNode {

   public static NodeList aNodeList_7408 = new NodeList();
   public int anInt_7409;
   int anInt_7410;
   int anInt_7411;
   int anInt_7412;
   int anInt_7413;
   int anInt_7414;
   int anInt_7415;
   int anInt_7416;
   Class532 aClass532_7417;
   static long aLong_7418 = 1115554122342288335L;
   boolean aBoolean_7419 = true;
   boolean aBoolean_7420 = false;
   public static NodeList aNodeList_7421 = new NodeList();
   public int anInt_7422;
   int anInt_7423;


   static final void method4858(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      Class541.method6085(var2, (byte)-104);
   }

   public static void loadSprites(Renderer var0, CacheDataUnpacker cacheUnpacker) {
      AbstractImageData[] imagesData = ImageUtils.method1797(cacheUnpacker, -1848916943 * Class1.headIconsPK, 0);
      Class1.headPKIcons = new Sprite[imagesData.length];

      int var4;
      for(var4 = 0; var4 < imagesData.length; ++var4) {
         Class1.headPKIcons[var4] = var0.loadSprite(imagesData[var4], true);
      }

      imagesData = ImageUtils.method1797(cacheUnpacker, Class1.headIconsPrayer * 71618371, 0);
      Class540_Sub13.prayIconSprites = new Sprite[imagesData.length];

      for(var4 = 0; var4 < imagesData.length; ++var4) {
         Class540_Sub13.prayIconSprites[var4] = var0.loadSprite(imagesData[var4], true);
      }

      imagesData = ImageUtils.method1797(cacheUnpacker, Class212_Sub1_Sub1.hintHeadicons * -1537474119, 0);
      Class240_Sub22_Sub16.hintHeadIconsSprites = new Sprite[imagesData.length];

      for(var4 = 0; var4 < imagesData.length; ++var4) {
         Class240_Sub22_Sub16.hintHeadIconsSprites[var4] = var0.loadSprite(imagesData[var4], true);
      }

      imagesData = ImageUtils.method1797(cacheUnpacker, Class1.hintMarkersOffset * -2012069383, 0);
      Class1.hintMarkerSprites = new Sprite[imagesData.length];

      for(var4 = 0; var4 < imagesData.length; ++var4) {
         Class1.hintMarkerSprites[var4] = var0.loadSprite(imagesData[var4], true);
      }

      imagesData = ImageUtils.method1797(cacheUnpacker, Class1.flagCacheOffset * -34066357, 0);
      Class609.flagSprites = new Sprite[imagesData.length];
      byte rndomAmount = 25;

      int var5;
      for(var5 = 0; var5 < imagesData.length; ++var5) {
         imagesData[var5].setPosition(-rndomAmount + (int)(Math.random() * (double)rndomAmount * 2.0D), -rndomAmount + (int)(Math.random() * (double)rndomAmount * 2.0D), -rndomAmount + (int)(Math.random() * (double)rndomAmount * 2.0D));
         Class609.flagSprites[var5] = var0.loadSprite(imagesData[var5], true);
      }

      imagesData = ImageUtils.method1797(cacheUnpacker, 537518605 * ChatMessageCache.crossOffset, 0);
      Class1.crossSprites = new Sprite[imagesData.length];

      for(var5 = 0; var5 < imagesData.length; ++var5) {
         Class1.crossSprites[var5] = var0.loadSprite(imagesData[var5], true);
      }

      imagesData = ImageUtils.method1797(cacheUnpacker, Class1.mapDotsOffset * 1394677195, 0);
      Class438.mapDotSprites = new Sprite[imagesData.length];
      rndomAmount = 12;

      for(var5 = 0; var5 < imagesData.length; ++var5) {
         imagesData[var5].setPosition(-rndomAmount + (int)(Math.random() * (double)rndomAmount * 2.0D), -rndomAmount + (int)(Math.random() * (double)rndomAmount * 2.0D), -rndomAmount + (int)(Math.random() * (double)rndomAmount * 2.0D));
         Class438.mapDotSprites[var5] = var0.loadSprite(imagesData[var5], true);
      }

      imagesData = ImageUtils.method1797(cacheUnpacker, Class1.nameIconsOffset * 745788973, 0);
      Class481.nameIconsSprites = new Sprite[imagesData.length];
      rndomAmount = 12;

      for(var5 = 0; var5 < imagesData.length; ++var5) {
         imagesData[var5].setPosition(-rndomAmount + (int)(Math.random() * (double)rndomAmount * 2.0D), -rndomAmount + (int)(Math.random() * (double)rndomAmount * 2.0D), -rndomAmount + (int)(Math.random() * (double)rndomAmount * 2.0D));
         Class481.nameIconsSprites[var5] = var0.loadSprite(imagesData[var5], true);
      }

      Class240_Sub52_Sub1.compassSprite = var0.loadSprite(ImageUtils.getImageData(cacheUnpacker, -1167234361 * Class278.compassCacheOffset, 0), true);
      Class530.otherLeveLSprite = var0.loadSprite(ImageUtils.getImageData(cacheUnpacker, Class602.otherLevelOffset * 1205360691, 0), true);
      imagesData = ImageUtils.method1797(cacheUnpacker, AbstractServerConnection.mapEdgeHintOffset * -2088428725, 0);
      Class527.mapEdgeMarker = new Sprite[imagesData.length];

      for(var5 = 0; var5 < imagesData.length; ++var5) {
         Class527.mapEdgeMarker[var5] = var0.loadSprite(imagesData[var5], true);
      }

   }

   static final void method4860(RSInterface var0, int var1, int var2, RSInterfaceData var3, int var4) {
      if(var0.anIntArray_2508 == null) {
         throw new RuntimeException();
      } else {
         var0.anIntArray_2508[var1] = var2;
      }
   }

   static final void method4861(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub1_7295.method1402((byte)-74) == 1?1:0;
   }
}
