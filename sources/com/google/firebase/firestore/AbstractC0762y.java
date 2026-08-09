package com.google.firebase.firestore;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.google.firebase.firestore.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0762y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f6419a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f6420b = new e();

    /* JADX INFO: renamed from: com.google.firebase.firestore.y$a */
    static class a extends AbstractC0762y {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f6421c;

        a(List list) {
            this.f6421c = list;
        }

        @Override // com.google.firebase.firestore.AbstractC0762y
        String d() {
            return "FieldValue.arrayRemove";
        }

        List i() {
            return this.f6421c;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.firestore.y$b */
    static class b extends AbstractC0762y {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f6422c;

        b(List list) {
            this.f6422c = list;
        }

        @Override // com.google.firebase.firestore.AbstractC0762y
        String d() {
            return "FieldValue.arrayUnion";
        }

        List i() {
            return this.f6422c;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.firestore.y$c */
    static class c extends AbstractC0762y {
        c() {
        }

        @Override // com.google.firebase.firestore.AbstractC0762y
        String d() {
            return "FieldValue.delete";
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.firestore.y$d */
    static class d extends AbstractC0762y {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Number f6423c;

        d(Number number) {
            this.f6423c = number;
        }

        @Override // com.google.firebase.firestore.AbstractC0762y
        String d() {
            return "FieldValue.increment";
        }

        Number i() {
            return this.f6423c;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.firestore.y$e */
    static class e extends AbstractC0762y {
        e() {
        }

        @Override // com.google.firebase.firestore.AbstractC0762y
        String d() {
            return "FieldValue.serverTimestamp";
        }
    }

    AbstractC0762y() {
    }

    public static AbstractC0762y a(Object... objArr) {
        return new a(Arrays.asList(objArr));
    }

    public static AbstractC0762y b(Object... objArr) {
        return new b(Arrays.asList(objArr));
    }

    public static AbstractC0762y c() {
        return f6419a;
    }

    public static AbstractC0762y e(double d3) {
        return new d(Double.valueOf(d3));
    }

    public static AbstractC0762y f(long j3) {
        return new d(Long.valueOf(j3));
    }

    public static AbstractC0762y g() {
        return f6420b;
    }

    public static X0 h(double[] dArr) {
        return new X0(dArr);
    }

    abstract String d();
}
