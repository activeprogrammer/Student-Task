package com.appso.studenttask;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Mybrowser extends WebViewClient {
	public boolean clint(WebView web, String url) {
		web.loadUrl(url);
		return true;
	}
}
