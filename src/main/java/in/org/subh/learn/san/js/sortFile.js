var someArray1 = [
	{
		"id": 10,
		"name": "baj1111111",
		"date": "2010/01/19",
		"age": "46"
	},
	{
		"id": 1,
		"name": "raj",
		"date": "2010/02/12",
		"age": "46"
	},
	{
		"id": 2,
		"name": "aj1",
		"date": "2018/01/3",
		"age": "47"
	},
	{
		"id": 3,
		"name": "zaj2",
		"date": "2013/01/14",
		"age": "48"
	}
]

/*function loadJSON(callback) {

    var xobj = new XMLHttpRequest();
    xobj.overrideMimeType("application/json");
    xobj.open('GET', 'test.json', true);
    xobj.onreadystatechange = function() {
        if (xobj.readyState == 4 && xobj.status == "200") {

            // .open will NOT return a value but simply returns undefined in async mode so use a callback
            callback(xobj.responseText);
        }
    }
    xobj.send(null);
}*/

function custom_sort_date(a, b) {
    return new Date(a.date).getTime() - new Date(b.date).getTime();
}

function myFunctionDateArray() {
	someArray1.sort(custom_sort_date);
	
	var jsonOutput = "["
		
	for (var item in someArray1) { 
		
		jsonOutput = jsonOutput+ "{ \"id\": "+someArray1[item].id+", \"name\": \""+someArray1[item].name+"\", \"date\": \""+someArray1[item].date+"\" },"
		
	    //document.write("br" + someArray1[item].date +",  "+someArray1[item].id +",  "+someArray1[item].name+"]");  
	}
	
	jsonOutput = jsonOutput.substring(0, jsonOutput.length-1)
	
	jsonOutput = jsonOutput+ "]";
	
//	document.write(jsonOutput);
	
//	WriteToFile(jsonOutput)
	
	return jsonOutput;
}

function WriteToFile()
{
	var jsonOutputNew = myFunctionDateArray()
	
	var fso = new ActiveXObject("Scripting.FileSystemObject");
	var s = fso.CreateTextFile("C:\\subh\\Test.json", true);
//	s.WriteLine('Hello');
	s.WriteLine(jsonOutputNew);
	s.Close();
}










