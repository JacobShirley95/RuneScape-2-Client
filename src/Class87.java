import java.util.HashMap;
import java.util.Map;

public class Class87 {

   public static final Class87 aClass87_1759 = new Class87(0, 1);
   static final Class87 aClass87_1760 = new Class87(6, 2);
   static final Class87 aClass87_1761 = new Class87(2, 4);
   public static final Class87 aClass87_1762 = new Class87(3, 3);
   public static final Class87 aClass87_1763 = new Class87(7, 2);
   public final int anInt_1764;
   static final Class87 aClass87_1765 = new Class87(5, 4);
   public static final Class87 aClass87_1766 = new Class87(4, 2);
   public static final Class87 aClass87_1767 = new Class87(1, 4);
   public final int anInt_1768;
   static final Class87 aClass87_1769 = new Class87(8, 1);
   static AbstractImageData aClass106_1770;


   static void method1139(int var0) {
      Class15.availablePlayers = 0;

      for(int var1 = 0; var1 < 2048; ++var1) {
         Class15.aClass240_Sub8Array_126[var1] = null;
         Class15.aByteArray_124[var1] = Class539.aClass539_9455.aByte_9460;
         Class15.aClass21Array_130[var1] = null;
      }

   }

   static void method1140(Renderer var0, RSInterface var1, int var2) {
      boolean var3 = Class592.cacheObjectLoader.getInvSprite(var0, var1.itemID * 2142376247, var1.itemAmount * 736448653, 83469535 * var1.anInt_2463, -16777216 | -61088611 * var1.anInt_2464, -353582865 * var1.anInt_2564, var1.isWorn?Class521.myPlayer.composite:null, 1263657261) == null;
      if(var3) {
         Class17.requestedItems.addNode(new Class240_Sub32(var1.itemID * 2142376247, 736448653 * var1.itemAmount, 83469535 * var1.anInt_2463, -16777216 | -61088611 * var1.anInt_2464, -353582865 * var1.anInt_2564, var1.isWorn), (short)12825);
         Class110_Sub1.method3149(var1, -1300822201);
      }

   }

   Class87(int var1, int var2) {
      this.anInt_1768 = var1 * 1648344477;
      this.anInt_1764 = var2 * -1511238763;
   }

   public static int method1141(int var0, int var1) {
      ChatMessageCache var2 = (ChatMessageCache)Class109.aMap_2042.get(Integer.valueOf(var0));
      return var2 == null?0:var2.method1646((byte)-23);
   }

   public static void method1142(Class123 var0, int var1, byte var2) {
      var1 = var1 * Class104_Sub21.renderSettings.aClass540_Sub14_7323.method1701(-1546009949) >> 8;
      if(null == var0) {
         Class586.method6365((short)353);
      } else {
         Class261.method3490(var0, var1, (short)25522);
         Class286.method3696(-545996162);
      }
   }

   static final void method1143(RSInterfaceData var0, short var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      MapIcon var3 = Class126.mapIconUnpacker.loadIcon(var2);
      if(var3.iconTitle == null) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
      } else {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var3.iconTitle;
      }

   }

   public static Map method1144(Class212_Sub1[] var0, byte var1) {
      if(null != var0 && 0 != var0.length) {
         HashMap var2 = new HashMap();
         Class212_Sub1[] var3 = var0;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            Class212_Sub1 var5 = var3[var4];
            var2.put(var5.aClass283_8532, var5);
         }

         return var2;
      } else {
         return null;
      }
   }
}
