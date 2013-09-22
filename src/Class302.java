
public class Class302 {

   Class314[] aClass314Array_6006 = new Class314[10];
   int anInt_6007;
   static final int anInt_6008 = 22050;
   int anInt_6009;


   public final int method3824() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if(this.aClass314Array_6006[var2] != null && this.aClass314Array_6006[var2].anInt_6119 / 20 < var1) {
            var1 = this.aClass314Array_6006[var2].anInt_6119 / 20;
         }
      }

      if(this.anInt_6007 < this.anInt_6009 && this.anInt_6007 / 20 < var1) {
         var1 = this.anInt_6007 / 20;
      }

      if(var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if(this.aClass314Array_6006[var2] != null) {
               this.aClass314Array_6006[var2].anInt_6119 -= var1 * 20;
            }
         }

         if(this.anInt_6007 < this.anInt_6009) {
            this.anInt_6007 -= var1 * 20;
            this.anInt_6009 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   Class302(ByteArrayDataNode var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = var1.readByte(-1050641946);
         if(var3 != 0) {
            var1.index -= -2043502829;
            this.aClass314Array_6006[var2] = new Class314();
            this.aClass314Array_6006[var2].method3888(var1);
         }
      }

      this.anInt_6007 = var1.readShort(-1052311194);
      this.anInt_6009 = var1.readShort(-16342792);
   }

   public Class240_Sub7_Sub1_Sub1 method3825() {
      byte[] var1 = this.method3826();
      return new Class240_Sub7_Sub1_Sub1(22050, var1, 22050 * this.anInt_6007 / 1000, 22050 * this.anInt_6009 / 1000);
   }

   final byte[] method3826() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if(this.aClass314Array_6006[var2] != null && this.aClass314Array_6006[var2].anInt_6118 + this.aClass314Array_6006[var2].anInt_6119 > var1) {
            var1 = this.aClass314Array_6006[var2].anInt_6118 + this.aClass314Array_6006[var2].anInt_6119;
         }
      }

      if(var1 == 0) {
         return new byte[0];
      } else {
         var2 = 22050 * var1 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if(this.aClass314Array_6006[var4] != null) {
               int var5 = this.aClass314Array_6006[var4].anInt_6118 * 22050 / 1000;
               int var6 = this.aClass314Array_6006[var4].anInt_6119 * 22050 / 1000;
               int[] var7 = this.aClass314Array_6006[var4].method3886(var5, this.aClass314Array_6006[var4].anInt_6118);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                  if((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }

   public static Class302 method3827(CacheDataUnpacker var0, int var1, int var2) {
      byte[] var3 = var0.getDataBytes(var1, var2, -109494722);
      return var3 == null?null:new Class302(new ByteArrayDataNode(var3));
   }
}
