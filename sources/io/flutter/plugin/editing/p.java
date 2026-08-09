package io.flutter.plugin.editing;

import b1.AbstractC0525b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f7860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CharSequence f7861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7866g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7867h;

    public p(CharSequence charSequence, int i3, int i4, int i5, int i6) {
        this.f7864e = i3;
        this.f7865f = i4;
        this.f7866g = i5;
        this.f7867h = i6;
        a(charSequence, "", -1, -1);
    }

    private void a(CharSequence charSequence, CharSequence charSequence2, int i3, int i4) {
        this.f7860a = charSequence;
        this.f7861b = charSequence2;
        this.f7862c = i3;
        this.f7863d = i4;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldText", this.f7860a.toString());
            jSONObject.put("deltaText", this.f7861b.toString());
            jSONObject.put("deltaStart", this.f7862c);
            jSONObject.put("deltaEnd", this.f7863d);
            jSONObject.put("selectionBase", this.f7864e);
            jSONObject.put("selectionExtent", this.f7865f);
            jSONObject.put("composingBase", this.f7866g);
            jSONObject.put("composingExtent", this.f7867h);
        } catch (JSONException e3) {
            AbstractC0525b.b("TextEditingDelta", "unable to create JSONObject: " + e3);
        }
        return jSONObject;
    }

    public p(CharSequence charSequence, int i3, int i4, CharSequence charSequence2, int i5, int i6, int i7, int i8) {
        this.f7864e = i5;
        this.f7865f = i6;
        this.f7866g = i7;
        this.f7867h = i8;
        a(charSequence, charSequence2.toString(), i3, i4);
    }
}
