
public class Class573 {

   final MapPoint aClass626_9657;
   final int anInt_9658;


   public Class563_Sub1_Sub2_Sub1 method6280(int var1) {
      Class240_Sub25 var2 = (Class240_Sub25)client.groundItems.getNode((long)(this.aClass626_9657.plane * -1025256637 << 28 | -1996781083 * this.aClass626_9657.loadedMapY << 14 | 1265321541 * this.aClass626_9657.loadedMapX));
      if(null == var2) {
         return null;
      } else {
         MapPoint var3 = client.aClass296_348.getMapArea();
         int var4 = this.aClass626_9657.loadedMapX * 1265321541 - 1265321541 * var3.loadedMapX;
         int var5 = -1996781083 * this.aClass626_9657.loadedMapY - -1996781083 * var3.loadedMapY;
         if(var4 >= 0 && var5 >= 0 && var4 < client.aClass296_348.getMaxX((byte)13) && var5 < client.aClass296_348.getMaxY(1991637777)) {
            for(Class240_Sub36 var6 = (Class240_Sub36)var2.itemList.getBaseNode_2((byte)58); null != var6; var6 = (Class240_Sub36)var2.itemList.getNext(139270954)) {
               if(var6.id * 1665912711 == this.anInt_9658 * 1704842353) {
                  return (Class563_Sub1_Sub2_Sub1)client.aClass296_348.getWorldObjects().method3426(this.aClass626_9657.plane * -1025256637, var4, var5, -621122417);
               }
            }
         }

         return null;
      }
   }

   public Class573(MapPoint var1, int var2) {
      this.aClass626_9657 = var1;
      this.anInt_9658 = 2099997841 * var2;
   }

   public static Class409 method6281(ByteArrayDataNode var0, int var1) {
      Class409 var2 = Class246.method3140(var0, (short)7116);
      int var3 = var0.method4493(-157074556);
      int var4 = var0.method4493(-157074556);
      int var5 = var0.method4493(-157074556);
      int var6 = var0.method4493(-157074556);
      int var7 = var0.method4493(-157074556);
      int var8 = var0.method4493(-157074556);
      return new Class409_Sub1(var2.aClass419_7760, var2.aClass412_7761, var2.anInt_7762 * 1684132453, var2.anInt_7766 * 731209435, 1912610703 * var2.anInt_7764, 1854937727 * var2.anInt_7765, -138079065 * var2.anInt_7763, var2.anInt_7767 * 1909120553, var2.anInt_7768 * 2062892803, var3, var4, var5, var6, var7, var8);
   }

   public static final void method6282(Class563_Sub1 var0, int var1, int var2) {
      Class105.method1357(var0, var1, true, (byte)25);
   }
}
