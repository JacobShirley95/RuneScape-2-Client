
public class Class240_Sub19 extends NodeListNode {

   Class240_Sub41_Sub5 aClass240_Sub41_Sub5_7143;
   static NodeList aNodeList_7144 = new NodeList();
   static final int anInt_7145 = 0;
   static NodeArrayList aNodeArrayList_7146 = new NodeArrayList(16);
   int anInt_7147;
   int anInt_7148;
   int anInt_7149;
   boolean aBoolean_7150;
   int[] anIntArray_7151;
   int anInt_7152;
   int anInt_7153;
   int anInt_7154;
   int anInt_7155;
   int anInt_7156;
   Class534 aClass534_7157;
   Class240_Sub7_Sub1_Sub2 aClass240_Sub7_Sub1_Sub2_7158;
   static final int anInt_7159 = 1;
   static final int anInt_7160 = 2;
   Player aClass563_Sub1_Sub4_Sub4_Sub1_7161;
   int anInt_7162 = 0;
   boolean aBoolean_7163;
   int anInt_7164;
   int anInt_7165;
   int anInt_7166;
   boolean aBoolean_7167;
   Class240_Sub2 aClass240_Sub2_7168;
   Class240_Sub7_Sub1_Sub2 aClass240_Sub7_Sub1_Sub2_7169;
   Class240_Sub41_Sub5 aClass240_Sub41_Sub5_7170;
   static final int anInt_7171 = 512;
   int anInt_7172;
   NPC aClass563_Sub1_Sub4_Sub4_Sub2_7173;
   int anInt_7174;
   Class240_Sub2 aClass240_Sub2_7175;
   int anInt_7176;
   static final int anInt_7177 = 3;
   static NodeList aNodeList_7178 = new NodeList();
   static WorldMapText aClass198_7179;


   void method4783(byte var1) {
      int var2 = this.anInt_7166 * 1828702211;
      boolean var3 = this.aBoolean_7167;
      if(null != this.aClass534_7157) {
         Class534 var4 = this.aClass534_7157.method6048(Class240_Sub41_Sub3.aClass23_1024, (Class184)(1 == 415041591 * client.anInt_356?Class95.aClass184_1901:Class240_Sub41_Sub3.aClass23_1024), 1162979012);
         if(null != var4) {
            this.anInt_7166 = 1269762609 * var4.anInt_9418;
            this.aBoolean_7167 = var4.aBoolean_9422;
            this.anInt_7153 = 1744535249 * (var4.anInt_9431 * 15595835 << 9);
            this.anInt_7154 = var4.anInt_9410 * 1151838069;
            this.anInt_7152 = var4.anInt_9371 * -198213369;
            this.anInt_7172 = 942432755 * var4.anInt_9424;
            this.anIntArray_7151 = var4.anIntArray_9425;
            this.aBoolean_7150 = var4.aBoolean_9435;
            this.anInt_7165 = 962803011 * var4.anInt_9360;
            this.anInt_7156 = -1051569233 * var4.anInt_9434;
         } else {
            this.anInt_7166 = 1786305877;
            this.aBoolean_7167 = false;
            this.anInt_7153 = 0;
            this.anInt_7154 = 0;
            this.anInt_7152 = 0;
            this.anInt_7172 = 0;
            this.anIntArray_7151 = null;
            this.aBoolean_7150 = false;
            this.anInt_7165 = 133500160;
            this.anInt_7156 = -972637952;
            this.anInt_7164 = 0;
         }
      } else if(this.aClass563_Sub1_Sub4_Sub4_Sub2_7173 != null) {
         int var6 = Class321.method3964(this.aClass563_Sub1_Sub4_Sub4_Sub2_7173, 1658546583);
         if(var6 != var2) {
            this.anInt_7166 = -1786305877 * var6;
            NPCComposite var5 = this.aClass563_Sub1_Sub4_Sub4_Sub2_7173.npcComposite;
            if(null != var5.anIntArray_8642) {
               var5 = var5.method5599(Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024, (byte)-72);
            }

            if(var5 != null) {
               this.anInt_7153 = 1744535249 * (1349219197 * var5.anInt_8659 << 9);
               this.anInt_7164 = (769484925 * var5.anInt_8656 << 9) * 255821715;
               this.anInt_7154 = var5.anInt_8661 * 1004078415;
               this.aBoolean_7167 = var5.aBoolean_8662;
               this.anInt_7165 = var5.anInt_8622 * 1119906577;
               this.anInt_7156 = var5.anInt_8670 * -843630791;
            } else {
               this.anInt_7164 = 0;
               this.anInt_7153 = 0;
               this.anInt_7154 = 0;
               this.aBoolean_7167 = this.aClass563_Sub1_Sub4_Sub4_Sub2_7173.npcComposite.aBoolean_8662;
               this.anInt_7165 = 133500160;
               this.anInt_7156 = -972637952;
            }
         }
      } else if(null != this.aClass563_Sub1_Sub4_Sub4_Sub1_7161) {
         this.anInt_7166 = Class457.method5552(this.aClass563_Sub1_Sub4_Sub4_Sub1_7161, (byte)-81) * -1786305877;
         this.aBoolean_7167 = this.aClass563_Sub1_Sub4_Sub4_Sub1_7161.aBoolean_1477;
         this.anInt_7153 = 1744535249 * (this.aClass563_Sub1_Sub4_Sub4_Sub1_7161.anInt_1478 * -790407235 << 9);
         this.anInt_7164 = 0;
         this.anInt_7154 = 2102157735 * this.aClass563_Sub1_Sub4_Sub4_Sub1_7161.anInt_1479;
         this.anInt_7165 = 133500160;
         this.anInt_7156 = -972637952;
      }

      if((var2 != this.anInt_7166 * 1828702211 || var3 != this.aBoolean_7167) && null != this.aClass240_Sub41_Sub5_7170) {
         Class217.aClass240_Sub41_Sub4_3757.method531(this.aClass240_Sub41_Sub5_7170);
         this.aClass240_Sub41_Sub5_7170 = null;
         this.aClass240_Sub7_Sub1_Sub2_7169 = null;
         this.aClass240_Sub2_7168 = null;
      }

   }

   public static void method4784(int var0, int var1) {
      Class248_Sub1.anInt_6453 = 2140620407;
      Class248_Sub1.anInt_6454 = -1309236803 * var0;
      Class533.anInt_9358 = 1414042335;
      Class467.anInt_8690 = -1752306084;
   }

   static final void method4785(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
   }

   public static void method4786(int var0) {
      if(null != Class344.aClass345Array_6558) {
         Class345[] var1 = Class344.aClass345Array_6558;

         for(int var2 = 0; var2 < var1.length; ++var2) {
            Class345 var3 = var1[var2];
            var3.method4291((byte)14);
         }
      }

   }

   public static void method4787(CacheDataUnpacker var0, byte var1) {
      Class1.p11_fullOffset = var0.getCacheOffset("p11_full") * -1719561233;
      Class1.p12_fullOffset = var0.getCacheOffset("p12_full") * 382654933;
      Class1.p13_fullOffset = var0.getCacheOffset("b12_full") * -1965083997;
   }
}
