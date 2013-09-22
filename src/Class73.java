
public class Class73 {

   static final boolean method829(int var0, int var1) {
      return (var0 & 33) != 0;
   }

   static final boolean method830(int var0, int var1) {
      return (var0 & 458752) != 0 || method851(var0, var1) || method839(var0, var1);
   }

   static final boolean method831(int var0, int var1) {
      return (var0 & 55) != 0;
   }

   Class73() throws Throwable {
      throw new Error();
   }

   static final boolean method832(int var0, int var1) {
      return (var0 & 256) != 0;
   }

   static final boolean method833(int var0, int var1) {
      return false;
   }

   static final boolean method834(int var0, int var1) {
      return (var0 & 16) != 0;
   }

   static final boolean method835(int var0, int var1) {
      return (var0 & '\u8000') != 0;
   }

   static final boolean method836(int var0, int var1) {
      return (var0 & '\uc580') != 0;
   }

   static final boolean method837(int var0, int var1) {
      return (var0 & 2048) != 0;
   }

   static final boolean method838(int var0, int var1) {
      return (var0 & 2048) != 0 && (var1 & 55) != 0;
   }

   static final boolean method839(int var0, int var1) {
      return (method829(var0, var1) | method854(var0, var1) | method851(var0, var1)) & method837(var0, var1);
   }

   static final boolean method840(int var0, int var1) {
      return method838(var0, var1) & ((var0 & 8192) != 0 | method856(var0, var1) | method857(var0, var1));
   }

   static final boolean method841(int var0, int var1) {
      return !method837(var0, var1)?false:((var0 & '\u9000') != 0 | method859(var0, var1) | method832(var0, var1)?true:(var1 & 55) == 0 & ((var0 & 8192) != 0 | method856(var0, var1) | method857(var0, var1)));
   }

   static final boolean method842(int var0, int var1) {
      return method834(var0, var1) & method837(var0, var1);
   }

   static final boolean method843(int var0, int var1) {
      return (var0 & 458752) != 0 || method854(var0, var1) || method839(var0, var1);
   }

   static final boolean method844(int var0, int var1) {
      return method859(var0, var1) || method841(var0, var1);
   }

   static final boolean method845(int var0, int var1) {
      return method833(var0, var1) || method850(var0, var1);
   }

   static final boolean method846(int var0, int var1) {
      return (var0 & 384) != 0;
   }

   static final boolean method847(int var0, int var1) {
      return (var0 & 32) != 0;
   }

   static final boolean method848(int var0, int var1) {
      return (var0 & 1024) != 0;
   }

   static final boolean method849(int var0, int var1) {
      return (var0 & 2048) != 0 | method835(var0, var1) || method841(var0, var1);
   }

   static final boolean method850(int var0, int var1) {
      return method833(var0, var1) & method837(var0, var1);
   }

   static final boolean method851(int var0, int var1) {
      return (var0 & 52) != 0;
   }

   static final boolean method852(int var0, int var1) {
      return (var0 & 458752) != 0 || method829(var0, var1) || method839(var0, var1);
   }

   static final boolean method853(int var0, int var1) {
      boolean var2 = (var1 & 55) != 0?method840(var0, var1):method841(var0, var1);
      return (var0 & 65536) != 0 | method856(var0, var1) | var2;
   }

   static final boolean method854(int var0, int var1) {
      return (var0 & 34) != 0;
   }

   static final boolean method855(int var0, int var1) {
      return (var0 & 262144) != 0 | method832(var0, var1) || method841(var0, var1);
   }

   static final boolean method856(int var0, int var1) {
      return (var0 & 544) == 544 | (var0 & 24) != 0;
   }

   static final boolean method857(int var0, int var1) {
      return (var0 & 65536) != 0;
   }

   static final boolean method858(int var0, int var1) {
      return (var0 & 393216) != 0 | method834(var0, var1) || method842(var0, var1);
   }

   static final boolean method859(int var0, int var1) {
      return (var0 & 540800) != 0;
   }
}
