
public class Class4 {

   static int anInt_28;
   static CacheNodeArrayList aClass627_29 = new CacheNodeArrayList(32);
   public static int anInt_30;


   Class4() throws Throwable {
      throw new Error();
   }

   public static void method19(byte var0) {
      Class593.aClass585_Sub1_9812.method6346(1388080358);
      Class593.aClass585_Sub2_9808.method6346(1591731740);
      Class593.aLong_9809 = 5336192216723270243L;
      Class593.aBoolean_9811 = true;
   }

   public static Sprite method20(Renderer var0, int var1, byte var2) {
      Class240_Sub5 var3 = (Class240_Sub5)Class524.aNodeArrayList_9273.getNode((long)var1);
      if(null != var3) {
         Class240_Sub4_Sub4 var4 = var3.aClass254_Sub1_6754.method3327(-376703174);
         var3.aBoolean_6755 = true;
         if(null != var4) {
            Class524.aClass547_9271.aRenderer_9479 = var0;
            return (Sprite)var4.method2674(Class524.aClass547_9271, (short)21093);
         }
      }

      return null;
   }

   public static void method21(String var0, int var1) {
      Class634.method6708(0, 0, "", "", "", var0, (byte)60);
   }

   static final void method22(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.aClass301Array_286[var2].method3817(921417097);
   }

   static final void method23(RSInterfaceData var0, short var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class479.method5697(var3, var4, var0, 207961638);
   }

   static MouseNode generateMouseNode(int var0, int x, int y, long var3, int mouseInfo, int var6) {
      synchronized(MouseNode.mouseNodeArray) {
         MouseNode var8;
         if(0 == Class279.mouseNodeIndex * -2143045153) {
            var8 = new MouseNode();
         } else {
            var8 = MouseNode.mouseNodeArray[(Class279.mouseNodeIndex -= 1010778655) * -2143045153];
         }

         var8.clickType = var0 * -50576639;
         var8.mouseX = 170783499 * x;
         var8.mouseY = -1754815849 * y;
         var8.time = 1432440161386474415L * var3;
         var8.mouseInfo = mouseInfo * 582480021;
         return var8;
      }
   }
}
