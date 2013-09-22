
public class Class240_Sub26 extends NodeListNode {

   public static final int anInt_7335 = 3;
   public static final int anInt_7336 = 1;
   public static final int anInt_7337 = 2;
   int[][] anIntArrayArray_7338;
   public static final int anInt_7339 = 5;
   public static final int anInt_7340 = 0;
   public static final int anInt_7341 = 7;
   public static final int anInt_7342 = 8;
   boolean[] aBooleanArray_7343;
   public static final int anInt_7344 = 10;
   int anInt_7345;
   int anInt_7346;
   int[] anIntArray_7347;
   static final int anInt_7348 = 6;
   public static final int anInt_7349 = 9;
   int[] anIntArray_7350;


   Class240_Sub26(int var1, byte[] var2) {
      this.anInt_7345 = var1 * 1258145877;
      ByteArrayDataNode var3 = new ByteArrayDataNode(var2);
      this.anInt_7346 = var3.readShort(904082181) * -667974079;
      this.anIntArray_7347 = new int[this.anInt_7346 * -23885375];
      this.anIntArrayArray_7338 = new int[this.anInt_7346 * -23885375][];
      this.aBooleanArray_7343 = new boolean[-23885375 * this.anInt_7346];
      this.anIntArray_7350 = new int[-23885375 * this.anInt_7346];

      int var4;
      for(var4 = 0; var4 < -23885375 * this.anInt_7346; ++var4) {
         this.anIntArray_7347[var4] = var3.readByte(1306838059);
         if(this.anIntArray_7347[var4] == 6) {
            this.anIntArray_7347[var4] = 2;
         }
      }

      for(var4 = 0; var4 < -23885375 * this.anInt_7346; ++var4) {
         this.aBooleanArray_7343[var4] = var3.readByte(219754799) == 1;
      }

      for(var4 = 0; var4 < -23885375 * this.anInt_7346; ++var4) {
         this.anIntArray_7350[var4] = var3.readShort(879288066);
      }

      for(var4 = 0; var4 < -23885375 * this.anInt_7346; ++var4) {
         this.anIntArrayArray_7338[var4] = new int[var3.method4490((byte)0)];
      }

      for(var4 = 0; var4 < -23885375 * this.anInt_7346; ++var4) {
         for(int var5 = 0; var5 < this.anIntArrayArray_7338[var4].length; ++var5) {
            this.anIntArrayArray_7338[var4][var5] = var3.method4490((byte)0);
         }
      }

   }

   static final void method4846(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class630.method6690(var3, var4, var0, 1981202285);
   }

   static final void method4847(RSInterfaceData var0, int var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var2.toLowerCase();
   }
}
