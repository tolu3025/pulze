package androidx.profileinstaller;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[] f4871a = {48, 49, 53, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final byte[] f4872b = {48, 49, 48, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final byte[] f4873c = {48, 48, 57, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final byte[] f4874d = {48, 48, 53, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final byte[] f4875e = {48, 48, 49, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final byte[] f4876f = {48, 48, 49, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final byte[] f4877g = {48, 48, 50, 0};

    static String a(byte[] bArr) {
        return (Arrays.equals(bArr, f4875e) || Arrays.equals(bArr, f4874d)) ? ":" : "!";
    }
}
