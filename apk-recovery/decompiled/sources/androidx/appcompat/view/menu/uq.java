package androidx.appcompat.view.menu;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.reflect.Field;
import java.net.URI;
/* loaded from: classes.dex */
public abstract class uq {
    public static String a = "https://www.facebook.com/login.php";
    public static String b = null;
    public static boolean c = false;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ Activity m;

        public a(Activity activity) {
            this.m = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(1000L);
                Handler handler = new Handler(Looper.getMainLooper());
                final Activity activity = this.m;
                handler.post(new Runnable() { // from class: androidx.appcompat.view.menu.tq
                    @Override // java.lang.Runnable
                    public final void run() {
                        uq.g(activity);
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends WebChromeClient {
        public final /* synthetic */ TextView a;

        public b(TextView textView) {
            this.a = textView;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            String url = webView.getUrl();
            if (url != null) {
                try {
                    this.a.setText(new URI(url).getHost());
                } catch (Exception unused) {
                    this.a.setText("");
                }
            }
        }
    }

    public static View e(final WebView webView, final Activity activity, WebViewClient webViewClient) {
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(-1);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(20, 2, 20, 2);
        linearLayout2.setBackgroundColor(Color.parseColor("#101010"));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(17301581);
        imageView.setImageTintList(ColorStateList.valueOf(-1));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: androidx.appcompat.view.menu.qq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                uq.k(webView, view);
            }
        });
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(17301560);
        imageView2.setImageTintList(ColorStateList.valueOf(-1));
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: androidx.appcompat.view.menu.rq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                activity.finish();
            }
        });
        Button button = new Button(activity);
        button.setText("Authorize Game");
        button.setAllCaps(false);
        button.setTextColor(-1);
        button.setBackgroundColor(Color.parseColor("#6200EE"));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#151515"));
        gradientDrawable.setCornerRadius(15.0f);
        TextView textView = new TextView(activity);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setTextSize(16.0f);
        textView.setPadding(20, 10, 20, 10);
        textView.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(h(activity, 20.0f), h(activity, 20.0f));
        layoutParams.setMargins(20, 20, 20, 20);
        linearLayout2.addView(imageView, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.weight = 1.0f;
        textView.setTextAlignment(2);
        linearLayout2.addView(textView, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(h(activity, 20.0f), h(activity, 20.0f));
        layoutParams3.setMargins(20, 20, 20, 20);
        linearLayout2.addView(imageView2, layoutParams3);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        Dialog dialog = new Dialog(activity);
        dialog.setCancelable(false);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        ProgressBar progressBar = new ProgressBar(activity);
        progressBar.setIndeterminate(true);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setGravity(17);
        linearLayout3.addView(progressBar);
        dialog.setContentView(linearLayout3);
        final CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.setAcceptThirdPartyCookies(webView, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams4.weight = 1.0f;
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, h(activity, 60.0f)));
        linearLayout.addView(webView, layoutParams4);
        linearLayout.addView(button, new LinearLayout.LayoutParams(-1, -2));
        button.setOnClickListener(new View.OnClickListener() { // from class: androidx.appcompat.view.menu.sq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                uq.m(cookieManager, webView, activity, view);
            }
        });
        webView.setWebChromeClient(new b(textView));
        n(webView, webViewClient, activity);
        return linearLayout;
    }

    public static boolean f(String str, String str2) {
        return str2.contains("save-device/") || (str.contains("c_user") && str.contains("xs"));
    }

    public static void g(Activity activity) {
        Object obj;
        if (activity.getClass().getName().equals("com.facebook.FacebookActivity")) {
            String j = j(bv0.m());
            if (j.equals("0")) {
                return;
            }
            try {
                Field declaredField = activity.getClass().getDeclaredField("currentFragment");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(activity);
                Field declaredField2 = obj2.getClass().getDeclaredField("loginClient");
                declaredField2.setAccessible(true);
                Object obj3 = declaredField2.get(obj2);
                Field declaredField3 = obj3.getClass().getDeclaredField("handlersToTry");
                declaredField3.setAccessible(true);
                Object[] objArr = (Object[]) declaredField3.get(obj3);
                if (objArr == null) {
                    new Thread(new a(activity)).start();
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= objArr.length) {
                        obj = null;
                        break;
                    } else if (objArr[i].getClass().getName().equals("com.facebook.login.WebViewLoginMethodHandler")) {
                        obj = objArr[i];
                        break;
                    } else {
                        i++;
                    }
                }
                if (obj == null) {
                    return;
                }
                Field declaredField4 = obj.getClass().getDeclaredField("loginDialog");
                declaredField4.setAccessible(true);
                Object obj4 = declaredField4.get(obj);
                o(obj4, activity);
                Field declaredField5 = obj4.getClass().getDeclaredField("webView");
                Field declaredField6 = obj4.getClass().getDeclaredField("spinner");
                declaredField5.setAccessible(true);
                declaredField6.setAccessible(true);
                WebView webView = (WebView) declaredField5.get(obj4);
                b = webView.getUrl();
                WebViewClient webViewClient = webView.getWebViewClient();
                webView.setWebChromeClient(null);
                webView.setWebViewClient(null);
                if (j.equals("0")) {
                    n(webView, webViewClient, activity);
                    i(webView);
                    return;
                }
                ProgressDialog progressDialog = (ProgressDialog) declaredField6.get(obj4);
                webView.loadUrl("");
                declaredField5.set(obj4, null);
                WebView webView2 = new WebView(activity);
                webView2.getSettings().setJavaScriptEnabled(true);
                ((Dialog) obj4).hide();
                if (progressDialog.isShowing()) {
                    progressDialog.hide();
                }
                activity.setContentView(e(webView2, activity, webViewClient));
                webView2.loadUrl(b);
                activity.setRequestedOrientation(1);
            } catch (Throwable unused) {
            }
        }
    }

    public static int h(Context context, float f) {
        return Math.round(f * context.getResources().getDisplayMetrics().density);
    }

    public static void i(WebView webView) {
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.setAcceptThirdPartyCookies(webView, true);
        webView.getSettings().setJavaScriptEnabled(true);
        CookieManager.setAcceptFileSchemeCookies(true);
        webView.loadUrl(a);
    }

    public static String j(Context context) {
        return context.getSharedPreferences(bv0.o(), 0).getString("fb_login_method", "0");
    }

    public static /* synthetic */ void k(WebView webView, View view) {
        webView.loadUrl(a);
    }

    public static /* synthetic */ void m(CookieManager cookieManager, WebView webView, Activity activity, View view) {
        if (f(cookieManager.getCookie(a), webView.getUrl())) {
            webView.loadUrl(b);
        } else {
            Toast.makeText(activity, "Please login first before authorization", 1);
        }
    }

    public static void n(WebView webView, WebViewClient webViewClient, Activity activity) {
        webView.setWebViewClient(new c(webViewClient, webView, activity));
    }

    public static void o(Object obj, Activity activity) {
        Window window = ((Dialog) obj).getWindow();
        if (window != null) {
            window.setLayout((int) (activity.getResources().getDisplayMetrics().widthPixels * 0.8d), (int) (activity.getResources().getDisplayMetrics().heightPixels * 0.95d));
        }
    }

    /* loaded from: classes.dex */
    public class c extends WebViewClient {
        public final /* synthetic */ WebViewClient a;
        public final /* synthetic */ WebView b;
        public final /* synthetic */ Activity c;

        public c(WebViewClient webViewClient, WebView webView, Activity activity) {
            this.a = webViewClient;
            this.b = webView;
            this.c = activity;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            CookieManager cookieManager = CookieManager.getInstance();
            String cookie = cookieManager.getCookie(str);
            if (cookie != null && !uq.c && uq.f(cookie, str)) {
                uq.c = true;
                this.b.loadUrl(uq.b);
            }
            cookieManager.flush();
            this.a.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.a.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            webView.loadData("", "text/html", "UTF-8");
            this.c.finish();
            Toast.makeText(this.c, "Please login first before authorization", 1);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String uri = webResourceRequest.getUrl().toString();
            if (uri.startsWith("fbconnect://success")) {
                this.a.shouldOverrideUrlLoading(webView, uri);
                return false;
            }
            return false;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.startsWith("fbconnect://success")) {
                this.a.shouldOverrideUrlLoading(webView, str);
                return false;
            }
            return false;
        }
    }
}
