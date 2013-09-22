
public class MapPoint {

   public int plane;
   public int loadedMapX;
   public int loadedMapY;
   protected static GraphicsDataHolder graphicsDataHolder;


   boolean notSame(MapPoint var1, int var2) {
      return -1025256637 * this.plane != -1025256637 * var1.plane?false:(this.loadedMapX * 1265321541 != 1265321541 * var1.loadedMapX?false:this.loadedMapY * -1996781083 == -1996781083 * var1.loadedMapY);
   }

   public MapPoint(int var1) {
      if(-1 == var1) {
         this.plane = -372232555;
      } else {
         this.plane = (var1 >> 28 & 3) * 372232555;
         this.loadedMapX = 1331420301 * (var1 >> 14 & 16383);
         this.loadedMapY = (var1 & 16383) * -1843754003;
      }

   }

   public int method6658(byte var1) {
      return -1025256637 * this.plane << 28 | this.loadedMapX * 1265321541 << 14 | this.loadedMapY * -1996781083;
   }

   public boolean equals(Object var1) {
      return this == var1?true:(!(var1 instanceof MapPoint)?false:this.notSame((MapPoint)var1, 2085467733));
   }

   public MapPoint(int var1, int var2, int var3) {
      this.plane = 372232555 * var1;
      this.loadedMapX = var2 * 1331420301;
      this.loadedMapY = var3 * -1843754003;
   }

   public int hashCode() {
      return this.method6658((byte)45);
   }

   public String toString() {
      return -1025256637 * this.plane + "," + (this.loadedMapX * 1265321541 >> 6) + "," + (this.loadedMapY * -1996781083 >> 6) + "," + (1265321541 * this.loadedMapX & 63) + "," + (this.loadedMapY * -1996781083 & 63);
   }

   public MapPoint() {
      this.plane = -372232555;
   }

   static final void method6662(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -740020991 * Class18.optionCount;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -917762761 * Class18.anInt_155;
   }

   static final void method6663(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      Class240_Sub22_Sub10 var3 = Class534.aClass275_9439.method3606(var2, -715079996);
      if(var3.anIntArray_3542 == null) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.anIntArray_3542.length;
      }

   }

   static void method6664(int var0) {
      if(Class104_Sub21.renderSettings.aClass540_Sub12_7318.method1679(1389970496) == 1) {
         Class476.aClass306_8741.method3849(new Class297(Class305.aClass305_6028, (ByteArrayDataNode_Sub1)null), -599549962);
      } else {
         client.aClass296_348.method3789((byte)16);
         Class300.method3814(1985000374);
      }

   }
}
