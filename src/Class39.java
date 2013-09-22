import java.awt.Frame;

public class Class39 {

   static final Class39 aClass39_863 = new Class39(0);
   static final Class39 aClass39_864 = new Class39(1);
   final int anInt_865;
   static OptionListNode aClass240_Sub22_Sub3_866;
   public static CacheDataUnpacker aCacheUnpacker_867;


   Class39(int var1) {
      this.anInt_865 = var1 * 182661201;
   }

   public static int method319(int var0, int var1, byte var2) {
      int var3 = var1 >>> 24;
      int var4 = 255 - var3;
      var1 = ((var1 & 16711935) * var3 & -16711936 | var3 * (var1 & '\uff00') & 16711680) >>> 8;
      return var1 + ((var4 * (var0 & 16711935) & -16711936 | var4 * (var0 & '\uff00') & 16711680) >>> 8);
   }

   public static void method320(GraphicsDataHolder var0, Frame var1, int var2) {
      var0.method5948(465403061);
      var1.setVisible(false);
      var1.dispose();
   }

   static void addOption(OptionListNode var0, byte var1) {
      if(null != var0) {
         Class18.optionNodeList.addNode(var0, (short)-6680);
         Class18.optionCount += 1728369409;
         Class240_Sub22_Sub1 var2 = null;
         if(!var0.aBoolean_954 && !"".equals(var0.optionString)) {
            long var3 = var0.optionData * -7702105217297120635L;

            for(var2 = (Class240_Sub22_Sub1)Class18.aNodeArrayList_157.getNode(var3); var2 != null && !var2.optionTargetString.equals(var0.optionString); var2 = (Class240_Sub22_Sub1)Class18.aNodeArrayList_157.method5939(-1135136201)) {
               ;
            }

            if(var2 == null) {
               var2 = (Class240_Sub22_Sub1)Class18.aClass627_161.getObject(var3);
               if(null != var2 && !var2.optionTargetString.equals(var0.optionString)) {
                  var2 = null;
               }

               if(var2 == null) {
                  var2 = new Class240_Sub22_Sub1(var0.optionString);
               }

               Class18.aNodeArrayList_157.insert(var2, var3);
               Class18.anInt_155 += -1299761017;
            }
         } else {
            var2 = new Class240_Sub22_Sub1(var0.optionString);
            Class18.anInt_155 += -1299761017;
         }

         if(var2.method209(var0, (byte)0)) {
            ClientSuper.method2890(var2, (byte)108);
         }

      }
   }

   static final void method322(RSInterfaceData var0, int var1) {
      Class462.anInt_8604 = 0;
   }
}
