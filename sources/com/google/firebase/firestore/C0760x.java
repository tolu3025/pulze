package com.google.firebase.firestore;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.firebase.firestore.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0760x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f6414b = Pattern.compile("[~*/\\[\\]]");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C0760x f6415c = new C0760x(D0.r.f1277b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D0.r f6416a;

    private C0760x(D0.r rVar) {
        this.f6416a = rVar;
    }

    public static C0760x a() {
        return f6415c;
    }

    public static C0760x b(String str) {
        J0.C.c(str, "Provided field path must not be null.");
        J0.C.a(!f6414b.matcher(str).find(), "Use FieldPath.of() for field names containing '~*/[]'.", new Object[0]);
        try {
            return d(str.split("\\.", -1));
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
        }
    }

    public static C0760x d(String... strArr) {
        J0.C.a(strArr.length > 0, "Invalid field path. Provided path must not be empty.", new Object[0]);
        int i3 = 0;
        while (i3 < strArr.length) {
            String str = strArr[i3];
            boolean z2 = (str == null || str.isEmpty()) ? false : true;
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid field name at argument ");
            i3++;
            sb.append(i3);
            sb.append(". Field names must not be null or empty.");
            J0.C.a(z2, sb.toString(), new Object[0]);
        }
        return new C0760x(Arrays.asList(strArr));
    }

    public D0.r c() {
        return this.f6416a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0760x.class != obj.getClass()) {
            return false;
        }
        return this.f6416a.equals(((C0760x) obj).f6416a);
    }

    public int hashCode() {
        return this.f6416a.hashCode();
    }

    public String toString() {
        return this.f6416a.toString();
    }

    private C0760x(List list) {
        this.f6416a = D0.r.A(list);
    }
}
