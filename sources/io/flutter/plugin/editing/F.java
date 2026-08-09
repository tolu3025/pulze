package io.flutter.plugin.editing;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import b1.AbstractC0525b;
import io.flutter.embedding.android.L;
import io.flutter.plugin.editing.n;
import java.util.HashMap;
import k1.w;
import l.AbstractC1012b;

/* JADX INFO: loaded from: classes.dex */
public class F implements n.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f7799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InputMethodManager f7800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AutofillManager f7801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k1.w f7802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f7803e = new c(c.a.NO_TARGET, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private w.b f7804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SparseArray f7805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n f7806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f7807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InputConnection f7808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private io.flutter.plugin.platform.r f7809k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Rect f7810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ImeSyncDeferringInsetsCallback f7811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private w.e f7812n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f7813o;

    class a implements w.f {
        a() {
        }

        @Override // k1.w.f
        public void a() {
            F.this.k();
        }

        @Override // k1.w.f
        public void b() {
            F f3 = F.this;
            f3.D(f3.f7799a);
        }

        @Override // k1.w.f
        public void c(String str, Bundle bundle) {
            F.this.z(str, bundle);
        }

        @Override // k1.w.f
        public void d(int i3, boolean z2) {
            F.this.A(i3, z2);
        }

        @Override // k1.w.f
        public void e(double d3, double d4, double[] dArr) {
            F.this.y(d3, d4, dArr);
        }

        @Override // k1.w.f
        public void f() {
            F.this.v();
        }

        @Override // k1.w.f
        public void g(int i3, w.b bVar) {
            F.this.B(i3, bVar);
        }

        @Override // k1.w.f
        public void h(w.e eVar) {
            F f3 = F.this;
            f3.C(f3.f7799a, eVar);
        }

        @Override // k1.w.f
        public void i(boolean z2) {
            if (Build.VERSION.SDK_INT < 26 || F.this.f7801c == null) {
                return;
            }
            if (z2) {
                F.this.f7801c.commit();
            } else {
                F.this.f7801c.cancel();
            }
        }

        @Override // k1.w.f
        public void j() {
            if (F.this.f7803e.f7819a == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                F.this.w();
            } else {
                F f3 = F.this;
                f3.q(f3.f7799a);
            }
        }
    }

    class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ double[] f7816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ double[] f7817c;

        b(boolean z2, double[] dArr, double[] dArr2) {
            this.f7815a = z2;
            this.f7816b = dArr;
            this.f7817c = dArr2;
        }

        @Override // io.flutter.plugin.editing.F.d
        public void a(double d3, double d4) {
            double d5 = 1.0d;
            if (!this.f7815a) {
                double[] dArr = this.f7816b;
                d5 = 1.0d / (((dArr[3] * d3) + (dArr[7] * d4)) + dArr[15]);
            }
            double[] dArr2 = this.f7816b;
            double d6 = ((dArr2[0] * d3) + (dArr2[4] * d4) + dArr2[12]) * d5;
            double d7 = ((dArr2[1] * d3) + (dArr2[5] * d4) + dArr2[13]) * d5;
            double[] dArr3 = this.f7817c;
            if (d6 < dArr3[0]) {
                dArr3[0] = d6;
            } else if (d6 > dArr3[1]) {
                dArr3[1] = d6;
            }
            if (d7 < dArr3[2]) {
                dArr3[2] = d7;
            } else if (d7 > dArr3[3]) {
                dArr3[3] = d7;
            }
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a f7819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f7820b;

        enum a {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public c(a aVar, int i3) {
            this.f7819a = aVar;
            this.f7820b = i3;
        }
    }

    private interface d {
        void a(double d3, double d4);
    }

    public F(View view, k1.w wVar, io.flutter.plugin.platform.r rVar) {
        this.f7799a = view;
        this.f7806h = new n(null, view);
        this.f7800b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i3 = Build.VERSION.SDK_INT;
        this.f7801c = i3 >= 26 ? u.a(view.getContext().getSystemService(q.a())) : null;
        if (i3 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f7811m = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f7802d = wVar;
        wVar.n(new a());
        wVar.k();
        this.f7809k = rVar;
        rVar.v(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(int i3, boolean z2) {
        if (!z2) {
            this.f7803e = new c(c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW, i3);
            this.f7808j = null;
        } else {
            this.f7799a.requestFocus();
            this.f7803e = new c(c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW, i3);
            this.f7800b.restartInput(this.f7799a);
            this.f7807i = false;
        }
    }

    private void F(w.b bVar) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (bVar == null || bVar.f9668j == null) {
            this.f7805g = null;
            return;
        }
        w.b[] bVarArr = bVar.f9670l;
        SparseArray sparseArray = new SparseArray();
        this.f7805g = sparseArray;
        if (bVarArr == null) {
            sparseArray.put(bVar.f9668j.f9671a.hashCode(), bVar);
            return;
        }
        for (w.b bVar2 : bVarArr) {
            w.b.a aVar = bVar2.f9668j;
            if (aVar != null) {
                this.f7805g.put(aVar.f9671a.hashCode(), bVar2);
                this.f7801c.notifyValueChanged(this.f7799a, aVar.f9671a.hashCode(), AutofillValue.forText(aVar.f9673c.f9684a));
            }
        }
    }

    private static boolean l(w.e eVar, w.e eVar2) {
        int i3 = eVar.f9688e - eVar.f9687d;
        if (i3 != eVar2.f9688e - eVar2.f9687d) {
            return true;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (eVar.f9684a.charAt(eVar.f9687d + i4) != eVar2.f9684a.charAt(eVar2.f9687d + i4)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(View view) {
        w();
        this.f7800b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int r(k1.w.c r1, boolean r2, boolean r3, boolean r4, boolean r5, k1.w.d r6) {
        /*
            k1.w$g r5 = r1.f9675a
            k1.w$g r0 = k1.w.g.DATETIME
            if (r5 != r0) goto L8
            r1 = 4
            return r1
        L8:
            k1.w$g r0 = k1.w.g.NUMBER
            if (r5 != r0) goto L1b
            boolean r2 = r1.f9676b
            if (r2 == 0) goto L13
            r2 = 4098(0x1002, float:5.743E-42)
            goto L14
        L13:
            r2 = 2
        L14:
            boolean r1 = r1.f9677c
            if (r1 == 0) goto L1a
            r2 = r2 | 8192(0x2000, float:1.148E-41)
        L1a:
            return r2
        L1b:
            k1.w$g r1 = k1.w.g.PHONE
            if (r5 != r1) goto L21
            r1 = 3
            return r1
        L21:
            k1.w$g r1 = k1.w.g.NONE
            if (r5 != r1) goto L27
            r1 = 0
            return r1
        L27:
            k1.w$g r1 = k1.w.g.MULTILINE
            if (r5 != r1) goto L2f
            r1 = 131073(0x20001, float:1.83672E-40)
            goto L53
        L2f:
            k1.w$g r1 = k1.w.g.EMAIL_ADDRESS
            if (r5 != r1) goto L36
            r1 = 33
            goto L53
        L36:
            k1.w$g r1 = k1.w.g.URL
            if (r5 != r1) goto L3d
            r1 = 17
            goto L53
        L3d:
            k1.w$g r1 = k1.w.g.VISIBLE_PASSWORD
            if (r5 != r1) goto L44
            r1 = 145(0x91, float:2.03E-43)
            goto L53
        L44:
            k1.w$g r1 = k1.w.g.NAME
            if (r5 != r1) goto L4b
            r1 = 97
            goto L53
        L4b:
            k1.w$g r1 = k1.w.g.POSTAL_ADDRESS
            if (r5 != r1) goto L52
            r1 = 113(0x71, float:1.58E-43)
            goto L53
        L52:
            r1 = 1
        L53:
            if (r2 == 0) goto L5a
            r2 = 524416(0x80080, float:7.34863E-40)
        L58:
            r1 = r1 | r2
            goto L66
        L5a:
            if (r3 == 0) goto L60
            r2 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r2
        L60:
            if (r4 != 0) goto L66
            r2 = 524432(0x80090, float:7.34886E-40)
            goto L58
        L66:
            k1.w$d r2 = k1.w.d.CHARACTERS
            if (r6 != r2) goto L6d
            r1 = r1 | 4096(0x1000, float:5.74E-42)
            goto L7a
        L6d:
            k1.w$d r2 = k1.w.d.WORDS
            if (r6 != r2) goto L74
            r1 = r1 | 8192(0x2000, float:1.148E-41)
            goto L7a
        L74:
            k1.w$d r2 = k1.w.d.SENTENCES
            if (r6 != r2) goto L7a
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.F.r(k1.w$c, boolean, boolean, boolean, boolean, k1.w$d):int");
    }

    private boolean t() {
        return this.f7805g != null;
    }

    private void u(String str) {
        if (Build.VERSION.SDK_INT < 26 || this.f7801c == null || !t()) {
            return;
        }
        this.f7801c.notifyValueChanged(this.f7799a, this.f7804f.f9668j.f9671a.hashCode(), AutofillValue.forText(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        if (Build.VERSION.SDK_INT < 26 || this.f7801c == null || !t()) {
            return;
        }
        String str = this.f7804f.f9668j.f9671a;
        int[] iArr = new int[2];
        this.f7799a.getLocationOnScreen(iArr);
        Rect rect = new Rect(this.f7810l);
        rect.offset(iArr[0], iArr[1]);
        this.f7801c.notifyViewEntered(this.f7799a, str.hashCode(), rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        w.b bVar;
        if (Build.VERSION.SDK_INT < 26 || this.f7801c == null || (bVar = this.f7804f) == null || bVar.f9668j == null || !t()) {
            return;
        }
        this.f7801c.notifyViewExited(this.f7799a, this.f7804f.f9668j.f9671a.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(double d3, double d4, double[] dArr) {
        double[] dArr2 = new double[4];
        boolean z2 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d5 = dArr[12];
        double d6 = dArr[15];
        double d7 = d5 / d6;
        dArr2[1] = d7;
        dArr2[0] = d7;
        double d8 = dArr[13] / d6;
        dArr2[3] = d8;
        dArr2[2] = d8;
        b bVar = new b(z2, dArr, dArr2);
        bVar.a(d3, 0.0d);
        bVar.a(d3, d4);
        bVar.a(0.0d, d4);
        double d9 = this.f7799a.getContext().getResources().getDisplayMetrics().density;
        this.f7810l = new Rect((int) (dArr2[0] * d9), (int) (dArr2[2] * d9), (int) Math.ceil(dArr2[1] * d9), (int) Math.ceil(dArr2[3] * d9));
    }

    void B(int i3, w.b bVar) {
        w();
        this.f7804f = bVar;
        this.f7803e = new c(c.a.FRAMEWORK_CLIENT, i3);
        this.f7806h.l(this);
        w.b.a aVar = bVar.f9668j;
        this.f7806h = new n(aVar != null ? aVar.f9673c : null, this.f7799a);
        F(bVar);
        this.f7807i = true;
        E();
        this.f7810l = null;
        this.f7806h.a(this);
    }

    void C(View view, w.e eVar) {
        w.e eVar2;
        if (!this.f7807i && (eVar2 = this.f7812n) != null && eVar2.b()) {
            boolean zL = l(this.f7812n, eVar);
            this.f7807i = zL;
            if (zL) {
                AbstractC0525b.e("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.f7812n = eVar;
        this.f7806h.n(eVar);
        if (this.f7807i) {
            this.f7800b.restartInput(view);
            this.f7807i = false;
        }
    }

    void D(View view) {
        w.c cVar;
        w.b bVar = this.f7804f;
        if (bVar != null && (cVar = bVar.f9665g) != null && cVar.f9675a == w.g.NONE) {
            q(view);
        } else {
            view.requestFocus();
            this.f7800b.showSoftInput(view, 0);
        }
    }

    public void E() {
        if (this.f7803e.f7819a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f7813o = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r7 == r1.f9688e) goto L22;
     */
    @Override // io.flutter.plugin.editing.n.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(boolean r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            if (r9 == 0) goto Lb
            io.flutter.plugin.editing.n r9 = r8.f7806h
            java.lang.String r9 = r9.toString()
            r8.u(r9)
        Lb:
            io.flutter.plugin.editing.n r9 = r8.f7806h
            int r9 = r9.i()
            io.flutter.plugin.editing.n r10 = r8.f7806h
            int r10 = r10.h()
            io.flutter.plugin.editing.n r11 = r8.f7806h
            int r11 = r11.g()
            io.flutter.plugin.editing.n r0 = r8.f7806h
            int r7 = r0.f()
            io.flutter.plugin.editing.n r0 = r8.f7806h
            java.util.ArrayList r0 = r0.e()
            k1.w$e r1 = r8.f7812n
            if (r1 == 0) goto La7
            io.flutter.plugin.editing.n r1 = r8.f7806h
            java.lang.String r1 = r1.toString()
            k1.w$e r2 = r8.f7812n
            java.lang.String r2 = r2.f9684a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L50
            k1.w$e r1 = r8.f7812n
            int r2 = r1.f9685b
            if (r9 != r2) goto L50
            int r2 = r1.f9686c
            if (r10 != r2) goto L50
            int r2 = r1.f9687d
            if (r11 != r2) goto L50
            int r1 = r1.f9688e
            if (r7 != r1) goto L50
            goto La7
        L50:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "send EditingState to flutter: "
            r1.append(r2)
            io.flutter.plugin.editing.n r2 = r8.f7806h
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TextInputPlugin"
            b1.AbstractC0525b.f(r2, r1)
            k1.w$b r1 = r8.f7804f
            boolean r1 = r1.f9663e
            if (r1 == 0) goto L81
            k1.w r1 = r8.f7802d
            io.flutter.plugin.editing.F$c r2 = r8.f7803e
            int r2 = r2.f7820b
            r1.q(r2, r0)
            io.flutter.plugin.editing.n r0 = r8.f7806h
            r0.c()
            goto L94
        L81:
            k1.w r0 = r8.f7802d
            io.flutter.plugin.editing.F$c r1 = r8.f7803e
            int r1 = r1.f7820b
            io.flutter.plugin.editing.n r2 = r8.f7806h
            java.lang.String r2 = r2.toString()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r7
            r0.p(r1, r2, r3, r4, r5, r6)
        L94:
            k1.w$e r6 = new k1.w$e
            io.flutter.plugin.editing.n r0 = r8.f7806h
            java.lang.String r1 = r0.toString()
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.f7812n = r6
            goto Lac
        La7:
            io.flutter.plugin.editing.n r9 = r8.f7806h
            r9.c()
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.F.a(boolean, boolean, boolean):void");
    }

    public void j(SparseArray sparseArray) {
        w.b bVar;
        w.b.a aVar;
        w.b.a aVar2;
        if (Build.VERSION.SDK_INT < 26 || (bVar = this.f7804f) == null || this.f7805g == null || (aVar = bVar.f9668j) == null) {
            return;
        }
        HashMap map = new HashMap();
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            w.b bVar2 = (w.b) this.f7805g.get(sparseArray.keyAt(i3));
            if (bVar2 != null && (aVar2 = bVar2.f9668j) != null) {
                String string = C.a(sparseArray.valueAt(i3)).getTextValue().toString();
                w.e eVar = new w.e(string, string.length(), string.length(), -1, -1);
                if (aVar2.f9671a.equals(aVar.f9671a)) {
                    this.f7806h.n(eVar);
                } else {
                    map.put(aVar2.f9671a, eVar);
                }
            }
        }
        this.f7802d.r(this.f7803e.f7820b, map);
    }

    void k() {
        if (this.f7803e.f7819a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        this.f7806h.l(this);
        w();
        this.f7804f = null;
        F(null);
        this.f7803e = new c(c.a.NO_TARGET, 0);
        E();
        this.f7810l = null;
        this.f7800b.restartInput(this.f7799a);
    }

    public InputConnection m(View view, L l3, EditorInfo editorInfo) {
        c cVar = this.f7803e;
        c.a aVar = cVar.f7819a;
        if (aVar == c.a.NO_TARGET) {
            this.f7808j = null;
            return null;
        }
        if (aVar == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        }
        if (aVar == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            if (this.f7813o) {
                return this.f7808j;
            }
            InputConnection inputConnectionOnCreateInputConnection = this.f7809k.c(cVar.f7820b).onCreateInputConnection(editorInfo);
            this.f7808j = inputConnectionOnCreateInputConnection;
            return inputConnectionOnCreateInputConnection;
        }
        w.b bVar = this.f7804f;
        int iR = r(bVar.f9665g, bVar.f9659a, bVar.f9660b, bVar.f9661c, bVar.f9662d, bVar.f9664f);
        editorInfo.inputType = iR;
        editorInfo.imeOptions = 33554432;
        if (Build.VERSION.SDK_INT >= 26 && !this.f7804f.f9662d) {
            editorInfo.imeOptions = 33554432 | 16777216;
        }
        Integer num = this.f7804f.f9666h;
        int iIntValue = num == null ? (iR & 131072) != 0 ? 1 : 6 : num.intValue();
        w.b bVar2 = this.f7804f;
        String str = bVar2.f9667i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = iIntValue;
        }
        editorInfo.imeOptions = iIntValue | editorInfo.imeOptions;
        String[] strArr = bVar2.f9669k;
        if (strArr != null) {
            AbstractC1012b.a(editorInfo, strArr);
        }
        m mVar = new m(view, this.f7803e.f7820b, this.f7802d, l3, this.f7806h, editorInfo);
        editorInfo.initialSelStart = this.f7806h.i();
        editorInfo.initialSelEnd = this.f7806h.h();
        this.f7808j = mVar;
        return mVar;
    }

    public void n() {
        this.f7809k.G();
        this.f7802d.n(null);
        w();
        this.f7806h.l(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f7811m;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public InputMethodManager o() {
        return this.f7800b;
    }

    public boolean p(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!o().isAcceptingText() || (inputConnection = this.f7808j) == null) {
            return false;
        }
        return inputConnection instanceof m ? ((m) inputConnection).f(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    public void s() {
        if (this.f7803e.f7819a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f7813o = true;
        }
    }

    public void x(ViewStructure viewStructure, int i3) {
        ViewStructure viewStructure2;
        CharSequence charSequence;
        Rect rect;
        if (Build.VERSION.SDK_INT < 26 || !t()) {
            return;
        }
        String str = this.f7804f.f9668j.f9671a;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int i4 = 0; i4 < this.f7805g.size(); i4++) {
            int iKeyAt = this.f7805g.keyAt(i4);
            w.b.a aVar = ((w.b) this.f7805g.valueAt(i4)).f9668j;
            if (aVar != null) {
                viewStructure.addChildCount(1);
                ViewStructure viewStructureNewChild = viewStructure.newChild(i4);
                viewStructureNewChild.setAutofillId(autofillId, iKeyAt);
                String[] strArr = aVar.f9672b;
                if (strArr.length > 0) {
                    viewStructureNewChild.setAutofillHints(strArr);
                }
                viewStructureNewChild.setAutofillType(1);
                viewStructureNewChild.setVisibility(0);
                String str2 = aVar.f9674d;
                if (str2 != null) {
                    viewStructureNewChild.setHint(str2);
                }
                if (str.hashCode() != iKeyAt || (rect = this.f7810l) == null) {
                    viewStructure2 = viewStructureNewChild;
                    viewStructure2.setDimens(0, 0, 0, 0, 1, 1);
                    charSequence = aVar.f9673c.f9684a;
                } else {
                    viewStructure2 = viewStructureNewChild;
                    viewStructureNewChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.f7810l.height());
                    charSequence = this.f7806h;
                }
                viewStructure2.setAutofillValue(AutofillValue.forText(charSequence));
            }
        }
    }

    public void z(String str, Bundle bundle) {
        this.f7800b.sendAppPrivateCommand(this.f7799a, str, bundle);
    }
}
