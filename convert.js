function downloadData(contentType, data, filename) {
  var link = document.createElement("A");
  link.setAttribute("href", encodeURI("data:" + contentType + "," + data));
  link.setAttribute("style", "display:none");
  link.setAttribute("download", filename);
  document.body.appendChild(link);
  console.log(link.outerHTML);
  link.click();
  setTimeout(function () {
    document.body.removeChild(link);
  }, 1000);
}

function fromToXml(form) {
  var xmldata = ['<?xml version="1.0"?>'];
  var inputs = form.elements;
  var nstreams = inputs[0].value;

  xmldata.push("<streams>");

  xmldata.push("<stream>");

  var length = 2;
  for (var i = 3; i < 5; i++) {
    var nameString = inputs[i].name;
    var el = document.createElement(nameString);

    el.setAttribute("value", inputs[i].value);
    xmldata.push(el.outerHTML);
    length++;
  }

  var parent = document.createElement("Window");
  for (var i = 5; i < 8; i++) {
    var nameString = inputs[i].name;
    var el1 = document.createElement(nameString);

    el1.setAttribute("value", inputs[i].value);
    parent.appendChild(el1);
    length++;
  }
  xmldata.push(parent.outerHTML);

  var limit = inputs[8].value;
  length = length + 4;
  var properties = document.createElement("properties");
  for (var i = 12; i < 11 + 2 * limit; i++) {
    var property = document.createElement("property");
    var el3 = document.createElement("name");
    el3.setAttribute("value", inputs[i++].value);
    property.appendChild(el3);

    var el2 = document.createElement("type");
    el2.setAttribute("value", inputs[i].value);

    property.appendChild(el2);
    properties.appendChild(property);
    length = length + 2;
  }

  xmldata.push(properties.outerHTML);
  var numque = inputs[10].value;
  var limit1 = 12 + 2 * limit;

  var queries = document.createElement("continous_queries");
  for (var i = limit1; i < Number(limit1) + Number(numque); i++) {
    var query = document.createElement("query");
    query.setAttribute("value", inputs[i].value);

    queries.appendChild(query);
    length++;
  }
  xmldata.push(queries.outerHTML);

  xmldata.push("</stream>");

  console.log(length++);
  for (var k = 2; k <= nstreams; k++) {
    xmldata.push("<stream>");

    var length2 = length;
    for (var i = length2; i < Number(length2) + Number(2); i++) {
      var nameString = inputs[i].name;
      var el = document.createElement(nameString);

      el.setAttribute("value", inputs[i].value);
      xmldata.push(el.outerHTML);
      length++;
    }

    length2 = length;
    var parent = document.createElement("Window");
    for (var i = length2; i < length2 + 3; i++) {
      var nameString = inputs[i].name;
      var el1 = document.createElement(nameString);

      el1.setAttribute("value", inputs[i].value);
      parent.appendChild(el1);
      length++;
    }
    xmldata.push(parent.outerHTML);

    limit = inputs[length].value;
    numque = inputs[length + 2].value;
    length = length + 4;

    console.log(limit);
    console.log(numque);

    length2 = length;
    var properties = document.createElement("properties");
    for (var i = length2; i < length2 - 1 + 2 * limit; i++) {
      var property = document.createElement("property");
      var el3 = document.createElement("name");
      el3.setAttribute("value", inputs[i++].value);
      property.appendChild(el3);

      var el2 = document.createElement("type");
      el2.setAttribute("value", inputs[i].value);

      property.appendChild(el2);
      properties.appendChild(property);
      length = length + 2;
    }
    xmldata.push(properties.outerHTML);
    var limit1 = length2 + 2 * limit;

    var queries = document.createElement("continous_queries");
    for (var i = limit1; i < Number(limit1) + Number(numque); i++) {
      var query = document.createElement("query");
      query.setAttribute("value", inputs[i].value);

      queries.appendChild(query);
      length++;
    }
    xmldata.push(queries.outerHTML);

    xmldata.push("</stream>");

    console.log(length);
  }
  xmldata.push("</streams>");

  return xmldata.join("\n");
}

function download(frm) {
  var data = fromToXml(frm);
  console.log(data);

  downloadData("text/xml", data, "export.xml");
}
