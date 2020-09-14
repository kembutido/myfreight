import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
//import groovy.json.JsonOutput
import com.kms.katalon.core.testobject.RestRequestObjectBuilder as RestRequestObjectBuilder
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent as HttpTextBodyContent
import groovy.json.JsonSlurper as JsonSlurper

//ResponseObject response = WS.sendRequest(findTestObject('Create New Site'))
//if (response != null) {
//String respbodyContent = response.getResponseBodyContent()
//def jsonSlurper = new JsonSlurper()
//def object = jsonSlurper.parseText(respbodyContent)
//assert object.address.code == 'DVE'
//}
WebUI.callTestCase(findTestCase('MyFreight - login'), [('loginEmail') : 'david.ealdama@flexisourceit.com.au', ('loginPwd') : 'Jvf9mmfhklcCEM+RmaiVtA=='], 
    FailureHandling.STOP_ON_FAILURE)

ResponseObject ro = WS.sendRequest(findTestObject('Create Consignment'))

//WS.verifyResponseStatusCode(ro, 201)
if (ro.statusCode == 201) {
    String respbodyContent = ro.getResponseBodyContent()

    def jsonSlurper = new JsonSlurper()

    def object = jsonSlurper.parseText(respbodyContent)

    //    assert object.id == '13156940'
    KeywordUtil log = new KeywordUtil()

    String id = object.id

    log.logInfo(id)
	RequestObject reqobj =  new findTestObject('pdf print')
	
    WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/inputsearch-consignment-field'), id //WebUI.closeBrowser()
        )

    WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/a_ng-scope'))

    WebUI.delay(2)
}

