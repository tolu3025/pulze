package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public class g implements Cloneable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f3739e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f3740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f3741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f3742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3743d;

    public g() {
        this(10);
    }

    private void c() {
        int i3 = this.f3743d;
        int[] iArr = this.f3741b;
        Object[] objArr = this.f3742c;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i5];
            if (obj != f3739e) {
                if (i5 != i4) {
                    iArr[i4] = iArr[i5];
                    objArr[i4] = obj;
                    objArr[i5] = null;
                }
                i4++;
            }
        }
        this.f3740a = false;
        this.f3743d = i4;
    }

    public void a() {
        int i3 = this.f3743d;
        Object[] objArr = this.f3742c;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        this.f3743d = 0;
        this.f3740a = false;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g clone() {
        try {
            g gVar = (g) super.clone();
            gVar.f3741b = (int[]) this.f3741b.clone();
            gVar.f3742c = (Object[]) this.f3742c.clone();
            return gVar;
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }

    public Object d(int i3) {
        return e(i3, null);
    }

    public Object e(int i3, Object obj) {
        Object obj2;
        int iA = c.a(this.f3741b, this.f3743d, i3);
        return (iA < 0 || (obj2 = this.f3742c[iA]) == f3739e) ? obj : obj2;
    }

    public int g(int i3) {
        if (this.f3740a) {
            c();
        }
        return c.a(this.f3741b, this.f3743d, i3);
    }

    public int h(int i3) {
        if (this.f3740a) {
            c();
        }
        return this.f3741b[i3];
    }

    public void i(int i3, Object obj) {
        int iA = c.a(this.f3741b, this.f3743d, i3);
        if (iA >= 0) {
            this.f3742c[iA] = obj;
            return;
        }
        int i4 = ~iA;
        int i5 = this.f3743d;
        if (i4 < i5) {
            Object[] objArr = this.f3742c;
            if (objArr[i4] == f3739e) {
                this.f3741b[i4] = i3;
                objArr[i4] = obj;
                return;
            }
        }
        if (this.f3740a && i5 >= this.f3741b.length) {
            c();
            i4 = ~c.a(this.f3741b, this.f3743d, i3);
        }
        int i6 = this.f3743d;
        if (i6 >= this.f3741b.length) {
            int iD = c.d(i6 + 1);
            int[] iArr = new int[iD];
            Object[] objArr2 = new Object[iD];
            int[] iArr2 = this.f3741b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f3742c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3741b = iArr;
            this.f3742c = objArr2;
        }
        int i7 = this.f3743d;
        if (i7 - i4 != 0) {
            int[] iArr3 = this.f3741b;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr4 = this.f3742c;
            System.arraycopy(objArr4, i4, objArr4, i8, this.f3743d - i4);
        }
        this.f3741b[i4] = i3;
        this.f3742c[i4] = obj;
        this.f3743d++;
    }

    public void j(int i3) {
        int iA = c.a(this.f3741b, this.f3743d, i3);
        if (iA >= 0) {
            Object[] objArr = this.f3742c;
            Object obj = objArr[iA];
            Object obj2 = f3739e;
            if (obj != obj2) {
                objArr[iA] = obj2;
                this.f3740a = true;
            }
        }
    }

    public int k() {
        if (this.f3740a) {
            c();
        }
        return this.f3743d;
    }

    public Object l(int i3) {
        if (this.f3740a) {
            c();
        }
        return this.f3742c[i3];
    }

    public String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3743d * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f3743d; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(h(i3));
            sb.append('=');
            Object objL = l(i3);
            if (objL != this) {
                sb.append(objL);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public g(int i3) {
        this.f3740a = false;
        if (i3 == 0) {
            this.f3741b = c.f3714a;
            this.f3742c = c.f3716c;
        } else {
            int iD = c.d(i3);
            this.f3741b = new int[iD];
            this.f3742c = new Object[iD];
        }
    }
}
