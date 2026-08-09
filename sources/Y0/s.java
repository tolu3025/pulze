package Y0;

import V0.I;

/* JADX INFO: loaded from: classes.dex */
abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int[] f3527a = new int[0];

    static int a(int i3, int i4) {
        int i5 = i3 < 0 ? 5 : 0;
        if (i3 == 10) {
            i5 |= 1;
        }
        if (i4 < 0) {
            i5 |= 10;
        }
        if (i4 == 10) {
            i5 |= 2;
        }
        return d(i3) != d(i4) ? i5 | 16 : i5 | 32;
    }

    static void b(StringBuilder sb, int i3) {
        String str;
        if (q.c(i3)) {
            if ("\\.+*?()|[]{}^$".indexOf((char) i3) >= 0) {
                sb.append('\\');
            }
            sb.appendCodePoint(i3);
            return;
        }
        if (i3 == 12) {
            str = "\\f";
        } else if (i3 == 13) {
            str = "\\r";
        } else if (i3 == 34) {
            str = "\\\"";
        } else if (i3 != 92) {
            switch (i3) {
                case 8:
                    str = "\\b";
                    break;
                case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    str = "\\t";
                    break;
                case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    str = "\\n";
                    break;
                default:
                    String hexString = Integer.toHexString(i3);
                    if (i3 >= 256) {
                        sb.append("\\x{");
                        sb.append(hexString);
                        sb.append('}');
                        return;
                    } else {
                        sb.append("\\x");
                        if (hexString.length() == 1) {
                            sb.append('0');
                        }
                        sb.append(hexString);
                        return;
                    }
            }
        } else {
            str = "\\\\";
        }
        sb.append(str);
    }

    static int c(byte[] bArr, byte[] bArr2, int i3) {
        if (i3 >= bArr.length) {
            if (bArr2.length == 0) {
                return bArr.length;
            }
            return -1;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (bArr2.length == 0) {
            return i3;
        }
        byte b3 = bArr2[0];
        int length = bArr.length - bArr2.length;
        while (i3 <= length) {
            if (bArr[i3] != b3) {
                do {
                    i3++;
                    if (i3 > length) {
                        break;
                    }
                } while (bArr[i3] != b3);
            }
            if (i3 <= length) {
                int i4 = i3 + 1;
                int length2 = (bArr2.length + i4) - 1;
                for (int i5 = 1; i4 < length2 && bArr[i4] == bArr2[i5]; i5++) {
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

    static boolean d(int i3) {
        return (65 <= i3 && i3 <= 90) || (97 <= i3 && i3 <= 122) || ((48 <= i3 && i3 <= 57) || i3 == 95);
    }

    static boolean e(int i3) {
        return (48 <= i3 && i3 <= 57) || (65 <= i3 && i3 <= 90) || (97 <= i3 && i3 <= 122);
    }

    static String f(int i3) {
        char c3 = (char) i3;
        return i3 == c3 ? String.valueOf(c3) : new String(Character.toChars(c3));
    }

    static int[] g(String str) {
        int length = str.length();
        int iCharCount = 0;
        int[] iArr = new int[str.codePointCount(0, length)];
        int i3 = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            iArr[i3] = iCodePointAt;
            iCharCount += Character.charCount(iCodePointAt);
            i3++;
        }
        return iArr;
    }

    static int[] h(int[] iArr, int i3, int i4) {
        int[] iArr2 = new int[i4 - i3];
        for (int i5 = i3; i5 < i4; i5++) {
            iArr2[i5 - i3] = iArr[i5];
        }
        return iArr2;
    }

    static int i(int i3) {
        if (48 <= i3 && i3 <= 57) {
            return i3 - 48;
        }
        if (97 <= i3 && i3 <= 102) {
            return i3 - 87;
        }
        if (65 > i3 || i3 > 70) {
            return -1;
        }
        return i3 - 55;
    }
}
