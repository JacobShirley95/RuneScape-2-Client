
public abstract class CharTask {

   public final int anInt_1975;


   void method1343(byte var1) {}

   boolean method1344(int var1) {
      return true;
   }

   CharTask(ByteArrayDataNode var1) {
      this.anInt_1975 = var1.readShort(1678141164) * 510027627;
   }

   public abstract void execute();

   static final void method1346(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2 >> 28;
   }

   static final void method1347(RSInterfaceData var0, short var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      boolean var3 = 1 == var0.intTypes[-831324111 * var0.intTypeIndex + 1];
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub29_7312, var2, -411337798);
      if(!var3) {
         Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub30_7314, 0, -587250791);
      }

      Class83.method1089(-2102430106);
      client.aBoolean_568 = false;
   }

   static boolean method1348(int var0, int var1) {
      return var0 == 19 || var0 == 15 || var0 == 1;
   }
}
