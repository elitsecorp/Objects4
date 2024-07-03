package elicorp.pilot;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xdrawer extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "elicorp.pilot.b4xdrawer");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", elicorp.pilot.b4xdrawer.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvvvvvvvvvvvvv7 = "";
public Object _vvvvvvvvvvvvvvv0 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvv6 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
public float _vvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0f;
public float _vvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0f;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
public b4a.example.dateutils _vvvvvvvvvvv0 = null;
public elicorp.pilot.main _vvvvvvvvvvvv1 = null;
public elicorp.pilot.starter _vvvvvvvvvvvv2 = null;
public elicorp.pilot.httputils2service _vvvvvvvvvvvv3 = null;
public elicorp.pilot.b4xpages _vvvvvvvvvvvv4 = null;
public elicorp.pilot.b4xcollections _vvvvvvvvvvvv5 = null;
public elicorp.pilot.dbutils _vvvvvvvvvvvv6 = null;
public elicorp.pilot.xuiviewsutils _vvvvvvvvvvvv7 = null;
public elicorp.pilot.supabase_functions _supabase_functions = null;
public boolean  _base_onintercepttouchevent(int _action,float _x,float _y,Object _motionevent) throws Exception{
float _dx = 0f;
float _dy = 0f;
 //BA.debugLineNum = 97;BA.debugLine="Private Sub Base_OnInterceptTouchEvent (Action As";
 //BA.debugLineNum = 98;BA.debugLine="If mEnabled = False Then Return False";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvv3==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 99;BA.debugLine="If IsOpen = False And x > mLeftPanel.Left + mLeft";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvv0==__c.False && _x>_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.getLeft()+_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.getWidth()+_vvvvvvvvvvvvvvvvvvvvvvvvvvv5) { 
if (true) return __c.False;};
 //BA.debugLineNum = 100;BA.debugLine="If IsOpen And x > mLeftPanel.Left + mLeftPanel.Wi";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvv0 && _x>_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.getLeft()+_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.getWidth()) { 
 //BA.debugLineNum = 102;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 104;BA.debugLine="If HandlingSwipe Then Return True";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvv1) { 
if (true) return __c.True;};
 //BA.debugLineNum = 105;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,_vvvvvvvvvvvvvvvvvvvvvvvvvvv3.TOUCH_ACTION_DOWN,_vvvvvvvvvvvvvvvvvvvvvvvvvvv3.TOUCH_ACTION_MOVE)) {
case 0: {
 //BA.debugLineNum = 107;BA.debugLine="TouchXStart = X";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _x;
 //BA.debugLineNum = 108;BA.debugLine="TouchYStart = Y";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _y;
 //BA.debugLineNum = 109;BA.debugLine="HandlingSwipe = False";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = __c.False;
 break; }
case 1: {
 //BA.debugLineNum = 111;BA.debugLine="Dim dx As Float = Abs(x - TouchXStart)";
_dx = (float) (__c.Abs(_x-_vvvvvvvvvvvvvvvvvvvvvvvvvvv6));
 //BA.debugLineNum = 112;BA.debugLine="Dim dy As Float = Abs(y - TouchYStart)";
_dy = (float) (__c.Abs(_y-_vvvvvvvvvvvvvvvvvvvvvvvvvvv7));
 //BA.debugLineNum = 113;BA.debugLine="If dy < 20dip And dx > 10dip Then";
if (_dy<__c.DipToCurrent((int) (20)) && _dx>__c.DipToCurrent((int) (10))) { 
 //BA.debugLineNum = 114;BA.debugLine="HandlingSwipe = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = __c.True;
 };
 break; }
}
;
 //BA.debugLineNum = 117;BA.debugLine="Return HandlingSwipe";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return false;
}
public boolean  _base_ontouchevent(int _action,float _x,float _y,Object _motionevent) throws Exception{
int _leftpanelrightside = 0;
float _dx = 0f;
 //BA.debugLineNum = 66;BA.debugLine="Private Sub Base_OnTouchEvent (Action As Int, X As";
 //BA.debugLineNum = 67;BA.debugLine="If mEnabled = False Then Return False";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvv3==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 68;BA.debugLine="Dim LeftPanelRightSide As Int = mLeftPanel.Left +";
_leftpanelrightside = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.getLeft()+_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.getWidth());
 //BA.debugLineNum = 69;BA.debugLine="If HandlingSwipe = False And x > LeftPanelRightSi";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvv1==__c.False && _x>_leftpanelrightside) { 
 //BA.debugLineNum = 70;BA.debugLine="If IsOpen Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
 //BA.debugLineNum = 71;BA.debugLine="TouchXStart = X";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _x;
 //BA.debugLineNum = 72;BA.debugLine="If Action = mBasePanel.TOUCH_ACTION_UP Then set";
if (_action==_vvvvvvvvvvvvvvvvvvvvvvvvvvv3.TOUCH_ACTION_UP) { 
_setvvvvvvvvvvvvvvvvvvvvvvvvvv6(__c.False);};
 //BA.debugLineNum = 73;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 75;BA.debugLine="If IsOpen = False And x > LeftPanelRightSide + E";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvv0==__c.False && _x>_leftpanelrightside+_vvvvvvvvvvvvvvvvvvvvvvvvvvv5) { 
 //BA.debugLineNum = 76;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
 //BA.debugLineNum = 79;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,_vvvvvvvvvvvvvvvvvvvvvvvvvvv3.TOUCH_ACTION_MOVE,_vvvvvvvvvvvvvvvvvvvvvvvvvvv3.TOUCH_ACTION_UP)) {
case 0: {
 //BA.debugLineNum = 81;BA.debugLine="Dim dx As Float = x - TouchXStart";
_dx = (float) (_x-_vvvvvvvvvvvvvvvvvvvvvvvvvvv6);
 //BA.debugLineNum = 82;BA.debugLine="TouchXStart = X";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _x;
 //BA.debugLineNum = 83;BA.debugLine="If HandlingSwipe Or Abs(dx) > 3dip Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvv1 || __c.Abs(_dx)>__c.DipToCurrent((int) (3))) { 
 //BA.debugLineNum = 84;BA.debugLine="HandlingSwipe = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = __c.True;
 //BA.debugLineNum = 85;BA.debugLine="ChangeOffset(mLeftPanel.Left + dx, True, False";
_vvvvvvvvvvvvvvvvvvvvvvvvv2((float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.getLeft()+_dx),__c.True,__c.False);
 };
 break; }
case 1: {
 //BA.debugLineNum = 88;BA.debugLine="If HandlingSwipe Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvv1) { 
 //BA.debugLineNum = 89;BA.debugLine="ChangeOffset(mLeftPanel.Left, False, False)";
_vvvvvvvvvvvvvvvvvvvvvvvvv2((float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.getLeft()),__c.False,__c.False);
 };
 //BA.debugLineNum = 91;BA.debugLine="HandlingSwipe = False";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = __c.False;
 break; }
}
;
 //BA.debugLineNum = 93;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return false;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvv2(float _x,boolean _currentlytouching,boolean _noanimation) throws Exception{
int _visibleoffset = 0;
int _dx = 0;
int _duration = 0;
 //BA.debugLineNum = 175;BA.debugLine="Private Sub ChangeOffset (x As Float, CurrentlyTou";
 //BA.debugLineNum = 176;BA.debugLine="x = Max(-mSideWidth, Min(0, x))";
_x = (float) (__c.Max(-_vvvvvvvvvvvvvvvvvvvvvvvvvv0,__c.Min(0,_x)));
 //BA.debugLineNum = 177;BA.debugLine="Dim VisibleOffset As Int = mSideWidth + x";
_visibleoffset = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvv0+_x);
 //BA.debugLineNum = 186;BA.debugLine="If CurrentlyTouching = False Then";
if (_currentlytouching==__c.False) { 
 //BA.debugLineNum = 187;BA.debugLine="If (IsOpen And VisibleOffset < 0.8 * mSideWidth)";
if ((_vvvvvvvvvvvvvvvvvvvvvvvvvvv0 && _visibleoffset<0.8*_vvvvvvvvvvvvvvvvvvvvvvvvvv0) || (_vvvvvvvvvvvvvvvvvvvvvvvvvvv0==__c.False && _visibleoffset<0.2*_vvvvvvvvvvvvvvvvvvvvvvvvvv0)) { 
 //BA.debugLineNum = 188;BA.debugLine="x = -mSideWidth";
_x = (float) (-_vvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 189;BA.debugLine="SetIsOpen(False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvv2(__c.False);
 }else {
 //BA.debugLineNum = 191;BA.debugLine="x = 0";
_x = (float) (0);
 //BA.debugLineNum = 192;BA.debugLine="SetIsOpen(True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvv2(__c.True);
 };
 //BA.debugLineNum = 194;BA.debugLine="Dim dx As Int = Abs(mLeftPanel.Left - x)";
_dx = (int) (__c.Abs(_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.getLeft()-_x));
 //BA.debugLineNum = 195;BA.debugLine="Dim duration As Int = Max(0, 200 * dx / mSideWid";
_duration = (int) (__c.Max(0,200*_dx/(double)_vvvvvvvvvvvvvvvvvvvvvvvvvv0));
 //BA.debugLineNum = 196;BA.debugLine="If NoAnimation Then duration = 0";
if (_noanimation) { 
_duration = (int) (0);};
 //BA.debugLineNum = 197;BA.debugLine="mLeftPanel.SetLayoutAnimated(duration, x, 0, mLe";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.SetLayoutAnimated(_duration,(int) (_x),(int) (0),_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.getWidth(),_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.getHeight());
 //BA.debugLineNum = 198;BA.debugLine="mDarkPanel.SetColorAnimated(duration, mDarkPanel";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv2.SetColorAnimated(_duration,_vvvvvvvvvvvvvvvvvvvvvvvvvvv2.getColor(),_vvvvvvvvvvvvvvvvvvvvvvvvv7((int) (_x)));
 }else {
 //BA.debugLineNum = 208;BA.debugLine="mDarkPanel.Color = OffsetToColor(x)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv2.setColor(_vvvvvvvvvvvvvvvvvvvvvvvvv7((int) (_x)));
 //BA.debugLineNum = 209;BA.debugLine="mLeftPanel.Left = x";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.setLeft((int) (_x));
 };
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvv7 = "";
 //BA.debugLineNum = 4;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvv0 = new Object();
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI 'ignore";
_vvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 6;BA.debugLine="Private mSideWidth As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
 //BA.debugLineNum = 7;BA.debugLine="Private mLeftPanel As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private mDarkPanel As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private mBasePanel As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private mCenterPanel As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Public ExtraWidth As Int = 50dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv5 = __c.DipToCurrent((int) (50));
 //BA.debugLineNum = 12;BA.debugLine="Private TouchXStart, TouchYStart As Float 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0f;
_vvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0f;
 //BA.debugLineNum = 13;BA.debugLine="Private IsOpen As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
 //BA.debugLineNum = 14;BA.debugLine="Private HandlingSwipe As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
 //BA.debugLineNum = 15;BA.debugLine="Private StartAtScrim As Boolean 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
 //BA.debugLineNum = 16;BA.debugLine="Private mEnabled As Boolean = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = __c.True;
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Public Sub getCenterPanel As B4XView";
 //BA.debugLineNum = 242;BA.debugLine="Return mCenterPanel";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvv4;
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public boolean  _getvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Public Sub getGestureEnabled As Boolean";
 //BA.debugLineNum = 254;BA.debugLine="Return mEnabled";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return false;
}
public boolean  _getvvvvvvvvvvvvvvvvvvvvvvvvvv6() throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Public Sub getLeftOpen As Boolean";
 //BA.debugLineNum = 227;BA.debugLine="Return IsOpen";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvv0;
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getvvvvvvvvvvvvvvvvvvvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Public Sub getLeftPanel As B4XView";
 //BA.debugLineNum = 238;BA.debugLine="Return mLeftPanel";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvv1;
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname,anywheresoftware.b4a.objects.B4XViewWrapper _parent,int _sidewidth) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4a.objects.TouchPanelCreator _creator = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 20;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvv7 = _eventname;
 //BA.debugLineNum = 21;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvv0 = _callback;
 //BA.debugLineNum = 22;BA.debugLine="mSideWidth = SideWidth";
_vvvvvvvvvvvvvvvvvvvvvvvvvv0 = _sidewidth;
 //BA.debugLineNum = 24;BA.debugLine="Dim creator As TouchPanelCreator";
_creator = new anywheresoftware.b4a.objects.TouchPanelCreator();
 //BA.debugLineNum = 25;BA.debugLine="mBasePanel = creator.CreateTouchPanel(\"base\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv3 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_creator.CreateTouchPanel(ba,"base").getObject()));
 //BA.debugLineNum = 34;BA.debugLine="Parent.AddView(mBasePanel, 0, 0, Parent.Width, Pa";
_parent.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvv3.getObject()),(int) (0),(int) (0),_parent.getWidth(),_parent.getHeight());
 //BA.debugLineNum = 35;BA.debugLine="mCenterPanel = xui.CreatePanel(\"\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _vvvvvvvvv6.CreatePanel(ba,"");
 //BA.debugLineNum = 36;BA.debugLine="mBasePanel.AddView(mCenterPanel, 0, 0, mBasePanel";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv3.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvv4.getObject()),(int) (0),(int) (0),_vvvvvvvvvvvvvvvvvvvvvvvvvvv3.getWidth(),_vvvvvvvvvvvvvvvvvvvvvvvvvvv3.getHeight());
 //BA.debugLineNum = 37;BA.debugLine="mDarkPanel = xui.CreatePanel(\"dark\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv2 = _vvvvvvvvv6.CreatePanel(ba,"dark");
 //BA.debugLineNum = 38;BA.debugLine="mBasePanel.AddView(mDarkPanel, 0, 0, mBasePanel.W";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv3.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject()),(int) (0),(int) (0),_vvvvvvvvvvvvvvvvvvvvvvvvvvv3.getWidth(),_vvvvvvvvvvvvvvvvvvvvvvvvvvv3.getHeight());
 //BA.debugLineNum = 39;BA.debugLine="mLeftPanel = xui.CreatePanel(\"LeftPanel\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvvvvvvvv6.CreatePanel(ba,"LeftPanel");
 //BA.debugLineNum = 40;BA.debugLine="mBasePanel.AddView(mLeftPanel, -SideWidth, 0, Sid";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv3.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.getObject()),(int) (-_sidewidth),(int) (0),_sidewidth,_vvvvvvvvvvvvvvvvvvvvvvvvvvv3.getHeight());
 //BA.debugLineNum = 41;BA.debugLine="mLeftPanel.Color = xui.Color_Red";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.setColor(_vvvvvvvvv6.Color_Red);
 //BA.debugLineNum = 43;BA.debugLine="Dim p As Panel = mLeftPanel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.getObject()));
 //BA.debugLineNum = 44;BA.debugLine="p.Elevation = 4dip";
_p.setElevation((float) (__c.DipToCurrent((int) (4))));
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _leftpanel_click() throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Private Sub LeftPanel_Click";
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public int  _vvvvvvvvvvvvvvvvvvvvvvvvv7(int _x) throws Exception{
float _visible = 0f;
 //BA.debugLineNum = 221;BA.debugLine="Private Sub OffsetToColor (x As Int) As Int";
 //BA.debugLineNum = 222;BA.debugLine="Dim Visible As Float = (mSideWidth + x) / mSideWi";
_visible = (float) ((_vvvvvvvvvvvvvvvvvvvvvvvvvv0+_x)/(double)_vvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 223;BA.debugLine="Return xui.Color_ARGB(100 * Visible, 0, 0, 0)";
if (true) return _vvvvvvvvv6.Color_ARGB((int) (100*_visible),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return 0;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvv0(int _width,int _height) throws Exception{
 //BA.debugLineNum = 245;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
 //BA.debugLineNum = 246;BA.debugLine="If IsOpen Then ChangeOffset(-mSideWidth, False, T";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
_vvvvvvvvvvvvvvvvvvvvvvvvv2((float) (-_vvvvvvvvvvvvvvvvvvvvvvvvvv0),__c.False,__c.True);};
 //BA.debugLineNum = 247;BA.debugLine="mBasePanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv3.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
 //BA.debugLineNum = 248;BA.debugLine="mLeftPanel.SetLayoutAnimated(0, mLeftPanel.Left,";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.SetLayoutAnimated((int) (0),_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.getLeft(),(int) (0),_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.getWidth(),_vvvvvvvvvvvvvvvvvvvvvvvvvvv3.getHeight());
 //BA.debugLineNum = 249;BA.debugLine="mDarkPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv2.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
 //BA.debugLineNum = 250;BA.debugLine="mCenterPanel.SetLayoutAnimated(0, 0, 0, Width, He";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv4.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvv5(boolean _b) throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Public Sub setGestureEnabled (b As Boolean)";
 //BA.debugLineNum = 258;BA.debugLine="mEnabled = b";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _b;
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvv2(boolean _newstate) throws Exception{
 //BA.debugLineNum = 213;BA.debugLine="Private Sub SetIsOpen (NewState As Boolean)";
 //BA.debugLineNum = 214;BA.debugLine="If IsOpen = NewState Then Return";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvv0==_newstate) { 
if (true) return "";};
 //BA.debugLineNum = 215;BA.debugLine="IsOpen = NewState";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _newstate;
 //BA.debugLineNum = 216;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_StateC";
if (_vvvvvvvvv6.SubExists(ba,_vvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvv7+"_StateChanged",(int) (1))) { 
 //BA.debugLineNum = 217;BA.debugLine="CallSubDelayed2(mCallBack,  mEventName & \"_State";
__c.CallSubDelayed2(ba,_vvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvv7+"_StateChanged",(Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvvv0));
 };
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvv6(boolean _b) throws Exception{
float _x = 0f;
 //BA.debugLineNum = 230;BA.debugLine="Public Sub setLeftOpen (b As Boolean)";
 //BA.debugLineNum = 231;BA.debugLine="If b = IsOpen Then Return";
if (_b==_vvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
if (true) return "";};
 //BA.debugLineNum = 232;BA.debugLine="Dim x As Float";
_x = 0f;
 //BA.debugLineNum = 233;BA.debugLine="If b Then x = 0 Else x = -mSideWidth";
if (_b) { 
_x = (float) (0);}
else {
_x = (float) (-_vvvvvvvvvvvvvvvvvvvvvvvvvv0);};
 //BA.debugLineNum = 234;BA.debugLine="ChangeOffset(x, False, False)";
_vvvvvvvvvvvvvvvvvvvvvvvvv2(_x,__c.False,__c.False);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
