package com.google.firebase.firestore;

import d0.AbstractC0813a;

/* JADX INFO: loaded from: classes.dex */
public class Z implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f6308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f6309b;

    public Z(double d3, double d4) {
        if (Double.isNaN(d3) || d3 < -90.0d || d3 > 90.0d) {
            throw new IllegalArgumentException("Latitude must be in the range of [-90, 90]");
        }
        if (Double.isNaN(d4) || d4 < -180.0d || d4 > 180.0d) {
            throw new IllegalArgumentException("Longitude must be in the range of [-180, 180]");
        }
        this.f6308a = d3;
        this.f6309b = d4;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(Z z2) {
        int iB = AbstractC0813a.b(this.f6308a, z2.f6308a);
        return iB == 0 ? AbstractC0813a.b(this.f6309b, z2.f6309b) : iB;
    }

    public double e() {
        return this.f6308a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z2 = (Z) obj;
        return this.f6308a == z2.f6308a && this.f6309b == z2.f6309b;
    }

    public double g() {
        return this.f6309b;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f6308a);
        int i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f6309b);
        return (i3 * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public String toString() {
        return "GeoPoint { latitude=" + this.f6308a + ", longitude=" + this.f6309b + " }";
    }
}
