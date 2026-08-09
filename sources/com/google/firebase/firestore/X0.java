package com.google.firebase.firestore;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double[] f6306a;

    X0(double[] dArr) {
        this.f6306a = dArr == null ? new double[0] : (double[]) dArr.clone();
    }

    public double[] a() {
        return (double[]) this.f6306a.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f6306a, ((X0) obj).f6306a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f6306a);
    }
}
