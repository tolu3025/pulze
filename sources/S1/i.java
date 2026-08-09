package S1;

import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final long a(Reader reader, Writer out, int i3) throws IOException {
        m.e(reader, "<this>");
        m.e(out, "out");
        char[] cArr = new char[i3];
        int i4 = reader.read(cArr);
        long j3 = 0;
        while (i4 >= 0) {
            out.write(cArr, 0, i4);
            j3 += (long) i4;
            i4 = reader.read(cArr);
        }
        return j3;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 8192;
        }
        return a(reader, writer, i3);
    }

    public static final String c(Reader reader) {
        m.e(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        m.d(string, "toString(...)");
        return string;
    }
}
