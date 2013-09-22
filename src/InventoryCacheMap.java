
public class InventoryCacheMap {

   int anInt_9960;
   int anInt_9961;
   NodeArrayList aNodeArrayList_9962;
   Class494 aClass494_9963 = new Class494();


   public final void method6582(int var1) {
      for(Class240_Sub22_Sub13 var2 = (Class240_Sub22_Sub13)this.aClass494_9963.method5772(-1788905588); var2 != null; var2 = (Class240_Sub22_Sub13)this.aClass494_9963.method5771(-671450658)) {
         if(var2.method2647()) {
            if(var2.method2646() == null) {
               var2.shiftNext();
               var2.shiftNext();
               this.anInt_9960 += var2.anInt_3608;
            }
         } else if((var2.aLong_7278 += -390861045572062217L) * 2950103203925786055L > (long)var1) {
            Class240_Sub22_Sub13_Sub1 var3 = new Class240_Sub22_Sub13_Sub1(var2.aClass622_3607, var2.method2646(), var2.anInt_3608);
            this.aNodeArrayList_9962.insert(var3, var2.id * 4058728944299054175L);
            Class32.method228(var3, var2, -660995694);
            var2.shiftNext();
            var2.shiftNext();
         }
      }

   }

   final void method6583(Class622 var1) {
      long var2 = var1.method6641();

      for(Class240_Sub22_Sub13 var4 = (Class240_Sub22_Sub13)this.aNodeArrayList_9962.getNode(var2); var4 != null; var4 = (Class240_Sub22_Sub13)this.aNodeArrayList_9962.method5939(-1135136201)) {
         if(var4.aClass622_3607.method6640(var1)) {
            this.method6586(var4);
            break;
         }
      }

   }

   public final void method6584(Object var1, Class622 var2) {
      this.method6585(var1, var2, 1);
   }

   final void method6585(Object var1, Class622 var2, int var3) {
      if(var3 > this.anInt_9961) {
         throw new IllegalStateException();
      } else {
         this.method6583(var2);
         this.anInt_9960 -= var3;

         while(this.anInt_9960 < 0) {
            Class240_Sub22_Sub13 var4 = (Class240_Sub22_Sub13)this.aClass494_9963.method5776(-427640803);
            this.method6586(var4);
         }

         Class240_Sub22_Sub13_Sub2 var5 = new Class240_Sub22_Sub13_Sub2(var2, var1, var3);
         this.aNodeArrayList_9962.insert(var5, var2.method6641());
         this.aClass494_9963.insert(var5, 1166789032);
         var5.aLong_7278 = 0L;
      }
   }

   final void method6586(Class240_Sub22_Sub13 var1) {
      if(var1 != null) {
         var1.shiftNext();
         var1.shiftNext();
         this.anInt_9960 += var1.anInt_3608;
      }

   }

   public final int method6587() {
      return this.anInt_9961;
   }

   public final int method6588() {
      return this.anInt_9960;
   }

   public final void method6589() {
      for(Class240_Sub22_Sub13 var1 = (Class240_Sub22_Sub13)this.aClass494_9963.method5772(175655954); var1 != null; var1 = (Class240_Sub22_Sub13)this.aClass494_9963.method5771(-38330731)) {
         if(var1.method2647()) {
            var1.shiftNext();
            var1.shiftNext();
            this.anInt_9960 += var1.anInt_3608;
         }
      }

   }

   public final void method6590() {
      this.aClass494_9963.method5770(-83913416);
      this.aNodeArrayList_9962.method5938(1487152327);
      this.anInt_9960 = this.anInt_9961;
   }

   public InventoryCacheMap(int var1) {
      this.anInt_9961 = var1;
      this.anInt_9960 = var1;

      int var2;
      for(var2 = 1; var2 + var2 < var1; var2 += var2) {
         ;
      }

      this.aNodeArrayList_9962 = new NodeArrayList(var2);
   }

   public final Object get(Class622 var1) {
      long var2 = var1.method6641();

      for(Class240_Sub22_Sub13 var4 = (Class240_Sub22_Sub13)this.aNodeArrayList_9962.getNode(var2); var4 != null; var4 = (Class240_Sub22_Sub13)this.aNodeArrayList_9962.method5939(-1135136201)) {
         if(var4.aClass622_3607.method6640(var1)) {
            Object var5 = var4.method2646();
            if(var5 != null) {
               if(var4.method2647()) {
                  Class240_Sub22_Sub13_Sub2 var6 = new Class240_Sub22_Sub13_Sub2(var1, var5, var4.anInt_3608);
                  this.aNodeArrayList_9962.insert(var6, var4.id * 4058728944299054175L);
                  this.aClass494_9963.insert(var6, 1128590189);
                  var6.aLong_7278 = 0L;
                  var4.shiftNext();
                  var4.shiftNext();
               } else {
                  this.aClass494_9963.insert(var4, 110612976);
                  var4.aLong_7278 = 0L;
               }

               return var5;
            }

            var4.shiftNext();
            var4.shiftNext();
            this.anInt_9960 += var4.anInt_3608;
         }
      }

      return null;
   }
}
