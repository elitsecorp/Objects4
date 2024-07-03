package elicorp.pilot;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class supabaserealtime_channel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "elicorp.pilot.supabaserealtime_channel");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", elicorp.pilot.supabaserealtime_channel.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public elicorp.pilot.supabaserealtime_client _m_client = null;
public String _m_topic = "";
public String _m_schemaname = "";
public String _m_tablename = "";
public String _m_filter = "";
public boolean _m_subscribed = false;
public elicorp.pilot.supabase _m_supabase = null;
public anywheresoftware.b4a.objects.collections.List _m_actions = null;
public String _phxevents_join = "";
public String _phxevents_reply = "";
public String _phxevents_leave = "";
public String _phxevents_error = "";
public String _phxevents_close = "";
public b4a.example.dateutils _vvvvvvvvvvv0 = null;
public elicorp.pilot.main _vvvvvvvvvvvv1 = null;
public elicorp.pilot.starter _vvvvvvvvvvvv2 = null;
public elicorp.pilot.httputils2service _vvvvvvvvvvvv3 = null;
public elicorp.pilot.b4xpages _vvvvvvvvvvvv4 = null;
public elicorp.pilot.b4xcollections _vvvvvvvvvvvv5 = null;
public elicorp.pilot.dbutils _vvvvvvvvvvvv6 = null;
public elicorp.pilot.xuiviewsutils _vvvvvvvvvvvv7 = null;
public elicorp.pilot.supabase_functions _supabase_functions = null;
public elicorp.pilot.supabaserealtime_channel  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(boolean _enabled) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Public Sub AcknowledgeBroadcasts(Enabled As Boolea";
 //BA.debugLineNum = 73;BA.debugLine="m_Actions.Get(m_Actions.Size -1).As(Map).Put(\"Ack";
((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_m_actions.Get((int) (_m_actions.getSize()-1))))).Put((Object)("AcknowledgeBroadcasts"),(Object)(_enabled));
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabaserealtime_channel)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private m_Client As SupabaseRealtime_Client";
_m_client = new elicorp.pilot.supabaserealtime_client();
 //BA.debugLineNum = 4;BA.debugLine="Private m_Topic As String";
_m_topic = "";
 //BA.debugLineNum = 5;BA.debugLine="Private m_SchemaName As String = \"public\"";
_m_schemaname = "public";
 //BA.debugLineNum = 6;BA.debugLine="Private m_TableName As String";
_m_tablename = "";
 //BA.debugLineNum = 7;BA.debugLine="Private m_Filter As String = \"\"";
_m_filter = "";
 //BA.debugLineNum = 8;BA.debugLine="Private m_Subscribed As Boolean";
_m_subscribed = false;
 //BA.debugLineNum = 13;BA.debugLine="Private m_Supabase As Supabase";
_m_supabase = new elicorp.pilot.supabase();
 //BA.debugLineNum = 14;BA.debugLine="Private m_Actions As List";
_m_actions = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 16;BA.debugLine="Private Const PhxEvents_JOIN As String = \"phx_joi";
_phxevents_join = "phx_join";
 //BA.debugLineNum = 17;BA.debugLine="Private Const PhxEvents_REPLY  As String = \"phx_r";
_phxevents_reply = "phx_reply";
 //BA.debugLineNum = 18;BA.debugLine="Private Const PhxEvents_LEAVE  As String = \"phx_l";
_phxevents_leave = "phx_leave";
 //BA.debugLineNum = 19;BA.debugLine="Private Const PhxEvents_ERROR  As String = \"phx_e";
_phxevents_error = "phx_error";
 //BA.debugLineNum = 20;BA.debugLine="Private Const PhxEvents_Close  As String = \"phx_c";
_phxevents_close = "phx_close";
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Public Sub Close";
 //BA.debugLineNum = 163;BA.debugLine="m_Client.RemoveChannel(Me)";
_m_client._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ((elicorp.pilot.supabaserealtime_channel)(this));
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.supabaserealtime_channel  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(String _eventname) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Public Sub Event(EventName As String) As SupabaseR";
 //BA.debugLineNum = 60;BA.debugLine="m_Actions.Get(m_Actions.Size -1).As(Map).Put(\"Eve";
((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_m_actions.Get((int) (_m_actions.getSize()-1))))).Put((Object)("Event"),(Object)(_eventname));
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabaserealtime_channel)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public String  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Public Sub getTopic As String";
 //BA.debugLineNum = 37;BA.debugLine="Return \"\"";
if (true) return "";
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,elicorp.pilot.supabaserealtime_client _client,String _topic,String _schemaname,String _tablename,String _filter,elicorp.pilot.supabase _thissupabase) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 25;BA.debugLine="Public Sub Initialize(Client As SupabaseRealtime_C";
 //BA.debugLineNum = 26;BA.debugLine="m_Supabase = ThisSupabase";
_m_supabase = _thissupabase;
 //BA.debugLineNum = 27;BA.debugLine="m_Topic = Topic";
_m_topic = _topic;
 //BA.debugLineNum = 28;BA.debugLine="m_Client = Client";
_m_client = _client;
 //BA.debugLineNum = 29;BA.debugLine="m_SchemaName = SchemaName";
_m_schemaname = _schemaname;
 //BA.debugLineNum = 30;BA.debugLine="m_TableName = TableName";
_m_tablename = _tablename;
 //BA.debugLineNum = 32;BA.debugLine="m_Filter = Filter";
_m_filter = _filter;
 //BA.debugLineNum = 33;BA.debugLine="m_Actions.Initialize";
_m_actions.Initialize();
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.supabaserealtime_channel  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(String _subscribetype) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Public Sub On(SubscribeType As String) As Supabase";
 //BA.debugLineNum = 47;BA.debugLine="m_Actions.Add(CreateMap(\"SubscribeType\":Subscribe";
_m_actions.Add((Object)(__c.createMap(new Object[] {(Object)("SubscribeType"),(Object)(_subscribetype),(Object)("Event"),(Object)("*"),(Object)("ReceiveOwnBroadcasts"),(Object)(__c.False),(Object)("AcknowledgeBroadcasts"),(Object)(__c.False)}).getObject()));
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabaserealtime_channel)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabaserealtime_channel  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(boolean _enabled) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Public Sub ReceiveOwnBroadcasts(Enabled As Boolean";
 //BA.debugLineNum = 67;BA.debugLine="m_Actions.Get(m_Actions.Size -1).As(Map).Put(\"Rec";
((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_m_actions.Get((int) (_m_actions.getSize()-1))))).Put((Object)("ReceiveOwnBroadcasts"),(Object)(_enabled));
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabaserealtime_channel)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(String _eventname,anywheresoftware.b4a.objects.collections.Map _payload) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;
 //BA.debugLineNum = 167;BA.debugLine="Public Sub SendBroadcast(EventName As String,Paylo";
 //BA.debugLineNum = 169;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 170;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 171;BA.debugLine="m.Put(\"event\", \"broadcast\")";
_m.Put((Object)("event"),(Object)("broadcast"));
 //BA.debugLineNum = 172;BA.debugLine="m.Put(\"topic\", m_Topic)";
_m.Put((Object)("topic"),(Object)(_m_topic));
 //BA.debugLineNum = 173;BA.debugLine="m.Put(\"payload\", CreateMap(\"event\":EventName,\"pay";
_m.Put((Object)("payload"),(Object)(__c.createMap(new Object[] {(Object)("event"),(Object)(_eventname),(Object)("payload"),(Object)(_payload.getObject()),(Object)("type"),(Object)("broadcast")}).getObject()));
 //BA.debugLineNum = 174;BA.debugLine="m.Put(\"user_token\",m_Supabase.Auth.TokenInformati";
_m.Put((Object)("user_token"),(Object)(_m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*elicorp.pilot.supabase_authentication._supabasetokeninformations*/ ().AccessToken /*String*/ ));
 //BA.debugLineNum = 175;BA.debugLine="m.Put(\"ref\",\"\")";
_m.Put((Object)("ref"),(Object)(""));
 //BA.debugLineNum = 177;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 178;BA.debugLine="jg.Initialize(m)";
_jg.Initialize(_m);
 //BA.debugLineNum = 180;BA.debugLine="m_Client.SendMessage(jg.ToString)";
_m_client._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*String*/ (_jg.ToString());
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.supabaserealtime_channel  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6() throws Exception{
elicorp.pilot.supabase._supabaseerror _databaseerror = null;
anywheresoftware.b4a.objects.collections.Map _properties = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.Map _mpayload = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;
 //BA.debugLineNum = 94;BA.debugLine="Public Sub Subscribe As SupabaseRealtime_Channel";
 //BA.debugLineNum = 95;BA.debugLine="If m_Subscribed Then";
if (_m_subscribed) { 
 //BA.debugLineNum = 96;BA.debugLine="Log(\"SupabaseRealtimeChannel: Already subscribed";
__c.LogImpl("956164354","SupabaseRealtimeChannel: Already subscribed to topic: "+_m_topic,0);
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabaserealtime_channel)(this);
 }else {
 //BA.debugLineNum = 100;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 101;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 103;BA.debugLine="If m_Supabase.Auth.TokenInformations.AccessToken";
if ((_m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*elicorp.pilot.supabase_authentication._supabasetokeninformations*/ ().AccessToken /*String*/ ).equals("")) { 
 //BA.debugLineNum = 104;BA.debugLine="DatabaseError.StatusCode = 401";
_databaseerror.StatusCode /*int*/  = (int) (401);
 //BA.debugLineNum = 105;BA.debugLine="DatabaseError.ErrorMessage = \"Unauthorized\"";
_databaseerror.ErrorMessage /*String*/  = "Unauthorized";
 };
 //BA.debugLineNum = 109;BA.debugLine="For Each Properties As Map In m_Actions";
_properties = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group11 = _m_actions;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_properties = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group11.Get(index11)));
 //BA.debugLineNum = 111;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 112;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 113;BA.debugLine="m.Put(\"event\", PhxEvents_JOIN)";
_m.Put((Object)("event"),(Object)(_phxevents_join));
 //BA.debugLineNum = 114;BA.debugLine="m.Put(\"topic\", m_Topic)";
_m.Put((Object)("topic"),(Object)(_m_topic));
 //BA.debugLineNum = 115;BA.debugLine="m.Put(\"ref\", \"\")";
_m.Put((Object)("ref"),(Object)(""));
 //BA.debugLineNum = 117;BA.debugLine="Select Properties.Get(\"SubscribeType\")";
switch (BA.switchObjectToInt(_properties.Get((Object)("SubscribeType")),(Object)("postgres_changes"),(Object)("presence"),(Object)("broadcast"))) {
case 0: {
 //BA.debugLineNum = 119;BA.debugLine="Dim mPayload As Map = CreateMap(\"event\":Prope";
_mpayload = new anywheresoftware.b4a.objects.collections.Map();
_mpayload = __c.createMap(new Object[] {(Object)("event"),_properties.Get((Object)("Event")),(Object)("table"),(Object)(_m_tablename),(Object)("schema"),(Object)(_m_schemaname)});
 //BA.debugLineNum = 120;BA.debugLine="If m_Filter <> \"\" Then mPayload.Put(\"filter\",";
if ((_m_filter).equals("") == false) { 
_mpayload.Put((Object)("filter"),(Object)(_m_filter));};
 //BA.debugLineNum = 121;BA.debugLine="m.Put(\"payload\", CreateMap(Properties.Get(\"Su";
_m.Put((Object)("payload"),(Object)(__c.createMap(new Object[] {_properties.Get((Object)("SubscribeType")),(Object)(_mpayload.getObject()),(Object)("user_token"),(Object)(_m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*elicorp.pilot.supabase_authentication._supabasetokeninformations*/ ().AccessToken /*String*/ )}).getObject()));
 break; }
case 1: {
 //BA.debugLineNum = 123;BA.debugLine="Dim mPayload As Map = CreateMap(\"key\":Propert";
_mpayload = new anywheresoftware.b4a.objects.collections.Map();
_mpayload = __c.createMap(new Object[] {(Object)("key"),_properties.Get((Object)("Event"))});
 //BA.debugLineNum = 124;BA.debugLine="m.Put(\"payload\", CreateMap(\"config\": CreateMa";
_m.Put((Object)("payload"),(Object)(__c.createMap(new Object[] {(Object)("config"),(Object)(__c.createMap(new Object[] {_properties.Get((Object)("SubscribeType")),(Object)(_mpayload.getObject()),(Object)("user_token"),(Object)(_m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*elicorp.pilot.supabase_authentication._supabasetokeninformations*/ ().AccessToken /*String*/ )}).getObject())}).getObject()));
 break; }
case 2: {
 //BA.debugLineNum = 126;BA.debugLine="Dim mPayload As Map = CreateMap(\"ack\":Propert";
_mpayload = new anywheresoftware.b4a.objects.collections.Map();
_mpayload = __c.createMap(new Object[] {(Object)("ack"),_properties.Get((Object)("AcknowledgeBroadcasts")),(Object)("self"),_properties.Get((Object)("ReceiveOwnBroadcasts"))});
 //BA.debugLineNum = 127;BA.debugLine="m.Put(\"payload\", CreateMap(\"config\": CreateMa";
_m.Put((Object)("payload"),(Object)(__c.createMap(new Object[] {(Object)("config"),(Object)(__c.createMap(new Object[] {_properties.Get((Object)("SubscribeType")),(Object)(_mpayload.getObject()),(Object)("user_token"),(Object)(_m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*elicorp.pilot.supabase_authentication._supabasetokeninformations*/ ().AccessToken /*String*/ )}).getObject())}).getObject()));
 break; }
}
;
 //BA.debugLineNum = 130;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 131;BA.debugLine="jg.Initialize(m)";
_jg.Initialize(_m);
 //BA.debugLineNum = 133;BA.debugLine="m_Client.SendMessage(jg.ToString)";
_m_client._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*String*/ (_jg.ToString());
 }
};
 };
 //BA.debugLineNum = 138;BA.debugLine="m_Subscribed = True";
_m_subscribed = __c.True;
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabaserealtime_channel)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(anywheresoftware.b4a.objects.collections.Map _userstatus) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;
 //BA.debugLineNum = 188;BA.debugLine="Public Sub Track(UserStatus As Map)";
 //BA.debugLineNum = 190;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 191;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 192;BA.debugLine="m.Put(\"event\", \"track\")";
_m.Put((Object)("event"),(Object)("track"));
 //BA.debugLineNum = 193;BA.debugLine="m.Put(\"type\", \"presence\")";
_m.Put((Object)("type"),(Object)("presence"));
 //BA.debugLineNum = 194;BA.debugLine="m.Put(\"topic\", m_Topic)";
_m.Put((Object)("topic"),(Object)(_m_topic));
 //BA.debugLineNum = 195;BA.debugLine="m.Put(\"payload\", UserStatus)";
_m.Put((Object)("payload"),(Object)(_userstatus.getObject()));
 //BA.debugLineNum = 196;BA.debugLine="m.Put(\"user_token\",m_Supabase.Auth.TokenInformati";
_m.Put((Object)("user_token"),(Object)(_m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*elicorp.pilot.supabase_authentication._supabasetokeninformations*/ ().AccessToken /*String*/ ));
 //BA.debugLineNum = 197;BA.debugLine="m.Put(\"ref\",\"\")";
_m.Put((Object)("ref"),(Object)(""));
 //BA.debugLineNum = 199;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 200;BA.debugLine="jg.Initialize(m)";
_jg.Initialize(_m);
 //BA.debugLineNum = 202;BA.debugLine="m_Client.SendMessage(jg.ToString)";
_m_client._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*String*/ (_jg.ToString());
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.supabaserealtime_channel  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;
 //BA.debugLineNum = 142;BA.debugLine="Public Sub Unsubscribe As SupabaseRealtime_Channel";
 //BA.debugLineNum = 143;BA.debugLine="If m_Subscribed = False Then";
if (_m_subscribed==__c.False) { 
 //BA.debugLineNum = 144;BA.debugLine="Log(\"SupabaseRealtimeChannel: Already unsubscrib";
__c.LogImpl("956229890","SupabaseRealtimeChannel: Already unsubscribed from topic: "+_m_topic,0);
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabaserealtime_channel)(this);
 }else {
 //BA.debugLineNum = 147;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 148;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 149;BA.debugLine="m.Put(\"event\", PhxEvents_LEAVE)";
_m.Put((Object)("event"),(Object)(_phxevents_leave));
 //BA.debugLineNum = 150;BA.debugLine="m.Put(\"topic\", m_Topic)";
_m.Put((Object)("topic"),(Object)(_m_topic));
 //BA.debugLineNum = 151;BA.debugLine="m.Put(\"ref\", \"\")";
_m.Put((Object)("ref"),(Object)(""));
 //BA.debugLineNum = 152;BA.debugLine="m.Put(\"payload\", \"\")";
_m.Put((Object)("payload"),(Object)(""));
 //BA.debugLineNum = 153;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 154;BA.debugLine="jg.Initialize(m)";
_jg.Initialize(_m);
 //BA.debugLineNum = 156;BA.debugLine="m_Client.SendMessage(jg.ToString)";
_m_client._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*String*/ (_jg.ToString());
 };
 //BA.debugLineNum = 158;BA.debugLine="m_Subscribed = False";
_m_subscribed = __c.False;
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabaserealtime_channel)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;
 //BA.debugLineNum = 208;BA.debugLine="Public Sub Untrack";
 //BA.debugLineNum = 210;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 211;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 212;BA.debugLine="m.Put(\"event\", \"untrack\")";
_m.Put((Object)("event"),(Object)("untrack"));
 //BA.debugLineNum = 213;BA.debugLine="m.Put(\"type\", \"presence\")";
_m.Put((Object)("type"),(Object)("presence"));
 //BA.debugLineNum = 214;BA.debugLine="m.Put(\"topic\", m_Topic)";
_m.Put((Object)("topic"),(Object)(_m_topic));
 //BA.debugLineNum = 215;BA.debugLine="m.Put(\"user_token\",m_Supabase.Auth.TokenInformati";
_m.Put((Object)("user_token"),(Object)(_m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*elicorp.pilot.supabase_authentication._supabasetokeninformations*/ ().AccessToken /*String*/ ));
 //BA.debugLineNum = 216;BA.debugLine="m.Put(\"ref\",\"\")";
_m.Put((Object)("ref"),(Object)(""));
 //BA.debugLineNum = 218;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 219;BA.debugLine="jg.Initialize(m)";
_jg.Initialize(_m);
 //BA.debugLineNum = 221;BA.debugLine="m_Client.SendMessage(jg.ToString)";
_m_client._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*String*/ (_jg.ToString());
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
