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

WebUI.callTestCase(findTestCase('MyFreight - login'), [('loginEmail') : 'davide.myfreight@gmail.com', ('loginPwd') : '5Kt/6eAdkwVnW/BayCZccw=='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/a_QUOTES_enquiries'))

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/a_Booking'))

WebUI.waitForPageLoad(2)

WebUI.verifyElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/h1_booking-Book Consignments'))

WebUI.verifyElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/select_booking-site-name ng-pristine ng-untouched ng-valid ng-not-empty'))

WebUI.verifyElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/h3_booking-carrier'))

WebUI.verifyElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/i_booking-icon-chevron-down'))

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/i_booking-icon-chevron-down'))

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/label_booking-checkbox-label icon-check-empty'))

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/button_booking-Book'))

