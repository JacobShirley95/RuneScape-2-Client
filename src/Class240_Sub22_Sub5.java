
public class Class240_Sub22_Sub5 extends Class240_Sub22 {

   static final int anInt_1161 = 17;
   static final int anInt_1162 = 12;
   int anInt_1163;
   static final int anInt_1164 = 5;
   int anInt_1165;
   static final int anInt_1166 = 2;
   static final int anInt_1167 = 3;
   static final int anInt_1168 = 4;
   static final int anInt_1169 = 1;
   static final int anInt_1170 = 6;
   static final int anInt_1171 = 7;
   static final int anInt_1172 = 8;
   static final int anInt_1173 = 9;
   static final int anInt_1174 = 10;
   int anInt_1175;
   static final int anInt_1176 = 16;
   static final int anInt_1177 = 11;
   static final int anInt_1178 = 14;
   static final int anInt_1179 = 15;
   static final int anInt_1180 = 13;
   String aString_1181;
   static final int anInt_1182 = 20;
   static final int anInt_1183 = 21;
   static final int anInt_1184 = 22;
   static final int anInt_1185 = 23;
   static Class494 aClass494_1186 = new Class494();
   static Class494 aClass494_1187 = new Class494();
   static NodeArrayList aNodeArrayList_1188 = new NodeArrayList(16);
   static final long aLong_1189 = Long.MAX_VALUE;
   static final long aLong_1190 = Long.MIN_VALUE;
   static final long aLong_1191 = 500L;


   long method593(int var1) {
      return this.id * 4058728944299054175L & 72057594037927935L;
   }

   long method594(int var1) {
      return 2950103203925786055L * this.aLong_7278 & Long.MAX_VALUE;
   }

   Class240_Sub22_Sub5(int var1, long var2) {
      this.id = -3961580539627386977L * ((long)var1 << 56 | var2);
   }

   int method595(int var1) {
      return (int)(4058728944299054175L * this.id >>> 56 & 255L);
   }

   void method596(byte var1) {
      this.aLong_7278 = (this.aLong_7278 * 2950103203925786055L | Long.MIN_VALUE) * -390861045572062217L;
      if(this.method594(-1219289223) == 0L) {
         aClass494_1186.insert(this, 1140578352);
      }

   }

   void method597(byte var1) {
      this.aLong_7278 = (this.aLong_7278 * 2950103203925786055L & Long.MIN_VALUE | Class373.getCurrentTime((short)16947) + 500L) * -390861045572062217L;
      aClass494_1187.insert(this, 1283683227);
   }

   static final void method598(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -1416056414;
      Class240_Sub22_Sub17 var2 = Class45.aClass432_960.method5411(var0.intTypes[var0.intTypeIndex * -831324111], -419957348);
      int var3 = var0.intTypes[-831324111 * var0.intTypeIndex + 1];
      int var4 = -1;

      for(int var5 = 0; var5 < -887456941 * var2.anInt_8435; ++var5) {
         if(var3 == var2.anIntArray_8434[var5]) {
            var4 = var2.anIntArray_8433[var5];
            break;
         }
      }

      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var4;
   }
}
