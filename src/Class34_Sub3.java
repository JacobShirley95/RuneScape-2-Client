
public class Class34_Sub3 extends Class34 {

   Class34_Sub3(CacheDataUnpacker var1, CacheDataUnpacker var2, Class409_Sub3 var3) {
      super(var1, var2, var3);
   }

   void method257(boolean var1, int var2, int var3, int var4) {
      Class286.gameRenderer.method1920(var2 - 2, var3, 4 + 1912610703 * this.aClass409_827.anInt_7764, 2 + 1854937727 * this.aClass409_827.anInt_7765, ((Class409_Sub3)this.aClass409_827).anInt_4016 * -1614651297, 0);
      Class286.gameRenderer.method1920(var2 - 1, 1 + var3, this.aClass409_827.anInt_7764 * 1912610703 + 2, this.aClass409_827.anInt_7765 * 1854937727, 0, 0);
   }

   void method256(boolean var1, int var2, int var3, int var4) {
      int var5 = this.method253((byte)-16) * this.aClass409_827.anInt_7764 * 1912610703 / 10000;
      Class286.gameRenderer.drawOutline(var2, 2 + var3, var5, 1854937727 * this.aClass409_827.anInt_7765 - 2, ((Class409_Sub3)this.aClass409_827).anInt_4015 * 1560797229, 0);
      Class286.gameRenderer.drawOutline(var2 + var5, 2 + var3, 1912610703 * this.aClass409_827.anInt_7764 - var5, 1854937727 * this.aClass409_827.anInt_7765 - 2, 0, 0);
   }

   public static void method2775(int var0, int var1, int var2, int var3, Class534 var4, NPC var5, Player var6, int var7) {
      Class240_Sub19 var8 = new Class240_Sub19();
      var8.anInt_7147 = var0 * -1550687659;
      var8.anInt_7148 = (var1 << 9) * 1828374563;
      var8.anInt_7149 = -694677133 * (var2 << 9);
      if(null != var4) {
         var8.aClass534_7157 = var4;
         int var9 = -215704445 * var4.anInt_9377;
         int var10 = var4.anInt_9423 * -220503463;
         if(1 == var3 || var3 == 3) {
            var9 = -220503463 * var4.anInt_9423;
            var10 = var4.anInt_9377 * -215704445;
         }

         var8.anInt_7176 = (var9 + var1 << 9) * -1690930069;
         var8.anInt_7174 = 492108747 * (var10 + var2 << 9);
         var8.anInt_7166 = 1269762609 * var4.anInt_9418;
         var8.aBoolean_7167 = var4.aBoolean_9422;
         var8.anInt_7153 = 1744535249 * (15595835 * var4.anInt_9431 << 9);
         var8.anInt_7154 = var4.anInt_9410 * 1151838069;
         var8.anInt_7152 = -198213369 * var4.anInt_9371;
         var8.anInt_7172 = 942432755 * var4.anInt_9424;
         var8.anIntArray_7151 = var4.anIntArray_9425;
         var8.aBoolean_7150 = var4.aBoolean_9435;
         var8.anInt_7165 = 962803011 * var4.anInt_9360;
         var8.anInt_7156 = -1051569233 * var4.anInt_9434;
         var8.anInt_7164 = 255821715 * (-1885459427 * var4.anInt_9420 << 9);
         if(null != var4.anIntArray_9415) {
            var8.aBoolean_7163 = true;
            var8.method4783((byte)48);
         }

         if(var8.anIntArray_7151 != null) {
            var8.anInt_7155 = (1653145547 * var8.anInt_7152 + (int)(Math.random() * (double)(var8.anInt_7172 * -151258287 - 1653145547 * var8.anInt_7152))) * 1102897197;
         }

         Class240_Sub19.aNodeList_7144.addNode(var8, (short)-17556);
      } else if(null != var5) {
         var8.aClass563_Sub1_Sub4_Sub4_Sub2_7173 = var5;
         NPCComposite var11 = var5.npcComposite;
         if(var11.anIntArray_8642 != null) {
            var8.aBoolean_7163 = true;
            var11 = var11.method5599(Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024, (byte)-28);
         }

         if(var11 != null) {
            var8.anInt_7176 = -1690930069 * (-1792142631 * var11.anInt_8665 + var1 << 9);
            var8.anInt_7174 = 492108747 * (var2 + var11.anInt_8665 * -1792142631 << 9);
            var8.anInt_7166 = Class321.method3964(var5, -178608992) * -1786305877;
            var8.aBoolean_7167 = var11.aBoolean_8662;
            var8.anInt_7153 = (1349219197 * var11.anInt_8659 << 9) * 1744535249;
            var8.anInt_7154 = 1004078415 * var11.anInt_8661;
            var8.anInt_7165 = 1119906577 * var11.anInt_8622;
            var8.anInt_7156 = var11.anInt_8670 * -843630791;
            var8.anInt_7164 = (var11.anInt_8656 * 769484925 << 9) * 255821715;
         }

         Class240_Sub19.aNodeList_7178.addNode(var8, (short)-8158);
      } else if(null != var6) {
         var8.aClass563_Sub1_Sub4_Sub4_Sub1_7161 = var6;
         var8.anInt_7176 = (var1 + var6.method3257() << 9) * -1690930069;
         var8.anInt_7174 = (var2 + var6.method3257() << 9) * 492108747;
         var8.anInt_7166 = Class457.method5552(var6, (byte)37) * -1786305877;
         var8.aBoolean_7167 = var6.aBoolean_1477;
         var8.anInt_7153 = 1744535249 * (var6.anInt_1478 * -790407235 << 9);
         var8.anInt_7154 = var6.anInt_1479 * 2102157735;
         var8.anInt_7165 = 133500160;
         var8.anInt_7156 = -972637952;
         var8.anInt_7164 = 0;
         Class240_Sub19.aNodeArrayList_7146.insert(var8, (long)(50743311 * var6.index));
      }

   }

   static final void method2776(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1374043613 * Class11.anInt_71;
   }
}
