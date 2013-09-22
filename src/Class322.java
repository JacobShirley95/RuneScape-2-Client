
public class Class322 {

   public int anInt_6205;
   public int anInt_6206;
   public final Animator anime;
   public int animationID = -1431556309;
   public int anInt_6209;


   Class322(RSCharacter var1) {
      this.anime = new Class507_Sub1(var1, false);
   }

   static final void method3966(RSInterfaceData var0, byte var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      int var3 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var2 + var3;
   }

   public static final RSInterface method3967(RSInterfaceGroup var0, RSInterface var1, int var2) {
      if(-671235497 * var1.parentID != -1) {
         return var0.getChildInterface(var1.parentID * -671235497, -1671512155);
      } else {
         if(!var0.aBoolean_2054) {
            int var3 = 1278853609 * var1.cacheID >>> 16;
            NodeListIterator var4 = new NodeListIterator(client.widgets);

            for(Class240_Sub16 var5 = (Class240_Sub16)var4.getFirst(); null != var5; var5 = (Class240_Sub16)var4.next()) {
               if(var5.widgetID * 1320796941 == var3) {
                  return RSServerQueue.getInterface((int)(var5.id * 4058728944299054175L), (byte)105);
               }
            }
         }

         return null;
      }
   }

   static final void method3968(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, byte var3) {
      if(4 == 1916189739 * var0.index) {
         Class535.method6064(var0, var1, var2, (byte)114);
      }
   }

   static final void method3969(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = AbstractCacheData.aBoolean_6915?1:0;
   }
}
