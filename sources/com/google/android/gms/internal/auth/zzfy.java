package com.google.android.gms.internal.auth;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
final class zzfy {
    static String zza(zzfw zzfwVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzfwVar, sb, 0);
        return sb.toString();
    }

    static final void zzb(StringBuilder sb, int i3, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i3, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i3, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(zzgw.zza(zzee.zzl((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzee) {
            sb.append(": \"");
            sb.append(zzgw.zza((zzee) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzeu) {
            sb.append(" {");
            zzd((zzeu) obj, sb, i3 + 2);
            sb.append("\n");
            while (i4 < i3) {
                sb.append(' ');
                i4++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i6 = i3 + 2;
        zzb(sb, i6, "key", entry.getKey());
        zzb(sb, i6, "value", entry.getValue());
        sb.append("\n");
        while (i4 < i3) {
            sb.append(' ');
            i4++;
        }
        sb.append("}");
    }

    private static final String zzc(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    private static void zzd(zzfw zzfwVar, StringBuilder sb, int i3) {
        Object obj;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : zzfwVar.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String strConcat = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(String.valueOf(strSubstring.substring(1, strSubstring.length() - 4)));
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb, i3, zzc(strConcat), zzeu.zze(method2, zzfwVar, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String strConcat2 = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(String.valueOf(strSubstring.substring(1, strSubstring.length() - 3)));
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb, i3, zzc(strConcat2), zzeu.zze(method3, zzfwVar, new Object[0]));
                }
            }
            if (((Method) map2.get("set".concat(strSubstring))) != null && (!strSubstring.endsWith("Bytes") || !map.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                String strConcat3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(String.valueOf(strSubstring.substring(1)));
                Method method4 = (Method) map.get("get".concat(strSubstring));
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZze = zzeu.zze(method4, zzfwVar, new Object[0]);
                    if (method5 == null) {
                        if (objZze instanceof Boolean) {
                            if (((Boolean) objZze).booleanValue()) {
                                zzb(sb, i3, zzc(strConcat3), objZze);
                            }
                        } else if (objZze instanceof Integer) {
                            if (((Integer) objZze).intValue() != 0) {
                                zzb(sb, i3, zzc(strConcat3), objZze);
                            }
                        } else if (objZze instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZze).floatValue()) != 0) {
                                zzb(sb, i3, zzc(strConcat3), objZze);
                            }
                        } else if (!(objZze instanceof Double)) {
                            if (objZze instanceof String) {
                                obj = "";
                            } else if (objZze instanceof zzee) {
                                obj = zzee.zzb;
                            } else if (objZze instanceof zzfw) {
                                if (objZze != ((zzfw) objZze).zzh()) {
                                    zzb(sb, i3, zzc(strConcat3), objZze);
                                }
                            } else if (!(objZze instanceof Enum) || ((Enum) objZze).ordinal() != 0) {
                                zzb(sb, i3, zzc(strConcat3), objZze);
                            }
                            if (!objZze.equals(obj)) {
                                zzb(sb, i3, zzc(strConcat3), objZze);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZze).doubleValue()) != 0) {
                            zzb(sb, i3, zzc(strConcat3), objZze);
                        }
                    } else if (((Boolean) zzeu.zze(method5, zzfwVar, new Object[0])).booleanValue()) {
                        zzb(sb, i3, zzc(strConcat3), objZze);
                    }
                }
            }
        }
        if (zzfwVar instanceof zzet) {
            throw null;
        }
        zzgz zzgzVar = ((zzeu) zzfwVar).zzc;
        if (zzgzVar != null) {
            zzgzVar.zze(sb, i3);
        }
    }
}
