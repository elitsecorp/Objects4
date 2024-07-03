package elicorp.pilot;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class supabase_storagefile extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "elicorp.pilot.supabase_storagefile");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", elicorp.pilot.supabase_storagefile.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public elicorp.pilot.supabase _m_supabase = null;
public Object _vvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public String _m_mode = "";
public String _m_bucketname = "";
public String _m_wildcard = "";
public byte[] _m_filebody = null;
public boolean _m_isupsert = false;
public int _m_cachecontrol = 0;
public anywheresoftware.b4a.objects.collections.Map _m_transform = null;
public Object[] _m_deletefiles = null;
public String _m_movepath_frompath = "";
public String _m_movepath_topath = "";
public int _m_expiresinseconds = 0;
public String _m_signedurl = "";
public b4a.example.dateutils _vvvvvvvvvvv0 = null;
public elicorp.pilot.main _vvvvvvvvvvvv1 = null;
public elicorp.pilot.starter _vvvvvvvvvvvv2 = null;
public elicorp.pilot.httputils2service _vvvvvvvvvvvv3 = null;
public elicorp.pilot.b4xpages _vvvvvvvvvvvv4 = null;
public elicorp.pilot.b4xcollections _vvvvvvvvvvvv5 = null;
public elicorp.pilot.dbutils _vvvvvvvvvvvv6 = null;
public elicorp.pilot.xuiviewsutils _vvvvvvvvvvvv7 = null;
public elicorp.pilot.supabase_functions _supabase_functions = null;
public static class _supabaserangedownloadtracker{
public boolean IsInitialized;
public long CurrentLength;
public long TotalLength;
public boolean Completed;
public boolean Cancel;
public void Initialize() {
IsInitialized = true;
CurrentLength = 0L;
TotalLength = 0L;
Completed = false;
Cancel = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private m_Supabase As Supabase";
_m_supabase = new elicorp.pilot.supabase();
 //BA.debugLineNum = 4;BA.debugLine="Type SupabaseRangeDownloadTracker (CurrentLength";
;
 //BA.debugLineNum = 6;BA.debugLine="Public Tag As Object";
_vvvvvvvvvvvvvvvvvvvvvvvv7 = new Object();
 //BA.debugLineNum = 8;BA.debugLine="Private m_Mode As String";
_m_mode = "";
 //BA.debugLineNum = 9;BA.debugLine="Private m_BucketName As String";
_m_bucketname = "";
 //BA.debugLineNum = 10;BA.debugLine="Private m_Wildcard As String";
_m_wildcard = "";
 //BA.debugLineNum = 11;BA.debugLine="Private m_FileBody() As Byte";
_m_filebody = new byte[(int) (0)];
;
 //BA.debugLineNum = 12;BA.debugLine="Private m_isUpsert As Boolean = False";
_m_isupsert = __c.False;
 //BA.debugLineNum = 13;BA.debugLine="Private m_CacheControl As Int = 3600";
_m_cachecontrol = (int) (3600);
 //BA.debugLineNum = 20;BA.debugLine="Private m_Transform As Map";
_m_transform = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 22;BA.debugLine="Private m_DeleteFiles() As Object";
_m_deletefiles = new Object[(int) (0)];
{
int d0 = _m_deletefiles.length;
for (int i0 = 0;i0 < d0;i0++) {
_m_deletefiles[i0] = new Object();
}
}
;
 //BA.debugLineNum = 23;BA.debugLine="Private m_MovePath_FromPath As String";
_m_movepath_frompath = "";
 //BA.debugLineNum = 24;BA.debugLine="Private m_MovePath_ToPath As String";
_m_movepath_topath = "";
 //BA.debugLineNum = 25;BA.debugLine="Private m_ExpiresInSeconds As Int";
_m_expiresinseconds = 0;
 //BA.debugLineNum = 26;BA.debugLine="Private m_SignedURL As String";
_m_signedurl = "";
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.supabase_storagefile  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(String _frompath,String _topath) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Public Sub CopyFile(FromPath As String,ToPath As S";
 //BA.debugLineNum = 118;BA.debugLine="m_MovePath_FromPath = FromPath";
_m_movepath_frompath = _frompath;
 //BA.debugLineNum = 119;BA.debugLine="m_MovePath_ToPath = ToPath";
_m_movepath_topath = _topath;
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_storagefile)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7() throws Exception{
ResumableSub_CreateSignedUrl rsub = new ResumableSub_CreateSignedUrl(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CreateSignedUrl extends BA.ResumableSub {
public ResumableSub_CreateSignedUrl(elicorp.pilot.supabase_storagefile parent) {
this.parent = parent;
}
elicorp.pilot.supabase_storagefile parent;
elicorp.pilot.supabase._supabasestoragefile _storagefile = null;
elicorp.pilot.supabase._supabaseerror _databaseerror = null;
String _accesstoken = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsn = null;
anywheresoftware.b4a.objects.collections.Map _m_request = null;
String _url = "";
elicorp.pilot.httpjob _j = null;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _jroot = null;

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
 //BA.debugLineNum = 429;BA.debugLine="Dim StorageFile As SupabaseStorageFile";
_storagefile = new elicorp.pilot.supabase._supabasestoragefile();
 //BA.debugLineNum = 430;BA.debugLine="StorageFile.Initialize";
_storagefile.Initialize();
 //BA.debugLineNum = 431;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 432;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 434;BA.debugLine="Wait For (m_Supabase.Auth.GetAccessToken) Complet";
parent.__c.WaitFor("complete", ba, this, parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 11;
return;
case 11:
//C
this.state = 1;
_accesstoken = (String) result[0];
;
 //BA.debugLineNum = 435;BA.debugLine="If AccessToken = \"\" Then";
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
 //BA.debugLineNum = 436;BA.debugLine="DatabaseError.StatusCode = 401";
_databaseerror.StatusCode /*int*/  = (int) (401);
 //BA.debugLineNum = 437;BA.debugLine="DatabaseError.ErrorMessage = \"Unauthorized\"";
_databaseerror.ErrorMessage /*String*/  = "Unauthorized";
 //BA.debugLineNum = 438;BA.debugLine="Return DatabaseError";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_databaseerror));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 441;BA.debugLine="Dim jsn As JSONGenerator";
_jsn = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 443;BA.debugLine="Dim m_Request As Map";
_m_request = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 444;BA.debugLine="m_Request.Initialize";
_m_request.Initialize();
 //BA.debugLineNum = 445;BA.debugLine="m_Request.Put(\"expiresIn\",m_ExpiresInSeconds)";
_m_request.Put((Object)("expiresIn"),(Object)(parent._m_expiresinseconds));
 //BA.debugLineNum = 447;BA.debugLine="jsn.Initialize(m_Request)";
_jsn.Initialize(_m_request);
 //BA.debugLineNum = 449;BA.debugLine="Dim url As String = \"\"";
_url = "";
 //BA.debugLineNum = 450;BA.debugLine="url = url & $\"${m_Supabase.URL}/storage/v1/object";
_url = _url+(""+parent.__c.SmartStringFormatter("",(Object)(parent._m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/storage/v1/object/sign/"+parent.__c.SmartStringFormatter("",(Object)(parent._m_bucketname))+"/"+parent.__c.SmartStringFormatter("",(Object)(parent._m_wildcard))+"");
 //BA.debugLineNum = 452;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 452;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 453;BA.debugLine="j.PostString(url,jsn.ToString)";
_j._vvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ (_url,_jsn.ToString());
 //BA.debugLineNum = 454;BA.debugLine="j.GetRequest.SetHeader(\"apikey\",m_Supabase.ApiKey";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("apikey",parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ());
 //BA.debugLineNum = 455;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_accesstoken);
 //BA.debugLineNum = 456;BA.debugLine="j.GetRequest.SetHeader(\"accept\",\"application/json";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("accept","application/json");
 //BA.debugLineNum = 457;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 459;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 12;
return;
case 12:
//C
this.state = 5;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 461;BA.debugLine="DatabaseError.Success = j.Success";
_databaseerror.Success /*boolean*/  = _j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ;
 //BA.debugLineNum = 463;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 465;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 466;BA.debugLine="parser.Initialize(j.GetString)";
_parser.Initialize(_j._vvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ());
 //BA.debugLineNum = 467;BA.debugLine="Dim jRoot As Map = parser.NextObject";
_jroot = new anywheresoftware.b4a.objects.collections.Map();
_jroot = _parser.NextObject();
 //BA.debugLineNum = 469;BA.debugLine="StorageFile.SignedURL = m_Supabase.URL & jRoot.G";
_storagefile.SignedURL /*String*/  = parent._m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()+BA.ObjectToString(_jroot.Get((Object)("signedURL")));
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 472;BA.debugLine="DatabaseError.StatusCode = j.Response.StatusCode";
_databaseerror.StatusCode /*int*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv6 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode();
 //BA.debugLineNum = 473;BA.debugLine="DatabaseError.ErrorMessage = j.ErrorMessage";
_databaseerror.ErrorMessage /*String*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ;
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 476;BA.debugLine="StorageFile.Error = DatabaseError";
_storagefile.Error /*elicorp.pilot.supabase._supabaseerror*/  = _databaseerror;
 //BA.debugLineNum = 477;BA.debugLine="Return StorageFile";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_storagefile));return;};
 //BA.debugLineNum = 479;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(String _accesstoken) throws Exception{
}
public void  _jobdone(elicorp.pilot.httpjob _j) throws Exception{
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws Exception{
ResumableSub_DeleteFile rsub = new ResumableSub_DeleteFile(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DeleteFile extends BA.ResumableSub {
public ResumableSub_DeleteFile(elicorp.pilot.supabase_storagefile parent) {
this.parent = parent;
}
elicorp.pilot.supabase_storagefile parent;
elicorp.pilot.supabase._supabasestoragefile _storagefile = null;
elicorp.pilot.supabase._supabaseerror _databaseerror = null;
String _accesstoken = "";
String _url = "";
elicorp.pilot.httpjob _j = null;
String[] _tmp_files = null;
int _i = 0;
int step16;
int limit16;

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
 //BA.debugLineNum = 162;BA.debugLine="Dim StorageFile As SupabaseStorageFile";
_storagefile = new elicorp.pilot.supabase._supabasestoragefile();
 //BA.debugLineNum = 163;BA.debugLine="StorageFile.Initialize";
_storagefile.Initialize();
 //BA.debugLineNum = 164;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 165;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 167;BA.debugLine="Wait For (m_Supabase.Auth.GetAccessToken) Complet";
parent.__c.WaitFor("complete", ba, this, parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 15;
return;
case 15:
//C
this.state = 1;
_accesstoken = (String) result[0];
;
 //BA.debugLineNum = 168;BA.debugLine="If AccessToken = \"\" Then";
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
 //BA.debugLineNum = 169;BA.debugLine="DatabaseError.StatusCode = 401";
_databaseerror.StatusCode /*int*/  = (int) (401);
 //BA.debugLineNum = 170;BA.debugLine="DatabaseError.ErrorMessage = \"Unauthorized\"";
_databaseerror.ErrorMessage /*String*/  = "Unauthorized";
 //BA.debugLineNum = 171;BA.debugLine="Return DatabaseError";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_databaseerror));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 174;BA.debugLine="Dim url As String = \"\"";
_url = "";
 //BA.debugLineNum = 175;BA.debugLine="url = url & $\"${m_Supabase.URL}/storage/v1/object";
_url = _url+(""+parent.__c.SmartStringFormatter("",(Object)(parent._m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/storage/v1/object/"+parent.__c.SmartStringFormatter("",(Object)(parent._m_bucketname))+"$\"");
 //BA.debugLineNum = 177;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 177;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 179;BA.debugLine="Dim tmp_Files(m_DeleteFiles.Length) As String";
_tmp_files = new String[parent._m_deletefiles.length];
java.util.Arrays.fill(_tmp_files,"");
 //BA.debugLineNum = 181;BA.debugLine="For i = 0 To m_DeleteFiles.Length -1";
if (true) break;

case 5:
//for
this.state = 8;
step16 = 1;
limit16 = (int) (parent._m_deletefiles.length-1);
_i = (int) (0) ;
this.state = 16;
if (true) break;

case 16:
//C
this.state = 8;
if ((step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16)) this.state = 7;
if (true) break;

case 17:
//C
this.state = 16;
_i = ((int)(0 + _i + step16)) ;
if (true) break;

case 7:
//C
this.state = 17;
 //BA.debugLineNum = 182;BA.debugLine="tmp_Files(i) = m_DeleteFiles(I)";
_tmp_files[_i] = BA.ObjectToString(parent._m_deletefiles[_i]);
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
;
 //BA.debugLineNum = 186;BA.debugLine="j.GetRequest.SetHeader(\"apikey\",m_Supabase.ApiKey";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("apikey",parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ());
 //BA.debugLineNum = 187;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_accesstoken);
 //BA.debugLineNum = 189;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 18;
return;
case 18:
//C
this.state = 9;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 191;BA.debugLine="DatabaseError.Success = j.Success";
_databaseerror.Success /*boolean*/  = _j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ;
 //BA.debugLineNum = 193;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 196;BA.debugLine="DatabaseError.StatusCode = j.Response.StatusCode";
_databaseerror.StatusCode /*int*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv6 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode();
 //BA.debugLineNum = 197;BA.debugLine="DatabaseError.ErrorMessage = j.ErrorMessage";
_databaseerror.ErrorMessage /*String*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ;
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 200;BA.debugLine="StorageFile.Error = DatabaseError";
_storagefile.Error /*elicorp.pilot.supabase._supabaseerror*/  = _databaseerror;
 //BA.debugLineNum = 202;BA.debugLine="Return StorageFile";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_storagefile));return;};
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws Exception{
ResumableSub_DownloadFile rsub = new ResumableSub_DownloadFile(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DownloadFile extends BA.ResumableSub {
public ResumableSub_DownloadFile(elicorp.pilot.supabase_storagefile parent) {
this.parent = parent;
}
elicorp.pilot.supabase_storagefile parent;
elicorp.pilot.supabase._supabasestoragefile _storagefile = null;
elicorp.pilot.supabase._supabaseerror _databaseerror = null;
String _accesstoken = "";
elicorp.pilot.httpjob _j = null;
String _url = "";
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
String _token = "";
int _counter = 0;
String _k = "";
elicorp.pilot.supabase_storagefile._supabaserangedownloadtracker _tracker = null;
elicorp.pilot.supabase._supabasestoragefile _storagefile2 = null;
anywheresoftware.b4a.BA.IterableList group25;
int index25;
int groupLen25;

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
 //BA.debugLineNum = 220;BA.debugLine="Dim StorageFile As SupabaseStorageFile";
_storagefile = new elicorp.pilot.supabase._supabasestoragefile();
 //BA.debugLineNum = 221;BA.debugLine="StorageFile.Initialize";
_storagefile.Initialize();
 //BA.debugLineNum = 222;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 223;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 225;BA.debugLine="Wait For (m_Supabase.Auth.GetAccessToken) Complet";
parent.__c.WaitFor("complete", ba, this, parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 30;
return;
case 30:
//C
this.state = 1;
_accesstoken = (String) result[0];
;
 //BA.debugLineNum = 226;BA.debugLine="If AccessToken = \"\" Then";
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
 //BA.debugLineNum = 227;BA.debugLine="DatabaseError.StatusCode = 401";
_databaseerror.StatusCode /*int*/  = (int) (401);
 //BA.debugLineNum = 228;BA.debugLine="DatabaseError.ErrorMessage = \"Unauthorized\"";
_databaseerror.ErrorMessage /*String*/  = "Unauthorized";
 //BA.debugLineNum = 229;BA.debugLine="Return DatabaseError";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_databaseerror));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 232;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 232;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 234;BA.debugLine="Dim url As String = $\"${m_Supabase.URL}/storage/v";
_url = (""+parent.__c.SmartStringFormatter("",(Object)(parent._m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/storage/v1");
 //BA.debugLineNum = 235;BA.debugLine="If m_SignedURL <> \"\" Then";
if (true) break;

case 5:
//if
this.state = 14;
if ((parent._m_signedurl).equals("") == false) { 
this.state = 7;
}else {
this.state = 13;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 236;BA.debugLine="url = url & $\"/${IIf(m_Transform.Size=0,\"object\"";
_url = _url+("/"+parent.__c.SmartStringFormatter("",((parent._m_transform.getSize()==0) ? ((Object)("object")) : ((Object)("render/image"))))+"/sign/"+parent.__c.SmartStringFormatter("",(Object)(parent._m_bucketname))+"/"+parent.__c.SmartStringFormatter("",(Object)(parent._m_wildcard))+"");
 //BA.debugLineNum = 238;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"token=([^&\\s]+";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = parent.__c.Regex.Matcher("token=([^&\\s]+)",parent._m_signedurl);
 //BA.debugLineNum = 239;BA.debugLine="If m.Find Then";
if (true) break;

case 8:
//if
this.state = 11;
if (_m.Find()) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 240;BA.debugLine="Dim token As String = m.Group(1)";
_token = _m.Group((int) (1));
 //BA.debugLineNum = 241;BA.debugLine="url = url & $\"?token=${token}\"$";
_url = _url+("?token="+parent.__c.SmartStringFormatter("",(Object)(_token))+"");
 if (true) break;

case 11:
//C
this.state = 14;
;
 if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 245;BA.debugLine="url = url & $\"/${IIf(m_Transform.Size=0,\"object\"";
_url = _url+("/"+parent.__c.SmartStringFormatter("",((parent._m_transform.getSize()==0) ? ((Object)("object")) : ((Object)(("render/image/authenticated")))))+"/"+parent.__c.SmartStringFormatter("",(Object)(parent._m_bucketname))+"/"+parent.__c.SmartStringFormatter("",(Object)(parent._m_wildcard))+"");
 if (true) break;

case 14:
//C
this.state = 15;
;
 //BA.debugLineNum = 248;BA.debugLine="Dim Counter As Int = 0";
_counter = (int) (0);
 //BA.debugLineNum = 249;BA.debugLine="For Each k As String In m_Transform.Keys";
if (true) break;

case 15:
//for
this.state = 18;
group25 = parent._m_transform.Keys();
index25 = 0;
groupLen25 = group25.getSize();
this.state = 31;
if (true) break;

case 31:
//C
this.state = 18;
if (index25 < groupLen25) {
this.state = 17;
_k = BA.ObjectToString(group25.Get(index25));}
if (true) break;

case 32:
//C
this.state = 31;
index25++;
if (true) break;

case 17:
//C
this.state = 32;
 //BA.debugLineNum = 250;BA.debugLine="Counter = Counter +1";
_counter = (int) (_counter+1);
 //BA.debugLineNum = 251;BA.debugLine="url = url & IIf(Counter = 1,\"?\",\"&\") & k & \"=\" &";
_url = _url+BA.ObjectToString(((_counter==1) ? ((Object)("?")) : ((Object)("&"))))+_k+"="+BA.ObjectToString(parent._m_transform.Get((Object)(_k)));
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 254;BA.debugLine="If m_Mode = \"DownloadProgress\" Then";

case 18:
//if
this.state = 29;
if ((parent._m_mode).equals("DownloadProgress")) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 29;
 //BA.debugLineNum = 256;BA.debugLine="Dim tracker As SupabaseRangeDownloadTracker = Ra";
_tracker = parent._rangedownloader_createtracker();
 //BA.debugLineNum = 257;BA.debugLine="Track(tracker)";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(_tracker);
 //BA.debugLineNum = 258;BA.debugLine="Wait For (RangeDownloader_Download(Tag.As(Map).G";
parent.__c.WaitFor("complete", ba, this, parent._rangedownloader_download(BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent._vvvvvvvvvvvvvvvvvvvvvvvv7))).Get((Object)("DownloadPath"))),parent._supabase_functions._vvvvvvvv6 /*String*/ (parent.getActivityBA(),parent._m_wildcard),_url,_tracker));
this.state = 33;
return;
case 33:
//C
this.state = 29;
_storagefile2 = (elicorp.pilot.supabase._supabasestoragefile) result[0];
;
 //BA.debugLineNum = 260;BA.debugLine="StorageFile = StorageFile2";
_storagefile = _storagefile2;
 if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 264;BA.debugLine="j.Download(url)";
_j._vvvvvvvvvvvvvvvvvvvvv2 /*String*/ (_url);
 //BA.debugLineNum = 265;BA.debugLine="j.GetRequest.SetHeader(\"apikey\",m_Supabase.ApiKe";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("apikey",parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ());
 //BA.debugLineNum = 266;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_accesstoken);
 //BA.debugLineNum = 268;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 34;
return;
case 34:
//C
this.state = 23;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 270;BA.debugLine="DatabaseError.Success = j.Success";
_databaseerror.Success /*boolean*/  = _j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ;
 //BA.debugLineNum = 272;BA.debugLine="If j.Success Then";
if (true) break;

case 23:
//if
this.state = 28;
if (_j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ) { 
this.state = 25;
}else {
this.state = 27;
}if (true) break;

case 25:
//C
this.state = 28;
 //BA.debugLineNum = 274;BA.debugLine="StorageFile.FileBody = Bit.InputStreamToBytes(j";
_storagefile.FileBody /*byte[]*/  = parent.__c.Bit.InputStreamToBytes((java.io.InputStream)(_j._vvvvvvvvvvvvvvvvvvvvv0 /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ ().getObject()));
 if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 277;BA.debugLine="DatabaseError.StatusCode = j.Response.StatusCod";
_databaseerror.StatusCode /*int*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv6 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode();
 //BA.debugLineNum = 278;BA.debugLine="DatabaseError.ErrorMessage = j.ErrorMessage";
_databaseerror.ErrorMessage /*String*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ;
 if (true) break;

case 28:
//C
this.state = 29;
;
 //BA.debugLineNum = 281;BA.debugLine="StorageFile.Error = DatabaseError";
_storagefile.Error /*elicorp.pilot.supabase._supabaseerror*/  = _databaseerror;
 if (true) break;

case 29:
//C
this.state = -1;
;
 //BA.debugLineNum = 286;BA.debugLine="Return StorageFile";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_storagefile));return;};
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public elicorp.pilot.supabase_storagefile  _downloadoptions_transformformat(String _format) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Public Sub DownloadOptions_TransformFormat(Format";
 //BA.debugLineNum = 102;BA.debugLine="m_Transform.Put(\"format\",Format)";
_m_transform.Put((Object)("format"),(Object)(_format));
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_storagefile)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_storagefile  _downloadoptions_transformheight(int _height) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Public Sub DownloadOptions_TransformHeight(Height";
 //BA.debugLineNum = 80;BA.debugLine="m_Transform.Put(\"height\",Height)";
_m_transform.Put((Object)("height"),(Object)(_height));
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_storagefile)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_storagefile  _downloadoptions_transformquality(int _quality) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Public Sub DownloadOptions_TransformQuality(Qualit";
 //BA.debugLineNum = 86;BA.debugLine="m_Transform.Put(\"quality\",Quality)";
_m_transform.Put((Object)("quality"),(Object)(_quality));
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_storagefile)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_storagefile  _downloadoptions_transformresize(String _resizemode) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Public Sub DownloadOptions_TransformResize(ResizeM";
 //BA.debugLineNum = 95;BA.debugLine="m_Transform.Put(\"resize\",ResizeMode)";
_m_transform.Put((Object)("resize"),(Object)(_resizemode));
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_storagefile)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_storagefile  _downloadoptions_transformwidth(int _width) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Public Sub DownloadOptions_TransformWidth(Width As";
 //BA.debugLineNum = 74;BA.debugLine="m_Transform.Put(\"width\",Width)";
_m_transform.Put((Object)("width"),(Object)(_width));
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_storagefile)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws Exception{
ResumableSub_Execute rsub = new ResumableSub_Execute(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Execute extends BA.ResumableSub {
public ResumableSub_Execute(elicorp.pilot.supabase_storagefile parent) {
this.parent = parent;
}
elicorp.pilot.supabase_storagefile parent;
elicorp.pilot.supabase._supabasestoragefile _result = null;
elicorp.pilot.supabase._supabasestoragebucket _bucket = null;
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
 //BA.debugLineNum = 125;BA.debugLine="Select m_Mode";
if (true) break;

case 1:
//select
this.state = 18;
switch (BA.switchObjectToInt(parent._m_mode,"Upload","Download","DownloadProgress","Update","Delete","MovePath","CopyPath","CreateSignedUrl")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: 
case 2: {
this.state = 5;
if (true) break;
}
case 3: {
this.state = 7;
if (true) break;
}
case 4: {
this.state = 9;
if (true) break;
}
case 5: {
this.state = 11;
if (true) break;
}
case 6: {
this.state = 13;
if (true) break;
}
case 7: {
this.state = 15;
if (true) break;
}
default: {
this.state = 17;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 18;
 //BA.debugLineNum = 127;BA.debugLine="Wait For (UploadFile) Complete (Result As Supab";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1());
this.state = 19;
return;
case 19:
//C
this.state = 18;
_result = (elicorp.pilot.supabase._supabasestoragefile) result[0];
;
 //BA.debugLineNum = 128;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;

case 5:
//C
this.state = 18;
 //BA.debugLineNum = 130;BA.debugLine="Wait For (DownloadFile) Complete (Result As Sup";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1());
this.state = 20;
return;
case 20:
//C
this.state = 18;
_result = (elicorp.pilot.supabase._supabasestoragefile) result[0];
;
 //BA.debugLineNum = 131;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;

case 7:
//C
this.state = 18;
 //BA.debugLineNum = 133;BA.debugLine="Wait For (UpdateFile) Complete (Result As Supab";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0());
this.state = 21;
return;
case 21:
//C
this.state = 18;
_result = (elicorp.pilot.supabase._supabasestoragefile) result[0];
;
 //BA.debugLineNum = 134;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;

case 9:
//C
this.state = 18;
 //BA.debugLineNum = 136;BA.debugLine="Wait For (DeleteFile) Complete (Result As Supab";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2());
this.state = 22;
return;
case 22:
//C
this.state = 18;
_result = (elicorp.pilot.supabase._supabasestoragefile) result[0];
;
 //BA.debugLineNum = 137;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;

case 11:
//C
this.state = 18;
 //BA.debugLineNum = 139;BA.debugLine="Wait For (MoveOrCopyPath(False)) Complete (Resu";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(parent.__c.False));
this.state = 23;
return;
case 23:
//C
this.state = 18;
_result = (elicorp.pilot.supabase._supabasestoragefile) result[0];
;
 //BA.debugLineNum = 140;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;

case 13:
//C
this.state = 18;
 //BA.debugLineNum = 142;BA.debugLine="Wait For (MoveOrCopyPath(True)) Complete (Resul";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(parent.__c.True));
this.state = 24;
return;
case 24:
//C
this.state = 18;
_result = (elicorp.pilot.supabase._supabasestoragefile) result[0];
;
 //BA.debugLineNum = 143;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;

case 15:
//C
this.state = 18;
 //BA.debugLineNum = 145;BA.debugLine="Wait For (CreateSignedUrl) Complete (Result As";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7());
this.state = 25;
return;
case 25:
//C
this.state = 18;
_result = (elicorp.pilot.supabase._supabasestoragefile) result[0];
;
 //BA.debugLineNum = 146;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 148;BA.debugLine="Dim Bucket As SupabaseStorageBucket";
_bucket = new elicorp.pilot.supabase._supabasestoragebucket();
 //BA.debugLineNum = 149;BA.debugLine="Bucket.Initialize";
_bucket.Initialize();
 //BA.debugLineNum = 150;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 151;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 152;BA.debugLine="DatabaseError.Success = False";
_databaseerror.Success /*boolean*/  = parent.__c.False;
 //BA.debugLineNum = 153;BA.debugLine="DatabaseError.ErrorMessage = \"unknown mode\"";
_databaseerror.ErrorMessage /*String*/  = "unknown mode";
 //BA.debugLineNum = 154;BA.debugLine="Bucket.Error = DatabaseError";
_bucket.Error /*elicorp.pilot.supabase._supabaseerror*/  = _databaseerror;
 //BA.debugLineNum = 155;BA.debugLine="Return Bucket";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_bucket));return;};
 if (true) break;

case 18:
//C
this.state = -1;
;
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public elicorp.pilot.supabase_storagefile  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(int _seconds) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Public Sub ExpiresInSeconds(Seconds As Int) As Sup";
 //BA.debugLineNum = 49;BA.debugLine="m_ExpiresInSeconds = Seconds";
_m_expiresinseconds = _seconds;
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_storagefile)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_storagefile  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(byte[] _data) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Public Sub FileBody(Data() As Byte) As Supabase_St";
 //BA.debugLineNum = 54;BA.debugLine="m_FileBody = Data";
_m_filebody = _data;
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_storagefile)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,elicorp.pilot.supabase _thissupabase,String _bucketname,String _mode) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 30;BA.debugLine="Public Sub Initialize(ThisSupabase As Supabase,Buc";
 //BA.debugLineNum = 31;BA.debugLine="m_Supabase = ThisSupabase";
_m_supabase = _thissupabase;
 //BA.debugLineNum = 32;BA.debugLine="m_BucketName = BucketName";
_m_bucketname = _bucketname;
 //BA.debugLineNum = 33;BA.debugLine="m_Mode = Mode";
_m_mode = _mode;
 //BA.debugLineNum = 34;BA.debugLine="m_Transform.Initialize";
_m_transform.Initialize();
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.supabase_storagefile  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(String _frompath,String _topath) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Public Sub MoveFile(FromPath As String,ToPath As S";
 //BA.debugLineNum = 112;BA.debugLine="m_MovePath_FromPath = FromPath";
_m_movepath_frompath = _frompath;
 //BA.debugLineNum = 113;BA.debugLine="m_MovePath_ToPath = ToPath";
_m_movepath_topath = _topath;
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_storagefile)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(boolean _copypath) throws Exception{
ResumableSub_MoveOrCopyPath rsub = new ResumableSub_MoveOrCopyPath(this,_copypath);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_MoveOrCopyPath extends BA.ResumableSub {
public ResumableSub_MoveOrCopyPath(elicorp.pilot.supabase_storagefile parent,boolean _copypath) {
this.parent = parent;
this._copypath = _copypath;
}
elicorp.pilot.supabase_storagefile parent;
boolean _copypath;
elicorp.pilot.supabase._supabasestoragefile _storagefile = null;
elicorp.pilot.supabase._supabaseerror _databaseerror = null;
String _accesstoken = "";
String _url = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsn = null;
anywheresoftware.b4a.objects.collections.Map _m_request = null;
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
 //BA.debugLineNum = 378;BA.debugLine="Dim StorageFile As SupabaseStorageFile";
_storagefile = new elicorp.pilot.supabase._supabasestoragefile();
 //BA.debugLineNum = 379;BA.debugLine="StorageFile.Initialize";
_storagefile.Initialize();
 //BA.debugLineNum = 380;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 381;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 383;BA.debugLine="Wait For (m_Supabase.Auth.GetAccessToken) Complet";
parent.__c.WaitFor("complete", ba, this, parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 11;
return;
case 11:
//C
this.state = 1;
_accesstoken = (String) result[0];
;
 //BA.debugLineNum = 384;BA.debugLine="If AccessToken = \"\" Then";
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
 //BA.debugLineNum = 385;BA.debugLine="DatabaseError.StatusCode = 401";
_databaseerror.StatusCode /*int*/  = (int) (401);
 //BA.debugLineNum = 386;BA.debugLine="DatabaseError.ErrorMessage = \"Unauthorized\"";
_databaseerror.ErrorMessage /*String*/  = "Unauthorized";
 //BA.debugLineNum = 387;BA.debugLine="Return DatabaseError";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_databaseerror));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 390;BA.debugLine="Dim url As String = \"\"";
_url = "";
 //BA.debugLineNum = 391;BA.debugLine="url = url & $\"${m_Supabase.URL}/storage/v1/object";
_url = _url+(""+parent.__c.SmartStringFormatter("",(Object)(parent._m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/storage/v1/object/")+BA.ObjectToString(((_copypath) ? ((Object)("copy")) : ((Object)("move"))));
 //BA.debugLineNum = 393;BA.debugLine="Dim jsn As JSONGenerator";
_jsn = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 395;BA.debugLine="Dim m_Request As Map";
_m_request = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 396;BA.debugLine="m_Request.Initialize";
_m_request.Initialize();
 //BA.debugLineNum = 397;BA.debugLine="m_Request.Put(\"bucketId\",m_BucketName)";
_m_request.Put((Object)("bucketId"),(Object)(parent._m_bucketname));
 //BA.debugLineNum = 398;BA.debugLine="m_Request.Put(\"sourceKey\",m_MovePath_FromPath)";
_m_request.Put((Object)("sourceKey"),(Object)(parent._m_movepath_frompath));
 //BA.debugLineNum = 399;BA.debugLine="m_Request.Put(\"destinationKey\",m_MovePath_ToPath)";
_m_request.Put((Object)("destinationKey"),(Object)(parent._m_movepath_topath));
 //BA.debugLineNum = 401;BA.debugLine="jsn.Initialize(m_Request)";
_jsn.Initialize(_m_request);
 //BA.debugLineNum = 403;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 403;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 404;BA.debugLine="j.PostString(url,jsn.ToString)";
_j._vvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ (_url,_jsn.ToString());
 //BA.debugLineNum = 405;BA.debugLine="j.GetRequest.SetHeader(\"apikey\",m_Supabase.ApiKey";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("apikey",parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ());
 //BA.debugLineNum = 406;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_accesstoken);
 //BA.debugLineNum = 407;BA.debugLine="j.GetRequest.SetContentType(Supabase_Functions.Ge";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType(parent._supabase_functions._vvvvvvvv7 /*String*/ (parent.getActivityBA(),parent._supabase_functions._vvvvvvvv5 /*String*/ (parent.getActivityBA(),parent._m_wildcard)));
 //BA.debugLineNum = 409;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 12;
return;
case 12:
//C
this.state = 5;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 411;BA.debugLine="DatabaseError.Success = j.Success";
_databaseerror.Success /*boolean*/  = _j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ;
 //BA.debugLineNum = 413;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 418;BA.debugLine="DatabaseError.StatusCode = j.Response.StatusCode";
_databaseerror.StatusCode /*int*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv6 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode();
 //BA.debugLineNum = 419;BA.debugLine="DatabaseError.ErrorMessage = j.ErrorMessage";
_databaseerror.ErrorMessage /*String*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ;
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 422;BA.debugLine="StorageFile.Error = DatabaseError";
_storagefile.Error /*elicorp.pilot.supabase._supabaseerror*/  = _databaseerror;
 //BA.debugLineNum = 423;BA.debugLine="Return StorageFile";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_storagefile));return;};
 //BA.debugLineNum = 425;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public elicorp.pilot.supabase_storagefile  _options_cachecontrol(int _cachecontrol) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Public Sub Options_CacheControl(CacheControl As In";
 //BA.debugLineNum = 68;BA.debugLine="m_CacheControl = CacheControl";
_m_cachecontrol = _cachecontrol;
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_storagefile)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_storagefile  _options_upsert(boolean _isupsert) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Public Sub Options_Upsert(isUpsert As Boolean)  As";
 //BA.debugLineNum = 61;BA.debugLine="m_isUpsert = isUpsert";
_m_isupsert = _isupsert;
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_storagefile)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_storagefile  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(String _filename) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Public Sub Path(FileName As String) As Supabase_St";
 //BA.debugLineNum = 39;BA.debugLine="m_Wildcard = FileName";
_m_wildcard = _filename;
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_storagefile)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_storagefile._supabaserangedownloadtracker  _rangedownloader_createtracker() throws Exception{
elicorp.pilot.supabase_storagefile._supabaserangedownloadtracker _t = null;
 //BA.debugLineNum = 484;BA.debugLine="Public Sub RangeDownloader_CreateTracker As Supaba";
 //BA.debugLineNum = 485;BA.debugLine="Dim t As SupabaseRangeDownloadTracker";
_t = new elicorp.pilot.supabase_storagefile._supabaserangedownloadtracker();
 //BA.debugLineNum = 486;BA.debugLine="t.Initialize";
_t.Initialize();
 //BA.debugLineNum = 487;BA.debugLine="Return t";
if (true) return _t;
 //BA.debugLineNum = 488;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _rangedownloader_download(String _dir,String _filename,String _url,elicorp.pilot.supabase_storagefile._supabaserangedownloadtracker _tracker) throws Exception{
ResumableSub_RangeDownloader_Download rsub = new ResumableSub_RangeDownloader_Download(this,_dir,_filename,_url,_tracker);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RangeDownloader_Download extends BA.ResumableSub {
public ResumableSub_RangeDownloader_Download(elicorp.pilot.supabase_storagefile parent,String _dir,String _filename,String _url,elicorp.pilot.supabase_storagefile._supabaserangedownloadtracker _tracker) {
this.parent = parent;
this._dir = _dir;
this._filename = _filename;
this._url = _url;
this._tracker = _tracker;
}
elicorp.pilot.supabase_storagefile parent;
String _dir;
String _filename;
String _url;
elicorp.pilot.supabase_storagefile._supabaserangedownloadtracker _tracker;
elicorp.pilot.supabase._supabasestoragefile _storagefile = null;
elicorp.pilot.supabase._supabaseerror _databaseerror = null;
elicorp.pilot.httpjob _head = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
elicorp.pilot.httpjob _j = null;
String _range = "";
boolean _good = false;
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
 //BA.debugLineNum = 492;BA.debugLine="Dim StorageFile As SupabaseStorageFile";
_storagefile = new elicorp.pilot.supabase._supabasestoragefile();
 //BA.debugLineNum = 493;BA.debugLine="StorageFile.Initialize";
_storagefile.Initialize();
 //BA.debugLineNum = 494;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 495;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 497;BA.debugLine="Dim head As HttpJob";
_head = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 498;BA.debugLine="head.Initialize(\"\", Me)";
_head._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 499;BA.debugLine="head.Head(URL)";
_head._vvvvvvvvvvvvvvvvvvvvvv4 /*String*/ (_url);
 //BA.debugLineNum = 500;BA.debugLine="head.GetRequest.SetHeader(\"apikey\",m_Supabase.Api";
_head._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("apikey",parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ());
 //BA.debugLineNum = 501;BA.debugLine="head.GetRequest.SetHeader(\"Authorization\",\"Bearer";
_head._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*elicorp.pilot.supabase_authentication._supabasetokeninformations*/ ().AccessToken /*String*/ );
 //BA.debugLineNum = 502;BA.debugLine="Wait For (head) JobDone (head As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_head));
this.state = 34;
return;
case 34:
//C
this.state = 1;
_head = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 504;BA.debugLine="head.Release 'the actual content is not needed";
_head._vvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ();
 //BA.debugLineNum = 505;BA.debugLine="DatabaseError.Success = head.Success";
_databaseerror.Success /*boolean*/  = _head._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ;
 //BA.debugLineNum = 506;BA.debugLine="If head.Success Then";
if (true) break;

case 1:
//if
this.state = 16;
if (_head._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 507;BA.debugLine="Tracker.TotalLength = head.Response.ContentLengt";
_tracker.TotalLength /*long*/  = _head._vvvvvvvvvvvvvvvvvvvvvvvv6 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getContentLength();
 //BA.debugLineNum = 508;BA.debugLine="If Tracker.TotalLength = 0 Then Tracker.TotalLen";
if (true) break;

case 4:
//if
this.state = 9;
if (_tracker.TotalLength /*long*/ ==0) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_tracker.TotalLength /*long*/  = (long)(Double.parseDouble(parent._rangedownloader_getcaseinsensitiveheadervalue(_head,"content-length","0")));
if (true) break;

case 9:
//C
this.state = 10;
;
 //BA.debugLineNum = 510;BA.debugLine="If RangeDownloader_GetCaseInsensitiveHeaderValue";
if (true) break;

case 10:
//if
this.state = 13;
if (((parent._rangedownloader_getcaseinsensitiveheadervalue(_head,"Accept-Ranges",""))).equals("bytes") == false) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 511;BA.debugLine="Log(\"SupabaseStorage: accept ranges not support";
parent.__c.LogImpl("967371029","SupabaseStorage: accept ranges not supported",0);
 //BA.debugLineNum = 512;BA.debugLine="Tracker.Completed = True";
_tracker.Completed /*boolean*/  = parent.__c.True;
 //BA.debugLineNum = 513;BA.debugLine="DatabaseError.StatusCode = 400";
_databaseerror.StatusCode /*int*/  = (int) (400);
 //BA.debugLineNum = 514;BA.debugLine="DatabaseError.ErrorMessage = \"accept ranges not";
_databaseerror.ErrorMessage /*String*/  = "accept ranges not supported";
 //BA.debugLineNum = 515;BA.debugLine="Return StorageFile";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_storagefile));return;};
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 518;BA.debugLine="DatabaseError.StatusCode = head.Response.StatusC";
_databaseerror.StatusCode /*int*/  = _head._vvvvvvvvvvvvvvvvvvvvvvvv6 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode();
 //BA.debugLineNum = 519;BA.debugLine="DatabaseError.ErrorMessage = head.ErrorMessage";
_databaseerror.ErrorMessage /*String*/  = _head._vvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ;
 //BA.debugLineNum = 520;BA.debugLine="Tracker.Completed = True";
_tracker.Completed /*boolean*/  = parent.__c.True;
 //BA.debugLineNum = 521;BA.debugLine="Return StorageFile";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_storagefile));return;};
 if (true) break;
;
 //BA.debugLineNum = 525;BA.debugLine="If File.Exists(Dir, FileName) Then";

case 16:
//if
this.state = 19;
if (parent.__c.File.Exists(_dir,_filename)) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 526;BA.debugLine="Tracker.CurrentLength = File.Size(Dir, FileName)";
_tracker.CurrentLength /*long*/  = parent.__c.File.Size(_dir,_filename);
 if (true) break;

case 19:
//C
this.state = 20;
;
 //BA.debugLineNum = 528;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = parent.__c.File.OpenOutput(_dir,_filename,parent.__c.True);
 //BA.debugLineNum = 529;BA.debugLine="Do While Tracker.CurrentLength < Tracker.TotalLen";
if (true) break;

case 20:
//do while
this.state = 33;
while (_tracker.CurrentLength /*long*/ <_tracker.TotalLength /*long*/ ) {
this.state = 22;
if (true) break;
}
if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 530;BA.debugLine="Dim j As HttpJob";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 531;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 532;BA.debugLine="j.Download(URL)";
_j._vvvvvvvvvvvvvvvvvvvvv2 /*String*/ (_url);
 //BA.debugLineNum = 533;BA.debugLine="Dim range As String = $\"bytes=${Tracker.CurrentL";
_range = ("bytes="+parent.__c.SmartStringFormatter("",(Object)(_tracker.CurrentLength /*long*/ ))+"-"+parent.__c.SmartStringFormatter("",(Object)(((int) ((parent.__c.Min(_tracker.TotalLength /*long*/ ,_tracker.CurrentLength /*long*/ +300*1024)-1)))))+"");
 //BA.debugLineNum = 535;BA.debugLine="j.GetRequest.SetHeader(\"apikey\",m_Supabase.ApiKe";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("apikey",parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ());
 //BA.debugLineNum = 536;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*elicorp.pilot.supabase_authentication._supabasetokeninformations*/ ().AccessToken /*String*/ );
 //BA.debugLineNum = 537;BA.debugLine="j.GetRequest.SetHeader(\"Range\", range)";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Range",_range);
 //BA.debugLineNum = 538;BA.debugLine="Wait For (j) JobDone (j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 35;
return;
case 35:
//C
this.state = 23;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 539;BA.debugLine="DatabaseError.Success = j.Success";
_databaseerror.Success /*boolean*/  = _j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ;
 //BA.debugLineNum = 540;BA.debugLine="Dim good As Boolean = j.Success";
_good = _j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ;
 //BA.debugLineNum = 541;BA.debugLine="If j.Success Then";
if (true) break;

case 23:
//if
this.state = 28;
if (_j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ) { 
this.state = 25;
}else {
this.state = 27;
}if (true) break;

case 25:
//C
this.state = 28;
 //BA.debugLineNum = 542;BA.debugLine="Wait For (File.Copy2Async(j.GetInputStream, out";
parent.__c.WaitFor("complete", ba, this, parent.__c.File.Copy2Async(ba,(java.io.InputStream)(_j._vvvvvvvvvvvvvvvvvvvvv0 /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ ().getObject()),(java.io.OutputStream)(_out.getObject())));
this.state = 36;
return;
case 36:
//C
this.state = 28;
_success = (Boolean) result[0];
;
 //BA.debugLineNum = 545;BA.debugLine="out.Flush";
_out.Flush();
 //BA.debugLineNum = 547;BA.debugLine="good = good";
_good = _good;
 //BA.debugLineNum = 549;BA.debugLine="Tracker.CurrentLength = File.Size(Dir, FileNam";
_tracker.CurrentLength /*long*/  = parent.__c.File.Size(_dir,_filename);
 if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 552;BA.debugLine="DatabaseError.StatusCode = j.Response.StatusCod";
_databaseerror.StatusCode /*int*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv6 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode();
 //BA.debugLineNum = 553;BA.debugLine="DatabaseError.ErrorMessage = j.ErrorMessage";
_databaseerror.ErrorMessage /*String*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ;
 if (true) break;

case 28:
//C
this.state = 29;
;
 //BA.debugLineNum = 556;BA.debugLine="j.Release";
_j._vvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ();
 //BA.debugLineNum = 557;BA.debugLine="If good = False Or Tracker.Cancel = True Then";
if (true) break;

case 29:
//if
this.state = 32;
if (_good==parent.__c.False || _tracker.Cancel /*boolean*/ ==parent.__c.True) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 //BA.debugLineNum = 558;BA.debugLine="Tracker.Completed = True";
_tracker.Completed /*boolean*/  = parent.__c.True;
 //BA.debugLineNum = 559;BA.debugLine="Return StorageFile";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_storagefile));return;};
 if (true) break;

case 32:
//C
this.state = 20;
;
 if (true) break;

case 33:
//C
this.state = -1;
;
 //BA.debugLineNum = 562;BA.debugLine="out.Close";
_out.Close();
 //BA.debugLineNum = 563;BA.debugLine="Tracker.Completed = True";
_tracker.Completed /*boolean*/  = parent.__c.True;
 //BA.debugLineNum = 565;BA.debugLine="StorageFile.FileBody = File.ReadBytes(Dir,FileNam";
_storagefile.FileBody /*byte[]*/  = parent.__c.File.ReadBytes(_dir,_filename);
 //BA.debugLineNum = 566;BA.debugLine="StorageFile.Error = DatabaseError";
_storagefile.Error /*elicorp.pilot.supabase._supabaseerror*/  = _databaseerror;
 //BA.debugLineNum = 567;BA.debugLine="Return StorageFile";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_storagefile));return;};
 //BA.debugLineNum = 568;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _rangedownloader_getcaseinsensitiveheadervalue(elicorp.pilot.httpjob _job,String _key,String _defaultvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _headers = null;
String _k = "";
 //BA.debugLineNum = 570;BA.debugLine="Private Sub RangeDownloader_GetCaseInsensitiveHead";
 //BA.debugLineNum = 571;BA.debugLine="Dim headers As Map = job.Response.GetHeaders";
_headers = new anywheresoftware.b4a.objects.collections.Map();
_headers = _job._vvvvvvvvvvvvvvvvvvvvvvvv6 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .GetHeaders();
 //BA.debugLineNum = 572;BA.debugLine="For Each k As String In headers.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _headers.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 573;BA.debugLine="If K.EqualsIgnoreCase(Key) Then";
if (_k.equalsIgnoreCase(_key)) { 
 //BA.debugLineNum = 574;BA.debugLine="Return headers.Get(k).As(String).Replace(\"[\", \"";
if (true) return (BA.ObjectToString(_headers.Get((Object)(_k)))).replace("[","").replace("]","").trim();
 };
 }
};
 //BA.debugLineNum = 577;BA.debugLine="Return DefaultValue";
if (true) return _defaultvalue;
 //BA.debugLineNum = 578;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.supabase_storagefile  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(Object[] _filenames) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Public Sub Remove(FileNames() As Object) As Supaba";
 //BA.debugLineNum = 107;BA.debugLine="m_DeleteFiles = FileNames";
_m_deletefiles = _filenames;
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_storagefile)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_storagefile  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(String _url) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Public Sub SignedURL(Url As String) As Supabase_St";
 //BA.debugLineNum = 44;BA.debugLine="m_SignedURL = Url";
_m_signedurl = _url;
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_storagefile)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public void  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(elicorp.pilot.supabase_storagefile._supabaserangedownloadtracker _tracker) throws Exception{
ResumableSub_Track rsub = new ResumableSub_Track(this,_tracker);
rsub.resume(ba, null);
}
public static class ResumableSub_Track extends BA.ResumableSub {
public ResumableSub_Track(elicorp.pilot.supabase_storagefile parent,elicorp.pilot.supabase_storagefile._supabaserangedownloadtracker _tracker) {
this.parent = parent;
this._tracker = _tracker;
}
elicorp.pilot.supabase_storagefile parent;
elicorp.pilot.supabase_storagefile._supabaserangedownloadtracker _tracker;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 207;BA.debugLine="Do While Tracker.Completed = False";
if (true) break;

case 1:
//do while
this.state = 8;
while (_tracker.Completed /*boolean*/ ==parent.__c.False) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 208;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,this,(int) (100));
this.state = 9;
return;
case 9:
//C
this.state = 4;
;
 //BA.debugLineNum = 212;BA.debugLine="If Supabase_Functions.SubExists2(Tag.As(Map).Get";
if (true) break;

case 4:
//if
this.state = 7;
if (parent._supabase_functions._vvvvvvvvv1 /*boolean*/ (parent.getActivityBA(),((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent._vvvvvvvvvvvvvvvvvvvvvvvv7))).Get((Object)("EventCallback")),BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent._vvvvvvvvvvvvvvvvvvvvvvvv7))).Get((Object)("EventName")))+"_RangeDownloadTracker",(int) (1))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 213;BA.debugLine="CallSub2(Tag.As(Map).Get(\"EventCallback\"),Tag.A";
parent.__c.CallSubNew2(ba,((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent._vvvvvvvvvvvvvvvvvvvvvvvv7))).Get((Object)("EventCallback")),BA.ObjectToString(((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent._vvvvvvvvvvvvvvvvvvvvvvvv7))).Get((Object)("EventName")))+"_RangeDownloadTracker",(Object)(_tracker));
 if (true) break;

case 7:
//C
this.state = 1;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
ResumableSub_UpdateFile rsub = new ResumableSub_UpdateFile(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_UpdateFile extends BA.ResumableSub {
public ResumableSub_UpdateFile(elicorp.pilot.supabase_storagefile parent) {
this.parent = parent;
}
elicorp.pilot.supabase_storagefile parent;
elicorp.pilot.supabase._supabasestoragefile _storagefile = null;
elicorp.pilot.supabase._supabaseerror _databaseerror = null;
String _accesstoken = "";
String _url = "";
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
 //BA.debugLineNum = 292;BA.debugLine="Dim StorageFile As SupabaseStorageFile";
_storagefile = new elicorp.pilot.supabase._supabasestoragefile();
 //BA.debugLineNum = 293;BA.debugLine="StorageFile.Initialize";
_storagefile.Initialize();
 //BA.debugLineNum = 294;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 295;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 297;BA.debugLine="Wait For (m_Supabase.Auth.GetAccessToken) Complet";
parent.__c.WaitFor("complete", ba, this, parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 11;
return;
case 11:
//C
this.state = 1;
_accesstoken = (String) result[0];
;
 //BA.debugLineNum = 298;BA.debugLine="If AccessToken = \"\" Then";
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
 //BA.debugLineNum = 299;BA.debugLine="DatabaseError.StatusCode = 401";
_databaseerror.StatusCode /*int*/  = (int) (401);
 //BA.debugLineNum = 300;BA.debugLine="DatabaseError.ErrorMessage = \"Unauthorized\"";
_databaseerror.ErrorMessage /*String*/  = "Unauthorized";
 //BA.debugLineNum = 301;BA.debugLine="Return DatabaseError";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_databaseerror));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 304;BA.debugLine="Dim url As String = \"\"";
_url = "";
 //BA.debugLineNum = 305;BA.debugLine="url = url & $\"${m_Supabase.URL}/storage/v1/object";
_url = _url+(""+parent.__c.SmartStringFormatter("",(Object)(parent._m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/storage/v1/object/"+parent.__c.SmartStringFormatter("",(Object)(parent._m_bucketname))+"/"+parent.__c.SmartStringFormatter("",(Object)(parent._m_wildcard))+"");
 //BA.debugLineNum = 307;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 307;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 308;BA.debugLine="j.PutBytes(url,m_FileBody)";
_j._vvvvvvvvvvvvvvvvvvvvvvv4 /*String*/ (_url,parent._m_filebody);
 //BA.debugLineNum = 309;BA.debugLine="j.GetRequest.SetHeader(\"apikey\",m_Supabase.ApiKey";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("apikey",parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ());
 //BA.debugLineNum = 310;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_accesstoken);
 //BA.debugLineNum = 311;BA.debugLine="j.GetRequest.SetHeader(\"upsert\",m_isUpsert)";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("upsert",BA.ObjectToString(parent._m_isupsert));
 //BA.debugLineNum = 312;BA.debugLine="j.GetRequest.SetHeader(\"cache_control\",m_CacheCon";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("cache_control",BA.NumberToString(parent._m_cachecontrol));
 //BA.debugLineNum = 313;BA.debugLine="j.GetRequest.SetContentType(Supabase_Functions.Ge";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType(parent._supabase_functions._vvvvvvvv7 /*String*/ (parent.getActivityBA(),parent._supabase_functions._vvvvvvvv5 /*String*/ (parent.getActivityBA(),parent._m_wildcard)));
 //BA.debugLineNum = 315;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 12;
return;
case 12:
//C
this.state = 5;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 317;BA.debugLine="DatabaseError.Success = j.Success";
_databaseerror.Success /*boolean*/  = _j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ;
 //BA.debugLineNum = 319;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 324;BA.debugLine="DatabaseError.StatusCode = j.Response.StatusCode";
_databaseerror.StatusCode /*int*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv6 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode();
 //BA.debugLineNum = 325;BA.debugLine="DatabaseError.ErrorMessage = j.ErrorMessage";
_databaseerror.ErrorMessage /*String*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ;
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 328;BA.debugLine="StorageFile.Error = DatabaseError";
_storagefile.Error /*elicorp.pilot.supabase._supabaseerror*/  = _databaseerror;
 //BA.debugLineNum = 329;BA.debugLine="Return StorageFile";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_storagefile));return;};
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws Exception{
ResumableSub_UploadFile rsub = new ResumableSub_UploadFile(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_UploadFile extends BA.ResumableSub {
public ResumableSub_UploadFile(elicorp.pilot.supabase_storagefile parent) {
this.parent = parent;
}
elicorp.pilot.supabase_storagefile parent;
elicorp.pilot.supabase._supabasestoragefile _storagefile = null;
elicorp.pilot.supabase._supabaseerror _databaseerror = null;
String _accesstoken = "";
String _url = "";
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
 //BA.debugLineNum = 335;BA.debugLine="Dim StorageFile As SupabaseStorageFile";
_storagefile = new elicorp.pilot.supabase._supabasestoragefile();
 //BA.debugLineNum = 336;BA.debugLine="StorageFile.Initialize";
_storagefile.Initialize();
 //BA.debugLineNum = 337;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 338;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 340;BA.debugLine="Wait For (m_Supabase.Auth.GetAccessToken) Complet";
parent.__c.WaitFor("complete", ba, this, parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 11;
return;
case 11:
//C
this.state = 1;
_accesstoken = (String) result[0];
;
 //BA.debugLineNum = 341;BA.debugLine="If AccessToken = \"\" Then";
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
 //BA.debugLineNum = 342;BA.debugLine="DatabaseError.StatusCode = 401";
_databaseerror.StatusCode /*int*/  = (int) (401);
 //BA.debugLineNum = 343;BA.debugLine="DatabaseError.ErrorMessage = \"Unauthorized\"";
_databaseerror.ErrorMessage /*String*/  = "Unauthorized";
 //BA.debugLineNum = 344;BA.debugLine="Return DatabaseError";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_databaseerror));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 347;BA.debugLine="Dim url As String = \"\"";
_url = "";
 //BA.debugLineNum = 348;BA.debugLine="url = url & $\"${m_Supabase.URL}/storage/v1/object";
_url = _url+(""+parent.__c.SmartStringFormatter("",(Object)(parent._m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/storage/v1/object/"+parent.__c.SmartStringFormatter("",(Object)(parent._m_bucketname))+"/"+parent.__c.SmartStringFormatter("",(Object)(parent._m_wildcard))+"");
 //BA.debugLineNum = 350;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 350;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 351;BA.debugLine="j.PostBytes(url,m_FileBody)";
_j._vvvvvvvvvvvvvvvvvvvvvv0 /*String*/ (_url,parent._m_filebody);
 //BA.debugLineNum = 352;BA.debugLine="j.GetRequest.SetHeader(\"apikey\",m_Supabase.ApiKey";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("apikey",parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ());
 //BA.debugLineNum = 353;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_accesstoken);
 //BA.debugLineNum = 354;BA.debugLine="j.GetRequest.SetHeader(\"upsert\",m_isUpsert)";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("upsert",BA.ObjectToString(parent._m_isupsert));
 //BA.debugLineNum = 355;BA.debugLine="j.GetRequest.SetHeader(\"cache_control\",m_CacheCon";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("cache_control",BA.NumberToString(parent._m_cachecontrol));
 //BA.debugLineNum = 356;BA.debugLine="j.GetRequest.SetContentType(Supabase_Functions.Ge";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType(parent._supabase_functions._vvvvvvvv7 /*String*/ (parent.getActivityBA(),parent._supabase_functions._vvvvvvvv5 /*String*/ (parent.getActivityBA(),parent._m_wildcard)));
 //BA.debugLineNum = 358;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 12;
return;
case 12:
//C
this.state = 5;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 360;BA.debugLine="DatabaseError.Success = j.Success";
_databaseerror.Success /*boolean*/  = _j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ;
 //BA.debugLineNum = 362;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 367;BA.debugLine="DatabaseError.StatusCode = j.Response.StatusCode";
_databaseerror.StatusCode /*int*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv6 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode();
 //BA.debugLineNum = 368;BA.debugLine="DatabaseError.ErrorMessage = j.ErrorMessage";
_databaseerror.ErrorMessage /*String*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ;
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 371;BA.debugLine="StorageFile.Error = DatabaseError";
_storagefile.Error /*elicorp.pilot.supabase._supabaseerror*/  = _databaseerror;
 //BA.debugLineNum = 372;BA.debugLine="Return StorageFile";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_storagefile));return;};
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
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
