<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>pdf</description>
   <name>pdf print</name>
   <tag></tag>
   <elementGuidId>35dd4fc2-b6e9-48f6-ad03-80c049b3cbb5</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic ZGF2aWQuZWFsZGFtYUBmbGV4aXNvdXJjZWl0LmNvbS5hdTpxZVhEay10WVVpN2JObWR6ZU1Oag==</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://qa.teamwilberforce.com/public/api/v1/consignments/${conid}.pdf?Content-Type=application/json&amp;conid=${conid}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'13912663'</defaultValue>
      <description></description>
      <id>a320352a-0e68-4e8c-b246-ced5881b3ca5</id>
      <masked>false</masked>
      <name>conid</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
