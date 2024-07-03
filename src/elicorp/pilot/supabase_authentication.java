package elicorp.pilot;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class supabase_authentication extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "elicorp.pilot.supabase_authentication");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", elicorp.pilot.supabase_authentication.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public elicorp.pilot.supabase _m_supabase = null;
public elicorp.pilot.supabase_authentication._supabasetokeninformations _sti_token = null;
public elicorp.pilot.supabase._supabaseuser _m_user = null;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = "";
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
public String _vvvvvvvvvvvvvvv7 = "";
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "";
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "";
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "";
public anywheresoftware.b4a.objects.IntentWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
public String _m_clientsecret = "";
public b4a.example.dateutils _vvvvvvvvvvv0 = null;
public elicorp.pilot.main _vvvvvvvvvvvv1 = null;
public elicorp.pilot.starter _vvvvvvvvvvvv2 = null;
public elicorp.pilot.httputils2service _vvvvvvvvvvvv3 = null;
public elicorp.pilot.b4xpages _vvvvvvvvvvvv4 = null;
public elicorp.pilot.b4xcollections _vvvvvvvvvvvv5 = null;
public elicorp.pilot.dbutils _vvvvvvvvvvvv6 = null;
public elicorp.pilot.xuiviewsutils _vvvvvvvvvvvv7 = null;
public elicorp.pilot.supabase_functions _supabase_functions = null;
public static class _supabasetokeninformations{
public boolean IsInitialized;
public String AccessToken;
public String RefreshToken;
public long AccessExpiry;
public boolean Valid;
public String TokenType;
public String Email;
public Object Tag;
public void Initialize() {
IsInitialized = true;
AccessToken = "";
RefreshToken = "";
AccessExpiry = 0L;
Valid = false;
TokenType = "";
Email = "";
Tag = new Object();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(String _s) throws Exception{
 //BA.debugLineNum = 824;BA.debugLine="Private Sub AddClientSecret (s As String) As Strin";
 //BA.debugLineNum = 825;BA.debugLine="If m_ClientSecret <> \"\" Then";
if ((_m_clientsecret).equals("") == false) { 
 //BA.debugLineNum = 826;BA.debugLine="s = s & \"&client_secret=\" & m_ClientSecret";
_s = _s+"&client_secret="+_m_clientsecret;
 };
 //BA.debugLineNum = 828;BA.debugLine="Return s";
if (true) return _s;
 //BA.debugLineNum = 829;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(String _statetype) throws Exception{
 //BA.debugLineNum = 669;BA.debugLine="Private Sub AuthStateChange(StateType As String)";
 //BA.debugLineNum = 670;BA.debugLine="If Supabase_Functions.SubExists2(m_Supabase,mEven";
if (_supabase_functions._vvvvvvvvv1 /*boolean*/ (getActivityBA(),(Object)(_m_supabase),_vvvvvvvvvvvvvvv7+"_AuthStateChange",(int) (1))) { 
 //BA.debugLineNum = 671;BA.debugLine="CallSub2(m_Supabase,mEventName & \"_AuthStateChan";
__c.CallSubNew2(ba,(Object)(_m_supabase),_vvvvvvvvvvvvvvv7+"_AuthStateChange",(Object)(_statetype));
 };
 //BA.debugLineNum = 673;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(String _url,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
anywheresoftware.b4a.objects.StringUtils _su = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _k = "";
 //BA.debugLineNum = 792;BA.debugLine="Private Sub BuildLink(Url As String, Params As Map";
 //BA.debugLineNum = 793;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
 //BA.debugLineNum = 794;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 795;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 796;BA.debugLine="sb.Append(Url)";
_sb.Append(_url);
 //BA.debugLineNum = 797;BA.debugLine="If Params.Size > 0 Then";
if (_params.getSize()>0) { 
 //BA.debugLineNum = 798;BA.debugLine="sb.Append(\"&\")";
_sb.Append("&");
 //BA.debugLineNum = 799;BA.debugLine="For Each k As String In Params.Keys";
{
final anywheresoftware.b4a.BA.IterableList group7 = _params.Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_k = BA.ObjectToString(group7.Get(index7));
 //BA.debugLineNum = 800;BA.debugLine="sb.Append(su.EncodeUrl(k, \"utf8\")).Append(\"=\").";
_sb.Append(_su.EncodeUrl(_k,"utf8")).Append("=").Append(_su.EncodeUrl(BA.ObjectToString(_params.Get((Object)(_k))),"utf8"));
 //BA.debugLineNum = 801;BA.debugLine="sb.Append(\"&\")";
_sb.Append("&");
 }
};
 //BA.debugLineNum = 803;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
 };
 //BA.debugLineNum = 805;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 806;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(anywheresoftware.b4a.objects.IntentWrapper _intent) throws Exception{
 //BA.debugLineNum = 757;BA.debugLine="Public Sub CallFromResume(Intent As Intent)";
 //BA.debugLineNum = 758;BA.debugLine="If IsNewOAuth2Intent(Intent) Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(_intent)) { 
 //BA.debugLineNum = 759;BA.debugLine="LastIntent = Intent";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _intent;
 //BA.debugLineNum = 760;BA.debugLine="ParseBrowserUrl(Intent.GetData)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(_intent.GetData());
 };
 //BA.debugLineNum = 762;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Private Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private m_Supabase As Supabase";
_m_supabase = new elicorp.pilot.supabase();
 //BA.debugLineNum = 4;BA.debugLine="Type SupabaseTokenInformations (AccessToken As St";
;
 //BA.debugLineNum = 5;BA.debugLine="Private sti_Token As SupabaseTokenInformations";
_sti_token = new elicorp.pilot.supabase_authentication._supabasetokeninformations();
 //BA.debugLineNum = 7;BA.debugLine="Private m_User As SupabaseUser 'Ignore";
_m_user = new elicorp.pilot.supabase._supabaseuser();
 //BA.debugLineNum = 9;BA.debugLine="Private Const TokenFile As String = \"supabaseauth";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = "supabaseauthtoken.dat";
 //BA.debugLineNum = 10;BA.debugLine="Private TokenFolder As String";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
 //BA.debugLineNum = 12;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvv7 = "";
 //BA.debugLineNum = 16;BA.debugLine="Private CurrentClientId As String";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "";
 //BA.debugLineNum = 17;BA.debugLine="Private CurrentProvider As String";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "";
 //BA.debugLineNum = 18;BA.debugLine="Private packageName As String 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "";
 //BA.debugLineNum = 20;BA.debugLine="Private LastIntent As Intent";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.IntentWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private m_ClientSecret As String";
_m_clientsecret = "";
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.supabase._supabaseuser  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(anywheresoftware.b4a.objects.collections.Map _m_resultmap) throws Exception{
elicorp.pilot.supabase._supabaseuser _user = null;
 //BA.debugLineNum = 281;BA.debugLine="Private Sub FillUserObject(m_ResultMap As Map) As";
 //BA.debugLineNum = 282;BA.debugLine="Dim User As SupabaseUser";
_user = new elicorp.pilot.supabase._supabaseuser();
 //BA.debugLineNum = 283;BA.debugLine="User.Initialize";
_user.Initialize();
 //BA.debugLineNum = 285;BA.debugLine="User.Id = m_ResultMap.Get(\"id\")";
_user.Id /*String*/  = BA.ObjectToString(_m_resultmap.Get((Object)("id")));
 //BA.debugLineNum = 286;BA.debugLine="User.Aud = m_ResultMap.Get(\"aud\")";
_user.Aud /*String*/  = BA.ObjectToString(_m_resultmap.Get((Object)("aud")));
 //BA.debugLineNum = 287;BA.debugLine="User.role = m_ResultMap.Get(\"role\")";
_user.Role /*String*/  = BA.ObjectToString(_m_resultmap.Get((Object)("role")));
 //BA.debugLineNum = 288;BA.debugLine="User.email = m_ResultMap.Get(\"email\")";
_user.Email /*String*/  = BA.ObjectToString(_m_resultmap.Get((Object)("email")));
 //BA.debugLineNum = 289;BA.debugLine="User.phone = m_ResultMap.Get(\"phone\")";
_user.Phone /*String*/  = BA.ObjectToString(_m_resultmap.Get((Object)("phone")));
 //BA.debugLineNum = 291;BA.debugLine="User.confirmationsentat = Supabase_Functions.Pars";
_user.ConfirmationSentAt /*long*/  = _supabase_functions._vvvvvvvv0 /*long*/ (getActivityBA(),BA.ObjectToString(_m_resultmap.Get((Object)("confirmation_sent_at"))));
 //BA.debugLineNum = 292;BA.debugLine="User.createdat = Supabase_Functions.ParseDateTime";
_user.CreatedAt /*long*/  = _supabase_functions._vvvvvvvv0 /*long*/ (getActivityBA(),BA.ObjectToString(_m_resultmap.Get((Object)("created_at"))));
 //BA.debugLineNum = 293;BA.debugLine="User.updatedat = Supabase_Functions.ParseDateTime";
_user.UpdatedAt /*long*/  = _supabase_functions._vvvvvvvv0 /*long*/ (getActivityBA(),BA.ObjectToString(_m_resultmap.Get((Object)("updated_at"))));
 //BA.debugLineNum = 294;BA.debugLine="If m_ResultMap.ContainsKey(\"user_metadata\") Then";
if (_m_resultmap.ContainsKey((Object)("user_metadata"))) { 
_user.Metadata /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_m_resultmap.Get((Object)("user_metadata"))));};
 //BA.debugLineNum = 296;BA.debugLine="Return User";
if (true) return _user;
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws Exception{
ResumableSub_GetAccessToken rsub = new ResumableSub_GetAccessToken(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetAccessToken extends BA.ResumableSub {
public ResumableSub_GetAccessToken(elicorp.pilot.supabase_authentication parent) {
this.parent = parent;
}
elicorp.pilot.supabase_authentication parent;
boolean _success = false;

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
 //BA.debugLineNum = 163;BA.debugLine="If sti_Token.Valid = False Then";
if (true) break;

case 1:
//if
this.state = 24;
if (parent._sti_token.Valid /*boolean*/ ==parent.__c.False) { 
this.state = 3;
}else if(parent._sti_token.AccessExpiry /*long*/ <parent.__c.DateTime.getNow()) { 
this.state = 11;
}else {
this.state = 23;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 164;BA.debugLine="sti_Token.AccessToken = \"\"";
parent._sti_token.AccessToken /*String*/  = "";
 //BA.debugLineNum = 165;BA.debugLine="SaveToken";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 166;BA.debugLine="If m_Supabase.LogEvents Then Log(\"SupabaseAuth:";
if (true) break;

case 4:
//if
this.state = 9;
if (parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*boolean*/ ()) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
parent.__c.LogImpl("958458116","SupabaseAuth: User is logged out, this user must log in again",0);
if (true) break;

case 9:
//C
this.state = 24;
;
 //BA.debugLineNum = 167;BA.debugLine="AuthStateChange(\"signedOut\")";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("signedOut");
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 173;BA.debugLine="Wait For (RefreshToken) Complete (Success As Boo";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6());
this.state = 25;
return;
case 25:
//C
this.state = 12;
_success = (Boolean) result[0];
;
 //BA.debugLineNum = 174;BA.debugLine="If Success = False Then";
if (true) break;

case 12:
//if
this.state = 21;
if (_success==parent.__c.False) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 175;BA.debugLine="sti_Token.AccessToken = \"\"";
parent._sti_token.AccessToken /*String*/  = "";
 //BA.debugLineNum = 176;BA.debugLine="SaveToken";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 177;BA.debugLine="If m_Supabase.LogEvents Then Log(\"SupabaseAuth:";
if (true) break;

case 15:
//if
this.state = 20;
if (parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*boolean*/ ()) { 
this.state = 17;
;}if (true) break;

case 17:
//C
this.state = 20;
parent.__c.LogImpl("958458127","SupabaseAuth: Access token could not be renewed",0);
if (true) break;

case 20:
//C
this.state = 21;
;
 //BA.debugLineNum = 178;BA.debugLine="AuthStateChange(\"signedOut\")";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("signedOut");
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
 if (true) break;

case 24:
//C
this.state = -1;
;
 //BA.debugLineNum = 183;BA.debugLine="Return sti_Token.AccessToken";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent._sti_token.AccessToken /*String*/ ));return;};
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(boolean _success) throws Exception{
}
public String  _getprovider_apple() throws Exception{
 //BA.debugLineNum = 934;BA.debugLine="Public Sub getProvider_Apple As String";
 //BA.debugLineNum = 935;BA.debugLine="Return \"apple\"";
if (true) return "apple";
 //BA.debugLineNum = 936;BA.debugLine="End Sub";
return "";
}
public String  _getprovider_google() throws Exception{
 //BA.debugLineNum = 929;BA.debugLine="Public Sub getProvider_Google As String";
 //BA.debugLineNum = 930;BA.debugLine="Return \"google\"";
if (true) return "google";
 //BA.debugLineNum = 931;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 784;BA.debugLine="Private Sub GetRedirectUri As String";
 //BA.debugLineNum = 788;BA.debugLine="Return packageName & \":/oath\"";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2+":/oath";
 //BA.debugLineNum = 790;BA.debugLine="End Sub";
return "";
}
public void  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(String _code) throws Exception{
ResumableSub_GetTokenFromGoogleAuthorizationCode rsub = new ResumableSub_GetTokenFromGoogleAuthorizationCode(this,_code);
rsub.resume(ba, null);
}
public static class ResumableSub_GetTokenFromGoogleAuthorizationCode extends BA.ResumableSub {
public ResumableSub_GetTokenFromGoogleAuthorizationCode(elicorp.pilot.supabase_authentication parent,String _code) {
this.parent = parent;
this._code = _code;
}
elicorp.pilot.supabase_authentication parent;
String _code;
elicorp.pilot.httpjob _j = null;
String _poststring = "";
anywheresoftware.b4a.objects.collections.Map _tmp_result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 860;BA.debugLine="Dim j As HttpJob";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 861;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 862;BA.debugLine="Dim postString As String = $\"code=${Code}&client_";
_poststring = ("code="+parent.__c.SmartStringFormatter("",(Object)(_code))+"&client_id="+parent.__c.SmartStringFormatter("",(Object)(parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0))+"&grant_type=authorization_code&redirect_uri="+parent.__c.SmartStringFormatter("",(Object)(parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5()))+"");
 //BA.debugLineNum = 863;BA.debugLine="postString = AddClientSecret(postString)";
_poststring = parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(_poststring);
 //BA.debugLineNum = 864;BA.debugLine="j.PostString(\"https://www.googleapis.com/oauth2/v";
_j._vvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ("https://www.googleapis.com/oauth2/v4/token",_poststring);
 //BA.debugLineNum = 866;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 867;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 869;BA.debugLine="Dim tmp_result As Map = Supabase_Functions.Gener";
_tmp_result = new anywheresoftware.b4a.objects.collections.Map();
_tmp_result = parent._supabase_functions._vvvvvvvv1 /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_j);
 //BA.debugLineNum = 871;BA.debugLine="GetTokenFromSupabase(tmp_result.Get(\"id_token\"))";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(BA.ObjectToString(_tmp_result.Get((Object)("id_token"))));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 874;BA.debugLine="Logout";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3();
 //BA.debugLineNum = 875;BA.debugLine="CallSubDelayed2(Me,\"OAuthTokenReceived\",False)";
parent.__c.CallSubDelayed2(ba,parent,"OAuthTokenReceived",(Object)(parent.__c.False));
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 877;BA.debugLine="j.Release";
_j._vvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ();
 //BA.debugLineNum = 878;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(elicorp.pilot.httpjob _j) throws Exception{
}
public void  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(String _idtoken) throws Exception{
ResumableSub_GetTokenFromSupabase rsub = new ResumableSub_GetTokenFromSupabase(this,_idtoken);
rsub.resume(ba, null);
}
public static class ResumableSub_GetTokenFromSupabase extends BA.ResumableSub {
public ResumableSub_GetTokenFromSupabase(elicorp.pilot.supabase_authentication parent,String _idtoken) {
this.parent = parent;
this._idtoken = _idtoken;
}
elicorp.pilot.supabase_authentication parent;
String _idtoken;
elicorp.pilot.httpjob _j = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 833;BA.debugLine="Dim j As HttpJob";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 834;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 836;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 837;BA.debugLine="json.Initialize(CreateMap(\"id_token\":IdToken,\"pro";
_json.Initialize(parent.__c.createMap(new Object[] {(Object)("id_token"),(Object)(_idtoken),(Object)("provider"),(Object)(parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1)}));
 //BA.debugLineNum = 840;BA.debugLine="j.PostString($\"${m_Supabase.URL}/auth/v1/token?gr";
_j._vvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ((""+parent.__c.SmartStringFormatter("",(Object)(parent._m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/auth/v1/token?grant_type=id_token"),_json.ToString());
 //BA.debugLineNum = 841;BA.debugLine="j.GetRequest.SetHeader(\"apikey\",m_Supabase.ApiKey";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("apikey",parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ());
 //BA.debugLineNum = 842;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 844;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 845;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 846;BA.debugLine="TokenInformationFromResponse(Supabase_Functions.";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(parent._supabase_functions._vvvvvvvv1 /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_j));
 //BA.debugLineNum = 847;BA.debugLine="CallSubDelayed2(Me,\"OAuthTokenReceived\",True)";
parent.__c.CallSubDelayed2(ba,parent,"OAuthTokenReceived",(Object)(parent.__c.True));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 849;BA.debugLine="Logout";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3();
 //BA.debugLineNum = 850;BA.debugLine="CallSubDelayed2(Me,\"OAuthTokenReceived\",False)";
parent.__c.CallSubDelayed2(ba,parent,"OAuthTokenReceived",(Object)(parent.__c.False));
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 852;BA.debugLine="j.Release";
_j._vvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ();
 //BA.debugLineNum = 854;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
ResumableSub_GetUser rsub = new ResumableSub_GetUser(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetUser extends BA.ResumableSub {
public ResumableSub_GetUser(elicorp.pilot.supabase_authentication parent) {
this.parent = parent;
}
elicorp.pilot.supabase_authentication parent;
elicorp.pilot.supabase._supabaseerror _databaseerror = null;
String _accesstoken = "";
String _url = "";
elicorp.pilot.httpjob _j = null;
anywheresoftware.b4a.objects.collections.Map _m_resultmap = null;

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
 //BA.debugLineNum = 464;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 465;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 467;BA.debugLine="If m_User.IsInitialized = False Or m_User.Id = \"\"";
if (true) break;

case 1:
//if
this.state = 8;
if (parent._m_user.IsInitialized /*boolean*/ ==parent.__c.False || (parent._m_user.Id /*String*/ ).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 469;BA.debugLine="Wait For (m_Supabase.Auth.GetAccessToken) Comple";
parent.__c.WaitFor("complete", ba, this, parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 9;
return;
case 9:
//C
this.state = 4;
_accesstoken = (String) result[0];
;
 //BA.debugLineNum = 471;BA.debugLine="Dim url As String = $\"${m_Supabase.URL}/auth/v1/";
_url = (""+parent.__c.SmartStringFormatter("",(Object)(parent._m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/auth/v1/user");
 //BA.debugLineNum = 474;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 474;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 475;BA.debugLine="j.Download(url)";
_j._vvvvvvvvvvvvvvvvvvvvv2 /*String*/ (_url);
 //BA.debugLineNum = 476;BA.debugLine="j.GetRequest.SetHeader(\"apikey\",m_Supabase.ApiKe";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("apikey",parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ());
 //BA.debugLineNum = 477;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_accesstoken);
 //BA.debugLineNum = 479;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 10;
return;
case 10:
//C
this.state = 4;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 481;BA.debugLine="DatabaseError.Success = j.Success";
_databaseerror.Success /*boolean*/  = _j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ;
 //BA.debugLineNum = 483;BA.debugLine="If j.Success = False Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ==parent.__c.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 484;BA.debugLine="DatabaseError.StatusCode = j.Response.StatusCod";
_databaseerror.StatusCode /*int*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv6 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode();
 //BA.debugLineNum = 485;BA.debugLine="DatabaseError.ErrorMessage = j.ErrorMessage";
_databaseerror.ErrorMessage /*String*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ;
 if (true) break;

case 7:
//C
this.state = 8;
;
 //BA.debugLineNum = 488;BA.debugLine="Dim m_ResultMap As Map = Supabase_Functions.Gene";
_m_resultmap = new anywheresoftware.b4a.objects.collections.Map();
_m_resultmap = parent._supabase_functions._vvvvvvvv1 /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_j);
 //BA.debugLineNum = 490;BA.debugLine="m_User = FillUserObject(m_ResultMap)";
parent._m_user = parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(_m_resultmap);
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 494;BA.debugLine="m_User.Error = DatabaseError";
parent._m_user.Error /*elicorp.pilot.supabase._supabaseerror*/  = _databaseerror;
 //BA.debugLineNum = 495;BA.debugLine="Return m_User";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent._m_user));return;};
 //BA.debugLineNum = 497;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(anywheresoftware.b4a.BA _ba,elicorp.pilot.supabase _thissupabase,String _eventname) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4a.randomaccessfile.RandomAccessFile _raf = null;
 //BA.debugLineNum = 43;BA.debugLine="Public Sub Initialize(ThisSupabase As Supabase, Ev";
 //BA.debugLineNum = 44;BA.debugLine="m_Supabase = ThisSupabase";
_m_supabase = _thissupabase;
 //BA.debugLineNum = 45;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvv7 = _eventname;
 //BA.debugLineNum = 48;BA.debugLine="packageName = Application.PackageName";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = __c.Application.getPackageName();
 //BA.debugLineNum = 49;BA.debugLine="TokenFolder = File.DirInternal";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = __c.File.getDirInternal();
 //BA.debugLineNum = 57;BA.debugLine="If File.Exists(TokenFolder, TokenFile) Then";
if (__c.File.Exists(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6)) { 
 //BA.debugLineNum = 58;BA.debugLine="Dim raf As RandomAccessFile";
_raf = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
 //BA.debugLineNum = 59;BA.debugLine="raf.Initialize(TokenFolder, TokenFile, True)";
_raf.Initialize(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,__c.True);
 //BA.debugLineNum = 60;BA.debugLine="If raf.Size <> 0 Then";
if (_raf.getSize()!=0) { 
 //BA.debugLineNum = 61;BA.debugLine="sti_Token = raf.ReadB4XObject(raf.CurrentPositi";
_sti_token = (elicorp.pilot.supabase_authentication._supabasetokeninformations)(_raf.ReadB4XObject(_raf.CurrentPosition));
 };
 //BA.debugLineNum = 63;BA.debugLine="raf.Close";
_raf.Close();
 };
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public boolean  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(anywheresoftware.b4a.objects.IntentWrapper _intent) throws Exception{
 //BA.debugLineNum = 764;BA.debugLine="Private Sub IsNewOAuth2Intent(Intent As Intent) As";
 //BA.debugLineNum = 765;BA.debugLine="Return Intent.IsInitialized And Intent <> LastInt";
if (true) return _intent.IsInitialized() && (_intent).equals(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) == false && (_intent.getAction()).equals(_intent.ACTION_VIEW) && _intent.GetData()!= null && _intent.GetData().startsWith(__c.Application.getPackageName());
 //BA.debugLineNum = 767;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws Exception{
ResumableSub_isUserLoggedIn rsub = new ResumableSub_isUserLoggedIn(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_isUserLoggedIn extends BA.ResumableSub {
public ResumableSub_isUserLoggedIn(elicorp.pilot.supabase_authentication parent) {
this.parent = parent;
}
elicorp.pilot.supabase_authentication parent;
String _accesstoken = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
 //BA.debugLineNum = 71;BA.debugLine="Wait For (m_Supabase.Auth.GetAccessToken) Complet";
parent.__c.WaitFor("complete", ba, this, parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 1;
return;
case 1:
//C
this.state = -1;
_accesstoken = (String) result[0];
;
 //BA.debugLineNum = 72;BA.debugLine="Return AccessToken <> \"\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)((_accesstoken).equals("") == false));return;};
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _login_emailpassword(String _email,String _password) throws Exception{
ResumableSub_Login_EmailPassword rsub = new ResumableSub_Login_EmailPassword(this,_email,_password);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Login_EmailPassword extends BA.ResumableSub {
public ResumableSub_Login_EmailPassword(elicorp.pilot.supabase_authentication parent,String _email,String _password) {
this.parent = parent;
this._email = _email;
this._password = _password;
}
elicorp.pilot.supabase_authentication parent;
String _email;
String _password;
String _url = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
elicorp.pilot.httpjob _j = null;
anywheresoftware.b4a.objects.collections.Map _m_resultmap = null;
elicorp.pilot.supabase._supabaseuser _user = null;
elicorp.pilot.supabase._supabaseerror _databaseerror = null;
anywheresoftware.b4a.objects.collections.Map _muser = null;

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
 //BA.debugLineNum = 310;BA.debugLine="Dim url As String = $\"${m_Supabase.URL}/auth/v1/t";
_url = (""+parent.__c.SmartStringFormatter("",(Object)(parent._m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/auth/v1/token?grant_type=password");
 //BA.debugLineNum = 312;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 313;BA.debugLine="json.Initialize(CreateMap(\"email\":Email,\"password";
_json.Initialize(parent.__c.createMap(new Object[] {(Object)("email"),(Object)(_email),(Object)("password"),(Object)(_password)}));
 //BA.debugLineNum = 315;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 315;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 316;BA.debugLine="j.PostString(url,json.ToString)";
_j._vvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ (_url,_json.ToString());
 //BA.debugLineNum = 317;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 318;BA.debugLine="j.GetRequest.SetHeader(\"apikey\",m_Supabase.ApiKey";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("apikey",parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ());
 //BA.debugLineNum = 320;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 121;
return;
case 121:
//C
this.state = 1;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 322;BA.debugLine="Dim m_ResultMap As Map = Supabase_Functions.Gener";
_m_resultmap = new anywheresoftware.b4a.objects.collections.Map();
_m_resultmap = parent._supabase_functions._vvvvvvvv1 /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_j);
 //BA.debugLineNum = 324;BA.debugLine="Dim User As SupabaseUser";
_user = new elicorp.pilot.supabase._supabaseuser();
 //BA.debugLineNum = 325;BA.debugLine="User.Initialize";
_user.Initialize();
 //BA.debugLineNum = 327;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 328;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 329;BA.debugLine="DatabaseError.Success = m_ResultMap.Get(\"success\"";
_databaseerror.Success /*boolean*/  = BA.ObjectToBoolean(_m_resultmap.Get((Object)("success")));
 //BA.debugLineNum = 330;BA.debugLine="If DatabaseError.Success = False Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_databaseerror.Success /*boolean*/ ==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 331;BA.debugLine="If m_ResultMap.ContainsKey(\"code\") Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_m_resultmap.ContainsKey((Object)("code"))) { 
this.state = 6;
}else if(_m_resultmap.ContainsKey((Object)("error_description"))) { 
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 332;BA.debugLine="DatabaseError.StatusCode = m_ResultMap.Get(\"cod";
_databaseerror.StatusCode /*int*/  = (int)(BA.ObjectToNumber(_m_resultmap.Get((Object)("code"))));
 //BA.debugLineNum = 333;BA.debugLine="DatabaseError.ErrorMessage = m_ResultMap.Get(\"m";
_databaseerror.ErrorMessage /*String*/  = BA.ObjectToString(_m_resultmap.Get((Object)("msg")));
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 335;BA.debugLine="DatabaseError.StatusCode = 401";
_databaseerror.StatusCode /*int*/  = (int) (401);
 //BA.debugLineNum = 336;BA.debugLine="DatabaseError.ErrorMessage = m_ResultMap.Get(\"e";
_databaseerror.ErrorMessage /*String*/  = BA.ObjectToString(_m_resultmap.Get((Object)("error_description")));
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 339;BA.debugLine="User.Error = DatabaseError";
_user.Error /*elicorp.pilot.supabase._supabaseerror*/  = _databaseerror;
 //BA.debugLineNum = 341;BA.debugLine="If DatabaseError.Success Then";
if (true) break;

case 11:
//if
this.state = 86;
if (_databaseerror.Success /*boolean*/ ) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 342;BA.debugLine="Dim mUser As Map = m_ResultMap.Get(\"user\")";
_muser = new anywheresoftware.b4a.objects.collections.Map();
_muser = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_m_resultmap.Get((Object)("user"))));
 //BA.debugLineNum = 344;BA.debugLine="If mUser.ContainsKey(\"id\") Then User.Id = mUser.";
if (true) break;

case 14:
//if
this.state = 19;
if (_muser.ContainsKey((Object)("id"))) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
_user.Id /*String*/  = BA.ObjectToString(_muser.Get((Object)("id")));
if (true) break;

case 19:
//C
this.state = 20;
;
 //BA.debugLineNum = 345;BA.debugLine="If mUser.ContainsKey(\"aud\") Then User.Aud = mUse";
if (true) break;

case 20:
//if
this.state = 25;
if (_muser.ContainsKey((Object)("aud"))) { 
this.state = 22;
;}if (true) break;

case 22:
//C
this.state = 25;
_user.Aud /*String*/  = BA.ObjectToString(_muser.Get((Object)("aud")));
if (true) break;

case 25:
//C
this.state = 26;
;
 //BA.debugLineNum = 346;BA.debugLine="If mUser.ContainsKey(\"role\") Then User.role = mU";
if (true) break;

case 26:
//if
this.state = 31;
if (_muser.ContainsKey((Object)("role"))) { 
this.state = 28;
;}if (true) break;

case 28:
//C
this.state = 31;
_user.Role /*String*/  = BA.ObjectToString(_muser.Get((Object)("role")));
if (true) break;

case 31:
//C
this.state = 32;
;
 //BA.debugLineNum = 347;BA.debugLine="If mUser.ContainsKey(\"email\") Then User.email =";
if (true) break;

case 32:
//if
this.state = 37;
if (_muser.ContainsKey((Object)("email"))) { 
this.state = 34;
;}if (true) break;

case 34:
//C
this.state = 37;
_user.Email /*String*/  = BA.ObjectToString(_muser.Get((Object)("email")));
if (true) break;

case 37:
//C
this.state = 38;
;
 //BA.debugLineNum = 348;BA.debugLine="If mUser.ContainsKey(\"phone\") Then User.phone =";
if (true) break;

case 38:
//if
this.state = 43;
if (_muser.ContainsKey((Object)("phone"))) { 
this.state = 40;
;}if (true) break;

case 40:
//C
this.state = 43;
_user.Phone /*String*/  = BA.ObjectToString(_muser.Get((Object)("phone")));
if (true) break;

case 43:
//C
this.state = 44;
;
 //BA.debugLineNum = 349;BA.debugLine="If mUser.ContainsKey(\"email_confirmed_at\") Then";
if (true) break;

case 44:
//if
this.state = 49;
if (_muser.ContainsKey((Object)("email_confirmed_at"))) { 
this.state = 46;
;}if (true) break;

case 46:
//C
this.state = 49;
_user.EmailConfirmedAt /*long*/  = parent._supabase_functions._vvvvvvvv0 /*long*/ (parent.getActivityBA(),BA.ObjectToString(_muser.Get((Object)("email_confirmed_at"))));
if (true) break;

case 49:
//C
this.state = 50;
;
 //BA.debugLineNum = 350;BA.debugLine="If mUser.ContainsKey(\"confirmation_sent_at\") The";
if (true) break;

case 50:
//if
this.state = 55;
if (_muser.ContainsKey((Object)("confirmation_sent_at"))) { 
this.state = 52;
;}if (true) break;

case 52:
//C
this.state = 55;
_user.ConfirmationSentAt /*long*/  = parent._supabase_functions._vvvvvvvv0 /*long*/ (parent.getActivityBA(),BA.ObjectToString(_muser.Get((Object)("confirmation_sent_at"))));
if (true) break;

case 55:
//C
this.state = 56;
;
 //BA.debugLineNum = 351;BA.debugLine="If mUser.ContainsKey(\"confirmed_at\") Then User.C";
if (true) break;

case 56:
//if
this.state = 61;
if (_muser.ContainsKey((Object)("confirmed_at"))) { 
this.state = 58;
;}if (true) break;

case 58:
//C
this.state = 61;
_user.ConfirmedAt /*long*/  = parent._supabase_functions._vvvvvvvv0 /*long*/ (parent.getActivityBA(),BA.ObjectToString(_muser.Get((Object)("confirmed_at"))));
if (true) break;

case 61:
//C
this.state = 62;
;
 //BA.debugLineNum = 352;BA.debugLine="If mUser.ContainsKey(\"last_sign_in_at\") Then Use";
if (true) break;

case 62:
//if
this.state = 67;
if (_muser.ContainsKey((Object)("last_sign_in_at"))) { 
this.state = 64;
;}if (true) break;

case 64:
//C
this.state = 67;
_user.LastSignInAt /*long*/  = parent._supabase_functions._vvvvvvvv0 /*long*/ (parent.getActivityBA(),BA.ObjectToString(_muser.Get((Object)("last_sign_in_at"))));
if (true) break;

case 67:
//C
this.state = 68;
;
 //BA.debugLineNum = 353;BA.debugLine="If mUser.ContainsKey(\"created_at\") Then User.cre";
if (true) break;

case 68:
//if
this.state = 73;
if (_muser.ContainsKey((Object)("created_at"))) { 
this.state = 70;
;}if (true) break;

case 70:
//C
this.state = 73;
_user.CreatedAt /*long*/  = parent._supabase_functions._vvvvvvvv0 /*long*/ (parent.getActivityBA(),BA.ObjectToString(_muser.Get((Object)("created_at"))));
if (true) break;

case 73:
//C
this.state = 74;
;
 //BA.debugLineNum = 354;BA.debugLine="If mUser.ContainsKey(\"updated_at\") Then User.upd";
if (true) break;

case 74:
//if
this.state = 79;
if (_muser.ContainsKey((Object)("updated_at"))) { 
this.state = 76;
;}if (true) break;

case 76:
//C
this.state = 79;
_user.UpdatedAt /*long*/  = parent._supabase_functions._vvvvvvvv0 /*long*/ (parent.getActivityBA(),BA.ObjectToString(_muser.Get((Object)("updated_at"))));
if (true) break;

case 79:
//C
this.state = 80;
;
 //BA.debugLineNum = 355;BA.debugLine="If mUser.ContainsKey(\"user_metadata\") Then User.";
if (true) break;

case 80:
//if
this.state = 85;
if (_muser.ContainsKey((Object)("user_metadata"))) { 
this.state = 82;
;}if (true) break;

case 82:
//C
this.state = 85;
_user.Metadata /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_muser.Get((Object)("user_metadata"))));
if (true) break;

case 85:
//C
this.state = 86;
;
 if (true) break;

case 86:
//C
this.state = 87;
;
 //BA.debugLineNum = 359;BA.debugLine="m_User = User";
parent._m_user = _user;
 //BA.debugLineNum = 361;BA.debugLine="If DatabaseError.Success Then";
if (true) break;

case 87:
//if
this.state = 120;
if (_databaseerror.Success /*boolean*/ ) { 
this.state = 89;
}if (true) break;

case 89:
//C
this.state = 90;
 //BA.debugLineNum = 362;BA.debugLine="If m_ResultMap.ContainsKey(\"access_token\") Then";
if (true) break;

case 90:
//if
this.state = 95;
if (_m_resultmap.ContainsKey((Object)("access_token"))) { 
this.state = 92;
;}if (true) break;

case 92:
//C
this.state = 95;
parent._sti_token.AccessToken /*String*/  = BA.ObjectToString(_m_resultmap.Get((Object)("access_token")));
if (true) break;

case 95:
//C
this.state = 96;
;
 //BA.debugLineNum = 363;BA.debugLine="If m_ResultMap.ContainsKey(\"token_type\") Then st";
if (true) break;

case 96:
//if
this.state = 101;
if (_m_resultmap.ContainsKey((Object)("token_type"))) { 
this.state = 98;
;}if (true) break;

case 98:
//C
this.state = 101;
parent._sti_token.TokenType /*String*/  = BA.ObjectToString(_m_resultmap.Get((Object)("token_type")));
if (true) break;

case 101:
//C
this.state = 102;
;
 //BA.debugLineNum = 364;BA.debugLine="If m_ResultMap.ContainsKey(\"expires_at\") Then st";
if (true) break;

case 102:
//if
this.state = 107;
if (_m_resultmap.ContainsKey((Object)("expires_at"))) { 
this.state = 104;
;}if (true) break;

case 104:
//C
this.state = 107;
parent._sti_token.AccessExpiry /*long*/  = parent._vvvvvvvvvvv0._unixtimetoticks(parent.getActivityBA(),BA.ObjectToLongNumber(_m_resultmap.Get((Object)("expires_at"))));
if (true) break;

case 107:
//C
this.state = 108;
;
 //BA.debugLineNum = 365;BA.debugLine="If m_ResultMap.ContainsKey(\"refresh_token\") Then";
if (true) break;

case 108:
//if
this.state = 113;
if (_m_resultmap.ContainsKey((Object)("refresh_token"))) { 
this.state = 110;
;}if (true) break;

case 110:
//C
this.state = 113;
parent._sti_token.RefreshToken /*String*/  = BA.ObjectToString(_m_resultmap.Get((Object)("refresh_token")));
if (true) break;

case 113:
//C
this.state = 114;
;
 //BA.debugLineNum = 366;BA.debugLine="sti_Token.Valid = True";
parent._sti_token.Valid /*boolean*/  = parent.__c.True;
 //BA.debugLineNum = 367;BA.debugLine="sti_Token.Email = User.Email";
parent._sti_token.Email /*String*/  = _user.Email /*String*/ ;
 //BA.debugLineNum = 368;BA.debugLine="If m_Supabase.LogEvents Then Log($\"SupabaseAuth:";
if (true) break;

case 114:
//if
this.state = 119;
if (parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*boolean*/ ()) { 
this.state = 116;
;}if (true) break;

case 116:
//C
this.state = 119;
parent.__c.LogImpl("958720316",("SupabaseAuth: Token received. Expires: "+parent.__c.SmartStringFormatter("",(Object)(parent._vvvvvvvvvvv0._tickstostring(parent.getActivityBA(),parent._sti_token.AccessExpiry /*long*/ )))+""),0);
if (true) break;

case 119:
//C
this.state = 120;
;
 //BA.debugLineNum = 369;BA.debugLine="SaveToken";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 370;BA.debugLine="AuthStateChange(\"signedIn\")";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("signedIn");
 if (true) break;

case 120:
//C
this.state = -1;
;
 //BA.debugLineNum = 373;BA.debugLine="Return User";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_user));return;};
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _login_magiclink(String _email) throws Exception{
ResumableSub_LogIn_MagicLink rsub = new ResumableSub_LogIn_MagicLink(this,_email);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_LogIn_MagicLink extends BA.ResumableSub {
public ResumableSub_LogIn_MagicLink(elicorp.pilot.supabase_authentication parent,String _email) {
this.parent = parent;
this._email = _email;
}
elicorp.pilot.supabase_authentication parent;
String _email;
String _url = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
elicorp.pilot.httpjob _j = null;
anywheresoftware.b4a.objects.collections.Map _m_resultmap = null;
elicorp.pilot.supabase._supabaseerror _databaseerror = null;

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
 //BA.debugLineNum = 395;BA.debugLine="Dim url As String = $\"${m_Supabase.URL}/auth/v1/m";
_url = (""+parent.__c.SmartStringFormatter("",(Object)(parent._m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/auth/v1/magiclink");
 //BA.debugLineNum = 397;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 398;BA.debugLine="json.Initialize(CreateMap(\"email\":Email))";
_json.Initialize(parent.__c.createMap(new Object[] {(Object)("email"),(Object)(_email)}));
 //BA.debugLineNum = 400;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 400;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 401;BA.debugLine="j.PostString(url,json.ToString)";
_j._vvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ (_url,_json.ToString());
 //BA.debugLineNum = 402;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 403;BA.debugLine="j.GetRequest.SetHeader(\"apikey\",m_Supabase.ApiKey";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("apikey",parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ());
 //BA.debugLineNum = 405;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 407;BA.debugLine="Dim m_ResultMap As Map = Supabase_Functions.Gener";
_m_resultmap = new anywheresoftware.b4a.objects.collections.Map();
_m_resultmap = parent._supabase_functions._vvvvvvvv1 /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_j);
 //BA.debugLineNum = 409;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 410;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 411;BA.debugLine="DatabaseError.Success = m_ResultMap.Get(\"success\"";
_databaseerror.Success /*boolean*/  = BA.ObjectToBoolean(_m_resultmap.Get((Object)("success")));
 //BA.debugLineNum = 413;BA.debugLine="If m_ResultMap.Get(\"success\") = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_m_resultmap.Get((Object)("success"))).equals((Object)(parent.__c.False))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 414;BA.debugLine="DatabaseError.StatusCode = m_ResultMap.Get(\"code";
_databaseerror.StatusCode /*int*/  = (int)(BA.ObjectToNumber(_m_resultmap.Get((Object)("code"))));
 //BA.debugLineNum = 415;BA.debugLine="DatabaseError.ErrorMessage = m_ResultMap.Get(\"ms";
_databaseerror.ErrorMessage /*String*/  = BA.ObjectToString(_m_resultmap.Get((Object)("msg")));
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 418;BA.debugLine="Return DatabaseError";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_databaseerror));return;};
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3() throws Exception{
ResumableSub_Logout rsub = new ResumableSub_Logout(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Logout extends BA.ResumableSub {
public ResumableSub_Logout(elicorp.pilot.supabase_authentication parent) {
this.parent = parent;
}
elicorp.pilot.supabase_authentication parent;
elicorp.pilot.supabase._supabaseerror _databaseerror = null;
String _accesstoken = "";
String _url = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
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
 //BA.debugLineNum = 117;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 118;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 120;BA.debugLine="Wait For (m_Supabase.Auth.GetAccessToken) Complet";
parent.__c.WaitFor("complete", ba, this, parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 16;
return;
case 16:
//C
this.state = 1;
_accesstoken = (String) result[0];
;
 //BA.debugLineNum = 121;BA.debugLine="If AccessToken = \"\" Then";
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
 //BA.debugLineNum = 122;BA.debugLine="DatabaseError.StatusCode = 401";
_databaseerror.StatusCode /*int*/  = (int) (401);
 //BA.debugLineNum = 123;BA.debugLine="DatabaseError.ErrorMessage = \"Unauthorized\"";
_databaseerror.ErrorMessage /*String*/  = "Unauthorized";
 //BA.debugLineNum = 124;BA.debugLine="Return DatabaseError";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_databaseerror));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 127;BA.debugLine="Dim url As String = $\"${m_Supabase.URL}/auth/v1/l";
_url = (""+parent.__c.SmartStringFormatter("",(Object)(parent._m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/auth/v1/logout");
 //BA.debugLineNum = 129;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 130;BA.debugLine="json.Initialize(CreateMap(\"refresh_token\":sti_Tok";
_json.Initialize(parent.__c.createMap(new Object[] {(Object)("refresh_token"),(Object)(parent._sti_token.RefreshToken /*String*/ )}));
 //BA.debugLineNum = 132;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 132;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 133;BA.debugLine="j.PostString(url,json.ToString)";
_j._vvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ (_url,_json.ToString());
 //BA.debugLineNum = 134;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 135;BA.debugLine="j.GetRequest.SetHeader(\"apikey\",m_Supabase.ApiKey";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("apikey",parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ());
 //BA.debugLineNum = 136;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_accesstoken);
 //BA.debugLineNum = 138;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 17;
return;
case 17:
//C
this.state = 5;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 140;BA.debugLine="If j.Success Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 143;BA.debugLine="DatabaseError.StatusCode = j.Response.StatusCode";
_databaseerror.StatusCode /*int*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv6 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode();
 //BA.debugLineNum = 144;BA.debugLine="DatabaseError.ErrorMessage = j.ErrorMessage";
_databaseerror.ErrorMessage /*String*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ;
 if (true) break;
;
 //BA.debugLineNum = 147;BA.debugLine="If m_Supabase.LogEvents Then Log(\"SupabaseAuth: T";

case 10:
//if
this.state = 15;
if (parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*boolean*/ ()) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
parent.__c.LogImpl("958392608","SupabaseAuth: Token reset!!!",0);
if (true) break;

case 15:
//C
this.state = -1;
;
 //BA.debugLineNum = 148;BA.debugLine="sti_Token.Valid = False";
parent._sti_token.Valid /*boolean*/  = parent.__c.False;
 //BA.debugLineNum = 149;BA.debugLine="SaveToken";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 150;BA.debugLine="AuthStateChange(\"signedOut\")";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("signedOut");
 //BA.debugLineNum = 151;BA.debugLine="Return DatabaseError";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_databaseerror));return;};
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _oauth_authenticate(String _clientid,String _provider,String _scope) throws Exception{
String _link = "";
anywheresoftware.b4a.phone.Phone.PhoneIntents _pi = null;
 //BA.debugLineNum = 679;BA.debugLine="Private Sub OAuth_Authenticate(ClientId As String,";
 //BA.debugLineNum = 681;BA.debugLine="CurrentClientId = ClientId";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _clientid;
 //BA.debugLineNum = 682;BA.debugLine="CurrentProvider = Provider";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _provider;
 //BA.debugLineNum = 684;BA.debugLine="If Provider = \"apple\" Then";
if ((_provider).equals("apple")) { 
 //BA.debugLineNum = 685;BA.debugLine="SignInWithApple";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0();
 }else {
 //BA.debugLineNum = 692;BA.debugLine="If Provider = \"google\" Then";
if ((_provider).equals("google")) { 
 //BA.debugLineNum = 693;BA.debugLine="Dim link As String = BuildLink($\"${m_Supabase.U";
_link = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1((""+__c.SmartStringFormatter("",(Object)(_m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/auth/v1/authorize?provider="+__c.SmartStringFormatter("",(Object)(_provider))+""),__c.createMap(new Object[] {(Object)("client_id"),(Object)(_clientid),(Object)("redirect_uri"),(Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5()),(Object)("response_type"),(Object)("code"),(Object)("scope"),(Object)(_scope)}));
 }else {
 //BA.debugLineNum = 700;BA.debugLine="Dim link As String = BuildLink($\"${m_Supabase.U";
_link = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1((""+__c.SmartStringFormatter("",(Object)(_m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/auth/v1/authorize?provider="+__c.SmartStringFormatter("",(Object)(_provider))+""),__c.createMap(new Object[] {(Object)("client_id"),(Object)(_clientid),(Object)("redirect_uri"),(Object)(("com.stoltex.supabase://"+__c.SmartStringFormatter("",(Object)(_m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ().replace("https://","")))+"/auth/v1/callback")),(Object)("response_type"),(Object)("code"),(Object)("scope"),(Object)(_scope)}));
 };
 //BA.debugLineNum = 713;BA.debugLine="Dim pi As PhoneIntents";
_pi = new anywheresoftware.b4a.phone.Phone.PhoneIntents();
 //BA.debugLineNum = 714;BA.debugLine="StartActivity(pi.OpenBrowser(link))";
__c.StartActivity(ba,(Object)(_pi.OpenBrowser(_link)));
 };
 //BA.debugLineNum = 723;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(String _response) throws Exception{
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
String _code = "";
 //BA.debugLineNum = 808;BA.debugLine="Private Sub ParseBrowserUrl(Response As String)";
 //BA.debugLineNum = 810;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"code=([^&\\s]+)\"";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = __c.Regex.Matcher("code=([^&\\s]+)",_response);
 //BA.debugLineNum = 811;BA.debugLine="If m.Find Then";
if (_m.Find()) { 
 //BA.debugLineNum = 812;BA.debugLine="Dim code As String = m.Group(1)";
_code = _m.Group((int) (1));
 //BA.debugLineNum = 813;BA.debugLine="If CurrentProvider = \"google\" Then";
if ((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1).equals("google")) { 
 //BA.debugLineNum = 814;BA.debugLine="GetTokenFromGoogleAuthorizationCode(code)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(_code);
 }else {
 //BA.debugLineNum = 816;BA.debugLine="GetTokenFromSupabase(code)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(_code);
 };
 }else {
 //BA.debugLineNum = 819;BA.debugLine="Log(\"SupabaseAuth: Error parsing server response";
__c.LogImpl("959506699","SupabaseAuth: Error parsing server response: "+_response,0);
 //BA.debugLineNum = 820;BA.debugLine="Logout";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3();
 };
 //BA.debugLineNum = 822;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(String _email) throws Exception{
ResumableSub_PasswordRecovery rsub = new ResumableSub_PasswordRecovery(this,_email);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PasswordRecovery extends BA.ResumableSub {
public ResumableSub_PasswordRecovery(elicorp.pilot.supabase_authentication parent,String _email) {
this.parent = parent;
this._email = _email;
}
elicorp.pilot.supabase_authentication parent;
String _email;
elicorp.pilot.supabase._supabaseerror _databaseerror = null;
String _url = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
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
 //BA.debugLineNum = 509;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 510;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 512;BA.debugLine="Dim url As String = $\"${m_Supabase.URL}/auth/v1/r";
_url = (""+parent.__c.SmartStringFormatter("",(Object)(parent._m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/auth/v1/recover");
 //BA.debugLineNum = 514;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 515;BA.debugLine="json.Initialize(CreateMap(\"email\":Email))";
_json.Initialize(parent.__c.createMap(new Object[] {(Object)("email"),(Object)(_email)}));
 //BA.debugLineNum = 517;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 517;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 518;BA.debugLine="j.PostString(url,json.ToString)";
_j._vvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ (_url,_json.ToString());
 //BA.debugLineNum = 519;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 520;BA.debugLine="j.GetRequest.SetHeader(\"apikey\",m_Supabase.ApiKey";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("apikey",parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ());
 //BA.debugLineNum = 522;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 524;BA.debugLine="DatabaseError.Success = j.Success";
_databaseerror.Success /*boolean*/  = _j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ;
 //BA.debugLineNum = 526;BA.debugLine="If j.Success = False Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ==parent.__c.False) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 527;BA.debugLine="DatabaseError.StatusCode = j.Response.StatusCode";
_databaseerror.StatusCode /*int*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv6 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode();
 //BA.debugLineNum = 528;BA.debugLine="DatabaseError.ErrorMessage = j.ErrorMessage";
_databaseerror.ErrorMessage /*String*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ;
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 530;BA.debugLine="AuthStateChange(\"passwordRecovery\")";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("passwordRecovery");
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 535;BA.debugLine="Return DatabaseError";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_databaseerror));return;};
 //BA.debugLineNum = 536;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6() throws Exception{
ResumableSub_RefreshToken rsub = new ResumableSub_RefreshToken(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RefreshToken extends BA.ResumableSub {
public ResumableSub_RefreshToken(elicorp.pilot.supabase_authentication parent) {
this.parent = parent;
}
elicorp.pilot.supabase_authentication parent;
String _url = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
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
 //BA.debugLineNum = 188;BA.debugLine="Dim url As String = $\"${m_Supabase.URL}/auth/v1/t";
_url = (""+parent.__c.SmartStringFormatter("",(Object)(parent._m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/auth/v1/token?grant_type=refresh_token");
 //BA.debugLineNum = 190;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 191;BA.debugLine="json.Initialize(CreateMap(\"refresh_token\":sti_Tok";
_json.Initialize(parent.__c.createMap(new Object[] {(Object)("refresh_token"),(Object)(parent._sti_token.RefreshToken /*String*/ )}));
 //BA.debugLineNum = 193;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 193;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 194;BA.debugLine="j.PostString(url,json.ToString)";
_j._vvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ (_url,_json.ToString());
 //BA.debugLineNum = 195;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 196;BA.debugLine="j.GetRequest.SetHeader(\"apikey\",m_Supabase.ApiKey";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("apikey",parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ());
 //BA.debugLineNum = 198;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 201;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 202;BA.debugLine="TokenInformationFromResponse(Supabase_Functions.";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(parent._supabase_functions._vvvvvvvv1 /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_j));
 //BA.debugLineNum = 203;BA.debugLine="AuthStateChange(\"tokenRefreshed\")";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("tokenRefreshed");
 //BA.debugLineNum = 204;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 206;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7() throws Exception{
anywheresoftware.b4a.randomaccessfile.RandomAccessFile _raf = null;
 //BA.debugLineNum = 98;BA.debugLine="Public Sub SaveToken";
 //BA.debugLineNum = 99;BA.debugLine="Dim raf As RandomAccessFile";
_raf = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
 //BA.debugLineNum = 100;BA.debugLine="raf.Initialize(TokenFolder, TokenFile, False)";
_raf.Initialize(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,__c.False);
 //BA.debugLineNum = 101;BA.debugLine="raf.WriteB4XObject(sti_Token, raf.CurrentPosition";
_raf.WriteB4XObject((Object)(_sti_token),_raf.CurrentPosition);
 //BA.debugLineNum = 102;BA.debugLine="raf.Close";
_raf.Close();
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 882;BA.debugLine="Private Sub SignInWithApple";
 //BA.debugLineNum = 892;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(String _clientid,String _provider,String _scope) throws Exception{
ResumableSub_SignInWithOAuth rsub = new ResumableSub_SignInWithOAuth(this,_clientid,_provider,_scope);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SignInWithOAuth extends BA.ResumableSub {
public ResumableSub_SignInWithOAuth(elicorp.pilot.supabase_authentication parent,String _clientid,String _provider,String _scope) {
this.parent = parent;
this._clientid = _clientid;
this._provider = _provider;
this._scope = _scope;
}
elicorp.pilot.supabase_authentication parent;
String _clientid;
String _provider;
String _scope;
boolean _successful = false;
elicorp.pilot.supabase._supabaseerror _databaseerror = null;
elicorp.pilot.supabase._supabaseuser _user = null;

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
 //BA.debugLineNum = 635;BA.debugLine="OAuth_Authenticate(ClientId,Provider,Scope)";
parent._oauth_authenticate(_clientid,_provider,_scope);
 //BA.debugLineNum = 637;BA.debugLine="Wait For OAuthTokenReceived (Successful As Boolea";
parent.__c.WaitFor("oauthtokenreceived", ba, this, null);
this.state = 10;
return;
case 10:
//C
this.state = 1;
_successful = (Boolean) result[0];
;
 //BA.debugLineNum = 639;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 640;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 641;BA.debugLine="DatabaseError.Success = Successful";
_databaseerror.Success /*boolean*/  = _successful;
 //BA.debugLineNum = 642;BA.debugLine="If DatabaseError.Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_databaseerror.Success /*boolean*/ ==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 643;BA.debugLine="DatabaseError.StatusCode = \"\"";
_databaseerror.StatusCode /*int*/  = (int)(Double.parseDouble(""));
 //BA.debugLineNum = 644;BA.debugLine="DatabaseError.ErrorMessage = \"\"";
_databaseerror.ErrorMessage /*String*/  = "";
 if (true) break;
;
 //BA.debugLineNum = 647;BA.debugLine="If Successful Then";

case 4:
//if
this.state = 9;
if (_successful) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 648;BA.debugLine="Wait For (GetUser) Complete (User As SupabaseUse";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0());
this.state = 11;
return;
case 11:
//C
this.state = 9;
_user = (elicorp.pilot.supabase._supabaseuser) result[0];
;
 //BA.debugLineNum = 649;BA.debugLine="User.Error = DatabaseError";
_user.Error /*elicorp.pilot.supabase._supabaseerror*/  = _databaseerror;
 //BA.debugLineNum = 650;BA.debugLine="AuthStateChange(\"signedIn\")";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("signedIn");
 //BA.debugLineNum = 651;BA.debugLine="Return User";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_user));return;};
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 654;BA.debugLine="Dim User As SupabaseUser";
_user = new elicorp.pilot.supabase._supabaseuser();
 //BA.debugLineNum = 655;BA.debugLine="User.Initialize";
_user.Initialize();
 //BA.debugLineNum = 656;BA.debugLine="User.Error = DatabaseError";
_user.Error /*elicorp.pilot.supabase._supabaseerror*/  = _databaseerror;
 //BA.debugLineNum = 657;BA.debugLine="Logout";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3();
 //BA.debugLineNum = 658;BA.debugLine="Return User";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_user));return;};
 if (true) break;

case 9:
//C
this.state = -1;
;
 //BA.debugLineNum = 663;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _oauthtokenreceived(boolean _successful) throws Exception{
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(String _email,String _password,anywheresoftware.b4a.objects.collections.Map _options) throws Exception{
ResumableSub_SignUp rsub = new ResumableSub_SignUp(this,_email,_password,_options);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SignUp extends BA.ResumableSub {
public ResumableSub_SignUp(elicorp.pilot.supabase_authentication parent,String _email,String _password,anywheresoftware.b4a.objects.collections.Map _options) {
this.parent = parent;
this._email = _email;
this._password = _password;
this._options = _options;
}
elicorp.pilot.supabase_authentication parent;
String _email;
String _password;
anywheresoftware.b4a.objects.collections.Map _options;
String _url = "";
anywheresoftware.b4a.objects.collections.Map _m_parameters = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
elicorp.pilot.httpjob _j = null;
anywheresoftware.b4a.objects.collections.Map _m_resultmap = null;
elicorp.pilot.supabase._supabaseerror _databaseerror = null;

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
 //BA.debugLineNum = 227;BA.debugLine="Dim url As String = $\"${m_Supabase.URL}/auth/v1/s";
_url = (""+parent.__c.SmartStringFormatter("",(Object)(parent._m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/auth/v1/signup");
 //BA.debugLineNum = 229;BA.debugLine="Dim m_Parameters As Map";
_m_parameters = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 230;BA.debugLine="m_Parameters.Initialize";
_m_parameters.Initialize();
 //BA.debugLineNum = 231;BA.debugLine="m_Parameters.Put(\"email\",Email)";
_m_parameters.Put((Object)("email"),(Object)(_email));
 //BA.debugLineNum = 232;BA.debugLine="m_Parameters.Put(\"password\",Password)";
_m_parameters.Put((Object)("password"),(Object)(_password));
 //BA.debugLineNum = 234;BA.debugLine="If Options <> Null And Options.IsInitialized Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_options!= null && _options.IsInitialized()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 236;BA.debugLine="m_Parameters.Put(\"data\",Options)";
_m_parameters.Put((Object)("data"),(Object)(_options.getObject()));
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 240;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 241;BA.debugLine="json.Initialize(m_Parameters)";
_json.Initialize(_m_parameters);
 //BA.debugLineNum = 243;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 243;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 244;BA.debugLine="j.PostString(url,json.ToString)";
_j._vvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ (_url,_json.ToString());
 //BA.debugLineNum = 245;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 246;BA.debugLine="j.GetRequest.SetHeader(\"apikey\",m_Supabase.ApiKey";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("apikey",parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ());
 //BA.debugLineNum = 248;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 14;
return;
case 14:
//C
this.state = 5;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 250;BA.debugLine="Dim m_ResultMap As Map = Supabase_Functions.Gener";
_m_resultmap = new anywheresoftware.b4a.objects.collections.Map();
_m_resultmap = parent._supabase_functions._vvvvvvvv1 /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_j);
 //BA.debugLineNum = 253;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 254;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 255;BA.debugLine="DatabaseError.Success = m_ResultMap.Get(\"success\"";
_databaseerror.Success /*boolean*/  = BA.ObjectToBoolean(_m_resultmap.Get((Object)("success")));
 //BA.debugLineNum = 256;BA.debugLine="If DatabaseError.Success = False Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_databaseerror.Success /*boolean*/ ==parent.__c.False) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 257;BA.debugLine="DatabaseError.StatusCode = m_ResultMap.Get(\"code";
_databaseerror.StatusCode /*int*/  = (int)(BA.ObjectToNumber(_m_resultmap.Get((Object)("code"))));
 //BA.debugLineNum = 258;BA.debugLine="DatabaseError.ErrorMessage = m_ResultMap.Get(\"ms";
_databaseerror.ErrorMessage /*String*/  = BA.ObjectToString(_m_resultmap.Get((Object)("msg")));
 if (true) break;
;
 //BA.debugLineNum = 261;BA.debugLine="If DatabaseError.Success Then";

case 8:
//if
this.state = 13;
if (_databaseerror.Success /*boolean*/ ) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
 //BA.debugLineNum = 262;BA.debugLine="m_User = FillUserObject(m_ResultMap)";
parent._m_user = parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(_m_resultmap);
 //BA.debugLineNum = 263;BA.debugLine="m_User.Error = DatabaseError";
parent._m_user.Error /*elicorp.pilot.supabase._supabaseerror*/  = _databaseerror;
 //BA.debugLineNum = 264;BA.debugLine="AuthStateChange(\"signedIn\")";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("signedIn");
 if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 266;BA.debugLine="m_User.Error = DatabaseError";
parent._m_user.Error /*elicorp.pilot.supabase._supabaseerror*/  = _databaseerror;
 if (true) break;

case 13:
//C
this.state = -1;
;
 //BA.debugLineNum = 269;BA.debugLine="Return m_User";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent._m_user));return;};
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Private Sub TokenInformationFromResponse (m As Map";
 //BA.debugLineNum = 80;BA.debugLine="If m.ContainsKey(\"expires_in\") Then sti_Token.Acc";
if (_m.ContainsKey((Object)("expires_in"))) { 
_sti_token.AccessExpiry /*long*/  = (long) (__c.DateTime.getNow()+(double)(BA.ObjectToNumber(_m.Get((Object)("expires_in"))))*1000-5*60*1000);};
 //BA.debugLineNum = 81;BA.debugLine="If m.ContainsKey(\"access_token\") Then sti_Token.A";
if (_m.ContainsKey((Object)("access_token"))) { 
_sti_token.AccessToken /*String*/  = BA.ObjectToString(_m.Get((Object)("access_token")));};
 //BA.debugLineNum = 82;BA.debugLine="If m.ContainsKey(\"email\") Then";
if (_m.ContainsKey((Object)("email"))) { 
 //BA.debugLineNum = 83;BA.debugLine="sti_Token.Email = m.Get(\"email\")";
_sti_token.Email /*String*/  = BA.ObjectToString(_m.Get((Object)("email")));
 }else {
 //BA.debugLineNum = 85;BA.debugLine="If m.ContainsKey(\"user\") And m.Get(\"user\").As(Ma";
if (_m.ContainsKey((Object)("user")) && ((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_m.Get((Object)("user"))))).ContainsKey((Object)("email"))) { 
 //BA.debugLineNum = 86;BA.debugLine="sti_Token.Email = m.Get(\"user\").As(Map).Get(\"em";
_sti_token.Email /*String*/  = BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_m.Get((Object)("user"))))).Get((Object)("email")));
 };
 };
 //BA.debugLineNum = 89;BA.debugLine="If m.ContainsKey(\"refresh_token\") Then sti_Token.";
if (_m.ContainsKey((Object)("refresh_token"))) { 
_sti_token.RefreshToken /*String*/  = BA.ObjectToString(_m.Get((Object)("refresh_token")));};
 //BA.debugLineNum = 90;BA.debugLine="sti_Token.Valid = True";
_sti_token.Valid /*boolean*/  = __c.True;
 //BA.debugLineNum = 93;BA.debugLine="If m_Supabase.LogEvents Then Log($\"SupabaseAuth:";
if (_m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*boolean*/ ()) { 
__c.LogImpl("958261518",("SupabaseAuth: Token received. Expires: "+__c.SmartStringFormatter("",(Object)(_vvvvvvvvvvv0._tickstostring(getActivityBA(),_sti_token.AccessExpiry /*long*/ )))+""),0);};
 //BA.debugLineNum = 94;BA.debugLine="SaveToken";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.supabase_authentication._supabasetokeninformations  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Public Sub TokenInformations As SupabaseTokenInfor";
 //BA.debugLineNum = 76;BA.debugLine="Return sti_Token";
if (true) return _sti_token;
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(String _newemail,String _newpassword) throws Exception{
ResumableSub_UpdateUser rsub = new ResumableSub_UpdateUser(this,_newemail,_newpassword);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_UpdateUser extends BA.ResumableSub {
public ResumableSub_UpdateUser(elicorp.pilot.supabase_authentication parent,String _newemail,String _newpassword) {
this.parent = parent;
this._newemail = _newemail;
this._newpassword = _newpassword;
}
elicorp.pilot.supabase_authentication parent;
String _newemail;
String _newpassword;
elicorp.pilot.supabase._supabaseerror _databaseerror = null;
String _accesstoken = "";
String _url = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
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
 //BA.debugLineNum = 551;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 552;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 554;BA.debugLine="Wait For (m_Supabase.Auth.GetAccessToken) Complet";
parent.__c.WaitFor("complete", ba, this, parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 23;
return;
case 23:
//C
this.state = 1;
_accesstoken = (String) result[0];
;
 //BA.debugLineNum = 555;BA.debugLine="If AccessToken = \"\" Then";
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
 //BA.debugLineNum = 556;BA.debugLine="DatabaseError.StatusCode = 401";
_databaseerror.StatusCode /*int*/  = (int) (401);
 //BA.debugLineNum = 557;BA.debugLine="DatabaseError.ErrorMessage = \"Unauthorized\"";
_databaseerror.ErrorMessage /*String*/  = "Unauthorized";
 //BA.debugLineNum = 558;BA.debugLine="Return DatabaseError";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_databaseerror));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 561;BA.debugLine="Dim url As String = $\"${m_Supabase.URL}/auth/v1/u";
_url = (""+parent.__c.SmartStringFormatter("",(Object)(parent._m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/auth/v1/user");
 //BA.debugLineNum = 563;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 564;BA.debugLine="If NewEmail <> \"\" Then json.Initialize(CreateMap(";
if (true) break;

case 5:
//if
this.state = 10;
if ((_newemail).equals("") == false) { 
this.state = 7;
;}if (true) break;

case 7:
//C
this.state = 10;
_json.Initialize(parent.__c.createMap(new Object[] {(Object)("email"),(Object)(_newemail)}));
if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 565;BA.debugLine="If NewPassword <> \"\" Then json.Initialize(CreateM";
if (true) break;

case 11:
//if
this.state = 16;
if ((_newpassword).equals("") == false) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
_json.Initialize(parent.__c.createMap(new Object[] {(Object)("password"),(Object)(_newpassword)}));
if (true) break;

case 16:
//C
this.state = 17;
;
 //BA.debugLineNum = 567;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 567;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 568;BA.debugLine="j.PutString(url,json.ToString)";
_j._vvvvvvvvvvvvvvvvvvvvvvv5 /*String*/ (_url,_json.ToString());
 //BA.debugLineNum = 569;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 570;BA.debugLine="j.GetRequest.SetHeader(\"apikey\",m_Supabase.ApiKey";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("apikey",parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ());
 //BA.debugLineNum = 571;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_accesstoken);
 //BA.debugLineNum = 573;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 24;
return;
case 24:
//C
this.state = 17;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 575;BA.debugLine="DatabaseError.Success = j.Success";
_databaseerror.Success /*boolean*/  = _j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ;
 //BA.debugLineNum = 577;BA.debugLine="If j.Success = False Then";
if (true) break;

case 17:
//if
this.state = 22;
if (_j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ==parent.__c.False) { 
this.state = 19;
}else {
this.state = 21;
}if (true) break;

case 19:
//C
this.state = 22;
 //BA.debugLineNum = 578;BA.debugLine="DatabaseError.StatusCode = j.Response.StatusCode";
_databaseerror.StatusCode /*int*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv6 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode();
 //BA.debugLineNum = 579;BA.debugLine="DatabaseError.ErrorMessage = j.ErrorMessage";
_databaseerror.ErrorMessage /*String*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ;
 if (true) break;

case 21:
//C
this.state = 22;
 //BA.debugLineNum = 581;BA.debugLine="AuthStateChange(\"userUpdated\")";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("userUpdated");
 if (true) break;

case 22:
//C
this.state = -1;
;
 //BA.debugLineNum = 587;BA.debugLine="Return DatabaseError";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_databaseerror));return;};
 //BA.debugLineNum = 589;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
