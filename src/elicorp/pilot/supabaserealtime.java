package elicorp.pilot;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class supabaserealtime extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "elicorp.pilot.supabaserealtime");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", elicorp.pilot.supabaserealtime.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvvvvvvvvvvvvv7 = "";
public Object _vvvvvvvvvvvvvvv0 = null;
public String _subscribetype_broadcast = "";
public String _subscribetype_presence = "";
public String _subscribetype_postgreschanges = "";
public String _filter_equal = "";
public String _filter_notequal = "";
public String _filter_greatherthan = "";
public String _filter_greatherthanorequal = "";
public String _filter_lessthan = "";
public String _filter_lessthanorequal = "";
public String _filter_in = "";
public elicorp.pilot.supabaserealtime_client _m_client = null;
public b4a.example.dateutils _vvvvvvvvvvv0 = null;
public elicorp.pilot.main _vvvvvvvvvvvv1 = null;
public elicorp.pilot.starter _vvvvvvvvvvvv2 = null;
public elicorp.pilot.httputils2service _vvvvvvvvvvvv3 = null;
public elicorp.pilot.b4xpages _vvvvvvvvvvvv4 = null;
public elicorp.pilot.b4xcollections _vvvvvvvvvvvv5 = null;
public elicorp.pilot.dbutils _vvvvvvvvvvvv6 = null;
public elicorp.pilot.xuiviewsutils _vvvvvvvvvvvv7 = null;
public elicorp.pilot.supabase_functions _supabase_functions = null;
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(String _column,String _filtername,String _value) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Public Sub BuildFilter(Column As String,FilterName";
 //BA.debugLineNum = 82;BA.debugLine="If FilterName.ToLowerCase = \"in\" Then";
if ((_filtername.toLowerCase()).equals("in")) { 
 //BA.debugLineNum = 83;BA.debugLine="Return Column & \"=\" & FilterName & \".(\" & Value";
if (true) return _column+"="+_filtername+".("+_value+")";
 }else {
 //BA.debugLineNum = 85;BA.debugLine="Return Column & \"=\" & FilterName & \".\" & Value";
if (true) return _column+"="+_filtername+"."+_value;
 };
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.supabaserealtime_channel  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(String _schema,String _table,String _filter) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Public Sub Channel(Schema As String,Table As Strin";
 //BA.debugLineNum = 78;BA.debugLine="Return m_Client.Channel(Schema,Table,Filter)";
if (true) return _m_client._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*elicorp.pilot.supabaserealtime_channel*/ (_schema,_table,_filter);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Private Sub Class_Globals";
 //BA.debugLineNum = 11;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvv7 = "";
 //BA.debugLineNum = 12;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvv0 = new Object();
 //BA.debugLineNum = 14;BA.debugLine="Public Const SubscribeType_Broadcast As String =";
_subscribetype_broadcast = "broadcast";
 //BA.debugLineNum = 15;BA.debugLine="Public Const SubscribeType_Presence As String = \"";
_subscribetype_presence = "presence";
 //BA.debugLineNum = 16;BA.debugLine="Public Const SubscribeType_PostgresChanges As Str";
_subscribetype_postgreschanges = "postgres_changes";
 //BA.debugLineNum = 18;BA.debugLine="Public Const Filter_Equal As String = \"eq\"";
_filter_equal = "eq";
 //BA.debugLineNum = 19;BA.debugLine="Public Const Filter_NotEqual As String = \"neq\"";
_filter_notequal = "neq";
 //BA.debugLineNum = 20;BA.debugLine="Public Const Filter_GreatherThan As String = \"gt\"";
_filter_greatherthan = "gt";
 //BA.debugLineNum = 21;BA.debugLine="Public Const Filter_GreatherThanOrEqual As String";
_filter_greatherthanorequal = "gte";
 //BA.debugLineNum = 22;BA.debugLine="Public Const Filter_LessThan As String = \"lt\"";
_filter_lessthan = "lt";
 //BA.debugLineNum = 23;BA.debugLine="Public Const Filter_LessThanOrEqual As String = \"";
_filter_lessthanorequal = "lte";
 //BA.debugLineNum = 24;BA.debugLine="Public Const Filter_In As String = \"in\"";
_filter_in = "in";
 //BA.debugLineNum = 26;BA.debugLine="Private m_Client As SupabaseRealtime_Client";
_m_client = new elicorp.pilot.supabaserealtime_client();
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Public Sub Close";
 //BA.debugLineNum = 44;BA.debugLine="m_Client.Close";
_m_client._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*String*/ ();
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Public Sub Connect";
 //BA.debugLineNum = 40;BA.debugLine="m_Client.Connect";
_m_client._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*String*/ ();
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _getevent_all() throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Public Sub getEvent_ALL As String";
 //BA.debugLineNum = 115;BA.debugLine="Return \"*\"";
if (true) return "*";
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _getevent_delete() throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Public Sub getEvent_DELETE As String";
 //BA.debugLineNum = 100;BA.debugLine="Return \"DELETE\"";
if (true) return "DELETE";
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public String  _getevent_insert() throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Public Sub getEvent_INSERT As String";
 //BA.debugLineNum = 110;BA.debugLine="Return \"INSERT\"";
if (true) return "INSERT";
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public String  _getevent_join() throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Public Sub getEvent_Join As String";
 //BA.debugLineNum = 125;BA.debugLine="Return \"join\"";
if (true) return "join";
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public String  _getevent_leave() throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Public Sub getEvent_Leave As String";
 //BA.debugLineNum = 130;BA.debugLine="Return \"leave\"";
if (true) return "leave";
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public String  _getevent_sync() throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Public Sub getEvent_Sync As String";
 //BA.debugLineNum = 120;BA.debugLine="Return \"sync\"";
if (true) return "sync";
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public String  _getevent_update() throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Public Sub getEvent_UPDATE As String";
 //BA.debugLineNum = 105;BA.debugLine="Return \"UPDATE\"";
if (true) return "UPDATE";
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public boolean  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Public Sub getisConnected As Boolean";
 //BA.debugLineNum = 95;BA.debugLine="Return m_Client.isConnected";
if (true) return _m_client._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*boolean*/ ();
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname,elicorp.pilot.supabase _thissupabase) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 33;BA.debugLine="Public Sub Initialize(Callback As Object, EventNam";
 //BA.debugLineNum = 34;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvv7 = _eventname;
 //BA.debugLineNum = 35;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvv0 = _callback;
 //BA.debugLineNum = 36;BA.debugLine="m_Client.Initialize(Callback,EventName,ThisSupaba";
_m_client._initialize /*String*/ (ba,_callback,_eventname,_thissupabase,(elicorp.pilot.supabaserealtime)(this));
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(elicorp.pilot.supabaserealtime_channel _thischannel) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Public Sub RemoveChannel(ThisChannel As SupabaseRe";
 //BA.debugLineNum = 90;BA.debugLine="m_Client.RemoveChannel(ThisChannel)";
_m_client._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ (_thischannel);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
