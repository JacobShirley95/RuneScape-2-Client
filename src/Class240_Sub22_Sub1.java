import java.io.File;

public class Class240_Sub22_Sub1 extends Class240_Sub22 {

   final String optionTargetString;
   final Class494 aClass494_798;
   int anInt_799;
   static File rootCacheDir;
   public static CacheDataUnpacker aCacheUnpacker_801;


   int getAction(short var1) {
      return this.aClass494_798.aClass240_Sub22_9036.aClass240_Sub22_7277 != this.aClass494_798.aClass240_Sub22_9036?((OptionListNode)this.aClass494_798.aClass240_Sub22_9036.aClass240_Sub22_7277).action * -533194375:-1;
   }

   boolean method209(OptionListNode var1, byte var2) {
      boolean var3 = true;
      var1.shiftNext();

      for(OptionListNode var4 = (OptionListNode)this.aClass494_798.method5772(-593051769); var4 != null; var3 = false) {
         if(Class21.method125(var1.action * -533194375, var4.action * -533194375, (byte)4)) {
            Class588.method6394(var1, var4, 1549667161);
            this.anInt_799 += -1991854607;
            return !var3;
         }

         var4 = (OptionListNode)this.aClass494_798.method5771(-1453217149);
      }

      this.aClass494_798.insert(var1, 1139428920);
      this.anInt_799 += -1991854607;
      return var3;
   }

   Class240_Sub22_Sub1(String var1) {
      this.optionTargetString = var1;
      this.aClass494_798 = new Class494();
   }

   boolean method210(OptionListNode var1, int var2) {
      int var3 = this.getAction((short)310);
      var1.shiftNext();
      this.anInt_799 -= -1991854607;
      if(0 == this.anInt_799 * -1686791407) {
         this.shiftNext();
         this.shiftNext();
         Class18.anInt_155 -= -1299761017;
         Class18.aClass627_161.insert(this, -7702105217297120635L * var1.optionData);
         return false;
      } else {
         return var3 != this.getAction((short)310);
      }
   }

   static final void method211(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(-826987519 * client.anInt_567 != 0 && var2 < client.ignoreListCount * -275736435) {
         IgnoredPlayer var3 = client.ignoreList[var2];
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var3.aString_111;
         if(null != var3.aString_112) {
            var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var3.aString_112;
         } else {
            var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
         }
      } else {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
      }

   }
}
