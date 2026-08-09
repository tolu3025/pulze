package io.flutter.plugin.platform;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.view.K;
import b1.AbstractC0525b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import k1.o;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f7876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k1.o f7877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f7878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o.j f7879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final o.h f7881f;

    class a implements o.h {
        a() {
        }

        @Override // k1.o.h
        public void a(List list) {
            h.this.A(list);
        }

        @Override // k1.o.h
        public void b() {
            h.this.t();
        }

        @Override // k1.o.h
        public void c(o.c cVar) {
            h.this.x(cVar);
        }

        @Override // k1.o.h
        public void d() {
            h.this.y();
        }

        @Override // k1.o.h
        public CharSequence e(o.e eVar) {
            return h.this.r(eVar);
        }

        @Override // k1.o.h
        public void f() {
            h.this.u();
        }

        @Override // k1.o.h
        public void g(boolean z2) {
            h.this.w(z2);
        }

        @Override // k1.o.h
        public void h(String str) {
            h.this.v(str);
        }

        @Override // k1.o.h
        public void i(o.k kVar) {
            h.this.z(kVar);
        }

        @Override // k1.o.h
        public void j(o.g gVar) {
            h.this.F(gVar);
        }

        @Override // k1.o.h
        public void k(int i3) {
            h.this.B(i3);
        }

        @Override // k1.o.h
        public void l(o.j jVar) {
            h.this.C(jVar);
        }

        @Override // k1.o.h
        public void m(String str) {
            h.this.D(str);
        }

        @Override // k1.o.h
        public void n(o.i iVar) {
            h.this.s(iVar);
        }

        @Override // k1.o.h
        public boolean o() {
            return h.this.p();
        }
    }

    class b implements View.OnSystemUiVisibilityChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f7883a;

        b(View view) {
            this.f7883a = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i3) {
            k1.o oVar;
            boolean z2;
            if ((i3 & 4) == 0) {
                oVar = h.this.f7877b;
                z2 = true;
            } else {
                oVar = h.this.f7877b;
                z2 = false;
            }
            oVar.m(z2);
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(final int i3) {
            this.f7883a.post(new Runnable() { // from class: io.flutter.plugin.platform.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7888a.b(i3);
                }
            });
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f7886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f7887c;

        static {
            int[] iArr = new int[o.d.values().length];
            f7887c = iArr;
            try {
                iArr[o.d.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7887c[o.d.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[o.l.values().length];
            f7886b = iArr2;
            try {
                iArr2[o.l.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7886b[o.l.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[o.g.values().length];
            f7885a = iArr3;
            try {
                iArr3[o.g.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7885a[o.g.LIGHT_IMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7885a[o.g.MEDIUM_IMPACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7885a[o.g.HEAVY_IMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7885a[o.g.SELECTION_CLICK.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public interface d {
        boolean b();

        void g(boolean z2);
    }

    public h(Activity activity, k1.o oVar, d dVar) {
        a aVar = new a();
        this.f7881f = aVar;
        this.f7876a = activity;
        this.f7877b = oVar;
        oVar.l(aVar);
        this.f7878c = dVar;
        this.f7880e = 1280;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(List list) {
        int i3 = list.size() == 0 ? 5894 : 1798;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int i5 = c.f7886b[((o.l) list.get(i4)).ordinal()];
            if (i5 == 1) {
                i3 &= -5;
            } else if (i5 == 2) {
                i3 &= -515;
            }
        }
        this.f7880e = i3;
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(int i3) {
        this.f7876a.setRequestedOrientation(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(o.j jVar) {
        Window window = this.f7876a.getWindow();
        K k3 = new K(window, window.getDecorView());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        o.d dVar = jVar.f9563b;
        if (dVar != null) {
            int i4 = c.f7887c[dVar.ordinal()];
            if (i4 == 1) {
                k3.b(true);
            } else if (i4 == 2) {
                k3.b(false);
            }
        }
        Integer num = jVar.f9562a;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = jVar.f9564c;
        if (bool != null && i3 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i3 >= 26) {
            o.d dVar2 = jVar.f9566e;
            if (dVar2 != null) {
                int i5 = c.f7887c[dVar2.ordinal()];
                if (i5 == 1) {
                    k3.a(true);
                } else if (i5 == 2) {
                    k3.a(false);
                }
            }
            Integer num2 = jVar.f9565d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = jVar.f9567f;
        if (num3 != null && i3 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = jVar.f9568g;
        if (bool2 != null && i3 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f7879d = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        this.f7876a.startActivity(Intent.createChooser(intent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.f7876a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CharSequence r(o.e eVar) {
        ClipboardManager clipboardManager = (ClipboardManager) this.f7876a.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (eVar != null && eVar != o.e.PLAIN_TEXT) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt.getText();
                if (text == null) {
                    try {
                        Uri uri = itemAt.getUri();
                        if (uri == null) {
                            AbstractC0525b.g("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                            return null;
                        }
                        String scheme = uri.getScheme();
                        if (!scheme.equals("content")) {
                            AbstractC0525b.g("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                            return null;
                        }
                        AssetFileDescriptor assetFileDescriptorOpenTypedAssetFileDescriptor = this.f7876a.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                        text = itemAt.coerceToText(this.f7876a);
                        if (assetFileDescriptorOpenTypedAssetFileDescriptor != null) {
                            assetFileDescriptorOpenTypedAssetFileDescriptor.close();
                        }
                    } catch (IOException e3) {
                        e = e3;
                        charSequence = text;
                    }
                }
                return text;
            } catch (IOException e4) {
                e = e4;
            }
            AbstractC0525b.h("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
            return charSequence;
        } catch (FileNotFoundException unused) {
            AbstractC0525b.g("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
            return null;
        } catch (SecurityException e5) {
            AbstractC0525b.h("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e5);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(o.i iVar) {
        if (iVar == o.i.CLICK) {
            this.f7876a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void t() {
        d dVar = this.f7878c;
        if (dVar == null || !dVar.b()) {
            Activity activity = this.f7876a;
            if (activity instanceof androidx.activity.r) {
                ((androidx.activity.r) activity).j().k();
            } else {
                activity.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(String str) {
        ((ClipboardManager) this.f7876a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(boolean z2) {
        d dVar = this.f7878c;
        if (dVar != null) {
            dVar.g(z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(o.c cVar) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f7876a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f9537b, (Bitmap) null, cVar.f9536a));
            return;
        }
        g.a();
        this.f7876a.setTaskDescription(f.a(cVar.f9537b, 0, cVar.f9536a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        View decorView = this.f7876a.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new b(decorView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(o.k kVar) {
        int i3;
        if (kVar == o.k.LEAN_BACK) {
            i3 = 1798;
        } else if (kVar == o.k.IMMERSIVE) {
            i3 = 3846;
        } else if (kVar == o.k.IMMERSIVE_STICKY) {
            i3 = 5894;
        } else if (kVar != o.k.EDGE_TO_EDGE || Build.VERSION.SDK_INT < 29) {
            return;
        } else {
            i3 = 1792;
        }
        this.f7880e = i3;
        E();
    }

    public void E() {
        this.f7876a.getWindow().getDecorView().setSystemUiVisibility(this.f7880e);
        o.j jVar = this.f7879d;
        if (jVar != null) {
            C(jVar);
        }
    }

    void F(o.g gVar) {
        int i3;
        View decorView = this.f7876a.getWindow().getDecorView();
        int i4 = c.f7885a[gVar.ordinal()];
        int i5 = 1;
        if (i4 != 1) {
            if (i4 != 2) {
                i5 = 3;
                if (i4 != 3) {
                    i5 = 4;
                    if (i4 == 4) {
                        i3 = 6;
                    } else if (i4 != 5) {
                        return;
                    }
                }
            }
            decorView.performHapticFeedback(i5);
            return;
        }
        i3 = 0;
        decorView.performHapticFeedback(i3);
    }

    public void q() {
        this.f7877b.l(null);
    }
}
