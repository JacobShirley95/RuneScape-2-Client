
public class Class240_Sub18 extends NodeListNode {

   float aFloat_7127;
   final Class401 aClass401_7128;
   int anInt_7129;
   int anInt_7130;
   final Class172 aClass172_7131;
   float aFloat_7132;
   int anInt_7133;
   static float[] aFloatArray_7134 = new float[3];


   Class240_Sub18(Class172 var1, Class594 var2) {
      this.aClass172_7131 = var1;
      this.aClass401_7128 = this.aClass172_7131.method2169((byte)74);
      this.method4770((byte)0);
   }

   void method4770(byte var1) {
      this.anInt_7130 = this.aClass172_7131.anInt_3034 * -1013491401;
      this.anInt_7133 = -1468646783 * this.aClass172_7131.anInt_3039;
      this.anInt_7129 = -1781372137 * this.aClass172_7131.anInt_3037;
      if(this.aClass172_7131.anArrayViewport_3038 != null) {
         this.aClass172_7131.anArrayViewport_3038.method4576((float)(this.aClass401_7128.anInt_7638 * -1831859401), (float)(1689304253 * this.aClass401_7128.anInt_7629), (float)(218013533 * this.aClass401_7128.anInt_7628), aFloatArray_7134);
      }

      this.aFloat_7127 = aFloatArray_7134[0];
      this.aFloat_7132 = aFloatArray_7134[2];
   }

   static final void method4771(RSInterfaceData var0, int var1) {
      if(Animation.aShortArray_10128 != null && Class462.anInt_8604 * -995843909 < Class357.anInt_6780 * -2050929757) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Animation.aShortArray_10128[(Class462.anInt_8604 += -1040407437) * -995843909 - 1] & '\uffff';
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
      }

   }
}
