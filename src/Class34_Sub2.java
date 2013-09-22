
public class Class34_Sub2 extends Class34 {

   Sprite aClass170_3763;
   Sprite aClass170_3764;
   Sprite aClass170_3765;
   Sprite aClass170_3766;
   Sprite aClass170_3767;
   Sprite aClass170_3768;


   public boolean method811(byte var1) {
      if(!super.method811((byte)90)) {
         return false;
      } else {
         Class409_Sub1 var2 = (Class409_Sub1)this.aClass409_827;
         return !this.aCacheUnpacker_825.hasData(var2.anInt_3798 * -896286957, -633135158)?false:(!this.aCacheUnpacker_825.hasData(var2.anInt_3795 * 722877179, -1455612586)?false:(!this.aCacheUnpacker_825.hasData(var2.anInt_3794 * 410784329, 228546318)?false:(!this.aCacheUnpacker_825.hasData(var2.anInt_3797 * 1337644989, 935823735)?false:(!this.aCacheUnpacker_825.hasData(-1994119709 * var2.anInt_3799, 422246622)?false:this.aCacheUnpacker_825.hasData(-942380819 * var2.anInt_3796, 1711897311)))));
      }
   }

   void method257(boolean var1, int var2, int var3, int var4) {
      if(var1) {
         int[] var5 = new int[4];
         Class286.gameRenderer.method1913(var5);
         Class286.gameRenderer.method1965(var2, var3, 1912610703 * this.aClass409_827.anInt_7764 + var2, 1854937727 * this.aClass409_827.anInt_7765 + var3);
         int var6 = this.aClass170_3765.getFurthestX();
         int var7 = this.aClass170_3765.getFurthestY();
         int var8 = this.aClass170_3768.getFurthestX();
         int var9 = this.aClass170_3768.getFurthestY();
         this.aClass170_3765.drawAt(var2, (this.aClass409_827.anInt_7765 * 1854937727 - var7) / 2 + var3);
         this.aClass170_3768.drawAt(this.aClass409_827.anInt_7764 * 1912610703 + var2 - var8, var3 + (1854937727 * this.aClass409_827.anInt_7765 - var9) / 2);
         Class286.gameRenderer.method1965(var2, var3, var2 + 1912610703 * this.aClass409_827.anInt_7764, var3 + this.aClass170_3767.getFurthestY());
         this.aClass170_3767.method2131(var2 + var6, var3, this.aClass409_827.anInt_7764 * 1912610703 - var6 - var8, 1854937727 * this.aClass409_827.anInt_7765);
         int var10 = this.aClass170_3764.getFurthestY();
         Class286.gameRenderer.method1965(var2, 1854937727 * this.aClass409_827.anInt_7765 + var3 - var10, this.aClass409_827.anInt_7764 * 1912610703 + var2, var3 + 1854937727 * this.aClass409_827.anInt_7765);
         this.aClass170_3764.method2131(var2 + var6, var3 + 1854937727 * this.aClass409_827.anInt_7765 - var10, 1912610703 * this.aClass409_827.anInt_7764 - var6 - var8, this.aClass409_827.anInt_7765 * 1854937727);
         Class286.gameRenderer.method1965(var5[0], var5[1], var5[2], var5[3]);
      }

   }

   void method256(boolean var1, int var2, int var3, int var4) {
      int var5 = var2 + this.aClass170_3765.getFurthestX();
      int var6 = var2 + this.aClass409_827.anInt_7764 * 1912610703 - this.aClass170_3768.getFurthestX();
      int var7 = var3 + this.aClass170_3767.getFurthestY();
      int var8 = this.aClass409_827.anInt_7765 * 1854937727 + var3 - this.aClass170_3764.getFurthestY();
      int var9 = var6 - var5;
      int var10 = var8 - var7;
      int var11 = this.method253((byte)-92) * var9 / 10000;
      int[] var12 = new int[4];
      Class286.gameRenderer.method1913(var12);
      Class286.gameRenderer.method1965(var5, var7, var5 + var11, var8);
      this.method2740(var5, var7, var9, var10, (byte)58);
      Class286.gameRenderer.method1965(var11 + var5, var7, var6, var8);
      this.aClass170_3763.method2131(var5, var7, var9, var10);
      Class286.gameRenderer.method1965(var12[0], var12[1], var12[2], var12[3]);
   }

   void method2740(int var1, int var2, int var3, int var4, byte var5) {
      this.aClass170_3766.method2131(var1, var2, var3, var4);
   }

   public void method812(short var1) {
      super.method812((short)8195);
      Class409_Sub1 var2 = (Class409_Sub1)this.aClass409_827;
      this.aClass170_3766 = FontRenderer.method1079(this.aCacheUnpacker_825, -896286957 * var2.anInt_3798, -1584276841);
      this.aClass170_3763 = FontRenderer.method1079(this.aCacheUnpacker_825, var2.anInt_3795 * 722877179, -2004502675);
      this.aClass170_3765 = FontRenderer.method1079(this.aCacheUnpacker_825, 410784329 * var2.anInt_3794, -1715765130);
      this.aClass170_3768 = FontRenderer.method1079(this.aCacheUnpacker_825, var2.anInt_3797 * 1337644989, -810023566);
      this.aClass170_3767 = FontRenderer.method1079(this.aCacheUnpacker_825, -1994119709 * var2.anInt_3799, -1247105926);
      this.aClass170_3764 = FontRenderer.method1079(this.aCacheUnpacker_825, var2.anInt_3796 * -942380819, -2068358709);
   }

   Class34_Sub2(CacheDataUnpacker var1, CacheDataUnpacker var2, Class409_Sub1 var3) {
      super(var1, var2, var3);
   }

   public static void method2742(byte var0) {
      RandomAccessFileNode var1 = Class240_Sub22_Sub17.getPreferencesFile("2", client.currentGamePack.gameID, true, (byte)-18);
      Class267.preferenceFileList.method7714(var1, -1917391514);
   }

   public static Class522[] method2743(byte var0) {
      return new Class522[]{Class522.aClass522_9253, Class522.aClass522_9254, Class522.aClass522_9255, Class522.aClass522_9256, Class522.aClass522_9257};
   }
}
