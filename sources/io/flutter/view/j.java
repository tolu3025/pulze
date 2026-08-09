package io.flutter.view;

import android.R;
import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import b1.AbstractC0525b;
import io.flutter.view.j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import k1.C1005a;

/* JADX INFO: loaded from: classes.dex */
public class j extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f8128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1005a f8129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AccessibilityManager f8130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AccessibilityViewEmbedder f8131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.flutter.plugin.platform.o f8132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ContentResolver f8133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f8134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f8135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private l f8136i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f8137j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Integer f8138k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f8139l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private l f8140m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l f8141n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private l f8142o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f8143p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f8144q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Integer f8145r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private k f8146s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f8147t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f8148u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final C1005a.b f8149v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AccessibilityManager.AccessibilityStateChangeListener f8150w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AccessibilityManager.TouchExplorationStateChangeListener f8151x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ContentObserver f8152y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f8127z = ((g.SCROLL_RIGHT.f8191a | g.SCROLL_LEFT.f8191a) | g.SCROLL_UP.f8191a) | g.SCROLL_DOWN.f8191a;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final int f8124A = ((((((((((i.HAS_CHECKED_STATE.f8226a | i.IS_CHECKED.f8226a) | i.IS_SELECTED.f8226a) | i.IS_TEXT_FIELD.f8226a) | i.IS_FOCUSED.f8226a) | i.HAS_ENABLED_STATE.f8226a) | i.IS_ENABLED.f8226a) | i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.f8226a) | i.HAS_TOGGLED_STATE.f8226a) | i.IS_TOGGLED.f8226a) | i.IS_FOCUSABLE.f8226a) | i.IS_SLIDER.f8226a;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static int f8125B = 267386881;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    static int f8126C = (g.DID_GAIN_ACCESSIBILITY_FOCUS.f8191a & g.DID_LOSE_ACCESSIBILITY_FOCUS.f8191a) & g.SHOW_ON_SCREEN.f8191a;

    class a implements C1005a.b {
        a() {
        }

        @Override // k1.C1005a.b
        public void a(String str) {
            j.this.f8128a.announceForAccessibility(str);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void b(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            for (ByteBuffer byteBuffer2 : byteBufferArr) {
                byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
            }
            j.this.c0(byteBuffer, strArr, byteBufferArr);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void c(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            j.this.b0(byteBuffer, strArr);
        }

        @Override // k1.C1005a.b
        public void d(String str) {
            if (Build.VERSION.SDK_INT >= 28) {
                return;
            }
            AccessibilityEvent accessibilityEventH = j.this.H(0, 32);
            accessibilityEventH.getText().add(str);
            j.this.T(accessibilityEventH);
        }

        @Override // k1.C1005a.b
        public void e(int i3) {
            j.this.S(i3, 8);
        }

        @Override // k1.C1005a.b
        public void f(int i3) {
            j.this.S(i3, 2);
        }

        @Override // k1.C1005a.b
        public void g(int i3) {
            j.this.S(i3, 1);
        }
    }

    class b implements AccessibilityManager.AccessibilityStateChangeListener {
        b() {
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z2) {
            if (j.this.f8148u) {
                return;
            }
            j jVar = j.this;
            if (z2) {
                jVar.f8129b.g(j.this.f8149v);
                j.this.f8129b.e();
            } else {
                jVar.X(false);
                j.this.f8129b.g(null);
                j.this.f8129b.d();
            }
            if (j.this.f8146s != null) {
                j.this.f8146s.a(z2, j.this.f8130c.isTouchExplorationEnabled());
            }
        }
    }

    class c extends ContentObserver {
        c(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            onChange(z2, null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2, Uri uri) {
            if (j.this.f8148u) {
                return;
            }
            String string = Settings.Global.getString(j.this.f8133f, "transition_animation_scale");
            if (string == null || !string.equals("0")) {
                j.e(j.this, ~f.DISABLE_ANIMATIONS.f8167a);
            } else {
                j.f(j.this, f.DISABLE_ANIMATIONS.f8167a);
            }
            j.this.U();
        }
    }

    class d implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AccessibilityManager f8156a;

        d(AccessibilityManager accessibilityManager) {
            this.f8156a = accessibilityManager;
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z2) {
            if (j.this.f8148u) {
                return;
            }
            if (!z2) {
                j.this.X(false);
                j.this.M();
            }
            if (j.this.f8146s != null) {
                j.this.f8146s.a(this.f8156a.isEnabled(), z2);
            }
        }
    }

    static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8158a;

        static {
            int[] iArr = new int[o.values().length];
            f8158a = iArr;
            try {
                iArr[o.SPELLOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8158a[o.LOCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private enum f {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f8167a;

        f(int i3) {
            this.f8167a = i3;
        }
    }

    public enum g {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8191a;

        g(int i3) {
            this.f8191a = i3;
        }
    }

    private static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8192a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8193b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f8194c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f8195d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f8196e;

        h() {
        }
    }

    enum i {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216),
        IS_CHECK_STATE_MIXED(33554432),
        HAS_EXPANDED_STATE(67108864),
        IS_EXPANDED(134217728);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f8226a;

        i(int i3) {
            this.f8226a = i3;
        }
    }

    /* JADX INFO: renamed from: io.flutter.view.j$j, reason: collision with other inner class name */
    private static class C0133j extends n {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f8227d;

        private C0133j() {
            super(null);
        }

        /* synthetic */ C0133j(a aVar) {
            this();
        }
    }

    public interface k {
        void a(boolean z2, boolean z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class l {

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private p f8229B;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f8231D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private int f8232E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private int f8233F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private int f8234G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private float f8235H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private float f8236I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private float f8237J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private String f8238K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private String f8239L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private float f8240M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private float f8241N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private float f8242O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        private float f8243P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        private float[] f8244Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        private l f8245R;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        private List f8248U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        private h f8249V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        private h f8250W;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        private float[] f8252Y;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final j f8254a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        private float[] f8255a0;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        private Rect f8257b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f8258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f8259d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f8260e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f8261f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f8262g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f8263h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f8264i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f8265j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f8266k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f8267l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f8268m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private float f8269n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f8270o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private String f8271p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private List f8272q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private String f8273r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private List f8274s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f8275t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private List f8276u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private String f8277v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private List f8278w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private String f8279x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private List f8280y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private String f8281z;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8256b = -1;

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        private int f8228A = -1;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private boolean f8230C = false;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private List f8246S = new ArrayList();

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private List f8247T = new ArrayList();

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        private boolean f8251X = true;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private boolean f8253Z = true;

        l(j jVar) {
            this.f8254a = jVar;
        }

        private float A0(float f3, float f4, float f5, float f6) {
            return Math.max(f3, Math.max(f4, Math.max(f5, f6)));
        }

        private float B0(float f3, float f4, float f5, float f6) {
            return Math.min(f3, Math.min(f4, Math.min(f5, f6)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean C0(l lVar, x1.e eVar) {
            return (lVar == null || lVar.l0(eVar) == null) ? false : true;
        }

        private void D0(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f3 = fArr[3];
            fArr[0] = fArr[0] / f3;
            fArr[1] = fArr[1] / f3;
            fArr[2] = fArr[2] / f3;
            fArr[3] = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E0(float[] fArr, Set set, boolean z2) {
            set.add(this);
            if (this.f8253Z) {
                z2 = true;
            }
            if (z2) {
                if (this.f8255a0 == null) {
                    this.f8255a0 = new float[16];
                }
                if (this.f8244Q == null) {
                    this.f8244Q = new float[16];
                }
                Matrix.multiplyMM(this.f8255a0, 0, fArr, 0, this.f8244Q, 0);
                float[] fArr2 = new float[4];
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = {this.f8240M, this.f8241N, 0.0f, 1.0f};
                D0(fArr2, this.f8255a0, fArr6);
                fArr6[0] = this.f8242O;
                fArr6[1] = this.f8241N;
                D0(fArr3, this.f8255a0, fArr6);
                fArr6[0] = this.f8242O;
                fArr6[1] = this.f8243P;
                D0(fArr4, this.f8255a0, fArr6);
                fArr6[0] = this.f8240M;
                fArr6[1] = this.f8243P;
                D0(fArr5, this.f8255a0, fArr6);
                if (this.f8257b0 == null) {
                    this.f8257b0 = new Rect();
                }
                this.f8257b0.set(Math.round(B0(fArr2[0], fArr3[0], fArr4[0], fArr5[0])), Math.round(B0(fArr2[1], fArr3[1], fArr4[1], fArr5[1])), Math.round(A0(fArr2[0], fArr3[0], fArr4[0], fArr5[0])), Math.round(A0(fArr2[1], fArr3[1], fArr4[1], fArr5[1])));
                this.f8253Z = false;
            }
            int i3 = -1;
            for (l lVar : this.f8246S) {
                lVar.f8228A = i3;
                i3 = lVar.f8256b;
                lVar.E0(this.f8255a0, set, z2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            this.f8230C = true;
            this.f8238K = this.f8273r;
            this.f8239L = this.f8271p;
            this.f8231D = this.f8258c;
            this.f8232E = this.f8259d;
            this.f8233F = this.f8262g;
            this.f8234G = this.f8263h;
            this.f8235H = this.f8267l;
            this.f8236I = this.f8268m;
            this.f8237J = this.f8269n;
            this.f8258c = byteBuffer.getInt();
            this.f8259d = byteBuffer.getInt();
            this.f8260e = byteBuffer.getInt();
            this.f8261f = byteBuffer.getInt();
            this.f8262g = byteBuffer.getInt();
            this.f8263h = byteBuffer.getInt();
            this.f8264i = byteBuffer.getInt();
            this.f8265j = byteBuffer.getInt();
            this.f8266k = byteBuffer.getInt();
            this.f8267l = byteBuffer.getFloat();
            this.f8268m = byteBuffer.getFloat();
            this.f8269n = byteBuffer.getFloat();
            int i3 = byteBuffer.getInt();
            this.f8270o = i3 == -1 ? null : strArr[i3];
            int i4 = byteBuffer.getInt();
            this.f8271p = i4 == -1 ? null : strArr[i4];
            this.f8272q = q0(byteBuffer, byteBufferArr);
            int i5 = byteBuffer.getInt();
            this.f8273r = i5 == -1 ? null : strArr[i5];
            this.f8274s = q0(byteBuffer, byteBufferArr);
            int i6 = byteBuffer.getInt();
            this.f8275t = i6 == -1 ? null : strArr[i6];
            this.f8276u = q0(byteBuffer, byteBufferArr);
            int i7 = byteBuffer.getInt();
            this.f8277v = i7 == -1 ? null : strArr[i7];
            this.f8278w = q0(byteBuffer, byteBufferArr);
            int i8 = byteBuffer.getInt();
            this.f8279x = i8 == -1 ? null : strArr[i8];
            this.f8280y = q0(byteBuffer, byteBufferArr);
            int i9 = byteBuffer.getInt();
            this.f8281z = i9 == -1 ? null : strArr[i9];
            this.f8229B = p.e(byteBuffer.getInt());
            this.f8240M = byteBuffer.getFloat();
            this.f8241N = byteBuffer.getFloat();
            this.f8242O = byteBuffer.getFloat();
            this.f8243P = byteBuffer.getFloat();
            if (this.f8244Q == null) {
                this.f8244Q = new float[16];
            }
            for (int i10 = 0; i10 < 16; i10++) {
                this.f8244Q[i10] = byteBuffer.getFloat();
            }
            this.f8251X = true;
            this.f8253Z = true;
            int i11 = byteBuffer.getInt();
            this.f8246S.clear();
            this.f8247T.clear();
            for (int i12 = 0; i12 < i11; i12++) {
                l lVarY = this.f8254a.y(byteBuffer.getInt());
                lVarY.f8245R = this;
                this.f8246S.add(lVarY);
            }
            for (int i13 = 0; i13 < i11; i13++) {
                l lVarY2 = this.f8254a.y(byteBuffer.getInt());
                lVarY2.f8245R = this;
                this.f8247T.add(lVarY2);
            }
            int i14 = byteBuffer.getInt();
            if (i14 == 0) {
                this.f8248U = null;
                return;
            }
            List list = this.f8248U;
            if (list == null) {
                this.f8248U = new ArrayList(i14);
            } else {
                list.clear();
            }
            for (int i15 = 0; i15 < i14; i15++) {
                h hVarX = this.f8254a.x(byteBuffer.getInt());
                if (hVarX.f8194c == g.TAP.f8191a) {
                    this.f8249V = hVarX;
                } else if (hVarX.f8194c == g.LONG_PRESS.f8191a) {
                    this.f8250W = hVarX;
                } else {
                    this.f8248U.add(hVarX);
                }
                this.f8248U.add(hVarX);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g0(List list) {
            if (x0(i.SCOPES_ROUTE)) {
                list.add(this);
            }
            Iterator it = this.f8246S.iterator();
            while (it.hasNext()) {
                ((l) it.next()).g0(list);
            }
        }

        private SpannableString h0(String str, List list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    n nVar = (n) it.next();
                    int i3 = e.f8158a[nVar.f8284c.ordinal()];
                    if (i3 == 1) {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), nVar.f8282a, nVar.f8283b, 0);
                    } else if (i3 == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((C0133j) nVar).f8227d)), nVar.f8282a, nVar.f8283b, 0);
                    }
                }
            }
            return spannableString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean i0() {
            String str;
            String str2 = this.f8271p;
            if (str2 == null && this.f8239L == null) {
                return false;
            }
            return str2 == null || (str = this.f8239L) == null || !str2.equals(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean j0() {
            return (Float.isNaN(this.f8267l) || Float.isNaN(this.f8235H) || this.f8235H == this.f8267l) ? false : true;
        }

        private void k0() {
            if (this.f8251X) {
                this.f8251X = false;
                if (this.f8252Y == null) {
                    this.f8252Y = new float[16];
                }
                if (Matrix.invertM(this.f8252Y, 0, this.f8244Q, 0)) {
                    return;
                }
                Arrays.fill(this.f8252Y, 0.0f);
            }
        }

        private l l0(x1.e eVar) {
            for (l lVar = this.f8245R; lVar != null; lVar = lVar.f8245R) {
                if (eVar.test(lVar)) {
                    return lVar;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Rect m0() {
            return this.f8257b0;
        }

        static /* synthetic */ int n(l lVar, int i3) {
            int i4 = lVar.f8263h + i3;
            lVar.f8263h = i4;
            return i4;
        }

        private CharSequence n0() {
            return h0(this.f8279x, this.f8280y);
        }

        static /* synthetic */ int o(l lVar, int i3) {
            int i4 = lVar.f8263h - i3;
            lVar.f8263h = i4;
            return i4;
        }

        private CharSequence o0() {
            return h0(this.f8271p, this.f8272q);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String p0() {
            String str;
            if (x0(i.NAMES_ROUTE) && (str = this.f8271p) != null && !str.isEmpty()) {
                return this.f8271p;
            }
            Iterator it = this.f8246S.iterator();
            while (it.hasNext()) {
                String strP0 = ((l) it.next()).p0();
                if (strP0 != null && !strP0.isEmpty()) {
                    return strP0;
                }
            }
            return null;
        }

        private List q0(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i3 = byteBuffer.getInt();
            a aVar = null;
            if (i3 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = byteBuffer.getInt();
                int i6 = byteBuffer.getInt();
                o oVar = o.values()[byteBuffer.getInt()];
                int i7 = e.f8158a[oVar.ordinal()];
                if (i7 == 1) {
                    byteBuffer.getInt();
                    m mVar = new m(aVar);
                    mVar.f8282a = i5;
                    mVar.f8283b = i6;
                    mVar.f8284c = oVar;
                    arrayList.add(mVar);
                } else if (i7 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    C0133j c0133j = new C0133j(aVar);
                    c0133j.f8282a = i5;
                    c0133j.f8283b = i6;
                    c0133j.f8284c = oVar;
                    c0133j.f8227d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(c0133j);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence r0() {
            CharSequence[] charSequenceArr = {o0(), n0()};
            CharSequence charSequenceConcat = null;
            for (int i3 = 0; i3 < 2; i3++) {
                CharSequence charSequence = charSequenceArr[i3];
                if (charSequence != null && charSequence.length() > 0) {
                    charSequenceConcat = (charSequenceConcat == null || charSequenceConcat.length() == 0) ? charSequence : TextUtils.concat(charSequenceConcat, ", ", charSequence);
                }
            }
            return charSequenceConcat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence s0() {
            return h0(this.f8273r, this.f8274s);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence t0() {
            CharSequence[] charSequenceArr = {s0(), o0(), n0()};
            CharSequence charSequenceConcat = null;
            for (int i3 = 0; i3 < 3; i3++) {
                CharSequence charSequence = charSequenceArr[i3];
                if (charSequence != null && charSequence.length() > 0) {
                    charSequenceConcat = (charSequenceConcat == null || charSequenceConcat.length() == 0) ? charSequence : TextUtils.concat(charSequenceConcat, ", ", charSequence);
                }
            }
            return charSequenceConcat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean u0(g gVar) {
            return (gVar.f8191a & this.f8232E) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean v0(i iVar) {
            return (iVar.f8226a & this.f8231D) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean w0(g gVar) {
            return (gVar.f8191a & this.f8259d) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean x0(i iVar) {
            return (iVar.f8226a & this.f8258c) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public l y0(float[] fArr, boolean z2) {
            float f3 = fArr[3];
            boolean z3 = false;
            float f4 = fArr[0] / f3;
            float f5 = fArr[1] / f3;
            if (f4 < this.f8240M || f4 >= this.f8242O || f5 < this.f8241N || f5 >= this.f8243P) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (l lVar : this.f8247T) {
                if (!lVar.x0(i.IS_HIDDEN)) {
                    lVar.k0();
                    Matrix.multiplyMV(fArr2, 0, lVar.f8252Y, 0, fArr, 0);
                    l lVarY0 = lVar.y0(fArr2, z2);
                    if (lVarY0 != null) {
                        return lVarY0;
                    }
                }
            }
            if (z2 && this.f8264i != -1) {
                z3 = true;
            }
            if (z0() || z3) {
                return this;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean z0() {
            String str;
            String str2;
            String str3;
            if (x0(i.SCOPES_ROUTE)) {
                return false;
            }
            if (x0(i.IS_FOCUSABLE)) {
                return true;
            }
            return ((this.f8259d & (~j.f8127z)) == 0 && (this.f8258c & j.f8124A) == 0 && ((str = this.f8271p) == null || str.isEmpty()) && (((str2 = this.f8273r) == null || str2.isEmpty()) && ((str3 = this.f8279x) == null || str3.isEmpty()))) ? false : true;
        }
    }

    private static class m extends n {
        private m() {
            super(null);
        }

        /* synthetic */ m(a aVar) {
            this();
        }
    }

    private static class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f8282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f8283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        o f8284c;

        private n() {
        }

        /* synthetic */ n(a aVar) {
            this();
        }
    }

    private enum o {
        SPELLOUT,
        LOCALE
    }

    private enum p {
        UNKNOWN,
        LTR,
        RTL;

        public static p e(int i3) {
            return i3 != 1 ? i3 != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    public j(View view, C1005a c1005a, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.o oVar) {
        this(view, c1005a, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), oVar);
    }

    private void A(float f3, float f4, boolean z2) {
        l lVarY0;
        if (this.f8134g.isEmpty() || (lVarY0 = z().y0(new float[]{f3, f4, 0.0f, 1.0f}, z2)) == this.f8142o) {
            return;
        }
        if (lVarY0 != null) {
            S(lVarY0.f8256b, 128);
        }
        l lVar = this.f8142o;
        if (lVar != null) {
            S(lVar.f8256b, 256);
        }
        this.f8142o = lVarY0;
    }

    private boolean C(l lVar) {
        if (lVar.x0(i.SCOPES_ROUTE)) {
            return false;
        }
        return (lVar.t0() == null && (lVar.f8259d & (~f8126C)) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean E(l lVar, l lVar2) {
        return lVar2 == lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean F(l lVar) {
        return lVar.x0(i.HAS_IMPLICIT_SCROLLING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccessibilityEvent H(int i3, int i4) {
        AccessibilityEvent accessibilityEventG = G(i4);
        accessibilityEventG.setPackageName(this.f8128a.getContext().getPackageName());
        accessibilityEventG.setSource(this.f8128a, i3);
        return accessibilityEventG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        l lVar = this.f8142o;
        if (lVar != null) {
            S(lVar.f8256b, 256);
            this.f8142o = null;
        }
    }

    private void N(l lVar) {
        String strP0 = lVar.p0();
        if (strP0 == null) {
            strP0 = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            W(strP0);
            return;
        }
        AccessibilityEvent accessibilityEventH = H(lVar.f8256b, 32);
        accessibilityEventH.getText().add(strP0);
        T(accessibilityEventH);
    }

    private boolean O(l lVar, int i3, Bundle bundle, boolean z2) {
        int i4 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z3 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i5 = lVar.f8262g;
        int i6 = lVar.f8263h;
        Q(lVar, i4, z2, z3);
        if (i5 != lVar.f8262g || i6 != lVar.f8263h) {
            String str = lVar.f8273r != null ? lVar.f8273r : "";
            AccessibilityEvent accessibilityEventH = H(lVar.f8256b, 8192);
            accessibilityEventH.getText().add(str);
            accessibilityEventH.setFromIndex(lVar.f8262g);
            accessibilityEventH.setToIndex(lVar.f8263h);
            accessibilityEventH.setItemCount(str.length());
            T(accessibilityEventH);
        }
        if (i4 == 1) {
            if (z2) {
                g gVar = g.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (lVar.w0(gVar)) {
                    this.f8129b.c(i3, gVar, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (z2) {
                return false;
            }
            g gVar2 = g.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!lVar.w0(gVar2)) {
                return false;
            }
            this.f8129b.c(i3, gVar2, Boolean.valueOf(z3));
            return true;
        }
        if (i4 != 2) {
            return i4 == 4 || i4 == 8 || i4 == 16;
        }
        if (z2) {
            g gVar3 = g.MOVE_CURSOR_FORWARD_BY_WORD;
            if (lVar.w0(gVar3)) {
                this.f8129b.c(i3, gVar3, Boolean.valueOf(z3));
                return true;
            }
        }
        if (z2) {
            return false;
        }
        g gVar4 = g.MOVE_CURSOR_BACKWARD_BY_WORD;
        if (!lVar.w0(gVar4)) {
            return false;
        }
        this.f8129b.c(i3, gVar4, Boolean.valueOf(z3));
        return true;
    }

    private boolean P(l lVar, int i3, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.f8129b.c(i3, g.SET_TEXT, string);
        lVar.f8273r = string;
        lVar.f8274s = null;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0022, code lost:
    
        if (r6 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0024, code lost:
    
        r5 = r4.f8273r.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        r4.f8263h = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        r4.f8263h = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r5.find() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        io.flutter.view.j.l.n(r4, r5.start(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        if (r5.find() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        r5 = r5.start(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        if (r5.find() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e6, code lost:
    
        if (r5.find() != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void Q(io.flutter.view.j.l r4, int r5, boolean r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.j.Q(io.flutter.view.j$l, int, boolean, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(AccessibilityEvent accessibilityEvent) {
        if (this.f8130c.isEnabled()) {
            this.f8128a.getParent().requestSendAccessibilityEvent(this.f8128a, accessibilityEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        this.f8129b.f(this.f8139l);
    }

    private void V(int i3) {
        AccessibilityEvent accessibilityEventH = H(i3, 2048);
        accessibilityEventH.setContentChangeTypes(1);
        T(accessibilityEventH);
    }

    private void W(String str) {
        this.f8128a.setAccessibilityPaneTitle(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(boolean z2) {
        if (this.f8147t == z2) {
            return;
        }
        this.f8147t = z2;
        this.f8139l = z2 ? this.f8139l | f.ACCESSIBLE_NAVIGATION.f8167a : this.f8139l & (~f.ACCESSIBLE_NAVIGATION.f8167a);
        U();
    }

    private void Y() {
        View view = this.f8128a;
        if (view == null || view.getResources() == null) {
            return;
        }
        int i3 = this.f8128a.getResources().getConfiguration().fontWeightAdjustment;
        this.f8139l = (i3 == Integer.MAX_VALUE || i3 < 300) ? this.f8139l & f.BOLD_TEXT.f8167a : this.f8139l | f.BOLD_TEXT.f8167a;
        U();
    }

    private boolean a0(final l lVar) {
        return lVar.f8265j > 0 && (l.C0(this.f8136i, new x1.e() { // from class: io.flutter.view.h
            @Override // x1.e
            public final boolean test(Object obj) {
                return j.E(lVar, (j.l) obj);
            }
        }) || !l.C0(this.f8136i, new x1.e() { // from class: io.flutter.view.i
            @Override // x1.e
            public final boolean test(Object obj) {
                return j.F((j.l) obj);
            }
        }));
    }

    private void d0(l lVar) {
        View viewC;
        Integer num;
        lVar.f8245R = null;
        if (lVar.f8264i != -1 && (num = this.f8137j) != null && this.f8131d.platformViewOfNode(num.intValue()) == this.f8132e.c(lVar.f8264i)) {
            S(this.f8137j.intValue(), 65536);
            this.f8137j = null;
        }
        if (lVar.f8264i != -1 && (viewC = this.f8132e.c(lVar.f8264i)) != null) {
            viewC.setImportantForAccessibility(4);
        }
        l lVar2 = this.f8136i;
        if (lVar2 == lVar) {
            S(lVar2.f8256b, 65536);
            this.f8136i = null;
        }
        if (this.f8140m == lVar) {
            this.f8140m = null;
        }
        if (this.f8142o == lVar) {
            this.f8142o = null;
        }
    }

    static /* synthetic */ int e(j jVar, int i3) {
        int i4 = i3 & jVar.f8139l;
        jVar.f8139l = i4;
        return i4;
    }

    static /* synthetic */ int f(j jVar, int i3) {
        int i4 = i3 | jVar.f8139l;
        jVar.f8139l = i4;
        return i4;
    }

    private AccessibilityEvent u(int i3, String str, String str2) {
        AccessibilityEvent accessibilityEventH = H(i3, 16);
        accessibilityEventH.setBeforeText(str);
        accessibilityEventH.getText().add(str2);
        int i4 = 0;
        while (i4 < str.length() && i4 < str2.length() && str.charAt(i4) == str2.charAt(i4)) {
            i4++;
        }
        if (i4 >= str.length() && i4 >= str2.length()) {
            return null;
        }
        accessibilityEventH.setFromIndex(i4);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i4 && length2 >= i4 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        accessibilityEventH.setRemovedCount((length - i4) + 1);
        accessibilityEventH.setAddedCount((length2 - i4) + 1);
        return accessibilityEventH;
    }

    private boolean v() {
        Activity activityB = x1.g.b(this.f8128a.getContext());
        if (activityB == null || activityB.getWindow() == null) {
            return false;
        }
        int i3 = activityB.getWindow().getAttributes().layoutInDisplayCutoutMode;
        return i3 == 2 || i3 == 0;
    }

    private Rect w(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.f8128a.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h x(int i3) {
        h hVar = (h) this.f8135h.get(Integer.valueOf(i3));
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        hVar2.f8193b = i3;
        hVar2.f8192a = f8125B + i3;
        this.f8135h.put(Integer.valueOf(i3), hVar2);
        return hVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l y(int i3) {
        l lVar = (l) this.f8134g.get(Integer.valueOf(i3));
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        lVar2.f8256b = i3;
        this.f8134g.put(Integer.valueOf(i3), lVar2);
        return lVar2;
    }

    private l z() {
        return (l) this.f8134g.get(0);
    }

    public boolean B() {
        return this.f8130c.isEnabled();
    }

    public boolean D() {
        return this.f8130c.isTouchExplorationEnabled();
    }

    public AccessibilityEvent G(int i3) {
        return AccessibilityEvent.obtain(i3);
    }

    public AccessibilityNodeInfo I(View view) {
        return AccessibilityNodeInfo.obtain(view);
    }

    public AccessibilityNodeInfo J(View view, int i3) {
        return AccessibilityNodeInfo.obtain(view, i3);
    }

    public boolean K(MotionEvent motionEvent) {
        return L(motionEvent, false);
    }

    public boolean L(MotionEvent motionEvent, boolean z2) {
        if (!this.f8130c.isTouchExplorationEnabled() || this.f8134g.isEmpty()) {
            return false;
        }
        l lVarY0 = z().y0(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z2);
        if (lVarY0 != null && lVarY0.f8264i != -1) {
            if (z2) {
                return false;
            }
            return this.f8131d.onAccessibilityHoverEvent(lVarY0.f8256b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            A(motionEvent.getX(), motionEvent.getY(), z2);
        } else {
            if (motionEvent.getAction() != 10) {
                AbstractC0525b.a("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            }
            M();
        }
        return true;
    }

    public void R() {
        this.f8148u = true;
        this.f8132e.d();
        Z(null);
        this.f8130c.removeAccessibilityStateChangeListener(this.f8150w);
        this.f8130c.removeTouchExplorationStateChangeListener(this.f8151x);
        this.f8133f.unregisterContentObserver(this.f8152y);
        this.f8129b.g(null);
    }

    public void S(int i3, int i4) {
        if (this.f8130c.isEnabled()) {
            T(H(i3, i4));
        }
    }

    public void Z(k kVar) {
        this.f8146s = kVar;
    }

    void b0(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            h hVarX = x(byteBuffer.getInt());
            hVarX.f8194c = byteBuffer.getInt();
            int i3 = byteBuffer.getInt();
            String str = null;
            hVarX.f8195d = i3 == -1 ? null : strArr[i3];
            int i4 = byteBuffer.getInt();
            if (i4 != -1) {
                str = strArr[i4];
            }
            hVarX.f8196e = str;
        }
    }

    void c0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        l lVar;
        l lVar2;
        float f3;
        float f4;
        WindowInsets rootWindowInsets;
        View viewC;
        ArrayList<l> arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            l lVarY = y(byteBuffer.getInt());
            lVarY.F0(byteBuffer, strArr, byteBufferArr);
            if (!lVarY.x0(i.IS_HIDDEN)) {
                if (lVarY.x0(i.IS_FOCUSED)) {
                    this.f8140m = lVarY;
                }
                if (lVarY.f8230C) {
                    arrayList.add(lVarY);
                }
                if (lVarY.f8264i != -1 && !this.f8132e.b(lVarY.f8264i) && (viewC = this.f8132e.c(lVarY.f8264i)) != null) {
                    viewC.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        l lVarZ = z();
        ArrayList<l> arrayList2 = new ArrayList();
        if (lVarZ != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            if ((Build.VERSION.SDK_INT < 28 || v()) && (rootWindowInsets = this.f8128a.getRootWindowInsets()) != null) {
                if (!this.f8145r.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                    lVarZ.f8253Z = true;
                    lVarZ.f8251X = true;
                }
                this.f8145r = Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft());
                Matrix.translateM(fArr, 0, r4.intValue(), 0.0f, 0.0f);
            }
            lVarZ.E0(fArr, hashSet, false);
            lVarZ.g0(arrayList2);
        }
        l lVar3 = null;
        for (l lVar4 : arrayList2) {
            if (!this.f8143p.contains(Integer.valueOf(lVar4.f8256b))) {
                lVar3 = lVar4;
            }
        }
        if (lVar3 == null && arrayList2.size() > 0) {
            lVar3 = (l) arrayList2.get(arrayList2.size() - 1);
        }
        if (lVar3 != null && (lVar3.f8256b != this.f8144q || arrayList2.size() != this.f8143p.size())) {
            this.f8144q = lVar3.f8256b;
            N(lVar3);
        }
        this.f8143p.clear();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f8143p.add(Integer.valueOf(((l) it.next()).f8256b));
        }
        Iterator it2 = this.f8134g.entrySet().iterator();
        while (it2.hasNext()) {
            l lVar5 = (l) ((Map.Entry) it2.next()).getValue();
            if (!hashSet.contains(lVar5)) {
                d0(lVar5);
                it2.remove();
            }
        }
        V(0);
        for (l lVar6 : arrayList) {
            if (lVar6.j0()) {
                AccessibilityEvent accessibilityEventH = H(lVar6.f8256b, 4096);
                float f5 = lVar6.f8267l;
                float f6 = lVar6.f8268m;
                if (Float.isInfinite(lVar6.f8268m)) {
                    if (f5 > 70000.0f) {
                        f5 = 70000.0f;
                    }
                    f6 = 100000.0f;
                }
                if (Float.isInfinite(lVar6.f8269n)) {
                    f3 = f6 + 100000.0f;
                    if (f5 < -70000.0f) {
                        f5 = -70000.0f;
                    }
                    f4 = f5 + 100000.0f;
                } else {
                    f3 = f6 - lVar6.f8269n;
                    f4 = f5 - lVar6.f8269n;
                }
                if (lVar6.u0(g.SCROLL_UP) || lVar6.u0(g.SCROLL_DOWN)) {
                    accessibilityEventH.setScrollY((int) f4);
                    accessibilityEventH.setMaxScrollY((int) f3);
                } else if (lVar6.u0(g.SCROLL_LEFT) || lVar6.u0(g.SCROLL_RIGHT)) {
                    accessibilityEventH.setScrollX((int) f4);
                    accessibilityEventH.setMaxScrollX((int) f3);
                }
                if (lVar6.f8265j > 0) {
                    accessibilityEventH.setItemCount(lVar6.f8265j);
                    accessibilityEventH.setFromIndex(lVar6.f8266k);
                    Iterator it3 = lVar6.f8247T.iterator();
                    int i3 = 0;
                    while (it3.hasNext()) {
                        if (!((l) it3.next()).x0(i.IS_HIDDEN)) {
                            i3++;
                        }
                    }
                    accessibilityEventH.setToIndex((lVar6.f8266k + i3) - 1);
                }
                T(accessibilityEventH);
            }
            if (lVar6.x0(i.IS_LIVE_REGION) && lVar6.i0()) {
                V(lVar6.f8256b);
            }
            l lVar7 = this.f8136i;
            if (lVar7 != null && lVar7.f8256b == lVar6.f8256b) {
                i iVar = i.IS_SELECTED;
                if (!lVar6.v0(iVar) && lVar6.x0(iVar)) {
                    AccessibilityEvent accessibilityEventH2 = H(lVar6.f8256b, 4);
                    accessibilityEventH2.getText().add(lVar6.f8271p);
                    T(accessibilityEventH2);
                }
            }
            l lVar8 = this.f8140m;
            if (lVar8 != null && lVar8.f8256b == lVar6.f8256b && ((lVar2 = this.f8141n) == null || lVar2.f8256b != this.f8140m.f8256b)) {
                this.f8141n = this.f8140m;
                T(H(lVar6.f8256b, 8));
            } else if (this.f8140m == null) {
                this.f8141n = null;
            }
            l lVar9 = this.f8140m;
            if (lVar9 != null && lVar9.f8256b == lVar6.f8256b) {
                i iVar2 = i.IS_TEXT_FIELD;
                if (lVar6.v0(iVar2) && lVar6.x0(iVar2) && ((lVar = this.f8136i) == null || lVar.f8256b == this.f8140m.f8256b)) {
                    String str = lVar6.f8238K != null ? lVar6.f8238K : "";
                    String str2 = lVar6.f8273r != null ? lVar6.f8273r : "";
                    AccessibilityEvent accessibilityEventU = u(lVar6.f8256b, str, str2);
                    if (accessibilityEventU != null) {
                        T(accessibilityEventU);
                    }
                    if (lVar6.f8233F != lVar6.f8262g || lVar6.f8234G != lVar6.f8263h) {
                        AccessibilityEvent accessibilityEventH3 = H(lVar6.f8256b, 8192);
                        accessibilityEventH3.getText().add(str2);
                        accessibilityEventH3.setFromIndex(lVar6.f8262g);
                        accessibilityEventH3.setToIndex(lVar6.f8263h);
                        accessibilityEventH3.setItemCount(str2.length());
                        T(accessibilityEventH3);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:224:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0473  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r14) {
        /*
            Method dump skipped, instruction units count: 1197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.j.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i3) {
        l lVar;
        Integer num;
        int iIntValue;
        if (i3 == 1) {
            lVar = this.f8140m;
            if (lVar == null) {
                num = this.f8138k;
                if (num == null) {
                }
                iIntValue = num.intValue();
                return createAccessibilityNodeInfo(iIntValue);
            }
            iIntValue = lVar.f8256b;
            return createAccessibilityNodeInfo(iIntValue);
        }
        if (i3 != 2) {
            return null;
        }
        lVar = this.f8136i;
        if (lVar == null) {
            num = this.f8137j;
            if (num == null) {
                return null;
            }
            iIntValue = num.intValue();
            return createAccessibilityNodeInfo(iIntValue);
        }
        iIntValue = lVar.f8256b;
        return createAccessibilityNodeInfo(iIntValue);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i3, int i4, Bundle bundle) {
        int i5;
        if (i3 >= 65536) {
            boolean zPerformAction = this.f8131d.performAction(i3, i4, bundle);
            if (zPerformAction && i4 == 128) {
                this.f8137j = null;
            }
            return zPerformAction;
        }
        l lVar = (l) this.f8134g.get(Integer.valueOf(i3));
        if (lVar == null) {
            return false;
        }
        switch (i4) {
            case 16:
                this.f8129b.b(i3, g.TAP);
                return true;
            case 32:
                this.f8129b.b(i3, g.LONG_PRESS);
                return true;
            case 64:
                if (this.f8136i == null) {
                    this.f8128a.invalidate();
                }
                this.f8136i = lVar;
                this.f8129b.b(i3, g.DID_GAIN_ACCESSIBILITY_FOCUS);
                HashMap map = new HashMap();
                map.put("type", "didGainFocus");
                map.put("nodeId", Integer.valueOf(lVar.f8256b));
                this.f8129b.f9486a.c(map);
                S(i3, 32768);
                if (lVar.w0(g.INCREASE) || lVar.w0(g.DECREASE)) {
                    S(i3, 4);
                }
                return true;
            case 128:
                l lVar2 = this.f8136i;
                if (lVar2 != null && lVar2.f8256b == i3) {
                    this.f8136i = null;
                }
                Integer num = this.f8137j;
                if (num != null && num.intValue() == i3) {
                    this.f8137j = null;
                }
                this.f8129b.b(i3, g.DID_LOSE_ACCESSIBILITY_FOCUS);
                S(i3, 65536);
                return true;
            case 256:
                return O(lVar, i3, bundle, true);
            case 512:
                return O(lVar, i3, bundle, false);
            case 4096:
                g gVar = g.SCROLL_UP;
                if (!lVar.w0(gVar)) {
                    gVar = g.SCROLL_LEFT;
                    if (!lVar.w0(gVar)) {
                        gVar = g.INCREASE;
                        if (!lVar.w0(gVar)) {
                            return false;
                        }
                        lVar.f8273r = lVar.f8275t;
                        lVar.f8274s = lVar.f8276u;
                        S(i3, 4);
                    }
                }
                this.f8129b.b(i3, gVar);
                return true;
            case 8192:
                g gVar2 = g.SCROLL_DOWN;
                if (!lVar.w0(gVar2)) {
                    gVar2 = g.SCROLL_RIGHT;
                    if (!lVar.w0(gVar2)) {
                        gVar2 = g.DECREASE;
                        if (!lVar.w0(gVar2)) {
                            return false;
                        }
                        lVar.f8273r = lVar.f8277v;
                        lVar.f8274s = lVar.f8278w;
                        S(i3, 4);
                    }
                }
                this.f8129b.b(i3, gVar2);
                return true;
            case 16384:
                this.f8129b.b(i3, g.COPY);
                return true;
            case 32768:
                this.f8129b.b(i3, g.PASTE);
                return true;
            case 65536:
                this.f8129b.b(i3, g.CUT);
                return true;
            case 131072:
                HashMap map2 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    map2.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    i5 = bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
                } else {
                    map2.put("base", Integer.valueOf(lVar.f8263h));
                    i5 = lVar.f8263h;
                }
                map2.put("extent", Integer.valueOf(i5));
                this.f8129b.c(i3, g.SET_SELECTION, map2);
                l lVar3 = (l) this.f8134g.get(Integer.valueOf(i3));
                lVar3.f8262g = ((Integer) map2.get("base")).intValue();
                lVar3.f8263h = ((Integer) map2.get("extent")).intValue();
                return true;
            case 1048576:
                this.f8129b.b(i3, g.DISMISS);
                return true;
            case 2097152:
                return P(lVar, i3, bundle);
            case R.id.accessibilityActionShowOnScreen:
                this.f8129b.b(i3, g.SHOW_ON_SCREEN);
                return true;
            default:
                h hVar = (h) this.f8135h.get(Integer.valueOf(i4 - f8125B));
                if (hVar == null) {
                    return false;
                }
                this.f8129b.c(i3, g.CUSTOM_ACTION, Integer.valueOf(hVar.f8193b));
                return true;
        }
    }

    public j(View view, C1005a c1005a, AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, io.flutter.plugin.platform.o oVar) {
        this.f8134g = new HashMap();
        this.f8135h = new HashMap();
        this.f8139l = 0;
        this.f8143p = new ArrayList();
        this.f8144q = 0;
        this.f8145r = 0;
        this.f8147t = false;
        this.f8148u = false;
        this.f8149v = new a();
        b bVar = new b();
        this.f8150w = bVar;
        c cVar = new c(new Handler());
        this.f8152y = cVar;
        this.f8128a = view;
        this.f8129b = c1005a;
        this.f8130c = accessibilityManager;
        this.f8133f = contentResolver;
        this.f8131d = accessibilityViewEmbedder;
        this.f8132e = oVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        d dVar = new d(accessibilityManager);
        this.f8151x = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        cVar.onChange(false);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, cVar);
        if (Build.VERSION.SDK_INT >= 31) {
            Y();
        }
        oVar.a(this);
    }
}
