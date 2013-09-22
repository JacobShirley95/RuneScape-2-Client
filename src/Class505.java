
public final class Class505 {

   public Class231_Sub2 aClass231_Sub2_9121 = new Class231_Sub2();
   Class231_Sub2 aClass231_Sub2_9122;
   static String[] aStringArray_9123;
   static RSInterface[] aClass132Array_9124;


   public Class505() {
      this.aClass231_Sub2_9121.aClass231_Sub2_7769 = this.aClass231_Sub2_9121;
      this.aClass231_Sub2_9121.aClass231_Sub2_7770 = this.aClass231_Sub2_9121;
   }

   public Class231_Sub2 method5861(byte var1) {
      Class231_Sub2 var2 = this.aClass231_Sub2_9121.aClass231_Sub2_7769;
      if(this.aClass231_Sub2_9121 == var2) {
         this.aClass231_Sub2_9122 = null;
         return null;
      } else {
         this.aClass231_Sub2_9122 = var2.aClass231_Sub2_7769;
         return var2;
      }
   }

   public void method5862(int var1) {
      while(true) {
         Class231_Sub2 var2 = this.aClass231_Sub2_9121.aClass231_Sub2_7769;
         if(var2 == this.aClass231_Sub2_9121) {
            this.aClass231_Sub2_9122 = null;
            return;
         }

         var2.method5055((byte)16);
      }
   }

   public Class231_Sub2 method5863(int var1) {
      Class231_Sub2 var2 = this.aClass231_Sub2_9122;
      if(this.aClass231_Sub2_9121 == var2) {
         this.aClass231_Sub2_9122 = null;
         return null;
      } else {
         this.aClass231_Sub2_9122 = var2.aClass231_Sub2_7769;
         return var2;
      }
   }

   public void method5864(Class231_Sub2 var1, int var2) {
      if(var1.aClass231_Sub2_7770 != null) {
         var1.method5055((byte)16);
      }

      var1.aClass231_Sub2_7770 = this.aClass231_Sub2_9121.aClass231_Sub2_7770;
      var1.aClass231_Sub2_7769 = this.aClass231_Sub2_9121;
      var1.aClass231_Sub2_7770.aClass231_Sub2_7769 = var1;
      var1.aClass231_Sub2_7769.aClass231_Sub2_7770 = var1;
   }

   static void method5865(int var0, boolean var1, int var2) {
      if(var1) {
         Class240_Sub27 var3 = Class47_Sub1.method3496(Class326.aClass326_6225, client.gameConnectionHandler.aClass528_3433, 1917447504);
         var3.aClass240_Sub8_Sub1_7370.method4463(var0, 1812430267);
         client.gameConnectionHandler.addPacket(var3, 648495918);
      } else {
         Class203.method2587(Class434.aClass434_8356, var0, -1, 159813884);
      }

   }

   static final void method5866(RSInterfaceData var0, int var1) {
      CacheFileID.method1393(16777215);
   }

   static void method5867(int var0, int var1, int var2) {
      Class240_Sub22_Sub5 var3 = Class65_Sub1_Sub2.method866(12, (long)var0);
      var3.method596((byte)30);
      var3.anInt_1175 = var1 * 134353971;
   }

   public static int[] method5868(int var0, int var1) {
      int[] var2 = new int[3];
      Class544.method6092(Class542.method6087(var0, -1340680021));
      var2[0] = Class461.aCalendar_8600.get(5);
      var2[1] = Class461.aCalendar_8600.get(2);
      var2[2] = Class461.aCalendar_8600.get(1);
      return var2;
   }
}
