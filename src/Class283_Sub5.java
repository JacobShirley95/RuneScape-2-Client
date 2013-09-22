
final class Class283_Sub5 extends Class283 {

   static int anInt_8259;


   Class283_Sub5(Class124 var1, int var2, boolean var3, boolean var4) {
      super(var1, var2, var3, var4, (Class283_Sub5)null);
   }

   Object method3666(Class187 var1, int var2) {
      return var1.aClass373_3197 == Class373.aClass373_7004?Integer.valueOf(-1):var1.aClass373_3197.method4743(342511150);
   }

   static char method5312(char var0, int var1) {
      switch(var0) {
      case 32:
      case 45:
      case 95:
      case 160:
         return '_';
      case 35:
      case 91:
      case 93:
         return var0;
      case 192:
      case 193:
      case 194:
      case 195:
      case 196:
      case 224:
      case 225:
      case 226:
      case 227:
      case 228:
         return 'a';
      case 199:
      case 231:
         return 'c';
      case 200:
      case 201:
      case 202:
      case 203:
      case 232:
      case 233:
      case 234:
      case 235:
         return 'e';
      case 205:
      case 206:
      case 207:
      case 237:
      case 238:
      case 239:
         return 'i';
      case 209:
      case 241:
         return 'n';
      case 210:
      case 211:
      case 212:
      case 213:
      case 214:
      case 242:
      case 243:
      case 244:
      case 245:
      case 246:
         return 'o';
      case 217:
      case 218:
      case 219:
      case 220:
      case 249:
      case 250:
      case 251:
      case 252:
         return 'u';
      case 223:
         return 'b';
      case 255:
      case 376:
         return 'y';
      default:
         return Character.toLowerCase(var0);
      }
   }

   static final void method5313(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(2 == -826987519 * client.anInt_567 && var2 < client.friendsCount * -1301826725) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = client.friendsList[var2].aString_48;
      } else {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
      }

   }
}
