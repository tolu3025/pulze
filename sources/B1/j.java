package B1;

import java.net.ProtocolException;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f718c;

    public j(i iVar, int i3, String str) {
        this.f716a = iVar;
        this.f717b = i3;
        this.f718c = str;
    }

    public static j a(String str) throws ProtocolException {
        i iVar;
        int i3;
        String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i3 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                iVar = i.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                iVar = i.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            iVar = i.HTTP_1_0;
            i3 = 4;
        }
        int i4 = i3 + 3;
        if (str.length() < i4) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            int i5 = Integer.parseInt(str.substring(i3, i4));
            if (str.length() <= i4) {
                strSubstring = "";
            } else {
                if (str.charAt(i4) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                strSubstring = str.substring(i3 + 4);
            }
            return new j(iVar, i5, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f716a == i.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f717b);
        if (this.f718c != null) {
            sb.append(' ');
            sb.append(this.f718c);
        }
        return sb.toString();
    }
}
