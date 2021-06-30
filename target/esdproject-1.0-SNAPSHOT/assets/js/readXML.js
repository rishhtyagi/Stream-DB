function readXML() {
  let xmlContent = "";
  let streamselect = document.getElementById("streamSelect");
  fetch("export.xml", {}).then((response) => {
    response.text().then((xml) => {
      console.log(xml);

      xmlContent = xml;
      let parser = new DOMParser();
      let xmlDOM = parser.parseFromString(xmlContent, "application/xml");
      let streams = xmlDOM.querySelectorAll("streamname");
      streams.forEach((streamXmlNode) => {
        console.log(streamXmlNode.getAttribute("value"));
        var opt = document.createElement("option");
        opt.value = streamXmlNode.getAttribute("value");
        opt.innerHTML = streamXmlNode.getAttribute("value");
        streamselect.appendChild(opt);
      });
    });
  });
}
