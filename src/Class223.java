import java.io.File;
import java.util.Hashtable;

public class Class223 {

   static File aFile_3824;
   static boolean cacheFileExists = false;
   static Hashtable loadedFileMap = new Hashtable(16);
   public static AbstractKeyboardHandler captureKeyboardList;


   Class223() throws Throwable {
      throw new Error();
   }

   static final void method2803(RSInterfaceData var0, int var1) {
      Class519.method5965(-837184308);
   }

   public static boolean method2804(char var0, byte var1) {
      return var0 >= 48 && var0 <= 57;
   }

   static final void method2805(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -671235497 * var3.parentID;
   }

   static void method2806(int var0, int var1) {
      AbstractUpdateServerConnector.viewOfMapImageY = var0 * -394363757;
      Class248_Sub1.anInt_6447 = 826358349;
      Class248_Sub1.anInt_6447 = 826358349;
      RenderSettings.method4829(710302288);
   }

   static void method2807(ByteArrayDataNode var0, int var1) {
      for(int var2 = 0; var2 < Class613.serverCount * 1096385619; ++var2) {
         int var3 = var0.method4490((byte)0);
         int var4 = var0.readShort(399239323);
         if(var4 == '\uffff') {
            var4 = -1;
         }

         if(null != Class613.worldArray[var3]) {
            Class613.worldArray[var3].players = var4 * 1410518027;
         }
      }

   }
}
