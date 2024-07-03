package elicorp.pilot;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class supabase extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "elicorp.pilot.supabase");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", elicorp.pilot.supabase.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _m_supabase_url = "";
public String _m_supabase_annon_key = "";
public elicorp.pilot.supabase_authentication _m_authentication = null;
public elicorp.pilot.supabase_database _m_database = null;
public elicorp.pilot.supabase_storage _m_storage = null;
public String _vvvvvvvvvvvvvvv7 = "";
public Object _vvvvvvvvvvvvvvv0 = null;
public boolean _m_logevents = false;
public b4a.example.dateutils _vvvvvvvvvvv0 = null;
public elicorp.pilot.main _vvvvvvvvvvvv1 = null;
public elicorp.pilot.starter _vvvvvvvvvvvv2 = null;
public elicorp.pilot.httputils2service _vvvvvvvvvvvv3 = null;
public elicorp.pilot.b4xpages _vvvvvvvvvvvv4 = null;
public elicorp.pilot.b4xcollections _vvvvvvvvvvvv5 = null;
public elicorp.pilot.dbutils _vvvvvvvvvvvv6 = null;
public elicorp.pilot.xuiviewsutils _vvvvvvvvvvvv7 = null;
public elicorp.pilot.supabase_functions _supabase_functions = null;
public static class _supabaseuser{
public boolean IsInitialized;
public String Id;
public String Aud;
public String Role;
public String Email;
public String Phone;
public long ConfirmationSentAt;
public long EmailConfirmedAt;
public long ConfirmedAt;
public long LastSignInAt;
public long CreatedAt;
public long UpdatedAt;
public anywheresoftware.b4a.objects.collections.JSONParser.JSONConverter json;
public elicorp.pilot.supabase._supabaseerror Error;
public anywheresoftware.b4a.objects.collections.Map Metadata;
public void Initialize() {
IsInitialized = true;
Id = "";
Aud = "";
Role = "";
Email = "";
Phone = "";
ConfirmationSentAt = 0L;
EmailConfirmedAt = 0L;
ConfirmedAt = 0L;
LastSignInAt = 0L;
CreatedAt = 0L;
UpdatedAt = 0L;
json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONConverter();
Error = new elicorp.pilot.supabase._supabaseerror();
Metadata = new anywheresoftware.b4a.objects.collections.Map();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _supabasedatabaseresult{
public boolean IsInitialized;
public Object Tag;
public anywheresoftware.b4a.objects.collections.Map Columns;
public anywheresoftware.b4a.objects.collections.List Rows;
public elicorp.pilot.supabase._supabaseerror Error;
public void Initialize() {
IsInitialized = true;
Tag = new Object();
Columns = new anywheresoftware.b4a.objects.collections.Map();
Rows = new anywheresoftware.b4a.objects.collections.List();
Error = new elicorp.pilot.supabase._supabaseerror();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _supabasestorageresult{
public boolean IsInitialized;
public elicorp.pilot.supabase._supabaseerror Error;
public void Initialize() {
IsInitialized = true;
Error = new elicorp.pilot.supabase._supabaseerror();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _supabaseerror{
public boolean IsInitialized;
public boolean Success;
public int StatusCode;
public String ErrorMessage;
public void Initialize() {
IsInitialized = true;
Success = false;
StatusCode = 0;
ErrorMessage = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _supabasestoragebucket{
public boolean IsInitialized;
public String Id;
public String Name;
public boolean isPublic;
public int FileSizeLimit;
public anywheresoftware.b4a.objects.collections.List AllowedMimeTypes;
public String Owner;
public long CreatedAt;
public long UpdatedAt;
public elicorp.pilot.supabase._supabaseerror Error;
public void Initialize() {
IsInitialized = true;
Id = "";
Name = "";
isPublic = false;
FileSizeLimit = 0;
AllowedMimeTypes = new anywheresoftware.b4a.objects.collections.List();
Owner = "";
CreatedAt = 0L;
UpdatedAt = 0L;
Error = new elicorp.pilot.supabase._supabaseerror();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _supabasestoragefile{
public boolean IsInitialized;
public String Id;
public String Key;
public byte[] FileBody;
public String PublicUrl;
public String SignedURL;
public elicorp.pilot.supabase._supabaseerror Error;
public void Initialize() {
IsInitialized = true;
Id = "";
Key = "";
FileBody = new byte[0];
;
PublicUrl = "";
SignedURL = "";
Error = new elicorp.pilot.supabase._supabaseerror();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _supabaserealtime_data{
public boolean IsInitialized;
public String Schema;
public long CommitTimestamp;
public anywheresoftware.b4a.objects.collections.List Columns;
public anywheresoftware.b4a.objects.collections.Map Records;
public anywheresoftware.b4a.objects.collections.Map OldRecord;
public String EventType;
public elicorp.pilot.supabase._supabaseerror DatabaseError;
public String Table;
public void Initialize() {
IsInitialized = true;
Schema = "";
CommitTimestamp = 0L;
Columns = new anywheresoftware.b4a.objects.collections.List();
Records = new anywheresoftware.b4a.objects.collections.Map();
OldRecord = new anywheresoftware.b4a.objects.collections.Map();
EventType = "";
DatabaseError = new elicorp.pilot.supabase._supabaseerror();
Table = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _supabaserealtime_broadcastdata{
public boolean IsInitialized;
public String Event;
public anywheresoftware.b4a.objects.collections.Map Payload;
public elicorp.pilot.supabase._supabaseerror DatabaseError;
public void Initialize() {
IsInitialized = true;
Event = "";
Payload = new anywheresoftware.b4a.objects.collections.Map();
DatabaseError = new elicorp.pilot.supabase._supabaseerror();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _supabaserealtime_presencedata{
public boolean IsInitialized;
public String Event;
public anywheresoftware.b4a.objects.collections.Map Joins;
public anywheresoftware.b4a.objects.collections.Map Leaves;
public elicorp.pilot.supabase._supabaseerror DatabaseError;
public void Initialize() {
IsInitialized = true;
Event = "";
Joins = new anywheresoftware.b4a.objects.collections.Map();
Leaves = new anywheresoftware.b4a.objects.collections.Map();
DatabaseError = new elicorp.pilot.supabase._supabaseerror();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 135;BA.debugLine="Private m_SUPABASE_URL As String";
_m_supabase_url = "";
 //BA.debugLineNum = 136;BA.debugLine="Private m_SUPABASE_ANNON_KEY As String";
_m_supabase_annon_key = "";
 //BA.debugLineNum = 138;BA.debugLine="Type SupabaseUser(Id As String,Aud As String,Role";
;
 //BA.debugLineNum = 139;BA.debugLine="Type SupabaseDatabaseResult(Tag As Object,Columns";
;
 //BA.debugLineNum = 140;BA.debugLine="Type SupabaseStorageResult(Error As SupabaseError";
;
 //BA.debugLineNum = 141;BA.debugLine="Type SupabaseError(Success As Boolean,StatusCode";
;
 //BA.debugLineNum = 143;BA.debugLine="Type SupabaseStorageBucket(Id As String,Name As S";
;
 //BA.debugLineNum = 144;BA.debugLine="Type SupabaseStorageFile(Id As String,Key As Stri";
;
 //BA.debugLineNum = 146;BA.debugLine="Type SupabaseRealtime_Data(Schema As String,Commi";
;
 //BA.debugLineNum = 147;BA.debugLine="Type SupabaseRealtime_BroadcastData(Event As Stri";
;
 //BA.debugLineNum = 148;BA.debugLine="Type SupabaseRealtime_PresenceData(Event As Strin";
;
 //BA.debugLineNum = 150;BA.debugLine="Private m_Authentication As Supabase_Authenticati";
_m_authentication = new elicorp.pilot.supabase_authentication();
 //BA.debugLineNum = 151;BA.debugLine="Private m_Database As Supabase_Database";
_m_database = new elicorp.pilot.supabase_database();
 //BA.debugLineNum = 152;BA.debugLine="Private m_Storage As Supabase_Storage";
_m_storage = new elicorp.pilot.supabase_storage();
 //BA.debugLineNum = 154;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvv7 = "";
 //BA.debugLineNum = 155;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvv0 = new Object();
 //BA.debugLineNum = 156;BA.debugLine="Private m_LogEvents As Boolean = False";
_m_logevents = __c.False;
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
public String  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6() throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Public Sub getApiKey As String";
 //BA.debugLineNum = 188;BA.debugLine="Return m_SUPABASE_ANNON_KEY";
if (true) return _m_supabase_annon_key;
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.supabase_authentication  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Public Sub getAuth As Supabase_Authentication";
 //BA.debugLineNum = 192;BA.debugLine="Return m_Authentication";
if (true) return _m_authentication;
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_database  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Public Sub getDatabase As Supabase_Database";
 //BA.debugLineNum = 196;BA.debugLine="Return m_Database";
if (true) return _m_database;
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public boolean  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Public Sub getLogEvents As Boolean";
 //BA.debugLineNum = 180;BA.debugLine="Return m_LogEvents";
if (true) return _m_logevents;
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return false;
}
public elicorp.pilot.supabase_storage  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Public Sub getStorage As Supabase_Storage";
 //BA.debugLineNum = 200;BA.debugLine="Return m_Storage";
if (true) return _m_storage;
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public String  _getvvvvvvvvvvvvvvvvvvvv6() throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Public Sub getURL As String";
 //BA.debugLineNum = 184;BA.debugLine="Return m_SUPABASE_URL";
if (true) return _m_supabase_url;
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,String _url,String _anonkey) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 160;BA.debugLine="Public Sub Initialize(URL As String,AnonKey As Str";
 //BA.debugLineNum = 161;BA.debugLine="m_SUPABASE_URL = URL";
_m_supabase_url = _url;
 //BA.debugLineNum = 162;BA.debugLine="m_SUPABASE_ANNON_KEY = AnonKey";
_m_supabase_annon_key = _anonkey;
 //BA.debugLineNum = 164;BA.debugLine="m_Authentication.Initialize(Me,\"Supabase\")";
_m_authentication._initialize /*String*/ (ba,(elicorp.pilot.supabase)(this),"Supabase");
 //BA.debugLineNum = 165;BA.debugLine="m_Database.Initialize(Me)";
_m_database._initialize /*String*/ (ba,(elicorp.pilot.supabase)(this));
 //BA.debugLineNum = 166;BA.debugLine="m_Storage.Initialize(Me)";
_m_storage._initialize /*String*/ (ba,(elicorp.pilot.supabase)(this));
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(Object _callback,String _eventname) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Public Sub InitializeEvents(Callback As Object, Ev";
 //BA.debugLineNum = 171;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvv7 = _eventname;
 //BA.debugLineNum = 172;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvv0 = _callback;
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(boolean _enabled) throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Public Sub setLogEvents(Enabled As Boolean)";
 //BA.debugLineNum = 176;BA.debugLine="m_LogEvents = Enabled";
_m_logevents = _enabled;
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return "";
}
public String  _supabase_authstatechange(String _statetype) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Private Sub Supabase_AuthStateChange(StateType As";
 //BA.debugLineNum = 206;BA.debugLine="If Supabase_Functions.SubExists2(mCallBack,mEvent";
if (_supabase_functions._vvvvvvvvv1 /*boolean*/ (getActivityBA(),_vvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvv7+"_AuthStateChange",(int) (1))) { 
 //BA.debugLineNum = 207;BA.debugLine="CallSub2(mCallBack,mEventName & \"_AuthStateChang";
__c.CallSubNew2(ba,_vvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvv7+"_AuthStateChange",(Object)(_statetype));
 };
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
