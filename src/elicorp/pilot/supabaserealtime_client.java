package elicorp.pilot;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class supabaserealtime_client extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "elicorp.pilot.supabaserealtime_client");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", elicorp.pilot.supabaserealtime_client.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvvvvvvvvvvvvv7 = "";
public Object _vvvvvvvvvvvvvvv0 = null;
public elicorp.pilot.supabaserealtime _m_realtime = null;
public elicorp.pilot.supabase _m_supabase = null;
public anywheresoftware.b4a.objects.Timer _tmr_heartbeat = null;
public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
public boolean _m_isconnected = false;
public String _m_filterstring = "";
public b4a.example.dateutils _vvvvvvvvvvv0 = null;
public elicorp.pilot.main _vvvvvvvvvvvv1 = null;
public elicorp.pilot.starter _vvvvvvvvvvvv2 = null;
public elicorp.pilot.httputils2service _vvvvvvvvvvvv3 = null;
public elicorp.pilot.b4xpages _vvvvvvvvvvvv4 = null;
public elicorp.pilot.b4xcollections _vvvvvvvvvvvv5 = null;
public elicorp.pilot.dbutils _vvvvvvvvvvvv6 = null;
public elicorp.pilot.xuiviewsutils _vvvvvvvvvvvv7 = null;
public elicorp.pilot.supabase_functions _supabase_functions = null;
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(elicorp.pilot.supabase._supabaserealtime_broadcastdata _broadcastdata) throws Exception{
 //BA.debugLineNum = 310;BA.debugLine="Private Sub BroadcastDataReceived(BroadcastData As";
 //BA.debugLineNum = 311;BA.debugLine="If Supabase_Functions.SubExists2(mCallBack,mEvent";
if (_supabase_functions._vvvvvvvvv1 /*boolean*/ (getActivityBA(),_vvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvv7+"_BroadcastDataReceived",(int) (1))) { 
 //BA.debugLineNum = 312;BA.debugLine="CallSub2(mCallBack,mEventName & \"_BroadcastDataR";
__c.CallSubNew2(ba,_vvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvv7+"_BroadcastDataReceived",(Object)(_broadcastdata));
 };
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(String _schemaname,String _tablename,String _filterstring) throws Exception{
String _topic = "";
 //BA.debugLineNum = 61;BA.debugLine="Private Sub BuildTopic(SchemaName As String,TableN";
 //BA.debugLineNum = 62;BA.debugLine="Dim Topic As String = \"realtime:\" & SchemaName";
_topic = "realtime:"+_schemaname;
 //BA.debugLineNum = 63;BA.debugLine="If TableName <> \"\" Then Topic = Topic & \":\" & Tab";
if ((_tablename).equals("") == false) { 
_topic = _topic+":"+_tablename;};
 //BA.debugLineNum = 64;BA.debugLine="If FilterString <> \"\" Then Topic = Topic & \":\" &";
if ((_filterstring).equals("") == false) { 
_topic = _topic+":"+_filterstring;};
 //BA.debugLineNum = 65;BA.debugLine="Return Topic";
if (true) return _topic;
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.supabaserealtime_channel  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(String _schemaname,String _tablename,String _filter) throws Exception{
String _topic = "";
elicorp.pilot.supabaserealtime_channel _thischannel = null;
 //BA.debugLineNum = 42;BA.debugLine="Public Sub Channel(SchemaName As String,TableName";
 //BA.debugLineNum = 44;BA.debugLine="Dim Topic As String = BuildTopic(SchemaName,Table";
_topic = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(_schemaname,_tablename,_filter);
 //BA.debugLineNum = 46;BA.debugLine="Dim ThisChannel As SupabaseRealtime_Channel = Get";
_thischannel = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(_topic);
 //BA.debugLineNum = 47;BA.debugLine="If ThisChannel = Null Then";
if (_thischannel== null) { 
 //BA.debugLineNum = 48;BA.debugLine="Dim ThisChannel As SupabaseRealtime_Channel";
_thischannel = new elicorp.pilot.supabaserealtime_channel();
 //BA.debugLineNum = 49;BA.debugLine="ThisChannel.Initialize(Me,Topic,SchemaName,Table";
_thischannel._initialize /*String*/ (ba,(elicorp.pilot.supabaserealtime_client)(this),_topic,_schemaname,_tablename,_filter,_m_supabase);
 //BA.debugLineNum = 50;BA.debugLine="Channels.Add(ThisChannel)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Add((Object)(_thischannel));
 };
 //BA.debugLineNum = 52;BA.debugLine="RefreshAccessToken(Topic)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(_topic);
 //BA.debugLineNum = 53;BA.debugLine="Return ThisChannel";
if (true) return _thischannel;
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvv7 = "";
 //BA.debugLineNum = 4;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvv0 = new Object();
 //BA.debugLineNum = 6;BA.debugLine="Private m_RealTime As SupabaseRealtime";
_m_realtime = new elicorp.pilot.supabaserealtime();
 //BA.debugLineNum = 15;BA.debugLine="Private m_Supabase As Supabase";
_m_supabase = new elicorp.pilot.supabase();
 //BA.debugLineNum = 17;BA.debugLine="Private tmr_Heartbeat As Timer";
_tmr_heartbeat = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 19;BA.debugLine="Private Channels As List";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 20;BA.debugLine="Private m_isConnected As Boolean = False";
_m_isconnected = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Private m_FilterString As String";
_m_filterstring = "";
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Public Sub Close";
 //BA.debugLineNum = 113;BA.debugLine="tmr_Heartbeat.Enabled = False";
_tmr_heartbeat.setEnabled(__c.False);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Public Sub Connect";
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 286;BA.debugLine="Private Sub Connected 'Ignore";
 //BA.debugLineNum = 287;BA.debugLine="If Supabase_Functions.SubExists2(mCallBack,mEvent";
if (_supabase_functions._vvvvvvvvv1 /*boolean*/ (getActivityBA(),_vvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvv7+"_Connected",(int) (0))) { 
 //BA.debugLineNum = 288;BA.debugLine="CallSub(mCallBack,mEventName & \"_Connected\")";
__c.CallSubNew(ba,_vvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvv7+"_Connected");
 };
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(elicorp.pilot.supabase._supabaserealtime_data _data) throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Private Sub DataReceived(Data As SupabaseRealtime_";
 //BA.debugLineNum = 305;BA.debugLine="If Supabase_Functions.SubExists2(mCallBack,mEvent";
if (_supabase_functions._vvvvvvvvv1 /*boolean*/ (getActivityBA(),_vvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvv7+"_DataReceived",(int) (1))) { 
 //BA.debugLineNum = 306;BA.debugLine="CallSub2(mCallBack,mEventName & \"_DataReceived\",";
__c.CallSubNew2(ba,_vvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvv7+"_DataReceived",(Object)(_data));
 };
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Private Sub Disconnected 'Ignore";
 //BA.debugLineNum = 293;BA.debugLine="If Supabase_Functions.SubExists2(mCallBack,mEvent";
if (_supabase_functions._vvvvvvvvv1 /*boolean*/ (getActivityBA(),_vvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvv7+"_Disconnected",(int) (0))) { 
 //BA.debugLineNum = 294;BA.debugLine="CallSub(mCallBack,mEventName & \"_Disconnected\")";
__c.CallSubNew(ba,_vvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvv7+"_Disconnected");
 };
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.supabaserealtime_channel  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(String _topicname) throws Exception{
elicorp.pilot.supabaserealtime_channel _thischannel = null;
 //BA.debugLineNum = 68;BA.debugLine="Private Sub GetChannel(TopicName As String) As Sup";
 //BA.debugLineNum = 69;BA.debugLine="For Each ThisChannel As SupabaseRealtime_Channel";
{
final anywheresoftware.b4a.BA.IterableList group1 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_thischannel = (elicorp.pilot.supabaserealtime_channel)(group1.Get(index1));
 //BA.debugLineNum = 70;BA.debugLine="If ThisChannel.Topic = TopicName Then";
if ((_thischannel._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ()).equals(_topicname)) { 
 //BA.debugLineNum = 71;BA.debugLine="Return ThisChannel";
if (true) return _thischannel;
 //BA.debugLineNum = 72;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 75;BA.debugLine="Return Null";
if (true) return (elicorp.pilot.supabaserealtime_channel)(__c.Null);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public boolean  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Public Sub getisConnected As Boolean";
 //BA.debugLineNum = 120;BA.debugLine="Return m_isConnected";
if (true) return _m_isconnected;
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return false;
}
public void  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws Exception{
ResumableSub_Heartbeat rsub = new ResumableSub_Heartbeat(this);
rsub.resume(ba, null);
}
public static class ResumableSub_Heartbeat extends BA.ResumableSub {
public ResumableSub_Heartbeat(elicorp.pilot.supabaserealtime_client parent) {
this.parent = parent;
}
elicorp.pilot.supabaserealtime_client parent;
elicorp.pilot.supabase._supabaseerror _databaseerror = null;
String _accesstoken = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 261;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 262;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 264;BA.debugLine="Wait For (m_Supabase.Auth.GetAccessToken) Complet";
parent.__c.WaitFor("complete", ba, this, parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 5;
return;
case 5:
//C
this.state = 1;
_accesstoken = (String) result[0];
;
 //BA.debugLineNum = 265;BA.debugLine="If AccessToken = \"\" Then";
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
 //BA.debugLineNum = 266;BA.debugLine="DatabaseError.StatusCode = 401";
_databaseerror.StatusCode /*int*/  = (int) (401);
 //BA.debugLineNum = 267;BA.debugLine="DatabaseError.ErrorMessage = \"Unauthorized\"";
_databaseerror.ErrorMessage /*String*/  = "Unauthorized";
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 271;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 272;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 273;BA.debugLine="m.Put(\"event\", \"heartbeat\")";
_m.Put((Object)("event"),(Object)("heartbeat"));
 //BA.debugLineNum = 274;BA.debugLine="m.Put(\"topic\", \"phoenix\")";
_m.Put((Object)("topic"),(Object)("phoenix"));
 //BA.debugLineNum = 275;BA.debugLine="m.Put(\"payload\", CreateMap(\"access_token\":AccessT";
_m.Put((Object)("payload"),(Object)(parent.__c.createMap(new Object[] {(Object)("access_token"),(Object)(_accesstoken)}).getObject()));
 //BA.debugLineNum = 276;BA.debugLine="m.Put(\"ref\", \"\")";
_m.Put((Object)("ref"),(Object)(""));
 //BA.debugLineNum = 278;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 279;BA.debugLine="jg.Initialize(m)";
_jg.Initialize(_m);
 //BA.debugLineNum = 280;BA.debugLine="SendMessage(jg.ToString)";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(_jg.ToString());
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(String _accesstoken) throws Exception{
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname,elicorp.pilot.supabase _thissupabase,elicorp.pilot.supabaserealtime _realtime) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 25;BA.debugLine="Public Sub Initialize(Callback As Object, EventNam";
 //BA.debugLineNum = 26;BA.debugLine="m_RealTime = RealTime";
_m_realtime = _realtime;
 //BA.debugLineNum = 27;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvv7 = _eventname;
 //BA.debugLineNum = 28;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvv0 = _callback;
 //BA.debugLineNum = 29;BA.debugLine="Channels.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Initialize();
 //BA.debugLineNum = 30;BA.debugLine="m_Supabase = ThisSupabase";
_m_supabase = _thissupabase;
 //BA.debugLineNum = 34;BA.debugLine="tmr_Heartbeat.Initialize(\"tmr_Heartbeat\",30000)";
_tmr_heartbeat.Initialize(ba,"tmr_Heartbeat",(long) (30000));
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(elicorp.pilot.supabase._supabaserealtime_presencedata _presencedata) throws Exception{
 //BA.debugLineNum = 316;BA.debugLine="Private Sub PresenceDataReceived(PresenceData As S";
 //BA.debugLineNum = 317;BA.debugLine="If Supabase_Functions.SubExists2(mCallBack,mEvent";
if (_supabase_functions._vvvvvvvvv1 /*boolean*/ (getActivityBA(),_vvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvv7+"_PresenceDataReceived",(int) (1))) { 
 //BA.debugLineNum = 318;BA.debugLine="CallSub2(mCallBack,mEventName & \"_PresenceDataRe";
__c.CallSubNew2(ba,_vvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvv7+"_PresenceDataReceived",(Object)(_presencedata));
 };
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return "";
}
public void  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(String _topic) throws Exception{
ResumableSub_RefreshAccessToken rsub = new ResumableSub_RefreshAccessToken(this,_topic);
rsub.resume(ba, null);
}
public static class ResumableSub_RefreshAccessToken extends BA.ResumableSub {
public ResumableSub_RefreshAccessToken(elicorp.pilot.supabaserealtime_client parent,String _topic) {
this.parent = parent;
this._topic = _topic;
}
elicorp.pilot.supabaserealtime_client parent;
String _topic;
elicorp.pilot.supabase._supabaseerror _databaseerror = null;
String _accesstoken = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 231;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 232;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 234;BA.debugLine="Wait For (m_Supabase.Auth.GetAccessToken) Complet";
parent.__c.WaitFor("complete", ba, this, parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 5;
return;
case 5:
//C
this.state = 1;
_accesstoken = (String) result[0];
;
 //BA.debugLineNum = 235;BA.debugLine="If AccessToken = \"\" Then";
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
 //BA.debugLineNum = 236;BA.debugLine="DatabaseError.StatusCode = 401";
_databaseerror.StatusCode /*int*/  = (int) (401);
 //BA.debugLineNum = 237;BA.debugLine="DatabaseError.ErrorMessage = \"Unauthorized\"";
_databaseerror.ErrorMessage /*String*/  = "Unauthorized";
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 241;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 242;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 243;BA.debugLine="m.Put(\"event\", \"access_token\")";
_m.Put((Object)("event"),(Object)("access_token"));
 //BA.debugLineNum = 244;BA.debugLine="m.Put(\"topic\", Topic)";
_m.Put((Object)("topic"),(Object)(_topic));
 //BA.debugLineNum = 245;BA.debugLine="m.Put(\"ref\", \"\")";
_m.Put((Object)("ref"),(Object)(""));
 //BA.debugLineNum = 246;BA.debugLine="m.Put(\"payload\", CreateMap(\"access_token\":AccessT";
_m.Put((Object)("payload"),(Object)(parent.__c.createMap(new Object[] {(Object)("access_token"),(Object)(_accesstoken)}).getObject()));
 //BA.debugLineNum = 248;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 249;BA.debugLine="jg.Initialize(m)";
_jg.Initialize(_m);
 //BA.debugLineNum = 250;BA.debugLine="SendMessage(jg.ToString)";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(_jg.ToString());
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(elicorp.pilot.supabaserealtime_channel _thischannel) throws Exception{
int _i = 0;
 //BA.debugLineNum = 90;BA.debugLine="Public Sub RemoveChannel(ThisChannel As SupabaseRe";
 //BA.debugLineNum = 91;BA.debugLine="For i = 0 To Channels.Size -1";
{
final int step1 = 1;
final int limit1 = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 92;BA.debugLine="If Channels.Get(i) = ThisChannel Then";
if ((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Get(_i)).equals((Object)(_thischannel))) { 
 //BA.debugLineNum = 93;BA.debugLine="Channels.RemoveAt(i)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.RemoveAt(_i);
 //BA.debugLineNum = 94;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(String _jsonmessage) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Public Sub SendMessage(jSonMessage As String)";
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 298;BA.debugLine="Private Sub Subscribed";
 //BA.debugLineNum = 299;BA.debugLine="If Supabase_Functions.SubExists2(mCallBack,mEvent";
if (_supabase_functions._vvvvvvvvv1 /*boolean*/ (getActivityBA(),_vvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvv7+"_Subscribed",(int) (0))) { 
 //BA.debugLineNum = 300;BA.debugLine="CallSub(mCallBack,mEventName & \"_Subscribed\")";
__c.CallSubNew(ba,_vvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvv7+"_Subscribed");
 };
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return "";
}
public String  _tmr_heartbeat_tick() throws Exception{
 //BA.debugLineNum = 254;BA.debugLine="Private Sub tmr_Heartbeat_Tick";
 //BA.debugLineNum = 255;BA.debugLine="Heartbeat";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1();
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return "";
}
public String  _ws_binarymessage(byte[] _data) throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Private Sub ws_BinaryMessage (Data() As Byte)";
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return "";
}
public String  _ws_closed(String _reason) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Private Sub ws_Closed (Reason As String)";
 //BA.debugLineNum = 124;BA.debugLine="m_isConnected = False";
_m_isconnected = __c.False;
 //BA.debugLineNum = 125;BA.debugLine="tmr_Heartbeat.Enabled = False";
_tmr_heartbeat.setEnabled(__c.False);
 //BA.debugLineNum = 126;BA.debugLine="Disconnected";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 127;BA.debugLine="Log(\"SupabaseRealtimeClient: Socket closed reason";
__c.LogImpl("957212932","SupabaseRealtimeClient: Socket closed reason: "+_reason,0);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public String  _ws_textmessage(String _message) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _jroot = null;
anywheresoftware.b4a.objects.collections.Map _payload = null;
elicorp.pilot.supabase._supabaserealtime_data _data = null;
anywheresoftware.b4a.objects.collections.List _columns = null;
anywheresoftware.b4a.objects.collections.Map _colcolumns = null;
elicorp.pilot.supabase._supabaseerror _databaseerror = null;
elicorp.pilot.supabase._supabaserealtime_broadcastdata _broadcastdata = null;
elicorp.pilot.supabase._supabaserealtime_presencedata _presencedata = null;
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
 //BA.debugLineNum = 130;BA.debugLine="Private Sub ws_TextMessage (Message As String)";
 //BA.debugLineNum = 132;BA.debugLine="If m_Supabase.LogEvents Then Log(\"SupabaseRealtim";
if (_m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*boolean*/ ()) { 
__c.LogImpl("957278466","SupabaseRealtimeClient: "+_message,0);};
 //BA.debugLineNum = 134;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 135;BA.debugLine="parser.Initialize(Message)";
_parser.Initialize(_message);
 //BA.debugLineNum = 136;BA.debugLine="Dim jRoot As Map = parser.NextObject";
_jroot = new anywheresoftware.b4a.objects.collections.Map();
_jroot = _parser.NextObject();
 //BA.debugLineNum = 137;BA.debugLine="Dim payload As Map = jRoot.Get(\"payload\")";
_payload = new anywheresoftware.b4a.objects.collections.Map();
_payload = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_jroot.Get((Object)("payload"))));
 //BA.debugLineNum = 139;BA.debugLine="If jRoot.ContainsKey(\"event\") And jRoot.Get(\"even";
if (_jroot.ContainsKey((Object)("event")) && (_jroot.Get((Object)("event"))).equals((Object)("phx_reply"))) { 
 //BA.debugLineNum = 141;BA.debugLine="Subscribed";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5();
 }else if(_jroot.ContainsKey((Object)("event")) && ((_jroot.Get((Object)("event"))).equals((Object)(_m_realtime._getevent_update /*String*/ ())) || (_jroot.Get((Object)("event"))).equals((Object)(_m_realtime._getevent_insert /*String*/ ())) || (_jroot.Get((Object)("event"))).equals((Object)(_m_realtime._getevent_delete /*String*/ ())) || (_jroot.Get((Object)("event"))).equals((Object)(_m_realtime._getevent_all /*String*/ ())))) { 
 //BA.debugLineNum = 145;BA.debugLine="Dim Data As SupabaseRealtime_Data";
_data = new elicorp.pilot.supabase._supabaserealtime_data();
 //BA.debugLineNum = 146;BA.debugLine="Data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 149;BA.debugLine="Data.CommitTimestamp = Supabase_Functions.ParseD";
_data.CommitTimestamp /*long*/  = _supabase_functions._vvvvvvvv0 /*long*/ (getActivityBA(),BA.ObjectToString(_payload.Get((Object)("commit_timestamp"))));
 //BA.debugLineNum = 150;BA.debugLine="Dim columns As List = payload.Get(\"columns\")";
_columns = new anywheresoftware.b4a.objects.collections.List();
_columns = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_payload.Get((Object)("columns"))));
 //BA.debugLineNum = 151;BA.debugLine="For Each colcolumns As Map In columns";
_colcolumns = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group13 = _columns;
final int groupLen13 = group13.getSize()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_colcolumns = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group13.Get(index13)));
 //BA.debugLineNum = 152;BA.debugLine="columns.Add(CreateMap(\"Name\":colcolumns.Get(\"na";
_columns.Add((Object)(__c.createMap(new Object[] {(Object)("Name"),_colcolumns.Get((Object)("name")),(Object)("Type"),_colcolumns.Get((Object)("type"))}).getObject()));
 }
};
 //BA.debugLineNum = 154;BA.debugLine="Data.Columns = columns";
_data.Columns /*anywheresoftware.b4a.objects.collections.List*/  = _columns;
 //BA.debugLineNum = 155;BA.debugLine="Data.Records = payload.Get(\"record\")";
_data.Records /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_payload.Get((Object)("record"))));
 //BA.debugLineNum = 156;BA.debugLine="If Data.Records.IsInitialized = False Then Data.";
if (_data.Records /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
_data.Records /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
 //BA.debugLineNum = 157;BA.debugLine="Data.OldRecord = payload.Get(\"old_record\")";
_data.OldRecord /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_payload.Get((Object)("old_record"))));
 //BA.debugLineNum = 158;BA.debugLine="If Data.OldRecord.IsInitialized = False Then Dat";
if (_data.OldRecord /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
_data.OldRecord /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
 //BA.debugLineNum = 159;BA.debugLine="Data.EventType = payload.Get(\"type\")";
_data.EventType /*String*/  = BA.ObjectToString(_payload.Get((Object)("type")));
 //BA.debugLineNum = 160;BA.debugLine="Data.Table = payload.Get(\"table\")";
_data.Table /*String*/  = BA.ObjectToString(_payload.Get((Object)("table")));
 //BA.debugLineNum = 164;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 165;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 166;BA.debugLine="DatabaseError.Success = payload.Get(\"errors\").As";
_databaseerror.Success /*boolean*/  = ((BA.ObjectToString(_payload.Get((Object)("errors"))))).equals("");
 //BA.debugLineNum = 167;BA.debugLine="If DatabaseError.Success = False Then";
if (_databaseerror.Success /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 168;BA.debugLine="DatabaseError.StatusCode = 401";
_databaseerror.StatusCode /*int*/  = (int) (401);
 //BA.debugLineNum = 169;BA.debugLine="DatabaseError.ErrorMessage = \"User not Authenti";
_databaseerror.ErrorMessage /*String*/  = "User not Authenticated or check your RLS policy!";
 };
 //BA.debugLineNum = 171;BA.debugLine="Data.DatabaseError = DatabaseError";
_data.DatabaseError /*elicorp.pilot.supabase._supabaseerror*/  = _databaseerror;
 //BA.debugLineNum = 173;BA.debugLine="DataReceived(Data)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(_data);
 }else if(_jroot.ContainsKey((Object)("event")) && (_jroot.Get((Object)("event"))).equals((Object)(_m_realtime._subscribetype_broadcast /*String*/ ))) { 
 //BA.debugLineNum = 177;BA.debugLine="Dim BroadcastData As SupabaseRealtime_BroadcastD";
_broadcastdata = new elicorp.pilot.supabase._supabaserealtime_broadcastdata();
 //BA.debugLineNum = 178;BA.debugLine="BroadcastData.Initialize";
_broadcastdata.Initialize();
 //BA.debugLineNum = 179;BA.debugLine="BroadcastData.Event = payload.Get(\"event\")";
_broadcastdata.Event /*String*/  = BA.ObjectToString(_payload.Get((Object)("event")));
 //BA.debugLineNum = 184;BA.debugLine="BroadcastData.Payload = payload.Get(\"payload\")";
_broadcastdata.Payload /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_payload.Get((Object)("payload"))));
 //BA.debugLineNum = 186;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 187;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 188;BA.debugLine="DatabaseError.Success = payload.Get(\"errors\").As";
_databaseerror.Success /*boolean*/  = ((BA.ObjectToString(_payload.Get((Object)("errors"))))).equals("");
 //BA.debugLineNum = 189;BA.debugLine="If DatabaseError.Success = False Then";
if (_databaseerror.Success /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 190;BA.debugLine="DatabaseError.StatusCode = 401";
_databaseerror.StatusCode /*int*/  = (int) (401);
 //BA.debugLineNum = 191;BA.debugLine="DatabaseError.ErrorMessage = \"User not Authenti";
_databaseerror.ErrorMessage /*String*/  = "User not Authenticated or check your RLS policy!";
 };
 //BA.debugLineNum = 193;BA.debugLine="BroadcastData.DatabaseError = DatabaseError";
_broadcastdata.DatabaseError /*elicorp.pilot.supabase._supabaseerror*/  = _databaseerror;
 //BA.debugLineNum = 195;BA.debugLine="BroadcastDataReceived(BroadcastData)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(_broadcastdata);
 }else if(_jroot.ContainsKey((Object)("event")) && (_jroot.Get((Object)("event"))).equals((Object)("presence_diff"))) { 
 //BA.debugLineNum = 199;BA.debugLine="Dim PresenceData As SupabaseRealtime_PresenceDat";
_presencedata = new elicorp.pilot.supabase._supabaserealtime_presencedata();
 //BA.debugLineNum = 200;BA.debugLine="PresenceData.Initialize";
_presencedata.Initialize();
 //BA.debugLineNum = 201;BA.debugLine="PresenceData.Event = payload.Get(\"event\")";
_presencedata.Event /*String*/  = BA.ObjectToString(_payload.Get((Object)("event")));
 //BA.debugLineNum = 203;BA.debugLine="Dim json As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 204;BA.debugLine="json.Initialize(payload.Get(\"joins\"))";
_json.Initialize(BA.ObjectToString(_payload.Get((Object)("joins"))));
 //BA.debugLineNum = 205;BA.debugLine="PresenceData.Joins = json.NextObject";
_presencedata.Joins /*anywheresoftware.b4a.objects.collections.Map*/  = _json.NextObject();
 //BA.debugLineNum = 207;BA.debugLine="json.Initialize(payload.Get(\"leaves\"))";
_json.Initialize(BA.ObjectToString(_payload.Get((Object)("leaves"))));
 //BA.debugLineNum = 208;BA.debugLine="PresenceData.Leaves = json.NextObject";
_presencedata.Leaves /*anywheresoftware.b4a.objects.collections.Map*/  = _json.NextObject();
 //BA.debugLineNum = 210;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 211;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 212;BA.debugLine="DatabaseError.Success = payload.Get(\"errors\").As";
_databaseerror.Success /*boolean*/  = ((BA.ObjectToString(_payload.Get((Object)("errors"))))).equals("");
 //BA.debugLineNum = 213;BA.debugLine="If DatabaseError.Success = False Then";
if (_databaseerror.Success /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 214;BA.debugLine="DatabaseError.StatusCode = 401";
_databaseerror.StatusCode /*int*/  = (int) (401);
 //BA.debugLineNum = 215;BA.debugLine="DatabaseError.ErrorMessage = \"User not Authenti";
_databaseerror.ErrorMessage /*String*/  = "User not Authenticated or check your RLS policy!";
 };
 //BA.debugLineNum = 217;BA.debugLine="PresenceData.DatabaseError = DatabaseError";
_presencedata.DatabaseError /*elicorp.pilot.supabase._supabaseerror*/  = _databaseerror;
 //BA.debugLineNum = 219;BA.debugLine="PresenceDataReceived(PresenceData)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(_presencedata);
 };
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
