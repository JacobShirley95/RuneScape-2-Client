import java.util.Random;

public class Class417 implements Class551 {

   static final Class417 aClass417_7919 = new Class417(1, 2);
   static final Class417 aClass417_7920 = new Class417(3, 9);
   static final Class417 aClass417_7921 = new Class417(6, 3);
   static final Class417 aClass417_7922 = new Class417(11, 4);
   static final Class417 aClass417_7923 = new Class417(4, 1);
   static final Class417 aClass417_7924 = new Class417(7, 6);
   static final Class417 aClass417_7925 = new Class417(5, 7);
   static final Class417 aClass417_7926 = new Class417(8, 8);
   final int anInt_7927;
   static final Class417 aClass417_7928 = new Class417(2, 12);
   static final Class417 aClass417_7929 = new Class417(12, 11);
   static final Class417 aClass417_7930 = new Class417(9, 5);
   static final Class417 aClass417_7931 = new Class417(10, 13);
   static final Class417 aClass417_7932 = new Class417(0, 10);
   final int anInt_7933;


   public int getLanguageID(int var1) {
      return 221502595 * this.anInt_7933;
   }

   Class417(int var1, int var2) {
      this.anInt_7927 = var1 * -335625197;
      this.anInt_7933 = var2 * 624448043;
   }

   public static void method5179(byte var0) {
      if(Class15.aClass316_133 != null) {
         Class15.aClass316_133.method3909();
      }

      if(Class306.aClass316_6036 != null) {
         Class306.aClass316_6036.method3909();
      }

   }

   static final void method5180(RSInterfaceData var0, int var1) {
      OptionListNode var2 = Class240_Sub33.method4885(1333827485);
      if(Class104_Sub7.getOptionAction(var2, (byte)-89) == 4) {
         Class240_Sub9 var3 = (Class240_Sub9)client.npcNodeList.getNode(var2.getTarget());
         if(null != var3) {
            var0.animeTarget = (RSCharacter)var3.anObject_6783;
            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1;
            return;
         }
      }

      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
   }

   static final void method5181(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
   }

   public static int method5182(Random var0, int var1, int var2) {
      if(var0 == null) {
         var0 = Class471.aRandom_8701;
         if(var0 == null) {
            Object var3 = Class471.anObject_8702;
            synchronized(Class471.anObject_8702) {
               if(null == Class471.aRandom_8701) {
                  Class471.aRandom_8701 = new Random();
               }

               var0 = Class471.aRandom_8701;
            }
         }
      }

      if(var1 <= 0) {
         throw new IllegalArgumentException();
      } else if(Animator.method5897(var1, (byte)70)) {
         return (int)(((long)var0.nextInt() & 4294967295L) * (long)var1 >> 32);
      } else {
         int var6 = Integer.MIN_VALUE - (int)(4294967296L % (long)var1);

         int var4;
         do {
            var4 = var0.nextInt();
         } while(var4 >= var6);

         return Class585.method6355(var4, var1, 1312440909);
      }
   }

   static final void method5183(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[var0.intTypeIndex * -831324111 + 1];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class534.aClass275_9439.method3606(var2, -1882059307).aCharArray_3539[var3];
   }

   static final void method5184(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[var0.intTypeIndex * -831324111 + 1];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class534.aClass275_9439.method3606(var2, -1469282213).aCharArray_3543[var3];
   }

   static final void method5185(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class544.method6095(var3, var4, var0, (short)-31406);
   }

   static final void method5186(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      if(!var4.equals(var0.title)) {
         var0.title = var4;
         Class110_Sub1.method3149(var0, -881242723);
      }

      if(-1 == var0.anInt_2428 * -1001687885 && !var1.aBoolean_2054) {
         Exception_Sub1.method1145(var0.cacheID * 1278853609, -989742338);
      }

   }
}
