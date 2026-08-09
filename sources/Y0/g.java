package Y0;

/* JADX INFO: loaded from: classes.dex */
abstract class g {

    private static class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final CharSequence f3296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f3297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f3298c;

        public a(CharSequence charSequence, int i3, int i4) {
            this.f3296a = charSequence;
            this.f3297b = i3;
            this.f3298c = i4;
        }

        private int h(CharSequence charSequence, String str, int i3) {
            return charSequence instanceof String ? ((String) charSequence).indexOf(str, i3) : charSequence instanceof StringBuilder ? ((StringBuilder) charSequence).indexOf(str, i3) : i(charSequence, str, i3);
        }

        private int i(CharSequence charSequence, String str, int i3) {
            if (i3 >= charSequence.length()) {
                return str.isEmpty() ? 0 : -1;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            if (str.isEmpty()) {
                return i3;
            }
            char cCharAt = str.charAt(0);
            int length = charSequence.length() - str.length();
            while (i3 <= length) {
                if (charSequence.charAt(i3) != cCharAt) {
                    do {
                        i3++;
                        if (i3 > length) {
                            break;
                        }
                    } while (charSequence.charAt(i3) != cCharAt);
                }
                if (i3 <= length) {
                    int i4 = i3 + 1;
                    int length2 = (str.length() + i4) - 1;
                    for (int i5 = 1; i4 < length2 && charSequence.charAt(i4) == str.charAt(i5); i5++) {
                        i4++;
                    }
                    if (i4 == length2) {
                        return i3;
                    }
                }
                i3++;
            }
            return -1;
        }

        @Override // Y0.g
        boolean a() {
            return true;
        }

        @Override // Y0.g
        int b(int i3) {
            int i4 = i3 + this.f3297b;
            return s.a((i4 <= 0 || i4 > this.f3296a.length()) ? -1 : Character.codePointBefore(this.f3296a, i4), i4 < this.f3296a.length() ? Character.codePointAt(this.f3296a, i4) : -1);
        }

        @Override // Y0.g
        int c() {
            return this.f3298c;
        }

        @Override // Y0.g
        int f(n nVar, int i3) {
            int i4 = i3 + this.f3297b;
            int iH = h(this.f3296a, nVar.f3342f, i4);
            return iH < 0 ? iH : iH - i4;
        }

        @Override // Y0.g
        int g(int i3) {
            int i4 = i3 + this.f3297b;
            if (i4 >= this.f3298c) {
                return -8;
            }
            int iCodePointAt = Character.codePointAt(this.f3296a, i4);
            return Character.charCount(iCodePointAt) | (iCodePointAt << 3);
        }
    }

    private static class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final byte[] f3299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f3300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f3301c;

        b(byte[] bArr, int i3, int i4) {
            if (i4 <= bArr.length) {
                this.f3299a = bArr;
                this.f3300b = i3;
                this.f3301c = i4;
            } else {
                throw new ArrayIndexOutOfBoundsException("end is greater than length: " + i4 + " > " + bArr.length);
            }
        }

        @Override // Y0.g
        boolean a() {
            return true;
        }

        @Override // Y0.g
        int b(int i3) {
            int iG;
            int i4 = this.f3300b;
            int i5 = i3 + i4;
            if (i5 <= i4 || i5 > this.f3301c) {
                iG = -1;
            } else {
                int i6 = i5 - 2;
                iG = this.f3299a[i5 - 1];
                if (iG >= 128) {
                    int i7 = i5 - 4;
                    if (i7 >= i4) {
                        i4 = i7;
                    }
                    while (i6 >= i4 && (this.f3299a[i6] & 192) == 128) {
                        i6--;
                    }
                    int i8 = this.f3300b;
                    if (i6 < i8) {
                        i6 = i8;
                    }
                    iG = g(i6) >> 3;
                }
            }
            return s.a(iG, i5 < this.f3301c ? g(i5) >> 3 : -1);
        }

        @Override // Y0.g
        int c() {
            return this.f3301c;
        }

        @Override // Y0.g
        int f(n nVar, int i3) {
            int i4 = i3 + this.f3300b;
            int iC = s.c(this.f3299a, nVar.f3343g, i4);
            return iC < 0 ? iC : iC - i4;
        }

        @Override // Y0.g
        int g(int i3) {
            int i4 = i3 + this.f3300b;
            int i5 = this.f3301c;
            if (i4 >= i5) {
                return -8;
            }
            byte[] bArr = this.f3299a;
            int i6 = i4 + 1;
            byte b3 = bArr[i4];
            int i7 = b3 & 255;
            if ((b3 & 128) == 0) {
                return (i7 << 3) | 1;
            }
            if ((b3 & 224) == 192) {
                int i8 = b3 & 31;
                if (i6 >= i5) {
                    return -8;
                }
                return (((i8 << 6) | (bArr[i6] & 63)) << 3) | 2;
            }
            if ((b3 & 240) == 224) {
                int i9 = b3 & 15;
                int i10 = i4 + 2;
                if (i10 >= i5) {
                    return -8;
                }
                return (((bArr[i10] & 63) | (((i9 << 6) | (bArr[i6] & 63)) << 6)) << 3) | 3;
            }
            int i11 = b3 & 7;
            if (i4 + 3 >= i5) {
                return -8;
            }
            return (((bArr[i4 + 3] & 63) | (((((i11 << 6) | (bArr[i6] & 63)) << 6) | (bArr[i4 + 2] & 63)) << 6)) << 3) | 4;
        }
    }

    g() {
    }

    static g d(CharSequence charSequence, int i3, int i4) {
        return new a(charSequence, i3, i4);
    }

    static g e(byte[] bArr, int i3, int i4) {
        return new b(bArr, i3, i4);
    }

    abstract boolean a();

    abstract int b(int i3);

    abstract int c();

    abstract int f(n nVar, int i3);

    abstract int g(int i3);
}
