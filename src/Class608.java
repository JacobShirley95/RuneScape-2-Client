import java.awt.Point;

public final class Class608 implements Class169 {

   static final long aLong_9935 = 4611686018427387903L;
   static final long aLong_9936 = 4611686018427387904L;
   static final long aLong_9937 = 1L;
   static final long aLong_9938 = 500L;
   int[] anIntArray_9939;
   int[] anIntArray_9940;
   NodeArrayList aNodeArrayList_9941 = new NodeArrayList(128);
   static int anInt_9942;


   public int method2269(Class187 var1, int var2) {
      return this.anIntArray_9939[var1.anInt_3198 * -1982395567];
   }

   public void method6536(Class187 var1, int var2, byte var3) {
      this.anIntArray_9940[-1982395567 * var1.anInt_3198] = var2;
      Class240_Sub14 var4 = (Class240_Sub14)this.aNodeArrayList_9941.getNode((long)(var1.anInt_3198 * -1982395567));
      if(null != var4) {
         if(-855155696853016087L * var4.aLong_6833 != 4611686018427387905L) {
            var4.aLong_6833 = (Class373.getCurrentTime((short)4402) + 500L | 4611686018427387904L) * 4853622503744357977L;
         }
      } else {
         var4 = new Class240_Sub14(4611686018427387905L);
         this.aNodeArrayList_9941.insert(var4, (long)(var1.anInt_3198 * -1982395567));
      }

   }

   public int method2268(Class416 var1, int var2) {
      return var1.method5146(this.anIntArray_9939[var1.aClass187_7903.anInt_3198 * -1982395567], (byte)117);
   }

   public void method2093(Class416 var1, int var2, int var3) {
      try {
         int var4 = var1.method5147(this.anIntArray_9939[var1.aClass187_7903.anInt_3198 * -1982395567], var2, (byte)-76);
         this.method2111(var1.aClass187_7903, var4, 673622564);
      } catch (Exception_Sub3 var5) {
         ;
      }

   }

   public int method6539(boolean var1, byte var2) {
      long var3 = Class373.getCurrentTime((short)3371);

      for(Class240_Sub14 var5 = (Class240_Sub14)(var1?this.aNodeArrayList_9941.start():this.aNodeArrayList_9941.next()); var5 != null; var5 = (Class240_Sub14)this.aNodeArrayList_9941.next()) {
         if((-855155696853016087L * var5.aLong_6833 & 4611686018427387903L) < var3) {
            if((var5.aLong_6833 * -855155696853016087L & 4611686018427387904L) != 0L) {
               int var6 = (int)(var5.id * 4058728944299054175L);
               this.anIntArray_9939[var6] = this.anIntArray_9940[var6];
               var5.shiftNext();
               return var6;
            }

            var5.shiftNext();
         }
      }

      return -1;
   }

   public long method2094(Class187 var1, int var2) {
      throw new UnsupportedOperationException();
   }

   public Object method2117(Class187 var1, byte var2) {
      throw new UnsupportedOperationException();
   }

   public void method2097(Class187 var1, Object var2, byte var3) {
      throw new UnsupportedOperationException();
   }

   public void method6543(Class416 var1, int var2, int var3) {
      try {
         int var4 = var1.method5147(this.anIntArray_9940[-1982395567 * var1.aClass187_7903.anInt_3198], var2, (byte)-118);
         this.method6536(var1.aClass187_7903, var4, (byte)89);
      } catch (Exception_Sub3 var5) {
         ;
      }

   }

   public Class608() {
      this.anIntArray_9940 = new int[Class104_Sub14.aClass212_Sub1_Sub1_10688.method5497(1977358220)];
      this.anIntArray_9939 = new int[Class104_Sub14.aClass212_Sub1_Sub1_10688.method5497(1846847377)];
   }

   public void method6544(byte var1) {
      for(int var2 = 0; var2 < Class104_Sub14.aClass212_Sub1_Sub1_10688.method5497(1617750295); ++var2) {
         Class187_Sub1 var3 = (Class187_Sub1)Class104_Sub14.aClass212_Sub1_Sub1_10688.method5503(var2, 824148490);
         if(var3 != null) {
            this.anIntArray_9940[var2] = 0;
            this.anIntArray_9939[var2] = 0;
         }
      }

      this.aNodeArrayList_9941 = new NodeArrayList(128);
   }

   public void method2111(Class187 var1, int var2, int var3) {
      this.anIntArray_9939[-1982395567 * var1.anInt_3198] = var2;
      Class240_Sub14 var4 = (Class240_Sub14)this.aNodeArrayList_9941.getNode((long)(var1.anInt_3198 * -1982395567));
      if(null != var4) {
         var4.aLong_6833 = (Class373.getCurrentTime((short)8749) + 500L) * 4853622503744357977L;
      } else {
         var4 = new Class240_Sub14(Class373.getCurrentTime((short)30379) + 500L);
         this.aNodeArrayList_9941.insert(var4, (long)(-1982395567 * var1.anInt_3198));
      }

   }

   public void method2106(Class187 var1, long var2) {
      throw new UnsupportedOperationException();
   }

   static final void method6547(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      Class240_Sub14.method4620(var3, var0, (short)-4386);
   }

   static final void method6548(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      int var3 = client.aClass301Array_286[var2].method3816(1256203838);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 2 == var3?1:0;
   }

   static final void method6549(RSInterfaceData var0, int var1) {
      int var2 = Class104_Sub21.renderSettings.aClass540_Sub24_7302.method4126(1615823068);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub24_7297, var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111] == 1?0:var2, 1353501643);
      Class488.method5744((byte)1);
   }

   static final void method6550(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(-1 != var2) {
         Class215.method2700(var2, (byte)-28);
      }

   }

   static String method6551(String var0, int var1) {
      return Class288.aString_4826.startsWith("win")?var0 + ".dll":(Class288.aString_4826.startsWith("linux")?"lib" + var0 + ".so":(Class288.aString_4826.startsWith("mac")?"lib" + var0 + ".dylib":null));
   }

   static final void method6552(RSInterfaceData var0, byte var1) {
      Class240_Sub52_Sub1.setMin(true, 1949954097);
      client.aClass296_348.method3789((byte)6);
      Class83.method1089(-1332755019);
      client.aBoolean_568 = false;
   }

   static void method6553(int var0, int var1) {
      if(Class104_Sub21.renderSettings.aClass540_Sub2_7313.method1427(-146104779) == 0) {
         var0 = -1;
      }

      if(var0 != client.anInt_465 * 854632627) {
         if(-1 != var0) {
            Class456 var2 = AbstractKeyboardHandler.aClass457_4262.method5547(var0, (byte)-6);
            AbstractImageData var3 = var2.method5544(1256855147);
            if(null != var3) {
               client.customCursor.method2703(Class51.clientCanvas, var3.getPixelData(true), var3.getAbsoluteX(), var3.getAbsoluteY(), new Point(-847237483 * var2.anInt_8563, var2.anInt_8562 * -1344958899));
               client.anInt_465 = var0 * 2043299451;
            } else {
               var0 = -1;
            }
         }

         if(var0 == -1 && client.anInt_465 * 854632627 != -1) {
            client.customCursor.method2703(Class51.clientCanvas, (int[])null, -1, -1, new Point());
            client.anInt_465 = -2043299451;
         }

      }
   }

   static void method6554(int var0) {
      client.aClass296_348.method3787((short)-12592);
      Class300.method3814(1839073496);
      Class416.method5154(true, (byte)-18);
      Class225.method2843(1186290115);
      System.gc();
      Class286.gameRenderer.method1977(2, 0);
   }

   static void method6555(int var0, String var1, int var2) {
      Class240_Sub22_Sub5 var3 = Class65_Sub1_Sub2.method866(3, (long)var0);
      var3.method596((byte)64);
      var3.aString_1181 = var1;
   }
}
