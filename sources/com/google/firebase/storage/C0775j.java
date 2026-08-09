package com.google.firebase.storage;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.firebase.storage.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0775j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f6571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f6572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6573c;

    C0775j(List list, List list2, String str) {
        this.f6571a = list;
        this.f6572b = list2;
        this.f6573c = str;
    }

    static C0775j a(C0771f c0771f, JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (jSONObject.has("prefixes")) {
            JSONArray jSONArray = jSONObject.getJSONArray("prefixes");
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                String string = jSONArray.getString(i3);
                if (string.endsWith("/")) {
                    string = string.substring(0, string.length() - 1);
                }
                arrayList.add(c0771f.n(string));
            }
        }
        if (jSONObject.has("items")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("items");
            for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                arrayList2.add(c0771f.n(jSONArray2.getJSONObject(i4).getString("name")));
            }
        }
        return new C0775j(arrayList, arrayList2, jSONObject.optString("nextPageToken", null));
    }

    public List b() {
        return this.f6572b;
    }

    public String c() {
        return this.f6573c;
    }

    public List d() {
        return this.f6571a;
    }
}
