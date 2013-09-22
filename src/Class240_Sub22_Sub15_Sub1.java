
public class Class240_Sub22_Sub15_Sub1 extends Class240_Sub22_Sub15 {

   ByteArrayDataNode dataNode;
   byte aByte_3236;


   int percentLoaded(short var1) {
      return null == this.dataNode?0:2006005388 * this.dataNode.index / (this.dataNode.data.length - this.aByte_3236);
   }

   byte[] getBytes(int var1) {
      if(!this.aBoolean_3671 && this.dataNode.index * 964952859 >= this.dataNode.data.length - this.aByte_3236) {
         return this.dataNode.data;
      } else {
         throw new RuntimeException();
      }
   }
}
