<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>Normal consignment - bir2 site</description>
   <name>Create Cons - Birkenstock</name>
   <tag></tag>
   <elementGuidId>9a5f12ee-7d56-4ec2-a282-1f44de0ea29b</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;site_code\&quot;: \&quot;BIR2\&quot;,\n    \&quot;despatch_date\&quot;: \&quot;2019-12-12\&quot;,\n    \&quot;reference\&quot;: \&quot;WF889-891\&quot;,\n    \&quot;account_payable\&quot;: \&quot;sender\&quot;,\n    \&quot;charge_account\&quot;: \&quot;Not ours\&quot;,\n    \&quot;special_instructions\&quot;: \&quot;Generated from API\&quot;,\n    \&quot;carrier_service\&quot;: \&quot;TNT\&quot;,\n    \&quot;carrier_route\&quot;: \&quot;BARNACLE\&quot;,\n    \&quot;custom_label_printer\&quot;: \&quot;SomePrinter\&quot;,\n    \&quot;third_party\&quot;: false,\n    \&quot;sender_address\&quot;: {\n        \&quot;name\&quot;: \&quot;Birkis 4 U\&quot;,\n        \&quot;code\&quot;: \&quot;BIR2\&quot;,\n        \&quot;email\&quot;: null,\n        \&quot;phone\&quot;: null,\n        \&quot;address_line_1\&quot;: \&quot;113-115 Queens Parade\&quot;,\n        \&quot;address_line_2\&quot;: null,\n        \&quot;address_line_3\&quot;: null,\n        \&quot;address_line_4\&quot;: null,\n        \&quot;sublocality\&quot;: null,\n        \&quot;locality\&quot;: \&quot;CLIFTON HILL\&quot;,\n        \&quot;postcode\&quot;: \&quot;3068\&quot;,\n        \&quot;region\&quot;: \&quot;VIC\&quot;,\n        \&quot;country\&quot;: \&quot;Australia\&quot;\n    },\n    \&quot;receiver_address\&quot;: {\n        \&quot;name\&quot;: \&quot;Myfreight - Perth\&quot;,\n        \&quot;code\&quot;: \&quot;PH3\&quot;,\n        \&quot;email\&quot;: null,\n        \&quot;phone\&quot;: \&quot;0312345678\&quot;,\n        \&quot;address_line_1\&quot;: \&quot;333 Mary St\&quot;,\n        \&quot;address_line_2\&quot;: null,\n        \&quot;address_line_3\&quot;: null,\n        \&quot;address_line_4\&quot;: null,\n        \&quot;sublocality\&quot;: null,\n        \&quot;locality\&quot;: \&quot;CANNING VALE\&quot;,\n        \&quot;postcode\&quot;: \&quot;6155\&quot;,\n        \&quot;region\&quot;: \&quot;WA\&quot;,\n        \&quot;country\&quot;: \&quot;Australia\&quot;\n    },\n    \&quot;items\&quot;: [\n        {\n            \&quot;reference\&quot;: \&quot;WF889-891\&quot;,\n            \&quot;quantity\&quot;: 1,\n            \&quot;item_type_description\&quot;: \&quot;Satchel 3kg\&quot;,\n            \&quot;length\&quot;: 32,\n            \&quot;width\&quot;: 41,\n            \&quot;height\&quot;: 1,\n            \&quot;weight_in_kilograms\&quot;: 1,\n            \&quot;dangerous_goods_items\&quot;: [\n                {\n                    \&quot;un_number\&quot;: \&quot;1228\&quot;,\n                    \&quot;proper_shipping_name\&quot;: \&quot;MERCAPTAN MIXTURE, LIQUID, FLAMMABLE, TOXIC, N.O.S.\&quot;,\n                    \&quot;technical_name\&quot;: \&quot;smelly socks\&quot;,\n                    \&quot;hazard_class\&quot;: \&quot;3\&quot;,\n                    \&quot;packing_group\&quot;: \&quot;III\&quot;,\n                    \&quot;sub_risk\&quot;: \&quot;6.1\&quot;,\n                    \&quot;aggregate_quantity\&quot;: 1\n                }\n            ]\n        }\n    ]\n}&quot;,
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
