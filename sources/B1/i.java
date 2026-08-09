package B1;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public enum i {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f715a;

    i(String str) {
        this.f715a = str;
    }

    public static i c(String str) throws IOException {
        i iVar = HTTP_1_0;
        if (str.equals(iVar.f715a)) {
            return iVar;
        }
        i iVar2 = HTTP_1_1;
        if (str.equals(iVar2.f715a)) {
            return iVar2;
        }
        i iVar3 = HTTP_2;
        if (str.equals(iVar3.f715a)) {
            return iVar3;
        }
        i iVar4 = SPDY_3;
        if (str.equals(iVar4.f715a)) {
            return iVar4;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f715a;
    }
}
