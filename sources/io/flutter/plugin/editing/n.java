package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import b1.AbstractC0525b;
import java.util.ArrayList;
import java.util.Iterator;
import k1.w;

/* JADX INFO: loaded from: classes.dex */
class n extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7842a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7843b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList f7844c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList f7845d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f7846e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f7847f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f7848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f7849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f7850n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f7851o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f7852p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BaseInputConnection f7853q;

    class a extends BaseInputConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Editable f7854a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, boolean z2, Editable editable) {
            super(view, z2);
            this.f7854a = editable;
        }

        @Override // android.view.inputmethod.BaseInputConnection
        public Editable getEditable() {
            return this.f7854a;
        }
    }

    interface b {
        void a(boolean z2, boolean z3, boolean z4);
    }

    public n(w.e eVar, View view) {
        this.f7853q = new a(view, true, this);
        if (eVar != null) {
            n(eVar);
        }
    }

    private void j(b bVar, boolean z2, boolean z3, boolean z4) {
        this.f7843b++;
        bVar.a(z2, z3, z4);
        this.f7843b--;
    }

    private void k(boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            Iterator it = this.f7844c.iterator();
            while (it.hasNext()) {
                j((b) it.next(), z2, z3, z4);
            }
        }
    }

    public void a(b bVar) {
        ArrayList arrayList;
        if (this.f7843b > 0) {
            AbstractC0525b.b("ListenableEditingState", "adding a listener " + bVar.toString() + " in a listener callback");
        }
        if (this.f7842a > 0) {
            AbstractC0525b.g("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            arrayList = this.f7845d;
        } else {
            arrayList = this.f7844c;
        }
        arrayList.add(bVar);
    }

    public void b() {
        this.f7842a++;
        if (this.f7843b > 0) {
            AbstractC0525b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f7842a != 1 || this.f7844c.isEmpty()) {
            return;
        }
        this.f7848l = toString();
        this.f7849m = i();
        this.f7850n = h();
        this.f7851o = g();
        this.f7852p = f();
    }

    public void c() {
        this.f7846e.clear();
    }

    public void d() {
        int i3 = this.f7842a;
        if (i3 == 0) {
            AbstractC0525b.b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i3 == 1) {
            Iterator it = this.f7845d.iterator();
            while (it.hasNext()) {
                j((b) it.next(), true, true, true);
            }
            if (!this.f7844c.isEmpty()) {
                AbstractC0525b.f("ListenableEditingState", "didFinishBatchEdit with " + String.valueOf(this.f7844c.size()) + " listener(s)");
                k(!toString().equals(this.f7848l), (this.f7849m == i() && this.f7850n == h()) ? false : true, (this.f7851o == g() && this.f7852p == f()) ? false : true);
            }
        }
        this.f7844c.addAll(this.f7845d);
        this.f7845d.clear();
        this.f7842a--;
    }

    public ArrayList e() {
        ArrayList arrayList = new ArrayList(this.f7846e);
        this.f7846e.clear();
        return arrayList;
    }

    public final int f() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int g() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int h() {
        return Selection.getSelectionEnd(this);
    }

    public final int i() {
        return Selection.getSelectionStart(this);
    }

    public void l(b bVar) {
        if (this.f7843b > 0) {
            AbstractC0525b.b("ListenableEditingState", "removing a listener " + bVar.toString() + " in a listener callback");
        }
        this.f7844c.remove(bVar);
        if (this.f7842a > 0) {
            this.f7845d.remove(bVar);
        }
    }

    public void m(int i3, int i4) {
        if (i3 < 0 || i3 >= i4) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f7853q.setComposingRegion(i3, i4);
        }
    }

    public void n(w.e eVar) {
        b();
        replace(0, length(), (CharSequence) eVar.f9684a);
        if (eVar.c()) {
            Selection.setSelection(this, eVar.f9685b, eVar.f9686c);
        } else {
            Selection.removeSelection(this);
        }
        m(eVar.f9687d, eVar.f9688e);
        c();
        d();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i3, int i4, int i5) {
        super.setSpan(obj, i3, i4, i5);
        this.f7846e.add(new p(toString(), i(), h(), g(), f()));
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public String toString() {
        String str = this.f7847f;
        if (str != null) {
            return str;
        }
        String string = super.toString();
        this.f7847f = string;
        return string;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i3, int i4, CharSequence charSequence, int i5, int i6) {
        boolean z2;
        boolean z3;
        if (this.f7843b > 0) {
            AbstractC0525b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String string = toString();
        int i7 = i4 - i3;
        boolean z4 = i7 != i6 - i5;
        for (int i8 = 0; i8 < i7 && !z4; i8++) {
            z4 |= charAt(i3 + i8) != charSequence.charAt(i5 + i8);
        }
        if (z4) {
            this.f7847f = null;
        }
        int i9 = i();
        int iH = h();
        int iG = g();
        int iF = f();
        SpannableStringBuilder spannableStringBuilderReplace = super.replace(i3, i4, charSequence, i5, i6);
        boolean z5 = z4;
        this.f7846e.add(new p(string, i3, i4, charSequence, i(), h(), g(), f()));
        if (this.f7842a > 0) {
            return spannableStringBuilderReplace;
        }
        boolean z6 = (i() == i9 && h() == iH) ? false : true;
        if (g() == iG && f() == iF) {
            z2 = z5;
            z3 = false;
        } else {
            z2 = z5;
            z3 = true;
        }
        k(z2, z6, z3);
        return spannableStringBuilderReplace;
    }
}
