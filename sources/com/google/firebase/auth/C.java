package com.google.firebase.auth;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f5906b;

    public C(String str, Map map) {
        this.f5905a = str;
        this.f5906b = map;
    }

    private final long h(String str) {
        Integer num = (Integer) this.f5906b.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    public long a() {
        return h("auth_time");
    }

    public Map b() {
        return this.f5906b;
    }

    public long c() {
        return h("exp");
    }

    public long d() {
        return h("iat");
    }

    public String e() {
        Map map = (Map) this.f5906b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }

    public String f() {
        Map map = (Map) this.f5906b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_second_factor");
        }
        return null;
    }

    public String g() {
        return this.f5905a;
    }
}
