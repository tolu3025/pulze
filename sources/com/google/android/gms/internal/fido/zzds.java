package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.io.InputStream;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
final class zzds {
    static final zzdr zza(InputStream inputStream, zzdu zzduVar) {
        try {
            return zzb(inputStream, zzduVar);
        } finally {
            try {
                zzduVar.close();
            } catch (IOException unused) {
            }
        }
    }

    private static final zzdr zzb(InputStream inputStream, zzdu zzduVar) throws zzdl {
        try {
            zzdt zzdtVarZzd = zzduVar.zzd();
            if (zzdtVarZzd == null) {
                throw new zzdl("Parser being asked to parse an empty input stream");
            }
            try {
                byte bZza = zzdtVarZzd.zza();
                byte bZzb = zzdtVarZzd.zzb();
                int i3 = 0;
                if (bZzb == -128) {
                    long jZza = zzduVar.zza();
                    if (jZza > 1000) {
                        throw new zzdl("Parser being asked to read a large CBOR array");
                    }
                    zzc(bZza, jZza, inputStream, zzduVar);
                    zzdr[] zzdrVarArr = new zzdr[(int) jZza];
                    while (i3 < jZza) {
                        zzdrVarArr[i3] = zzb(inputStream, zzduVar);
                        i3++;
                    }
                    return new zzdi(zzaz.zzi(zzdrVarArr));
                }
                if (bZzb != -96) {
                    if (bZzb == -64) {
                        throw new zzdl("Tags are currently unsupported");
                    }
                    if (bZzb == -32) {
                        return new zzdj(zzduVar.zzf());
                    }
                    if (bZzb == 0 || bZzb == 32) {
                        long jZzb = zzduVar.zzb();
                        zzc(bZza, jZzb > 0 ? jZzb : ~jZzb, inputStream, zzduVar);
                        return new zzdm(jZzb);
                    }
                    if (bZzb == 64) {
                        byte[] bArrZzg = zzduVar.zzg();
                        int length = bArrZzg.length;
                        zzc(bZza, length, inputStream, zzduVar);
                        return new zzdk(zzcz.zzl(bArrZzg, 0, length));
                    }
                    if (bZzb == 96) {
                        String strZze = zzduVar.zze();
                        zzc(bZza, strZze.length(), inputStream, zzduVar);
                        return new zzdp(strZze);
                    }
                    throw new zzdl("Unidentifiable major type: " + zzdtVarZzd.zzc());
                }
                long jZzc = zzduVar.zzc();
                if (jZzc > 1000) {
                    throw new zzdl("Parser being asked to read a large CBOR map");
                }
                zzc(bZza, jZzc, inputStream, zzduVar);
                int i4 = (int) jZzc;
                zzdn[] zzdnVarArr = new zzdn[i4];
                zzdr zzdrVar = null;
                int i5 = 0;
                while (i5 < jZzc) {
                    zzdr zzdrVarZzb = zzb(inputStream, zzduVar);
                    if (zzdrVar != null && zzdrVarZzb.compareTo(zzdrVar) <= 0) {
                        throw new zzdh(String.format("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: %s\nCurrent key: %s", zzdrVar.toString(), zzdrVarZzb.toString()));
                    }
                    zzdnVarArr[i5] = new zzdn(zzdrVarZzb, zzb(inputStream, zzduVar));
                    i5++;
                    zzdrVar = zzdrVarZzb;
                }
                TreeMap treeMap = new TreeMap();
                while (i3 < i4) {
                    zzdn zzdnVar = zzdnVarArr[i3];
                    if (treeMap.containsKey(zzdnVar.zza())) {
                        throw new zzdh("Attempted to add duplicate key to canonical CBOR Map.");
                    }
                    treeMap.put(zzdnVar.zza(), zzdnVar.zzb());
                    i3++;
                }
                return new zzdo(zzbg.zzf(treeMap));
            } catch (IOException e3) {
                e = e3;
                throw new zzdl("Error in decoding CborValue from bytes", e);
            } catch (RuntimeException e4) {
                e = e4;
                throw new zzdl("Error in decoding CborValue from bytes", e);
            }
        } catch (IOException e5) {
            throw new zzdl("Error in decoding CborValue from bytes", e5);
        }
    }

    private static final void zzc(byte b3, long j3, InputStream inputStream, zzdu zzduVar) throws zzdh {
        switch (b3) {
            case 24:
                if (j3 >= 24) {
                    return;
                }
                throw new zzdh("Integer value " + j3 + " after add info could have been represented in 0 additional bytes, but used 1");
            case 25:
                if (j3 >= 256) {
                    return;
                }
                throw new zzdh("Integer value " + j3 + " after add info could have been represented in 0-1 additional bytes, but used 2");
            case 26:
                if (j3 >= 65536) {
                    return;
                }
                throw new zzdh("Integer value " + j3 + " after add info could have been represented in 0-2 additional bytes, but used 4");
            case 27:
                if (j3 >= 4294967296L) {
                    return;
                }
                throw new zzdh("Integer value " + j3 + " after add info could have been represented in 0-4 additional bytes, but used 8");
            default:
                return;
        }
    }
}
