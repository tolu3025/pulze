package com.google.firebase.firestore;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.firebase.firestore.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0715a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0760x f6313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6315c;

    /* JADX INFO: renamed from: com.google.firebase.firestore.a$b */
    public static class b extends AbstractC0715a {
        private b(C0760x c0760x) {
            super(c0760x, "average");
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.firestore.a$c */
    public static class c extends AbstractC0715a {
        /* JADX WARN: Multi-variable type inference failed */
        private c() {
            super(null, "count");
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.firestore.a$d */
    public static class d extends AbstractC0715a {
        private d(C0760x c0760x) {
            super(c0760x, "sum");
        }
    }

    private AbstractC0715a(C0760x c0760x, String str) {
        String str2;
        this.f6313a = c0760x;
        this.f6314b = str;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (c0760x == null) {
            str2 = "";
        } else {
            str2 = "_" + c0760x;
        }
        sb.append(str2);
        this.f6315c = sb.toString();
    }

    public static b a(String str) {
        return new b(C0760x.b(str));
    }

    public static c b() {
        return new c();
    }

    public static d f(String str) {
        return new d(C0760x.b(str));
    }

    public String c() {
        return this.f6315c;
    }

    public String d() {
        C0760x c0760x = this.f6313a;
        return c0760x == null ? "" : c0760x.toString();
    }

    public String e() {
        return this.f6314b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0715a)) {
            return false;
        }
        AbstractC0715a abstractC0715a = (AbstractC0715a) obj;
        C0760x c0760x = this.f6313a;
        return (c0760x == null || abstractC0715a.f6313a == null) ? c0760x == null && abstractC0715a.f6313a == null : this.f6314b.equals(abstractC0715a.e()) && d().equals(abstractC0715a.d());
    }

    public int hashCode() {
        return Objects.hash(e(), d());
    }
}
