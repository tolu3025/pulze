package Y0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f3335c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    e[] f3333a = new e[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f3334b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f3336d = 2;

    m() {
    }

    void a(int i3) {
        int i4 = this.f3334b;
        e[] eVarArr = this.f3333a;
        if (i4 >= eVarArr.length) {
            this.f3333a = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        this.f3333a[this.f3334b] = new e(i3);
        this.f3334b++;
    }

    int b(int i3, int i4) {
        if (i3 == 0) {
            return i4;
        }
        if (i4 == 0) {
            return i3;
        }
        int i5 = i3;
        while (true) {
            int iD = d(i5);
            if (iD == 0) {
                break;
            }
            i5 = iD;
        }
        e eVar = this.f3333a[i5 >> 1];
        if ((i5 & 1) == 0) {
            eVar.f3278b = i4;
        } else {
            eVar.f3279c = i4;
        }
        return i3;
    }

    e c(int i3) {
        return this.f3333a[i3];
    }

    int d(int i3) {
        e eVar = this.f3333a[i3 >> 1];
        return (i3 & 1) == 0 ? eVar.f3278b : eVar.f3279c;
    }

    int e() {
        return this.f3334b;
    }

    void f(int i3, int i4) {
        while (i3 != 0) {
            e eVar = this.f3333a[i3 >> 1];
            if ((i3 & 1) == 0) {
                i3 = eVar.f3278b;
                eVar.f3278b = i4;
            } else {
                i3 = eVar.f3279c;
                eVar.f3279c = i4;
            }
        }
    }

    boolean g(StringBuilder sb) {
        e eVarH = h(this.f3335c);
        if (!e.b(eVarH.f3277a) || eVarH.f3280d.length != 1) {
            return eVarH.f3277a == 6;
        }
        while (e.b(eVarH.f3277a)) {
            int[] iArr = eVarH.f3280d;
            if (iArr.length != 1 || (eVarH.f3279c & 1) != 0) {
                break;
            }
            sb.appendCodePoint(iArr[0]);
            eVarH = h(eVarH.f3278b);
        }
        return eVarH.f3277a == 6;
    }

    e h(int i3) {
        e eVar = this.f3333a[i3];
        while (true) {
            int i4 = eVar.f3277a;
            if (i4 != 7 && i4 != 3) {
                return eVar;
            }
            eVar = this.f3333a[i3];
            i3 = eVar.f3278b;
        }
    }

    int i() {
        int i3 = this.f3335c;
        int i4 = 0;
        while (true) {
            e eVar = this.f3333a[i3];
            int i5 = eVar.f3277a;
            if (i5 != 3) {
                if (i5 == 4) {
                    i4 |= eVar.f3279c;
                } else {
                    if (i5 == 5) {
                        return -1;
                    }
                    if (i5 != 7) {
                        return i4;
                    }
                }
            }
            i3 = eVar.f3278b;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < this.f3334b; i3++) {
            int length = sb.length();
            sb.append(i3);
            if (i3 == this.f3335c) {
                sb.append('*');
            }
            sb.append("        ".substring(sb.length() - length));
            sb.append(this.f3333a[i3]);
            sb.append('\n');
        }
        return sb.toString();
    }
}
