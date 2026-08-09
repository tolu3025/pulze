package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[] f4859a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final byte[] f4860b = {112, 114, 109, 0};

    private static void A(InputStream inputStream) {
        f.h(inputStream);
        int iJ = f.j(inputStream);
        if (iJ == 6 || iJ == 7) {
            return;
        }
        while (iJ > 0) {
            f.j(inputStream);
            for (int iJ2 = f.j(inputStream); iJ2 > 0; iJ2--) {
                f.h(inputStream);
            }
            iJ--;
        }
    }

    static boolean B(OutputStream outputStream, byte[] bArr, e[] eVarArr) throws IOException {
        if (Arrays.equals(bArr, r.f4871a)) {
            N(outputStream, eVarArr);
            return true;
        }
        if (Arrays.equals(bArr, r.f4872b)) {
            M(outputStream, eVarArr);
            return true;
        }
        if (Arrays.equals(bArr, r.f4874d)) {
            K(outputStream, eVarArr);
            return true;
        }
        if (Arrays.equals(bArr, r.f4873c)) {
            L(outputStream, eVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, r.f4875e)) {
            return false;
        }
        J(outputStream, eVarArr);
        return true;
    }

    private static void C(OutputStream outputStream, e eVar) throws IOException {
        int[] iArr = eVar.f4840h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            f.p(outputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
    }

    private static s D(e[] eVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f.p(byteArrayOutputStream, eVarArr.length);
            int i3 = 2;
            for (e eVar : eVarArr) {
                f.q(byteArrayOutputStream, eVar.f4835c);
                f.q(byteArrayOutputStream, eVar.f4836d);
                f.q(byteArrayOutputStream, eVar.f4839g);
                String strJ = j(eVar.f4833a, eVar.f4834b, r.f4871a);
                int iK = f.k(strJ);
                f.p(byteArrayOutputStream, iK);
                i3 = i3 + 14 + iK;
                f.n(byteArrayOutputStream, strJ);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i3 == byteArray.length) {
                s sVar = new s(g.DEX_FILES, i3, byteArray, false);
                byteArrayOutputStream.close();
                return sVar;
            }
            throw f.c("Expected size " + i3 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static void E(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f4859a);
        outputStream.write(bArr);
    }

    private static void F(OutputStream outputStream, e eVar) throws IOException {
        I(outputStream, eVar);
        C(outputStream, eVar);
        H(outputStream, eVar);
    }

    private static void G(OutputStream outputStream, e eVar, String str) throws IOException {
        f.p(outputStream, f.k(str));
        f.p(outputStream, eVar.f4837e);
        f.q(outputStream, eVar.f4838f);
        f.q(outputStream, eVar.f4835c);
        f.q(outputStream, eVar.f4839g);
        f.n(outputStream, str);
    }

    private static void H(OutputStream outputStream, e eVar) throws IOException {
        byte[] bArr = new byte[k(eVar.f4839g)];
        for (Map.Entry entry : eVar.f4841i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                z(bArr, 2, iIntValue, eVar);
            }
            if ((iIntValue2 & 4) != 0) {
                z(bArr, 4, iIntValue, eVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void I(OutputStream outputStream, e eVar) throws IOException {
        int i3 = 0;
        for (Map.Entry entry : eVar.f4841i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                f.p(outputStream, iIntValue - i3);
                f.p(outputStream, 0);
                i3 = iIntValue;
            }
        }
    }

    private static void J(OutputStream outputStream, e[] eVarArr) throws IOException {
        f.p(outputStream, eVarArr.length);
        for (e eVar : eVarArr) {
            String strJ = j(eVar.f4833a, eVar.f4834b, r.f4875e);
            f.p(outputStream, f.k(strJ));
            f.p(outputStream, eVar.f4841i.size());
            f.p(outputStream, eVar.f4840h.length);
            f.q(outputStream, eVar.f4835c);
            f.n(outputStream, strJ);
            Iterator it = eVar.f4841i.keySet().iterator();
            while (it.hasNext()) {
                f.p(outputStream, ((Integer) it.next()).intValue());
            }
            for (int i3 : eVar.f4840h) {
                f.p(outputStream, i3);
            }
        }
    }

    private static void K(OutputStream outputStream, e[] eVarArr) throws IOException {
        f.r(outputStream, eVarArr.length);
        for (e eVar : eVarArr) {
            int size = eVar.f4841i.size() * 4;
            String strJ = j(eVar.f4833a, eVar.f4834b, r.f4874d);
            f.p(outputStream, f.k(strJ));
            f.p(outputStream, eVar.f4840h.length);
            f.q(outputStream, size);
            f.q(outputStream, eVar.f4835c);
            f.n(outputStream, strJ);
            Iterator it = eVar.f4841i.keySet().iterator();
            while (it.hasNext()) {
                f.p(outputStream, ((Integer) it.next()).intValue());
                f.p(outputStream, 0);
            }
            for (int i3 : eVar.f4840h) {
                f.p(outputStream, i3);
            }
        }
    }

    private static void L(OutputStream outputStream, e[] eVarArr) throws IOException {
        byte[] bArrB = b(eVarArr, r.f4873c);
        f.r(outputStream, eVarArr.length);
        f.m(outputStream, bArrB);
    }

    private static void M(OutputStream outputStream, e[] eVarArr) throws IOException {
        byte[] bArrB = b(eVarArr, r.f4872b);
        f.r(outputStream, eVarArr.length);
        f.m(outputStream, bArrB);
    }

    private static void N(OutputStream outputStream, e[] eVarArr) throws IOException {
        O(outputStream, eVarArr);
    }

    private static void O(OutputStream outputStream, e[] eVarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(eVarArr));
        arrayList.add(c(eVarArr));
        arrayList.add(d(eVarArr));
        long length2 = ((long) r.f4871a.length) + ((long) f4859a.length) + 4 + ((long) (arrayList.size() * 16));
        f.q(outputStream, arrayList.size());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            s sVar = (s) arrayList.get(i3);
            f.q(outputStream, sVar.f4878a.e());
            f.q(outputStream, length2);
            if (sVar.f4881d) {
                byte[] bArr = sVar.f4880c;
                long length3 = bArr.length;
                byte[] bArrB = f.b(bArr);
                arrayList2.add(bArrB);
                f.q(outputStream, bArrB.length);
                f.q(outputStream, length3);
                length = bArrB.length;
            } else {
                arrayList2.add(sVar.f4880c);
                f.q(outputStream, sVar.f4880c.length);
                f.q(outputStream, 0L);
                length = sVar.f4880c.length;
            }
            length2 += (long) length;
        }
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            outputStream.write((byte[]) arrayList2.get(i4));
        }
    }

    private static int a(e eVar) {
        Iterator it = eVar.f4841i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
        }
        return iIntValue;
    }

    private static byte[] b(e[] eVarArr, byte[] bArr) throws IOException {
        int i3 = 0;
        int iK = 0;
        for (e eVar : eVarArr) {
            iK += f.k(j(eVar.f4833a, eVar.f4834b, bArr)) + 16 + (eVar.f4837e * 2) + eVar.f4838f + k(eVar.f4839g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iK);
        if (Arrays.equals(bArr, r.f4873c)) {
            int length = eVarArr.length;
            while (i3 < length) {
                e eVar2 = eVarArr[i3];
                G(byteArrayOutputStream, eVar2, j(eVar2.f4833a, eVar2.f4834b, bArr));
                F(byteArrayOutputStream, eVar2);
                i3++;
            }
        } else {
            for (e eVar3 : eVarArr) {
                G(byteArrayOutputStream, eVar3, j(eVar3.f4833a, eVar3.f4834b, bArr));
            }
            int length2 = eVarArr.length;
            while (i3 < length2) {
                F(byteArrayOutputStream, eVarArr[i3]);
                i3++;
            }
        }
        if (byteArrayOutputStream.size() == iK) {
            return byteArrayOutputStream.toByteArray();
        }
        throw f.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iK);
    }

    private static s c(e[] eVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i3 = 0;
        for (int i4 = 0; i4 < eVarArr.length; i4++) {
            try {
                e eVar = eVarArr[i4];
                f.p(byteArrayOutputStream, i4);
                f.p(byteArrayOutputStream, eVar.f4837e);
                i3 = i3 + 4 + (eVar.f4837e * 2);
                C(byteArrayOutputStream, eVar);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i3 == byteArray.length) {
            s sVar = new s(g.CLASSES, i3, byteArray, true);
            byteArrayOutputStream.close();
            return sVar;
        }
        throw f.c("Expected size " + i3 + ", does not match actual size " + byteArray.length);
    }

    private static s d(e[] eVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i3 = 0;
        for (int i4 = 0; i4 < eVarArr.length; i4++) {
            try {
                e eVar = eVarArr[i4];
                int iA = a(eVar);
                byte[] bArrE = e(eVar);
                byte[] bArrF = f(eVar);
                f.p(byteArrayOutputStream, i4);
                int length = bArrE.length + 2 + bArrF.length;
                f.q(byteArrayOutputStream, length);
                f.p(byteArrayOutputStream, iA);
                byteArrayOutputStream.write(bArrE);
                byteArrayOutputStream.write(bArrF);
                i3 = i3 + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i3 == byteArray.length) {
            s sVar = new s(g.METHODS, i3, byteArray, true);
            byteArrayOutputStream.close();
            return sVar;
        }
        throw f.c("Expected size " + i3 + ", does not match actual size " + byteArray.length);
    }

    private static byte[] e(e eVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, eVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] f(e eVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, eVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static String g(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    private static String h(String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    private static e i(e[] eVarArr, String str) {
        if (eVarArr.length <= 0) {
            return null;
        }
        String strH = h(str);
        for (int i3 = 0; i3 < eVarArr.length; i3++) {
            if (eVarArr[i3].f4834b.equals(strH)) {
                return eVarArr[i3];
            }
        }
        return null;
    }

    private static String j(String str, String str2, byte[] bArr) {
        String strA = r.a(bArr);
        if (str.length() <= 0) {
            return g(str2, strA);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, strA);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + r.a(bArr) + str2;
    }

    private static int k(int i3) {
        return y(i3 * 2) / 8;
    }

    private static int l(int i3, int i4, int i5) {
        if (i3 == 1) {
            throw f.c("HOT methods are not stored in the bitmap");
        }
        if (i3 == 2) {
            return i4;
        }
        if (i3 == 4) {
            return i4 + i5;
        }
        throw f.c("Unexpected flag: " + i3);
    }

    private static int[] m(InputStream inputStream, int i3) {
        int[] iArr = new int[i3];
        int iH = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            iH += f.h(inputStream);
            iArr[i4] = iH;
        }
        return iArr;
    }

    private static int n(BitSet bitSet, int i3, int i4) {
        int i5 = bitSet.get(l(2, i3, i4)) ? 2 : 0;
        return bitSet.get(l(4, i3, i4)) ? i5 | 4 : i5;
    }

    static byte[] o(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, f.d(inputStream, bArr.length))) {
            return f.d(inputStream, r.f4872b.length);
        }
        throw f.c("Invalid magic");
    }

    private static void p(InputStream inputStream, e eVar) {
        int iAvailable = inputStream.available() - eVar.f4838f;
        int iH = 0;
        while (inputStream.available() > iAvailable) {
            iH += f.h(inputStream);
            eVar.f4841i.put(Integer.valueOf(iH), 1);
            for (int iH2 = f.h(inputStream); iH2 > 0; iH2--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw f.c("Read too much data during profile line parse");
        }
    }

    static e[] q(InputStream inputStream, byte[] bArr, byte[] bArr2, e[] eVarArr) {
        if (Arrays.equals(bArr, r.f4876f)) {
            if (Arrays.equals(r.f4871a, bArr2)) {
                throw f.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return r(inputStream, bArr, eVarArr);
        }
        if (Arrays.equals(bArr, r.f4877g)) {
            return t(inputStream, bArr2, eVarArr);
        }
        throw f.c("Unsupported meta version");
    }

    static e[] r(InputStream inputStream, byte[] bArr, e[] eVarArr) throws IOException {
        if (!Arrays.equals(bArr, r.f4876f)) {
            throw f.c("Unsupported meta version");
        }
        int iJ = f.j(inputStream);
        byte[] bArrE = f.e(inputStream, (int) f.i(inputStream), (int) f.i(inputStream));
        if (inputStream.read() > 0) {
            throw f.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            e[] eVarArrS = s(byteArrayInputStream, iJ, eVarArr);
            byteArrayInputStream.close();
            return eVarArrS;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static e[] s(InputStream inputStream, int i3, e[] eVarArr) {
        if (inputStream.available() == 0) {
            return new e[0];
        }
        if (i3 != eVarArr.length) {
            throw f.c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i3];
        int[] iArr = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int iH = f.h(inputStream);
            iArr[i4] = f.h(inputStream);
            strArr[i4] = f.f(inputStream, iH);
        }
        for (int i5 = 0; i5 < i3; i5++) {
            e eVar = eVarArr[i5];
            if (!eVar.f4834b.equals(strArr[i5])) {
                throw f.c("Order of dexfiles in metadata did not match baseline");
            }
            int i6 = iArr[i5];
            eVar.f4837e = i6;
            eVar.f4840h = m(inputStream, i6);
        }
        return eVarArr;
    }

    static e[] t(InputStream inputStream, byte[] bArr, e[] eVarArr) throws IOException {
        int iH = f.h(inputStream);
        byte[] bArrE = f.e(inputStream, (int) f.i(inputStream), (int) f.i(inputStream));
        if (inputStream.read() > 0) {
            throw f.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            e[] eVarArrU = u(byteArrayInputStream, bArr, iH, eVarArr);
            byteArrayInputStream.close();
            return eVarArrU;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static e[] u(InputStream inputStream, byte[] bArr, int i3, e[] eVarArr) {
        if (inputStream.available() == 0) {
            return new e[0];
        }
        if (i3 != eVarArr.length) {
            throw f.c("Mismatched number of dex files found in metadata");
        }
        for (int i4 = 0; i4 < i3; i4++) {
            f.h(inputStream);
            String strF = f.f(inputStream, f.h(inputStream));
            long jI = f.i(inputStream);
            int iH = f.h(inputStream);
            e eVarI = i(eVarArr, strF);
            if (eVarI == null) {
                throw f.c("Missing profile key: " + strF);
            }
            eVarI.f4836d = jI;
            int[] iArrM = m(inputStream, iH);
            if (Arrays.equals(bArr, r.f4875e)) {
                eVarI.f4837e = iH;
                eVarI.f4840h = iArrM;
            }
        }
        return eVarArr;
    }

    private static void v(InputStream inputStream, e eVar) {
        BitSet bitSetValueOf = BitSet.valueOf(f.d(inputStream, f.a(eVar.f4839g * 2)));
        int i3 = 0;
        while (true) {
            int i4 = eVar.f4839g;
            if (i3 >= i4) {
                return;
            }
            int iN = n(bitSetValueOf, i3, i4);
            if (iN != 0) {
                Integer num = (Integer) eVar.f4841i.get(Integer.valueOf(i3));
                if (num == null) {
                    num = 0;
                }
                eVar.f4841i.put(Integer.valueOf(i3), Integer.valueOf(iN | num.intValue()));
            }
            i3++;
        }
    }

    static e[] w(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, r.f4872b)) {
            throw f.c("Unsupported version");
        }
        int iJ = f.j(inputStream);
        byte[] bArrE = f.e(inputStream, (int) f.i(inputStream), (int) f.i(inputStream));
        if (inputStream.read() > 0) {
            throw f.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            e[] eVarArrX = x(byteArrayInputStream, str, iJ);
            byteArrayInputStream.close();
            return eVarArrX;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static e[] x(InputStream inputStream, String str, int i3) {
        if (inputStream.available() == 0) {
            return new e[0];
        }
        e[] eVarArr = new e[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int iH = f.h(inputStream);
            int iH2 = f.h(inputStream);
            eVarArr[i4] = new e(str, f.f(inputStream, iH), f.i(inputStream), 0L, iH2, (int) f.i(inputStream), (int) f.i(inputStream), new int[iH2], new TreeMap());
        }
        for (int i5 = 0; i5 < i3; i5++) {
            e eVar = eVarArr[i5];
            p(inputStream, eVar);
            eVar.f4840h = m(inputStream, eVar.f4837e);
            v(inputStream, eVar);
        }
        return eVarArr;
    }

    private static int y(int i3) {
        return (i3 + 7) & (-8);
    }

    private static void z(byte[] bArr, int i3, int i4, e eVar) {
        int iL = l(i3, i4, eVar.f4839g);
        int i5 = iL / 8;
        bArr[i5] = (byte) ((1 << (iL % 8)) | bArr[i5]);
    }
}
