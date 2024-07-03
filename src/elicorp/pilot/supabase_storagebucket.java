package elicorp.pilot;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class supabase_storagebucket extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "elicorp.pilot.supabase_storagebucket");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", elicorp.pilot.supabase_storagebucket.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public elicorp.pilot.supabase _m_supabase = null;
public String _m_mode = "";
public String _m_bucketname = "";
public Object[] _m_allowedmimetypes = null;
public int _m_filesizelimit = 0;
public boolean _m_ispublic = false;
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
 //BA.debugLineNum = 4;BA.debugLine="Private m_Mode As String";
_m_mode = "";
 //BA.debugLineNum = 6;BA.debugLine="Private m_BucketName As String";
_m_bucketname = "";
 //BA.debugLineNum = 7;BA.debugLine="Private m_AllowedMimeTypes() As Object";
_m_allowedmimetypes = new Object[(int) (0)];
{
int d0 = _m_allowedmimetypes.length;
for (int i0 = 0;i0 < d0;i0++) {
_m_allowedmimetypes[i0] = new Object();
}
}
;
 //BA.debugLineNum = 8;BA.debugLine="Private m_FileSizeLimit As Int";
_m_filesizelimit = 0;
 //BA.debugLineNum = 9;BA.debugLine="Private m_isPublic As Boolean";
_m_ispublic = false;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6() throws Exception{
ResumableSub_CreateBucket rsub = new ResumableSub_CreateBucket(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CreateBucket extends BA.ResumableSub {
public ResumableSub_CreateBucket(elicorp.pilot.supabase_storagebucket parent) {
this.parent = parent;
}
elicorp.pilot.supabase_storagebucket parent;
elicorp.pilot.supabase._supabasestoragebucket _bucket = null;
elicorp.pilot.supabase._supabaseerror _databaseerror = null;
String _accesstoken = "";
String _url = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsn = null;
anywheresoftware.b4a.objects.collections.Map _m_request = null;
elicorp.pilot.httpjob _j = null;
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
 //BA.debugLineNum = 137;BA.debugLine="Dim Bucket As SupabaseStorageBucket";
_bucket = new elicorp.pilot.supabase._supabasestoragebucket();
 //BA.debugLineNum = 138;BA.debugLine="Bucket.Initialize";
_bucket.Initialize();
 //BA.debugLineNum = 139;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 140;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 142;BA.debugLine="Wait For (m_Supabase.Auth.GetAccessToken) Complet";
parent.__c.WaitFor("complete", ba, this, parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 11;
return;
case 11:
//C
this.state = 1;
_accesstoken = (String) result[0];
;
 //BA.debugLineNum = 143;BA.debugLine="If AccessToken = \"\" Then";
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
 //BA.debugLineNum = 144;BA.debugLine="DatabaseError.StatusCode = 401";
_databaseerror.StatusCode /*int*/  = (int) (401);
 //BA.debugLineNum = 145;BA.debugLine="DatabaseError.ErrorMessage = \"Unauthorized\"";
_databaseerror.ErrorMessage /*String*/  = "Unauthorized";
 //BA.debugLineNum = 146;BA.debugLine="Return DatabaseError";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_databaseerror));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 149;BA.debugLine="Dim url As String = \"\"";
_url = "";
 //BA.debugLineNum = 150;BA.debugLine="url = url & $\"${m_Supabase.URL}/storage/v1/bucket";
_url = _url+(""+parent.__c.SmartStringFormatter("",(Object)(parent._m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/storage/v1/bucket");
 //BA.debugLineNum = 152;BA.debugLine="Dim jsn As JSONGenerator";
_jsn = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 154;BA.debugLine="Dim m_Request As Map";
_m_request = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 155;BA.debugLine="m_Request.Initialize";
_m_request.Initialize();
 //BA.debugLineNum = 156;BA.debugLine="m_Request.Put(\"name\",m_BucketName)";
_m_request.Put((Object)("name"),(Object)(parent._m_bucketname));
 //BA.debugLineNum = 157;BA.debugLine="m_Request.Put(\"public\",m_isPublic)";
_m_request.Put((Object)("public"),(Object)(parent._m_ispublic));
 //BA.debugLineNum = 158;BA.debugLine="m_Request.Put(\"file_size_limit\",m_FileSizeLimit)";
_m_request.Put((Object)("file_size_limit"),(Object)(parent._m_filesizelimit));
 //BA.debugLineNum = 159;BA.debugLine="m_Request.Put(\"allowed_mime_types\",m_AllowedMimeT";
_m_request.Put((Object)("allowed_mime_types"),(Object)(parent._m_allowedmimetypes));
 //BA.debugLineNum = 161;BA.debugLine="jsn.Initialize(m_Request)";
_jsn.Initialize(_m_request);
 //BA.debugLineNum = 164;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 164;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 165;BA.debugLine="j.PostString(url,jsn.ToString.Replace(\"\\\",\"\"))";
_j._vvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ (_url,_jsn.ToString().replace("\\",""));
 //BA.debugLineNum = 166;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 167;BA.debugLine="j.GetRequest.SetHeader(\"apikey\",m_Supabase.ApiKey";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("apikey",parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ());
 //BA.debugLineNum = 168;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_accesstoken);
 //BA.debugLineNum = 170;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 12;
return;
case 12:
//C
this.state = 5;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 172;BA.debugLine="DatabaseError.Success = j.Success";
_databaseerror.Success /*boolean*/  = _j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ;
 //BA.debugLineNum = 174;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 177;BA.debugLine="DatabaseError.StatusCode = j.Response.StatusCode";
_databaseerror.StatusCode /*int*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv6 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode();
 //BA.debugLineNum = 178;BA.debugLine="DatabaseError.ErrorMessage = j.ErrorMessage";
_databaseerror.ErrorMessage /*String*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ;
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 181;BA.debugLine="Bucket.Name = m_BucketName";
_bucket.Name /*String*/  = parent._m_bucketname;
 //BA.debugLineNum = 182;BA.debugLine="Bucket.Id = m_BucketName";
_bucket.Id /*String*/  = parent._m_bucketname;
 //BA.debugLineNum = 183;BA.debugLine="Bucket.isPublic = m_isPublic";
_bucket.isPublic /*boolean*/  = parent._m_ispublic;
 //BA.debugLineNum = 184;BA.debugLine="Bucket.FileSizeLimit = m_FileSizeLimit";
_bucket.FileSizeLimit /*int*/  = parent._m_filesizelimit;
 //BA.debugLineNum = 185;BA.debugLine="Bucket.CreatedAt = DateTime.Now";
_bucket.CreatedAt /*long*/  = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 186;BA.debugLine="Bucket.UpdatedAt = DateTime.Now";
_bucket.UpdatedAt /*long*/  = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 188;BA.debugLine="Wait For (m_Supabase.Auth.GetUser) Complete (User";
parent.__c.WaitFor("complete", ba, this, parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 13;
return;
case 13:
//C
this.state = -1;
_user = (elicorp.pilot.supabase._supabaseuser) result[0];
;
 //BA.debugLineNum = 189;BA.debugLine="Bucket.Owner = User.id";
_bucket.Owner /*String*/  = _user.Id /*String*/ ;
 //BA.debugLineNum = 191;BA.debugLine="Bucket.Error = DatabaseError";
_bucket.Error /*elicorp.pilot.supabase._supabaseerror*/  = _databaseerror;
 //BA.debugLineNum = 192;BA.debugLine="Return Bucket";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_bucket));return;};
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(String _accesstoken) throws Exception{
}
public void  _jobdone(elicorp.pilot.httpjob _j) throws Exception{
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
ResumableSub_DeleteBucket rsub = new ResumableSub_DeleteBucket(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DeleteBucket extends BA.ResumableSub {
public ResumableSub_DeleteBucket(elicorp.pilot.supabase_storagebucket parent) {
this.parent = parent;
}
elicorp.pilot.supabase_storagebucket parent;
elicorp.pilot.supabase._supabasestoragebucket _bucket = null;
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
 //BA.debugLineNum = 254;BA.debugLine="Dim Bucket As SupabaseStorageBucket";
_bucket = new elicorp.pilot.supabase._supabasestoragebucket();
 //BA.debugLineNum = 255;BA.debugLine="Bucket.Initialize";
_bucket.Initialize();
 //BA.debugLineNum = 256;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 257;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 259;BA.debugLine="Wait For (m_Supabase.Auth.GetAccessToken) Complet";
parent.__c.WaitFor("complete", ba, this, parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 11;
return;
case 11:
//C
this.state = 1;
_accesstoken = (String) result[0];
;
 //BA.debugLineNum = 260;BA.debugLine="If AccessToken = \"\" Then";
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
 //BA.debugLineNum = 261;BA.debugLine="DatabaseError.StatusCode = 401";
_databaseerror.StatusCode /*int*/  = (int) (401);
 //BA.debugLineNum = 262;BA.debugLine="DatabaseError.ErrorMessage = \"Unauthorized\"";
_databaseerror.ErrorMessage /*String*/  = "Unauthorized";
 //BA.debugLineNum = 263;BA.debugLine="Return DatabaseError";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_databaseerror));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 266;BA.debugLine="Dim url As String = \"\"";
_url = "";
 //BA.debugLineNum = 267;BA.debugLine="url = url & $\"${m_Supabase.URL}/storage/v1/bucket";
_url = _url+(""+parent.__c.SmartStringFormatter("",(Object)(parent._m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/storage/v1/bucket/"+parent.__c.SmartStringFormatter("",(Object)(parent._m_bucketname))+"");
 //BA.debugLineNum = 269;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 269;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 270;BA.debugLine="j.Delete(url)";
_j._vvvvvvvvvvvvvvvvvvvv0 /*String*/ (_url);
 //BA.debugLineNum = 271;BA.debugLine="j.GetRequest.SetHeader(\"apikey\",m_Supabase.ApiKey";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("apikey",parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ());
 //BA.debugLineNum = 272;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_accesstoken);
 //BA.debugLineNum = 274;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 12;
return;
case 12:
//C
this.state = 5;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 276;BA.debugLine="DatabaseError.Success = j.Success";
_databaseerror.Success /*boolean*/  = _j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ;
 //BA.debugLineNum = 278;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 281;BA.debugLine="DatabaseError.StatusCode = j.Response.StatusCode";
_databaseerror.StatusCode /*int*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv6 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode();
 //BA.debugLineNum = 282;BA.debugLine="DatabaseError.ErrorMessage = j.ErrorMessage";
_databaseerror.ErrorMessage /*String*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ;
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 285;BA.debugLine="Bucket.Name = m_BucketName";
_bucket.Name /*String*/  = parent._m_bucketname;
 //BA.debugLineNum = 287;BA.debugLine="Bucket.Error = DatabaseError";
_bucket.Error /*elicorp.pilot.supabase._supabaseerror*/  = _databaseerror;
 //BA.debugLineNum = 288;BA.debugLine="Return Bucket";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_bucket));return;};
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3() throws Exception{
ResumableSub_EmptyBucket rsub = new ResumableSub_EmptyBucket(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EmptyBucket extends BA.ResumableSub {
public ResumableSub_EmptyBucket(elicorp.pilot.supabase_storagebucket parent) {
this.parent = parent;
}
elicorp.pilot.supabase_storagebucket parent;
elicorp.pilot.supabase._supabasestoragebucket _bucket = null;
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
 //BA.debugLineNum = 294;BA.debugLine="Dim Bucket As SupabaseStorageBucket";
_bucket = new elicorp.pilot.supabase._supabasestoragebucket();
 //BA.debugLineNum = 295;BA.debugLine="Bucket.Initialize";
_bucket.Initialize();
 //BA.debugLineNum = 296;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 297;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 299;BA.debugLine="Wait For (m_Supabase.Auth.GetAccessToken) Complet";
parent.__c.WaitFor("complete", ba, this, parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 11;
return;
case 11:
//C
this.state = 1;
_accesstoken = (String) result[0];
;
 //BA.debugLineNum = 300;BA.debugLine="If AccessToken = \"\" Then";
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
 //BA.debugLineNum = 301;BA.debugLine="DatabaseError.StatusCode = 401";
_databaseerror.StatusCode /*int*/  = (int) (401);
 //BA.debugLineNum = 302;BA.debugLine="DatabaseError.ErrorMessage = \"Unauthorized\"";
_databaseerror.ErrorMessage /*String*/  = "Unauthorized";
 //BA.debugLineNum = 303;BA.debugLine="Return DatabaseError";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_databaseerror));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 306;BA.debugLine="Dim url As String = \"\"";
_url = "";
 //BA.debugLineNum = 307;BA.debugLine="url = url & $\"${m_Supabase.URL}/storage/v1/bucket";
_url = _url+(""+parent.__c.SmartStringFormatter("",(Object)(parent._m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/storage/v1/bucket/"+parent.__c.SmartStringFormatter("",(Object)(parent._m_bucketname))+"/empty");
 //BA.debugLineNum = 309;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 309;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 310;BA.debugLine="j.PostString(url,\"\")";
_j._vvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ (_url,"");
 //BA.debugLineNum = 311;BA.debugLine="j.GetRequest.SetHeader(\"apikey\",m_Supabase.ApiKey";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("apikey",parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ());
 //BA.debugLineNum = 312;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_accesstoken);
 //BA.debugLineNum = 314;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 12;
return;
case 12:
//C
this.state = 5;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 316;BA.debugLine="DatabaseError.Success = j.Success";
_databaseerror.Success /*boolean*/  = _j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ;
 //BA.debugLineNum = 318;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 321;BA.debugLine="DatabaseError.StatusCode = j.Response.StatusCode";
_databaseerror.StatusCode /*int*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv6 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode();
 //BA.debugLineNum = 322;BA.debugLine="DatabaseError.ErrorMessage = j.ErrorMessage";
_databaseerror.ErrorMessage /*String*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ;
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 325;BA.debugLine="Bucket.Name = m_BucketName";
_bucket.Name /*String*/  = parent._m_bucketname;
 //BA.debugLineNum = 327;BA.debugLine="Bucket.Error = DatabaseError";
_bucket.Error /*elicorp.pilot.supabase._supabaseerror*/  = _databaseerror;
 //BA.debugLineNum = 328;BA.debugLine="Return Bucket";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_bucket));return;};
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws Exception{
ResumableSub_Execute rsub = new ResumableSub_Execute(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Execute extends BA.ResumableSub {
public ResumableSub_Execute(elicorp.pilot.supabase_storagebucket parent) {
this.parent = parent;
}
elicorp.pilot.supabase_storagebucket parent;
elicorp.pilot.supabase._supabasestoragebucket _result = null;
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
 //BA.debugLineNum = 43;BA.debugLine="If m_Mode = \"Create\" Then";
if (true) break;

case 1:
//if
this.state = 14;
if ((parent._m_mode).equals("Create")) { 
this.state = 3;
}else if((parent._m_mode).equals("Select")) { 
this.state = 5;
}else if((parent._m_mode).equals("Update")) { 
this.state = 7;
}else if((parent._m_mode).equals("Delete")) { 
this.state = 9;
}else if((parent._m_mode).equals("Empty")) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 14;
 //BA.debugLineNum = 45;BA.debugLine="Wait For (CreateBucket) Complete (Result As Supa";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6());
this.state = 15;
return;
case 15:
//C
this.state = 14;
_result = (elicorp.pilot.supabase._supabasestoragebucket) result[0];
;
 //BA.debugLineNum = 46;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;

case 5:
//C
this.state = 14;
 //BA.debugLineNum = 50;BA.debugLine="Wait For (GetBucket) Complete (Result As Supabas";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4());
this.state = 16;
return;
case 16:
//C
this.state = 14;
_result = (elicorp.pilot.supabase._supabasestoragebucket) result[0];
;
 //BA.debugLineNum = 51;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;

case 7:
//C
this.state = 14;
 //BA.debugLineNum = 55;BA.debugLine="Wait For (UpdateBucket) Complete (Result As Supa";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7());
this.state = 17;
return;
case 17:
//C
this.state = 14;
_result = (elicorp.pilot.supabase._supabasestoragebucket) result[0];
;
 //BA.debugLineNum = 56;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;

case 9:
//C
this.state = 14;
 //BA.debugLineNum = 60;BA.debugLine="Wait For (DeleteBucket) Complete (Result As Supa";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0());
this.state = 18;
return;
case 18:
//C
this.state = 14;
_result = (elicorp.pilot.supabase._supabasestoragebucket) result[0];
;
 //BA.debugLineNum = 61;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;

case 11:
//C
this.state = 14;
 //BA.debugLineNum = 65;BA.debugLine="Wait For (EmptyBucket) Complete (Result As Supab";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3());
this.state = 19;
return;
case 19:
//C
this.state = 14;
_result = (elicorp.pilot.supabase._supabasestoragebucket) result[0];
;
 //BA.debugLineNum = 66;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 70;BA.debugLine="Dim Bucket As SupabaseStorageBucket";
_bucket = new elicorp.pilot.supabase._supabasestoragebucket();
 //BA.debugLineNum = 71;BA.debugLine="Bucket.Initialize";
_bucket.Initialize();
 //BA.debugLineNum = 72;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 73;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 74;BA.debugLine="DatabaseError.Success = False";
_databaseerror.Success /*boolean*/  = parent.__c.False;
 //BA.debugLineNum = 75;BA.debugLine="DatabaseError.ErrorMessage = \"unknown mode\"";
_databaseerror.ErrorMessage /*String*/  = "unknown mode";
 //BA.debugLineNum = 76;BA.debugLine="Bucket.Error = DatabaseError";
_bucket.Error /*elicorp.pilot.supabase._supabaseerror*/  = _databaseerror;
 //BA.debugLineNum = 77;BA.debugLine="Return Bucket";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_bucket));return;};
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws Exception{
ResumableSub_GetBucket rsub = new ResumableSub_GetBucket(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetBucket extends BA.ResumableSub {
public ResumableSub_GetBucket(elicorp.pilot.supabase_storagebucket parent) {
this.parent = parent;
}
elicorp.pilot.supabase_storagebucket parent;
elicorp.pilot.supabase._supabasestoragebucket _bucket = null;
elicorp.pilot.supabase._supabaseerror _databaseerror = null;
String _accesstoken = "";
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
 //BA.debugLineNum = 84;BA.debugLine="Dim Bucket As SupabaseStorageBucket";
_bucket = new elicorp.pilot.supabase._supabasestoragebucket();
 //BA.debugLineNum = 85;BA.debugLine="Bucket.Initialize";
_bucket.Initialize();
 //BA.debugLineNum = 86;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 87;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 89;BA.debugLine="Wait For (m_Supabase.Auth.GetAccessToken) Complet";
parent.__c.WaitFor("complete", ba, this, parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 11;
return;
case 11:
//C
this.state = 1;
_accesstoken = (String) result[0];
;
 //BA.debugLineNum = 90;BA.debugLine="If AccessToken = \"\" Then";
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
 //BA.debugLineNum = 91;BA.debugLine="DatabaseError.StatusCode = 401";
_databaseerror.StatusCode /*int*/  = (int) (401);
 //BA.debugLineNum = 92;BA.debugLine="DatabaseError.ErrorMessage = \"Unauthorized\"";
_databaseerror.ErrorMessage /*String*/  = "Unauthorized";
 //BA.debugLineNum = 93;BA.debugLine="Return DatabaseError";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_databaseerror));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 96;BA.debugLine="Dim url As String = \"\"";
_url = "";
 //BA.debugLineNum = 97;BA.debugLine="url = url & $\"${m_Supabase.URL}/storage/v1/bucket";
_url = _url+(""+parent.__c.SmartStringFormatter("",(Object)(parent._m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/storage/v1/bucket/"+parent.__c.SmartStringFormatter("",(Object)(parent._m_bucketname))+"");
 //BA.debugLineNum = 100;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 100;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 101;BA.debugLine="j.Download(url)";
_j._vvvvvvvvvvvvvvvvvvvvv2 /*String*/ (_url);
 //BA.debugLineNum = 102;BA.debugLine="j.GetRequest.SetHeader(\"apikey\",m_Supabase.ApiKey";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("apikey",parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ());
 //BA.debugLineNum = 103;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_accesstoken);
 //BA.debugLineNum = 105;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 12;
return;
case 12:
//C
this.state = 5;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 107;BA.debugLine="DatabaseError.Success = j.Success";
_databaseerror.Success /*boolean*/  = _j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ;
 //BA.debugLineNum = 109;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 111;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 112;BA.debugLine="parser.Initialize(j.GetString)";
_parser.Initialize(_j._vvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ());
 //BA.debugLineNum = 113;BA.debugLine="Dim jRoot As Map = parser.NextObject";
_jroot = new anywheresoftware.b4a.objects.collections.Map();
_jroot = _parser.NextObject();
 //BA.debugLineNum = 115;BA.debugLine="Bucket.Owner = jRoot.Get(\"owner\")";
_bucket.Owner /*String*/  = BA.ObjectToString(_jroot.Get((Object)("owner")));
 //BA.debugLineNum = 116;BA.debugLine="Bucket.FileSizeLimit = jRoot.Get(\"file_size_limi";
_bucket.FileSizeLimit /*int*/  = (int)(BA.ObjectToNumber(_jroot.Get((Object)("file_size_limit"))));
 //BA.debugLineNum = 117;BA.debugLine="Bucket.isPublic = jRoot.Get(\"public\")";
_bucket.isPublic /*boolean*/  = BA.ObjectToBoolean(_jroot.Get((Object)("public")));
 //BA.debugLineNum = 118;BA.debugLine="Bucket.UpdatedAt= Supabase_Functions.ParseDateTi";
_bucket.UpdatedAt /*long*/  = parent._supabase_functions._vvvvvvvv0 /*long*/ (parent.getActivityBA(),BA.ObjectToString(_jroot.Get((Object)("updated_at"))));
 //BA.debugLineNum = 119;BA.debugLine="Bucket.Name = jRoot.Get(\"name\")";
_bucket.Name /*String*/  = BA.ObjectToString(_jroot.Get((Object)("name")));
 //BA.debugLineNum = 120;BA.debugLine="Bucket.CreatedAt = Supabase_Functions.ParseDateT";
_bucket.CreatedAt /*long*/  = parent._supabase_functions._vvvvvvvv0 /*long*/ (parent.getActivityBA(),BA.ObjectToString(_jroot.Get((Object)("created_at"))));
 //BA.debugLineNum = 121;BA.debugLine="Bucket.Id = jRoot.Get(\"id\")";
_bucket.Id /*String*/  = BA.ObjectToString(_jroot.Get((Object)("id")));
 //BA.debugLineNum = 122;BA.debugLine="Bucket.AllowedMimeTypes = jRoot.Get(\"allowed_mim";
_bucket.AllowedMimeTypes /*anywheresoftware.b4a.objects.collections.List*/  = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_jroot.Get((Object)("allowed_mime_types"))));
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 125;BA.debugLine="DatabaseError.StatusCode = j.Response.StatusCode";
_databaseerror.StatusCode /*int*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv6 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode();
 //BA.debugLineNum = 126;BA.debugLine="DatabaseError.ErrorMessage = j.ErrorMessage";
_databaseerror.ErrorMessage /*String*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ;
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 129;BA.debugLine="Bucket.Error = DatabaseError";
_bucket.Error /*elicorp.pilot.supabase._supabaseerror*/  = _databaseerror;
 //BA.debugLineNum = 131;BA.debugLine="Return Bucket";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_bucket));return;};
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(anywheresoftware.b4a.BA _ba,elicorp.pilot.supabase _thissupabase,String _name,String _mode) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(ThisSupabase As Supabase,Nam";
 //BA.debugLineNum = 16;BA.debugLine="m_Supabase = ThisSupabase";
_m_supabase = _thissupabase;
 //BA.debugLineNum = 17;BA.debugLine="m_BucketName = Name";
_m_bucketname = _name;
 //BA.debugLineNum = 18;BA.debugLine="m_Mode = Mode";
_m_mode = _mode;
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.supabase_storagebucket  _options_allowedmimetypes(Object[] _mimetypes) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Public Sub Options_AllowedMimeTypes(MimeTypes() As";
 //BA.debugLineNum = 37;BA.debugLine="m_AllowedMimeTypes = MimeTypes";
_m_allowedmimetypes = _mimetypes;
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_storagebucket)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_storagebucket  _options_filesizelimit(int _limit) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Public Sub Options_FileSizeLimit(Limit As Int) As";
 //BA.debugLineNum = 31;BA.debugLine="m_FileSizeLimit = Limit";
_m_filesizelimit = _limit;
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_storagebucket)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_storagebucket  _options_ispublic(boolean _ispublic) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Options_isPublic(isPublic As Boolean) A";
 //BA.debugLineNum = 23;BA.debugLine="m_isPublic = isPublic";
_m_ispublic = _ispublic;
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (elicorp.pilot.supabase_storagebucket)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7() throws Exception{
ResumableSub_UpdateBucket rsub = new ResumableSub_UpdateBucket(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_UpdateBucket extends BA.ResumableSub {
public ResumableSub_UpdateBucket(elicorp.pilot.supabase_storagebucket parent) {
this.parent = parent;
}
elicorp.pilot.supabase_storagebucket parent;
elicorp.pilot.supabase._supabasestoragebucket _bucket = null;
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
 //BA.debugLineNum = 198;BA.debugLine="Dim Bucket As SupabaseStorageBucket";
_bucket = new elicorp.pilot.supabase._supabasestoragebucket();
 //BA.debugLineNum = 199;BA.debugLine="Bucket.Initialize";
_bucket.Initialize();
 //BA.debugLineNum = 200;BA.debugLine="Dim DatabaseError As SupabaseError";
_databaseerror = new elicorp.pilot.supabase._supabaseerror();
 //BA.debugLineNum = 201;BA.debugLine="DatabaseError.Initialize";
_databaseerror.Initialize();
 //BA.debugLineNum = 203;BA.debugLine="Wait For (m_Supabase.Auth.GetAccessToken) Complet";
parent.__c.WaitFor("complete", ba, this, parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 11;
return;
case 11:
//C
this.state = 1;
_accesstoken = (String) result[0];
;
 //BA.debugLineNum = 204;BA.debugLine="If AccessToken = \"\" Then";
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
 //BA.debugLineNum = 205;BA.debugLine="DatabaseError.StatusCode = 401";
_databaseerror.StatusCode /*int*/  = (int) (401);
 //BA.debugLineNum = 206;BA.debugLine="DatabaseError.ErrorMessage = \"Unauthorized\"";
_databaseerror.ErrorMessage /*String*/  = "Unauthorized";
 //BA.debugLineNum = 207;BA.debugLine="Return DatabaseError";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_databaseerror));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 210;BA.debugLine="Dim url As String = \"\"";
_url = "";
 //BA.debugLineNum = 211;BA.debugLine="url = url & $\"${m_Supabase.URL}/storage/v1/bucket";
_url = _url+(""+parent.__c.SmartStringFormatter("",(Object)(parent._m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/storage/v1/bucket/"+parent.__c.SmartStringFormatter("",(Object)(parent._m_bucketname))+"");
 //BA.debugLineNum = 213;BA.debugLine="Dim jsn As JSONGenerator";
_jsn = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 215;BA.debugLine="Dim m_Request As Map";
_m_request = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 216;BA.debugLine="m_Request.Initialize";
_m_request.Initialize();
 //BA.debugLineNum = 217;BA.debugLine="m_Request.Put(\"public\",m_isPublic)";
_m_request.Put((Object)("public"),(Object)(parent._m_ispublic));
 //BA.debugLineNum = 218;BA.debugLine="m_Request.Put(\"file_size_limit\",m_FileSizeLimit)";
_m_request.Put((Object)("file_size_limit"),(Object)(parent._m_filesizelimit));
 //BA.debugLineNum = 219;BA.debugLine="m_Request.Put(\"allowed_mime_types\",m_AllowedMimeT";
_m_request.Put((Object)("allowed_mime_types"),(Object)(parent._m_allowedmimetypes));
 //BA.debugLineNum = 221;BA.debugLine="jsn.Initialize(m_Request)";
_jsn.Initialize(_m_request);
 //BA.debugLineNum = 224;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 224;BA.debugLine="Dim j As HttpJob : j.Initialize(\"\",Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 225;BA.debugLine="j.PutString(url,jsn.ToString.Replace(\"\\\",\"\"))";
_j._vvvvvvvvvvvvvvvvvvvvvvv5 /*String*/ (_url,_jsn.ToString().replace("\\",""));
 //BA.debugLineNum = 226;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 227;BA.debugLine="j.GetRequest.SetHeader(\"apikey\",m_Supabase.ApiKey";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("apikey",parent._m_supabase._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ());
 //BA.debugLineNum = 228;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+_accesstoken);
 //BA.debugLineNum = 230;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 12;
return;
case 12:
//C
this.state = 5;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 232;BA.debugLine="DatabaseError.Success = j.Success";
_databaseerror.Success /*boolean*/  = _j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ;
 //BA.debugLineNum = 234;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 237;BA.debugLine="DatabaseError.StatusCode = j.Response.StatusCode";
_databaseerror.StatusCode /*int*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv6 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode();
 //BA.debugLineNum = 238;BA.debugLine="DatabaseError.ErrorMessage = j.ErrorMessage";
_databaseerror.ErrorMessage /*String*/  = _j._vvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ;
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 241;BA.debugLine="Bucket.Name = m_BucketName";
_bucket.Name /*String*/  = parent._m_bucketname;
 //BA.debugLineNum = 242;BA.debugLine="Bucket.Id = m_BucketName";
_bucket.Id /*String*/  = parent._m_bucketname;
 //BA.debugLineNum = 243;BA.debugLine="Bucket.isPublic = m_isPublic";
_bucket.isPublic /*boolean*/  = parent._m_ispublic;
 //BA.debugLineNum = 244;BA.debugLine="Bucket.FileSizeLimit = m_FileSizeLimit";
_bucket.FileSizeLimit /*int*/  = parent._m_filesizelimit;
 //BA.debugLineNum = 245;BA.debugLine="Bucket.UpdatedAt = DateTime.Now";
_bucket.UpdatedAt /*long*/  = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 247;BA.debugLine="Bucket.Error = DatabaseError";
_bucket.Error /*elicorp.pilot.supabase._supabaseerror*/  = _databaseerror;
 //BA.debugLineNum = 248;BA.debugLine="Return Bucket";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_bucket));return;};
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
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
