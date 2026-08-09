package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public class zzaex {
    private zzaex() {
    }

    public static Object zza(String str, Type type) throws zzacn {
        if (type == String.class) {
            try {
                zzagt zzagtVar = (zzagt) new zzagt().zza(str);
                if (zzagtVar.zzb()) {
                    return zzagtVar.zza();
                }
                throw new zzacn("No error message: " + str);
            } catch (Exception e3) {
                throw new zzacn("Json conversion failed! " + e3.getMessage(), e3);
            }
        }
        if (type == Void.class) {
            return null;
        }
        try {
            try {
                return ((zzaez) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0])).zza(str);
            } catch (Exception e4) {
                throw new zzacn("Json conversion failed! " + e4.getMessage(), e4);
            }
        } catch (Exception e5) {
            throw new zzacn("Instantiation of JsonResponse failed! " + String.valueOf(type), e5);
        }
    }
}
