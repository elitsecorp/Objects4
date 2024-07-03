package elicorp.pilot;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class supabase_databaseselect extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "elicorp.pilot.supabase_databaseselect");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", elicorp.pilot.supabase_databaseselect.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public elicorp.pilot.supabase _m_supabase = null;
public String _m_tablename = "";
public String _m_columns = "";
public anywheresoftware.b4a.objects.collections.List _m_wherelist = null;
public String _m_orderby = "";
public String _m_range = "";
public int _m_limit = 0;
public int _m_offset = 0;
public anywheresoftware.b4a.objects.StringUtils _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public b4a.example.dateutils _vvvvvvvvvvv0 = null;
public elicorp.pilot.main _vvvvvvvvvvvv1 = null;
public elicorp.pilot.starter _vvvvvvvvvvvv2 = null;
public elicorp.pilot.httputils2service _vvvvvvvvvvvv3 = null;
public elicorp.pilot.b4xpages _vvvvvvvvvvvv4 = null;
public elicorp.pilot.b4xcollections _vvvvvvvvvvvv5 = null;
public elicorp.pilot.dbutils _vvvvvvvvvvvv6 = null;
public elicorp.pilot.xuiviewsutils _vvvvvvvvvvvv7 = null;
public elicorp.pilot.supabase_functions _supabase_functions = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private m_Supabase As Supabase";
_m_supabase = new elicorp.pilot.supabase();
 //BA.debugLineNum = 5;BA.debugLine="Private m_TableName As String";
_m_tablename = "";
 //BA.debugLineNum = 6;BA.debugLine="Private m_Columns As String";
_m_columns = "";
 //BA.debugLineNum = 7;BA.debugLine="Private m_WhereList As List";
_m_wherelist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 8;BA.debugLine="Private m_OrderBy As String";
_m_orderby = "";
 //BA.debugLineNum = 9;BA.debugLine="Private m_Range As String";
_m_range = "";
 //BA.debugLineNum = 10;BA.debugLine="Private m_Limit As Int = 0";
_m_limit = (int) (0);
 //BA.debugLineNum = 11;BA.debugLine="Private m_Offset As Int";
_m_offset = 0;
 //BA.debugLineNum = 16;BA.debugLine="Private str As StringUtils";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.StringUtils();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.supabase_databaseselect  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(String _column) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Public Sub Columns(Column As String) As Supabase_D";
 //BA.debugLineNum = 26;BA.debugLine="m_Columns = Column";
_m_columns = _column;
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_databaseselect)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws Exception{
ResumableSub_Execute rsub = new ResumableSub_Execute(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Execute extends BA.ResumableSub {
public ResumableSub_Execute(elicorp.pilot.supabase_databaseselect parent) {
this.parent = parent;
}
elicorp.pilot.supabase_databaseselect parent;
elicorp.pilot.supabase._supabasedatabaseresult _databaseresult = null;
elicorp.pilot.supabase._supabaseerror _databaseerror = null;
String _accesstoken = "";
String _url = "";
int _i = 0;
elicorp.pilot.httpjob _j = null;
String _result = "";
int step15;
int limit15;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 205;BA.debugLine="Dim DatabaseResult As SupabaseDatabaseResult";
_databaseresult = new elicorp.pilot.supabase._supabasedatabaseresult();
 //BA.debugLineNum = 206;BA.debugLine="DatabaseResult.Initialize";
_databaseresult.Initialize();
 //BA.debugLineNum = 207;BA.debugLine="DatabaseResult.Columns.Initialize";
_databaseresult.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 208;BA.debugLine="DatabaseResult.Rows.Initialize";
_databaseresult.Rows /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 209;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 210;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 212;BA.debugLine="Wait For (m_Supabase.Auth.GetAccessToken) Complet";
parent.__c.WaitFor("complete", ba, this, parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 36;
return;
case 36:
//C
this.state = 1;
_accesstoken = (String) result[0];
;
 //BA.debugLineNum = 214;BA.debugLine="If AccessToken = \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_accesstoken).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 215;BA.debugLine="DatabaseError.StatusCode = 401";
_databaseerror.StatusCode /*int*/  = (int) (401);
 //BA.debugLineNum = 216;BA.debugLine="DatabaseError.ErrorMessage = \"Unauthorized\"";
_databaseerror.ErrorMessage /*String*/  = "Unauthorized";
 //BA.debugLineNum = 217;BA.debugLine="Return DatabaseError";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_databaseerror));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 220;BA.debugLine="Dim url As String = \"\"";
_url = "";
 //BA.debugLineNum = 221;BA.debugLine="url = url & $\"${m_Supabase.URL}/rest/v1/${m_Table";
_url = _url+(""+parent.__c.SmartStringFormatter("",(Object)(parent._m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/rest/v1/"+parent.__c.SmartStringFormatter("",(Object)(parent._m_tablename))+"?");
 //BA.debugLineNum = 223;BA.debugLine="For i = 0 To m_WhereList.Size -1";
if (true) break;

case 5:
//for
this.state = 8;
step15 = 1;
limit15 = (int) (parent._m_wherelist.getSize()-1);
_i = (int) (0) ;
this.state = 37;
if (true) break;

case 37:
//C
this.state = 8;
if ((step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15)) this.state = 7;
if (true) break;

case 38:
//C
this.state = 37;
_i = ((int)(0 + _i + step15)) ;
if (true) break;

case 7:
//C
this.state = 38;
 //BA.debugLineNum = 224;BA.debugLine="url = url & \"&\" & m_WhereList.Get(i)";
_url = _url+"&"+BA.ObjectToString(parent._m_wherelist.Get(_i));
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 227;BA.debugLine="If m_OrderBy <> \"\" Then";

case 8:
//if
this.state = 11;
if ((parent._m_orderby).equals("") == false) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 228;BA.debugLine="url = url & \"&\" & \"order=\" & m_OrderBy";
_url = _url+"&"+"order="+parent._m_orderby;
 if (true) break;
;
 //BA.debugLineNum = 232;BA.debugLine="If m_Limit > 0 Then";

case 11:
//if
this.state = 14;
if (parent._m_limit>0) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 233;BA.debugLine="url = url & \"&\" & \"limit=\" & m_Limit";
_url = _url+"&"+"limit="+BA.NumberToString(parent._m_limit);
 if (true) break;
;
 //BA.debugLineNum = 236;BA.debugLine="If m_Offset > 0 Then";

case 14:
//if
this.state = 17;
if (parent._m_offset>0) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 237;BA.debugLine="url = url & \"&\" & \"offset=\" & m_Offset";
_url = _url+"&"+"offset="+BA.NumberToString(parent._m_offset);
 if (true) break;

case 17:
//C
this.state = 18;
;
 //BA.debugLineNum = 240;BA.debugLine="url = url & \"&\" & $\"select=${m_Columns}\"$";
_url = _url+"&"+("select="+parent.__c.SmartStringFormatter("",(Object)(parent._m_columns))+"");
 //BA.debugLineNum = 243;BA.debugLine="url = url.Replace($\"rest/v1/${m_TableName}?&\"$,$\"";
_url = _url.replace(("rest/v1/"+parent.__c.SmartStringFormatter("",(Object)(parent._m_tablename))+"?&"),("rest/v1/"+parent.__c.SmartStringFormatter("",(Object)(parent._m_tablename))+"?"));
 //BA.debugLineNum = 246;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 246;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 247;BA.debugLine="j.Download(url)";
_j._vvvvvvvvvvvvvvvvvvvvv2 /*String*/ (_url);
 //BA.debugLineNum = 248;BA.debugLine="j.GetRequest.SetHeader(\"apikey\",m_Supabase.ApiKey";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("apikey",parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ());
 //BA.debugLineNum = 249;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_accesstoken);
 //BA.debugLineNum = 250;BA.debugLine="If m_Range <> \"\" Then j.GetRequest.SetHeader(\"Ran";
if (true) break;

case 18:
//if
this.state = 23;
if ((parent._m_range).equals("") == false) { 
this.state = 20;
;}if (true) break;

case 20:
//C
this.state = 23;
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Range",parent._m_range);
if (true) break;

case 23:
//C
this.state = 24;
;
 //BA.debugLineNum = 252;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 39;
return;
case 39:
//C
this.state = 24;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 254;BA.debugLine="DatabaseError.Success = j.Success";
_databaseerror.Success /*boolean*/  = _j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ;
 //BA.debugLineNum = 256;BA.debugLine="If j.Success Then";
if (true) break;

case 24:
//if
this.state = 35;
if (_j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ) { 
this.state = 26;
}else {
this.state = 34;
}if (true) break;

case 26:
//C
this.state = 27;
 //BA.debugLineNum = 258;BA.debugLine="Dim Result As String = j.GetString";
_result = _j._vvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ();
 //BA.debugLineNum = 259;BA.debugLine="If Result = \"[]\" Then";
if (true) break;

case 27:
//if
this.state = 32;
if ((_result).equals("[]")) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
 if (true) break;

case 31:
//C
this.state = 32;
 //BA.debugLineNum = 268;BA.debugLine="DatabaseResult = Supabase_Functions.CreateDatab";
_databaseresult = parent._supabase_functions._vvvvvvv0 /*elicorp.pilot.supabase._supabasedatabaseresult*/ (parent.getActivityBA(),_j._vvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ());
 if (true) break;

case 32:
//C
this.state = 35;
;
 if (true) break;

case 34:
//C
this.state = 35;
 //BA.debugLineNum = 273;BA.debugLine="DatabaseError.StatusCode = j.Response.StatusCode";
_databaseerror.StatusCode /*int*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv6 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode();
 //BA.debugLineNum = 274;BA.debugLine="DatabaseError.ErrorMessage = j.ErrorMessage";
_databaseerror.ErrorMessage /*String*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ;
 if (true) break;

case 35:
//C
this.state = -1;
;
 //BA.debugLineNum = 277;BA.debugLine="DatabaseResult.Error = DatabaseError";
_databaseresult.Error /*elicorp.pilot.supabase._supabaseerror*/  = _databaseerror;
 //BA.debugLineNum = 278;BA.debugLine="Return DatabaseResult";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_databaseresult));return;};
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(String _accesstoken) throws Exception{
}
public void  _jobdone(elicorp.pilot.httpjob _j) throws Exception{
}
public elicorp.pilot.supabase_databaseselect  _filter_equal(anywheresoftware.b4a.objects.collections.Map _columnvalue) throws Exception{
String _key = "";
 //BA.debugLineNum = 38;BA.debugLine="Public Sub Filter_Equal(ColumnValue As Map) As Sup";
 //BA.debugLineNum = 39;BA.debugLine="For Each key As String In ColumnValue.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _columnvalue.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_key = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 40;BA.debugLine="m_WhereList.Add(key & \"=eq.\" & ColumnValue.Get(k";
_m_wherelist.Add((Object)(_key+"=eq."+BA.ObjectToString(_columnvalue.Get((Object)(_key)))));
 }
};
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_databaseselect)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_databaseselect  _filter_greatherthan(anywheresoftware.b4a.objects.collections.Map _columnvalue) throws Exception{
String _key = "";
 //BA.debugLineNum = 77;BA.debugLine="Public Sub Filter_GreatherThan(ColumnValue As Map)";
 //BA.debugLineNum = 78;BA.debugLine="For Each key As String In ColumnValue.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _columnvalue.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_key = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 79;BA.debugLine="m_WhereList.Add(key & \"=gt.\" & ColumnValue.Get(k";
_m_wherelist.Add((Object)(_key+"=gt."+BA.ObjectToString(_columnvalue.Get((Object)(_key)))));
 }
};
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_databaseselect)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_databaseselect  _filter_greatherthanorequal(anywheresoftware.b4a.objects.collections.Map _columnvalue) throws Exception{
String _key = "";
 //BA.debugLineNum = 85;BA.debugLine="Public Sub Filter_GreatherThanOrEqual(ColumnValue";
 //BA.debugLineNum = 86;BA.debugLine="For Each key As String In ColumnValue.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _columnvalue.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_key = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 87;BA.debugLine="m_WhereList.Add(key & \"=gte.\" & ColumnValue.Get(";
_m_wherelist.Add((Object)(_key+"=gte."+BA.ObjectToString(_columnvalue.Get((Object)(_key)))));
 }
};
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_databaseselect)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_databaseselect  _filter_ilike(anywheresoftware.b4a.objects.collections.Map _columnvalue) throws Exception{
String _key = "";
 //BA.debugLineNum = 53;BA.debugLine="Public Sub Filter_Ilike(ColumnValue As Map) As Sup";
 //BA.debugLineNum = 54;BA.debugLine="For Each key As String In ColumnValue.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _columnvalue.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_key = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 55;BA.debugLine="m_WhereList.Add(key & \"=ilike.\" & str.EncodeUrl(";
_m_wherelist.Add((Object)(_key+"=ilike."+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.EncodeUrl(BA.ObjectToString(_columnvalue.Get((Object)(_key))),"UTF8")));
 }
};
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_databaseselect)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_databaseselect  _filter_in(anywheresoftware.b4a.objects.collections.Map _columnvalue) throws Exception{
String _key = "";
 //BA.debugLineNum = 61;BA.debugLine="Public Sub Filter_In(ColumnValue As Map) As Supaba";
 //BA.debugLineNum = 62;BA.debugLine="For Each key As String In ColumnValue.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _columnvalue.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_key = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 63;BA.debugLine="m_WhereList.Add(key & \"=in.\" & ColumnValue.Get(k";
_m_wherelist.Add((Object)(_key+"=in."+BA.ObjectToString(_columnvalue.Get((Object)(_key)))));
 }
};
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_databaseselect)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_databaseselect  _filter_is(anywheresoftware.b4a.objects.collections.Map _columnvalue) throws Exception{
String _key = "";
 //BA.debugLineNum = 69;BA.debugLine="Public Sub Filter_Is(ColumnValue As Map) As Supaba";
 //BA.debugLineNum = 70;BA.debugLine="For Each key As String In ColumnValue.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _columnvalue.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_key = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 71;BA.debugLine="m_WhereList.Add(key & \"=is.\" & ColumnValue.Get(k";
_m_wherelist.Add((Object)(_key+"=is."+BA.ObjectToString(_columnvalue.Get((Object)(_key)))));
 }
};
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_databaseselect)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_databaseselect  _filter_lessthan(anywheresoftware.b4a.objects.collections.Map _columnvalue) throws Exception{
String _key = "";
 //BA.debugLineNum = 101;BA.debugLine="Public Sub Filter_LessThan(ColumnValue As Map) As";
 //BA.debugLineNum = 102;BA.debugLine="For Each key As String In ColumnValue.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _columnvalue.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_key = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 103;BA.debugLine="m_WhereList.Add(key & \"=lt.\" & ColumnValue.Get(k";
_m_wherelist.Add((Object)(_key+"=lt."+BA.ObjectToString(_columnvalue.Get((Object)(_key)))));
 }
};
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_databaseselect)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_databaseselect  _filter_lessthanorequal(anywheresoftware.b4a.objects.collections.Map _columnvalue) throws Exception{
String _key = "";
 //BA.debugLineNum = 109;BA.debugLine="Public Sub Filter_LessThanOrEqual(ColumnValue As M";
 //BA.debugLineNum = 110;BA.debugLine="For Each key As String In ColumnValue.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _columnvalue.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_key = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 111;BA.debugLine="m_WhereList.Add(key & \"=lte.\" & ColumnValue.Get(";
_m_wherelist.Add((Object)(_key+"=lte."+BA.ObjectToString(_columnvalue.Get((Object)(_key)))));
 }
};
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_databaseselect)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_databaseselect  _filter_like(anywheresoftware.b4a.objects.collections.Map _columnvalue) throws Exception{
String _key = "";
 //BA.debugLineNum = 93;BA.debugLine="Public Sub Filter_Like(ColumnValue As Map) As Supa";
 //BA.debugLineNum = 94;BA.debugLine="For Each key As String In ColumnValue.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _columnvalue.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_key = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 95;BA.debugLine="m_WhereList.Add(key & \"=like.\" & \"*\" & ColumnVal";
_m_wherelist.Add((Object)(_key+"=like."+"*"+BA.ObjectToString(_columnvalue.Get((Object)(_key)))+""));
 }
};
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_databaseselect)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_databaseselect  _filter_notequal(anywheresoftware.b4a.objects.collections.Map _columnvalue) throws Exception{
String _key = "";
 //BA.debugLineNum = 117;BA.debugLine="Public Sub Filter_NotEqual(ColumnValue As Map) As";
 //BA.debugLineNum = 118;BA.debugLine="For Each key As String In ColumnValue.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _columnvalue.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_key = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 119;BA.debugLine="m_WhereList.Add(key & \"=neq.\" & ColumnValue.Get(";
_m_wherelist.Add((Object)(_key+"=neq."+BA.ObjectToString(_columnvalue.Get((Object)(_key)))));
 }
};
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_databaseselect)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_databaseselect  _filter_or(anywheresoftware.b4a.objects.collections.Map _columnvalue) throws Exception{
String _key = "";
 //BA.debugLineNum = 124;BA.debugLine="Public Sub Filter_Or(ColumnValue As Map) As Supaba";
 //BA.debugLineNum = 125;BA.debugLine="For Each key As String In ColumnValue.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _columnvalue.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_key = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 126;BA.debugLine="m_WhereList.Add(key & \"=Or.\" & ColumnValue.Get(k";
_m_wherelist.Add((Object)(_key+"=Or."+BA.ObjectToString(_columnvalue.Get((Object)(_key)))));
 }
};
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_databaseselect)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_databaseselect  _filter_textsearch(anywheresoftware.b4a.objects.collections.Map _columnvalue,String _filtertype) throws Exception{
String _key = "";
 //BA.debugLineNum = 180;BA.debugLine="Public Sub Filter_TextSearch(ColumnValue As Map,Fi";
 //BA.debugLineNum = 181;BA.debugLine="For Each key As String In ColumnValue.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _columnvalue.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_key = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 182;BA.debugLine="If FilterType = \"plain\" Then";
if ((_filtertype).equals("plain")) { 
 //BA.debugLineNum = 183;BA.debugLine="m_WhereList.Add(key & \"=plfts.\" & ColumnValue.G";
_m_wherelist.Add((Object)(_key+"=plfts."+(BA.ObjectToString(_columnvalue.Get((Object)(_key)))).replace(" ","%20")));
 }else if((_filtertype).equals("phrase")) { 
 //BA.debugLineNum = 186;BA.debugLine="m_WhereList.Add(key & \"=phfts.\" & ColumnValue.G";
_m_wherelist.Add((Object)(_key+"=phfts."+(BA.ObjectToString(_columnvalue.Get((Object)(_key)))).replace(" ","%20")));
 }else if((_filtertype).equals("websearch")) { 
 //BA.debugLineNum = 188;BA.debugLine="m_WhereList.Add(key & \"=wfts.\" &  ColumnValue.G";
_m_wherelist.Add((Object)(_key+"=wfts."+(BA.ObjectToString(_columnvalue.Get((Object)(_key)))).replace(" ","%20")));
 }else {
 //BA.debugLineNum = 190;BA.debugLine="m_WhereList.Add(key & \"=fts.\" & ColumnValue.Get";
_m_wherelist.Add((Object)(_key+"=fts."+(BA.ObjectToString(_columnvalue.Get((Object)(_key)))).replace(" ","%20")));
 };
 }
};
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_databaseselect)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_databaseselect  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(String _tablename) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Public Sub From(TableName As String) As Supabase_D";
 //BA.debugLineNum = 31;BA.debugLine="m_TableName = TableName";
_m_tablename = _tablename;
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_databaseselect)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,elicorp.pilot.supabase _thissupabase) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize(ThisSupabase As Supabase)";
 //BA.debugLineNum = 21;BA.debugLine="m_Supabase = ThisSupabase";
_m_supabase = _thissupabase;
 //BA.debugLineNum = 22;BA.debugLine="m_WhereList.Initialize";
_m_wherelist.Initialize();
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(int _rowlimit) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Public Sub Limit(RowLimit As Int)";
 //BA.debugLineNum = 145;BA.debugLine="m_Limit = RowLimit";
_m_limit = _rowlimit;
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(int _rowoffset) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Public Sub Offset(RowOffset As Int)";
 //BA.debugLineNum = 151;BA.debugLine="m_Offset = RowOffset";
_m_offset = _rowoffset;
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(String _columnsortdirection) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Public Sub OrderBy(ColumnSortDirection As String)";
 //BA.debugLineNum = 141;BA.debugLine="m_OrderBy = ColumnSortDirection";
_m_orderby = _columnsortdirection;
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.supabase_databaseselect  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(int _firstpage,int _lastpage) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Public Sub Range(FirstPage As Int,LastPage As Int)";
 //BA.debugLineNum = 199;BA.debugLine="m_Range = FirstPage & \"-\" & LastPage";
_m_range = BA.NumberToString(_firstpage)+"-"+BA.NumberToString(_lastpage);
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_databaseselect)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
