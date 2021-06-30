        function addFields(){
              console.log("inside addfields");
            var number = document.getElementById("numAttr").value;
            var container = document.getElementById("attrContainer");
            while (container.hasChildNodes()) {
                container.removeChild(container.lastChild);
            }
            for (i=0;i<number;i++){
                container.appendChild(document.createTextNode("Attribute " + (i+1)));
                var aname = document.createElement("input");
                aname.type = "text";
                aname.name = "attribute" + i;
                container.appendChild(aname);
                
                var atype = document.createElement("select");
                var option = document.createElement("option");
                option.text="int";
                atype.add(option);
                
                option = document.createElement("option");
                option.text="varchar(255)";
                atype.add(option);
                
                option = document.createElement("option");
                option.text="float";
                atype.add(option);
                
                option = document.createElement("option");
                option.text="binary";
                atype.add(option);
                container.appendChild(atype);
                container.appendChild(document.createElement("br"));
            }

        }
        
      function addqueries()
      {
      console.log("inside addqueries");
      var number = document.getElementById("numque").value;
      var container1 = document.getElementById("querContainer");
      while (container1.hasChildNodes()) {
      container1.removeChild(container1.lastChild);
            }
	
	for (i=0;i<number;i++){
                container1.appendChild(document.createTextNode("Query " + (i+1)));
                var qname = document.createElement("input");
                qname.type = "text";
                qname.name = "query" + i;
                container1.appendChild(qname);
                container1.appendChild(document.createElement("br"));
            }      
      }