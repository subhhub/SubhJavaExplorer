package test.groovy

println "hello"

System.out.println("hello java")
def val = "poo"
def vl = "subh${val}";
def v2 = 'subh';
def v3 = '''su\
bh'''

println vl
println v2
println v3

buildscript {
	println 'ok buildscript'
}

def vl1 = 10;
def vl2 = 20;

def vl3 = vl1+vl2
print vl3