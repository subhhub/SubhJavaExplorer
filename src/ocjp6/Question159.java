package ocjp6;

public class Question159 {

}

interface AInt { public void m1(); }

class BCls implements AInt { }
class CCls implements AInt { public void m1() { } }
class DCls implements AInt { public void m1(int x) { } }
abstract class EAbs implements AInt { }
abstract class FAbs implements AInt { public void m1() { } }
abstract class GAbs implements AInt { public void m1(int x) { } }