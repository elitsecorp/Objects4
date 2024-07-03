package elicorp.pilot;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class supabase_databaseinsert extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "elicorp.pilot.supabase_databaseinsert");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", elicorp.pilot.supabase_databaseinsert.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public elicorp.pilot.supabase _m_supabase = null;
public String _m_tablename = "";
public anywheresoftware.b4a.objects.collections.Map _m_columnvalue = null;
public anywheresoftware.b4a.objects.collections.List _m_lstcolumnvalue = null;
public boolean _m_upsert = false;
public boolean _m_select = false;
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
 //BA.debugLineNum = 2;BA.debugLine="Private m_Supabase As Supabase";
_m_supabase = new elicorp.pilot.supabase();
 //BA.debugLineNum = 4;BA.debugLine="Private m_TableName As String";
_m_tablename = "";
 //BA.debugLineNum = 5;BA.debugLine="Private m_ColumnValue As Map";
_m_columnvalue = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Private m_lstColumnValue As List";
_m_lstcolumnvalue = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="Private m_Upsert As Boolean = False";
_m_upsert = __c.False;
 //BA.debugLineNum = 8;BA.debugLine="Private m_Select as Boolean = False";
_m_select = __c.False;
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws Exception{
ResumableSub_Execute rsub = new ResumableSub_Execute(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Execute extends BA.ResumableSub {
public ResumableSub_Execute(elicorp.pilot.supabase_databaseinsert parent) {
this.parent = parent;
}
elicorp.pilot.supabase_databaseinsert parent;
elicorp.pilot.supabase._supabasedatabaseresult _databaseresult = null;
elicorp.pilot.supabase._supabaseerror _databaseerror = null;
String _accesstoken = "";
String _url = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsn = null;
String _insertjson = "";
elicorp.pilot.httpjob _j = null;

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
 //BA.debugLineNum = 54;BA.debugLine="Dim DatabaseResult As SupabaseDatabaseResult";
_databaseresult = new elicorp.pilot.supabase._supabasedatabaseresult();
 //BA.debugLineNum = 55;BA.debugLine="DatabaseResult.Initialize";
_databaseresult.Initialize();
 //BA.debugLineNum = 56;BA.debugLine="DatabaseResult.Columns.Initialize";
_databaseresult.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 57;BA.debugLine="DatabaseResult.Rows.Initialize";
_databaseresult.Rows /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 58;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 59;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 61;BA.debugLine="Wait For (m_Supabase.Auth.GetAccessToken) Complet";
parent.__c.WaitFor("complete", ba, this, parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 33;
return;
case 33:
//C
this.state = 1;
_accesstoken = (String) result[0];
;
 //BA.debugLineNum = 62;BA.debugLine="If AccessToken = \"\" Then";
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
 //BA.debugLineNum = 63;BA.debugLine="DatabaseError.StatusCode = 401";
_databaseerror.StatusCode /*int*/  = (int) (401);
 //BA.debugLineNum = 64;BA.debugLine="DatabaseError.ErrorMessage = \"Unauthorized\"";
_databaseerror.ErrorMessage /*String*/  = "Unauthorized";
 //BA.debugLineNum = 65;BA.debugLine="Return DatabaseError";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_databaseerror));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 68;BA.debugLine="Dim url As String = \"\"";
_url = "";
 //BA.debugLineNum = 69;BA.debugLine="url = url & $\"${m_Supabase.URL}/rest/v1/${m_Table";
_url = _url+(""+parent.__c.SmartStringFormatter("",(Object)(parent._m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/rest/v1/"+parent.__c.SmartStringFormatter("",(Object)(parent._m_tablename))+"");
 //BA.debugLineNum = 71;BA.debugLine="Dim jsn As JSONGenerator";
_jsn = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 72;BA.debugLine="jsn.Initialize2(m_lstColumnValue)";
_jsn.Initialize2(parent._m_lstcolumnvalue);
 //BA.debugLineNum = 74;BA.debugLine="Dim InsertJson As String = jsn.ToString";
_insertjson = _jsn.ToString();
 //BA.debugLineNum = 77;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 77;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 78;BA.debugLine="j.PostString(url,InsertJson.SubString2(1,InsertJs";
_j._vvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ (_url,_insertjson.substring((int) (1),(int) (_insertjson.length()-1)));
 //BA.debugLineNum = 79;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 80;BA.debugLine="j.GetRequest.SetHeader(\"apikey\",m_Supabase.ApiKey";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("apikey",parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ());
 //BA.debugLineNum = 81;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_accesstoken);
 //BA.debugLineNum = 83;BA.debugLine="If m_Upsert Or m_Select Then";
if (true) break;

case 5:
//if
this.state = 22;
if (parent._m_upsert || parent._m_select) { 
this.state = 7;
}else {
this.state = 21;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 85;BA.debugLine="If m_Upsert And m_Select Then";
if (true) break;

case 8:
//if
this.state = 19;
if (parent._m_upsert && parent._m_select) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 19;
 //BA.debugLineNum = 86;BA.debugLine="j.GetRequest.SetHeader(\"Prefer\",\"return=represe";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Prefer","return=representation, resolution=merge-duplicates");
 if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 88;BA.debugLine="If m_Upsert Then";
if (true) break;

case 13:
//if
this.state = 18;
if (parent._m_upsert) { 
this.state = 15;
}else if(parent._m_select) { 
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 //BA.debugLineNum = 89;BA.debugLine="j.GetRequest.SetHeader(\"Prefer\",\"resolution=me";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Prefer","resolution=merge-duplicates");
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 91;BA.debugLine="j.GetRequest.SetHeader(\"Prefer\",\"return=repres";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Prefer","return=representation");
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
 //BA.debugLineNum = 96;BA.debugLine="j.GetRequest.SetHeader(\"Prefer\",\"return=minimal\"";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Prefer","return=minimal");
 if (true) break;

case 22:
//C
this.state = 23;
;
 //BA.debugLineNum = 99;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 34;
return;
case 34:
//C
this.state = 23;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 101;BA.debugLine="DatabaseError.Success = j.Success";
_databaseerror.Success /*boolean*/  = _j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ;
 //BA.debugLineNum = 103;BA.debugLine="If j.Success Then";
if (true) break;

case 23:
//if
this.state = 32;
if (_j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ) { 
this.state = 25;
}else {
this.state = 31;
}if (true) break;

case 25:
//C
this.state = 26;
 //BA.debugLineNum = 105;BA.debugLine="If m_Select Then";
if (true) break;

case 26:
//if
this.state = 29;
if (parent._m_select) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 //BA.debugLineNum = 106;BA.debugLine="DatabaseResult = Supabase_Functions.CreateDatab";
_databaseresult = parent._supabase_functions._vvvvvvv0 /*elicorp.pilot.supabase._supabasedatabaseresult*/ (parent.getActivityBA(),_j._vvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ());
 if (true) break;

case 29:
//C
this.state = 32;
;
 if (true) break;

case 31:
//C
this.state = 32;
 //BA.debugLineNum = 110;BA.debugLine="DatabaseError.StatusCode = j.Response.StatusCode";
_databaseerror.StatusCode /*int*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv6 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode();
 //BA.debugLineNum = 111;BA.debugLine="DatabaseError.ErrorMessage = j.ErrorMessage";
_databaseerror.ErrorMessage /*String*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ;
 if (true) break;

case 32:
//C
this.state = -1;
;
 //BA.debugLineNum = 114;BA.debugLine="DatabaseResult.Error = DatabaseError";
_databaseresult.Error /*elicorp.pilot.supabase._supabaseerror*/  = _databaseerror;
 //BA.debugLineNum = 115;BA.debugLine="Return DatabaseResult";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_databaseresult));return;};
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(String _accesstoken) throws Exception{
}
public void  _jobdone(elicorp.pilot.httpjob _j) throws Exception{
}
public elicorp.pilot.supabase_databaseinsert  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(String _tablename) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Public Sub From(TableName As String) As Supabase_D";
 //BA.debugLineNum = 18;BA.debugLine="m_TableName = TableName";
_m_tablename = _tablename;
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_databaseinsert)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,elicorp.pilot.supabase _thissupabase) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(ThisSupabase As Supabase)";
 //BA.debugLineNum = 13;BA.debugLine="m_Supabase = ThisSupabase";
_m_supabase = _thissupabase;
 //BA.debugLineNum = 14;BA.debugLine="m_lstColumnValue.Initialize";
_m_lstcolumnvalue.Initialize();
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.supabase_databaseinsert  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(anywheresoftware.b4a.objects.collections.Map _columnvalue) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Public Sub Insert(ColumnValue As Map) As Supabase_";
 //BA.debugLineNum = 25;BA.debugLine="m_ColumnValue = ColumnValue";
_m_columnvalue = _columnvalue;
 //BA.debugLineNum = 26;BA.debugLine="m_lstColumnValue.Add(m_ColumnValue)";
_m_lstcolumnvalue.Add((Object)(_m_columnvalue.getObject()));
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_databaseinsert)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_databaseinsert  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(anywheresoftware.b4a.objects.collections.List _columnvaluelist) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Public Sub InsertBulk(ColumnValueList As List) As";
 //BA.debugLineNum = 37;BA.debugLine="m_lstColumnValue.Add(ColumnValueList)";
_m_lstcolumnvalue.Add((Object)(_columnvaluelist.getObject()));
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_databaseinsert)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_databaseinsert  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Public Sub SelectData As Supabase_DatabaseInsert";
 //BA.debugLineNum = 48;BA.debugLine="m_Select = True";
_m_select = __c.True;
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_databaseinsert)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_databaseinsert  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Public Sub Upsert As Supabase_DatabaseInsert";
 //BA.debugLineNum = 43;BA.debugLine="m_Upsert = True";
_m_upsert = __c.True;
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_databaseinsert)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
