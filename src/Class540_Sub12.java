
public class Class540_Sub12 extends Setting {

   public static final int anInt_2393 = 1;
   static final int anInt_2394 = 0;


   public Class540_Sub12(int var1, RenderSettings var2) {
      super(var1, var2);
   }

   public void method1677(int var1) {
      int var2 = this.aClass240_Sub23_9464.aClass540_Sub29_7312.getToolkitID();
      if(3 != var2 && var2 != 5) {
         this.mode = 0;
      }

      if(this.aClass240_Sub23_9464.method4827((byte)-19).method6112((byte)-45) < 2) {
         this.mode = 0;
      }

      if(0 != this.mode * -2021544293 && 1 != -2021544293 * this.mode) {
         this.mode = this.method6079((byte)67) * -1389394029;
      }

   }

   public Class540_Sub12(RenderSettings var1) {
      super(var1);
   }

   void method6081(int var1, int var2) {
      this.mode = var1 * -1389394029;
   }

   public int method1679(int var1) {
      return this.mode * -2021544293;
   }

   int method6079(byte var1) {
      int var2 = this.aClass240_Sub23_9464.aClass540_Sub29_7312.getToolkitID();
      return var2 != 3 && 5 != var2?0:0;
   }

   int method6082(int var1, int var2) {
      if(0 == var1) {
         return 1;
      } else if(this.aClass240_Sub23_9464.method4827((byte)-74).method6112((byte)-89) < 2) {
         return 3;
      } else {
         int var3 = this.aClass240_Sub23_9464.aClass540_Sub29_7312.getToolkitID();
         return var3 != 3 && 5 != var3?3:1;
      }
   }

   public static ChatMessage method1682(int var0, short var1) {
      return (ChatMessage)Class109.aNodeArrayList_2041.getNode((long)var0);
   }

   static final void method1683(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.scrollX * -340277309;
   }
}
