package Y0;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class o {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final o[] f3348j = new o[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b f3349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f3350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    o[] f3351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f3352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f3353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f3354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f3355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f3356h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Map f3357i;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3358a;

        static {
            int[] iArr = new int[b.values().length];
            f3358a = iArr;
            try {
                iArr[b.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3358a[b.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3358a[b.QUEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3358a[b.REPEAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3358a[b.NO_MATCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3358a[b.EMPTY_MATCH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3358a[b.CONCAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3358a[b.ALTERNATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3358a[b.LITERAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3358a[b.ANY_CHAR_NOT_NL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3358a[b.ANY_CHAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3358a[b.CAPTURE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3358a[b.BEGIN_TEXT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3358a[b.END_TEXT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f3358a[b.BEGIN_LINE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f3358a[b.END_LINE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f3358a[b.WORD_BOUNDARY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f3358a[b.NO_WORD_BOUNDARY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f3358a[b.CHAR_CLASS.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    enum b {
        NO_MATCH,
        EMPTY_MATCH,
        LITERAL,
        CHAR_CLASS,
        ANY_CHAR_NOT_NL,
        ANY_CHAR,
        BEGIN_LINE,
        END_LINE,
        BEGIN_TEXT,
        END_TEXT,
        WORD_BOUNDARY,
        NO_WORD_BOUNDARY,
        CAPTURE,
        STAR,
        PLUS,
        QUEST,
        REPEAT,
        CONCAT,
        ALTERNATE,
        LEFT_PAREN,
        VERTICAL_BAR;

        boolean c() {
            return ordinal() >= LEFT_PAREN.ordinal();
        }
    }

    o(b bVar) {
        this.f3349a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.StringBuilder r9) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.o.a(java.lang.StringBuilder):void");
    }

    private static void c(StringBuilder sb, int i3) {
        if (i3 == 45) {
            sb.append('\\');
        }
    }

    int b() {
        int i3 = this.f3349a == b.CAPTURE ? this.f3355g : 0;
        o[] oVarArr = this.f3351c;
        if (oVarArr != null) {
            for (o oVar : oVarArr) {
                int iB = oVar.b();
                if (i3 < iB) {
                    i3 = iB;
                }
            }
        }
        return i3;
    }

    void d() {
        this.f3350b = 0;
        this.f3351c = f3348j;
        this.f3352d = null;
        this.f3354f = 0;
        this.f3353e = 0;
        this.f3355g = 0;
        this.f3356h = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.o.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        o oVar;
        int iHashCode2;
        int iDeepHashCode;
        int iHashCode3 = this.f3349a.hashCode();
        int i3 = a.f3358a[this.f3349a.ordinal()];
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            iHashCode = (this.f3350b & 32) * 31;
            oVar = this.f3351c[0];
        } else {
            if (i3 != 4) {
                if (i3 != 7 && i3 != 8) {
                    if (i3 == 9) {
                        iDeepHashCode = Arrays.hashCode(this.f3352d);
                    } else if (i3 == 12) {
                        int i4 = this.f3355g * 31;
                        String str = this.f3356h;
                        iHashCode = i4 + ((str != null ? str.hashCode() : 0) * 31);
                        oVar = this.f3351c[0];
                    } else if (i3 != 14) {
                        if (i3 != 19) {
                            return iHashCode3;
                        }
                        iDeepHashCode = Arrays.hashCode(this.f3352d);
                    } else {
                        iDeepHashCode = this.f3350b & 256;
                    }
                    return iHashCode3 + iHashCode2;
                }
                iDeepHashCode = Arrays.deepHashCode(this.f3351c);
                iHashCode2 = iDeepHashCode * 31;
                return iHashCode3 + iHashCode2;
            }
            iHashCode = (this.f3353e * 31) + (this.f3354f * 31);
            oVar = this.f3351c[0];
        }
        iHashCode2 = iHashCode + (oVar.hashCode() * 31);
        return iHashCode3 + iHashCode2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    o(o oVar) {
        this.f3349a = oVar.f3349a;
        this.f3350b = oVar.f3350b;
        this.f3351c = oVar.f3351c;
        this.f3352d = oVar.f3352d;
        this.f3353e = oVar.f3353e;
        this.f3354f = oVar.f3354f;
        this.f3355g = oVar.f3355g;
        this.f3356h = oVar.f3356h;
        this.f3357i = oVar.f3357i;
    }
}
