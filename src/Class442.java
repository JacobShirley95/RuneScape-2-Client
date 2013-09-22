
public class Class442 {

   public int[] anIntArray_8439;
   public long aLong_8440;
   public short[] aShortArray_8441;
   public short[] aShortArray_8442;


   public Class442(NPCComposite var1, boolean var2) {
      if(var2) {
         this.anIntArray_8439 = new int[var1.anIntArray_8655.length];
         System.arraycopy(var1.anIntArray_8655, 0, this.anIntArray_8439, 0, this.anIntArray_8439.length);
      } else {
         this.anIntArray_8439 = new int[var1.anIntArray_8641.length];
         System.arraycopy(var1.anIntArray_8641, 0, this.anIntArray_8439, 0, this.anIntArray_8439.length);
      }

      if(var1.aShortArray_8617 != null) {
         this.aShortArray_8441 = new short[var1.aShortArray_8617.length];
         System.arraycopy(var1.aShortArray_8617, 0, this.aShortArray_8441, 0, this.aShortArray_8441.length);
      }

      if(null != var1.aShortArray_8620) {
         this.aShortArray_8442 = new short[var1.aShortArray_8620.length];
         System.arraycopy(var1.aShortArray_8620, 0, this.aShortArray_8442, 0, this.aShortArray_8442.length);
      }

   }

   public Class442(long var1, int[] var3, short[] var4, short[] var5) {
      this.aLong_8440 = var1 * -7074691745365666227L;
      this.anIntArray_8439 = var3;
      this.aShortArray_8441 = var4;
      this.aShortArray_8442 = var5;
   }

   static final void method5461(int var0) {
      for(int var1 = 0; var1 < client.availableNPCS * 1636714459; ++var1) {
         int var2 = client.npcIndices[var1];
         Class240_Sub9 var3 = (Class240_Sub9)client.npcNodeList.getNode((long)var2);
         if(null != var3) {
            NPC var4 = (NPC)var3.anObject_6783;
            Class572.method6275(var4, false, 1834898295);
         }
      }

   }
}
