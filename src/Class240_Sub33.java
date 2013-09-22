import java.awt.Canvas;

public class Class240_Sub33 extends NodeListNode {

   int anInt_7470 = Integer.MIN_VALUE;
   int anInt_7471 = 1013135911;
   int anInt_7472 = -340780871;
   int anInt_7473 = 1985183029;
   int anInt_7474 = Integer.MIN_VALUE;
   int anInt_7475 = 1242937705;
   int anInt_7476 = Integer.MIN_VALUE;
   int anInt_7477 = Integer.MIN_VALUE;
   Class240_Sub12 aClass240_Sub12_7478;


   Class240_Sub33(Class240_Sub12 var1) {
      this.aClass240_Sub12_7478 = var1;
   }

   boolean method4884(int var1, int var2, int var3) {
      return var1 >= -1828105501 * this.anInt_7473 && var1 <= 1500116527 * this.anInt_7470 && var2 >= this.anInt_7472 * -807169417 && var2 <= this.anInt_7476 * 2104620735?true:var1 >= this.anInt_7471 * -1583388055 && var1 <= -1660485051 * this.anInt_7474 && var2 >= this.anInt_7475 * -1900439257 && var2 <= this.anInt_7477 * -950353789;
   }

   public static OptionListNode method4885(int var0) {
      return Class465.firstOptionNode;
   }

   static void method4886(Renderer var0, byte var1) {
      if(Class17.requestedItems.getSize(1279861479) != 0) {
         Class240_Sub32 var2;
         if(Class104_Sub21.renderSettings.currentToolkit.getToolkitID() == 0) {
            for(var2 = (Class240_Sub32)Class17.requestedItems.getBaseNode_2((byte)48); null != var2; var2 = (Class240_Sub32)Class17.requestedItems.getNext(-562409418)) {
               Class592.cacheObjectLoader.getInvSprite(var0, var0, 2034794145 * var2.anInt_7463, -1928222813 * var2.anInt_7464, 1444614967 * var2.anInt_7462, var2.anInt_7465 * -2106434831, false, false, 895570911 * var2.anInt_7460, Class585.aTextRenderer_9728, var2.aBoolean_7461?Class521.myPlayer.composite:null, 282154459);
               var2.shiftNext();
            }

            Class104_Sub3.method3180(2105623373);
         } else {
            if(Class17.aRenderer_139 == null) {
               Canvas var3 = new Canvas();
               var3.setSize(36, 32);
               Class17.aRenderer_139 = AnimationUnpacker.getRenderer(0, var3, FontRenderer_Sub3.aClass163_10701, RSInterfaceGroup.aClass96_2057, Class465.aCacheUnpacker_8678, 0, (short)-19584);
               Class17.aTextRenderer_140 = Class17.aRenderer_139.method1935(Class410.method5063(Class5.aCacheUnpacker_31, -1888224497 * Class1.p11_fullOffset, 0, -153301211), (ImageData[])((ImageData[])ImageUtils.method1797(Class301.mmUnpacker, Class1.p11_fullOffset * -1888224497, 0)), true);
            }

            for(var2 = (Class240_Sub32)Class17.requestedItems.getBaseNode_2((byte)42); null != var2; var2 = (Class240_Sub32)Class17.requestedItems.getNext(46852796)) {
               Class592.cacheObjectLoader.getInvSprite(Class17.aRenderer_139, var0, 2034794145 * var2.anInt_7463, var2.anInt_7464 * -1928222813, var2.anInt_7462 * 1444614967, -2106434831 * var2.anInt_7465, false, false, 895570911 * var2.anInt_7460, Class17.aTextRenderer_140, var2.aBoolean_7461?Class521.myPlayer.composite:null, -1284301693);
               var2.shiftNext();
            }
         }

      }
   }

   static final void method4887(RSInterfaceData var0, short var1) {
      String var2 = null;
      if(null != GamePack.aClass9_9270) {
         var2 = GamePack.aClass9_9270.method49((byte)0);
      }

      if(var2 == null) {
         var2 = "";
      }

      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var2;
   }
}
