
public class Class540_Sub19 extends Setting {

   static final int anInt_6214 = 0;
   static final int anInt_6215 = 2;


   public Class540_Sub19(RenderSettings var1) {
      super(var1);
   }

   public int method4007(int var1) {
      return this.mode * -2021544293;
   }

   int method6079(byte var1) {
      return 0;
   }

   public boolean method4009(byte var1) {
      return true;
   }

   public int method6082(int var1, int var2) {
      return 2 == var1?2:1;
   }

   public void method4011(int var1) {
      if(this.mode * -2021544293 < 0 || -2021544293 * this.mode > 2) {
         this.mode = this.method6079((byte)33) * -1389394029;
      }

   }

   public Class540_Sub19(int var1, RenderSettings var2) {
      super(var1, var2);
   }

   void method6081(int var1, int var2) {
      this.mode = var1 * -1389394029;
   }

   static GamePack[] method4013(byte var0) {
      return new GamePack[]{GamePack.runescapePack, GamePack.aClass523_9268, GamePack.aClass523_9265, GamePack.stellardawnPack, GamePack.aClass523_9263, GamePack.aClass523_9266};
   }

   static final void drawCross(int var0, int var1, int var2, int var3, byte var4) {
      int var5 = -1419504815 * client.targetX;
      int var6 = client.targetY * 2028183273;
      Sprite var7;
      if(1 == client.interactionType * 421562689) {
         var7 = Class1.crossSprites[-1298239909 * client.crossSprite / 100];
         var7.drawAt(var5 - 8, var6 - 8);
      }

      if(2 == client.interactionType * 421562689) {
         var7 = Class1.crossSprites[client.crossSprite * -1298239909 / 100 + 4];
         var7.drawAt(var5 - 8, var6 - 8);
      }

   }
}
