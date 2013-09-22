
public class Class126 {

   public final int anInt_2365;
   public final int[] anIntArray_2366;
   public final int anInt_2367;
   public final int[] anIntArray_2368;
   public final Class1024 aClass168_2369;
   final int anInt_2370;
   public static MapIconUnpacker mapIconUnpacker;


   public boolean method1626(int var1, int var2, byte var3) {
      if(var2 >= 0 && var2 < this.anIntArray_2368.length) {
         int var4 = this.anIntArray_2368[var2];
         if(var1 >= var4 && var1 <= var4 + this.anIntArray_2366[var2]) {
            return true;
         }
      }

      return false;
   }

   Class126(int var1, int var2, int[] var3, int[] var4, Class1024 var5, int var6) {
      this.anInt_2367 = 1158483799 * var1;
      this.anInt_2365 = var2 * -56570635;
      this.anIntArray_2366 = var3;
      this.anIntArray_2368 = var4;
      this.aClass168_2369 = var5;
      this.anInt_2370 = -1447230761 * var6;
   }

   public static Class617 method1627(ByteArrayDataNode var0, int var1) {
      Class611 var2 = Class117.method1497(var0.readByte(-790280643), (byte)-55);
      return (Class617)(var2 == Class611.aClass611_9950?AbstractServerConnection.method3075(var0, 1763091746):(var2 == Class611.aClass611_9949?Class8.method43(var0, (byte)57):(var2 == Class611.aClass611_9947?Class36.method304(var0, 1808514667):null)));
   }

   static final void method1628(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      if(var2 > 700 || var3 > 700) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 256;
      }

      double var4 = (Math.random() * (double)(var3 + var2) - (double)var2 + 800.0D) / 100.0D;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = (int)(Math.pow(2.0D, var4) + 0.5D);
   }

   static final void method1629(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = null != Class521.myPlayer.composite && Class521.myPlayer.composite.aBoolean_9852?1:0;
   }

   static final void method1630(RSInterfaceData var0, int var1) {
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.idleAnimations, var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], 143441984);
      Class83.method1089(-1741432974);
      client.aBoolean_568 = false;
   }

   static void method1631(int var0) {
      if(null != RendererInfo.curLoadProgress) {
         Class52.aClass327_1072 = new Class327();
         Class52.aClass327_1072.method4028(Class240_Sub21.aLong_7276 * -248947798881470655L, RendererInfo.curLoadProgress.aClass482_6739.getText(Class599.clientLanguage, -245104044), RendererInfo.curLoadProgress.percent * 1707216417, RendererInfo.curLoadProgress, 1331718319);
         Class542.aThread_9472 = new Thread(Class52.aClass327_1072, "");
         Class542.aThread_9472.start();
      }
   }

   static final void method1632(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class330.method4092((short)-15654);
   }
}
