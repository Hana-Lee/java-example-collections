package kr.co.leehana.example.bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class SimpleHttpClient {

	private URL baseurl;

	public SimpleHttpClient(String baseurl) throws MalformedURLException {
		this.baseurl = new URL(baseurl);
	}

	public SimpleHttpClient(URL url) {
		this.baseurl = url;
	}

	public String get(String route) throws IOException {
		StringBuilder sb = new StringBuilder();
		String base = this.baseurl.getHost();
		URL u = new URL("http://" + base + route);
		URLConnection conn = u.openConnection();
		BufferedInputStream in = new BufferedInputStream(conn.getInputStream());

		while (in.available() > 0) {
			sb.append((char) in.read());
		}

		return sb.toString();
	}
}
