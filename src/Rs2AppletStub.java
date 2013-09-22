

import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.applet.AudioClip;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;

public class Rs2AppletStub implements AppletStub{

	private HashMap<String, String> params;
	private String docbase;
	private String codebase;
	
	public Rs2AppletStub(String docbase, String codebase, HashMap<String, String> params) {
		this.docbase = docbase;
		this.codebase = codebase;
		this.params = params;
	}
	
	@Override
	public void appletResize(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AppletContext getAppletContext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URL getCodeBase() {
		try {
			System.out.println(codebase);
			//return new URL("http://world11.runescape.com");
			return new URL(codebase);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public URL getDocumentBase() {
		try {
			return new URL(docbase);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String getParameter(String arg0) {
		return params.get(arg0);
	}

	@Override
	public boolean isActive() {
		return true;
	}


}
