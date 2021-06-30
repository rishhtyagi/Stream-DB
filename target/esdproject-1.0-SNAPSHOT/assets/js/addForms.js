function addForms() {
  console.log("inside addfields");
  var number = document.getElementById("numstream").value;
  var container = document.getElementById("container2");
  while (container.hasChildNodes()) {
    container.removeChild(container.lastChild);
  }

  for (i = 0; i < number; i++) {
    container.appendChild(document.createTextNode("Stream " + (i + 1)));
    container.appendChild(document.createElement("br"));

    container.appendChild(document.createTextNode("Stream Name: "));
    var streamName = document.createElement("input");
    streamName.type = "text";
    streamName.name = "streamname";
    container.appendChild(streamName);

    container.appendChild(document.createTextNode("Stream Source: "));
    var streamsource = document.createElement("input");
    streamsource.type = "text";
    streamsource.name = "streamsource";
    // streamsource.accept = ".csv";
    // streamsource.id = "file";
    container.appendChild(streamsource);
    container.appendChild(document.createElement("br"));
    container.appendChild(document.createElement("hr"));

    container.appendChild(document.createTextNode("Window size: "));
    var windowSize = document.createElement("input");
    windowSize.type = "text";
    windowSize.name = "windowsize";
    container.appendChild(windowSize);

    container.appendChild(document.createTextNode("Window Velocity: "));
    var windowVelocity = document.createElement("input");
    windowVelocity.type = "text";
    windowVelocity.name = "windowvelocity";
    container.appendChild(windowVelocity);
    container.appendChild(document.createElement("br"));

    container.appendChild(document.createTextNode("Window Type: "));
    var windowType = document.createElement("select");
    windowType.text = "text";
    windowType.name = "windowtype";

    var option = document.createElement("option");
    option.text = "Sliding Window";
    windowType.add(option);

    // option = document.createElement("option");
    // option.text = "Fixed Window";
    // windowType.add(option);

    option = document.createElement("option");
    option.text = "Folding Window";
    windowType.add(option);

    // option = document.createElement("option");
    // option.text = "Landmark Window";
    // windowType.add(option);
    container.appendChild(windowType);
    container.appendChild(document.createElement("br"));
    container.appendChild(document.createElement("hr"));

    container.appendChild(document.createTextNode("Number of Attributes: "));
    var numAttributes = document.createElement("input");
    numAttributes.type = "text";
    numAttributes.name = "numberAttributes";
    numAttributes.id = "numAttributes" + (i + 1);
    container.appendChild(numAttributes);
    var numAttrbtn = document.createElement("BUTTON");
    numAttrbtn.innerHTML = "Add Attributes";
    numAttrbtn.type = "button";
    numAttrbtn.className = "bt";
    numAttrbtn.id = "btn-" + (i + 1);
    numAttrbtn.addEventListener("click", (e) => {
      let childId = e.target.id.split("-")[1];

      var number = document.getElementById("numAttributes" + childId).value;
      var container = document.getElementById("attrContainer" + childId);
      while (container.hasChildNodes()) {
        container.removeChild(container.lastChild);
      }
      for (i = 0; i < number; i++) {
        container.appendChild(document.createTextNode("Attribute " + (i + 1)));
        var aname = document.createElement("input");
        aname.type = "text";
        aname.name = "attribute" + i;
        container.appendChild(aname);

        var atype = document.createElement("select");
        var option = document.createElement("option");
        option.text = "int";
        atype.add(option);

        option = document.createElement("option");
        option.text = "varchar(255)";
        atype.add(option);

        option = document.createElement("option");
        option.text = "float";
        atype.add(option);

        option = document.createElement("option");
        option.text = "binary";
        atype.add(option);
        container.appendChild(atype);
        container.appendChild(document.createElement("br"));
      }
    });
    container.appendChild(numAttrbtn);
    container.appendChild(document.createElement("br"));

    container.appendChild(document.createTextNode("Number of Queries: "));
    var numQueries = document.createElement("input");
    numQueries.type = "text";
    numQueries.name = "numQueries";
    numQueries.id = "numQueries" + (i + 1);
    container.appendChild(numQueries);
    var numQuebtn = document.createElement("BUTTON");
    numQuebtn.innerHTML = "Add Queries";
    numQuebtn.type = "button";
    numQuebtn.className = "bt";
    numQuebtn.id = "btn-" + (i + 1);
    numQuebtn.addEventListener("click", (e) => {
      let childId = e.target.id.split("-")[1];

      var number = document.getElementById("numQueries" + childId).value;
      var container1 = document.getElementById("querContainer" + childId);
      while (container1.hasChildNodes()) {
        container1.removeChild(container1.lastChild);
      }

      for (i = 0; i < number; i++) {
        container1.appendChild(document.createTextNode("Query " + (i + 1)));
        var qname = document.createElement("input");
        qname.type = "text";
        qname.name = "query" + i;
        qname.className = "queryInput";
        container1.appendChild(qname);
        container1.appendChild(document.createElement("br"));
      }
    });
    container.appendChild(numQuebtn);

    var divContainer = document.createElement("div");
    divContainer.id = "stream" + (i + 1);
    divContainer.className = "flexbox-container";
    divContainer.style = "display:flex;";

    var divContainer1 = document.createElement("div");
    divContainer1.id = "attrContainer" + (i + 1);
    divContainer1.style = "flex:1; background-color:#abd";
    divContainer.appendChild(divContainer1);

    var divContainer2 = document.createElement("div");
    divContainer2.id = "querContainer" + (i + 1);
    console.log(divContainer2.id);
    divContainer2.style = "width:100%; flex:1; background-color:#cbc";
    divContainer.appendChild(divContainer2);

    container.appendChild(divContainer);
    // containersArr[i] = divContainer;

    // <div class="flexbox-container" style="display:flex;">
    //     <div id="attrContainer" style="flex:1; background-color:#aba"> </div>
    //     <div id="querContainer" style="width:100%; flex:1; background-color:#cbc"> </div>
    // </div>

    container.appendChild(document.createElement("br"));
    var hrSeparator = document.createElement("hr");
    hrSeparator.className = "hrSeparator";
    container.appendChild(hrSeparator);
    container.appendChild(document.createElement("br"));
  }
}

function addFielsToContainer(id) {
  var container = document.getElementById(id);
  container.appendChild(document.createTextNode("new field space"));
  // document.getElementById(id).innerHTML = "ok";
  // containersArr[i].appendChild(document.createTextNode("new field space"));
}
