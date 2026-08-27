package com.snake.helper;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.view.menu.bv0;
import com.snake.helper.InternalWebBrowser;
/* loaded from: classes.dex */
public class InternalWebBrowser extends Activity {
    public int a = 0;
    public String b = null;
    public boolean c = false;
    public WebView d;
    public TextView e;
    public ImageView f;
    public ProgressBar g;

    /* loaded from: classes.dex */
    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            InternalWebBrowser.this.k(str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return InternalWebBrowser.this.h(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return InternalWebBrowser.this.h(str);
        }
    }

    /* loaded from: classes.dex */
    public class b extends WebChromeClient {
        public b() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (InternalWebBrowser.this.g != null) {
                InternalWebBrowser.this.g.setProgress(i);
                InternalWebBrowser.this.g.setVisibility(i < 100 ? 0 : 8);
            }
        }
    }

    public final TextView f(String str, int i) {
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextSize(0, i);
        textView.setTextColor(Color.parseColor("#5F6368"));
        textView.setGravity(17);
        textView.setClickable(true);
        textView.setFocusable(true);
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(16843868, typedValue, true);
        textView.setBackgroundResource(typedValue.resourceId);
        return textView;
    }

    public final int g(int i) {
        return (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    public final boolean h(String str) {
        Object data;
        if (str == null) {
            return false;
        }
        String str2 = this.b;
        if (str2 != null && str.startsWith(str2)) {
            this.c = true;
            sendBroadcast(new Intent("com.snake.INTERNAL_OAUTH_RESULT").setPackage(bv0.o()).putExtra("url", str).putExtra("_userId", this.a));
            finish();
            return true;
        } else if (str.startsWith("http://") || str.startsWith("https://")) {
            return false;
        } else {
            try {
                Intent parseUri = Intent.parseUri(str, 1);
                parseUri.addCategory("android.intent.category.BROWSABLE");
                parseUri.setComponent(null);
                parseUri.setSelector(null);
                StringBuilder sb = new StringBuilder();
                sb.append("[1] handleUrl → engine: scheme=");
                sb.append(parseUri.getData().getScheme());
                sb.append(" data=");
                if (parseUri.getData().toString().length() > 60) {
                    data = parseUri.getData().toString().substring(0, 60) + "...";
                } else {
                    data = parseUri.getData();
                }
                sb.append(data);
                parseUri.putExtra("_snake_external_caller", true);
                bv0.j().C(parseUri, this.a);
            } catch (Exception unused) {
            }
            return true;
        }
    }

    public final /* synthetic */ void i(View view) {
        finish();
    }

    public final /* synthetic */ void j(View view) {
        WebView webView = this.d;
        if (webView != null) {
            webView.reload();
        }
    }

    public final void k(String str) {
        if (str == null || this.e == null) {
            return;
        }
        try {
            Uri parse = Uri.parse(str);
            String host = parse.getHost();
            TextView textView = this.e;
            if (host == null) {
                host = str;
            }
            textView.setText(host);
            boolean equals = "https".equals(parse.getScheme());
            this.f.setImageResource(equals ? 17301601 : 17301596);
            this.f.setColorFilter(equals ? Color.parseColor("#5F6368") : Color.parseColor("#EA4335"));
        } catch (Exception unused) {
            this.e.setText(str);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        WebView webView = this.d;
        if (webView == null || !webView.canGoBack()) {
            finish();
        } else {
            this.d.goBack();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        requestWindowFeature(1);
        super.onCreate(bundle);
        if (getActionBar() != null) {
            getActionBar().hide();
        }
        Intent intent = getIntent();
        if (intent != null) {
            str = intent.getStringExtra("url");
            this.a = intent.getIntExtra("_userId", 0);
            this.b = intent.getStringExtra("_oauth_redirect_prefix");
            if (str == null && intent.getData() != null) {
                str = intent.getData().toString();
            }
        } else {
            str = null;
        }
        if (str == null) {
            finish();
            return;
        }
        try {
            WebView.setDataDirectorySuffix("user_" + this.a);
        } catch (Exception unused) {
        }
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(Color.parseColor("#F5F5F5"));
        window.getDecorView().setSystemUiVisibility(8192);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(-1);
        linearLayout.setFitsSystemWindows(true);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setBackgroundColor(Color.parseColor("#F5F5F5"));
        int g = g(56);
        int g2 = g(12);
        linearLayout2.setPadding(g2, 0, g2, 0);
        linearLayout2.setElevation(g(2));
        View f = f("✕", g(20));
        f.setOnClickListener(new View.OnClickListener() { // from class: androidx.appcompat.view.menu.a60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InternalWebBrowser.this.i(view);
            }
        });
        linearLayout2.addView(f, new LinearLayout.LayoutParams(g(40), g(40)));
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#E8E8E8"));
        gradientDrawable.setCornerRadius(g(20));
        linearLayout3.setBackground(gradientDrawable);
        linearLayout3.setPadding(g(12), g(6), g(12), g(6));
        ImageView imageView = new ImageView(this);
        this.f = imageView;
        imageView.setImageResource(17301601);
        this.f.setColorFilter(Color.parseColor("#5F6368"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(g(16), g(16));
        layoutParams.setMarginEnd(g(6));
        linearLayout3.addView(this.f, layoutParams);
        TextView textView = new TextView(this);
        this.e = textView;
        textView.setTextColor(Color.parseColor("#3C4043"));
        this.e.setTextSize(2, 14.0f);
        this.e.setSingleLine(true);
        this.e.setTypeface(Typeface.DEFAULT);
        linearLayout3.addView(this.e, new LinearLayout.LayoutParams(0, -2, 1.0f));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, g(36), 1.0f);
        layoutParams2.setMarginStart(g(8));
        layoutParams2.setMarginEnd(g(8));
        linearLayout2.addView(linearLayout3, layoutParams2);
        View f2 = f("↻", g(22));
        f2.setOnClickListener(new View.OnClickListener() { // from class: androidx.appcompat.view.menu.b60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InternalWebBrowser.this.j(view);
            }
        });
        linearLayout2.addView(f2, new LinearLayout.LayoutParams(g(40), g(40)));
        linearLayout2.addView(f("⋮", g(22)), new LinearLayout.LayoutParams(g(40), g(40)));
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, g));
        ProgressBar progressBar = new ProgressBar(this, null, 16842872);
        this.g = progressBar;
        progressBar.setIndeterminate(false);
        this.g.setMax(100);
        this.g.setScaleY(0.5f);
        this.g.getProgressDrawable().setColorFilter(Color.parseColor("#1A73E8"), PorterDuff.Mode.SRC_IN);
        linearLayout.addView(this.g, new LinearLayout.LayoutParams(-1, g(3)));
        WebView webView = new WebView(this);
        this.d = webView;
        cookieManager.setAcceptThirdPartyCookies(webView, true);
        WebSettings settings = this.d.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setMixedContentMode(2);
        settings.setUserAgentString(settings.getUserAgentString().replace("; wv", ""));
        this.d.setWebViewClient(new a());
        this.d.setWebChromeClient(new b());
        linearLayout.addView(this.d, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        setContentView(linearLayout);
        k(str);
        this.d.loadUrl(str);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (this.b != null && !this.c) {
            sendBroadcast(new Intent("com.snake.INTERNAL_OAUTH_CANCELLED").setPackage(bv0.o()).putExtra("_userId", this.a));
        }
        super.onDestroy();
    }
}
