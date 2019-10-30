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

WebUI.callTestCase(findTestCase('MyFreight - login'), [('loginEmail') : 'davide.myfreight@gmail.com', ('loginPwd') : 'EFc/3RtcwuGANqtaSV3M6Q=='
        , ('loginPwd2') : 'Jvf9mmfhklcCEM+RmaiVtA==', ('loginEmail2') : 'david.ealdama@flexisourceit.com.au'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Myfreight - New Consignment - for test data'), [('strReference') : 'hey', ('strAddrSearchTerm') : 'Bill'
        , ('Item1Quantity') : '2', ('Item1Length') : '22', ('Item1Width') : '24', ('Item1Height') : '15', ('Item1DeadWeight') : '5'
        , ('Item1ItemType') : 'Carton'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/a-booking-enquiries'))

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/a_Booking'))

WebUI.waitForPageLoad(2)

WebUI.verifyElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/h1_booking-Book Consignments'))

WebUI.verifyElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/select_booking-site-name ng-pristine ng-untouched ng-valid ng-not-empty'))

WebUI.verifyElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/h3_booking-carrier'))

WebUI.verifyElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/i_booking-icon-chevron-down'))

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/i_booking-icon-chevron-down'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/label_booking-checkbox-label icon-check-empty'))

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/label_booking-checkbox-label icon-check-empty'))

WebUI.verifyElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/button_booking-Book'))

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Booking Page/button_booking-Book'))

