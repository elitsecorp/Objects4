package elicorp.pilot;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xcheckinternetlm extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "elicorp.pilot.b4xcheckinternetlm");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", elicorp.pilot.b4xcheckinternetlm.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvv6 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvv0 = null;
public elicorp.pilot.b4xdialog _vvvvvvvvvvvvvvvvvvvv1 = null;
public String _vvvvvvvvvvvvvvvvvvvv2 = "";
public String _vvvvvvvvvvvvvvvvvvvv3 = "";
public String _vvvvvvvvvvvvvvvvvvvv4 = "";
public String _vvvvvvvvvvvvvvvvvvvv5 = "";
public String _vvvvvvvvvvvvvvvvvvvv6 = "";
public b4a.example.dateutils _vvvvvvvvvvv0 = null;
public elicorp.pilot.main _vvvvvvvvvvvv1 = null;
public elicorp.pilot.starter _vvvvvvvvvvvv2 = null;
public elicorp.pilot.httputils2service _vvvvvvvvvvvv3 = null;
public elicorp.pilot.b4xpages _vvvvvvvvvvvv4 = null;
public elicorp.pilot.b4xcollections _vvvvvvvvvvvv5 = null;
public elicorp.pilot.dbutils _vvvvvvvvvvvv6 = null;
public elicorp.pilot.xuiviewsutils _vvvvvvvvvvvv7 = null;
public elicorp.pilot.supabase_functions _supabase_functions = null;
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvv4(boolean _dialogtoo) throws Exception{
ResumableSub_Check rsub = new ResumableSub_Check(this,_dialogtoo);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Check extends BA.ResumableSub {
public ResumableSub_Check(elicorp.pilot.b4xcheckinternetlm parent,boolean _dialogtoo) {
this.parent = parent;
this._dialogtoo = _dialogtoo;
}
elicorp.pilot.b4xcheckinternetlm parent;
boolean _dialogtoo;
boolean _checkresult = false;
boolean _success = false;
int _result = 0;

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
 //BA.debugLineNum = 33;BA.debugLine="Dim CheckResult As Boolean";
_checkresult = false;
 //BA.debugLineNum = 35;BA.debugLine="Wait For (DownloadPage) Complete (Success As Bool";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvvvvvvvvv5());
this.state = 17;
return;
case 17:
//C
this.state = 1;
_success = (Boolean) result[0];
;
 //BA.debugLineNum = 36;BA.debugLine="CheckResult = Success";
_checkresult = _success;
 //BA.debugLineNum = 38;BA.debugLine="If DialogToo Then";
if (true) break;

case 1:
//if
this.state = 16;
if (_dialogtoo) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 40;BA.debugLine="Dlg.Initialize(mParentView)";
parent._vvvvvvvvvvvvvvvvvvvv1._initialize /*String*/ (ba,parent._vvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 41;BA.debugLine="Dlg.Title = DlgTitle";
parent._vvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*Object*/  = (Object)(parent._vvvvvvvvvvvvvvvvvvvv2);
 //BA.debugLineNum = 43;BA.debugLine="Do Until CheckResult";
if (true) break;

case 4:
//do until
this.state = 15;
while (!(_checkresult)) {
this.state = 6;
if (true) break;
}
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 45;BA.debugLine="Wait For (DownloadPage) Complete (Success As Bo";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvvvvvvvvv5());
this.state = 18;
return;
case 18:
//C
this.state = 7;
_success = (Boolean) result[0];
;
 //BA.debugLineNum = 46;BA.debugLine="CheckResult = Success";
_checkresult = _success;
 //BA.debugLineNum = 47;BA.debugLine="If Not(CheckResult) Then";
if (true) break;

case 7:
//if
this.state = 14;
if (parent.__c.Not(_checkresult)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 48;BA.debugLine="Wait For (Dlg.Show(DlgMsg, DlgYesText, \"\", Dlg";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvvvvvvvvvv1._show /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._vvvvvvvvvvvvvvvvvvvv3),(Object)(parent._vvvvvvvvvvvvvvvvvvvv4),(Object)(""),(Object)(parent._vvvvvvvvvvvvvvvvvvvv5)));
this.state = 19;
return;
case 19:
//C
this.state = 10;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 49;BA.debugLine="If Result = xui.DialogResponse_Cancel Then";
if (true) break;

case 10:
//if
this.state = 13;
if (_result==parent._vvvvvvvvv6.DialogResponse_Cancel) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 50;BA.debugLine="Exit";
this.state = 15;
if (true) break;
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = 4;
;
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 58;BA.debugLine="Return CheckResult";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_checkresult));return;};
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(boolean _success) throws Exception{
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private xui As XUI";
_vvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 8;BA.debugLine="Private mParentView As B4XView";
_vvvvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Public Dlg As B4XDialog";
_vvvvvvvvvvvvvvvvvvvv1 = new elicorp.pilot.b4xdialog();
 //BA.debugLineNum = 11;BA.debugLine="Public DlgTitle As String";
_vvvvvvvvvvvvvvvvvvvv2 = "";
 //BA.debugLineNum = 12;BA.debugLine="Public DlgMsg As String";
_vvvvvvvvvvvvvvvvvvvv3 = "";
 //BA.debugLineNum = 13;BA.debugLine="Public DlgYesText As String";
_vvvvvvvvvvvvvvvvvvvv4 = "";
 //BA.debugLineNum = 14;BA.debugLine="Public DlgCancelText As String";
_vvvvvvvvvvvvvvvvvvvv5 = "";
 //BA.debugLineNum = 16;BA.debugLine="Public URL As String = \"https://www.google.com/\"";
_vvvvvvvvvvvvvvvvvvvv6 = "https://www.google.com/";
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvv5() throws Exception{
ResumableSub_DownloadPage rsub = new ResumableSub_DownloadPage(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DownloadPage extends BA.ResumableSub {
public ResumableSub_DownloadPage(elicorp.pilot.b4xcheckinternetlm parent) {
this.parent = parent;
}
elicorp.pilot.b4xcheckinternetlm parent;
boolean _result = false;
elicorp.pilot.httpjob _job = null;

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
 //BA.debugLineNum = 62;BA.debugLine="Dim result As Boolean = False";
_result = parent.__c.False;
 //BA.debugLineNum = 63;BA.debugLine="Dim Job As HttpJob";
_job = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 64;BA.debugLine="Job.Initialize(\"Job\", Me)";
_job._initialize /*String*/ (ba,"Job",parent);
 //BA.debugLineNum = 65;BA.debugLine="Job.Download(URL)";
_job._vvvvvvvvvvvvvvvvvvvvv2 /*String*/ (parent._vvvvvvvvvvvvvvvvvvvv6);
 //BA.debugLineNum = 66;BA.debugLine="Wait For(Job) JobDone(Job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_job));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_job = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 67;BA.debugLine="result = Job.Success";
_result = _job._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ;
 //BA.debugLineNum = 68;BA.debugLine="Job.Release";
_job._vvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ();
 //BA.debugLineNum = 69;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(elicorp.pilot.httpjob _job) throws Exception{
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parentview) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize(ParentView As B4XView)";
 //BA.debugLineNum = 20;BA.debugLine="mParentView = ParentView";
_vvvvvvvvvvvvvvvvvvv0 = _parentview;
 //BA.debugLineNum = 22;BA.debugLine="DlgTitle = \"Internet connection\"";
_vvvvvvvvvvvvvvvvvvvv2 = "Internet connection";
 //BA.debugLineNum = 23;BA.debugLine="DlgMsg = \"Please, enable an Internet connection\"";
_vvvvvvvvvvvvvvvvvvvv3 = "Please, enable an Internet connection";
 //BA.debugLineNum = 24;BA.debugLine="DlgYesText = \"Done\"";
_vvvvvvvvvvvvvvvvvvvv4 = "Done";
 //BA.debugLineNum = 25;BA.debugLine="DlgCancelText = \"Cancel\"";
_vvvvvvvvvvvvvvvvvvvv5 = "Cancel";
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv7(anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Public Sub setParentView(Parent As B4XView)";
 //BA.debugLineNum = 29;BA.debugLine="mParentView = Parent";
_vvvvvvvvvvvvvvvvvvv0 = _parent;
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
