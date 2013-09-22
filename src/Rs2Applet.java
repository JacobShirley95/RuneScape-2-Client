

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rs2Applet extends Applet{
	
	public static final String USER_AGENT; //default for an (old) firefox version is set below
    static {
        String osname = System.getProperty("os.name");
	    String windowing = "X11";
	    if (osname.contains("Windows")) windowing = "Windows";
	    else if (osname.contains("Mac")) windowing = "Macintosh";
	    USER_AGENT = "Mozilla/5.0 (" + windowing + "; U; " + osname + " " + System.getProperty("os.version") + "; " + Locale.getDefault().getLanguage()+"-"+Locale.getDefault().getCountry()+"; rv:1.9.0.10) Gecko/2009042316 Firefox/3.0.10";    
    }
    private final String codeRegex = "code\\=([^ ]*) ";
    private final String widthRegex = "width\\=([^ ]*) ";
    private final String heightRegex = "height\\=([^ ]*) ";
    private final String archiveRegex = "archive\\=([^ ]*) ";

	private client clientObject;
	
	public Rs2Applet(client clientObj) {
		this.clientObject = clientObj;
		
		
		
		String jsInfoPage = downloadHTML("http://world24.runescape.com/game.js");
		
		HashMap<String, String> paramMap = new HashMap<String, String>();
        paramMap.put("width", parseArg(search(jsInfoPage, widthRegex, 1)));
        paramMap.put("height", parseArg(search(jsInfoPage, heightRegex, 1)));


        Matcher matcher = Pattern.compile("<param name\\=([^ ]*) value\\=([^>]*)>").matcher(jsInfoPage);
        while (matcher.find()) {
            paramMap.put(parseArg(matcher.group(1)), parseArg(matcher.group(2)));
        }
        
        System.out.println(paramMap.get("0"));
        
        String root = "http://world11.runescape.com/game.js?j=1";
        Rs2AppletStub stub = new Rs2AppletStub(root +  parseArg(search(jsInfoPage, archiveRegex, 1)), root, paramMap);
        setStub(stub);
        setPreferredSize(new Dimension(765, 553));
	}
	
	private static String search(String what, String regex, int group) {
        Matcher matcher = Pattern.compile(regex).matcher(what);
        matcher.find();
        return matcher.group(group);
    }
	
	private String parseArg(String arg) {
        return Pattern.matches("\".*\"", arg) ? arg.substring(1, arg.length() - 1) : arg;
    }
	
	 private String downloadHTML(String address) {
	        try {
	            URL url = new URL(address);
	            URLConnection conn = url.openConnection();
	            conn.setConnectTimeout(5000);
	            conn.setReadTimeout(5000);
	            //Firefox didn't set anything important that java didn't set by default, besides the useragent
	            //this useragent is for your browser, modify at will
			    conn.addRequestProperty("User-Agent",USER_AGENT);
			    conn.connect();
	            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	            StringBuilder builder = new StringBuilder();
	            String inputLine;
	            while ((inputLine = in.readLine()) != null) {
	                builder.append(inputLine).append("\n");
	            }
	            in.close();
	            return builder.toString();
	        } catch (Exception e) {
	            return null;
	        }
	    }
	
	@Override
	public final void destroy() {
		clientObject.destroy();
	}
	
	@Override
	public final void stop() {
		clientObject.stop();
	}
	
	@Override
	public final void start() {
		clientObject.stop();
	}

	@Override
	public final void update(Graphics var1) {
		clientObject.update(var1);
	}

	@Override
	public final void paint(Graphics var1) {
	}
	
	@Override
	public void init() {
		clientObject.supplyApplet(this);
		clientObject.init();
	}
}
