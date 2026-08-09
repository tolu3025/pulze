package com.google.android.recaptcha.internal;

import V0.F;
import V0.I;

/* JADX INFO: loaded from: classes.dex */
final class zzpg {
    static String zza(zzle zzleVar) {
        String str;
        StringBuilder sb = new StringBuilder(zzleVar.zzd());
        for (int i3 = 0; i3 < zzleVar.zzd(); i3++) {
            int iZza = zzleVar.zza(i3);
            if (iZza == 34) {
                str = "\\\"";
            } else if (iZza == 39) {
                str = "\\'";
            } else if (iZza != 92) {
                switch (iZza) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                        str = "\\t";
                        break;
                    case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iZza < 32 || iZza > 126) {
                            sb.append('\\');
                            sb.append((char) (((iZza >>> 6) & 3) + 48));
                            sb.append((char) (((iZza >>> 3) & 7) + 48));
                            iZza = (iZza & 7) + 48;
                        }
                        sb.append((char) iZza);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
