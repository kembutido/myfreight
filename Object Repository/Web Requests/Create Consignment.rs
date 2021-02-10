<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>Normal consignment - bir2 site</description>
   <name>Create Consignment</name>
   <tag></tag>
   <elementGuidId>9a5f12ee-7d56-4ec2-a282-1f44de0ea29b</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;site_code\&quot;: \&quot;BIR2\&quot;,\n    \&quot;despatch_date\&quot;: \&quot;2020-12-15\&quot;,\n    \&quot;reference\&quot;: \&quot;33QDUbbSy46EyoCMXdgLDmtz6dfazhBS4\&quot;,\n    \&quot;custom_reference\&quot;: \&quot;e8e38870-a98b-4eec-8d02-3abe9f5ef665\&quot;,\n    \&quot;account_payable\&quot;: \&quot;sender\&quot;,\n    \&quot;charge_account\&quot;: \&quot;Not ours\&quot;,\n    \&quot;special_instructions\&quot;: null,\n    \&quot;carrier_service\&quot;: \&quot;STPFPP\&quot;,\n    \&quot;carrier_route\&quot;: \&quot;BARNACLE\&quot;,\n    \&quot;custom_label_printer\&quot;: \&quot;SomePrinter\&quot;,\n    \&quot;third_party\&quot;: false,\n    \&quot;sender_address\&quot;: {\n        \&quot;name\&quot;: \&quot;Birkis 4 U\&quot;,\n        \&quot;code\&quot;: \&quot;BIR2\&quot;,\n        \&quot;email\&quot;: null,\n        \&quot;phone\&quot;: null,\n        \&quot;address_line_1\&quot;: \&quot;9-13 Mickey Drive\&quot;,\n        \&quot;address_line_2\&quot;: null,\n        \&quot;address_line_3\&quot;: null,\n        \&quot;address_line_4\&quot;: null,\n        \&quot;sublocality\&quot;: \&quot;some beach\&quot;,\n        \&quot;locality\&quot;: \&quot;SANDGATE\&quot;,\n        \&quot;postcode\&quot;: \&quot;2304\&quot;,\n        \&quot;region\&quot;: \&quot;NSW\&quot;,\n        \&quot;country\&quot;: \&quot;Australia\&quot;\n    },\n    \&quot;receiver_address\&quot;: {\n        \&quot;name\&quot;: \&quot;Mr. Rene Shields\&quot;,\n        \&quot;code\&quot;: \&quot;106651-2130\&quot;,\n        \&quot;email\&quot;: \&quot;Durward37@yahoo.com\&quot;,\n        \&quot;phone\&quot;: \&quot;0312345678\&quot;,\n        \&quot;address_line_1\&quot;: \&quot;639 Rogelio Run\&quot;,\n        \&quot;address_line_2\&quot;: null,\n        \&quot;address_line_3\&quot;: null,\n        \&quot;address_line_4\&quot;: null,\n        \&quot;sublocality\&quot;: \&quot;\&quot;,\n        \&quot;locality\&quot;: \&quot;SUMMER HILL\&quot;,\n        \&quot;postcode\&quot;: \&quot;2130\&quot;,\n        \&quot;region\&quot;: \&quot;NSW\&quot;,\n        \&quot;country\&quot;: \&quot;Australia\&quot;\n    },\n    \&quot;items\&quot;: [\n        {\n            \&quot;reference\&quot;: \&quot;item reference exists\&quot;,\n            \&quot;quantity\&quot;: 1,\n            \&quot;item_type_description\&quot;: \&quot;Satchel 3kg\&quot;,\n            \&quot;length\&quot;: 20,\n            \&quot;width\&quot;: 20,\n            \&quot;height\&quot;: 20,\n            \&quot;weight_in_kilograms\&quot;: 1\n        }\n    ]\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic ZGF2aWQuZWFsZGFtYUBmbGV4aXNvdXJjZWl0LmNvbS5hdTpxZVhEay10WVVpN2JObWR6ZU1Oag==</value>
   </httpHeaderProperties>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://uat.teamwilberforce.com/public/api/v1/consignments</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.despatchDate</defaultValue>
      <description></description>
      <id>e4733a97-d8c3-45e0-90cc-06f87960c2bb</id>
      <masked>false</masked>
      <name>today</name>
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

def jsonSlurper = new JsonSlurper()
def jRes = jsonSlurper.parseText(response.getResponseBodyContent())

ConsNum = jRes.id

GlobalVariable.TestConsNum = ConsNum









</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
