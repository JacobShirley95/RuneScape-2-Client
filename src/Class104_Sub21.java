
public class Class104_Sub21 extends CharTask {

   static Class96 aClass96_10733;
   final int anInt_10734;
   final int anInt_10735;
   public static RenderSettings renderSettings;
   static int anInt_10737;


   public void execute() {
      Class95.aClass100Array_1894[-850824129 * this.anInt_10734].getTarget((byte)118).turnTo(-1872011203 * this.anInt_10735, true, 1714934446);
   }

   Class104_Sub21(ByteArrayDataNode var1) {
      super(var1);
      this.anInt_10734 = var1.readShort(382297820) * 1051229119;
      this.anInt_10735 = var1.readShort(579473887) * 534001429;
   }

   public static String method7396(OptionListNode var0, byte var1) {
      return !Class18.optionsClosed && null != var0?((var0.optionString == null || var0.optionString.length() == 0) && null != var0.aString_956 && var0.aString_956.length() > 0?var0.aString_956:var0.optionString):"";
   }

   static final void method7397(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= 1462854468;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      int var4 = var0.intTypes[-831324111 * var0.intTypeIndex + 2];
      int var5 = var0.intTypes[3 + -831324111 * var0.intTypeIndex];
      MapPoint var6 = client.aClass296_348.getMapArea();
      Class167.method2083((var2 >> 14 & 16383) - var6.loadedMapX * 1265321541, (var2 & 16383) - -1996781083 * var6.loadedMapY, var3 << 2, var4, var5, -299112895);
   }
}
