import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

//import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
//import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
//import com.kms.katalon.core.testobject.RestRequestObjectBuilder as RestRequestObjectBuilder
//import com.kms.katalon.core.testobject.impl.HttpTextBodyContent as HttpTextBodyContent
//import groovy.json.JsonSlurper as JsonSlurper
WebUI.callTestCase(findTestCase('MyFreight - login'), [('loginEmail') : 'davide.myfreight@gmail.com', ('loginPwd') : '1kvRxLz89p4ZgRvJ6Tqr6Q=='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Data Prep cases/Myfreight - Create new despatchable consignment - for test data'), [('strReference') : 'from Book available cons for one carrier - with additional items'
        , ('strAddrSearchTerm') : 'Chat', ('Item1Quantity') : '2', ('Item1Length') : '22', ('Item1Width') : '24', ('Item1Height') : '15'
        , ('Item1DeadWeight') : '5', ('Item1ItemType') : 1], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(2)

//ResponseObject ro = WS.sendRequest(findTestObject('Test Request'))
//WS.verifyResponseStatusCode(ro, 201)
//if (ro.statusCode == 201) {
//	String respbodyContent = ro.getResponseBodyContent()
//	def jsonSlurper = new JsonSlurper()
//		def object = jsonSlurper.parseText(respbodyContent)
//    assert object.id == '13156940'
//		KeywordUtil log = new KeywordUtil()
//		String id = object.id
//		log.logInfo(id)
//		WebUI.delay(1)
WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/a-booking-enquiries'))

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/a_Booking'))

WebUI.waitForPageLoad(2)

WebUI.verifyElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/h1_booking-Book Consignments'))

WebUI.verifyElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/select_booking-site-name ng-pristine ng-untouched ng-valid ng-not-empty'))

WebUI.verifyElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/h3_booking-carrier'))

WebUI.verifyElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/i_booking-icon-chevron-down'))

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/i_booking-icon-chevron-down'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/label_booking-checkbox-label icon-check-empty-item1'))

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/label_booking-checkbox-label icon-check-empty-item1'))

WebUI.verifyElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/button_booking-Book'))

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/input_QUANTITY'), AddlItem1Qty)

WebUI.scrollToElement(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/select_ITEM_TYPE'), 1)

WebUI.selectOptionByIndex(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/select_ITEM_TYPE'), AddlItem1ItemType, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/input_LENGTH'), AddlItem1Length)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/input_WIDTH'), AddlItem1Width)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/input_HEIGHT'), AddlItem1Width)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/input_DEAD WEIGHT'), AddlItem1DeadWeight)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/button_booking-Book'))

WebUI.delay(3)

String ts = System.currentTimeMillis().toString()

WebUI.takeScreenshot(('Test/bookallavailconswithaddtlitems-' + ts) + '.png')

WebUI.closeBrowser()

