
public class RSInterfaceGroup {

   public boolean aBoolean_2054;
   public RSInterface[] interfaceArray;
   RSInterface[] aClass132Array_2056;
   public static Class96 aClass96_2057;


   public RSInterface[] method1435(int var1) {
      return null == this.aClass132Array_2056?this.interfaceArray:this.aClass132Array_2056;
   }

   public RSInterface[] method1436(int var1) {
      if(null == this.aClass132Array_2056) {
         int var2 = this.interfaceArray.length;
         this.aClass132Array_2056 = new RSInterface[var2];
         System.arraycopy(this.interfaceArray, 0, this.aClass132Array_2056, 0, this.interfaceArray.length);
      }

      return this.aClass132Array_2056;
   }

   RSInterfaceGroup(boolean var1, RSInterface[] var2) {
      this.interfaceArray = var2;
      this.aBoolean_2054 = var1;
   }

   public RSInterface getChildInterface(int var1, int var2) {
      if(this.interfaceArray[0].cacheID * 1278853609 >>> 16 != var1 >>> 16) {
         throw new IllegalArgumentException();
      } else {
         return this.interfaceArray[var1 & '\uffff'];
      }
   }

   static final void method1438(Class563_Sub1 var0, int var1, int var2) {
      Class105.method1357(var0, var1, false, (byte)37);
   }

   static final void method1439(RSInterfaceData var0, byte var1) {
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub14_7324, var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], 1200645169);
      Class83.method1089(-1574950611);
      client.aBoolean_568 = false;
   }
}
