import java.net.Socket;
import java.util.Iterator;

public abstract class Class43 {

   final Class38 aClass38_910;
   Class46 aClass46_911;
   float aFloat_912;
   Class31 aClass31_913;
   Class508 aClass508_914;
   Class116 aClass116_915;
   final GameCoord aClass347_916 = new GameCoord();
   Class66 aClass66_917;
   Class29 aClass29_918;
   int anInt_919;
   float aFloat_920;
   final GameCoord aClass347_921 = new GameCoord();
   final GameCoord aClass347_922 = new GameCoord();
   public static final float aFloat_923 = Float.POSITIVE_INFINITY;
   float aFloat_924;
   final GameCoord aClass347_925 = new GameCoord();
   final GameCoord aClass347_926 = new GameCoord();
   final Class30 aClass30_927;
   final GameCoord aClass347_928 = new GameCoord();
   float aFloat_929;
   float aFloat_930;
   float aFloat_931;
   boolean aBoolean_932;
   float aFloat_933;
   Class52 aClass52_934;
   boolean aBoolean_935;
   int anInt_936 = 0;
   float aFloat_937 = 1.0F;
   NodeArrayList aNodeArrayList_938 = new NodeArrayList(8);
   static int anInt_939;
   static Socket aSocket_940;


   public Class30 method350(byte var1) {
      return this.aClass30_927;
   }

   public Class508 method351(Class31 var1, boolean var2, int var3) throws Exception_Sub1 {
      if(this.aClass46_911 == Class46.aClass46_972 && !var2) {
         throw new Exception_Sub1();
      } else {
         this.aClass31_913 = var1;
         if(var1 == Class31.aClass31_808) {
            this.aClass508_914 = new Class508_Sub4(this);
         } else if(var1 == Class31.aClass31_810) {
            this.aClass508_914 = new Class508_Sub1(this);
         } else if(Class31.aClass31_807 == var1) {
            this.aClass508_914 = new Class508_Sub2(this);
         } else if(var1 == Class31.aClass31_809) {
            this.aClass508_914 = new Class508_Sub5_Sub1(this);
         } else if(Class31.aClass31_811 == var1) {
            this.aClass508_914 = new Class508_Sub5_Sub2(this);
         } else if(Class31.aClass31_812 == var1) {
            this.aClass508_914 = new Class508_Sub3(this);
         }

         return this.aClass508_914;
      }
   }

   public Class66 method352(Class116 var1, boolean var2, byte var3) throws Exception_Sub1 {
      if(Class46.aClass46_972 == this.aClass46_911 && !var2) {
         throw new Exception_Sub1();
      } else {
         this.aClass116_915 = var1;
         if(var1 == Class116.aClass116_2089) {
            this.aClass66_917 = new Class66_Sub3(this);
         } else if(Class116.aClass116_2086 == var1) {
            this.aClass66_917 = new Class66_Sub2(this);
         } else if(var1 == Class116.aClass116_2087) {
            this.aClass66_917 = new Class66_Sub1_Sub2(this);
         } else if(var1 == Class116.aClass116_2088) {
            this.aClass66_917 = new Class66_Sub1_Sub1(this);
         }

         return this.aClass66_917;
      }
   }

   boolean method353(int var1) {
      return this.aClass38_910 == Class38.aClass38_856 && Class46.aClass46_972 == this.aClass46_911?true:Class38.aClass38_857 == this.aClass38_910 && this.aClass46_911 == Class46.aClass46_971;
   }

   public void method354(float var1, int var2) throws Exception_Sub1 {
      if(!this.method353(1659995833)) {
         throw new Exception_Sub1();
      }
   }

   public void method355(Class52 var1, byte var2) throws Exception_Sub1 {
      if(!this.method353(1659995833)) {
         throw new Exception_Sub1();
      } else {
         this.aClass52_934 = var1;
      }
   }

   public void method356(GameCoord var1, int var2) throws Exception_Sub1 {
      if(this.method353(1659995833) && this.aClass52_934.aBoolean_1071) {
         this.aClass347_922.setPos(var1);
      } else {
         throw new Exception_Sub1();
      }
   }

   public void method357(GameCoord var1, float var2, byte var3) throws Exception_Sub1 {
      if(this.method353(1659995833) && !this.aClass52_934.aBoolean_1071) {
         this.aClass347_926.setPos(var1);
         this.aFloat_924 = var2;
      } else {
         throw new Exception_Sub1();
      }
   }

   public void method358(GameCoord var1, int var2) throws Exception_Sub1 {
      if(this.method353(1659995833) && this.aClass52_934.aBoolean_1071) {
         this.aClass347_921.setPos(var1);
      } else {
         throw new Exception_Sub1();
      }
   }

   public void method359(GameCoord var1, byte var2) throws Exception_Sub1 {
      if(this.method353(1659995833) && this.aClass52_934.aBoolean_1071) {
         this.aClass347_928.setPos(var1);
      } else {
         throw new Exception_Sub1();
      }
   }

   public void method360(GameCoord var1, float var2, byte var3) throws Exception_Sub1 {
      if(this.method353(1659995833) && !this.aClass52_934.aBoolean_1071) {
         this.aClass347_926.setPos(var1);
         this.aClass347_916.setPos(var1);
         this.aFloat_924 = var2;
         this.aFloat_929 = var2;
      } else {
         throw new Exception_Sub1();
      }
   }

   public void method361(float var1, float var2, byte var3) throws Exception_Sub1 {
      if(!this.method353(1659995833)) {
         throw new Exception_Sub1();
      } else {
         this.aFloat_912 = var1;
         this.aFloat_933 = var2;
      }
   }

   public void method362(int var1, float var2, int var3) throws Exception_Sub1 {
      if(this.method353(1659995833) && this.aClass52_934.aBoolean_1071) {
         this.anInt_936 = -505262827 * var1;
         this.aFloat_937 = var2;
      } else {
         throw new Exception_Sub1();
      }
   }

   public void method363(Class240_Sub22_Sub12 var1, int var2) {
      this.aNodeArrayList_938.insert(var1, (long)(var1.anInt_3604 * -1890428917));
   }

   public void method364(int var1, int var2) {
      Class240_Sub22_Sub12 var3 = (Class240_Sub22_Sub12)this.aNodeArrayList_938.getNode((long)var1);
      if(var3 != null) {
         var3.shiftNext();
      }

   }

   public Class240_Sub22_Sub12 method365(int var1, byte var2) {
      return (Class240_Sub22_Sub12)this.aNodeArrayList_938.getNode((long)var1);
   }

   public void method366(byte var1) {
      this.aNodeArrayList_938.method5938(1637824281);
   }

   public boolean method367(byte var1) {
      return this.aClass508_914 != null && this.aClass66_917 != null?(!this.aClass508_914.method5901(-449062061)?false:this.aClass66_917.method672((byte)0)):false;
   }

   Class43(Class38 var1, Class30 var2) {
      this.aClass38_910 = var1;
      this.aClass30_927 = var2;
      this.method395(true, 141611181);
   }

   public Class46 method368(int var1) {
      return this.aClass46_911;
   }

   public Class31 method369(int var1) {
      return this.aClass31_913;
   }

   public Class116 method370(int var1) {
      return this.aClass116_915;
   }

   public GameCoord method371(int var1) {
      return null == this.aClass66_917?null:this.aClass66_917.method667(2117034815);
   }

   GameCoord method372(int var1) {
      return this.aClass508_914 == null?null:this.aClass508_914.method5903(2078899593);
   }

   float method373(int var1) {
      GameCoord var2 = this.method371(-1118394259);
      GameCoord var3 = this.method372(-1090873764);
      float var4 = 0.0F;
      if(null != var2 && null != var3) {
         GameCoord var5 = GameCoord.distBetween(var3, var2);
         float var6 = (float)Math.sqrt((double)(var5.floatX * var5.floatX + var5.floatZ * var5.floatZ));
         var4 = (float)Math.atan2((double)(-var5.floatY), (double)var6);
         var2.store();
         var3.store();
      }

      return var4;
   }

   public void method374(GameCoord var1, byte var2) throws Exception_Sub1 {
      if(this.method353(1659995833) && this.aClass52_934.aBoolean_1071) {
         this.aClass347_925.setPos(var1);
      } else {
         throw new Exception_Sub1();
      }
   }

   float method375(byte var1) {
      return 0.0F;
   }

   public GameCoord method376(int var1) {
      return this.aClass347_922;
   }

   public void method377(GameCoord var1, float var2, int var3) throws Exception_Sub1 {
      if(this.method353(1659995833) && !this.aClass52_934.aBoolean_1071) {
         this.aClass347_916.setPos(var1);
         this.aFloat_929 = var2;
      } else {
         throw new Exception_Sub1();
      }
   }

   public float method378(byte var1) {
      return this.aFloat_920;
   }

   public GameCoord method379(int var1) {
      return this.aClass347_921;
   }

   public GameCoord method380(int var1) {
      return this.aClass347_928;
   }

   public float method381(byte var1) {
      return this.aFloat_930;
   }

   public float method382(short var1) {
      return this.aFloat_931;
   }

   public float method383(int var1) {
      return this.aFloat_912;
   }

   public boolean method384(int var1) {
      return this.aBoolean_932;
   }

   public boolean method385(byte var1) {
      return this.aBoolean_935;
   }

   public void method386(boolean var1, boolean var2, byte var3) throws Exception_Sub1 {
      if(!this.method353(1659995833)) {
         throw new Exception_Sub1();
      } else {
         this.aBoolean_932 = var1;
         this.aBoolean_935 = var2;
      }
   }

   public void method387(Class46 var1, int var2) {
      this.aClass46_911 = var1;
   }

   public void method388(float var1, int var2) throws Exception_Sub1 {
      if(!this.method353(1659995833)) {
         throw new Exception_Sub1();
      } else {
         this.aFloat_920 = var1;
      }
   }

   public GameCoord method389(byte var1) {
      return this.aClass347_925;
   }

   public void method390(float var1, float var2, byte var3) throws Exception_Sub1 {
      if(!this.method353(1659995833)) {
         throw new Exception_Sub1();
      } else {
         this.aFloat_930 = var1;
         this.aFloat_931 = var2;
      }
   }

   public void method391(boolean var1, float var2, GameCoord var3, Class342 var4, GameCoord var5, GameCoord var6, int var7) {
      if(Class52.aClass52_1068 == this.aClass52_934) {
         GamePack.method5979(var2, var3, var5, var6, var1?this.aClass347_925:this.aClass347_922, var1?this.aClass347_928:this.aClass347_921, (float)(1864473149 * this.anInt_936), this.aFloat_937, (short)31093);
      } else if(this.aClass52_934 == Class52.aClass52_1069) {
         Class240_Sub52.method5262(var2, var3, var4, var5, var6, var1?this.aClass347_925:this.aClass347_922, var1?this.aClass347_928:this.aClass347_921, (float)(this.anInt_936 * 1864473149), this.aFloat_937, -18864582);
      } else if(Class52.aClass52_1067 == this.aClass52_934) {
         Class232.method2968(var2, var3, var4, var5, var6, var1?this.aClass347_916:this.aClass347_926, var1?this.aFloat_929:this.aFloat_924, -495507422);
      }

   }

   public Class342 method392(int var1) {
      Class342 var2 = Class342.method4218();
      var2.method4223(this.method394(-1962301117), this.method373(1281965319), this.method375((byte)28));
      return var2;
   }

   public void method393(float var1, int[][][] var2, Class281 var3, int var4, int var5, byte var6) {
      if(this.aClass508_914 != null) {
         this.aClass508_914.method5907(var1, 685970571);
      }

      if(this.aClass66_917 != null) {
         this.aClass66_917.method666(var1, var2, var3, var4, var5, 1763803079);
      }

      Iterator var7 = this.aNodeArrayList_938.iterator();

      while(var7.hasNext()) {
         Class240_Sub22_Sub12 var8 = (Class240_Sub22_Sub12)var7.next();
         var8.method2635(var1, (byte)-56);
      }

   }

   public float method394(int var1) {
      GameCoord var2 = this.method371(-642792654);
      GameCoord var3 = this.method372(-311042237);
      float var4 = 0.0F;
      if(var2 != null && var3 != null) {
         GameCoord var5 = GameCoord.distBetween(var2, var3);
         var5.floatY = 0.0F;
         var4 = (float)Math.atan2((double)var5.floatX, (double)var5.floatZ);
         var2.store();
         var3.store();
      }

      return (float)(3.141592653589793D - (double)var4);
   }

   void method395(boolean var1, int var2) {
      this.aClass29_918 = Class29.aClass29_805;
      this.aClass31_913 = null;
      this.aClass508_914 = null;
      this.aClass116_915 = null;
      this.aClass66_917 = null;
      if(Class38.aClass38_856 != this.aClass38_910 && var1) {
         this.aClass46_911 = Class46.aClass46_971;
      } else {
         this.aClass46_911 = Class46.aClass46_972;
      }

      this.aClass52_934 = Class52.aClass52_1069;
      this.aClass347_921.setPos(100.0F, 100.0F, 100.0F);
      this.aClass347_928.setPos(100.0F, 100.0F, 100.0F);
      this.aFloat_920 = 0.05F;
      this.aClass347_922.setPos(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
      this.aClass347_925.setPos(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
      this.aClass347_926.setPos(1.0F, 1.0F, 1.0F);
      this.aClass347_916.setPos(1.0F, 1.0F, 1.0F);
      this.aFloat_924 = 1.1F;
      this.aFloat_929 = 1.1F;
      this.aFloat_930 = 50.0F;
      this.aFloat_931 = 10000.0F;
      this.aFloat_933 = 1.5707964F;
      this.aFloat_912 = 1.5707964F;
      this.anInt_919 = -1171928617;
      this.aBoolean_932 = true;
      this.aBoolean_935 = true;
      this.anInt_936 = 0;
      this.aFloat_937 = 1.0F;
      this.aNodeArrayList_938.method5938(1103302912);
   }

   public void method396(Class115 var1, Viewport var2, ArrayViewport var3, int var4, int var5, int var6) {
      if(this.aClass508_914 != null && null != this.aClass66_917) {
         this.aClass508_914.method5902(var1, var2, var4, var5, this.aClass66_917.method669(-1573659918), 965074702);
         this.aClass66_917.method670(var1, var4, var5, -1998599962);
         if(this.aClass29_918 == Class29.aClass29_805) {
            var3.method4560(this.aFloat_930, this.aFloat_931, this.aFloat_912, this.aFloat_933);
         } else {
            var3.method4585(this.aFloat_930, this.aFloat_931, (float)(this.anInt_919 * -1964826237));
         }

         Iterator var7 = this.aNodeArrayList_938.iterator();

         while(var7.hasNext()) {
            Class240_Sub22_Sub12 var8 = (Class240_Sub22_Sub12)var7.next();
            var8.method2636(var1, var2, var3, (byte)2);
         }
      }

   }

   public Class508 method397(byte var1) {
      return this.aClass508_914;
   }

   public Class66 method398(int var1) {
      return this.aClass66_917;
   }

   static final void method399(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[-831324111 * var0.intTypeIndex + 1];
      if(null != Class521.myPlayer.composite) {
         Class521.myPlayer.composite.equip(var2, var3, Class592.cacheObjectLoader);
      }
   }

   static final void method400(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class53.captureMouseList.getCaptureMouseY();
   }

   static void method401(int var0, byte var1) {
      Class4.anInt_28 = var0 * -2059795945;
      CacheNodeArrayList var2 = Class4.aClass627_29;
      synchronized(Class4.aClass627_29) {
         Class4.aClass627_29.method6669(-1788360674);
      }
   }

   static void method402(int var0, int var1, int var2, int var3, boolean var4, int var5) {
      long var6 = (long)(var0 | (var4?Integer.MIN_VALUE:0));
      Class240_Sub46 var8 = (Class240_Sub46)Class240_Sub46.aNodeArrayList_7651.getNode(var6);
      if(null == var8) {
         var8 = new Class240_Sub46();
         Class240_Sub46.aNodeArrayList_7651.insert(var8, var6);
      }

      if(var8.anIntArray_7650.length <= var1) {
         int[] var9 = new int[1 + var1];
         int[] var10 = new int[var1 + 1];

         int var11;
         for(var11 = 0; var11 < var8.anIntArray_7650.length; ++var11) {
            var9[var11] = var8.anIntArray_7650[var11];
            var10[var11] = var8.anIntArray_7647[var11];
         }

         for(var11 = var8.anIntArray_7650.length; var11 < var1; ++var11) {
            var9[var11] = -1;
            var10[var11] = 0;
         }

         var8.anIntArray_7650 = var9;
         var8.anIntArray_7647 = var10;
      }

      var8.anIntArray_7650[var1] = var2;
      var8.anIntArray_7647[var1] = var3;
   }
}
