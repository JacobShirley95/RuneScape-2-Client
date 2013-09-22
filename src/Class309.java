
public class Class309 {

   int anInt_6069;
   int anInt_6070;
   int[] anIntArray_6071 = new int[2];
   int anInt_6072;
   int anInt_6073;
   int[] anIntArray_6074 = new int[2];
   int anInt_6075;
   int anInt_6076;
   int anInt_6077;
   int anInt_6078;
   int anInt_6079 = 2;


   Class309() {
      this.anIntArray_6074[0] = 0;
      this.anIntArray_6074[1] = '\uffff';
      this.anIntArray_6071[0] = 0;
      this.anIntArray_6071[1] = '\uffff';
   }

   final void method3868(ByteArrayDataNode var1) {
      this.anInt_6069 = var1.readByte(1439415282);
      this.anInt_6072 = var1.method4480(1260717178);
      this.anInt_6073 = var1.method4480(1260717178);
      this.method3869(var1);
   }

   final void method3869(ByteArrayDataNode var1) {
      this.anInt_6079 = var1.readByte(-21776777);
      this.anIntArray_6074 = new int[this.anInt_6079];
      this.anIntArray_6071 = new int[this.anInt_6079];

      for(int var2 = 0; var2 < this.anInt_6079; ++var2) {
         this.anIntArray_6074[var2] = var1.readShort(-1287280367);
         this.anIntArray_6071[var2] = var1.readShort(-306095772);
      }

   }

   final void method3870() {
      this.anInt_6075 = 0;
      this.anInt_6076 = 0;
      this.anInt_6070 = 0;
      this.anInt_6078 = 0;
      this.anInt_6077 = 0;
   }

   final int method3871(int var1) {
      if(this.anInt_6077 >= this.anInt_6075) {
         this.anInt_6078 = this.anIntArray_6071[this.anInt_6076++] << 15;
         if(this.anInt_6076 >= this.anInt_6079) {
            this.anInt_6076 = this.anInt_6079 - 1;
         }

         this.anInt_6075 = (int)((double)this.anIntArray_6074[this.anInt_6076] / 65536.0D * (double)var1);
         if(this.anInt_6075 > this.anInt_6077) {
            this.anInt_6070 = ((this.anIntArray_6071[this.anInt_6076] << 15) - this.anInt_6078) / (this.anInt_6075 - this.anInt_6077);
         }
      }

      this.anInt_6078 += this.anInt_6070;
      ++this.anInt_6077;
      return this.anInt_6078 - this.anInt_6070 >> 15;
   }
}
