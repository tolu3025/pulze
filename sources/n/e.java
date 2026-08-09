package N;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static d a(byte[] bArr, Parcelable.Creator creator) {
        AbstractC0643s.k(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        d dVar = (d) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return dVar;
    }

    public static d b(Intent intent, String str, Parcelable.Creator creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return a(byteArrayExtra, creator);
    }

    public static d c(String str, Parcelable.Creator creator) {
        return a(com.google.android.gms.common.util.c.a(str), creator);
    }

    public static byte[] d(d dVar) {
        Parcel parcelObtain = Parcel.obtain();
        dVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static void e(d dVar, Intent intent, String str) {
        intent.putExtra(str, d(dVar));
    }

    public static String f(d dVar) {
        return com.google.android.gms.common.util.c.d(d(dVar));
    }
}
