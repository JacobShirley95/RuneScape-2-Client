
public class Class582 {

   public static final int anInt_9706 = 6;
   public static boolean aBoolean_9707;


   Class582() throws Throwable {
      throw new Error();
   }

   static final void method6325(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      Class476 var4 = Class240_Sub1.aClass465_6506.method5610(var3, 500588348);
      if(var4.method5681(-1574332591)) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = Class104_Sub6.characterUnpacker.method5670(var2, 1449521856).method5594(var3, var4.aString_8738, (byte)-33);
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub6.characterUnpacker.method5670(var2, 584034773).method5598(var3, -80630797 * var4.anInt_8739, 1359252489);
      }

   }

   static void method6326(OptionListNode var0, int var1) {
      if(!Class18.optionsClosed) {
         var0.shiftNext();
         Class18.optionCount -= 1728369409;
         if(!var0.aBoolean_954) {
            long var2 = var0.optionData * -7702105217297120635L;

            Class240_Sub22_Sub1 var4;
            for(var4 = (Class240_Sub22_Sub1)Class18.aNodeArrayList_157.getNode(var2); var4 != null && !var4.optionTargetString.equals(var0.optionString); var4 = (Class240_Sub22_Sub1)Class18.aNodeArrayList_157.method5939(-1135136201)) {
               ;
            }

            if(var4 != null && var4.method210(var0, -1826035018)) {
               ClientSuper.method2890(var4, (byte)122);
            }
         } else {
            for(Class240_Sub22_Sub1 var5 = (Class240_Sub22_Sub1)Class18.aClass494_158.method5772(-895716946); var5 != null; var5 = (Class240_Sub22_Sub1)Class18.aClass494_158.method5771(-728939522)) {
               if(var5.optionTargetString.equals(var0.optionString)) {
                  boolean var6 = false;

                  for(OptionListNode var7 = (OptionListNode)var5.aClass494_798.method5772(232522385); var7 != null; var7 = (OptionListNode)var5.aClass494_798.method5771(-315942262)) {
                     if(var0 == var7) {
                        if(var5.method210(var0, -1278787119)) {
                           ClientSuper.method2890(var5, (byte)27);
                        }

                        var6 = true;
                        break;
                     }
                  }

                  if(var6) {
                     break;
                  }
               }
            }
         }

      }
   }
}
