
public class Class156 {

   int anInt_2762 = 0;
   Class161[] aClass161Array_2763;
   int anInt_2764 = 0;
   final Class143 textureDecider;
   final OpenGLRenderer aRenderer_Sub2_2766;
   int anInt_2767 = 0;
   final Class161_Sub5 aClass161_Sub5_2768;


   boolean method1854(int var1) {
      return this.aClass161Array_2763[var1].method1883();
   }

   boolean method1855(OGLTexture var1, int var2) {
      if(this.anInt_2767 == 0) {
         return false;
      } else {
         this.aClass161Array_2763[this.anInt_2767 & Integer.MAX_VALUE].method1879(var1, var2);
         return true;
      }
   }

   Class156(OpenGLRenderer var1) {
      this.aRenderer_Sub2_2766 = var1;
      this.textureDecider = new Class143(var1);
      this.aClass161Array_2763 = new Class161[16];
      this.aClass161Array_2763[1] = new Class161_Sub4(var1);
      this.aClass161Array_2763[2] = new Class161_Sub6(var1, this.textureDecider);
      this.aClass161Array_2763[4] = new Class161_Sub8(var1, this.textureDecider);
      this.aClass161Array_2763[5] = new Class161_Sub3(var1, this.textureDecider);
      this.aClass161Array_2763[6] = new Class161_Sub1(var1);
      this.aClass161Array_2763[7] = new Class161_Sub2(var1);
      this.aClass161Array_2763[3] = this.aClass161_Sub5_2768 = new Class161_Sub5(var1);
      this.aClass161Array_2763[8] = new Class161_Sub7(var1, this.textureDecider);
      this.aClass161Array_2763[9] = new Class161_Sub9(var1, this.textureDecider);
      if(!this.aClass161Array_2763[8].method1883()) {
         this.aClass161Array_2763[8] = this.aClass161Array_2763[4];
      }

      if(!this.aClass161Array_2763[9].method1883()) {
         this.aClass161Array_2763[9] = this.aClass161Array_2763[8];
      }

   }

   void method1856(int var1, int var2, int var3, boolean var4, boolean var5) {
      var5 &= this.aRenderer_Sub2_2766.method7060();
      if(!var5 && (var1 == 4 || var1 == 8 || var1 == 9)) {
         if(var1 == 4) {
            var3 = var2;
         }

         var1 = 2;
      }

      if(var1 != 0 && var4) {
         var1 |= Integer.MIN_VALUE;
      }

      if(this.anInt_2767 != var1) {
         if(this.anInt_2767 != 0) {
            this.aClass161Array_2763[this.anInt_2767 & Integer.MAX_VALUE].method1884();
         }

         if(var1 != 0) {
            this.aClass161Array_2763[var1 & Integer.MAX_VALUE].method1880(var4);
            this.aClass161Array_2763[var1 & Integer.MAX_VALUE].method1881(var4);
            this.aClass161Array_2763[var1 & Integer.MAX_VALUE].method1882(var2, var3);
         }

         this.anInt_2767 = var1;
         this.anInt_2762 = var2;
         this.anInt_2764 = var3;
      } else if(this.anInt_2767 != 0) {
         this.aClass161Array_2763[this.anInt_2767 & Integer.MAX_VALUE].method1881(var4);
         if(this.anInt_2762 != var2 || this.anInt_2764 != var3) {
            this.aClass161Array_2763[this.anInt_2767 & Integer.MAX_VALUE].method1882(var2, var3);
            this.anInt_2762 = var2;
            this.anInt_2764 = var3;
         }
      }

   }
}
