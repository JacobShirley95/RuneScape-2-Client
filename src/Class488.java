
public abstract class Class488 {

   protected final int anInt_8994;
   protected final boolean aBoolean_8995;
   protected final int anInt_8996;
   protected final int anInt_8997;
   protected final int anInt_8998;
   protected final int anInt_8999;
   protected final int anInt_9000;
   protected final boolean aBoolean_9001;
   protected final int anInt_9002;


   Class488(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8, int var9) {
      this.anInt_9000 = -173668117 * var1;
      this.anInt_8994 = 1956269893 * var2;
      this.anInt_8996 = (var3 > '\uffff'?'\uffff':var3) * 953076181;
      this.anInt_8997 = var4 * -349989731;
      this.anInt_8998 = 1185458405 * (var5 > 255?255:var5);
      this.anInt_8999 = var6 * -870188567;
      this.aBoolean_9001 = var7;
      this.aBoolean_8995 = var8;
      this.anInt_9002 = var9 * -405654425;
   }

   public static final void method5744(byte var0) {
      int var1 = Class104_Sub21.renderSettings.aClass540_Sub24_7297.method4126(1229376409);
      if(0 == var1) {
         client.aClass296_348.method3759((byte[][][])null, 930391785);
         Class104_Sub12.method7126(0, (byte)-39);
      } else if(1 == var1) {
         Class612.method6576((byte)0, -1223104199);
         Class104_Sub12.method7126(512, (byte)-5);
         if(client.aClass296_348.getWorldObjects() != null) {
            Class540_Sub26.method4201(1002455210);
         }
      } else {
         Class612.method6576((byte)(client.anInt_409 * 838393341 - 4 & 255), -1282862457);
         Class104_Sub12.method7126(2, (byte)-73);
      }

      client.anInt_424 = 933688189 * CacheFileID.anInt_2036;
   }

   static final void setScreenMarkerPos(int var0, int gameX, int gameY, int var3, int heightMod, boolean whenHidden, int var6) {
      if(!whenHidden && (gameX < 512 || gameY < 512 || gameX > (client.aClass296_348.getMaxX((byte)10) - 2) * 512 || gameY > (client.aClass296_348.getMaxY(-1347693982) - 2) * 512)) {
    	 //off-screen
         client.calculatedPosition[0] = -1.0F;
         client.calculatedPosition[1] = -1.0F;
      } else {
         int y = CompProfile.getHeight(gameX, gameY, var0) - heightMod;
         client.gameViewport.setAs(Class286.gameRenderer.getViewport());
         client.gameViewport.setOffset((float)var3, 0.0F, 0.0F);
         Class286.gameRenderer.setViewport(client.gameViewport);
         if(whenHidden) {
            Class286.gameRenderer.getScreenPosHidden((float)gameX, (float)y, (float)gameY, client.calculatedPosition);
         } else {
            Class286.gameRenderer.getScreenPosVisible((float)gameX, (float)y, (float)gameY, client.calculatedPosition);
         }

         client.gameViewport.setOffset((float)(-var3), 0.0F, 0.0F);
         Class286.gameRenderer.setViewport(client.gameViewport);
         client.calculatedPosition[0] -= (float)(client.anInt_561 * -1558966173);
         client.calculatedPosition[1] -= (float)(1888634749 * client.anInt_562);
      }
   }
}
