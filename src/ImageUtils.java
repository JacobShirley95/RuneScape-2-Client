import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageUtils {

   static final int anInt_2621 = 65535;
   static final int anInt_2622 = 0;
   static final int anInt_2623 = 1;


   public static AbstractImageData getImageData(CacheDataUnpacker var0, int var1, int var2) {
      byte[] var3 = var0.getDataBytes(var1, var2, 552558012);
      return var3 == null?null:defineImage(var3)[0];
   }

   public static AbstractImageData method1794(CacheDataUnpacker var0, int var1) {
      byte[] var2 = var0.method3566(var1, 1661231993);
      return var2 == null?null:defineImage(var2)[0];
   }

   ImageUtils() throws Throwable {
      throw new Error();
   }

   public static AbstractImageData[] defineImage(byte[] var0) {
      ByteArrayDataNode byteDataNode = new ByteArrayDataNode(var0);
      byteDataNode.index = (var0.length - 2) * -2043502829;
      int imageCount = byteDataNode.readShort(-1205050174);
      int var5;
      int var6;
      int[] var7;
      int var8;
      if(imageCount != '\uffff') {
         ImageData[] var17 = new ImageData[imageCount];

         int var19;
         for(var19 = 0; var19 < imageCount; ++var19) {
            var17[var19] = new ImageData();
         }

         byteDataNode.index = (var0.length - 7 - imageCount * 8) * -2043502829;
         var19 = byteDataNode.readShort(845174731);
         var5 = byteDataNode.readShort(866816386);
         var6 = (byteDataNode.readByte(-1065028092) & 255) + 1;

         int var21;
         for(var21 = 0; var21 < imageCount; ++var21) {
            var17[var21].x = byteDataNode.readShort(-348666092);
         }

         for(var21 = 0; var21 < imageCount; ++var21) {
            var17[var21].y = byteDataNode.readShort(1965857189);
         }

         for(var21 = 0; var21 < imageCount; ++var21) {
            var17[var21].width = byteDataNode.readShort(1082279970);
         }

         for(var21 = 0; var21 < imageCount; ++var21) {
            var17[var21].height = byteDataNode.readShort(1585639743);
         }

         for(var21 = 0; var21 < imageCount; ++var21) {
            ImageData var23 = var17[var21];
            var23.posX = var19 - var23.width - var23.x;
            var23.posY = var5 - var23.height - var23.y;
         }

         byteDataNode.index = (var0.length - 7 - imageCount * 8 - (var6 - 1) * 3) * -2043502829;
         var7 = new int[var6];

         for(var8 = 1; var8 < var6; ++var8) {
            var7[var8] = byteDataNode.method4479(738776218);
            if(var7[var8] == 0) {
               var7[var8] = 1;
            }
         }

         for(var8 = 0; var8 < imageCount; ++var8) {
            var17[var8].anIntArray_10491 = var7;
         }

         byteDataNode.index = 0;

         for(var8 = 0; var8 < imageCount; ++var8) {
            ImageData var9 = var17[var8];
            int var10 = var9.width * var9.height;
            var9.data = new byte[var10];
            int var11 = byteDataNode.readByte(199346924);
            int var13;
            if((var11 & 2) == 0) {
               int var12;
               if((var11 & 1) == 0) {
                  for(var12 = 0; var12 < var10; ++var12) {
                     var9.data[var12] = byteDataNode.getByte((byte)40);
                  }
               } else {
                  for(var12 = 0; var12 < var9.width; ++var12) {
                     for(var13 = 0; var13 < var9.height; ++var13) {
                        var9.data[var12 + var13 * var9.width] = byteDataNode.getByte((byte)91);
                     }
                  }
               }
            } else {
               boolean var24 = false;
               var9.aByteArray_10493 = new byte[var10];
               if((var11 & 1) == 0) {
                  for(var13 = 0; var13 < var10; ++var13) {
                     var9.data[var13] = byteDataNode.getByte((byte)70);
                  }

                  for(var13 = 0; var13 < var10; ++var13) {
                     byte var14 = var9.aByteArray_10493[var13] = byteDataNode.getByte((byte)76);
                     var24 |= var14 != -1;
                  }
               } else {
                  int var25;
                  for(var13 = 0; var13 < var9.width; ++var13) {
                     for(var25 = 0; var25 < var9.height; ++var25) {
                        var9.data[var13 + var25 * var9.width] = byteDataNode.getByte((byte)74);
                     }
                  }

                  for(var13 = 0; var13 < var9.width; ++var13) {
                     for(var25 = 0; var25 < var9.height; ++var25) {
                        byte var15 = var9.aByteArray_10493[var13 + var25 * var9.width] = byteDataNode.getByte((byte)115);
                        var24 |= var15 != -1;
                     }
                  }
               }

               if(!var24) {
                  var9.aByteArray_10493 = null;
               }
            }
         }

         return var17;
      } else {
         byteDataNode.index = 0;
         int var3 = byteDataNode.readByte(1520070644);
         if(var3 != 0) {
            if(var3 == 1) {
               try {
                  BufferedImage var18 = ImageIO.read(new ByteArrayInputStream(byteDataNode.data, byteDataNode.index * 964952859, byteDataNode.data.length - byteDataNode.index * 964952859));
                  var5 = var18.getWidth();
                  var6 = var18.getHeight();
                  BufferedImageData var20 = new BufferedImageData(var5, var6, var18.getData().getPixels(0, 0, var5, var6, new int[var5 * var6]));
                  return new AbstractImageData[]{var20};
               } catch (IOException var16) {
                  throw new RuntimeException();
               }
            } else {
               throw new RuntimeException();
            }
         } else {
            boolean var4 = byteDataNode.readByte(727944055) == 1;
            var5 = byteDataNode.readShort(-31887806);
            var6 = byteDataNode.readShort(-1207816325);
            var7 = new int[var5 * var6];

            for(var8 = 0; var8 < var5 * var6; ++var8) {
               var7[var8] = -16777216 | byteDataNode.method4479(738776218);
            }

            if(var4) {
               for(var8 = 0; var8 < var5 * var6; ++var8) {
                  var7[var8] &= 16777215;
                  var7[var8] |= byteDataNode.readByte(-725722406) << 24;
               }
            }

            BufferedImageData var22 = new BufferedImageData(var5, var6, var7);
            return new AbstractImageData[]{var22};
         }
      }
   }

   public static AbstractImageData[] method1796(CacheDataUnpacker var0, int var1) {
      byte[] var2 = var0.method3566(var1, 580904506);
      return var2 == null?null:defineImage(var2);
   }

   public static AbstractImageData[] method1797(CacheDataUnpacker var0, int var1, int var2) {
      byte[] var3 = var0.getDataBytes(var1, var2, -1934272151);
      return var3 == null?null:defineImage(var3);
   }
}
