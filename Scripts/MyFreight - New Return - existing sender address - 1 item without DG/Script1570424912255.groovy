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

WebUI.callTestCase(findTestCase('MyFreight - login'), [('loginEmail') : 'davide.myfreight@gmail.com', ('loginPwd') : '1kvRxLz89p4ZgRvJ6Tqr6Q=='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('MyFreight-Users/Page_Myfreight/a_CONSIGNMENTS'), 2)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/a_CONSIGNMENTS'))

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/button_btn btn-inverse dropdown-toggle'))

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/a_Return'))

WebUI.delay(1)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_REFERENCE_REFERENCE'), strReference)

//WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_DESPATCH DATE_despatch_d'), GlobalVariable.despatchDate)
WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_Sender'), strAddrSearchTerm)

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/a_Address_dropdown_item1'))

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_return_phone_number'), returnPhone)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_pickup_location'), returnPickupLoc)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_return_email'), returnEmail)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_QUANTITY'), Item1Quantity)

WebUI.scrollToElement(findTestObject('MyFreight-Users/Page_Myfreight/select_ItemType'), 1)

WebUI.selectOptionByLabel(findTestObject('MyFreight-Users/Page_Myfreight/select_ItemType'), Item1ItemType, false)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_cm_LENGTH'), Item1Length)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_cm_WIDTH'), Item1Width)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_cm_HEIGHT'), Item1Height)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_cm_DEAD WEIGHT'), Item1DeadWeight)

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/button_Save'))

String ts = System.currentTimeMillis().toString()

WebUI.scrollToElement(findTestObject('MyFreight-Users/Page_Myfreight/a_CONSIGNMENTS'), 1)

WebUI.takeScreenshot(('Test/NewReturnExistingSenderAddrNoDG' + ts) + '.png')

WebUI.closeBrowser()

