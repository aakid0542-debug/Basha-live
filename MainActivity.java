package com.bhashalive.app;
import android.app.Activity; import android.os.Bundle; import android.webkit.WebView; import android.webkit.WebSettings; import android.webkit.WebChromeClient; import android.Manifest; import android.content.pm.PackageManager;
public class MainActivity extends Activity {
 protected void onCreate(Bundle b){super.onCreate(b); if(android.os.Build.VERSION.SDK_INT>=23 && checkSelfPermission(Manifest.permission.RECORD_AUDIO)!=PackageManager.PERMISSION_GRANTED) requestPermissions(new String[]{Manifest.permission.RECORD_AUDIO},10);
 WebView w=new WebView(this); WebSettings s=w.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); w.setWebChromeClient(new WebChromeClient()); w.loadUrl("file:///android_asset/index.html"); setContentView(w);}
}