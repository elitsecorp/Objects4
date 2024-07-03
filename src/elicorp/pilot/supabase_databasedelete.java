package elicorp.pilot;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class supabase_databasedelete extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "elicorp.pilot.supabase_databasedelete");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", elicorp.pilot.supabase_databasedelete.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public elicorp.pilot.supabase _m_supabase = null;
public String _m_tablename = "";
public anywheresoftware.b4a.objects.collections.Map _m_wheremap = null;
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
 //BA.debugLineNum = 5;BA.debugLine="Private m_WhereMap As Map";
_m_wheremap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.supabase_databasedelete  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(anywheresoftware.b4a.objects.collections.Map _columnvalue) throws Exception{
String _key = "";
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Eq(ColumnValue As Map) As Supabase_Data";
 //BA.debugLineNum = 20;BA.debugLine="For Each key As String In ColumnValue.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _columnvalue.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_key = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 21;BA.debugLine="m_WhereMap.Put(key,ColumnValue.Get(key))";
_m_wheremap.Put((Object)(_key),_columnvalue.Get((Object)(_key)));
 }
};
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_databasedelete)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws Exception{
ResumableSub_Execute rsub = new ResumableSub_Execute(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Execute extends BA.ResumableSub {
public ResumableSub_Execute(elicorp.pilot.supabase_databasedelete parent) {
this.parent = parent;
}
elicorp.pilot.supabase_databasedelete parent;
elicorp.pilot.supabase._supabaseerror _databaseerror = null;
String _accesstoken = "";
String _url = "";
String _key = "";
elicorp.pilot.httpjob _j = null;
anywheresoftware.b4a.BA.IterableList group11;
int index11;
int groupLen11;

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
 //BA.debugLineNum = 28;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 29;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 31;BA.debugLine="Wait For (m_Supabase.Auth.GetAccessToken) Complet";
parent.__c.WaitFor("complete", ba, this, parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 15;
return;
case 15:
//C
this.state = 1;
_accesstoken = (String) result[0];
;
 //BA.debugLineNum = 32;BA.debugLine="If AccessToken = \"\" Then";
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
 //BA.debugLineNum = 33;BA.debugLine="DatabaseError.StatusCode = 401";
_databaseerror.StatusCode /*int*/  = (int) (401);
 //BA.debugLineNum = 34;BA.debugLine="DatabaseError.ErrorMessage = \"Unauthorized\"";
_databaseerror.ErrorMessage /*String*/  = "Unauthorized";
 //BA.debugLineNum = 35;BA.debugLine="Return DatabaseError";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_databaseerror));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 38;BA.debugLine="Dim url As String = \"\"";
_url = "";
 //BA.debugLineNum = 39;BA.debugLine="url = url & $\"${m_Supabase.URL}/rest/v1/${m_Table";
_url = _url+(""+parent.__c.SmartStringFormatter("",(Object)(parent._m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/rest/v1/"+parent.__c.SmartStringFormatter("",(Object)(parent._m_tablename))+"?");
 //BA.debugLineNum = 41;BA.debugLine="For Each key As String In m_WhereMap.Keys";
if (true) break;

case 5:
//for
this.state = 8;
group11 = parent._m_wheremap.Keys();
index11 = 0;
groupLen11 = group11.getSize();
this.state = 16;
if (true) break;

case 16:
//C
this.state = 8;
if (index11 < groupLen11) {
this.state = 7;
_key = BA.ObjectToString(group11.Get(index11));}
if (true) break;

case 17:
//C
this.state = 16;
index11++;
if (true) break;

case 7:
//C
this.state = 17;
 //BA.debugLineNum = 42;BA.debugLine="url = url & \"&\" & key & \"=eq.\" & m_WhereMap.Get(";
_url = _url+"&"+_key+"=eq."+BA.ObjectToString(parent._m_wheremap.Get((Object)(_key)));
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
;
 //BA.debugLineNum = 45;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 45;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 46;BA.debugLine="j.Delete(url)";
_j._vvvvvvvvvvvvvvvvvvvv0 /*String*/ (_url);
 //BA.debugLineNum = 47;BA.debugLine="j.GetRequest.SetHeader(\"apikey\",m_Supabase.ApiKey";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("apikey",parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ());
 //BA.debugLineNum = 48;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_accesstoken);
 //BA.debugLineNum = 50;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 18;
return;
case 18:
//C
this.state = 9;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 52;BA.debugLine="DatabaseError.Success = j.Success";
_databaseerror.Success /*boolean*/  = _j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ;
 //BA.debugLineNum = 54;BA.debugLine="If j.Success Then";
if (true) break;

case 9:
//if
this.state = 14;
if (_j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 57;BA.debugLine="DatabaseError.StatusCode = j.Response.StatusCode";
_databaseerror.StatusCode /*int*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv6 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode();
 //BA.debugLineNum = 58;BA.debugLine="DatabaseError.ErrorMessage = j.ErrorMessage";
_databaseerror.ErrorMessage /*String*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ;
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 61;BA.debugLine="Return DatabaseError";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_databaseerror));return;};
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(String _accesstoken) throws Exception{
}
public void  _jobdone(elicorp.pilot.httpjob _j) throws Exception{
}
public elicorp.pilot.supabase_databasedelete  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(String _tablename) throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Public Sub From(TableName As String) As Supabase_D";
 //BA.debugLineNum = 15;BA.debugLine="m_TableName = TableName";
_m_tablename = _tablename;
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_databasedelete)(this);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,elicorp.pilot.supabase _thissupabase) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(ThisSupabase As Supabase)";
 //BA.debugLineNum = 10;BA.debugLine="m_Supabase = ThisSupabase";
_m_supabase = _thissupabase;
 //BA.debugLineNum = 11;BA.debugLine="m_WhereMap.Initialize";
_m_wheremap.Initialize();
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
