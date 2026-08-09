package N;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            int iDataPosition = parcel.dataPosition();
            int iDataSize = parcel.dataSize();
            int length = String.valueOf(str).length();
            StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(iDataPosition).length() + 6 + String.valueOf(iDataSize).length());
            sb.append(str);
            sb.append(" Parcel: pos=");
            sb.append(iDataPosition);
            sb.append(" size=");
            sb.append(iDataSize);
            super(sb.toString());
        }
    }

    public static float A(Parcel parcel, int i3) {
        L(parcel, i3, 4);
        return parcel.readFloat();
    }

    public static int B(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder C(Parcel parcel, int i3) {
        int I2 = I(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (I2 == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + I2);
        return strongBinder;
    }

    public static int D(Parcel parcel, int i3) {
        L(parcel, i3, 4);
        return parcel.readInt();
    }

    public static Integer E(Parcel parcel, int i3) {
        int I2 = I(parcel, i3);
        if (I2 == 0) {
            return null;
        }
        M(parcel, i3, I2, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long F(Parcel parcel, int i3) {
        L(parcel, i3, 8);
        return parcel.readLong();
    }

    public static Long G(Parcel parcel, int i3) {
        int I2 = I(parcel, i3);
        if (I2 == 0) {
            return null;
        }
        M(parcel, i3, I2, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static short H(Parcel parcel, int i3) {
        L(parcel, i3, 4);
        return (short) parcel.readInt();
    }

    public static int I(Parcel parcel, int i3) {
        return (i3 & (-65536)) != -65536 ? (char) (i3 >> 16) : parcel.readInt();
    }

    public static void J(Parcel parcel, int i3) {
        parcel.setDataPosition(parcel.dataPosition() + I(parcel, i3));
    }

    public static int K(Parcel parcel) {
        int iB = B(parcel);
        int I2 = I(parcel, iB);
        int iV = v(iB);
        int iDataPosition = parcel.dataPosition();
        if (iV != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iB))), parcel);
        }
        int i3 = I2 + iDataPosition;
        if (i3 >= iDataPosition && i3 <= parcel.dataSize()) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i3).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i3);
        throw new a(sb.toString(), parcel);
    }

    private static void L(Parcel parcel, int i3, int i4) {
        int I2 = I(parcel, i3);
        if (I2 == i4) {
            return;
        }
        String hexString = Integer.toHexString(I2);
        int length = String.valueOf(i4).length();
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(I2).length() + 4 + String.valueOf(hexString).length() + 1);
        sb.append("Expected size ");
        sb.append(i4);
        sb.append(" got ");
        sb.append(I2);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }

    private static void M(Parcel parcel, int i3, int i4, int i5) {
        if (i4 == i5) {
            return;
        }
        String hexString = Integer.toHexString(i4);
        int length = String.valueOf(i5).length();
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(i4).length() + 4 + String.valueOf(hexString).length() + 1);
        sb.append("Expected size ");
        sb.append(i5);
        sb.append(" got ");
        sb.append(i4);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }

    public static BigDecimal a(Parcel parcel, int i3) {
        int I2 = I(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (I2 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i4 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + I2);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i4);
    }

    public static BigDecimal[] b(Parcel parcel, int i3) {
        int I2 = I(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (I2 == 0) {
            return null;
        }
        int i4 = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            byte[] bArrCreateByteArray = parcel.createByteArray();
            bigDecimalArr[i5] = new BigDecimal(new BigInteger(bArrCreateByteArray), parcel.readInt());
        }
        parcel.setDataPosition(iDataPosition + I2);
        return bigDecimalArr;
    }

    public static BigInteger c(Parcel parcel, int i3) {
        int I2 = I(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (I2 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + I2);
        return new BigInteger(bArrCreateByteArray);
    }

    public static BigInteger[] d(Parcel parcel, int i3) {
        int I2 = I(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (I2 == 0) {
            return null;
        }
        int i4 = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bigIntegerArr[i5] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(iDataPosition + I2);
        return bigIntegerArr;
    }

    public static boolean[] e(Parcel parcel, int i3) {
        int I2 = I(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (I2 == 0) {
            return null;
        }
        boolean[] zArrCreateBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(iDataPosition + I2);
        return zArrCreateBooleanArray;
    }

    public static Bundle f(Parcel parcel, int i3) {
        int I2 = I(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (I2 == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + I2);
        return bundle;
    }

    public static byte[] g(Parcel parcel, int i3) {
        int I2 = I(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (I2 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + I2);
        return bArrCreateByteArray;
    }

    public static byte[][] h(Parcel parcel, int i3) {
        int I2 = I(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (I2 == 0) {
            return null;
        }
        int i4 = parcel.readInt();
        byte[][] bArr = new byte[i4][];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[i5] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + I2);
        return bArr;
    }

    public static double[] i(Parcel parcel, int i3) {
        int I2 = I(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (I2 == 0) {
            return null;
        }
        double[] dArrCreateDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(iDataPosition + I2);
        return dArrCreateDoubleArray;
    }

    public static float[] j(Parcel parcel, int i3) {
        int I2 = I(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (I2 == 0) {
            return null;
        }
        float[] fArrCreateFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(iDataPosition + I2);
        return fArrCreateFloatArray;
    }

    public static int[] k(Parcel parcel, int i3) {
        int I2 = I(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (I2 == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + I2);
        return iArrCreateIntArray;
    }

    public static long[] l(Parcel parcel, int i3) {
        int I2 = I(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (I2 == 0) {
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(iDataPosition + I2);
        return jArrCreateLongArray;
    }

    public static Parcel m(Parcel parcel, int i3) {
        int I2 = I(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (I2 == 0) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.appendFrom(parcel, iDataPosition, I2);
        parcel.setDataPosition(iDataPosition + I2);
        return parcelObtain;
    }

    public static Parcel[] n(Parcel parcel, int i3) {
        int I2 = I(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (I2 == 0) {
            return null;
        }
        int i4 = parcel.readInt();
        Parcel[] parcelArr = new Parcel[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = parcel.readInt();
            if (i6 != 0) {
                int iDataPosition2 = parcel.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, iDataPosition2, i6);
                parcelArr[i5] = parcelObtain;
                parcel.setDataPosition(iDataPosition2 + i6);
            } else {
                parcelArr[i5] = null;
            }
        }
        parcel.setDataPosition(iDataPosition + I2);
        return parcelArr;
    }

    public static Parcelable o(Parcel parcel, int i3, Parcelable.Creator creator) {
        int I2 = I(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (I2 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + I2);
        return parcelable;
    }

    public static String p(Parcel parcel, int i3) {
        int I2 = I(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (I2 == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + I2);
        return string;
    }

    public static String[] q(Parcel parcel, int i3) {
        int I2 = I(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (I2 == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + I2);
        return strArrCreateStringArray;
    }

    public static ArrayList r(Parcel parcel, int i3) {
        int I2 = I(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (I2 == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + I2);
        return arrayListCreateStringArrayList;
    }

    public static Object[] s(Parcel parcel, int i3, Parcelable.Creator creator) {
        int I2 = I(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (I2 == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + I2);
        return objArrCreateTypedArray;
    }

    public static ArrayList t(Parcel parcel, int i3, Parcelable.Creator creator) {
        int I2 = I(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (I2 == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + I2);
        return arrayListCreateTypedArrayList;
    }

    public static void u(Parcel parcel, int i3) {
        if (parcel.dataPosition() == i3) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 26);
        sb.append("Overread allowed size end=");
        sb.append(i3);
        throw new a(sb.toString(), parcel);
    }

    public static int v(int i3) {
        return (char) i3;
    }

    public static boolean w(Parcel parcel, int i3) {
        L(parcel, i3, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean x(Parcel parcel, int i3) {
        int I2 = I(parcel, i3);
        if (I2 == 0) {
            return null;
        }
        M(parcel, i3, I2, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static double y(Parcel parcel, int i3) {
        L(parcel, i3, 8);
        return parcel.readDouble();
    }

    public static Double z(Parcel parcel, int i3) {
        int I2 = I(parcel, i3);
        if (I2 == 0) {
            return null;
        }
        M(parcel, i3, I2, 8);
        return Double.valueOf(parcel.readDouble());
    }
}
