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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('MyFreight - login'), [('loginEmail') : 'davide.myfreight@gmail.com', ('loginPwd') : 'EFc/3RtcwuGANqtaSV3M6Q=='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(1)

WebUI.scrollToElement(findTestObject('MyFreight-Users/Page_Myfreight/a_QUOTES'), 2)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/a_QUOTES'))

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/button_btn btn-inverse dropdown-toggle'))

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Quotes/a_Quick Quote'))

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('MyFreight-Users/Page_Myfreight/Quotes/select_site-name ng-pristine ng-untouched ng-valid ng-not-empty'), 
    'Birkis 4 U(BIR2)', false)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/Quotes/input_RECEIVER_POSTCODE'), '3068')

WebUI.selectOptionByLabel(findTestObject('MyFreight-Users/Page_Myfreight/Quotes/select_SENDER_LOCALITY'), 'CLIFTON HILL', 
    false)

WebUI.delay(1)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/Quotes/input_RECEIVER_POSTCODE'), '3128')

WebUI.selectOptionByIndex(findTestObject('MyFreight-Users/Page_Myfreight/Quotes/select_RECEIVER_LOCALITY'), '0', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_QUANTITY'), Item1Quantity)

WebUI.scrollToElement(findTestObject('MyFreight-Users/Page_Myfreight/select_ItemType'), 1)

WebUI.selectOptionByLabel(findTestObject('MyFreight-Users/Page_Myfreight/select_ItemType'), Item1ItemType, false)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_cm_LENGTH'), Item1Length)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_cm_WIDTH'), Item1Width)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_cm_HEIGHT'), Item1Height)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_cm_DEAD WEIGHT'), Item1DeadWeight)

'Toggle the Hazardous flag for the first item'
WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/div_dangerous-goods-toggle ng-scope'))

WebUI.delay(1)

String ts = System.currentTimeMillis().toString()

WebUI.scrollToElement(findTestObject('MyFreight-Users/Page_Myfreight/Quotes/divrate-0'), 0)

WebUI.takeScreenshot(('Test/QuickQuote1-' + ts) + '.png')

WebUI.closeBrowser()

