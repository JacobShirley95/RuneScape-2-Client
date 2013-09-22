
public class Class104_Sub11 extends CharTask {

   final int anInt_10193;
   final int anInt_10194;
   final int anInt_10195;
   final int anInt_10196;
   final int anInt_10197;
   public static Class68 aClass68_10198;
   public static Class240_Sub47 aClass240_Sub47_10199;


   public void execute() {
      RSCharacter var2 = Class95.aClass100Array_1894[1257075549 * this.anInt_10197].getTarget((byte)103);
      var2.damage(this.anInt_10194 * 185870687, this.anInt_10195 * 1651597827, -1109997453 * this.anInt_10196, -306036905 * this.anInt_10193, client.timer * -1025618511, 0, 1012825213);
   }

   Class104_Sub11(ByteArrayDataNode var1) {
      super(var1);
      this.anInt_10197 = var1.readShort(1301601086) * -376342283;
      int var2 = var1.readByte(249986327);
      if((var2 & 1) != 0) {
         this.anInt_10194 = var1.readShort(-1328031744) * -1598917985;
         this.anInt_10195 = var1.readShort(1371662986) * -371468117;
      } else {
         this.anInt_10194 = 1598917985;
         this.anInt_10195 = 371468117;
      }

      if((var2 & 2) != 0) {
         this.anInt_10196 = var1.readShort(1128325756) * -1739252549;
         this.anInt_10193 = var1.readShort(-720184076) * 1401756775;
      } else {
         this.anInt_10196 = 1739252549;
         this.anInt_10193 = -1401756775;
      }

      if(0 != (var2 & 4)) {
         int var3 = var1.readShort(1451277296);
         int var4 = var1.readShort(706759987);
         int var5 = var3 * 255 / var4;
         if(var3 > 0 && var5 < 1) {
            boolean var6 = true;
         }
      }

   }

   static final void method6845(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      float var3 = Class362.toRadians(var0.intTypes[1 + -831324111 * var0.intTypeIndex]);
      Class240_Sub22_Sub12 var4 = Class542.aClass43_Sub1_9475.method365(var2, (byte)-61);
      if(null == var4) {
         throw new RuntimeException("");
      } else if(!(var4 instanceof Class240_Sub22_Sub12_Sub2)) {
         throw new RuntimeException("");
      } else {
         ((Class240_Sub22_Sub12_Sub2)var4).method2255(var3, -1928195415);
      }
   }

   static int method6846(CharSequence var0, char var1, int var2) {
      int var3 = 0;
      int var4 = var0.length();

      for(int var5 = 0; var5 < var4; ++var5) {
         if(var0.charAt(var5) == var1) {
            ++var3;
         }
      }

      return var3;
   }
}
