
public class CacheDataNode extends Class240_Sub22_Sub15 {

   static final int anInt_3237 = 3;
   static final int anInt_3238 = 2;
   static final int anInt_3239 = 1;
   byte[] data;
   Class243 aClass243_3241;
   int anInt_3242;
   public static FontRenderer aTextRenderer_3243;


   int percentLoaded(short var1) {
      return this.aBoolean_3671?0:100;
   }

   byte[] getBytes(int var1) {
      if(this.aBoolean_3671) {
         throw new RuntimeException();
      } else {
         return this.data;
      }
   }
}
