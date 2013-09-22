import java.io.File;
import javax.swing.filechooser.FileFilter;

public class FileFilter_Sub1 extends FileFilter {

   // $FF: synthetic field
   final Class20 aClass20_2099;
   Class20 aClass20_2100;


   public boolean accept(File var1) {
      return this.aClass20_2100.method116(2077945295) && var1.isDirectory()?true:!this.aClass20_2100.method116(2087978539);
   }

   public String getDescription() {
      return null;
   }

   FileFilter_Sub1(Class20 var1, Class20 var2) {
      this.aClass20_2099 = var1;
      this.aClass20_2100 = var2;
   }
}
