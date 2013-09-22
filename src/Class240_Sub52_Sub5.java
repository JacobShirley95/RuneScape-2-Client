
public class Class240_Sub52_Sub5 extends Class240_Sub52 {

   byte aByte_1011;
   boolean aBoolean_1012;
   byte aByte_1013;
   byte aByte_1014;
   byte aByte_1015;
   // $FF: synthetic field
   final Class75 aClass75_1016;


   void method5261(ByteArrayDataNode var1, byte var2) {
      this.aBoolean_1012 = var1.readByte(1495816221) == 1;
      this.aByte_1015 = var1.getByte((byte)7);
      this.aByte_1013 = var1.getByte((byte)79);
      this.aByte_1014 = var1.getByte((byte)102);
      this.aByte_1011 = var1.getByte((byte)14);
   }

   Class240_Sub52_Sub5(Class75 var1) {
      this.aClass75_1016 = var1;
   }

   void method5260(Class68 var1, byte var2) {
      var1.aBoolean_1282 = this.aBoolean_1012;
      var1.aByte_1283 = this.aByte_1015;
      var1.aByte_1298 = this.aByte_1013;
      var1.aByte_1285 = this.aByte_1014;
      var1.aByte_1275 = this.aByte_1011;
   }
}
