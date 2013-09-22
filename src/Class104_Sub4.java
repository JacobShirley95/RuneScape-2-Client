
public class Class104_Sub4 extends CharTask {

   final int anInt_4150;
   final int anInt_4151;
   final String aString_4152;
   final int anInt_4153;
   final int anInt_4154;
   static Class163 aClass163_4155;


   public void execute() {
      Class207.method2634(-763239015 * CacheFileID.anInt_2036, -944904055 * this.anInt_4154, 409868489 * this.anInt_4151, CompProfile.getHeight(-944904055 * this.anInt_4154, 409868489 * this.anInt_4151, -763239015 * CacheFileID.anInt_2036), this.anInt_4150 * 738017939, this.anInt_4153 * 1135089027, this.aString_4152, (byte)0);
   }

   Class104_Sub4(ByteArrayDataNode var1) {
      super(var1);
      this.anInt_4154 = var1.readShort(1840384319) * -2124149319;
      this.anInt_4151 = var1.readShort(-1082933119) * -483294855;
      this.aString_4152 = var1.method4485(-1385551178);
      this.anInt_4153 = var1.method4480(1260717178) * 910139691;
      this.anInt_4150 = var1.readShort(80295628) * -1998705765;
   }

   static final void method3197(RSInterfaceData var0, byte var1) {
      NPC var2 = (NPC)var0.animeTarget;
      String var3 = var2.name;
      NPCComposite var4 = var2.npcComposite;
      if(null != var4.anIntArray_8642) {
         var4 = var4.method5599(Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024, (byte)-108);
         if(var4 == null) {
            var3 = "";
         } else {
            var3 = var4.name;
         }
      }

      if(null == var3) {
         var3 = "";
      }

      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var3;
   }

   static final void method3198(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2 | 1 << var3;
   }
}
