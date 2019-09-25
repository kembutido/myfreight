<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Test request</name>
   <tag></tag>
   <elementGuidId>bfaffedc-0e1f-4098-8fc3-e23e3b14b955</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;site_code\&quot;: \&quot;PH2\&quot;,\n    \&quot;despatch_date\&quot;: \&quot;09/25/2019\&quot;,\n    \&quot;reference\&quot;: \&quot;a reference\&quot;,\n    \&quot;custom_reference\&quot;: \&quot;something\&quot;,\n    \&quot;account_payable\&quot;: \&quot;sender\&quot;,\n    \&quot;charge_account\&quot;: \&quot;Not ours\&quot;,\n    \&quot;special_instructions\&quot;: \&quot;Generated from Katalon web service request\&quot;,\n    \&quot;carrier_service\&quot;: \&quot;CPLEASE\&quot;,\n    \&quot;carrier_route\&quot;: \&quot;BARNACLE\&quot;,\n    \&quot;custom_label_printer\&quot;: \&quot;SomePrinter\&quot;,\n    \&quot;sender_address\&quot;: {\n        \&quot;name\&quot;: \&quot;Myfreight - Sydney\&quot;,\n        \&quot;code\&quot;: \&quot;PH2\&quot;,\n        \&quot;email\&quot;: null,\n        \&quot;phone\&quot;: null,\n        \&quot;address_line_1\&quot;: \&quot;2/10 Crompton Way\&quot;,\n        \&quot;address_line_2\&quot;: null,\n        \&quot;address_line_3\&quot;: null,\n        \&quot;address_line_4\&quot;: null,\n        \&quot;sublocality\&quot;: null,\n        \&quot;locality\&quot;: \&quot;ERSKINE PARK\&quot;,\n        \&quot;postcode\&quot;: \&quot;2759\&quot;,\n        \&quot;region\&quot;: \&quot;NSW\&quot;,\n        \&quot;country\&quot;: \&quot;Australia\&quot;\n    },\n    \&quot;receiver_address\&quot;: {\n        \&quot;name\&quot;: \&quot;Myfreight - Perth\&quot;,\n        \&quot;code\&quot;: \&quot;PH3\&quot;,\n        \&quot;email\&quot;: \&quot;newemailfromapi@hotmail.io\&quot;,\n        \&quot;phone\&quot;: \&quot;0312345678\&quot;,\n        \&quot;address_line_1\&quot;: \&quot;333 Mary St\&quot;,\n        \&quot;address_line_2\&quot;: null,\n        \&quot;address_line_3\&quot;: null,\n        \&quot;address_line_4\&quot;: null,\n        \&quot;sublocality\&quot;: null,\n        \&quot;locality\&quot;: \&quot;Perth\&quot;,\n        \&quot;postcode\&quot;: \&quot;6000\&quot;,\n        \&quot;region\&quot;: \&quot;WA\&quot;,\n        \&quot;country\&quot;: \&quot;Australia\&quot;\n    },\n    \&quot;items\&quot;: [\n        {\n            \&quot;reference\&quot;: \&quot;Product Code: 47263\&quot;,\n            \&quot;quantity\&quot;: 1,\n            \&quot;item_type_description\&quot;: \&quot;Carton\&quot;,\n            \&quot;length\&quot;: 20,\n            \&quot;width\&quot;: 20,\n            \&quot;height\&quot;: 20,\n            \&quot;weight_in_kilograms\&quot;: 20,\n            \&quot;dangerous_goods_items\&quot;: [\n                {\n                    \&quot;un_number\&quot;: \&quot;1013\&quot;,\n                    \&quot;proper_shipping_name\&quot;: \&quot;Carbon Dioxide\&quot;,\n                    \&quot;technical_name\&quot;: null,\n                    \&quot;hazard_class\&quot;: \&quot;2.2\&quot;,\n                    \&quot;packing_group\&quot;: null,\n                    \&quot;sub_risk\&quot;: null,\n                    \&quot;aggregate_quantity\&quot;: 10\n                },\n                {\n                    \&quot;un_number\&quot;: \&quot;1228\&quot;,\n                    \&quot;proper_shipping_name\&quot;: \&quot;MERCAPTAN MIXTURE, LIQUID, FLAMMABLE, TOXIC, N.O.S.\&quot;,\n                    \&quot;technical_name\&quot;: \&quot;smelly socks\&quot;,\n                    \&quot;hazard_class\&quot;: \&quot;3\&quot;,\n                    \&quot;packing_group\&quot;: \&quot;III\&quot;,\n                    \&quot;sub_risk\&quot;: \&quot;6.1\&quot;,\n                    \&quot;aggregate_quantity\&quot;: 10\n                }\n            ]\n        },\n        {\n            \&quot;reference\&quot;: null,\n            \&quot;quantity\&quot;: 2,\n            \&quot;item_type_description\&quot;: \&quot;Carton\&quot;,\n            \&quot;length\&quot;: \&quot;21\&quot;,\n            \&quot;width\&quot;: 50,\n            \&quot;height\&quot;: 20,\n            \&quot;weight_in_kilograms\&quot;: 20\n        }\n    ]\n}&quot;,
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
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://qa.teamwilberforce.com/public/api/v1/consignments</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
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


WS.verifyResponseStatusCode(response, 201)
assertThat(response.getResponseText()).contains('{&quot;id&quot;:')

def jsonSlurper = new JsonSlurper()
def jsonResponse = jsonSlurper.parseText(response.getResponseBodyContent())

GlobalVariable.TestConsNum = response.id
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
