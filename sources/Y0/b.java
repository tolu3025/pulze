package Y0;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f3250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f3251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f3252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final HashMap f3253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f3254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f3255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f3256i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f3257j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f3258k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f3259l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f3260m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f3261n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f3262o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int[] f3263p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f3264q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f3265r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int[] f3266s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int[] f3267t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final HashMap f3268u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f3269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int[] f3270b;

    static {
        int[] iArr = {48, 57};
        f3250c = iArr;
        int[] iArr2 = {9, 10, 12, 13, 32, 32};
        f3251d = iArr2;
        int[] iArr3 = {48, 57, 65, 90, 95, 95, 97, 122};
        f3252e = iArr3;
        HashMap map = new HashMap();
        f3253f = map;
        map.put("\\d", new b(1, iArr));
        map.put("\\D", new b(-1, iArr));
        map.put("\\s", new b(1, iArr2));
        map.put("\\S", new b(-1, iArr2));
        map.put("\\w", new b(1, iArr3));
        map.put("\\W", new b(-1, iArr3));
        int[] iArr4 = {48, 57, 65, 90, 97, 122};
        f3254g = iArr4;
        int[] iArr5 = {65, 90, 97, 122};
        f3255h = iArr5;
        int[] iArr6 = {0, 127};
        f3256i = iArr6;
        int[] iArr7 = {9, 9, 32, 32};
        f3257j = iArr7;
        int[] iArr8 = {0, 31, 127, 127};
        f3258k = iArr8;
        int[] iArr9 = {48, 57};
        f3259l = iArr9;
        int[] iArr10 = {33, 126};
        f3260m = iArr10;
        int[] iArr11 = {97, 122};
        f3261n = iArr11;
        int[] iArr12 = {32, 126};
        f3262o = iArr12;
        int[] iArr13 = {33, 47, 58, 64, 91, 96, 123, 126};
        f3263p = iArr13;
        int[] iArr14 = {9, 13, 32, 32};
        f3264q = iArr14;
        int[] iArr15 = {65, 90};
        f3265r = iArr15;
        int[] iArr16 = {48, 57, 65, 90, 95, 95, 97, 122};
        f3266s = iArr16;
        int[] iArr17 = {48, 57, 65, 70, 97, 102};
        f3267t = iArr17;
        HashMap map2 = new HashMap();
        f3268u = map2;
        map2.put("[:alnum:]", new b(1, iArr4));
        map2.put("[:^alnum:]", new b(-1, iArr4));
        map2.put("[:alpha:]", new b(1, iArr5));
        map2.put("[:^alpha:]", new b(-1, iArr5));
        map2.put("[:ascii:]", new b(1, iArr6));
        map2.put("[:^ascii:]", new b(-1, iArr6));
        map2.put("[:blank:]", new b(1, iArr7));
        map2.put("[:^blank:]", new b(-1, iArr7));
        map2.put("[:cntrl:]", new b(1, iArr8));
        map2.put("[:^cntrl:]", new b(-1, iArr8));
        map2.put("[:digit:]", new b(1, iArr9));
        map2.put("[:^digit:]", new b(-1, iArr9));
        map2.put("[:graph:]", new b(1, iArr10));
        map2.put("[:^graph:]", new b(-1, iArr10));
        map2.put("[:lower:]", new b(1, iArr11));
        map2.put("[:^lower:]", new b(-1, iArr11));
        map2.put("[:print:]", new b(1, iArr12));
        map2.put("[:^print:]", new b(-1, iArr12));
        map2.put("[:punct:]", new b(1, iArr13));
        map2.put("[:^punct:]", new b(-1, iArr13));
        map2.put("[:space:]", new b(1, iArr14));
        map2.put("[:^space:]", new b(-1, iArr14));
        map2.put("[:upper:]", new b(1, iArr15));
        map2.put("[:^upper:]", new b(-1, iArr15));
        map2.put("[:word:]", new b(1, iArr16));
        map2.put("[:^word:]", new b(-1, iArr16));
        map2.put("[:xdigit:]", new b(1, iArr17));
        map2.put("[:^xdigit:]", new b(-1, iArr17));
    }

    private b(int i3, int[] iArr) {
        this.f3269a = i3;
        this.f3270b = iArr;
    }
}
