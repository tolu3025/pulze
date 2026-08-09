package Y0;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f3248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3249b;

    a() {
        this.f3248a = s.f3527a;
        this.f3249b = 0;
    }

    static String l(int[] iArr, int i3) {
        String hexString;
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i4 = 0; i4 < i3; i4 += 2) {
            if (i4 > 0) {
                sb.append(' ');
            }
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            sb.append("0x");
            if (i5 == i6) {
                hexString = Integer.toHexString(i5);
            } else {
                sb.append(Integer.toHexString(i5));
                sb.append("-0x");
                hexString = Integer.toHexString(i6);
            }
            sb.append(hexString);
        }
        sb.append(']');
        return sb.toString();
    }

    private static int n(int[] iArr, int i3, int i4, int i5) {
        int i6 = iArr[i3] - i4;
        return i6 != 0 ? i6 : i5 - iArr[i3 + 1];
    }

    private void o(int i3) {
        int[] iArr = this.f3248a;
        if (iArr.length < i3) {
            int i4 = this.f3249b;
            if (i3 < i4 * 2) {
                i3 = i4 * 2;
            }
            int[] iArr2 = new int[i3];
            System.arraycopy(iArr, 0, iArr2, 0, i4);
            this.f3248a = iArr2;
        }
    }

    private static void q(int[] iArr, int i3, int i4) {
        int i5 = ((i3 + i4) / 2) & (-2);
        int i6 = iArr[i5];
        int i7 = iArr[i5 + 1];
        int i8 = i3;
        int i9 = i4;
        while (i8 <= i9) {
            while (i8 < i4 && n(iArr, i8, i6, i7) < 0) {
                i8 += 2;
            }
            while (i9 > i3 && n(iArr, i9, i6, i7) > 0) {
                i9 -= 2;
            }
            if (i8 <= i9) {
                if (i8 != i9) {
                    int i10 = iArr[i8];
                    iArr[i8] = iArr[i9];
                    iArr[i9] = i10;
                    int i11 = i8 + 1;
                    int i12 = iArr[i11];
                    int i13 = i9 + 1;
                    iArr[i11] = iArr[i13];
                    iArr[i13] = i12;
                }
                i8 += 2;
                i9 -= 2;
            }
        }
        if (i3 < i9) {
            q(iArr, i3, i9);
        }
        if (i8 < i4) {
            q(iArr, i8, i4);
        }
    }

    a a(int[] iArr) {
        for (int i3 = 0; i3 < iArr.length; i3 += 2) {
            i(iArr[i3], iArr[i3 + 1]);
        }
        return this;
    }

    a b(int[] iArr, int i3) {
        return i3 < 0 ? g(iArr) : a(iArr);
    }

    a c(int[] iArr) {
        for (int i3 = 0; i3 < iArr.length; i3 += 2) {
            d(iArr[i3], iArr[i3 + 1]);
        }
        return this;
    }

    a d(int i3, int i4) {
        if (i3 <= 65 && i4 >= 66639) {
            return i(i3, i4);
        }
        if (i4 < 65 || i3 > 66639) {
            return i(i3, i4);
        }
        if (i3 < 65) {
            i(i3, 64);
            i3 = 65;
        }
        if (i4 > 66639) {
            i(66640, i4);
            i4 = 66639;
        }
        while (i3 <= i4) {
            i(i3, i3);
            for (int iD = q.d(i3); iD != i3; iD = q.d(iD)) {
                i(iD, iD);
            }
            i3++;
        }
        return this;
    }

    a e(b bVar, boolean z2) {
        int[] iArrR = bVar.f3270b;
        if (z2) {
            iArrR = new a().c(iArrR).m().r();
        }
        return b(iArrR, bVar.f3269a);
    }

    a f(int i3, int i4) {
        return (i4 & 1) != 0 ? d(i3, i3) : i(i3, i3);
    }

    a g(int[] iArr) {
        int i3 = 0;
        for (int i4 = 0; i4 < iArr.length; i4 += 2) {
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            int i7 = i5 - 1;
            if (i3 <= i7) {
                i(i3, i7);
            }
            i3 = i6 + 1;
        }
        if (i3 <= 1114111) {
            i(i3, 1114111);
        }
        return this;
    }

    a h(int[][] iArr) {
        int i3 = 0;
        for (int[] iArr2 : iArr) {
            int i4 = iArr2[0];
            int i5 = iArr2[1];
            int i6 = iArr2[2];
            if (i6 == 1) {
                int i7 = i4 - 1;
                if (i3 <= i7) {
                    i(i3, i7);
                }
                i3 = i5 + 1;
            } else {
                while (i4 <= i5) {
                    int i8 = i4 - 1;
                    if (i3 <= i8) {
                        i(i3, i8);
                    }
                    i3 = i4 + 1;
                    i4 += i6;
                }
            }
        }
        if (i3 <= 1114111) {
            i(i3, 1114111);
        }
        return this;
    }

    a i(int i3, int i4) {
        if (this.f3249b > 0) {
            for (int i5 = 2; i5 <= 4; i5 += 2) {
                int i6 = this.f3249b;
                if (i6 >= i5) {
                    int[] iArr = this.f3248a;
                    int i7 = iArr[i6 - i5];
                    int i8 = iArr[(i6 - i5) + 1];
                    if (i3 <= i8 + 1 && i7 <= i4 + 1) {
                        if (i3 < i7) {
                            iArr[i6 - i5] = i3;
                        }
                        if (i4 > i8) {
                            iArr[(i6 - i5) + 1] = i4;
                        }
                        return this;
                    }
                }
            }
        }
        o(this.f3249b + 2);
        int[] iArr2 = this.f3248a;
        int i9 = this.f3249b;
        iArr2[i9] = i3;
        this.f3249b = i9 + 2;
        iArr2[i9 + 1] = i4;
        return this;
    }

    a j(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            int i3 = iArr2[0];
            int i4 = iArr2[1];
            int i5 = iArr2[2];
            if (i5 == 1) {
                i(i3, i4);
            } else {
                while (i3 <= i4) {
                    i(i3, i3);
                    i3 += i5;
                }
            }
        }
        return this;
    }

    a k(int[][] iArr, int i3) {
        return i3 < 0 ? h(iArr) : j(iArr);
    }

    a m() {
        int i3 = this.f3249b;
        if (i3 < 4) {
            return this;
        }
        q(this.f3248a, 0, i3 - 2);
        int i4 = 2;
        for (int i5 = 2; i5 < this.f3249b; i5 += 2) {
            int[] iArr = this.f3248a;
            int i6 = iArr[i5];
            int i7 = iArr[i5 + 1];
            int i8 = i4 - 1;
            int i9 = iArr[i8];
            if (i6 > i9 + 1) {
                iArr[i4] = i6;
                iArr[i4 + 1] = i7;
                i4 += 2;
            } else if (i7 > i9) {
                iArr[i8] = i7;
            }
        }
        this.f3249b = i4;
        return this;
    }

    a p() {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < this.f3249b; i5 += 2) {
            int[] iArr = this.f3248a;
            int i6 = iArr[i5];
            int i7 = iArr[i5 + 1];
            int i8 = i6 - 1;
            if (i4 <= i8) {
                iArr[i3] = i4;
                iArr[i3 + 1] = i8;
                i3 += 2;
            }
            i4 = i7 + 1;
        }
        this.f3249b = i3;
        if (i4 <= 1114111) {
            o(i3 + 2);
            int[] iArr2 = this.f3248a;
            int i9 = this.f3249b;
            iArr2[i9] = i4;
            this.f3249b = i9 + 2;
            iArr2[i9 + 1] = 1114111;
        }
        return this;
    }

    int[] r() {
        int i3 = this.f3249b;
        int[] iArr = this.f3248a;
        if (i3 == iArr.length) {
            return iArr;
        }
        int[] iArr2 = new int[i3];
        System.arraycopy(iArr, 0, iArr2, 0, i3);
        return iArr2;
    }

    public String toString() {
        return l(this.f3248a, this.f3249b);
    }

    a(int[] iArr) {
        this.f3248a = iArr;
        this.f3249b = iArr.length;
    }
}
