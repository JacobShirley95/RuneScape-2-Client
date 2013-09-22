
public class Class231_Sub3 extends Class231 {

   short aShort_7898;
   String aString_7899;
   int anInt_7900 = (int)(Class373.getCurrentTime((short)6303) / 1000L) * 1516302821;


   Class231_Sub3(String var1, int var2) {
      this.aString_7899 = var1;
      this.aShort_7898 = (short)var2;
   }

   static final void method5143(Class240_Sub30 var0, boolean var1, int var2) {
      if(var0.aBoolean_7420) {
         if(-545370073 * var0.anInt_7412 < 0 || Class111.method1422(client.aClass296_348.method3755(-1961012446), var0.anInt_7412 * -545370073, var0.anInt_7414 * 145681877, (byte)-95)) {
            if(!var1) {
               Class483.method5723(-511987961 * var0.anInt_7423, var0.anInt_7410 * -2030620795, var0.anInt_7409 * -1480406251, var0.anInt_7422 * -1398294791, var0.anInt_7412 * -545370073, 1265937629 * var0.anInt_7413, 145681877 * var0.anInt_7414, -1, 0, -1141037021);
            } else {
               Class357.method4547(var0.anInt_7423 * -511987961, -2030620795 * var0.anInt_7410, -1480406251 * var0.anInt_7409, var0.anInt_7422 * -1398294791, (Class532)null, (byte)3);
            }

            var0.shiftNext();
         }
      } else if(var0.aBoolean_7419 && var0.anInt_7409 * -1480406251 >= 1 && var0.anInt_7422 * -1398294791 >= 1 && -1480406251 * var0.anInt_7409 <= client.aClass296_348.getMaxX((byte)-51) - 2 && var0.anInt_7422 * -1398294791 <= client.aClass296_348.getMaxY(-2070971592) - 2 && (var0.anInt_7415 * 373196795 < 0 || Class111.method1422(client.aClass296_348.method3755(-1609959031), var0.anInt_7415 * 373196795, -1403836025 * var0.anInt_7411, (byte)-105))) {
         if(!var1) {
            Class483.method5723(var0.anInt_7423 * -511987961, -2030620795 * var0.anInt_7410, var0.anInt_7409 * -1480406251, -1398294791 * var0.anInt_7422, var0.anInt_7415 * 373196795, 949595175 * var0.anInt_7416, var0.anInt_7411 * -1403836025, -1, 0, 920418249);
         } else {
            Class357.method4547(-511987961 * var0.anInt_7423, -2030620795 * var0.anInt_7410, -1480406251 * var0.anInt_7409, -1398294791 * var0.anInt_7422, var0.aClass532_7417, (byte)-22);
         }

         var0.aBoolean_7419 = false;
         if(!var1 && var0.anInt_7412 * -545370073 == var0.anInt_7415 * 373196795 && -545370073 * var0.anInt_7412 == -1) {
            var0.shiftNext();
         } else if(!var1 && -545370073 * var0.anInt_7412 == 373196795 * var0.anInt_7415 && 949595175 * var0.anInt_7416 == 1265937629 * var0.anInt_7413 && 145681877 * var0.anInt_7414 == var0.anInt_7411 * -1403836025) {
            var0.shiftNext();
         }
      }

   }
}
