
public class Class66_Sub2 extends Class66 {

   final GameCoord aClass347_3837 = new GameCoord(Float.NaN, Float.NaN, Float.NaN);
   final GameCoord aClass347_3838 = new GameCoord();
   final GameCoord aClass347_3839 = new GameCoord(Float.NaN, Float.NaN, Float.NaN);
   int anInt_3840;


   public void method2812(Class240_Sub6 var1, byte var2) {
      this.aClass347_3839.floatX = (float)(var1.anInt_6764 * -78428807);
      this.aClass347_3839.floatY = (float)(var1.anInt_6763 * 1646052693);
      this.aClass347_3839.floatZ = (float)(-406791065 * var1.anInt_6761);
      if(Float.isNaN(this.aClass347_3837.floatX)) {
         this.aClass347_3837.setPos(this.aClass347_3839);
         this.aClass347_3838.method4311();
      }

      this.anInt_3840 = 2040394593 * var1.anInt_6760;
   }

   public Class240_Sub6 method668(int var1) {
      return new Class240_Sub6(this.anInt_3840 * 225113255, (int)this.aClass347_3837.floatX, (int)this.aClass347_3837.floatY, (int)this.aClass347_3837.floatZ);
   }

   public GameCoord method667(int var1) {
      return GameCoord.method4308(this.aClass347_3837);
   }

   public Class66_Sub2(Class43 var1) {
      super(var1);
   }

   public float method669(int var1) {
      return 0.0F;
   }

   public void method670(Class115 var1, int var2, int var3, int var4) {
      var1.anInt_2084 = 1892926905 * ((int)this.aClass347_3837.floatX - var2);
      var1.anInt_2083 = -213214267 * (int)(-this.aClass347_3837.floatY);
      var1.anInt_2082 = -851374433 * ((int)this.aClass347_3837.floatZ - var3);
   }

   public void method671(ByteArrayDataNode var1, byte var2) {
      this.aClass347_3839.method4335(var1);
   }

   public boolean method672(byte var1) {
      return !Float.isNaN(this.aClass347_3837.floatX);
   }

   public void method666(float var1, int[][][] var2, Class281 var3, int var4, int var5, int var6) {
      this.aClass43_1256.method391(true, var1, this.aClass347_3837, this.aClass43_1256.method392(657096939), this.aClass347_3839, this.aClass347_3838, -1955526954);
   }

   static final void method2820(RSInterfaceData var0, short var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      AbstractServerConnection.method3077(var3, var4, var0, (byte)73);
   }

   static final void method2821(RSInterfaceData var0, int var1) {
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub17_7299, var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111] == 1?1:0, -326023696);
      Class83.method1089(-1292112021);
      Class481.method5706(-834672780);
      client.aBoolean_568 = false;
   }
}
